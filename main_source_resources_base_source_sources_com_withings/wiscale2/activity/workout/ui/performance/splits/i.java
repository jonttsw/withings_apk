package com.withings.wiscale2.activity.workout.ui.performance.splits;

import kotlin.jvm.internal.w;
import nm0.y;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WorkoutSplitsActivity.kt */
/* loaded from: classes4.dex */
public final class i extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WorkoutSplitsActivity f50014a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f50015b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ b f50016c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f50017d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ boolean f50018e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f50019f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(WorkoutSplitsActivity workoutSplitsActivity, int i11, b bVar, String str, boolean z5, int i12) {
        super(2);
        this.f50014a = workoutSplitsActivity;
        this.f50015b = i11;
        this.f50016c = bVar;
        this.f50017d = str;
        this.f50018e = z5;
        this.f50019f = i12;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f50019f | 1);
        String str = this.f50017d;
        boolean z5 = this.f50018e;
        WorkoutSplitsActivity.C3(this.f50014a, this.f50015b, this.f50016c, str, z5, aVar, g11);
        return y.f85009a;
    }
}
