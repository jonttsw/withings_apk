package com.withings.wiscale2.activity.workout.ui.performance.splits;

import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: WorkoutSplitsActivity.kt */
/* loaded from: classes4.dex */
final class o extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WorkoutSplitsActivity f50030a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ok.a f50031b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(WorkoutSplitsActivity workoutSplitsActivity, ok.a aVar) {
        super(2);
        this.f50030a = workoutSplitsActivity;
        this.f50031b = aVar;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            WorkoutSplitsActivity.A3(this.f50030a, this.f50031b, aVar2, 72);
        }
        return y.f85009a;
    }
}
