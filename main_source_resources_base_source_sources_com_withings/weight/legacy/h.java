package com.withings.weight.legacy;

import androidx.viewpager.widget.ViewPager;
import com.withings.periodsbar.Period;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
/* compiled from: WeightDetailActivity.kt */
/* loaded from: classes4.dex */
public final class h extends ViewPager.j {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WeightDetailActivity f47052a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(WeightDetailActivity weightDetailActivity) {
        this.f47052a = weightDetailActivity;
    }

    @Override // androidx.viewpager.widget.ViewPager.h
    public final void onPageSelected(int i11) {
        e90.a E3;
        d dVar;
        WeightDetailActivity weightDetailActivity = this.f47052a;
        E3 = weightDetailActivity.E3();
        androidx.viewpager.widget.e adapter = E3.f64951a.getAdapter();
        if (adapter instanceof d) {
            dVar = (d) adapter;
        } else {
            dVar = null;
        }
        if (dVar != null) {
            b0.V(weightDetailActivity, Period.f43720e, dVar.getDate(i11));
        }
    }
}
