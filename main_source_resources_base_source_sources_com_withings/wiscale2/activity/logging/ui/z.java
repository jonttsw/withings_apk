package com.withings.wiscale2.activity.logging.ui;

import com.withings.workout.category.model.WorkoutCategory;
/* compiled from: EditWorkoutActivity.kt */
/* loaded from: classes4.dex */
final class z extends kotlin.jvm.internal.w implements ym0.l<WorkoutCategory, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EditWorkoutActivity f48466a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(EditWorkoutActivity editWorkoutActivity) {
        super(1);
        this.f48466a = editWorkoutActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(WorkoutCategory workoutCategory) {
        WorkoutCategory workoutCategory2 = workoutCategory;
        kotlin.jvm.internal.u.j(workoutCategory2, "workoutCategory");
        EditWorkoutActivity editWorkoutActivity = this.f48466a;
        EditWorkoutActivity.r4(editWorkoutActivity).setImageResource(workoutCategory2.getGlyphRes());
        EditWorkoutActivity.t4(editWorkoutActivity).setText(workoutCategory2.getName(editWorkoutActivity));
        return nm0.y.f85009a;
    }
}
