package com.withings.tutorials.ui;

import com.withings.device.Device;
import com.withings.tutorials.core.FeatureTutorial;
import com.withings.user.User;
import k1.r0;
import kotlin.collections.s0;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: TutorialActivity.kt */
/* loaded from: classes4.dex */
final class b0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TutorialActivity f44709a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ FeatureTutorial f44710b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r8.n f44711c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(TutorialActivity tutorialActivity, FeatureTutorial featureTutorial, r8.n nVar) {
        super(2);
        this.f44709a = tutorialActivity;
        this.f44710b = featureTutorial;
        this.f44711c = nVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            TutorialActivity tutorialActivity = this.f44709a;
            e.j.a(0, 1, aVar2, new w(tutorialActivity), false);
            TutorialViewModel C3 = TutorialActivity.C3(tutorialActivity);
            Device z32 = TutorialActivity.z3(tutorialActivity);
            FeatureTutorial featureTutorial = this.f44710b;
            C3.i0(o60.e.a(featureTutorial), z32);
            r0 a11 = h6.b.a(FlowKt.flowOn(FlowKt.flow(new i0(TutorialActivity.C3(tutorialActivity), TutorialActivity.B3(tutorialActivity), null)), Dispatchers.getIO()), null, aVar2, 56);
            int i11 = v70.a.f103433b;
            v70.a.b(featureTutorial.name(), "device_tutorial", s0.i(new nm0.j("device_model", Integer.valueOf(TutorialActivity.z3(tutorialActivity).getModelId()))));
            Device z33 = TutorialActivity.z3(tutorialActivity);
            User user = (User) a11.getValue();
            ch.d dVar = tutorialActivity.f44684j;
            if (dVar != null) {
                boolean A3 = TutorialActivity.A3(tutorialActivity);
                x xVar = new x(tutorialActivity);
                y yVar = new y(tutorialActivity);
                z zVar = new z(tutorialActivity, featureTutorial);
                a0 a0Var = new a0(tutorialActivity);
                h70.a.a(this.f44710b, dVar, z33, user, A3, this.f44711c, xVar, yVar, zVar, a0Var, aVar2, 266816);
            } else {
                kotlin.jvm.internal.u.s("intentBuilder");
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}
