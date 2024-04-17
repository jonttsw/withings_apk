package com.withings.wiscale2.device.wam03.ui;

import android.content.Context;
/* compiled from: Hilt_Wam03PostInstallActivity.java */
/* loaded from: classes5.dex */
final class a implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_Wam03PostInstallActivity f54982a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Hilt_Wam03PostInstallActivity hilt_Wam03PostInstallActivity) {
        this.f54982a = hilt_Wam03PostInstallActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f54982a.inject();
    }
}
