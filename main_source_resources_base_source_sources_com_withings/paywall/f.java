package com.withings.paywall;

import android.content.Context;
/* compiled from: Hilt_PaywallActivity.java */
/* loaded from: classes4.dex */
final class f implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_PaywallActivity f43610a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(Hilt_PaywallActivity hilt_PaywallActivity) {
        this.f43610a = hilt_PaywallActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f43610a.inject();
    }
}
