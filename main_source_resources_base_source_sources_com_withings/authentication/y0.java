package com.withings.authentication;

import android.content.Context;
/* compiled from: Hilt_AuthenticationActivity.java */
/* loaded from: classes3.dex */
final class y0 implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_AuthenticationActivity f32712a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y0(Hilt_AuthenticationActivity hilt_AuthenticationActivity) {
        this.f32712a = hilt_AuthenticationActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f32712a.inject();
    }
}
