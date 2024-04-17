package com.withings.manualLogging.ui.feature.addNote.cycle;
/* compiled from: CycleManualLoggingNavigation.kt */
/* loaded from: classes4.dex */
public final class v0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleManualLoggingNavigation.kt */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f41262a = new kotlin.jvm.internal.w(0);

        @Override // ym0.a
        public final /* bridge */ /* synthetic */ nm0.y invoke() {
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleManualLoggingNavigation.kt */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f41263a = new kotlin.jvm.internal.w(0);

        @Override // ym0.a
        public final /* bridge */ /* synthetic */ nm0.y invoke() {
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleManualLoggingNavigation.kt */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.l<androidx.compose.animation.k<androidx.navigation.d>, androidx.compose.animation.l0> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f41264a = new kotlin.jvm.internal.w(1);

        @Override // ym0.l
        public final androidx.compose.animation.l0 invoke(androidx.compose.animation.k<androidx.navigation.d> kVar) {
            androidx.compose.animation.k<androidx.navigation.d> NavHost = kVar;
            kotlin.jvm.internal.u.j(NavHost, "$this$NavHost");
            return androidx.compose.animation.p.h(m0.k.d(700, 0, null, 6), 0.0f, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleManualLoggingNavigation.kt */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.l<androidx.compose.animation.k<androidx.navigation.d>, androidx.compose.animation.n0> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f41265a = new kotlin.jvm.internal.w(1);

        @Override // ym0.l
        public final androidx.compose.animation.n0 invoke(androidx.compose.animation.k<androidx.navigation.d> kVar) {
            androidx.compose.animation.k<androidx.navigation.d> NavHost = kVar;
            kotlin.jvm.internal.u.j(NavHost, "$this$NavHost");
            return androidx.compose.animation.p.i(m0.k.d(700, 0, null, 6), 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleManualLoggingNavigation.kt */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.l<r8.m, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u0 f41266a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f41267b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f41268c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ g3 f41269d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f41270e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ androidx.activity.z f41271f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ym0.l<g3, nm0.y> f41272g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f41273h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(u0 u0Var, boolean z5, ym0.a<nm0.y> aVar, g3 g3Var, ym0.a<nm0.y> aVar2, androidx.activity.z zVar, ym0.l<? super g3, nm0.y> lVar, int i11) {
            super(1);
            this.f41266a = u0Var;
            this.f41267b = z5;
            this.f41268c = aVar;
            this.f41269d = g3Var;
            this.f41270e = aVar2;
            this.f41271f = zVar;
            this.f41272g = lVar;
            this.f41273h = i11;
        }

        @Override // ym0.l
        public final nm0.y invoke(r8.m mVar) {
            r8.m NavHost = mVar;
            kotlin.jvm.internal.u.j(NavHost, "$this$NavHost");
            ym0.a<nm0.y> aVar = this.f41268c;
            u0 u0Var = this.f41266a;
            androidx.navigation.compose.n.b(NavHost, "cycle_tutorial_introduction", null, null, null, null, null, null, new s1.a(true, 595675895, new d1(aVar, u0Var)), 126);
            androidx.navigation.compose.n.b(NavHost, "cycle_sync_health_connect", null, null, null, null, null, null, new s1.a(true, -1087099090, new e1(aVar, u0Var)), 126);
            androidx.navigation.compose.n.b(NavHost, "factor", null, null, null, null, null, null, new s1.a(true, -1225884497, new h1(this.f41266a, this.f41269d, this.f41268c, this.f41271f, this.f41272g)), 126);
            ym0.a<nm0.y> e11 = u0Var.e();
            ym0.a<nm0.y> h11 = u0Var.h();
            ym0.a<nm0.y> k11 = u0Var.k();
            ym0.a<nm0.y> m11 = u0Var.m();
            g3 g3Var = this.f41269d;
            ym0.l<g3, nm0.y> lVar = this.f41272g;
            i1 i1Var = new i1(g3Var, lVar);
            g3 g3Var2 = this.f41269d;
            j1 j1Var = new j1(g3Var2, lVar);
            k1 k1Var = new k1(g3Var2, lVar);
            l1 l1Var = new l1(g3Var2, lVar);
            ym0.a<nm0.y> aVar2 = this.f41268c;
            ym0.a<nm0.y> aVar3 = this.f41270e;
            androidx.navigation.compose.n.b(NavHost, "regularity", null, null, null, null, null, null, new s1.a(true, -462922104, new r1(g3Var, aVar2, aVar3, m11, i1Var)), 126);
            androidx.navigation.compose.n.b(NavHost, "length", null, null, null, null, null, null, new s1.a(true, -289663233, new s1(g3Var, aVar2, e11, aVar3, j1Var)), 126);
            androidx.navigation.compose.n.b(NavHost, "period", null, null, null, null, null, null, new s1.a(true, 1849176640, new t1(this.f41267b, g3Var, aVar2, h11, k1Var, aVar3)), 126);
            androidx.navigation.compose.n.b(NavHost, "duration", null, null, null, null, null, null, new s1.a(true, -306950783, new u1(g3Var, aVar2, k11, aVar3, l1Var)), 126);
            int i11 = this.f41273h;
            ym0.a<nm0.y> aVar4 = this.f41270e;
            androidx.navigation.compose.n.b(NavHost, "cycle_tutorial_logwatch", null, null, null, null, null, null, new s1.a(true, -1364669904, new m1(i11, aVar4, u0Var)), 126);
            androidx.navigation.compose.n.b(NavHost, "cycle_tutorial_log", null, null, null, null, null, null, new s1.a(true, -1503455311, new n1(aVar4, u0Var)), 126);
            g3 g3Var3 = this.f41269d;
            w0 w0Var = new w0(g3Var3, lVar);
            x0 x0Var = new x0(g3Var2, lVar);
            y0 y0Var = new y0(g3Var2, lVar);
            ym0.a<nm0.y> d11 = u0Var.d();
            ym0.a<nm0.y> b10 = u0Var.b();
            ym0.a<nm0.y> c11 = u0Var.c();
            ym0.a<nm0.y> aVar5 = this.f41268c;
            androidx.activity.z zVar = this.f41271f;
            androidx.navigation.compose.n.b(NavHost, "contraceptive_type", null, null, null, null, null, null, new s1.a(true, 1238602071, new p1(g3Var3, aVar5, d11, w0Var, zVar)), 126);
            androidx.navigation.compose.n.b(NavHost, "contraceptive_regime", null, null, null, null, null, null, new s1.a(true, 1663969920, new q1(g3Var3, aVar5, b10, x0Var, zVar)), 126);
            androidx.navigation.compose.n.b(NavHost, "contraceptive_start_date", null, null, null, null, null, null, new s1.a(true, -1972614497, new o1(g3Var3, aVar5, c11, y0Var)), 126);
            androidx.navigation.compose.n.b(NavHost, "post_partum", null, null, null, null, null, null, new s1.a(true, -1642240718, new a1(u0Var, g3Var2, aVar, lVar)), 126);
            androidx.navigation.compose.n.b(NavHost, "menopause", null, null, null, null, null, null, new s1.a(true, -1781026125, new c1(u0Var, g3Var2, aVar, lVar)), 126);
            androidx.navigation.compose.n.b(NavHost, "loading", null, null, null, null, null, null, com.withings.manualLogging.ui.feature.addNote.cycle.b.f40915a, 126);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleManualLoggingNavigation.kt */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f41274a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f41275b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ r8.n f41276c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.activity.z f41277d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f41278e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f41279f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f41280g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ g3 f41281h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ ym0.l<g3, nm0.y> f41282i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ u0 f41283j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f41284k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ int f41285l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(boolean z5, String str, r8.n nVar, androidx.activity.z zVar, int i11, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, g3 g3Var, ym0.l<? super g3, nm0.y> lVar, u0 u0Var, int i12, int i13) {
            super(2);
            this.f41274a = z5;
            this.f41275b = str;
            this.f41276c = nVar;
            this.f41277d = zVar;
            this.f41278e = i11;
            this.f41279f = aVar;
            this.f41280g = aVar2;
            this.f41281h = g3Var;
            this.f41282i = lVar;
            this.f41283j = u0Var;
            this.f41284k = i12;
            this.f41285l = i13;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f41284k | 1);
            ym0.l<g3, nm0.y> lVar = this.f41282i;
            u0 u0Var = this.f41283j;
            v0.a(this.f41274a, this.f41275b, this.f41276c, this.f41277d, this.f41278e, this.f41279f, this.f41280g, this.f41281h, lVar, u0Var, aVar, g11, this.f41285l);
            return nm0.y.f85009a;
        }
    }

    public static final void a(boolean z5, String startDestination, r8.n navController, androidx.activity.z zVar, int i11, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, g3 g3Var, ym0.l<? super g3, nm0.y> cycleFormChanged, u0 nextButtonClick, androidx.compose.runtime.a aVar3, int i12, int i13) {
        a aVar4;
        b bVar;
        g3 g3Var2;
        int i14;
        kotlin.jvm.internal.u.j(startDestination, "startDestination");
        kotlin.jvm.internal.u.j(navController, "navController");
        kotlin.jvm.internal.u.j(cycleFormChanged, "cycleFormChanged");
        kotlin.jvm.internal.u.j(nextButtonClick, "nextButtonClick");
        androidx.compose.runtime.b g11 = aVar3.g(-339466219);
        if ((i13 & 32) != 0) {
            aVar4 = a.f41262a;
        } else {
            aVar4 = aVar;
        }
        if ((i13 & 64) != 0) {
            bVar = b.f41263a;
        } else {
            bVar = aVar2;
        }
        if ((i13 & 128) != 0) {
            i14 = i12 & (-29360129);
            g3Var2 = new g3();
        } else {
            g3Var2 = g3Var;
            i14 = i12;
        }
        androidx.navigation.compose.s.b(navController, startDestination, null, null, null, c.f41264a, d.f41265a, null, null, new e(nextButtonClick, z5, aVar4, g3Var2, bVar, zVar, cycleFormChanged, i11), g11, (i14 & 112) | 1769480, 412);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new f(z5, startDestination, navController, zVar, i11, aVar4, bVar, g3Var2, cycleFormChanged, nextButtonClick, i12, i13));
        }
    }
}
