package com.withings.wiscale2.activity.workout.ui.detail;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.track.data.Track;
import com.withings.workout.category.model.WorkoutCategory;
import com.withings.workout.category.model.WorkoutCategoryManager;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* compiled from: WorkoutDetailViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.ui.detail.WorkoutDetailViewModel$createCategoryLiveData$2$1$1", f = "WorkoutDetailViewModel.kt", l = {ConstantsWs.WS_STATUS_TOOMANYMEMBERS}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class k3 extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<WorkoutCategory>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f49361a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f49362b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ WorkoutCategoryManager f49363c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Track f49364d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(WorkoutCategoryManager workoutCategoryManager, Track track, qm0.d<? super k3> dVar) {
        super(2, dVar);
        this.f49363c = workoutCategoryManager;
        this.f49364d = track;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        k3 k3Var = new k3(this.f49363c, this.f49364d, dVar);
        k3Var.f49362b = obj;
        return k3Var;
    }

    @Override // ym0.p
    public final Object invoke(androidx.lifecycle.h0<WorkoutCategory> h0Var, qm0.d<? super nm0.y> dVar) {
        return ((k3) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f49361a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            WorkoutCategory workoutCategory = this.f49363c.getWorkoutCategory(this.f49364d.getCategory());
            kotlin.jvm.internal.u.i(workoutCategory, "getWorkoutCategory(...)");
            this.f49361a = 1;
            if (((androidx.lifecycle.h0) this.f49362b).emit(workoutCategory, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
