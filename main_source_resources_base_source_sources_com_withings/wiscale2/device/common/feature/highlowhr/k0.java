package com.withings.wiscale2.device.common.feature.highlowhr;

import android.content.Context;
/* compiled from: Hilt_HighLowHRActivationActivity.java */
/* loaded from: classes5.dex */
final class k0 implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_HighLowHRActivationActivity f52298a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k0(Hilt_HighLowHRActivationActivity hilt_HighLowHRActivationActivity) {
        this.f52298a = hilt_HighLowHRActivationActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f52298a.inject();
    }
}
