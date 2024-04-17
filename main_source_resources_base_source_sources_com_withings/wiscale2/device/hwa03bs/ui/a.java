package com.withings.wiscale2.device.hwa03bs.ui;

import android.content.Context;
/* compiled from: Hilt_Hwa03PostInstallActivity.java */
/* loaded from: classes5.dex */
final class a implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_Hwa03PostInstallActivity f54251a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Hilt_Hwa03PostInstallActivity hilt_Hwa03PostInstallActivity) {
        this.f54251a = hilt_Hwa03PostInstallActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f54251a.inject();
    }
}
