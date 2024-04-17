package com.withings.devicesetup.network.ui;

import android.view.View;
/* compiled from: WifiSetupActivity.java */
/* loaded from: classes3.dex */
final class g implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WifiSetupActivity f37824a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(WifiSetupActivity wifiSetupActivity) {
        this.f37824a = wifiSetupActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WifiSetupActivity wifiSetupActivity = this.f37824a;
        WifiSetupActivity.z3(wifiSetupActivity);
        wifiSetupActivity.C3();
    }
}
