package com.withings.tutorials.ui.screens.explanations;
/* compiled from: Vo2Max.kt */
/* loaded from: classes4.dex */
public final class m2 {

    /* renamed from: a  reason: collision with root package name */
    public static final m2 f45195a = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Vo2Max.kt */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.p<r8.m, r8.n, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45196a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r8.n f45197b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45198c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(r8.n nVar, ym0.a aVar, ym0.a aVar2) {
            super(2);
            this.f45196a = aVar;
            this.f45197b = nVar;
            this.f45198c = aVar2;
        }

        @Override // ym0.p
        public final nm0.y invoke(r8.m mVar, r8.n nVar) {
            r8.m GuidedPresentationTutorialNavHost = mVar;
            r8.n it = nVar;
            kotlin.jvm.internal.u.j(GuidedPresentationTutorialNavHost, "$this$GuidedPresentationTutorialNavHost");
            kotlin.jvm.internal.u.j(it, "it");
            r8.n nVar2 = this.f45197b;
            ym0.a<nm0.y> aVar = this.f45196a;
            androidx.navigation.compose.n.b(GuidedPresentationTutorialNavHost, "FirstAssessment", null, null, null, null, null, null, new s1.a(true, 802487936, new e2(nVar2, aVar)), 126);
            androidx.navigation.compose.n.b(GuidedPresentationTutorialNavHost, "Vo2MaxIntroduction", null, null, null, null, null, null, new s1.a(true, -1645002889, new g2(nVar2, aVar)), 126);
            androidx.navigation.compose.n.b(GuidedPresentationTutorialNavHost, "TrendIntroduction", null, null, null, null, null, null, new s1.a(true, 2091980344, new i2(nVar2, aVar)), 126);
            androidx.navigation.compose.n.b(GuidedPresentationTutorialNavHost, "WorkoutRecommendation", null, null, null, null, null, null, new s1.a(true, 1533996281, new k2(nVar2, aVar)), 126);
            androidx.navigation.compose.n.b(GuidedPresentationTutorialNavHost, "CardioRecommendation", null, null, null, null, null, null, new s1.a(true, 976012218, new l2(aVar, this.f45198c)), 126);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Vo2Max.kt */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r8.n f45200b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45201c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45202d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f45203e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(r8.n nVar, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, int i11) {
            super(2);
            this.f45200b = nVar;
            this.f45201c = aVar;
            this.f45202d = aVar2;
            this.f45203e = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f45203e | 1);
            ym0.a<nm0.y> aVar2 = this.f45201c;
            ym0.a<nm0.y> aVar3 = this.f45202d;
            m2.this.a(this.f45200b, aVar2, aVar3, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    public final void a(r8.n navController, ym0.a<nm0.y> onBack, ym0.a<nm0.y> onDone, androidx.compose.runtime.a aVar, int i11) {
        kotlin.jvm.internal.u.j(navController, "navController");
        kotlin.jvm.internal.u.j(onBack, "onBack");
        kotlin.jvm.internal.u.j(onDone, "onDone");
        androidx.compose.runtime.b g11 = aVar.g(-584207880);
        b70.t0.b(navController, "FirstAssessment", new a(navController, onBack, onDone), g11, 56);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new b(navController, onBack, onDone, i11));
        }
    }
}
