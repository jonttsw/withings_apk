package com.withings.tutorials.ui.screens.explanations;
/* compiled from: SleepScore.kt */
/* loaded from: classes4.dex */
public final class v1 {

    /* renamed from: a  reason: collision with root package name */
    public static final v1 f45269a = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SleepScore.kt */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.p<r8.m, r8.n, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45270a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r8.n f45271b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45272c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(r8.n nVar, ym0.a aVar, ym0.a aVar2) {
            super(2);
            this.f45270a = aVar;
            this.f45271b = nVar;
            this.f45272c = aVar2;
        }

        @Override // ym0.p
        public final nm0.y invoke(r8.m mVar, r8.n nVar) {
            r8.m GuidedPresentationTutorialNavHost = mVar;
            r8.n it = nVar;
            kotlin.jvm.internal.u.j(GuidedPresentationTutorialNavHost, "$this$GuidedPresentationTutorialNavHost");
            kotlin.jvm.internal.u.j(it, "it");
            r8.n nVar2 = this.f45271b;
            ym0.a<nm0.y> aVar = this.f45270a;
            androidx.navigation.compose.n.b(GuidedPresentationTutorialNavHost, "SleepQualityScore", null, null, null, null, null, null, new s1.a(true, -1554900736, new r1(nVar2, aVar)), 126);
            androidx.navigation.compose.n.b(GuidedPresentationTutorialNavHost, "SleepSubmetrics", null, null, null, null, null, null, new s1.a(true, 1027044087, new t1(nVar2, aVar)), 126);
            androidx.navigation.compose.n.b(GuidedPresentationTutorialNavHost, "SleepInsightsScreen", null, null, null, null, null, null, new s1.a(true, 190249144, new u1(aVar, this.f45272c)), 126);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SleepScore.kt */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r8.n f45274b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45275c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45276d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f45277e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(r8.n nVar, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, int i11) {
            super(2);
            this.f45274b = nVar;
            this.f45275c = aVar;
            this.f45276d = aVar2;
            this.f45277e = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f45277e | 1);
            ym0.a<nm0.y> aVar2 = this.f45275c;
            ym0.a<nm0.y> aVar3 = this.f45276d;
            v1.this.a(this.f45274b, aVar2, aVar3, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    public final void a(r8.n navController, ym0.a<nm0.y> onBack, ym0.a<nm0.y> onDone, androidx.compose.runtime.a aVar, int i11) {
        kotlin.jvm.internal.u.j(navController, "navController");
        kotlin.jvm.internal.u.j(onBack, "onBack");
        kotlin.jvm.internal.u.j(onDone, "onDone");
        androidx.compose.runtime.b g11 = aVar.g(-765733768);
        b70.t0.b(navController, "SleepQualityScore", new a(navController, onBack, onDone), g11, 56);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new b(navController, onBack, onDone, i11));
        }
    }
}
