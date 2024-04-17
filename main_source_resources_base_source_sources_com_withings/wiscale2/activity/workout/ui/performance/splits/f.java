package com.withings.wiscale2.activity.workout.ui.performance.splits;

import kotlin.jvm.internal.w;
import nm0.y;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WorkoutSplitsActivity.kt */
/* loaded from: classes4.dex */
public final class f extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WorkoutSplitsActivity f50002a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ok.c f50003b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f50004c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(WorkoutSplitsActivity workoutSplitsActivity, ok.c cVar, int i11) {
        super(2);
        this.f50002a = workoutSplitsActivity;
        this.f50003b = cVar;
        this.f50004c = i11;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f50004c | 1);
        WorkoutSplitsActivity.A3(this.f50002a, this.f50003b, aVar, g11);
        return y.f85009a;
    }
}
