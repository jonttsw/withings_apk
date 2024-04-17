package com.withings.wiscale2.heart.heartrate;

import android.content.Context;
import android.content.Intent;
import com.withings.user.User;
import com.withings.wiscale2.heart.heartrate.HRMeasuresListActivity;
import org.joda.time.DateTime;
/* compiled from: HeartRateDayFragment.kt */
/* loaded from: classes5.dex */
final class z extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ w f57775a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(w wVar) {
        super(0);
        this.f57775a = wVar;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        androidx.activity.result.b bVar;
        w wVar = this.f57775a;
        bVar = wVar.f57740q;
        HRMeasuresListActivity.a aVar = HRMeasuresListActivity.f57468l;
        Context requireContext = wVar.requireContext();
        kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
        User user = wVar.getUser();
        DateTime dateStart = w.w1(wVar);
        aVar.getClass();
        kotlin.jvm.internal.u.j(user, "user");
        kotlin.jvm.internal.u.j(dateStart, "dateStart");
        Intent putExtra = new Intent(requireContext, HRMeasuresListActivity.class).putExtra("extra_user", user).putExtra("extra_date_start", dateStart);
        kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
        bVar.a(putExtra);
        return nm0.y.f85009a;
    }
}
