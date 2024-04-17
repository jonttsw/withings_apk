package com.withings.wiscale2.vo2max.view;

import android.app.Application;
import android.content.Context;
import com.withings.library.measure.MeasuresGroup;
import com.withings.tutorials.core.model.ExplanationsType;
import com.withings.user.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
/* compiled from: Vo2maxActivity.kt */
/* loaded from: classes5.dex */
public final class c2 extends androidx.lifecycle.b {

    /* renamed from: a  reason: collision with root package name */
    private final User f62703a;

    /* renamed from: b  reason: collision with root package name */
    private final fy.n f62704b;

    /* renamed from: c  reason: collision with root package name */
    private final p60.c f62705c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f62706d;

    /* renamed from: e  reason: collision with root package name */
    private final MutableStateFlow<Boolean> f62707e;

    /* renamed from: f  reason: collision with root package name */
    private final MutableSharedFlow<b> f62708f;

    /* renamed from: g  reason: collision with root package name */
    private final SharedFlow<b> f62709g;

    /* renamed from: h  reason: collision with root package name */
    private final b2 f62710h;

    /* renamed from: i  reason: collision with root package name */
    private final androidx.lifecycle.f f62711i;

    /* renamed from: j  reason: collision with root package name */
    private final androidx.lifecycle.k0<Integer> f62712j;

    /* compiled from: Vo2maxActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.vo2max.view.Vo2maxViewModel$1", f = "Vo2maxActivity.kt", l = {215, 216, 218}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f62713a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Vo2maxActivity.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.vo2max.view.Vo2maxViewModel$1$1", f = "Vo2maxActivity.kt", l = {219, 220}, m = "invokeSuspend")
        /* renamed from: com.withings.wiscale2.vo2max.view.c2$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0796a extends kotlin.coroutines.jvm.internal.i implements ym0.p<Boolean, qm0.d<? super nm0.y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f62715a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ boolean f62716b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ c2 f62717c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0796a(c2 c2Var, qm0.d<? super C0796a> dVar) {
                super(2, dVar);
                this.f62717c = c2Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                C0796a c0796a = new C0796a(this.f62717c, dVar);
                c0796a.f62716b = ((Boolean) obj).booleanValue();
                return c0796a;
            }

            @Override // ym0.p
            public final Object invoke(Boolean bool, qm0.d<? super nm0.y> dVar) {
                Boolean bool2 = bool;
                bool2.booleanValue();
                return ((C0796a) create(bool2, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                    int r1 = r5.f62715a
                    com.withings.wiscale2.vo2max.view.c2 r2 = r5.f62717c
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L1e
                    if (r1 == r4) goto L1a
                    if (r1 != r3) goto L12
                    nm0.l.b(r6)
                    goto L45
                L12:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L1a:
                    nm0.l.b(r6)
                    goto L2e
                L1e:
                    nm0.l.b(r6)
                    boolean r6 = r5.f62716b
                    if (r6 == 0) goto L45
                    r5.f62715a = r4
                    java.lang.Object r6 = com.withings.wiscale2.vo2max.view.c2.j0(r2, r5)
                    if (r6 != r0) goto L2e
                    return r0
                L2e:
                    java.lang.Boolean r6 = (java.lang.Boolean) r6
                    boolean r6 = r6.booleanValue()
                    if (r6 != 0) goto L45
                    kotlinx.coroutines.flow.MutableSharedFlow r6 = com.withings.wiscale2.vo2max.view.c2.i0(r2)
                    com.withings.wiscale2.vo2max.view.c2$b$a r1 = com.withings.wiscale2.vo2max.view.c2.b.a.f62718a
                    r5.f62715a = r3
                    java.lang.Object r6 = r6.emit(r1, r5)
                    if (r6 != r0) goto L45
                    return r0
                L45:
                    nm0.y r6 = nm0.y.f85009a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.vo2max.view.c2.a.C0796a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        a(qm0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x005a A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r1 = r6.f62713a
                r2 = 3
                r3 = 2
                r4 = 1
                com.withings.wiscale2.vo2max.view.c2 r5 = com.withings.wiscale2.vo2max.view.c2.this
                if (r1 == 0) goto L25
                if (r1 == r4) goto L21
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                nm0.l.b(r7)
                goto L5b
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                nm0.l.b(r7)
                goto L48
            L21:
                nm0.l.b(r7)
                goto L31
            L25:
                nm0.l.b(r7)
                r6.f62713a = r4
                java.lang.Object r7 = com.withings.wiscale2.vo2max.view.c2.j0(r5, r6)
                if (r7 != r0) goto L31
                return r0
            L31:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 != 0) goto L48
                kotlinx.coroutines.flow.MutableSharedFlow r7 = com.withings.wiscale2.vo2max.view.c2.i0(r5)
                com.withings.wiscale2.vo2max.view.c2$b$b r1 = com.withings.wiscale2.vo2max.view.c2.b.C0797b.f62719a
                r6.f62713a = r3
                java.lang.Object r7 = r7.emit(r1, r6)
                if (r7 != r0) goto L48
                return r0
            L48:
                kotlinx.coroutines.flow.MutableStateFlow r7 = com.withings.wiscale2.vo2max.view.c2.g0(r5)
                com.withings.wiscale2.vo2max.view.c2$a$a r1 = new com.withings.wiscale2.vo2max.view.c2$a$a
                r3 = 0
                r1.<init>(r5, r3)
                r6.f62713a = r2
                java.lang.Object r7 = kotlinx.coroutines.flow.FlowKt.collectLatest(r7, r1, r6)
                if (r7 != r0) goto L5b
                return r0
            L5b:
                nm0.y r7 = nm0.y.f85009a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.vo2max.view.c2.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: Vo2maxActivity.kt */
    /* loaded from: classes5.dex */
    public static abstract class b {

