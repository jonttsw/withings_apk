package com.withings.weight.legacy;

import com.withings.weight.legacy.WeightDetailActivity;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
/* compiled from: Activity.kt */
/* loaded from: classes4.dex */
public final class j extends kotlin.jvm.internal.w implements ym0.a<Integer> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WeightDetailActivity.e f47053a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(WeightDetailActivity.e eVar) {
        super(0);
        this.f47053a = eVar;
    }

    @Override // ym0.a
    public final Integer invoke() {
        return Integer.valueOf(b0.D(this.f47053a.f47020b, "EXTRA_MEASURE_FILTER"));
    }
}
