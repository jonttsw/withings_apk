package com.withings.wiscale2.device.common.feature.ecg.us.hwa10;

import android.content.Context;
/* compiled from: Hilt_Hwa10EcgActivationActivity.java */
/* loaded from: classes5.dex */
final class a implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_Hwa10EcgActivationActivity f51802a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Hilt_Hwa10EcgActivationActivity hilt_Hwa10EcgActivationActivity) {
        this.f51802a = hilt_Hwa10EcgActivationActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f51802a.inject();
    }
}
