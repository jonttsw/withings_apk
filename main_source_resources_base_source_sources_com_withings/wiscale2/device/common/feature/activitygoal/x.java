package com.withings.wiscale2.device.common.feature.activitygoal;

import com.withings.features.platform.model.PlatformFeature;
import com.withings.features.platform.model.PlatformFeatureRepository;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: SetFitnessAndStepsGoalActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.activitygoal.SetFitnessAndStepsGoalActivity$setFeatureFlowSeen$1", f = "SetFitnessAndStepsGoalActivity.kt", l = {73}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class x extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f50968a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SetFitnessAndStepsGoalActivity f50969b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(SetFitnessAndStepsGoalActivity setFitnessAndStepsGoalActivity, qm0.d<? super x> dVar) {
        super(2, dVar);
        this.f50969b = setFitnessAndStepsGoalActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new x(this.f50969b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((x) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f50968a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            SetFitnessAndStepsGoalActivity setFitnessAndStepsGoalActivity = this.f50969b;
            PlatformFeatureRepository platformFeatureRepository = setFitnessAndStepsGoalActivity.f50903j;
            if (platformFeatureRepository != null) {
                List<PlatformFeature> X = kotlin.collections.x.X(platformFeatureRepository.getFeature(20));
                com.withings.wiscale2.device.common.feature.u uVar = setFitnessAndStepsGoalActivity.f50904k;
                if (uVar != null) {
                    com.withings.wiscale2.device.common.feature.t a11 = uVar.a(SetFitnessAndStepsGoalActivity.z3(setFitnessAndStepsGoalActivity), X, null);
                    this.f50968a = 1;
                    if (a11.e(20, true, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    kotlin.jvm.internal.u.s("platformFeatureActivationFactory");
                    throw null;
                }
            } else {
                kotlin.jvm.internal.u.s("featureRepository");
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}
