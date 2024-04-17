package com.withings.webservices.legacy.sync;

import com.withings.webservices.legacy.sync.SyncJob;
import java.util.Arrays;
import java.util.List;
import vh.j;
/* loaded from: classes4.dex */
public class ParallelSyncJob extends CompositeSyncJob implements SyncJob.Listener {
    private SyncJob.Listener listener;
    private int subJobsDone;

    public ParallelSyncJob(List<SyncJob> list) {
        setSubJobs(list);
    }

    @Override // com.withings.webservices.legacy.sync.SyncJob.Listener
    public synchronized void onSyncJobDone(SyncJob syncJob, int i11) {
        try {
            this.subJobsDone++;
            if (i11 == 3 && !syncJob.isFailureAllowed()) {
                setState(3);
                skipSubJobs();
            }
            if (this.subJobsDone == getSubJobs().size()) {
                if (getState() == 1) {
                    setState(2);
                }
                this.listener.onSyncJobDone(this, getState());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.withings.webservices.legacy.sync.SyncJob
    public void start(j jVar, SyncJob.Listener listener) {
        this.listener = listener;
        this.subJobsDone = 0;
        if (getSubJobs().size() > 0) {
            setState(1);
            for (SyncJob syncJob : getSubJobs()) {
                syncJob.start(jVar, this);
            }
            return;
        }
        setState(2);
        listener.onSyncJobDone(this, getState());
    }

    public ParallelSyncJob(SyncJob... syncJobArr) {
        this(Arrays.asList(syncJobArr));
    }
}
