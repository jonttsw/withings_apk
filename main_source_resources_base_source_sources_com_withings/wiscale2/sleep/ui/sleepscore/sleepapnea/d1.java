package com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea;

import androidx.viewpager.widget.ViewPager;
/* compiled from: SleepDisorderGraphPagerFragment.kt */
/* loaded from: classes5.dex */
public final class d1 implements ViewPager.h {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ w0 f61292a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d1(w0 w0Var) {
        this.f61292a = w0Var;
    }

    @Override // androidx.viewpager.widget.ViewPager.h
    public final void onPageSelected(int i11) {
        w0.x1(this.f61292a).B0(i11);
    }

    @Override // androidx.viewpager.widget.ViewPager.h
    public final void onPageScrollStateChanged(int i11) {
    }

    @Override // androidx.viewpager.widget.ViewPager.h
    public final void onPageScrolled(int i11, float f11, int i12) {
    }
}
