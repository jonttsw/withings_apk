package com.withings.wiscale2.activity.workout.live.ui;

import com.withings.workout.category.model.WorkoutCategory;
/* compiled from: LiveWorkoutDistanceFragment.kt */
/* loaded from: classes4.dex */
final class c0 extends kotlin.jvm.internal.w implements ym0.l<WorkoutCategory, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d0 f48861a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(d0 d0Var) {
        super(1);
        this.f48861a = d0Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(WorkoutCategory workoutCategory) {
        WorkoutCategory workoutCategory2 = workoutCategory;
        if (workoutCategory2 != null) {
            d0.t1(this.f48861a, workoutCategory2);
        }
        return nm0.y.f85009a;
    }
}
