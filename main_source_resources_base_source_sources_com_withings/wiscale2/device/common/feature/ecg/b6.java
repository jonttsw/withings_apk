package com.withings.wiscale2.device.common.feature.ecg;

import com.withings.core.webcontent.HMWebActivity;
import com.withings.wiscale2.C1987R;
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final /* synthetic */ class b6 extends kotlin.jvm.internal.s implements ym0.a<nm0.y> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public b6(WBS08EcgActivationActivity wBS08EcgActivationActivity) {
        super(0, wBS08EcgActivationActivity, WBS08EcgActivationActivity.class, "openHeartbeatConditionsWebView", "openHeartbeatConditionsWebView()V", 0);
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        WBS08EcgActivationActivity wBS08EcgActivationActivity = (WBS08EcgActivationActivity) this.receiver;
        int i11 = WBS08EcgActivationActivity.f51104f;
        HMWebActivity.a aVar = HMWebActivity.f35395c;
        String string = wBS08EcgActivationActivity.getString(C1987R.string.wbs08_usOnboarding_conditions_link);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        wBS08EcgActivationActivity.startActivity(aVar.c(wBS08EcgActivationActivity, null, string));
        return nm0.y.f85009a;
    }
}
