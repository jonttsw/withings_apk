package com.withings.wiscale2.device.wpa.wpa02.ui.features.cartridge;

import com.withings.core.webcontent.HMWebActivity;
import com.withings.wiscale2.C1987R;
/* compiled from: Wpa02CartridgeActivationActivity.kt */
/* loaded from: classes5.dex */
final /* synthetic */ class u extends kotlin.jvm.internal.s implements ym0.a<nm0.y> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public u(Wpa02CartridgeActivationActivity wpa02CartridgeActivationActivity) {
        super(0, wpa02CartridgeActivationActivity, Wpa02CartridgeActivationActivity.class, "getSupport", "getSupport()V", 0);
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        Wpa02CartridgeActivationActivity wpa02CartridgeActivationActivity = (Wpa02CartridgeActivationActivity) this.receiver;
        fn0.k<Object>[] kVarArr = Wpa02CartridgeActivationActivity.f55109j;
        wpa02CartridgeActivationActivity.getClass();
        wpa02CartridgeActivationActivity.startActivity(HMWebActivity.f35395c.b(wpa02CartridgeActivationActivity, null, C1987R.string.wpa02_install_supportGenericURL));
        return nm0.y.f85009a;
    }
}
