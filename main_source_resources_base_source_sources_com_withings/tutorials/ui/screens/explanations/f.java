package com.withings.tutorials.ui.screens.explanations;
/* compiled from: BreathingDisturbance.kt */
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f45128a = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BreathingDisturbance.kt */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.p<r8.m, r8.n, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45129a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r8.n f45130b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45131c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(r8.n nVar, ym0.a aVar, ym0.a aVar2) {
            super(2);
            this.f45129a = aVar;
            this.f45130b = nVar;
            this.f45131c = aVar2;
        }

        @Override // ym0.p
        public final nm0.y invoke(r8.m mVar, r8.n nVar) {
            r8.m GuidedPresentationTutorialNavHost = mVar;
            r8.n it = nVar;
            kotlin.jvm.internal.u.j(GuidedPresentationTutorialNavHost, "$this$GuidedPresentationTutorialNavHost");
            kotlin.jvm.internal.u.j(it, "it");
            r8.n nVar2 = this.f45130b;
            ym0.a<nm0.y> aVar = this.f45129a;
            androidx.navigation.compose.n.b(GuidedPresentationTutorialNavHost, "BreathingDisturbancesIntroduction", null, null, null, null, null, null, new s1.a(true, -438838112, new com.withings.tutorials.ui.screens.explanations.b(nVar2, aVar)), 126);
            androidx.navigation.compose.n.b(GuidedPresentationTutorialNavHost, "BreathingDisturbancesOccurrences", null, null, null, null, null, null, new s1.a(true, -265579241, new d(nVar2, aVar)), 126);
            androidx.navigation.compose.n.b(GuidedPresentationTutorialNavHost, "LifestyleImpact", null, null, null, null, null, null, new s1.a(true, 1873260632, new e(aVar, this.f45131c)), 126);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BreathingDisturbance.kt */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r8.n f45133b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45134c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45135d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f45136e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(r8.n nVar, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, int i11) {
            super(2);
            this.f45133b = nVar;
            this.f45134c = aVar;
            this.f45135d = aVar2;
            this.f45136e = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f45136e | 1);
            ym0.a<nm0.y> aVar2 = this.f45134c;
            ym0.a<nm0.y> aVar3 = this.f45135d;
            f.this.a(this.f45133b, aVar2, aVar3, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    public final void a(r8.n navController, ym0.a<nm0.y> onBack, ym0.a<nm0.y> onDone, androidx.compose.runtime.a aVar, int i11) {
        kotlin.jvm.internal.u.j(navController, "navController");
        kotlin.jvm.internal.u.j(onBack, "onBack");
        kotlin.jvm.internal.u.j(onDone, "onDone");
        androidx.compose.runtime.b g11 = aVar.g(-647418856);
        b70.t0.b(navController, "BreathingDisturbancesIntroduction", new a(navController, onBack, onDone), g11, 56);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new b(navController, onBack, onDone, i11));
        }
    }
}
