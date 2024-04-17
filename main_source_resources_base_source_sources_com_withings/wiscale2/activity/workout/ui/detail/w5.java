package com.withings.wiscale2.activity.workout.ui.detail;

import com.withings.workout.category.model.WorkoutCategory;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* compiled from: WorkoutListActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.ui.detail.WorkoutListViewModel$workoutInfoList$1$1", f = "WorkoutListActivity.kt", l = {195}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class w5 extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<g5>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f49772a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f49773b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ v5 f49774c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ WorkoutCategory f49775d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5(v5 v5Var, WorkoutCategory workoutCategory, qm0.d<? super w5> dVar) {
        super(2, dVar);
        this.f49774c = v5Var;
        this.f49775d = workoutCategory;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        w5 w5Var = new w5(this.f49774c, this.f49775d, dVar);
        w5Var.f49773b = obj;
        return w5Var;
    }

    @Override // ym0.p
    public final Object invoke(androidx.lifecycle.h0<g5> h0Var, qm0.d<? super nm0.y> dVar) {
        return ((w5) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f49772a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            g5 g02 = v5.g0(this.f49774c, this.f49775d);
            this.f49772a = 1;
            if (((androidx.lifecycle.h0) this.f49773b).emit(g02, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
