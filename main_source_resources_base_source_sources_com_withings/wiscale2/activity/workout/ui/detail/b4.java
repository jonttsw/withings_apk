package com.withings.wiscale2.activity.workout.ui.detail;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.withings.user.User;
import com.withings.wiscale2.activity.workout.ui.detail.x1;
import com.withings.workout.category.model.WorkoutCategory;
import java.util.List;
import org.joda.time.DateTime;
/* compiled from: WorkoutListActivity.kt */
/* loaded from: classes4.dex */
public final class b4 extends androidx.fragment.app.k0 {

    /* renamed from: a  reason: collision with root package name */
    private final User f49124a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.lifecycle.k0<Integer> f49125b;

    /* renamed from: c  reason: collision with root package name */
    private List<t1> f49126c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(FragmentManager fragmentManager, User user, androidx.lifecycle.k0<Integer> scrollLiveData) {
        super(fragmentManager, 1);
        kotlin.jvm.internal.u.j(user, "user");
        kotlin.jvm.internal.u.j(scrollLiveData, "scrollLiveData");
        this.f49124a = user;
        this.f49125b = scrollLiveData;
        this.f49126c = kotlin.collections.i0.f76187a;
    }

    private final t1 c(int i11) {
        t1 t1Var;
        List<t1> list = this.f49126c;
        if (i11 >= 0 && i11 <= kotlin.collections.x.M(list)) {
            t1Var = list.get(i11);
        } else {
            t1Var = (t1) kotlin.collections.x.T(this.f49126c);
        }
        return t1Var;
    }

    public final List<t1> a() {
        return this.f49126c;
    }

    public final void b(List<t1> list) {
        this.f49126c = list;
        notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.e
    public final int getCount() {
        return this.f49126c.size();
    }

    public final DateTime getDate(int i11) {
        return c(i11).b();
    }

    @Override // androidx.fragment.app.k0
    public final Fragment getItem(int i11) {
        t1 c11 = c(i11);
        x1.a aVar = x1.B;
        long d11 = c11.d();
        WorkoutCategory a11 = c11.a();
        aVar.getClass();
        x1 a12 = x1.a.a(this.f49124a, d11, a11);
        a12.c2(this.f49125b);
        return a12;
    }

    @Override // androidx.viewpager.widget.e
    public final int getItemPosition(Object object) {
        kotlin.jvm.internal.u.j(object, "object");
        return -2;
    }

    @Override // androidx.viewpager.widget.e
    public final CharSequence getPageTitle(int i11) {
        return c(i11).c();
    }
}
