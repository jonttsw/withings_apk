package com.withings.wiscale2.activity.workout.ui.performance.splits;

import kotlin.jvm.internal.w;
import nm0.y;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WorkoutSplitsActivity.kt */
/* loaded from: classes4.dex */
public final class g extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WorkoutSplitsActivity f50005a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f50006b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Integer f50007c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ double f50008d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f50009e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(WorkoutSplitsActivity workoutSplitsActivity, androidx.compose.ui.e eVar, Integer num, double d11, int i11) {
        super(2);
        this.f50005a = workoutSplitsActivity;
        this.f50006b = eVar;
        this.f50007c = num;
        this.f50008d = d11;
        this.f50009e = i11;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f50009e | 1);
        Integer num2 = this.f50007c;
        double d11 = this.f50008d;
        WorkoutSplitsActivity.B3(this.f50005a, this.f50006b, num2, d11, aVar, g11);
        return y.f85009a;
    }
}
