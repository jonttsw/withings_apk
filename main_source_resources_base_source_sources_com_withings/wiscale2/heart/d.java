package com.withings.wiscale2.heart;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.viewpager.widget.ViewPager;
import com.withings.periodsbar.Period;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import com.withings.wiscale2.heart.HeartDetailActivity;
/* compiled from: HeartDetailActivity.java */
/* loaded from: classes5.dex */
final class d extends ViewPager.j {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HeartDetailActivity f57463a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(HeartDetailActivity heartDetailActivity) {
        this.f57463a = heartDetailActivity;
    }

    @Override // androidx.viewpager.widget.ViewPager.j, androidx.viewpager.widget.ViewPager.h
    public final void onPageScrolled(int i11, float f11, int i12) {
        View currentFocus = this.f57463a.getCurrentFocus();
        if (currentFocus != null) {
            ((InputMethodManager) currentFocus.getContext().getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.h
    public final void onPageSelected(int i11) {
        HeartDetailActivity.c cVar;
        Period period = Period.f43720e;
        HeartDetailActivity heartDetailActivity = this.f57463a;
        cVar = heartDetailActivity.f57011l;
        b0.V(heartDetailActivity, period, cVar.getDate(i11));
    }
}
