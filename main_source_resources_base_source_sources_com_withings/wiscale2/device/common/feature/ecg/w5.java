package com.withings.wiscale2.device.common.feature.ecg;

import android.content.Context;
/* compiled from: Hilt_WBS08EcgActivationActivity.java */
/* loaded from: classes5.dex */
final class w5 implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_WBS08EcgActivationActivity f52083a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w5(Hilt_WBS08EcgActivationActivity hilt_WBS08EcgActivationActivity) {
        this.f52083a = hilt_WBS08EcgActivationActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f52083a.inject();
    }
}
