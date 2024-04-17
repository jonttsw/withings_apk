package com.withings.ecg.details;

import androidx.viewpager.widget.ViewPager;
import com.withings.periodsbar.Period;
/* compiled from: EcgListActivity.kt */
/* loaded from: classes3.dex */
public final class p1 extends ViewPager.j {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgListActivity f38287a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p1(EcgListActivity ecgListActivity) {
        this.f38287a = ecgListActivity;
    }

    @Override // androidx.viewpager.widget.ViewPager.h
    public final void onPageSelected(int i11) {
        x0 x0Var;
        Period period = Period.f43720e;
        EcgListActivity ecgListActivity = this.f38287a;
        x0Var = ecgListActivity.f38017l;
        if (x0Var != null) {
            com.withings.wiscale2.device.hwa08.postinstall.b0.V(ecgListActivity, period, x0Var.getDate(i11));
        } else {
            kotlin.jvm.internal.u.s("pagerAdapter");
            throw null;
        }
    }
}
