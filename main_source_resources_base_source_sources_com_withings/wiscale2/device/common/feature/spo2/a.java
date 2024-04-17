package com.withings.wiscale2.device.common.feature.spo2;

import android.content.Context;
/* compiled from: Hilt_SpO2SettingsActivity.java */
/* loaded from: classes5.dex */
final class a implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_SpO2SettingsActivity f52521a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Hilt_SpO2SettingsActivity hilt_SpO2SettingsActivity) {
        this.f52521a = hilt_SpO2SettingsActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f52521a.inject();
    }
}
