package com.withings.wiscale2.device.common.feature.workout;

import com.withings.features.platform.model.PlatformFeature;
import com.withings.wiscale2.device.common.feature.t;
import com.withings.wiscale2.device.common.feature.u;
import java.util.List;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WorkoutTutorialActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.workout.WorkoutTutorialActivity$setFeatureFlowSeen$1", f = "WorkoutTutorialActivity.kt", l = {102}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class d extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f52656a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ WorkoutTutorialActivity f52657b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(WorkoutTutorialActivity workoutTutorialActivity, qm0.d<? super d> dVar) {
        super(2, dVar);
        this.f52657b = workoutTutorialActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new d(this.f52657b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((d) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f52656a;
        if (i11 != 0) {
            if (i11 == 1) {
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            l.b(obj);
            WorkoutTutorialActivity workoutTutorialActivity = this.f52657b;
            List<PlatformFeature> X = x.X(WorkoutTutorialActivity.F3(workoutTutorialActivity).getFeature(21));
            u uVar = workoutTutorialActivity.f52647k;
            if (uVar != null) {
                t a11 = uVar.a(WorkoutTutorialActivity.E3(workoutTutorialActivity), X, null);
                this.f52656a = 1;
                if (a11.e(21, true, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                kotlin.jvm.internal.u.s("platformFeatureActivationFactory");
                throw null;
            }
        }
        return y.f85009a;
    }
}
