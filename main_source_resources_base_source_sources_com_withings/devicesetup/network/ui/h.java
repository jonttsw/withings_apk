package com.withings.devicesetup.network.ui;

import android.widget.CompoundButton;
/* compiled from: WifiSetupActivity.java */
/* loaded from: classes3.dex */
final class h implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WifiSetupActivity f37825a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(WifiSetupActivity wifiSetupActivity) {
        this.f37825a = wifiSetupActivity;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z5) {
        this.f37825a.A3(z5);
    }
}
