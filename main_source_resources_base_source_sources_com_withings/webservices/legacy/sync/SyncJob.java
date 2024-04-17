package com.withings.webservices.legacy.sync;

import com.withings.webservices.legacy.WsFailer;
import com.withings.webservices.legacy.lastupdate.LastUpdate;
import com.withings.webservices.legacy.sync.SyncJobManager;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import vh.j;
import vh.m;
import vh.o;
/* loaded from: classes4.dex */
public abstract class SyncJob {
    public static final int STATE_FAILED = 3;
    public static final int STATE_PENDING = 0;
    public static final int STATE_RUNNING = 1;
    public static final int STATE_SKIPPED = 4;
    public static final int STATE_SUCCESS = 2;
    private boolean failureAllowed;
    private long startTime;
    private String syncContext;
    private int state = 0;
    private List<ProgressListener> progressListeners = new ArrayList();
    private long duration = 0;

    /* renamed from: com.withings.webservices.legacy.sync.SyncJob$1 */
    /* loaded from: classes4.dex */
    public class AnonymousClass1 extends WsFailer.ErrorCallback {
        final /* synthetic */ Listener val$listener;

        AnonymousClass1(Listener listener) {
            SyncJob.this = r1;
            this.val$listener = listener;
        }

        public static /* synthetic */ boolean lambda$onError$0(SyncJob syncJob) {
            syncJob.setState(3);
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.webservices.legacy.sync.SyncJob$Visitor, java.lang.Object] */
        @Override // com.withings.webservices.legacy.WsFailer.ErrorCallback, vh.p
        public void onError(Exception exc) {
            super.onError(exc);
            SyncJob.this.visit(new Object());
            this.val$listener.onSyncJobDone(SyncJob.this, 3);
        }
    }

    /* loaded from: classes4.dex */
    public interface Listener {
        void onSyncJobDone(SyncJob syncJob, int i11);
    }

    /* loaded from: classes4.dex */
    public interface ProgressListener {
        void onProgressUpdate(SyncJob syncJob, SyncJob syncJob2, int i11, int i12);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface State {
    }

    /* loaded from: classes4.dex */
    public interface Visitor {
        boolean visit(SyncJob syncJob);
    }

    public static /* synthetic */ boolean b(SyncJob syncJob) {
        return lambda$skip$0(syncJob);
    }

    /* renamed from: getLastUpdate */
    public LastUpdate lambda$getLastUpdateAndStart$1(SyncJobManager.LastUpdateApiProvider lastUpdateApiProvider) {
        return lastUpdateApiProvider.getLastUpdateApi(this.syncContext).getLastUpdate();
    }

    private void getLastUpdateAndStart(final j jVar, final SyncJobManager.LastUpdateApiProvider lastUpdateApiProvider, final Listener listener) {
        o c11 = jVar.c(new m() { // from class: com.withings.webservices.legacy.sync.a
            @Override // vh.m
            public final Object call() {
                LastUpdate lambda$getLastUpdateAndStart$1;
                lambda$getLastUpdateAndStart$1 = SyncJob.this.lambda$getLastUpdateAndStart$1(lastUpdateApiProvider);
                return lambda$getLastUpdateAndStart$1;
            }
        });
        c11.r(new m.b() { // from class: com.withings.webservices.legacy.sync.b
            @Override // vh.m.b
            public final void onResult(Object obj) {
                SyncJob.this.lambda$getLastUpdateAndStart$2(jVar, listener, (LastUpdate) obj);
            }
        });
        c11.f(new AnonymousClass1(listener));
    }

    public /* synthetic */ void lambda$getLastUpdateAndStart$2(j jVar, Listener listener, LastUpdate lastUpdate) {
        setLastUpdate(lastUpdate);
        start(jVar, listener);
    }

    public static /* synthetic */ boolean lambda$skip$0(SyncJob syncJob) {
        if (syncJob.state == 0) {
            syncJob.state = 4;
            return false;
        }
        return false;
    }

    public void addProgressListener(ProgressListener progressListener) {
        this.progressListeners.add(progressListener);
    }

    public abstract void cancel();

    public long getDuration() {
        return this.duration;
    }

    public abstract int getProgress();

    public List<ProgressListener> getProgressListeners() {
        return this.progressListeners;
    }

    public abstract int getProgressWeight();

    public int getState() {
        return this.state;
    }

    public String getSyncContext() {
        return this.syncContext;
    }

    public boolean isFailureAllowed() {
        return this.failureAllowed;
    }

    public abstract boolean needsLastUpdate();

    public void notifyProgress(SyncJob syncJob, int i11, int i12) {
        for (ProgressListener progressListener : this.progressListeners) {
            progressListener.onProgressUpdate(this, syncJob, i11, i12);
        }
    }

    public abstract void printState(SyncJobStatePrinter syncJobStatePrinter, int i11);

    public abstract void run() throws Exception;

    public void run(SyncJobManager.LastUpdateApiProvider lastUpdateApiProvider) throws Exception {
        if (needsLastUpdate()) {
            setLastUpdate(lambda$getLastUpdateAndStart$1(lastUpdateApiProvider));
        }
        run();
    }

    public void setFailureAllowed(boolean z5) {
        this.failureAllowed = z5;
    }

    public abstract void setLastUpdate(LastUpdate lastUpdate);

    public void setState(int i11) {
        this.state = i11;
        if (i11 == 1) {
            this.startTime = System.currentTimeMillis();
        } else if (i11 == 3 || i11 == 2) {
            this.duration = System.currentTimeMillis() - this.startTime;
        }
    }

    public void setSyncContext(String str) {
        this.syncContext = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.webservices.legacy.sync.SyncJob$Visitor, java.lang.Object] */
    public void skip() {
        visit(new Object());
    }

    public abstract void start(j jVar, Listener listener);

    public void start(j jVar, SyncJobManager.LastUpdateApiProvider lastUpdateApiProvider, Listener listener) {
        if (needsLastUpdate()) {
            getLastUpdateAndStart(jVar, lastUpdateApiProvider, listener);
        } else {
            start(jVar, listener);
        }
    }

    public abstract boolean visit(Visitor visitor);
}
