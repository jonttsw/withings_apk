package com.withings.wiscale2.device.common.feature.highlowhr;

import com.withings.views.view.ToggleCellView;
/* compiled from: HighLowHRSettingsActivity.kt */
/* loaded from: classes5.dex */
final class y extends kotlin.jvm.internal.w implements ym0.p<ToggleCellView, Boolean, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HighLowHRSettingsActivity f52316a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(HighLowHRSettingsActivity highLowHRSettingsActivity) {
        super(2);
        this.f52316a = highLowHRSettingsActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(ToggleCellView toggleCellView, Boolean bool) {
        a L3;
        boolean booleanValue = bool.booleanValue();
        kotlin.jvm.internal.u.j(toggleCellView, "<anonymous parameter 0>");
        L3 = this.f52316a.L3();
        L3.y0(booleanValue);
        return nm0.y.f85009a;
    }
}
