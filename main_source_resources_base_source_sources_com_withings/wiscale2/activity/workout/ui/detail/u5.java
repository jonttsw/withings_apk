package com.withings.wiscale2.activity.workout.ui.detail;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.workout.category.model.WorkoutCategory;
import com.withings.workout.category.model.WorkoutCategoryManager;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* compiled from: WorkoutListActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.ui.detail.WorkoutListViewModel$category$1$1", f = "WorkoutListActivity.kt", l = {ConstantsWs.MEASURE_TYPE_WAIST}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class u5 extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<WorkoutCategory>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f49694a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f49695b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Integer f49696c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ v5 f49697d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(Integer num, v5 v5Var, qm0.d<? super u5> dVar) {
        super(2, dVar);
        this.f49696c = num;
        this.f49697d = v5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        u5 u5Var = new u5(this.f49696c, this.f49697d, dVar);
        u5Var.f49695b = obj;
        return u5Var;
    }

    @Override // ym0.p
    public final Object invoke(androidx.lifecycle.h0<WorkoutCategory> h0Var, qm0.d<? super nm0.y> dVar) {
        return ((u5) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        WorkoutCategory workoutCategory;
        WorkoutCategoryManager workoutCategoryManager;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f49694a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            androidx.lifecycle.h0 h0Var = (androidx.lifecycle.h0) this.f49695b;
            Integer num = this.f49696c;
            if (num != null) {
                int intValue = num.intValue();
                workoutCategoryManager = this.f49697d.f49743b;
                workoutCategory = workoutCategoryManager.getWorkoutCategory(intValue);
            } else {
                workoutCategory = null;
            }
            this.f49694a = 1;
            if (h0Var.emit(workoutCategory, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
