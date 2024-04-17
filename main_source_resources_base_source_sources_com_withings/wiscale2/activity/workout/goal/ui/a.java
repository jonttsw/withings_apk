package com.withings.wiscale2.activity.workout.goal.ui;

import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
/* compiled from: WorkoutGoalActivity.kt */
/* loaded from: classes4.dex */
final class a extends w implements l<Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WorkoutGoalActivity f48722a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(WorkoutGoalActivity workoutGoalActivity) {
        super(1);
        this.f48722a = workoutGoalActivity;
    }

    @Override // ym0.l
    public final y invoke(Integer num) {
        Integer num2 = num;
        u.g(num2);
        WorkoutGoalActivity.I3(this.f48722a, num2.intValue());
        return y.f85009a;
    }
}
