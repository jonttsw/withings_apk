package com.withings.tutorials.ui.screens.explanations;
/* compiled from: SleepAverageHR.kt */
/* loaded from: classes4.dex */
public final class i1 {

    /* renamed from: a  reason: collision with root package name */
    public static final i1 f45157a = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SleepAverageHR.kt */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.p<r8.m, r8.n, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45158a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r8.n f45159b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45160c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(r8.n nVar, ym0.a aVar, ym0.a aVar2) {
            super(2);
            this.f45158a = aVar;
            this.f45159b = nVar;
            this.f45160c = aVar2;
        }

        @Override // ym0.p
        public final nm0.y invoke(r8.m mVar, r8.n nVar) {
            r8.m GuidedPresentationTutorialNavHost = mVar;
            r8.n it = nVar;
            kotlin.jvm.internal.u.j(GuidedPresentationTutorialNavHost, "$this$GuidedPresentationTutorialNavHost");
            kotlin.jvm.internal.u.j(it, "it");
            r8.n nVar2 = this.f45159b;
            ym0.a<nm0.y> aVar = this.f45158a;
            androidx.navigation.compose.n.b(GuidedPresentationTutorialNavHost, "HRIntroduction", null, null, null, null, null, null, new s1.a(true, -1577886944, new e1(nVar2, aVar)), 126);
            androidx.navigation.compose.n.b(GuidedPresentationTutorialNavHost, "LowHR", null, null, null, null, null, null, new s1.a(true, 1601621527, new g1(nVar2, aVar)), 126);
            androidx.navigation.compose.n.b(GuidedPresentationTutorialNavHost, "LifestyleAndHR", null, null, null, null, null, null, new s1.a(true, -203881768, new h1(aVar, this.f45160c)), 126);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SleepAverageHR.kt */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r8.n f45162b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45163c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45164d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f45165e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(r8.n nVar, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, int i11) {
            super(2);
            this.f45162b = nVar;
            this.f45163c = aVar;
            this.f45164d = aVar2;
            this.f45165e = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f45165e | 1);
            ym0.a<nm0.y> aVar2 = this.f45163c;
            ym0.a<nm0.y> aVar3 = this.f45164d;
            i1.this.a(this.f45162b, aVar2, aVar3, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    public final void a(r8.n navController, ym0.a<nm0.y> onBack, ym0.a<nm0.y> onDone, androidx.compose.runtime.a aVar, int i11) {
        kotlin.jvm.internal.u.j(navController, "navController");
        kotlin.jvm.internal.u.j(onBack, "onBack");
        kotlin.jvm.internal.u.j(onDone, "onDone");
        androidx.compose.runtime.b g11 = aVar.g(891690648);
        b70.t0.b(navController, "HRIntroduction", new a(navController, onBack, onDone), g11, 56);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new b(navController, onBack, onDone, i11));
        }
    }
}
