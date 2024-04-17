package com.withings.authentication.mfa;

import android.content.Context;
import com.withings.common.device.HelpCenterWebActivity;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.wiscale2.C1987R;
/* compiled from: ResolveMultiFactorActivity.kt */
/* loaded from: classes3.dex */
final class l extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ResolveMultiFactorActivity f31637a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f31638b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ResolveMultiFactorActivity resolveMultiFactorActivity, Context context) {
        super(0);
        this.f31637a = resolveMultiFactorActivity;
        this.f31638b = context;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        HMWebActivity.a aVar = HMWebActivity.f35395c;
        Context context = this.f31638b;
        String string = context.getString(C1987R.string._HELP_CENTER_);
        String string2 = context.getString(C1987R.string.login_2FA_recovery_lost_url_android);
        kotlin.jvm.internal.u.i(string2, "getString(...)");
        this.f31637a.startActivity(aVar.c(context, string, string2).setClass(context, HelpCenterWebActivity.class));
        return nm0.y.f85009a;
    }
}
