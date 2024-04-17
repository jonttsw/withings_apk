package com.withings.measure.detail.ui.screen;

import androidx.viewpager.widget.ViewPager;
import com.withings.periodsbar.Period;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import org.joda.time.DateTime;
import qy.g0;
/* compiled from: MeasureDetailActivity.kt */
/* loaded from: classes4.dex */
public final class i extends ViewPager.j {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ MeasureDetailActivity f41766a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(MeasureDetailActivity measureDetailActivity) {
        this.f41766a = measureDetailActivity;
    }

    @Override // androidx.viewpager.widget.ViewPager.h
    public final void onPageSelected(int i11) {
        oy.b L3;
        DateTime date;
        MeasureDetailActivity measureDetailActivity = this.f41766a;
        L3 = measureDetailActivity.L3();
        androidx.viewpager.widget.e adapter = L3.f90078d.getAdapter();
        if (adapter instanceof qy.v) {
            DateTime date2 = ((qy.v) adapter).getDate(i11);
            kotlin.jvm.internal.u.i(date2, "getDate(...)");
            b0.V(measureDetailActivity.M3(), (Period) MeasureDetailActivity.E3(measureDetailActivity).getValue(), date2);
        } else if (adapter instanceof ry.o) {
            b0.V(measureDetailActivity.M3(), (Period) MeasureDetailActivity.E3(measureDetailActivity).getValue(), ((ry.o) adapter).a(i11));
        } else if ((adapter instanceof g0) && (date = ((g0) adapter).getDate(i11)) != null) {
            b0.V(measureDetailActivity.M3(), (Period) MeasureDetailActivity.E3(measureDetailActivity).getValue(), date);
        }
    }
}
