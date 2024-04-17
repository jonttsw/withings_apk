package com.withings.wiscale2.healthsync.google.fit;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.o;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.partner.model.Partner;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import v10.c;
import ym0.p;
/* compiled from: SyncSleepWithFit.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withings/wiscale2/healthsync/google/fit/RemoveSleepFromFitWorker;", "Lcom/withings/wiscale2/healthsync/google/fit/FitSyncWorker;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class RemoveSleepFromFitWorker extends FitSyncWorker {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SyncSleepWithFit.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.fit.RemoveSleepFromFitWorker", f = "SyncSleepWithFit.kt", l = {70}, m = "tryRemoveSleepFromFit")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f56383a;

        /* renamed from: c  reason: collision with root package name */
        int f56385c;

        a(qm0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56383a = obj;
            this.f56385c |= Integer.MIN_VALUE;
            return RemoveSleepFromFitWorker.this.y(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SyncSleepWithFit.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.fit.RemoveSleepFromFitWorker$tryRemoveSleepFromFit$2", f = "SyncSleepWithFit.kt", l = {72, 75}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super o.a>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Throwable f56386a;

        /* renamed from: b  reason: collision with root package name */
        int f56387b;

        /* renamed from: c  reason: collision with root package name */
        private /* synthetic */ Object f56388c;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ GoogleSignInAccount f56390e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(GoogleSignInAccount googleSignInAccount, qm0.d<? super b> dVar) {
            super(2, dVar);
            this.f56390e = googleSignInAccount;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            b bVar = new b(this.f56390e, dVar);
            bVar.f56388c = obj;
            return bVar;
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super o.a> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00c3  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00c8  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00ce  */
        /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlinx.coroutines.CoroutineScope] */
        /* JADX WARN: Type inference failed for: r1v13, types: [kotlinx.coroutines.CoroutineScope] */
        /* JADX WARN: Type inference failed for: r1v17 */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v2 */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r1 = r14.f56387b
                r2 = 2
                com.withings.wiscale2.healthsync.google.fit.RemoveSleepFromFitWorker r3 = com.withings.wiscale2.healthsync.google.fit.RemoveSleepFromFitWorker.this
                r4 = 1
                if (r1 == 0) goto L29
                if (r1 == r4) goto L1f
                if (r1 != r2) goto L17
                java.lang.Throwable r0 = r14.f56386a
                java.lang.Object r1 = r14.f56388c
                nm0.l.b(r15)
                goto Lbc
            L17:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L1f:
                java.lang.Object r1 = r14.f56388c
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                nm0.l.b(r15)     // Catch: java.lang.Throwable -> L27
                goto L83
            L27:
                r15 = move-exception
                goto L89
            L29:
                nm0.l.b(r15)
                java.lang.Object r15 = r14.f56388c
                r1 = r15
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                r3.getClass()
                com.google.android.gms.fitness.request.DataDeleteRequest$Builder r5 = new com.google.android.gms.fitness.request.DataDeleteRequest$Builder
                r5.<init>()
                androidx.work.f r15 = r3.getInputData()
                java.lang.String r6 = "trackStart"
                r7 = 0
                long r9 = r15.e(r6, r7)
                androidx.work.f r15 = r3.getInputData()
                java.lang.String r6 = "trackEnd"
                long r11 = r15.e(r6, r7)
                java.util.concurrent.TimeUnit r15 = java.util.concurrent.TimeUnit.MILLISECONDS
                r6 = r9
                r8 = r11
                r10 = r15
                com.google.android.gms.fitness.request.DataDeleteRequest$Builder r15 = r5.setTimeInterval(r6, r8, r10)
                com.google.android.gms.fitness.request.DataDeleteRequest$Builder r15 = r15.deleteAllSessions()
                com.google.android.gms.fitness.request.DataDeleteRequest r15 = r15.build()
                java.lang.String r5 = "build(...)"
                kotlin.jvm.internal.u.i(r15, r5)
                com.google.android.gms.auth.api.signin.GoogleSignInAccount r5 = r14.f56390e
                android.content.Context r6 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L27
                com.google.android.gms.fitness.HistoryClient r5 = com.google.android.gms.fitness.Fitness.getHistoryClient(r6, r5)     // Catch: java.lang.Throwable -> L27
                com.google.android.gms.tasks.Task r15 = r5.deleteData(r15)     // Catch: java.lang.Throwable -> L27
                java.lang.String r5 = "deleteData(...)"
                kotlin.jvm.internal.u.i(r15, r5)     // Catch: java.lang.Throwable -> L27
                r14.f56388c = r1     // Catch: java.lang.Throwable -> L27
                r14.f56387b = r4     // Catch: java.lang.Throwable -> L27
                java.lang.Object r15 = kotlinx.coroutines.tasks.TasksKt.await(r15, r14)     // Catch: java.lang.Throwable -> L27
                if (r15 != r0) goto L83
                return r0
            L83:
                java.lang.Void r15 = (java.lang.Void) r15     // Catch: java.lang.Throwable -> L27
            L85:
                r13 = r1
                r1 = r15
                r15 = r13
                goto L8e
            L89:
                nm0.k$a r15 = nm0.l.a(r15)
                goto L85
            L8e:
                boolean r5 = r1 instanceof nm0.k.a
                r4 = r4 ^ r5
                r5 = 0
                if (r4 == 0) goto L9e
                r4 = r1
                java.lang.Void r4 = (java.lang.Void) r4
                java.lang.Object[] r4 = new java.lang.Object[r5]
                java.lang.String r6 = "DataSet for sleep track deleted."
                x70.b.l(r15, r6, r4)
            L9e:
                java.lang.Throwable r15 = nm0.k.b(r1)
                if (r15 == 0) goto Lbf
                t10.e r4 = r3.w()
                android.content.Context r3 = r3.getContext()
                com.withings.partner.model.Partner r6 = com.withings.partner.model.Partner.f43456n
                r14.f56388c = r1
                r14.f56386a = r15
                r14.f56387b = r2
                java.lang.Object r2 = r4.l(r3, r6, r14, r5)
                if (r2 != r0) goto Lbb
                return r0
            Lbb:
                r0 = r15
            Lbc:
                x70.b.n(r0)
            Lbf:
                boolean r15 = r1 instanceof nm0.k.a
                if (r15 == 0) goto Lc4
                r1 = 0
            Lc4:
                java.lang.Void r1 = (java.lang.Void) r1
                if (r1 == 0) goto Lce
                androidx.work.o$a$c r15 = new androidx.work.o$a$c
                r15.<init>()
                goto Ld3
            Lce:
                androidx.work.o$a$a r15 = new androidx.work.o$a$a
                r15.<init>()
            Ld3:
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.fit.RemoveSleepFromFitWorker.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoveSleepFromFitWorker(Context context, WorkerParameters params) {
        super(context, params);
        u.j(context, "context");
        u.j(params, "params");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(com.google.android.gms.auth.api.signin.GoogleSignInAccount r5, qm0.d<? super androidx.work.o.a> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.withings.wiscale2.healthsync.google.fit.RemoveSleepFromFitWorker.a
            if (r0 == 0) goto L13
            r0 = r6
            com.withings.wiscale2.healthsync.google.fit.RemoveSleepFromFitWorker$a r0 = (com.withings.wiscale2.healthsync.google.fit.RemoveSleepFromFitWorker.a) r0
            int r1 = r0.f56385c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f56385c = r1
            goto L18
        L13:
            com.withings.wiscale2.healthsync.google.fit.RemoveSleepFromFitWorker$a r0 = new com.withings.wiscale2.healthsync.google.fit.RemoveSleepFromFitWorker$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f56383a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f56385c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            nm0.l.b(r6)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            nm0.l.b(r6)
            com.withings.wiscale2.healthsync.google.fit.RemoveSleepFromFitWorker$b r6 = new com.withings.wiscale2.healthsync.google.fit.RemoveSleepFromFitWorker$b
            r2 = 0
            r6.<init>(r5, r2)
            r0.f56385c = r3
            java.lang.Object r6 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r6, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            java.lang.String r5 = "coroutineScope(...)"
            kotlin.jvm.internal.u.i(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.fit.RemoveSleepFromFitWorker.y(com.google.android.gms.auth.api.signin.GoogleSignInAccount, qm0.d):java.lang.Object");
    }

    @Override // com.withings.wiscale2.healthsync.google.fit.FitSyncWorker
    public final Object t(Partner partner, qm0.d<? super o.a> dVar) {
        c.h hVar = c.h.f103128c;
        boolean i11 = hVar.i(partner);
        Context applicationContext = getApplicationContext();
        u.i(applicationContext, "getApplicationContext(...)");
        GoogleSignInAccount a11 = hVar.a(applicationContext);
        if (i11 && a11 != null) {
            return y(a11, dVar);
        }
        return new o.a.c();
    }
}
