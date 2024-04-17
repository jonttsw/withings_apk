package com.withings.webservices.legacy.sync;

import com.withings.webservices.legacy.sync.SyncJob;
import java.util.Arrays;
import java.util.List;
import vh.j;
/* loaded from: classes4.dex */
public class SerialSyncJob extends CompositeSyncJob implements SyncJob.Listener {
    private int currentSubJobIndex;
    private j executor;
    private SyncJob.Listener listener;

    public SerialSyncJob(List<SyncJob> list) {
        this.currentSubJobIndex = 0;
        setSubJobs(list);
    }

    private void startNextSubJob(j jVar) {
        getSubJobs().get(this.currentSubJobIndex).start(jVar, this);
    }

    @Override // com.withings.webservices.legacy.sync.SyncJob.Listener
    public void onSyncJobDone(SyncJob syncJob, int i11) {
        if (i11 == 3 && !syncJob.isFailureAllowed()) {
            setState(3);
            skipSubJobs();
            this.listener.onSyncJobDone(this, 3);
            return;
        }
        int i12 = this.currentSubJobIndex + 1;
        this.currentSubJobIndex = i12;
        if (i12 < getSubJobs().size()) {
            startNextSubJob(this.executor);
            return;
        }
        if (getState() == 1) {
            setState(2);
        }
        this.listener.onSyncJobDone(this, getState());
    }

    @Override // com.withings.webservices.legacy.sync.SyncJob
    public void start(j jVar, SyncJob.Listener listener) {
        this.executor = jVar;
        this.listener = listener;
        this.currentSubJobIndex = 0;
        if (getSubJobs().size() > 0) {
            setState(1);
            startNextSubJob(jVar);
            return;
        }
        setState(2);
        listener.onSyncJobDone(this, getState());
    }

    public SerialSyncJob(SyncJob... syncJobArr) {
        this(Arrays.asList(syncJobArr));
    }
}
