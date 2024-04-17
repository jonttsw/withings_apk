package com.withings.wiscale2.device.common.feature.activitygoal;

import com.withings.measure.android.data.FitnessLevel;
import com.withings.user.User;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: FitnessAndStepsGoalSettingsFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.activitygoal.ActivityGoalSettingsViewModel$selectFitnessLevel$1", f = "FitnessAndStepsGoalSettingsFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class c extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FitnessLevel f50921a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a f50922b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(FitnessLevel fitnessLevel, a aVar, qm0.d<? super c> dVar) {
        super(2, dVar);
        this.f50921a = fitnessLevel;
        this.f50922b = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new c(this.f50921a, this.f50922b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((c) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        fy.v vVar;
        User user;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        ky.d a11 = zx.a.a(this.f50921a);
        a aVar = this.f50922b;
        vVar = aVar.f50913c;
        user = aVar.f50911a;
        vVar.a(user.q(), a11, null);
        return nm0.y.f85009a;
    }
}
