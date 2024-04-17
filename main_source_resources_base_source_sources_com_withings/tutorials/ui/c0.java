package com.withings.tutorials.ui;

import com.withings.tutorials.core.FeatureTutorial;
/* compiled from: TutorialActivity.kt */
/* loaded from: classes4.dex */
final class c0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TutorialActivity f44715a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ FeatureTutorial f44716b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(TutorialActivity tutorialActivity, FeatureTutorial featureTutorial) {
        super(2);
        this.f44715a = tutorialActivity;
        this.f44716b = featureTutorial;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            r8.n c11 = androidx.navigation.compose.r.c(new androidx.navigation.c0[0], aVar2);
            int i11 = e.m.f64583b;
            TutorialActivity tutorialActivity = this.f44715a;
            androidx.compose.runtime.j.a(e.m.b(tutorialActivity), s1.b.b(aVar2, -1606739407, new b0(tutorialActivity, this.f44716b, c11)), aVar2, 56);
        }
        return nm0.y.f85009a;
    }
}
