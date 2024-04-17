package com.withings.wiscale2.device.common.ui;

import android.content.Context;
/* compiled from: Hilt_DeviceInfoActivity.java */
/* loaded from: classes5.dex */
final class n1 implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_DeviceInfoActivity f54032a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n1(Hilt_DeviceInfoActivity hilt_DeviceInfoActivity) {
        this.f54032a = hilt_DeviceInfoActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f54032a.inject();
    }
}
