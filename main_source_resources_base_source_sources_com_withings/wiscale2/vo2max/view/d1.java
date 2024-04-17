package com.withings.wiscale2.vo2max.view;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.withings.library.measure.MeasuresGroup;
import com.withings.user.User;
import com.withings.wiscale2.vo2max.view.i1;
import java.util.List;
import org.joda.time.DateTime;
/* compiled from: Vo2maxActivity.kt */
/* loaded from: classes5.dex */
public final class d1 extends androidx.fragment.app.i0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Vo2maxActivity f62731a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(Vo2maxActivity vo2maxActivity, FragmentManager fragmentManager) {
        super(fragmentManager, 1);
        this.f62731a = vo2maxActivity;
    }

    @Override // androidx.viewpager.widget.e
    public final int getCount() {
        List list;
        list = this.f62731a.f62655h;
        return list.size();
    }

    @Override // androidx.fragment.app.i0
    public final Fragment getItem(int i11) {
        List list;
        c2 c2Var;
        Vo2maxActivity vo2maxActivity = this.f62731a;
        list = vo2maxActivity.f62655h;
        MeasuresGroup measure = (MeasuresGroup) list.get(i11);
        i1.a aVar = i1.f62761o;
        User user = Vo2maxActivity.A3(vo2maxActivity);
        aVar.getClass();
        kotlin.jvm.internal.u.j(user, "user");
        kotlin.jvm.internal.u.j(measure, "measure");
        i1 i1Var = new i1();
        Bundle bundle = new Bundle();
        bundle.putSerializable("key_measure", measure);
        bundle.putParcelable("key_user", user);
        i1Var.setArguments(bundle);
        c2Var = vo2maxActivity.f62656i;
        if (c2Var != null) {
            i1Var.x1(c2Var.m0());
            return i1Var;
        }
        kotlin.jvm.internal.u.s("viewModel");
        throw null;
    }

    @Override // androidx.viewpager.widget.e
    public final CharSequence getPageTitle(int i11) {
        List list;
        Vo2maxActivity vo2maxActivity = this.f62731a;
        list = vo2maxActivity.f62655h;
        return b50.b.i(vo2maxActivity, new DateTime(((MeasuresGroup) list.get(i11)).getDate()));
    }
}
