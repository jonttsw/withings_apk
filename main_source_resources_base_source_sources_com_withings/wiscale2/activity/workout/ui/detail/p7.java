package com.withings.wiscale2.activity.workout.ui.detail;

import com.withings.workout.category.model.WorkoutCategory;
import com.withings.workout.category.model.WorkoutCategoryManager;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowCollector;
/* compiled from: WorkoutPreviewViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.ui.detail.WorkoutPreviewViewModel$allWorkoutCategory$1", f = "WorkoutPreviewViewModel.kt", l = {76}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class p7 extends kotlin.coroutines.jvm.internal.i implements ym0.p<FlowCollector<? super List<WorkoutCategory>>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f49547a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f49548b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ WorkoutCategoryManager f49549c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7(WorkoutCategoryManager workoutCategoryManager, qm0.d<? super p7> dVar) {
        super(2, dVar);
        this.f49549c = workoutCategoryManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        p7 p7Var = new p7(this.f49549c, dVar);
        p7Var.f49548b = obj;
        return p7Var;
    }

    @Override // ym0.p
    public final Object invoke(FlowCollector<? super List<WorkoutCategory>> flowCollector, qm0.d<? super nm0.y> dVar) {
        return ((p7) create(flowCollector, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f49547a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            List<WorkoutCategory> workoutCategories = this.f49549c.getWorkoutCategories();
            this.f49547a = 1;
            if (((FlowCollector) this.f49548b).emit(workoutCategories, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
