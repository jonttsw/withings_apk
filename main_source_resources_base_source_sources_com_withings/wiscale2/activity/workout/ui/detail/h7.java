package com.withings.wiscale2.activity.workout.ui.detail;

import android.graphics.Bitmap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WorkoutPreview.kt */
/* loaded from: classes4.dex */
public final class h7 extends kotlin.jvm.internal.w implements ym0.l<Bitmap, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WorkoutPreview f49227a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f49228b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7(WorkoutPreview workoutPreview, long j5) {
        super(1);
        this.f49227a = workoutPreview;
        this.f49228b = j5;
    }

    @Override // ym0.l
    public final nm0.y invoke(Bitmap bitmap) {
        Bitmap it = bitmap;
        kotlin.jvm.internal.u.j(it, "it");
        vh.h.h().b(new g7(this.f49227a, this.f49228b, it));
        return nm0.y.f85009a;
    }
}
