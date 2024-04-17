package com.withings.tutorials.ui;

import com.withings.device.Device;
import com.withings.tutorials.core.FeatureTutorial;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
/* compiled from: TutorialActivity.kt */
/* loaded from: classes4.dex */
final class z extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TutorialActivity f46318a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ FeatureTutorial f46319b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(TutorialActivity tutorialActivity, FeatureTutorial featureTutorial) {
        super(0);
        this.f46318a = tutorialActivity;
        this.f46319b = featureTutorial;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        TutorialActivity tutorialActivity = this.f46318a;
        TutorialViewModel C3 = TutorialActivity.C3(tutorialActivity);
        Device device = TutorialActivity.z3(tutorialActivity);
        long B3 = TutorialActivity.B3(tutorialActivity);
        int a11 = o60.e.a(this.f46319b);
        kotlin.jvm.internal.u.j(device, "device");
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new h0(C3, B3, device, a11, null), 2, null);
        return nm0.y.f85009a;
    }
}
