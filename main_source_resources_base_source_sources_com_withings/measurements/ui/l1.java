package com.withings.measurements.ui;

import com.withings.measurements.ui.HealthVerticalActivity;
/* compiled from: Activity.kt */
/* loaded from: classes4.dex */
public final class l1 extends kotlin.jvm.internal.w implements ym0.a<Integer> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HealthVerticalActivity.c f42074a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(HealthVerticalActivity.c cVar) {
        super(0);
        this.f42074a = cVar;
    }

    @Override // ym0.a
    public final Integer invoke() {
        return Integer.valueOf(com.withings.wiscale2.device.hwa08.postinstall.b0.D(this.f42074a.f41925b, "measurement_vertical"));
    }
}
