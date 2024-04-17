package com.withings.wiscale2.activity.workout.live.ui;

import com.withings.workout.category.model.WorkoutCategory;
/* compiled from: LiveWorkoutPagerFragment.kt */
/* loaded from: classes4.dex */
final class l0 extends kotlin.jvm.internal.w implements ym0.l<WorkoutCategory, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k0 f48908a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(k0 k0Var) {
        super(1);
        this.f48908a = k0Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(WorkoutCategory workoutCategory) {
        WorkoutCategory workoutCategory2 = workoutCategory;
        if (workoutCategory2 != null) {
            k0.t1(this.f48908a, workoutCategory2);
        }
        return nm0.y.f85009a;
    }
}
