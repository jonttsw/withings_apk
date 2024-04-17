package com.withings.wiscale2.device.wpa.wpa02.ui.features.cartridge;

import android.content.Context;
/* compiled from: Hilt_Wpa02CartridgeActivationActivity.java */
/* loaded from: classes5.dex */
final class n implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_Wpa02CartridgeActivationActivity f55210a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(Hilt_Wpa02CartridgeActivationActivity hilt_Wpa02CartridgeActivationActivity) {
        this.f55210a = hilt_Wpa02CartridgeActivationActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f55210a.inject();
    }
}
