package com.withings.wiscale2.device.common.feature.ecg;

import android.content.Context;
/* compiled from: Hilt_EcgSettingsActivity.java */
/* loaded from: classes5.dex */
final class v5 implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_EcgSettingsActivity f52067a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v5(Hilt_EcgSettingsActivity hilt_EcgSettingsActivity) {
        this.f52067a = hilt_EcgSettingsActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f52067a.inject();
    }
}
