package com.withings.device.setup.ui;

import android.content.Context;
/* compiled from: Hilt_SetupChooseDeviceActivity.java */
/* loaded from: classes3.dex */
final class a implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_SetupChooseDeviceActivity f37491a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Hilt_SetupChooseDeviceActivity hilt_SetupChooseDeviceActivity) {
        this.f37491a = hilt_SetupChooseDeviceActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f37491a.inject();
    }
}
