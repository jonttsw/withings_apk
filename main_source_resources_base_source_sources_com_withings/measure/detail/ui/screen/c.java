package com.withings.measure.detail.ui.screen;

import com.withings.periodsbar.Period;
import nm0.y;
/* compiled from: MeasureDetailActivity.kt */
/* loaded from: classes4.dex */
final class c extends kotlin.jvm.internal.w implements ym0.l<Period, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ MeasureDetailActivity f41760a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(MeasureDetailActivity measureDetailActivity) {
        super(1);
        this.f41760a = measureDetailActivity;
    }

    @Override // ym0.l
    public final y invoke(Period period) {
        Period it = period;
        kotlin.jvm.internal.u.j(it, "it");
        MeasureDetailActivity.G3(this.f41760a).z0(it);
        return y.f85009a;
    }
}
