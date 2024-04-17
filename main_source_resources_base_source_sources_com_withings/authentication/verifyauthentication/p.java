package com.withings.authentication.verifyauthentication;

import android.content.Context;
/* compiled from: Hilt_VerifyAuthenticationActivity.java */
/* loaded from: classes3.dex */
final class p implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_VerifyAuthenticationActivity f32693a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(Hilt_VerifyAuthenticationActivity hilt_VerifyAuthenticationActivity) {
        this.f32693a = hilt_VerifyAuthenticationActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f32693a.inject();
    }
}
