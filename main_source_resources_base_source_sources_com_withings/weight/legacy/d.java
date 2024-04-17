package com.withings.weight.legacy;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k0;
import com.withings.user.User;
import com.withings.weight.legacy.n;
import java.util.List;
import org.joda.time.DateTime;
/* compiled from: WeightDetailActivity.kt */
/* loaded from: classes4.dex */
final class d extends k0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f47046a;

    /* renamed from: b  reason: collision with root package name */
    private final User f47047b;

    /* renamed from: c  reason: collision with root package name */
    private final List<ky.d> f47048c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(WeightDetailActivity context, FragmentManager fragmentManager, User user, List measuresGroups) {
        super(fragmentManager, 1);
        kotlin.jvm.internal.u.j(context, "context");
        kotlin.jvm.internal.u.j(user, "user");
        kotlin.jvm.internal.u.j(measuresGroups, "measuresGroups");
        this.f47046a = context;
        this.f47047b = user;
        this.f47048c = measuresGroups;
    }

    @Override // androidx.viewpager.widget.e
    public final int getCount() {
        List<ky.d> list = this.f47048c;
        if (!(!list.isEmpty())) {
            list = null;
        }
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final DateTime getDate(int i11) {
        return new DateTime(this.f47048c.get(i11).c());
    }

    @Override // androidx.fragment.app.k0
    public final Fragment getItem(int i11) {
        boolean z5;
        n.a aVar = n.f47056w;
        List<ky.d> list = this.f47048c;
        ky.d measuresGroup = list.get(i11);
        if (list.size() < 2) {
            z5 = true;
        } else {
            z5 = false;
        }
        aVar.getClass();
        User user = this.f47047b;
        kotlin.jvm.internal.u.j(user, "user");
        kotlin.jvm.internal.u.j(measuresGroup, "measuresGroup");
        n nVar = new n();
        nVar.setArguments(androidx.core.os.e.a(new nm0.j("arg_user", user), new nm0.j("arg_measure_group", measuresGroup), new nm0.j("arg_is_last_measure", Boolean.valueOf(z5))));
        return nVar;
    }

    @Override // androidx.viewpager.widget.e
    public final CharSequence getPageTitle(int i11) {
        return b50.b.m(new DateTime(this.f47048c.get(i11).c()), this.f47046a, true, 4);
    }
}
