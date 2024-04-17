package com.withings.wiscale2.device.wpa.wpa02.ui.features.toilet;

import com.withings.core.webcontent.HMWebActivity;
import com.withings.wiscale2.C1987R;
/* compiled from: Wpa02ToiletInstallationActivity.kt */
/* loaded from: classes5.dex */
final /* synthetic */ class u0 extends kotlin.jvm.internal.s implements ym0.a<nm0.y> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public u0(Wpa02ToiletInstallationActivity wpa02ToiletInstallationActivity) {
        super(0, wpa02ToiletInstallationActivity, Wpa02ToiletInstallationActivity.class, "getSupport", "getSupport()V", 0);
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        Wpa02ToiletInstallationActivity wpa02ToiletInstallationActivity = (Wpa02ToiletInstallationActivity) this.receiver;
        fn0.k<Object>[] kVarArr = Wpa02ToiletInstallationActivity.f55335j;
        wpa02ToiletInstallationActivity.getClass();
        wpa02ToiletInstallationActivity.startActivity(HMWebActivity.f35395c.b(wpa02ToiletInstallationActivity, null, C1987R.string.wpa02_install_supportGenericURL));
        return nm0.y.f85009a;
    }
}
