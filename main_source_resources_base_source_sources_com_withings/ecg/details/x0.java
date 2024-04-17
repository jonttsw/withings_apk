package com.withings.ecg.details;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.ecg.details.g;
import java.util.List;
import org.joda.time.DateTime;
/* compiled from: EcgListActivity.kt */
/* loaded from: classes3.dex */
public final class x0 extends androidx.fragment.app.k0 {

    /* renamed from: a  reason: collision with root package name */
    private final androidx.lifecycle.k0<Integer> f38354a;

    /* renamed from: b  reason: collision with root package name */
    private final long f38355b;

    /* renamed from: c  reason: collision with root package name */
    private List<l1> f38356c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(FragmentManager fragmentManager, androidx.lifecycle.k0<Integer> scrollLiveData, long j5) {
        super(fragmentManager, 1);
        kotlin.jvm.internal.u.j(scrollLiveData, "scrollLiveData");
        this.f38354a = scrollLiveData;
        this.f38355b = j5;
        this.f38356c = kotlin.collections.i0.f76187a;
    }

    private final l1 a(int i11) {
        l1 l1Var;
        List<l1> list = this.f38356c;
        if (i11 >= 0 && i11 <= kotlin.collections.x.M(list)) {
            l1Var = list.get(i11);
        } else {
            l1Var = (l1) kotlin.collections.x.T(this.f38356c);
        }
        return l1Var;
    }

    public final List<l1> b() {
        return this.f38356c;
    }

    public final void c(List<l1> value) {
        kotlin.jvm.internal.u.j(value, "value");
        this.f38356c = value;
        notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.e
    public final int getCount() {
        return this.f38356c.size();
    }

    public final DateTime getDate(int i11) {
        return a(i11).c();
    }

    @Override // androidx.fragment.app.k0
    public final Fragment getItem(int i11) {
        l1 a11 = a(i11);
        if (a11.e()) {
            int i12 = a1.f38089i;
            Long a12 = a11.a();
            long b10 = a11.b();
            a1 a1Var = new a1();
            a1Var.setArguments(androidx.core.os.e.a(new nm0.j(HealthUserProfile.USER_PROFILE_KEY_USER_ID, Long.valueOf(this.f38355b)), new nm0.j("device_id", a12), new nm0.j("ecg_id", Long.valueOf(b10))));
            return a1Var;
        }
        g a13 = g.a.a(g.f38200q, this.f38355b, a11.b(), false, a11.c(), 4);
        a13.M1(this.f38354a);
        return a13;
    }

    @Override // androidx.viewpager.widget.e
    public final CharSequence getPageTitle(int i11) {
        return a(i11).d();
    }
}
