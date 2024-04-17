package com.withings.wiscale2.activity.workout.category.ui;

import com.withings.workout.category.model.WorkoutCategory;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: ChooseWorkoutCategoryActivity.kt */
/* loaded from: classes4.dex */
final class k extends w implements ym0.l<WorkoutCategory, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ChooseWorkoutCategoryActivity f48702a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ChooseWorkoutCategoryActivity chooseWorkoutCategoryActivity) {
        super(1);
        this.f48702a = chooseWorkoutCategoryActivity;
    }

    @Override // ym0.l
    public final y invoke(WorkoutCategory workoutCategory) {
        WorkoutCategory category = workoutCategory;
        u.j(category, "category");
        ChooseWorkoutCategoryActivity.B3(this.f48702a, category);
        return y.f85009a;
    }
}
