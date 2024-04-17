package com.withings.wiscale2.account.password;

import android.content.Context;
/* compiled from: Hilt_LinkForPasswordSentActivity.java */
/* loaded from: classes4.dex */
final class c implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_LinkForPasswordSentActivity f48136a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Hilt_LinkForPasswordSentActivity hilt_LinkForPasswordSentActivity) {
        this.f48136a = hilt_LinkForPasswordSentActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f48136a.inject();
    }
}
