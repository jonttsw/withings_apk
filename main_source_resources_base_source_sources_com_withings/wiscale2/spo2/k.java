package com.withings.wiscale2.spo2;

import com.withings.wiscale2.device.hwa08.postinstall.b0;
import com.withings.wiscale2.spo2.SpO2MeasuresListActivity;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.w implements ym0.a<Long> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SpO2MeasuresListActivity.g f61681a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(SpO2MeasuresListActivity.g gVar) {
        super(0);
        this.f61681a = gVar;
    }

    @Override // ym0.a
    public final Long invoke() {
        return Long.valueOf(b0.E(this.f61681a.f61614b, "extra_date_start"));
    }
}
