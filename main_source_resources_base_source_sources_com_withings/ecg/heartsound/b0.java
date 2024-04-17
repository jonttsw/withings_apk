package com.withings.ecg.heartsound;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.withings.ecg.heartsound.d;
import java.util.List;
import org.joda.time.DateTime;
/* compiled from: HeartSoundListActivity.kt */
/* loaded from: classes3.dex */
public final class b0 extends androidx.fragment.app.k0 {

    /* renamed from: a  reason: collision with root package name */
    private final androidx.lifecycle.k0<Integer> f38421a;

    /* renamed from: b  reason: collision with root package name */
    private List<i0> f38422b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(FragmentManager fragmentManager, androidx.lifecycle.k0<Integer> scrollLiveData) {
        super(fragmentManager, 1);
        kotlin.jvm.internal.u.j(scrollLiveData, "scrollLiveData");
        this.f38421a = scrollLiveData;
        this.f38422b = kotlin.collections.i0.f76187a;
    }

    private final i0 b(int i11) {
        i0 i0Var;
        List<i0> list = this.f38422b;
        if (i11 >= 0 && i11 <= kotlin.collections.x.M(list)) {
            i0Var = list.get(i11);
        } else {
            i0Var = (i0) kotlin.collections.x.T(this.f38422b);
        }
        return i0Var;
    }

    public final List<i0> a() {
        return this.f38422b;
    }

    public final void c(List<i0> value) {
        kotlin.jvm.internal.u.j(value, "value");
        this.f38422b = value;
        notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.e
    public final int getCount() {
        return this.f38422b.size();
    }

    public final DateTime getDate(int i11) {
        return b(i11).a();
    }

    @Override // androidx.fragment.app.k0
    public final Fragment getItem(int i11) {
        boolean z5;
        i0 b10 = b(i11);
        d.a aVar = d.f38428v;
        long b11 = b10.b();
        if (i11 == 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        aVar.getClass();
        d dVar = new d(0);
        dVar.setArguments(androidx.core.os.e.a(new nm0.j("signalId", Long.valueOf(b11)), new nm0.j("isFirst", Boolean.valueOf(z5))));
        dVar.G1(this.f38421a);
        return dVar;
    }

    @Override // androidx.viewpager.widget.e
    public final CharSequence getPageTitle(int i11) {
        return b(i11).c();
    }
}
