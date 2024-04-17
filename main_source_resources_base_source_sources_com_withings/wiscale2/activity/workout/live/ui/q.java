package com.withings.wiscale2.activity.workout.live.ui;

import com.withings.liveworkout.model.LiveWorkout;
/* compiled from: LiveWorkoutActivity.kt */
/* loaded from: classes4.dex */
final class q extends kotlin.jvm.internal.w implements ym0.l<LiveWorkout, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LiveWorkoutActivity f48920a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(LiveWorkoutActivity liveWorkoutActivity) {
        super(1);
        this.f48920a = liveWorkoutActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(LiveWorkout liveWorkout) {
        LiveWorkout it = liveWorkout;
        kotlin.jvm.internal.u.j(it, "it");
        LiveWorkoutActivity.N3(this.f48920a, it);
        return nm0.y.f85009a;
    }
}
