package com.withings.wiscale2.heart.afib;

import android.content.Context;
import android.content.Intent;
import com.withings.user.User;
import com.withings.wiscale2.heart.afib.AFibMeasuresListActivity;
/* compiled from: AFibMonthFragment.kt */
/* loaded from: classes5.dex */
final class z extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ y f57299a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(y yVar) {
        super(0);
        this.f57299a = yVar;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        AFibMeasuresListActivity.a aVar = AFibMeasuresListActivity.f57089l;
        y yVar = this.f57299a;
        Context requireContext = yVar.requireContext();
        kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
        User user = yVar.getUser();
        long millis = y.t1(yVar).getMillis();
        boolean E1 = yVar.E1();
        aVar.getClass();
        kotlin.jvm.internal.u.j(user, "user");
        Intent putExtra = new Intent(requireContext, AFibMeasuresListActivity.class).putExtra("extra_user", user).putExtra("extra_date_start", millis).putExtra("extra_is_medical", E1);
        kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
        yVar.startActivity(putExtra);
        return nm0.y.f85009a;
    }
}
