package com.withings.wiscale2.device.common.feature.spo2;

import android.content.Context;
/* compiled from: Hilt_Spo2ActivationActivity.java */
/* loaded from: classes5.dex */
final class b implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_Spo2ActivationActivity f52522a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Hilt_Spo2ActivationActivity hilt_Spo2ActivationActivity) {
        this.f52522a = hilt_Spo2ActivationActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f52522a.inject();
    }
}
