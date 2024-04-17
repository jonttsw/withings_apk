package com.withings.wiscale2.activity.workout.ui.performance.splits;

import com.withings.wiscale2.activity.workout.ui.performance.splits.WorkoutSplitsActivity;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import kotlin.jvm.internal.w;
/* compiled from: Activity.kt */
/* loaded from: classes4.dex */
public final class s extends w implements ym0.a<Long> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WorkoutSplitsActivity.d f50038a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(WorkoutSplitsActivity.d dVar) {
        super(0);
        this.f50038a = dVar;
    }

    @Override // ym0.a
    public final Long invoke() {
        return Long.valueOf(b0.E(this.f50038a.f49970b, "extra_workout_id"));
    }
}
