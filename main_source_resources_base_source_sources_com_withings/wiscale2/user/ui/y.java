package com.withings.wiscale2.user.ui;

import android.content.Context;
/* compiled from: Hilt_CreateUserActivity.java */
/* loaded from: classes5.dex */
final class y implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_CreateUserActivity f62158a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(Hilt_CreateUserActivity hilt_CreateUserActivity) {
        this.f62158a = hilt_CreateUserActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f62158a.inject();
    }
}
