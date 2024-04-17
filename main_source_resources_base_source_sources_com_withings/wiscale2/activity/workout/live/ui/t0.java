package com.withings.wiscale2.activity.workout.live.ui;

import com.withings.workout.category.model.WorkoutCategory;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LiveWorkoutViewModel.kt */
/* loaded from: classes4.dex */
public final class t0 extends kotlin.jvm.internal.w implements ym0.l<WorkoutCategory, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ z0 f48932a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(z0 z0Var) {
        super(1);
        this.f48932a = z0Var;
    }

    @Override // ym0.l
    public final Boolean invoke(WorkoutCategory workoutCategory) {
        z0 z0Var;
        boolean s12;
        z0 z0Var2 = this.f48932a;
        if (z0.K0(z0Var2)) {
            z0Var = z0Var2;
        } else {
            z0Var = null;
        }
        if (z0Var != null) {
            s12 = z0Var2.s1();
            return Boolean.valueOf(s12);
        }
        return null;
    }
}
