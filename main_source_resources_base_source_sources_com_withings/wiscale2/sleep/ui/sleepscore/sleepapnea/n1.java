package com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.withings.periodsbar.Period;
import com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.o0;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
/* compiled from: SleepDisorderGraphPagerFragment.kt */
/* loaded from: classes5.dex */
public final class n1 extends androidx.fragment.app.k0 {

    /* renamed from: a  reason: collision with root package name */
    private final Period f61399a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.lifecycle.k0<Integer> f61400b;

    /* renamed from: c  reason: collision with root package name */
    private final DateTime f61401c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f61402d;

    /* renamed from: e  reason: collision with root package name */
    private List<h1> f61403e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(FragmentManager fragmentManager, Period period, androidx.lifecycle.k0<Integer> scrollLiveData, DateTime dateTime, boolean z5) {
        super(fragmentManager, 1);
        kotlin.jvm.internal.u.j(period, "period");
        kotlin.jvm.internal.u.j(scrollLiveData, "scrollLiveData");
        this.f61399a = period;
        this.f61400b = scrollLiveData;
        this.f61401c = dateTime;
        this.f61402d = z5;
        this.f61403e = kotlin.collections.i0.f76187a;
    }

    public final void a(ArrayList arrayList) {
        this.f61403e = arrayList;
        notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.e
    public final int getCount() {
        return this.f61403e.size();
    }

    @Override // androidx.fragment.app.k0
    public final Fragment getItem(int i11) {
        h1 h1Var;
        List<h1> list = this.f61403e;
        if (i11 >= 0 && i11 <= kotlin.collections.x.M(list)) {
            h1Var = list.get(i11);
        } else {
            h1Var = (h1) kotlin.collections.x.T(this.f61403e);
        }
        o0.a aVar = o0.f61405o;
        List<DatedValue> ahiValues = h1Var.a();
        aVar.getClass();
        Period period = this.f61399a;
        kotlin.jvm.internal.u.j(period, "period");
        kotlin.jvm.internal.u.j(ahiValues, "ahiValues");
        o0 o0Var = new o0();
        o0Var.setArguments(androidx.core.os.e.a(new nm0.j("arg_display_type", period), new nm0.j("key_ref_date", this.f61401c), new nm0.j("arg_ahi_values", new ArrayList(ahiValues)), new nm0.j("key_is_sleep_apnea", Boolean.valueOf(this.f61402d))));
        o0Var.A1(this.f61400b);
        return o0Var;
    }

    @Override // androidx.viewpager.widget.e
    public final int getItemPosition(Object object) {
        kotlin.jvm.internal.u.j(object, "object");
        return -2;
    }

    @Override // androidx.viewpager.widget.e
    public final CharSequence getPageTitle(int i11) {
        h1 h1Var;
        List<h1> list = this.f61403e;
        if (i11 >= 0 && i11 <= kotlin.collections.x.M(list)) {
            h1Var = list.get(i11);
        } else {
            h1Var = (h1) kotlin.collections.x.T(this.f61403e);
        }
        return h1Var.b();
    }
}
