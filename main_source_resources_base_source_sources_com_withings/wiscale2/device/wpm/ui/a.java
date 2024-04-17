package com.withings.wiscale2.device.wpm.ui;

import android.content.Context;
/* compiled from: Hilt_Wpm0203Activity.java */
/* loaded from: classes5.dex */
final class a implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_Wpm0203Activity f55680a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Hilt_Wpm0203Activity hilt_Wpm0203Activity) {
        this.f55680a = hilt_Wpm0203Activity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f55680a.inject();
    }
}
