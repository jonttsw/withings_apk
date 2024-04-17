package com.withings.weight.presentation.ui;

import android.content.Intent;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
/* compiled from: BodyCompositionActivity.kt */
/* loaded from: classes4.dex */
final class o extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ BodyCompositionActivity f47277a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(BodyCompositionActivity bodyCompositionActivity) {
        super(0);
        this.f47277a = bodyCompositionActivity;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        BodyCompositionActivity bodyCompositionActivity = this.f47277a;
        User user = BodyCompositionActivity.z3(bodyCompositionActivity);
        kotlin.jvm.internal.u.j(user, "user");
        Intent putExtra = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL).setClassName(bodyCompositionActivity.getPackageName(), "com.withings.wiscale2.weight.list.WeightListActivity").putExtra(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, user);
        kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
        bodyCompositionActivity.startActivity(putExtra);
        return nm0.y.f85009a;
    }
}
