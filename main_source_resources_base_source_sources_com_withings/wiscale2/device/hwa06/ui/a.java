package com.withings.wiscale2.device.hwa06.ui;

import android.content.Context;
/* compiled from: Hilt_Hwa06PostInstallActivity.java */
/* loaded from: classes5.dex */
final class a implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_Hwa06PostInstallActivity f54335a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Hilt_Hwa06PostInstallActivity hilt_Hwa06PostInstallActivity) {
        this.f54335a = hilt_Hwa06PostInstallActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f54335a.inject();
    }
}
