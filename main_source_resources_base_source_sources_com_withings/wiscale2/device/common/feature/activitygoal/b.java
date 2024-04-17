package com.withings.wiscale2.device.common.feature.activitygoal;

import com.withings.target.data.TargetRepository;
import com.withings.user.User;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: FitnessAndStepsGoalSettingsFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.activitygoal.ActivityGoalSettingsViewModel$selectDailyStepsGoal$1", f = "FitnessAndStepsGoalSettingsFragment.kt", l = {205}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f50918a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a f50919b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f50920c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, int i11, qm0.d<? super b> dVar) {
        super(2, dVar);
        this.f50919b = aVar;
        this.f50920c = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new b(this.f50919b, this.f50920c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((b) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        TargetRepository targetRepository;
        User user;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f50918a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            a aVar = this.f50919b;
            targetRepository = aVar.f50912b;
            user = aVar.f50911a;
            long q11 = user.q();
            this.f50918a = 1;
            if (targetRepository.saveStepTarget(q11, this.f50920c, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
