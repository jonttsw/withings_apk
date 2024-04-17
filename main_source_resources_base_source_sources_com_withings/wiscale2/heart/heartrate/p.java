package com.withings.wiscale2.heart.heartrate;

import androidx.viewpager.widget.ViewPager;
import com.withings.periodsbar.Period;
import org.joda.time.DateTime;
/* compiled from: HeartRateDayActivity.kt */
/* loaded from: classes5.dex */
public final class p extends ViewPager.j {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HeartRateDayActivity f57712a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(HeartRateDayActivity heartRateDayActivity) {
        this.f57712a = heartRateDayActivity;
    }

    @Override // androidx.viewpager.widget.ViewPager.h
    public final void onPageSelected(int i11) {
        v vVar;
        HeartRateDayActivity heartRateDayActivity = this.f57712a;
        heartRateDayActivity.f57502g = i11;
        Period period = Period.f43721f;
        vVar = heartRateDayActivity.f57503h;
        if (vVar != null) {
            DateTime date = vVar.getDate(i11);
            kotlin.jvm.internal.u.i(date, "getDate(...)");
            com.withings.wiscale2.device.hwa08.postinstall.b0.V(heartRateDayActivity, period, date);
            return;
        }
        kotlin.jvm.internal.u.s("dayPagerAdapter");
        throw null;
    }
}
