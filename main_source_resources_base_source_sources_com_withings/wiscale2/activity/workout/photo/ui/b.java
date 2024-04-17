package com.withings.wiscale2.activity.workout.photo.ui;

import com.withings.wiscale2.activity.workout.photo.ui.WorkoutPhotosActivity;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import kotlin.jvm.internal.w;
/* compiled from: Activity.kt */
/* loaded from: classes4.dex */
public final class b extends w implements ym0.a<Long> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WorkoutPhotosActivity.d f49009a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(WorkoutPhotosActivity.d dVar) {
        super(0);
        this.f49009a = dVar;
    }

    @Override // ym0.a
    public final Long invoke() {
        return Long.valueOf(b0.E(this.f49009a.f49005b, "workoutId"));
    }
}
