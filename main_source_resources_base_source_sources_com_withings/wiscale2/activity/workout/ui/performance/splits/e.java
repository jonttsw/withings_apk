package com.withings.wiscale2.activity.workout.ui.performance.splits;

import kotlin.jvm.internal.w;
import nm0.y;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WorkoutSplitsActivity.kt */
/* loaded from: classes4.dex */
public final class e extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WorkoutSplitsActivity f50001a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(WorkoutSplitsActivity workoutSplitsActivity) {
        super(0);
        this.f50001a = workoutSplitsActivity;
    }

    @Override // ym0.a
    public final y invoke() {
        this.f50001a.finish();
        return y.f85009a;
    }
}
