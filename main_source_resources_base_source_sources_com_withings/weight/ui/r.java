package com.withings.weight.ui;

import com.withings.weight.ui.SegmentalBodyCompositionActivity;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
/* compiled from: Activity.kt */
/* loaded from: classes4.dex */
public final class r extends kotlin.jvm.internal.w implements ym0.a<Long> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SegmentalBodyCompositionActivity.c f47769a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(SegmentalBodyCompositionActivity.c cVar) {
        super(0);
        this.f47769a = cVar;
    }

    @Override // ym0.a
    public final Long invoke() {
        return Long.valueOf(b0.E(this.f47769a.f47600b, "measure_group_id"));
    }
}
