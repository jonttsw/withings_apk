package com.withings.wiscale2.activity.workout.ui.performance.splits;

import java.util.List;
import kotlin.jvm.internal.w;
import nm0.y;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WorkoutSplitsActivity.kt */
/* loaded from: classes4.dex */
public final class n extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WorkoutSplitsActivity f50027a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ nm0.j<List<b>, Integer> f50028b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f50029c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n(WorkoutSplitsActivity workoutSplitsActivity, nm0.j<? extends List<b>, Integer> jVar, int i11) {
        super(2);
        this.f50027a = workoutSplitsActivity;
        this.f50028b = jVar;
        this.f50029c = i11;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f50029c | 1);
        WorkoutSplitsActivity.D3(this.f50027a, this.f50028b, aVar, g11);
        return y.f85009a;
    }
}
