package com.withings.wiscale2.measure.accountmeasure.ui.add;

import com.withings.wiscale2.measure.accountmeasure.ui.add.AddMeasureActivity;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class c0 extends kotlin.jvm.internal.w implements ym0.a<Integer> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AddMeasureActivity.d f58148a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(AddMeasureActivity.d dVar) {
        super(0);
        this.f58148a = dVar;
    }

    @Override // ym0.a
    public final Integer invoke() {
        return Integer.valueOf(com.withings.wiscale2.device.hwa08.postinstall.b0.D(this.f58148a.f58112b, "EXTRA_MEASURE_TYPE"));
    }
}
