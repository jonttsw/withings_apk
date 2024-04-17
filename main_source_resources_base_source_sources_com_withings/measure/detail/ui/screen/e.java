package com.withings.measure.detail.ui.screen;

import com.withings.periodsbar.Period;
import nm0.y;
/* compiled from: MeasureDetailActivity.kt */
/* loaded from: classes4.dex */
final class e extends kotlin.jvm.internal.w implements ym0.l<Period, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ MeasureDetailActivity f41762a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(MeasureDetailActivity measureDetailActivity) {
        super(1);
        this.f41762a = measureDetailActivity;
    }

    @Override // ym0.l
    public final y invoke(Period period) {
        Period period2 = period;
        kotlin.jvm.internal.u.g(period2);
        MeasureDetailActivity.J3(this.f41762a, period2);
        return y.f85009a;
    }
}
