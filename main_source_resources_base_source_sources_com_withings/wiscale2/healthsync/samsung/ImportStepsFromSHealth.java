package com.withings.wiscale2.healthsync.samsung;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.o;
import com.samsung.android.sdk.healthdata.HealthDataResolver;
import com.samsung.android.sdk.healthdata.HealthDataStore;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.CoroutineScope;
import lj0.c0;
import lj0.h0;
import lj0.n0;
import nm0.l;
import nm0.y;
import u10.a0;
import ym0.p;
/* compiled from: ImportStepsFromSHealth.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/withings/wiscale2/healthsync/samsung/ImportStepsFromSHealth;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroidx/work/WorkerParameters;", "params", "Lfy/i;", "getLastMeasuresGroupForTypesUseCase", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lfy/i;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ImportStepsFromSHealth extends CoroutineWorker {

    /* renamed from: a  reason: collision with root package name */
    private final fy.i f56874a;

    /* renamed from: b  reason: collision with root package name */
    private HealthDataStore f56875b;

    /* renamed from: c  reason: collision with root package name */
    private final nm0.g f56876c;

    /* renamed from: d  reason: collision with root package name */
    private final nm0.g f56877d;

    /* renamed from: e  reason: collision with root package name */
    private final nm0.g f56878e;

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f56879f;

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f56880g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ImportStepsFromSHealth.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.samsung.ImportStepsFromSHealth", f = "ImportStepsFromSHealth.kt", l = {78}, m = "doWork")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f56881a;

        /* renamed from: c  reason: collision with root package name */
        int f56883c;

        a(qm0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56881a = obj;
            this.f56883c |= Integer.MIN_VALUE;
            return ImportStepsFromSHealth.this.doWork(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ImportStepsFromSHealth.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.samsung.ImportStepsFromSHealth$doWork$2", f = "ImportStepsFromSHealth.kt", l = {79, 80, 81}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super o.a>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f56884a;

        b(qm0.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new b(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super o.a> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r1 = r8.f56884a
                java.lang.String r2 = "getApplicationContext(...)"
                r3 = 3
                r4 = 2
                r5 = 1
                com.withings.wiscale2.healthsync.samsung.ImportStepsFromSHealth r6 = com.withings.wiscale2.healthsync.samsung.ImportStepsFromSHealth.this
                if (r1 == 0) goto L27
                if (r1 == r5) goto L23
                if (r1 == r4) goto L1f
                if (r1 != r3) goto L17
                nm0.l.b(r9)
                goto L7c
            L17:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1f:
                nm0.l.b(r9)
                goto L5b
            L23:
                nm0.l.b(r9)
                goto L46
            L27:
                nm0.l.b(r9)
                t10.e r9 = t10.e.a()
                if (r9 == 0) goto L82
                android.content.Context r1 = r6.getApplicationContext()
                kotlin.jvm.internal.u.i(r1, r2)
                com.withings.partner.model.Partner r7 = com.withings.partner.model.Partner.f43461s
                int r7 = r7.l()
                r8.f56884a = r5
                java.lang.Object r9 = r9.f(r1, r7, r8)
                if (r9 != r0) goto L46
                return r0
            L46:
                com.withings.partner.model.Partner r9 = (com.withings.partner.model.Partner) r9
                if (r9 == 0) goto L6c
                y10.a$d r1 = y10.a.d.f108300d
                boolean r9 = r1.i(r9)
                if (r9 != r5) goto L6c
                r8.f56884a = r4
                java.lang.Object r9 = com.withings.wiscale2.healthsync.samsung.ImportStepsFromSHealth.w(r6, r8)
                if (r9 != r0) goto L5b
                return r0
            L5b:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto L6c
                r8.f56884a = r3
                java.lang.Object r9 = com.withings.wiscale2.healthsync.samsung.ImportStepsFromSHealth.x(r6, r8)
                if (r9 != r0) goto L7c
                return r0
            L6c:
                android.content.Context r9 = r6.getApplicationContext()
                kotlin.jvm.internal.u.i(r9, r2)
                androidx.work.impl.n0 r9 = androidx.work.impl.n0.n(r9)
                java.lang.String r0 = "ImportStepsFromSHealth"
                r9.i(r0)
            L7c:
                androidx.work.o$a$c r9 = new androidx.work.o$a$c
                r9.<init>()
                return r9
            L82:
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "you must call init before using get"
                java.lang.String r0 = r0.toString()
                r9.<init>(r0)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.samsung.ImportStepsFromSHealth.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: ImportStepsFromSHealth.kt */
    /* loaded from: classes5.dex */
    static final class c extends w implements ym0.a<a0> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f56886a = new w(0);

        @Override // ym0.a
        public final a0 invoke() {
            a0 a0Var = a0.f101222d;
            if (a0Var != null) {
                return a0Var;
            }
            u.s("instance");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ImportStepsFromSHealth.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.samsung.ImportStepsFromSHealth", f = "ImportStepsFromSHealth.kt", l = {105}, m = "requestStepsPerDay")
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        ImportStepsFromSHealth f56887a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f56888b;

        /* renamed from: d  reason: collision with root package name */
        int f56890d;

        d(qm0.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56888b = obj;
            this.f56890d |= Integer.MIN_VALUE;
            return ImportStepsFromSHealth.this.z(0L, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ImportStepsFromSHealth.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.samsung.ImportStepsFromSHealth$requestStepsPerDay$2$1", f = "ImportStepsFromSHealth.kt", l = {105}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super HealthDataResolver.ReadResult>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f56891a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ HealthDataResolver.ReadRequest f56893c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(HealthDataResolver.ReadRequest readRequest, qm0.d<? super e> dVar) {
            super(2, dVar);
            this.f56893c = readRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new e(this.f56893c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super HealthDataResolver.ReadResult> dVar) {
            return ((e) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f56891a;
            if (i11 != 0) {
                if (i11 == 1) {
                    l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                l.b(obj);
                HealthDataStore healthDataStore = ImportStepsFromSHealth.this.f56875b;
                if (healthDataStore != null) {
                    HealthDataResolver healthDataResolver = new HealthDataResolver(healthDataStore, null);
                    this.f56891a = 1;
                    obj = y10.d.b(healthDataResolver, this.f56893c, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    u.s("healthDataStore");
                    throw null;
                }
            }
            return obj;
        }
    }

    /* compiled from: ImportStepsFromSHealth.kt */
    /* loaded from: classes5.dex */
    static final class f extends w implements ym0.a<User> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f56894a = new w(0);

        @Override // ym0.a
        public final User invoke() {
            return m70.i.b().e();
        }
    }

    /* compiled from: ImportStepsFromSHealth.kt */
    /* loaded from: classes5.dex */
    static final class g extends w implements ym0.a<li0.b> {
        g() {
            super(0);
        }

        @Override // ym0.a
        public final li0.b invoke() {
            ImportStepsFromSHealth importStepsFromSHealth = ImportStepsFromSHealth.this;
            return new li0.b(importStepsFromSHealth.f56874a, ImportStepsFromSHealth.v(importStepsFromSHealth), ConstantsWs.DEVICE_MODEL_STEP_COUNTER_SHEALTH);
        }
    }

    /* compiled from: ImportStepsFromSHealth.kt */
    /* loaded from: classes5.dex */
    static final class h extends w implements ym0.a<c0> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f56896a = new w(0);

        @Override // ym0.a
        public final c0 invoke() {
            h0 e11 = h0.e();
            u.i(e11, "get(...)");
            return new c0(e11);
        }
    }

    /* compiled from: ImportStepsFromSHealth.kt */
    /* loaded from: classes5.dex */
    static final class i extends w implements ym0.a<n0> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f56897a = new w(0);

        @Override // ym0.a
        public final n0 invoke() {
            n0 n0Var = n0.f79890b;
            if (n0Var != null) {
                return n0Var;
            }
            u.s("instance");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImportStepsFromSHealth(Context context, WorkerParameters params, fy.i getLastMeasuresGroupForTypesUseCase) {
        super(context, params);
        u.j(context, "context");
        u.j(params, "params");
        u.j(getLastMeasuresGroupForTypesUseCase, "getLastMeasuresGroupForTypesUseCase");
        this.f56874a = getLastMeasuresGroupForTypesUseCase;
        this.f56876c = nm0.h.b(i.f56897a);
        this.f56877d = nm0.h.b(f.f56894a);
        this.f56878e = nm0.h.b(new g());
        this.f56879f = nm0.h.b(h.f56896a);
        this.f56880g = nm0.h.b(c.f56886a);
    }

    public static final User v(ImportStepsFromSHealth importStepsFromSHealth) {
        return (User) importStepsFromSHealth.f56877d.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object w(com.withings.wiscale2.healthsync.samsung.ImportStepsFromSHealth r4, qm0.d r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof com.withings.wiscale2.healthsync.samsung.a
            if (r0 == 0) goto L16
            r0 = r5
            com.withings.wiscale2.healthsync.samsung.a r0 = (com.withings.wiscale2.healthsync.samsung.a) r0
            int r1 = r0.f56955e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f56955e = r1
            goto L1b
        L16:
            com.withings.wiscale2.healthsync.samsung.a r0 = new com.withings.wiscale2.healthsync.samsung.a
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.f56953c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f56955e
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            com.withings.wiscale2.healthsync.samsung.ImportStepsFromSHealth r4 = r0.f56952b
            com.withings.wiscale2.healthsync.samsung.ImportStepsFromSHealth r0 = r0.f56951a
            nm0.l.b(r5)
            goto L50
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            nm0.l.b(r5)
            android.content.Context r5 = r4.getApplicationContext()
            java.lang.String r2 = "getApplicationContext(...)"
            kotlin.jvm.internal.u.i(r5, r2)
            r0.f56951a = r4
            r0.f56952b = r4
            r0.f56955e = r3
            java.lang.Object r5 = y10.d.e(r5, r0)
            if (r5 != r1) goto L4f
            goto L9e
        L4f:
            r0 = r4
        L50:
            com.samsung.android.sdk.healthdata.HealthDataStore r5 = (com.samsung.android.sdk.healthdata.HealthDataStore) r5
            r4.f56875b = r5
            com.samsung.android.sdk.healthdata.HealthPermissionManager r4 = new com.samsung.android.sdk.healthdata.HealthPermissionManager
            com.samsung.android.sdk.healthdata.HealthDataStore r5 = r0.f56875b
            if (r5 == 0) goto L9f
            r4.<init>(r5)
            y10.a$d r5 = y10.a.d.f108300d
            java.util.List r5 = r5.q()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.LinkedHashSet r5 = kotlin.collections.x.T0(r5)
            java.util.Map r4 = r4.isPermissionAcquired(r5)
            java.lang.String r5 = "isPermissionAcquired(...)"
            kotlin.jvm.internal.u.i(r4, r5)
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L79
            goto L9a
        L79:
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L81:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L9a
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r5 = r5.getValue()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r5 = kotlin.jvm.internal.u.e(r5, r0)
            if (r5 != 0) goto L81
            r3 = 0
        L9a:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
        L9e:
            return r1
        L9f:
            java.lang.String r4 = "healthDataStore"
            kotlin.jvm.internal.u.s(r4)
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.samsung.ImportStepsFromSHealth.w(com.withings.wiscale2.healthsync.samsung.ImportStepsFromSHealth, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object x(com.withings.wiscale2.healthsync.samsung.ImportStepsFromSHealth r8, qm0.d r9) {
        /*
            r8.getClass()
            boolean r0 = r9 instanceof com.withings.wiscale2.healthsync.samsung.b
            if (r0 == 0) goto L16
            r0 = r9
            com.withings.wiscale2.healthsync.samsung.b r0 = (com.withings.wiscale2.healthsync.samsung.b) r0
            int r1 = r0.f56960e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f56960e = r1
            goto L1b
        L16:
            com.withings.wiscale2.healthsync.samsung.b r0 = new com.withings.wiscale2.healthsync.samsung.b
            r0.<init>(r8, r9)
        L1b:
            java.lang.Object r9 = r0.f56958c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f56960e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.util.Iterator r8 = r0.f56957b
            com.withings.wiscale2.healthsync.samsung.ImportStepsFromSHealth r2 = r0.f56956a
            nm0.l.b(r9)
            goto L92
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            com.withings.wiscale2.healthsync.samsung.ImportStepsFromSHealth r8 = r0.f56956a
            nm0.l.b(r9)
            goto L65
        L3f:
            nm0.l.b(r9)
            nm0.g r9 = r8.f56878e
            java.lang.Object r9 = r9.getValue()
            li0.b r9 = (li0.b) r9
            r9.f()
            nm0.g r9 = r8.f56880g
            java.lang.Object r9 = r9.getValue()
            u10.a0 r9 = (u10.a0) r9
            r0.f56956a = r8
            r0.f56960e = r4
            r2 = 0
            r4 = 43
            r5 = 36
            java.lang.Object r9 = r9.e(r4, r5, r2, r0)
            if (r9 != r1) goto L65
            goto Lae
        L65:
            org.joda.time.DateTime r9 = (org.joda.time.DateTime) r9
            org.joda.time.DateTime r9 = r9.withTimeAtStartOfDay()
            en0.n r2 = new en0.n
            long r4 = r9.getMillis()
            org.joda.time.DateTime r9 = org.joda.time.DateTime.now()
            java.lang.String r6 = "now(...)"
            kotlin.jvm.internal.u.i(r9, r6)
            org.joda.time.DateTime r9 = hn.a.m(r9)
            long r6 = r9.getMillis()
            r2.<init>(r4, r6)
            r4 = 86400000(0x5265c00, double:4.2687272E-316)
            en0.l r9 = en0.r.v(r2, r4)
            java.util.Iterator r9 = r9.iterator()
            r2 = r8
            r8 = r9
        L92:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto Lac
            r9 = r8
            kotlin.collections.q0 r9 = (kotlin.collections.q0) r9
            long r4 = r9.a()
            r0.f56956a = r2
            r0.f56957b = r8
            r0.f56960e = r3
            java.lang.Object r9 = r2.z(r4, r0)
            if (r9 != r1) goto L92
            goto Lae
        Lac:
            nm0.y r1 = nm0.y.f85009a
        Lae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.samsung.ImportStepsFromSHealth.x(com.withings.wiscale2.healthsync.samsung.ImportStepsFromSHealth, qm0.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(long r18, qm0.d<? super nm0.y> r20) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.samsung.ImportStepsFromSHealth.z(long, qm0.d):java.lang.Object");
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
            boolean r0 = r6 instanceof com.withings.wiscale2.healthsync.samsung.ImportStepsFromSHealth.a
            if (r0 == 0) goto L13
            r0 = r6
            com.withings.wiscale2.healthsync.samsung.ImportStepsFromSHealth$a r0 = (com.withings.wiscale2.healthsync.samsung.ImportStepsFromSHealth.a) r0
            int r1 = r0.f56883c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f56883c = r1
            goto L18
        L13:
            com.withings.wiscale2.healthsync.samsung.ImportStepsFromSHealth$a r0 = new com.withings.wiscale2.healthsync.samsung.ImportStepsFromSHealth$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f56881a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f56883c
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
            com.withings.wiscale2.healthsync.samsung.ImportStepsFromSHealth$b r2 = new com.withings.wiscale2.healthsync.samsung.ImportStepsFromSHealth$b
            r4 = 0
            r2.<init>(r4)
            r0.f56883c = r3
            java.lang.Object r6 = kotlinx.coroutines.BuildersKt.withContext(r6, r2, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            java.lang.String r0 = "withContext(...)"
            kotlin.jvm.internal.u.i(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.samsung.ImportStepsFromSHealth.doWork(qm0.d):java.lang.Object");
    }
}
