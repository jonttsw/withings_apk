package com.withings.webservices.legacy.sync;

import com.withings.webservices.legacy.WsFailer;
import com.withings.webservices.legacy.lastupdate.LastUpdate;
import com.withings.webservices.legacy.sync.SyncAction;
import com.withings.webservices.legacy.sync.SyncJob;
import com.withings.webservices.legacy.sync.SyncJobStatePrinter;
import vh.a;
import vh.h;
import vh.j;
/* loaded from: classes4.dex */
public class ActionSyncJob extends SyncJob {
    private vh.a action;
    private int progressWeight;

    public ActionSyncJob(vh.a aVar) {
        this(aVar, 1);
    }

    @Override // com.withings.webservices.legacy.sync.SyncJob
    public void cancel() {
        h.b(this);
        if (getState() == 0 || getState() == 1) {
            setState(4);
        }
    }

    public boolean equals(Object obj) {
        if ((obj instanceof ActionSyncJob) && this.action.equals(((ActionSyncJob) obj).action)) {
            return true;
        }
        return false;
    }

    @Override // com.withings.webservices.legacy.sync.SyncJob
    public int getProgress() {
        if (getState() != 0 && getState() != 1) {
            return this.progressWeight;
        }
        return 0;
    }

    @Override // com.withings.webservices.legacy.sync.SyncJob
    public int getProgressWeight() {
        return this.progressWeight;
    }

    public int hashCode() {
        return this.action.hashCode();
    }

    @Override // com.withings.webservices.legacy.sync.SyncJob
    public boolean needsLastUpdate() {
        vh.a aVar = this.action;
        if ((aVar instanceof SyncAction) && ((SyncAction) aVar).needsLastUpdate()) {
            return true;
        }
        return false;
    }

    @Override // com.withings.webservices.legacy.sync.SyncJob
    public void printState(SyncJobStatePrinter syncJobStatePrinter, int i11) {
        syncJobStatePrinter.print(SyncJobStatePrinter.Helper.tree(i11) + this.action + " -> " + SyncJobStatePrinter.Helper.state(getState()) + SyncJobStatePrinter.Helper.durationMillis(getDuration()));
    }

    @Override // com.withings.webservices.legacy.sync.SyncJob
    public void run() throws Exception {
        this.action.run();
    }

    @Override // com.withings.webservices.legacy.sync.SyncJob
    public void setLastUpdate(LastUpdate lastUpdate) {
        vh.a aVar = this.action;
        if (aVar instanceof SyncAction) {
            ((SyncAction) aVar).setLastUpdate(lastUpdate);
        }
    }

    @Override // com.withings.webservices.legacy.sync.SyncJob
    public void setSyncContext(String str) {
        super.setSyncContext(str);
        vh.a aVar = this.action;
        if (aVar instanceof SyncAction.WithSyncContext) {
            ((SyncAction.WithSyncContext) aVar).setSyncContext(str);
        }
    }

    @Override // com.withings.webservices.legacy.sync.SyncJob
    public void start(j jVar, final SyncJob.Listener listener) {
        vh.c a11 = jVar.a(new vh.a() { // from class: com.withings.webservices.legacy.sync.ActionSyncJob.3
            @Override // vh.a
            public void run() throws Exception {
                if (ActionSyncJob.this.getState() == 0) {
                    ActionSyncJob.this.setState(1);
                    ActionSyncJob.this.action.run();
                }
            }

            public String toString() {
                return "SyncJob " + ActionSyncJob.this.action.toString();
            }
        });
        a11.r(new a.b() { // from class: com.withings.webservices.legacy.sync.ActionSyncJob.2
            @Override // vh.a.b
            public void onResult() {
                if (ActionSyncJob.this.getState() == 1) {
                    ActionSyncJob.this.setState(2);
                }
                SyncJob syncJob = ActionSyncJob.this;
                syncJob.notifyProgress(syncJob, syncJob.getProgress(), ActionSyncJob.this.progressWeight);
                SyncJob.Listener listener2 = listener;
                ActionSyncJob actionSyncJob = ActionSyncJob.this;
                listener2.onSyncJobDone(actionSyncJob, actionSyncJob.getState());
            }
        });
        a11.f(new WsFailer.ErrorCallback() { // from class: com.withings.webservices.legacy.sync.ActionSyncJob.1
            @Override // com.withings.webservices.legacy.WsFailer.ErrorCallback, vh.p
            public void onError(Exception exc) {
                ActionSyncJob.this.setState(3);
                SyncJob syncJob = ActionSyncJob.this;
                syncJob.notifyProgress(syncJob, syncJob.getProgress(), ActionSyncJob.this.progressWeight);
                SyncJob.Listener listener2 = listener;
                ActionSyncJob actionSyncJob = ActionSyncJob.this;
                listener2.onSyncJobDone(actionSyncJob, actionSyncJob.getState());
                super.onError(exc);
            }
        });
        a11.p(this);
    }

    public String toString() {
        return "Job (" + this.action + ")";
    }

    @Override // com.withings.webservices.legacy.sync.SyncJob
    public boolean visit(SyncJob.Visitor visitor) {
        return visitor.visit(this);
    }

    public ActionSyncJob(vh.a aVar, int i11) {
        this.action = aVar;
        this.progressWeight = i11;
    }
}
