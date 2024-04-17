package com.withings.wiscale2.device.common.ui;

import android.content.Context;
/* compiled from: Hilt_MyDeviceActivity.java */
/* loaded from: classes5.dex */
final class p1 implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_MyDeviceActivity f54047a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p1(Hilt_MyDeviceActivity hilt_MyDeviceActivity) {
        this.f54047a = hilt_MyDeviceActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f54047a.inject();
    }
}
