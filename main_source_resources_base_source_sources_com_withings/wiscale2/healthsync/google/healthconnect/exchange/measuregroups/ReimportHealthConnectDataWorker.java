package com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.o;
import com.google.firebase.dynamiclinks.DynamicLink;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.partner.model.Partner;
import com.withings.partner.model.capabilities.PartnerCapabilities;
import com.withings.user.User;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import u10.a0;
import ym0.p;
/* compiled from: ReimportHealthConnectMeasuresGroupsWorker.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/withings/wiscale2/healthsync/google/healthconnect/exchange/measuregroups/ReimportHealthConnectDataWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroidx/work/WorkerParameters;", DynamicLink.Builder.KEY_DYNAMIC_LINK_PARAMETERS, "Lgg0/c;", "workerDependency", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lgg0/c;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ReimportHealthConnectDataWorker extends CoroutineWorker {

    /* renamed from: a  reason: collision with root package name */
    private final gg0.c f56589a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReimportHealthConnectMeasuresGroupsWorker.kt */
    @e(c = "com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ReimportHealthConnectDataWorker", f = "ReimportHealthConnectMeasuresGroupsWorker.kt", l = {59}, m = "doWork")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f56590a;

        /* renamed from: c  reason: collision with root package name */
        int f56592c;

        a(qm0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56590a = obj;
            this.f56592c |= Integer.MIN_VALUE;
            return ReimportHealthConnectDataWorker.this.doWork(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReimportHealthConnectMeasuresGroupsWorker.kt */
    @e(c = "com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ReimportHealthConnectDataWorker$doWork$2", f = "ReimportHealthConnectMeasuresGroupsWorker.kt", l = {61, 71, 77, 78}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class b extends i implements p<CoroutineScope, qm0.d<? super o.a>, Object> {

        /* renamed from: a  reason: collision with root package name */
        User f56593a;

        /* renamed from: b  reason: collision with root package name */
        Partner f56594b;

        /* renamed from: c  reason: collision with root package name */
        Iterator f56595c;

        /* renamed from: d  reason: collision with root package name */
        int f56596d;

        /* renamed from: e  reason: collision with root package name */
        int f56597e;

        /* renamed from: f  reason: collision with root package name */
        private /* synthetic */ Object f56598f;

        b(qm0.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f56598f = obj;
            return bVar;
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super o.a> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x00c1 A[Catch: all -> 0x001f, TryCatch #0 {all -> 0x001f, blocks: (B:8:0x001a, B:48:0x012f, B:15:0x0036, B:38:0x00df, B:40:0x00e5, B:43:0x0107, B:18:0x0047, B:35:0x00bd, B:37:0x00c1, B:46:0x011d, B:47:0x012e, B:30:0x0097, B:32:0x00a1, B:49:0x0135, B:50:0x0146), top: B:59:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00e5 A[Catch: all -> 0x001f, TryCatch #0 {all -> 0x001f, blocks: (B:8:0x001a, B:48:0x012f, B:15:0x0036, B:38:0x00df, B:40:0x00e5, B:43:0x0107, B:18:0x0047, B:35:0x00bd, B:37:0x00c1, B:46:0x011d, B:47:0x012e, B:30:0x0097, B:32:0x00a1, B:49:0x0135, B:50:0x0146), top: B:59:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x011c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x011d A[Catch: all -> 0x001f, TryCatch #0 {all -> 0x001f, blocks: (B:8:0x001a, B:48:0x012f, B:15:0x0036, B:38:0x00df, B:40:0x00e5, B:43:0x0107, B:18:0x0047, B:35:0x00bd, B:37:0x00c1, B:46:0x011d, B:47:0x012e, B:30:0x0097, B:32:0x00a1, B:49:0x0135, B:50:0x0146), top: B:59:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0151  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x015d  */
        /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 351
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ReimportHealthConnectDataWorker.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReimportHealthConnectMeasuresGroupsWorker.kt */
    @e(c = "com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ReimportHealthConnectDataWorker", f = "ReimportHealthConnectMeasuresGroupsWorker.kt", l = {115}, m = "reimportData")
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        ReimportHealthConnectDataWorker f56600a;

        /* renamed from: b  reason: collision with root package name */
        PartnerCapabilities f56601b;

        /* renamed from: c  reason: collision with root package name */
        long f56602c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f56603d;

        /* renamed from: f  reason: collision with root package name */
        int f56605f;

        c(qm0.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56603d = obj;
            this.f56605f |= Integer.MIN_VALUE;
            return ReimportHealthConnectDataWorker.this.z(null, 0L, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReimportHealthConnectMeasuresGroupsWorker.kt */
    @e(c = "com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ReimportHealthConnectDataWorker", f = "ReimportHealthConnectMeasuresGroupsWorker.kt", l = {101}, m = "removeExistingData")
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        ReimportHealthConnectDataWorker f56606a;

        /* renamed from: b  reason: collision with root package name */
        long f56607b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f56608c;

        /* renamed from: e  reason: collision with root package name */
        int f56610e;

        d(qm0.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56608c = obj;
            this.f56610e |= Integer.MIN_VALUE;
            return ReimportHealthConnectDataWorker.this.A(null, 0L, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReimportHealthConnectDataWorker(Context context, WorkerParameters parameters, gg0.c workerDependency) {
        super(context, parameters);
        u.j(context, "context");
        u.j(parameters, "parameters");
        u.j(workerDependency, "workerDependency");
        this.f56589a = workerDependency;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091 A[LOOP:1: B:28:0x008b->B:30:0x0091, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(int[] r11, long r12, qm0.d<? super nm0.y> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ReimportHealthConnectDataWorker.d
            if (r0 == 0) goto L14
            r0 = r14
            com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ReimportHealthConnectDataWorker$d r0 = (com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ReimportHealthConnectDataWorker.d) r0
            int r1 = r0.f56610e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f56610e = r1
        L12:
            r8 = r0
            goto L1a
        L14:
            com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ReimportHealthConnectDataWorker$d r0 = new com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ReimportHealthConnectDataWorker$d
            r0.<init>(r14)
            goto L12
        L1a:
            java.lang.Object r14 = r8.f56608c
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r8.f56610e
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            long r12 = r8.f56607b
            com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ReimportHealthConnectDataWorker r11 = r8.f56606a
            nm0.l.b(r14)
            goto L53
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            nm0.l.b(r14)
            gg0.c r14 = r10.f56589a
            fy.l r1 = r14.d()
            r8.f56606a = r10
            r8.f56607b = r12
            r8.f56610e = r2
            r6 = 0
            r9 = 24
            r4 = 0
            r5 = 0
            r2 = r12
            r7 = r11
            java.lang.Object r14 = fy.l.c(r1, r2, r4, r5, r6, r7, r8, r9)
            if (r14 != r0) goto L52
            return r0
        L52:
            r11 = r10
        L53:
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r14 = r14.iterator()
        L5e:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L87
            java.lang.Object r1 = r14.next()
            r2 = r1
            ky.d r2 = (ky.d) r2
            ky.d$a r3 = r2.e()
            int r3 = r3.c()
            com.withings.partner.model.Partner r4 = com.withings.partner.model.Partner.f43457o
            int r4 = r4.l()
            if (r3 != r4) goto L5e
            long r2 = r2.h()
            int r2 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r2 != 0) goto L5e
            r0.add(r1)
            goto L5e
        L87:
            java.util.Iterator r12 = r0.iterator()
        L8b:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto La5
            java.lang.Object r13 = r12.next()
            ky.d r13 = (ky.d) r13
            gg0.c r14 = r11.f56589a
            fy.a r14 = r14.a()
            long r0 = r13.d()
            r14.a(r0)
            goto L8b
        La5:
            nm0.y r11 = nm0.y.f85009a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ReimportHealthConnectDataWorker.A(int[], long, qm0.d):java.lang.Object");
    }

    public static final a0 o(ReimportHealthConnectDataWorker reimportHealthConnectDataWorker) {
        return reimportHealthConnectDataWorker.f56589a.b().b();
    }

    public static final t10.e t(ReimportHealthConnectDataWorker reimportHealthConnectDataWorker) {
        return reimportHealthConnectDataWorker.f56589a.b().c();
    }

    public static final m70.i v(ReimportHealthConnectDataWorker reimportHealthConnectDataWorker) {
        return reimportHealthConnectDataWorker.f56589a.b().d();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f0 A[LOOP:1: B:66:0x01ea->B:68:0x01f0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v3, types: [int[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object x(com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ReimportHealthConnectDataWorker r20, com.withings.partner.model.capabilities.PartnerCapabilities r21, com.withings.partner.model.Partner r22, long r23, qm0.d r25) {
        /*
            Method dump skipped, instructions count: 515
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ReimportHealthConnectDataWorker.x(com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ReimportHealthConnectDataWorker, com.withings.partner.model.capabilities.PartnerCapabilities, com.withings.partner.model.Partner, long, qm0.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(int[] r7, long r8, com.withings.partner.model.capabilities.PartnerCapabilities r10, qm0.d<? super nm0.y> r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ReimportHealthConnectDataWorker.c
            if (r0 == 0) goto L13
            r0 = r11
            com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ReimportHealthConnectDataWorker$c r0 = (com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ReimportHealthConnectDataWorker.c) r0
            int r1 = r0.f56605f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f56605f = r1
            goto L18
        L13:
            com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ReimportHealthConnectDataWorker$c r0 = new com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ReimportHealthConnectDataWorker$c
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f56603d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f56605f
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            long r8 = r0.f56602c
            com.withings.partner.model.capabilities.PartnerCapabilities r10 = r0.f56601b
            com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ReimportHealthConnectDataWorker r7 = r0.f56600a
            nm0.l.b(r11)
        L2c:
            r2 = r8
            goto L4a
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            nm0.l.b(r11)
            r0.f56600a = r6
            r0.f56601b = r10
            r0.f56602c = r8
            r0.f56605f = r3
            java.lang.Object r7 = r6.A(r7, r8, r0)
            if (r7 != r1) goto L48
            return r1
        L48:
            r7 = r6
            goto L2c
        L4a:
            r7.getClass()
            com.withings.partner.model.Partner r8 = com.withings.partner.model.Partner.f43457o
            sf0.y r0 = a70.a.e(r8)
            if (r0 == 0) goto L87
            android.content.Context r1 = r7.getApplicationContext()
            java.lang.String r8 = "getApplicationContext(...)"
            kotlin.jvm.internal.u.i(r1, r8)
            java.util.List r4 = kotlin.collections.x.V(r10)
            r5 = 1
            java.util.ArrayList r8 = r0.e(r1, r2, r4, r5)
            java.util.Iterator r8 = r8.iterator()
        L6b:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L87
            java.lang.Object r9 = r8.next()
            sf0.c r9 = (sf0.c) r9
            android.content.Context r10 = r7.getApplicationContext()
            androidx.work.impl.n0 r10 = androidx.work.impl.n0.n(r10)
            androidx.work.w r9 = r9.q()
            r10.c(r9)
            goto L6b
        L87:
            nm0.y r7 = nm0.y.f85009a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ReimportHealthConnectDataWorker.z(int[], long, com.withings.partner.model.capabilities.PartnerCapabilities, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doWork(qm0.d<? super androidx.work.o.a> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ReimportHealthConnectDataWorker.a
            if (r0 == 0) goto L13
            r0 = r6
            com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ReimportHealthConnectDataWorker$a r0 = (com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ReimportHealthConnectDataWorker.a) r0
            int r1 = r0.f56592c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f56592c = r1
            goto L18
        L13:
            com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ReimportHealthConnectDataWorker$a r0 = new com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ReimportHealthConnectDataWorker$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f56590a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f56592c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            nm0.l.b(r6)
            goto L45
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            nm0.l.b(r6)
            kotlinx.coroutines.CoroutineDispatcher r6 = kotlinx.coroutines.Dispatchers.getIO()
            com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ReimportHealthConnectDataWorker$b r2 = new com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ReimportHealthConnectDataWorker$b
            r4 = 0
            r2.<init>(r4)
            r0.f56592c = r3
            java.lang.Object r6 = kotlinx.coroutines.BuildersKt.withContext(r6, r2, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            java.lang.String r0 = "withContext(...)"
            kotlin.jvm.internal.u.i(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ReimportHealthConnectDataWorker.doWork(qm0.d):java.lang.Object");
    }
}
