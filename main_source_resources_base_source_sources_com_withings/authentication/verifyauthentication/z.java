package com.withings.authentication.verifyauthentication;

import com.withings.common.device.HelpCenterWebActivity;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.wiscale2.C1987R;
/* compiled from: VerifyAuthenticationActivity.kt */
/* loaded from: classes3.dex */
final class z extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ VerifyAuthenticationActivity f32707a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(VerifyAuthenticationActivity verifyAuthenticationActivity) {
        super(0);
        this.f32707a = verifyAuthenticationActivity;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        HMWebActivity.a aVar = HMWebActivity.f35395c;
        VerifyAuthenticationActivity verifyAuthenticationActivity = this.f32707a;
        String string = verifyAuthenticationActivity.getString(C1987R.string._HELP_CENTER_);
        String string2 = verifyAuthenticationActivity.getString(C1987R.string.login_2FA_recovery_lost_url_android);
        kotlin.jvm.internal.u.i(string2, "getString(...)");
        verifyAuthenticationActivity.startActivity(aVar.c(verifyAuthenticationActivity, string, string2).setClass(verifyAuthenticationActivity, HelpCenterWebActivity.class));
        return nm0.y.f85009a;
    }
}
