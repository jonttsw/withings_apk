package com.withings.wiscale2.activity.workout.photo.ui;

import com.withings.wiscale2.activity.workout.photo.ui.WorkoutPhotosActivity;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import kotlin.jvm.internal.w;
/* compiled from: Activity.kt */
/* loaded from: classes4.dex */
public final class c extends w implements ym0.a<Integer> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WorkoutPhotosActivity.e f49010a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(WorkoutPhotosActivity.e eVar) {
        super(0);
        this.f49010a = eVar;
    }

    @Override // ym0.a
    public final Integer invoke() {
        return Integer.valueOf(b0.D(this.f49010a.f49007b, "extra_photo_index"));
    }
}
