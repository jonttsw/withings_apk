package com.withings.ecg.heartsound;

import androidx.viewpager.widget.ViewPager;
import com.withings.periodsbar.Period;
/* compiled from: HeartSoundListActivity.kt */
/* loaded from: classes3.dex */
public final class m0 extends ViewPager.j {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HeartSoundListActivity f38489a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m0(HeartSoundListActivity heartSoundListActivity) {
        this.f38489a = heartSoundListActivity;
    }

    @Override // androidx.viewpager.widget.ViewPager.h
    public final void onPageSelected(int i11) {
        b0 b0Var;
        Period period = Period.f43720e;
        HeartSoundListActivity heartSoundListActivity = this.f38489a;
        b0Var = heartSoundListActivity.f38408i;
        if (b0Var != null) {
            com.withings.wiscale2.device.hwa08.postinstall.b0.V(heartSoundListActivity, period, b0Var.getDate(i11));
        } else {
            kotlin.jvm.internal.u.s("pagerAdapter");
            throw null;
        }
    }
}
