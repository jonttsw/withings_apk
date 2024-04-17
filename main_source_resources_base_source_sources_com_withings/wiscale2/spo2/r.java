package com.withings.wiscale2.spo2;

import androidx.viewpager.widget.ViewPager;
import com.withings.periodsbar.Period;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import com.withings.wiscale2.spo2.Spo2Activity;
import org.joda.time.DateTime;
import tb0.s0;
/* compiled from: Spo2Activity.kt */
/* loaded from: classes5.dex */
public final class r extends ViewPager.j {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Spo2Activity f61689a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(Spo2Activity spo2Activity) {
        this.f61689a = spo2Activity;
    }

    @Override // androidx.viewpager.widget.ViewPager.h
    public final void onPageSelected(int i11) {
        s0 G3;
        Spo2Activity spo2Activity = this.f61689a;
        G3 = spo2Activity.G3();
        androidx.viewpager.widget.e adapter = G3.f99459a.getAdapter();
        if (adapter instanceof Spo2Activity.b) {
            DateTime date = ((Spo2Activity.b) adapter).getDate(i11);
            kotlin.jvm.internal.u.i(date, "getDate(...)");
            b0.V(spo2Activity, (Period) Spo2Activity.C3(spo2Activity).getValue(), date);
        } else if (adapter instanceof Spo2Activity.c) {
            b0.V(spo2Activity, (Period) Spo2Activity.C3(spo2Activity).getValue(), ((Spo2Activity.c) adapter).a(i11));
        }
    }
}
