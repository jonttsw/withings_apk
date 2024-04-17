package com.withings.environment.ui;

import androidx.viewpager.widget.ViewPager;
/* compiled from: Wsd01EnvironmentActivity.java */
/* loaded from: classes3.dex */
final class e extends ViewPager.j {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Wsd01EnvironmentActivity f39007a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Wsd01EnvironmentActivity wsd01EnvironmentActivity) {
        this.f39007a = wsd01EnvironmentActivity;
    }

    @Override // androidx.viewpager.widget.ViewPager.h
    public final void onPageSelected(int i11) {
        Wsd01EnvironmentActivity.B3(this.f39007a, i11);
    }
}
