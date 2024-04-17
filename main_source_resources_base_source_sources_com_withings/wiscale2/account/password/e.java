package com.withings.wiscale2.account.password;

import android.content.Context;
/* compiled from: Hilt_PasswordExpiredActivity.java */
/* loaded from: classes4.dex */
final class e implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_PasswordExpiredActivity f48142a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Hilt_PasswordExpiredActivity hilt_PasswordExpiredActivity) {
        this.f48142a = hilt_PasswordExpiredActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f48142a.inject();
    }
}
