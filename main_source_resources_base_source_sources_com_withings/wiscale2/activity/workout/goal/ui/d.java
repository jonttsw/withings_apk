package com.withings.wiscale2.activity.workout.goal.ui;

import com.withings.views.view.SetValueView;
import kotlin.jvm.internal.u;
import tb0.e4;
/* compiled from: WorkoutGoalActivity.kt */
/* loaded from: classes4.dex */
public final class d implements SetValueView.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WorkoutGoalActivity f48728a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(WorkoutGoalActivity workoutGoalActivity) {
        this.f48728a = workoutGoalActivity;
    }

    @Override // com.withings.views.view.SetValueView.a
    public final void E2(float f11) {
        int b10 = an0.a.b(f11 / 1);
        WorkoutGoalActivity workoutGoalActivity = this.f48728a;
        e4 G3 = WorkoutGoalActivity.G3(workoutGoalActivity);
        u.i(G3, "access$getValueBinding(...)");
        workoutGoalActivity.M3(G3, b10);
    }

    @Override // com.withings.views.view.SetValueView.a
    public final void u() {
    }
}
