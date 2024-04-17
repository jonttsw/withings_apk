package com.withings.wiscale2.account.email;

import android.content.Context;
/* compiled from: Hilt_EmailModificationActivity.java */
/* loaded from: classes4.dex */
final class n implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_EmailModificationActivity f48094a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(Hilt_EmailModificationActivity hilt_EmailModificationActivity) {
        this.f48094a = hilt_EmailModificationActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f48094a.inject();
    }
}
