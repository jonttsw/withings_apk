package com.withings.wiscale2.vascularage;

import androidx.viewpager.widget.ViewPager;
import com.withings.periodsbar.Period;
import com.withings.wiscale2.vascularage.VascularAgeActivityV1;
/* compiled from: VascularAgeActivityV1.kt */
/* loaded from: classes5.dex */
public final class p extends ViewPager.j {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ VascularAgeActivityV1 f62433a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Period f62434b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ VascularAgeActivityV1.a f62435c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(VascularAgeActivityV1 vascularAgeActivityV1, Period period, VascularAgeActivityV1.a aVar) {
        this.f62433a = vascularAgeActivityV1;
        this.f62434b = period;
        this.f62435c = aVar;
    }

    @Override // androidx.viewpager.widget.ViewPager.h
    public final void onPageSelected(int i11) {
        com.withings.wiscale2.device.hwa08.postinstall.b0.V(this.f62433a, this.f62434b, this.f62435c.getDate(i11));
    }
}
