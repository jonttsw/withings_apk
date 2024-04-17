package com.withings.wiscale2.activity.workout.ui.map;

import com.withings.wiscale2.activity.workout.ui.map.WorkoutMapActivity;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import kotlin.jvm.internal.w;
/* compiled from: Activity.kt */
/* loaded from: classes4.dex */
public final class i extends w implements ym0.a<Long> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WorkoutMapActivity.i f49881a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(WorkoutMapActivity.i iVar) {
        super(0);
        this.f49881a = iVar;
    }

    @Override // ym0.a
    public final Long invoke() {
        return Long.valueOf(b0.E(this.f49881a.f49868b, "extra_track"));
    }
}
