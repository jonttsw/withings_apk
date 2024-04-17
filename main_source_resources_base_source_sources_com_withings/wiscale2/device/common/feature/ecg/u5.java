package com.withings.wiscale2.device.common.feature.ecg;

import android.content.Context;
/* compiled from: Hilt_EcgActivationActivity.java */
/* loaded from: classes5.dex */
final class u5 implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_EcgActivationActivity f51766a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u5(Hilt_EcgActivationActivity hilt_EcgActivationActivity) {
        this.f51766a = hilt_EcgActivationActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f51766a.inject();
    }
}
