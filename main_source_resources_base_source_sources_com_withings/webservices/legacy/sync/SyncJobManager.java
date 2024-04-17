package com.withings.webservices.legacy.sync;

import androidx.camera.core.q1;
import androidx.camera.core.r1;
import com.withings.webservices.legacy.lastupdate.LastUpdateApi;
import com.withings.webservices.legacy.sync.SyncJob;
import com.withings.webservices.legacy.sync.SyncJobManager;
import e2.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m0.t;
import vh.j;
/* loaded from: classes4.dex */
public class SyncJobManager {
    private Map<SyncJob, SyncJob.Listener> delayedJobs;
    private j executor;
    private LastUpdateApiProvider lastUpdateApiProvider;
    private List<SyncJob> runningJobs;
    private SyncJobStatePrinter statusPrinter;

    /* loaded from: classes4.dex */
    public interface LastUpdateApiProvider {
        LastUpdateApi getLastUpdateApi(String str);
    }

    public SyncJobManager(j jVar, LastUpdateApiProvider lastUpdateApiProvider) {
        this.runningJobs = Collections.synchronizedList(new ArrayList());
        this.delayedJobs = Collections.synchronizedMap(new HashMap());
        this.executor = jVar;
        this.lastUpdateApiProvider = lastUpdateApiProvider;
    }

    private boolean isSyncJobAlreadyPending(final SyncJob syncJob, List<SyncJob> list) {
        return t.g(list, new u70.b() { // from class: io.k
            @Override // u70.b
            public final boolean isMatching(Object obj) {
                boolean lambda$isSyncJobAlreadyPending$2;
                lambda$isSyncJobAlreadyPending$2 = SyncJobManager.lambda$isSyncJobAlreadyPending$2((SyncJob) syncJob, (SyncJob) obj);
                return lambda$isSyncJobAlreadyPending$2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isSyncJobAlreadyRunning */
    public boolean lambda$shouldDelayJob$3(SyncJob syncJob, List<SyncJob> list) {
        return t.g(list, new d(syncJob, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$isSyncJobAlreadyPending$1(SyncJob syncJob, SyncJob syncJob2) {
        if (syncJob2.getState() == 0 && syncJob2.equals(syncJob)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$isSyncJobAlreadyPending$2(SyncJob syncJob, SyncJob syncJob2) {
        return syncJob2.visit(new r(syncJob, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$isSyncJobAlreadyRunning$4(SyncJob syncJob, SyncJob syncJob2) {
        if (syncJob2.getState() == 1 && syncJob2.equals(syncJob)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$isSyncJobAlreadyRunning$5(SyncJob syncJob, SyncJob syncJob2) {
        return syncJob2.visit(new v.a(syncJob, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runJob$6(SyncJob.Listener listener, SyncJob syncJob, int i11) {
        this.runningJobs.remove(syncJob);
        printJobStatus(syncJob);
        restartDelayedJobs();
        if (listener != null) {
            listener.onSyncJobDone(syncJob, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$skipAlreadyPendingJobs$0(List list, SyncJob syncJob) {
        if (isSyncJobAlreadyPending(syncJob, list)) {
            syncJob.skip();
            return false;
        }
        return false;
    }

    private void printJobStatus(SyncJob syncJob) {
        SyncJobStatePrinter syncJobStatePrinter = this.statusPrinter;
        if (syncJobStatePrinter != null) {
            syncJob.printState(syncJobStatePrinter, 0);
        }
    }

    private void restartDelayedJobs() {
        for (SyncJob syncJob : getDelayedJobs()) {
            if (!shouldDelayJob(syncJob)) {
                runJob(syncJob, this.delayedJobs.remove(syncJob));
            }
        }
    }

    private void runJob(SyncJob syncJob, final SyncJob.Listener listener) {
        this.runningJobs.add(syncJob);
        syncJob.start(this.executor, this.lastUpdateApiProvider, new SyncJob.Listener() { // from class: com.withings.webservices.legacy.sync.e
            @Override // com.withings.webservices.legacy.sync.SyncJob.Listener
            public final void onSyncJobDone(SyncJob syncJob2, int i11) {
                SyncJobManager.this.lambda$runJob$6(listener, syncJob2, i11);
            }
        });
    }

    private boolean shouldDelayJob(SyncJob syncJob) {
        return syncJob.visit(new q1(3, this, new ArrayList(this.runningJobs)));
    }

    private void skipAlreadyPendingJobs(SyncJob syncJob) {
        List<SyncJob> delayedJobs = getDelayedJobs();
        delayedJobs.addAll(this.runningJobs);
        syncJob.visit(new r1(2, this, delayedJobs));
    }

    public synchronized void addJob(SyncJob syncJob) {
        addJob(syncJob, null);
    }

    public synchronized void cancelAllJobs() {
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(getDelayedJobs());
            arrayList.addAll(getRunningJobs());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((SyncJob) it.next()).cancel();
            }
            this.runningJobs.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public List<SyncJob> getDelayedJobs() {
        return new ArrayList(this.delayedJobs.keySet());
    }

    public List<SyncJob> getRunningJobs() {
        return this.runningJobs;
    }

    public synchronized void addJob(SyncJob syncJob, SyncJob.Listener listener) {
        try {
            skipAlreadyPendingJobs(syncJob);
            if (!this.runningJobs.isEmpty()) {
                this.delayedJobs.put(syncJob, listener);
            } else {
                runJob(syncJob, listener);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public SyncJobManager(j jVar, LastUpdateApiProvider lastUpdateApiProvider, SyncJobStatePrinter syncJobStatePrinter) {
        this(jVar, lastUpdateApiProvider);
        this.statusPrinter = syncJobStatePrinter;
    }
}
