package com.withings.wiscale2.measure.accountmeasure.ui.add;

import com.withings.wiscale2.measure.accountmeasure.ui.add.AddMeasureActivity;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class b0 extends kotlin.jvm.internal.w implements ym0.a<Long> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AddMeasureActivity.c f58128a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(AddMeasureActivity.c cVar) {
        super(0);
        this.f58128a = cVar;
    }

    @Override // ym0.a
    public final Long invoke() {
        return Long.valueOf(com.withings.wiscale2.device.hwa08.postinstall.b0.E(this.f58128a.f58110b, "EXTRA_USER"));
    }
}
