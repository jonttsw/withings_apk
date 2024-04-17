package com.withings.wiscale2.activity.workout.live.ui;

import com.withings.workout.category.model.WorkoutCategory;
/* compiled from: LiveWorkoutEmptyFragment.kt */
/* loaded from: classes4.dex */
final class e0 extends kotlin.jvm.internal.w implements ym0.l<WorkoutCategory, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ f0 f48881a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(f0 f0Var) {
        super(1);
        this.f48881a = f0Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(WorkoutCategory workoutCategory) {
        WorkoutCategory workoutCategory2 = workoutCategory;
        if (workoutCategory2 != null) {
            f0.s1(this.f48881a, workoutCategory2);
        }
        return nm0.y.f85009a;
    }
}
