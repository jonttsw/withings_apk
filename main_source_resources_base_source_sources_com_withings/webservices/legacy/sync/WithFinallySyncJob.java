package com.withings.webservices.legacy.sync;

import com.withings.webservices.legacy.sync.SyncJob;
import java.util.Arrays;
import vh.j;
/* loaded from: classes4.dex */
public class WithFinallySyncJob extends CompositeSyncJob implements SyncJob.Listener {
    private j executor;
    private final SyncJob finallyJob;
    private SyncJob.Listener listener;
    private final SyncJob mainJob;

    public WithFinallySyncJob(SyncJob syncJob, SyncJob syncJob2) {
        this.mainJob = syncJob;
        this.finallyJob = syncJob2;
        setSubJobs(Arrays.asList(syncJob, syncJob2));
    }

    @Override // com.withings.webservices.legacy.sync.SyncJob.Listener
    public void onSyncJobDone(SyncJob syncJob, int i11) {
        if (syncJob.equals(this.mainJob)) {
            this.finallyJob.start(this.executor, this);
            return;
        }
        int i12 = 3;
        if (this.mainJob.getState() != 3 && this.finallyJob.getState() != 3) {
            i12 = 2;
        }
        setState(i12);
        this.listener.onSyncJobDone(this, getState());
    }

    @Override // com.withings.webservices.legacy.sync.SyncJob
    public void start(j jVar, SyncJob.Listener listener) {
        this.executor = jVar;
        this.listener = listener;
        setState(1);
        this.mainJob.start(jVar, this);
    }
}
