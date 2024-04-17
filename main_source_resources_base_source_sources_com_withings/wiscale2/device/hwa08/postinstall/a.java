package com.withings.wiscale2.device.hwa08.postinstall;

import android.content.Context;
/* compiled from: Hilt_Hwa08PostInstallActivity.java */
/* loaded from: classes5.dex */
final class a implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_Hwa08PostInstallActivity f54424a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Hilt_Hwa08PostInstallActivity hilt_Hwa08PostInstallActivity) {
        this.f54424a = hilt_Hwa08PostInstallActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f54424a.inject();
    }
}
