package com.withings.tutorials.ui.screens.explanations;
/* compiled from: SleepApnea.kt */
/* loaded from: classes4.dex */
public final class n0 {

    /* renamed from: a  reason: collision with root package name */
    public static final n0 f45209a = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SleepApnea.kt */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.p<r8.m, r8.n, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45210a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r8.n f45211b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45212c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(r8.n nVar, ym0.a aVar, ym0.a aVar2) {
            super(2);
            this.f45210a = aVar;
            this.f45211b = nVar;
            this.f45212c = aVar2;
        }

        @Override // ym0.p
        public final nm0.y invoke(r8.m mVar, r8.n nVar) {
            r8.m GuidedPresentationTutorialNavHost = mVar;
            r8.n it = nVar;
            kotlin.jvm.internal.u.j(GuidedPresentationTutorialNavHost, "$this$GuidedPresentationTutorialNavHost");
            kotlin.jvm.internal.u.j(it, "it");
            r8.n nVar2 = this.f45211b;
            ym0.a<nm0.y> aVar = this.f45210a;
            androidx.navigation.compose.n.b(GuidedPresentationTutorialNavHost, "SleepApneaNormal", null, null, null, null, null, null, new s1.a(true, -961029728, new b0(nVar2, aVar)), 126);
            androidx.navigation.compose.n.b(GuidedPresentationTutorialNavHost, "SleepApneaAbnormal", null, null, null, null, null, null, new s1.a(true, 1620915095, new d0(nVar2, aVar)), 126);
            androidx.navigation.compose.n.b(GuidedPresentationTutorialNavHost, "SleepApneaAhi", null, null, null, null, null, null, new s1.a(true, 784120152, new f0(nVar2, aVar)), 126);
            androidx.navigation.compose.n.b(GuidedPresentationTutorialNavHost, "SleepApneaAhiMild", null, null, null, null, null, null, new s1.a(true, -52674791, new h0(nVar2, aVar)), 126);
            androidx.navigation.compose.n.b(GuidedPresentationTutorialNavHost, "SleepApneaAhiModerate", null, null, null, null, null, null, new s1.a(true, -889469734, new j0(nVar2, aVar)), 126);
            androidx.navigation.compose.n.b(GuidedPresentationTutorialNavHost, "SleepApneaAhiSevere", null, null, null, null, null, null, new s1.a(true, -1726264677, new l0(nVar2, aVar)), 126);
            androidx.navigation.compose.n.b(GuidedPresentationTutorialNavHost, "SleepApneaDoctor", null, null, null, null, null, null, new s1.a(true, 1731907676, new m0(aVar, this.f45212c)), 126);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SleepApnea.kt */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r8.n f45214b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45215c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45216d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f45217e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(r8.n nVar, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, int i11) {
            super(2);
            this.f45214b = nVar;
            this.f45215c = aVar;
            this.f45216d = aVar2;
            this.f45217e = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f45217e | 1);
            ym0.a<nm0.y> aVar2 = this.f45215c;
            ym0.a<nm0.y> aVar3 = this.f45216d;
            n0.this.a(this.f45214b, aVar2, aVar3, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    public final void a(r8.n navController, ym0.a<nm0.y> onBack, ym0.a<nm0.y> onDone, androidx.compose.runtime.a aVar, int i11) {
        kotlin.jvm.internal.u.j(navController, "navController");
        kotlin.jvm.internal.u.j(onBack, "onBack");
        kotlin.jvm.internal.u.j(onDone, "onDone");
        androidx.compose.runtime.b g11 = aVar.g(-171862760);
        b70.t0.b(navController, "SleepApneaNormal", new a(navController, onBack, onDone), g11, 56);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new b(navController, onBack, onDone, i11));
        }
    }
}
