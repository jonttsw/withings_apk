package com.withings.devicesetup.network.ui;

import android.widget.CompoundButton;
/* compiled from: WifiSetupActivity.java */
/* loaded from: classes3.dex */
final class i implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WifiSetupActivity f37826a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(WifiSetupActivity wifiSetupActivity) {
        this.f37826a = wifiSetupActivity;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z5) {
        this.f37826a.B3(z5);
    }
}
