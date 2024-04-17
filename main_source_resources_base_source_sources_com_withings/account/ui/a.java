package com.withings.account.ui;

import android.content.Context;
/* compiled from: Hilt_VerifyAuthenticationSensitiveActivity.java */
/* loaded from: classes3.dex */
final class a implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_VerifyAuthenticationSensitiveActivity f31017a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Hilt_VerifyAuthenticationSensitiveActivity hilt_VerifyAuthenticationSensitiveActivity) {
        this.f31017a = hilt_VerifyAuthenticationSensitiveActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f31017a.inject();
    }
}
