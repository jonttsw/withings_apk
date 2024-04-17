package com.withings.wiscale2.vo2max.view;

import androidx.viewpager.widget.ViewPager;
import com.withings.library.measure.MeasuresGroup;
import com.withings.periodsbar.Period;
import java.util.List;
import org.joda.time.DateTime;
/* compiled from: Vo2maxActivity.kt */
/* loaded from: classes5.dex */
public final class c1 extends ViewPager.j {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Vo2maxActivity f62701a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ d1 f62702b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c1(Vo2maxActivity vo2maxActivity, d1 d1Var) {
        this.f62701a = vo2maxActivity;
        this.f62702b = d1Var;
    }

    @Override // androidx.viewpager.widget.ViewPager.h
    public final void onPageSelected(int i11) {
        List list;
        Period period = Period.f43720e;
        list = this.f62702b.f62731a.f62655h;
        com.withings.wiscale2.device.hwa08.postinstall.b0.V(this.f62701a, period, new DateTime(((MeasuresGroup) list.get(i11)).getDate()));
    }
}
