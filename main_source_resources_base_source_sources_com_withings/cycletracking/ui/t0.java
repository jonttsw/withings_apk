package com.withings.cycletracking.ui;

import com.withings.cycletracking.ui.CycleTrackingActivity;
/* compiled from: Activity.kt */
/* loaded from: classes3.dex */
public final class t0 extends kotlin.jvm.internal.w implements ym0.a<Integer> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CycleTrackingActivity.c f35750a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(CycleTrackingActivity.c cVar) {
        super(0);
        this.f35750a = cVar;
    }

    @Override // ym0.a
    public final Integer invoke() {
        return Integer.valueOf(com.withings.wiscale2.device.hwa08.postinstall.b0.D(this.f35750a.f35481b, "period"));
    }
}