        /* compiled from: Vo2maxActivity.kt */
        /* loaded from: classes5.dex */
        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f62718a = new a();

            private a() {
                super(0);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return true;
            }

            public final int hashCode() {
                return -882235909;
            }

            public final String toString() {
                return "CloseEvent";
            }
        }

        /* compiled from: Vo2maxActivity.kt */
        /* renamed from: com.withings.wiscale2.vo2max.view.c2$b$b  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0797b extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final C0797b f62719a = new C0797b();

            private C0797b() {
                super(0);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0797b)) {
                    return false;
                }
                C0797b c0797b = (C0797b) obj;
                return true;
            }

            public final int hashCode() {
                return 24098212;
            }

            public final String toString() {
                return "OpenExplanationEvent";
            }
        }

        public /* synthetic */ b(int i11) {
            this();
        }

        private b() {
        }
    }

    /* compiled from: Vo2maxActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.vo2max.view.Vo2maxViewModel$vo2maxMeasuresGroup$1", f = "Vo2maxActivity.kt", l = {203, 202}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class c extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<List<? extends MeasuresGroup>>, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f62720a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f62721b;

        c(qm0.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            c cVar = new c(dVar);
            cVar.f62721b = obj;
            return cVar;
        }

        @Override // ym0.p
        public final Object invoke(androidx.lifecycle.h0<List<? extends MeasuresGroup>> h0Var, qm0.d<? super nm0.y> dVar) {
            return ((c) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            androidx.lifecycle.h0 h0Var;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f62720a;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        nm0.l.b(obj);
                        return nm0.y.f85009a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h0Var = (androidx.lifecycle.h0) this.f62721b;
                nm0.l.b(obj);
            } else {
                nm0.l.b(obj);
                h0Var = (androidx.lifecycle.h0) this.f62721b;
                c2 c2Var = c2.this;
                this.f62721b = h0Var;
                this.f62720a = 1;
                obj = c2Var.f62704b.a(c2Var.getUser().q(), new Long(c2Var.getUser().h().getMillis()), true, null, new int[]{123}, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            ArrayList f11 = hy.g.f((List) obj);
            this.f62721b = null;
            this.f62720a = 2;
            if (h0Var.emit(f11, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(Application application, User user, fy.n nVar, p60.c cVar, boolean z5) {
        super(application);
        kotlin.jvm.internal.u.j(user, "user");
        this.f62703a = user;
        this.f62704b = nVar;
        this.f62705c = cVar;
        this.f62706d = z5;
        this.f62707e = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        MutableSharedFlow<b> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
        this.f62708f = MutableSharedFlow$default;
        this.f62709g = FlowKt.asSharedFlow(MutableSharedFlow$default);
        Context applicationContext = application.getApplicationContext();
        kotlin.jvm.internal.u.i(applicationContext, "getApplicationContext(...)");
        this.f62710h = new b2(applicationContext);
        this.f62711i = androidx.lifecycle.h.a(Dispatchers.getIO(), new c(null), 2);
        this.f62712j = new androidx.lifecycle.k0<>();
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(this), null, null, new a(null), 3, null);
    }

    public static final Object j0(c2 c2Var, qm0.d dVar) {
        boolean z5 = c2Var.f62706d;
        User user = c2Var.f62703a;
        if (z5) {
            return Boolean.valueOf(c2Var.f62710h.c(new Long(user.q())));
        }
        return FlowKt.first(c2Var.f62705c.b(ExplanationsType.f44581b, new Long(user.q())), dVar);
    }

    public final User getUser() {
        return this.f62703a;
    }

    public final SharedFlow<b> k0() {
        return this.f62709g;
    }

    public final androidx.lifecycle.k0<Integer> m0() {
        return this.f62712j;
    }

    public final androidx.lifecycle.f p0() {
        return this.f62711i;
    }
}
