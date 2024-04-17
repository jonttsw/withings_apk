package com.withings.authentication.mfa;

import android.content.Context;
/* compiled from: Hilt_ResolveMultiFactorActivity.java */
/* loaded from: classes3.dex */
final class c implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_ResolveMultiFactorActivity f31617a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Hilt_ResolveMultiFactorActivity hilt_ResolveMultiFactorActivity) {
        this.f31617a = hilt_ResolveMultiFactorActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f31617a.inject();
    }
}
