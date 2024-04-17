package com.withings.weight.legacy;

import androidx.fragment.app.FragmentManager;
import com.withings.user.User;
import java.util.List;
/* compiled from: WeightDetailActivity.kt */
/* loaded from: classes4.dex */
final class f extends kotlin.jvm.internal.w implements ym0.l<List<? extends ky.d>, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WeightDetailActivity f47050a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(WeightDetailActivity weightDetailActivity) {
        super(1);
        this.f47050a = weightDetailActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(List<? extends ky.d> list) {
        e90.a E3;
        List<? extends ky.d> list2 = list;
        WeightDetailActivity weightDetailActivity = this.f47050a;
        E3 = weightDetailActivity.E3();
        FragmentManager supportFragmentManager = weightDetailActivity.getSupportFragmentManager();
        kotlin.jvm.internal.u.i(supportFragmentManager, "getSupportFragmentManager(...)");
        User C3 = WeightDetailActivity.C3(weightDetailActivity);
        kotlin.jvm.internal.u.g(list2);
        E3.f64951a.setAdapter(new d(weightDetailActivity, supportFragmentManager, C3, list2));
        return nm0.y.f85009a;
    }
}
