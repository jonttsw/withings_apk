package com.withings.webservices.legacy.sync;

import com.withings.webservices.legacy.lastupdate.LastUpdate;
import com.withings.webservices.legacy.sync.SyncJob;
import com.withings.webservices.legacy.sync.SyncJobStatePrinter;
import java.util.ArrayList;
import java.util.List;
import m0.t;
/* loaded from: classes4.dex */
public abstract class CompositeSyncJob extends SyncJob implements SyncJob.ProgressListener {
    private List<SyncJob> subJobs = new ArrayList();

    @Override // com.withings.webservices.legacy.sync.SyncJob
    public void addProgressListener(SyncJob.ProgressListener progressListener) {
        super.addProgressListener(progressListener);
        for (SyncJob syncJob : this.subJobs) {
            syncJob.addProgressListener(this);
        }
    }

    @Override // com.withings.webservices.legacy.sync.SyncJob
    public void cancel() {
        for (SyncJob syncJob : this.subJobs) {
            syncJob.cancel();
        }
        if (getState() == 0 || getState() == 1) {
            setState(4);
        }
    }

    public boolean equals(Object obj) {
        if (getClass().equals(obj.getClass()) && this.subJobs.equals(((CompositeSyncJob) obj).getSubJobs())) {
            return true;
        }
        return false;
    }

    @Override // com.withings.webservices.legacy.sync.SyncJob
    public int getProgress() {
        List<SyncJob> list = this.subJobs;
        u70.c<Integer, SyncJob> cVar = new u70.c<Integer, SyncJob>() { // from class: com.withings.webservices.legacy.sync.CompositeSyncJob.3
            @Override // u70.c
            public Integer get(SyncJob syncJob) {
                return Integer.valueOf(syncJob.getProgress());
            }
        };
        int i11 = 0;
        for (SyncJob syncJob : list) {
            i11 += cVar.get(syncJob).intValue();
        }
        return i11;
    }

    @Override // com.withings.webservices.legacy.sync.SyncJob
    public int getProgressWeight() {
        List<SyncJob> list = this.subJobs;
        u70.c<Integer, SyncJob> cVar = new u70.c<Integer, SyncJob>() { // from class: com.withings.webservices.legacy.sync.CompositeSyncJob.2
            @Override // u70.c
            public Integer get(SyncJob syncJob) {
                return Integer.valueOf(syncJob.getProgressWeight());
            }
        };
        int i11 = 0;
        for (SyncJob syncJob : list) {
            i11 += cVar.get(syncJob).intValue();
        }
        return i11;
    }

    public List<SyncJob> getSubJobs() {
        return this.subJobs;
    }

    public int hashCode() {
        return 0;
    }

    @Override // com.withings.webservices.legacy.sync.SyncJob
    public boolean needsLastUpdate() {
        return t.g(this.subJobs, new u70.b<SyncJob>() { // from class: com.withings.webservices.legacy.sync.CompositeSyncJob.1
            @Override // u70.b
            public boolean isMatching(SyncJob syncJob) {
                return syncJob.needsLastUpdate();
            }
        });
    }

    @Override // com.withings.webservices.legacy.sync.SyncJob.ProgressListener
    public synchronized void onProgressUpdate(SyncJob syncJob, SyncJob syncJob2, int i11, int i12) {
        notifyProgress(syncJob2, getProgress(), getProgressWeight());
    }

    @Override // com.withings.webservices.legacy.sync.SyncJob
    public void printState(SyncJobStatePrinter syncJobStatePrinter, int i11) {
        StringBuilder b10 = com.google.android.filament.utils.b.b(SyncJobStatePrinter.Helper.tree(i11), "+ ");
        b10.append(getClass().getSimpleName());
        b10.append(" -> ");
        b10.append(SyncJobStatePrinter.Helper.state(getState()));
        syncJobStatePrinter.print(b10.toString());
        for (SyncJob syncJob : this.subJobs) {
            syncJob.printState(syncJobStatePrinter, i11 + 1);
        }
    }

    @Override // com.withings.webservices.legacy.sync.SyncJob
    protected void run() throws Exception {
        for (SyncJob syncJob : this.subJobs) {
            syncJob.run();
        }
    }

    @Override // com.withings.webservices.legacy.sync.SyncJob
    public void setLastUpdate(LastUpdate lastUpdate) {
        for (SyncJob syncJob : this.subJobs) {
            syncJob.setLastUpdate(lastUpdate);
        }
    }

    public void setSubJobs(List<SyncJob> list) {
        this.subJobs = list;
        for (SyncJob syncJob : list) {
            syncJob.setSyncContext(getSyncContext());
        }
    }

    @Override // com.withings.webservices.legacy.sync.SyncJob
    public void setSyncContext(String str) {
        super.setSyncContext(str);
        for (SyncJob syncJob : this.subJobs) {
            syncJob.setSyncContext(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void skipSubJobs() {
        for (SyncJob syncJob : this.subJobs) {
            syncJob.skip();
        }
    }

    @Override // com.withings.webservices.legacy.sync.SyncJob
    public boolean visit(SyncJob.Visitor visitor) {
        if (visitor.visit(this)) {
            return true;
        }
        for (SyncJob syncJob : this.subJobs) {
            if (syncJob.visit(visitor)) {
                return true;
            }
        }
        return false;
    }
}
