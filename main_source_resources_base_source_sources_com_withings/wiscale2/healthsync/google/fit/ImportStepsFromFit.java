package com.withings.wiscale2.healthsync.google.fit;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.n0;
import androidx.work.o;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.partner.model.Partner;
import com.withings.user.User;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.CoroutineScope;
import lj0.c0;
import lj0.h0;
import nm0.y;
import u10.a0;
import v10.c;
import ym0.p;
/* compiled from: ImportStepsFromFit.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/withings/wiscale2/healthsync/google/fit/ImportStepsFromFit;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroidx/work/WorkerParameters;", "params", "Lfy/i;", "getLastMeasuresGroupForTypesUseCase", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lfy/i;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ImportStepsFromFit extends CoroutineWorker {

    /* renamed from: a  reason: collision with root package name */
    private final fy.i f56262a;

    /* renamed from: b  reason: collision with root package name */
    private final nm0.g f56263b;

    /* renamed from: c  reason: collision with root package name */
    private final nm0.g f56264c;

    /* renamed from: d  reason: collision with root package name */
    private final nm0.g f56265d;

    /* renamed from: e  reason: collision with root package name */
    private final nm0.g f56266e;

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f56267f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ImportStepsFromFit.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.fit.ImportStepsFromFit", f = "ImportStepsFromFit.kt", l = {79}, m = "doWork")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f56268a;

        /* renamed from: c  reason: collision with root package name */
        int f56270c;

        a(qm0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56268a = obj;
            this.f56270c |= Integer.MIN_VALUE;
            return ImportStepsFromFit.this.doWork(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ImportStepsFromFit.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.fit.ImportStepsFromFit$doWork$2", f = "ImportStepsFromFit.kt", l = {80, 84}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super o.a>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f56271a;

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

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            t10.e eVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f56271a;
            ImportStepsFromFit importStepsFromFit = ImportStepsFromFit.this;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        nm0.l.b(obj);
                        return new o.a.c();
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nm0.l.b(obj);
            } else {
                nm0.l.b(obj);
                eVar = t10.e.f97966j;
                if (eVar != null) {
                    Context applicationContext = importStepsFromFit.getApplicationContext();
                    u.i(applicationContext, "getApplicationContext(...)");
                    int l5 = Partner.f43456n.l();
                    this.f56271a = 1;
                    obj = eVar.f(applicationContext, l5, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    throw new IllegalArgumentException("you must call init before using get".toString());
                }
            }
            Partner partner = (Partner) obj;
            if (partner != null) {
                c.p pVar = c.p.f103158c;
                if (pVar.i(partner)) {
                    Context applicationContext2 = importStepsFromFit.getApplicationContext();
                    u.i(applicationContext2, "getApplicationContext(...)");
                    if (pVar.g(applicationContext2)) {
                        this.f56271a = 2;
                        if (ImportStepsFromFit.v(importStepsFromFit, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return new o.a.c();
                    }
                }
            }
            Context applicationContext3 = importStepsFromFit.getApplicationContext();
            u.i(applicationContext3, "getApplicationContext(...)");
            n0.n(applicationContext3).i("ImportStepsFromFit");
            return new o.a.c();
        }
    }

    /* compiled from: ImportStepsFromFit.kt */
    /* loaded from: classes5.dex */
    static final class c extends w implements ym0.a<a0> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f56273a = new w(0);

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
    /* compiled from: ImportStepsFromFit.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.fit.ImportStepsFromFit", f = "ImportStepsFromFit.kt", l = {107}, m = "requestStepsPerDay")
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        ImportStepsFromFit f56274a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f56275b;

        /* renamed from: d  reason: collision with root package name */
        int f56277d;

        d(qm0.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56275b = obj;
            this.f56277d |= Integer.MIN_VALUE;
            return ImportStepsFromFit.this.x(0L, this);
        }
    }

    /* compiled from: ImportStepsFromFit.kt */
    /* loaded from: classes5.dex */
    static final class e extends w implements ym0.a<User> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f56278a = new w(0);

        @Override // ym0.a
        public final User invoke() {
            return m70.i.b().e();
        }
    }

    /* compiled from: ImportStepsFromFit.kt */
    /* loaded from: classes5.dex */
    static final class f extends w implements ym0.a<li0.b> {
        f() {
            super(0);
        }

        @Override // ym0.a
        public final li0.b invoke() {
            ImportStepsFromFit importStepsFromFit = ImportStepsFromFit.this;
            return new li0.b(importStepsFromFit.f56262a, ImportStepsFromFit.t(importStepsFromFit), ConstantsWs.DEVICE_MODEL_STEP_COUNTER_GOOGLE);
        }
    }

    /* compiled from: ImportStepsFromFit.kt */
    /* loaded from: classes5.dex */
    static final class g extends w implements ym0.a<c0> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f56280a = new w(0);

        @Override // ym0.a
        public final c0 invoke() {
            h0 e11 = h0.e();
            u.i(e11, "get(...)");
            return new c0(e11);
        }
    }

    /* compiled from: ImportStepsFromFit.kt */
    /* loaded from: classes5.dex */
    static final class h extends w implements ym0.a<lj0.n0> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f56281a = new w(0);

        @Override // ym0.a
        public final lj0.n0 invoke() {
            lj0.n0 n0Var = lj0.n0.f79890b;
            if (n0Var != null) {
                return n0Var;
            }
            u.s("instance");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImportStepsFromFit(Context context, WorkerParameters params, fy.i getLastMeasuresGroupForTypesUseCase) {
        super(context, params);
        u.j(context, "context");
        u.j(params, "params");
        u.j(getLastMeasuresGroupForTypesUseCase, "getLastMeasuresGroupForTypesUseCase");
        this.f56262a = getLastMeasuresGroupForTypesUseCase;
        this.f56263b = nm0.h.b(h.f56281a);
        this.f56264c = nm0.h.b(e.f56278a);
        this.f56265d = nm0.h.b(new f());
        this.f56266e = nm0.h.b(g.f56280a);
        this.f56267f = nm0.h.b(c.f56273a);
    }

    public static final User t(ImportStepsFromFit importStepsFromFit) {
        return (User) importStepsFromFit.f56264c.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object v(com.withings.wiscale2.healthsync.google.fit.ImportStepsFromFit r8, qm0.d r9) {
        /*
            r8.getClass()
            boolean r0 = r9 instanceof com.withings.wiscale2.healthsync.google.fit.h
            if (r0 == 0) goto L16
            r0 = r9
            com.withings.wiscale2.healthsync.google.fit.h r0 = (com.withings.wiscale2.healthsync.google.fit.h) r0
            int r1 = r0.f56450e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f56450e = r1
            goto L1b
        L16:
            com.withings.wiscale2.healthsync.google.fit.h r0 = new com.withings.wiscale2.healthsync.google.fit.h
            r0.<init>(r8, r9)
        L1b:
            java.lang.Object r9 = r0.f56448c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f56450e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.util.Iterator r8 = r0.f56447b
            com.withings.wiscale2.healthsync.google.fit.ImportStepsFromFit r2 = r0.f56446a
            nm0.l.b(r9)
            goto L92
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            com.withings.wiscale2.healthsync.google.fit.ImportStepsFromFit r8 = r0.f56446a
            nm0.l.b(r9)
            goto L65
        L3f:
            nm0.l.b(r9)
            nm0.g r9 = r8.f56265d
            java.lang.Object r9 = r9.getValue()
            li0.b r9 = (li0.b) r9
            r9.f()
            nm0.g r9 = r8.f56267f
            java.lang.Object r9 = r9.getValue()
            u10.a0 r9 = (u10.a0) r9
            r0.f56446a = r8
            r0.f56450e = r4
            r2 = 0
            r4 = 15
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
            r0.f56446a = r2
            r0.f56447b = r8
            r0.f56450e = r3
            java.lang.Object r9 = r2.x(r4, r0)
            if (r9 != r1) goto L92
            goto Lae
        Lac:
            nm0.y r1 = nm0.y.f85009a
        Lae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.fit.ImportStepsFromFit.v(com.withings.wiscale2.healthsync.google.fit.ImportStepsFromFit, qm0.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0283  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(long r13, qm0.d<? super nm0.y> r15) {
        /*
            Method dump skipped, instructions count: 649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.fit.ImportStepsFromFit.x(long, qm0.d):java.lang.Object");
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
            boolean r0 = r6 instanceof com.withings.wiscale2.healthsync.google.fit.ImportStepsFromFit.a
            if (r0 == 0) goto L13
            r0 = r6
            com.withings.wiscale2.healthsync.google.fit.ImportStepsFromFit$a r0 = (com.withings.wiscale2.healthsync.google.fit.ImportStepsFromFit.a) r0
            int r1 = r0.f56270c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f56270c = r1
            goto L18
        L13:
            com.withings.wiscale2.healthsync.google.fit.ImportStepsFromFit$a r0 = new com.withings.wiscale2.healthsync.google.fit.ImportStepsFromFit$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f56268a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f56270c
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
            com.withings.wiscale2.healthsync.google.fit.ImportStepsFromFit$b r2 = new com.withings.wiscale2.healthsync.google.fit.ImportStepsFromFit$b
            r4 = 0
            r2.<init>(r4)
            r0.f56270c = r3
            java.lang.Object r6 = kotlinx.coroutines.BuildersKt.withContext(r6, r2, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            java.lang.String r0 = "withContext(...)"
            kotlin.jvm.internal.u.i(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.google.fit.ImportStepsFromFit.doWork(qm0.d):java.lang.Object");
    }
}
