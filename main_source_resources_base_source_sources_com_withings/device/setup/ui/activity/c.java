package com.withings.device.setup.ui.activity;

import android.content.Context;
/* compiled from: Hilt_SetupActivity.java */
/* loaded from: classes3.dex */
final class c implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_SetupActivity f37511a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Hilt_SetupActivity hilt_SetupActivity) {
        this.f37511a = hilt_SetupActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f37511a.inject();
    }
}
