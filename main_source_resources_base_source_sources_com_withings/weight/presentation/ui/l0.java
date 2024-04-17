package com.withings.weight.presentation.ui;

import android.content.Context;
import android.content.Intent;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.withings.graph.GraphPeriod;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import org.joda.time.DateTime;
/* compiled from: WeightActivity.kt */
/* loaded from: classes4.dex */
final class l0 extends kotlin.jvm.internal.w implements ym0.p<DateTime, GraphPeriod, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WeightActivity f47262a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f47263b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(WeightActivity weightActivity, Context context) {
        super(2);
        this.f47262a = weightActivity;
        this.f47263b = context;
    }

    @Override // ym0.p
    public final nm0.y invoke(DateTime dateTime, GraphPeriod graphPeriod) {
        DateTime date = dateTime;
        GraphPeriod period = graphPeriod;
        kotlin.jvm.internal.u.j(date, "date");
        kotlin.jvm.internal.u.j(period, "period");
        WeightActivity weightActivity = this.f47262a;
        User user = WeightActivity.z3(weightActivity);
        int b10 = period.b();
        Context context = this.f47263b;
        kotlin.jvm.internal.u.j(context, "context");
        kotlin.jvm.internal.u.j(user, "user");
        Intent putExtra = ah.a.a(context, new Intent(CommonConstant.ACTION.HWID_SCHEME_URL), "com.withings.weight.presentation.ui.WeightExploreDataActivity", ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, user).putExtra("date", date).putExtra("period", b10);
        kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
        weightActivity.startActivity(putExtra);
        return nm0.y.f85009a;
    }
}
