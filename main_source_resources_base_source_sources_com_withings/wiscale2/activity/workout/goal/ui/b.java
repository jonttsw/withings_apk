package com.withings.wiscale2.activity.workout.goal.ui;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import nm0.j;
import nm0.l;
import nm0.y;
import ym0.p;
/* compiled from: WorkoutGoalActivity.kt */
@e(c = "com.withings.wiscale2.activity.workout.goal.ui.WorkoutGoalActivity$initViewModel$3", f = "WorkoutGoalActivity.kt", l = {ConstantsWs.MEASURE_TYPE_IGLUCOSE_BLOOD_GLUCOSE}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class b extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f48723a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ WorkoutGoalActivity f48724b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(WorkoutGoalActivity workoutGoalActivity, qm0.d<? super b> dVar) {
        super(2, dVar);
        this.f48724b = workoutGoalActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new b(this.f48724b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((b) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ma0.e eVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f48723a;
        WorkoutGoalActivity workoutGoalActivity = this.f48724b;
        if (i11 != 0) {
            if (i11 == 1) {
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            l.b(obj);
            eVar = workoutGoalActivity.f48713c;
            if (eVar != null) {
                Flow<j<String, Integer>> i02 = eVar.i0();
                this.f48723a = 1;
                obj = FlowKt.first(i02, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                u.s("viewModel");
                throw null;
            }
        }
        j jVar = (j) obj;
        String str = (String) jVar.a();
        int intValue = ((Number) jVar.b()).intValue();
        WorkoutGoalActivity.J3(workoutGoalActivity, intValue);
        WorkoutGoalActivity.B3(workoutGoalActivity, str);
        WorkoutGoalActivity.C3(workoutGoalActivity, str, intValue);
        return y.f85009a;
    }
}
