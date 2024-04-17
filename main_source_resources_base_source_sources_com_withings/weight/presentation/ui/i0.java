package com.withings.weight.presentation.ui;

import android.content.Context;
import android.content.Intent;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
/* compiled from: WeightActivity.kt */
/* loaded from: classes4.dex */
final class i0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WeightActivity f47260a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f47261b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(WeightActivity weightActivity, Context context) {
        super(0);
        this.f47260a = weightActivity;
        this.f47261b = context;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        androidx.activity.result.b bVar;
        WeightActivity weightActivity = this.f47260a;
        bVar = weightActivity.f47153k;
        User user = WeightActivity.z3(weightActivity);
        Context context = this.f47261b;
        kotlin.jvm.internal.u.j(context, "context");
        kotlin.jvm.internal.u.j(user, "user");
        Intent a11 = ah.a.a(context, new Intent(CommonConstant.ACTION.HWID_SCHEME_URL), "com.withings.wiscale2.weight.list.WeightListActivity", ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, user);
        kotlin.jvm.internal.u.i(a11, "putExtra(...)");
        bVar.a(a11);
        return nm0.y.f85009a;
    }
}
