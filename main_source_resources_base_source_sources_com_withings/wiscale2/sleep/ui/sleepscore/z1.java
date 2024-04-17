package com.withings.wiscale2.sleep.ui.sleepscore;

import androidx.viewpager.widget.ViewPager;
/* compiled from: SleepDisorderDayPagerFragment.kt */
/* loaded from: classes5.dex */
public final class z1 extends ViewPager.j {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ t1 f61584a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z1(t1 t1Var) {
        this.f61584a = t1Var;
    }

    @Override // androidx.viewpager.widget.ViewPager.h
    public final void onPageSelected(int i11) {
        t1.x1(this.f61584a).B0(i11);
    }
}
