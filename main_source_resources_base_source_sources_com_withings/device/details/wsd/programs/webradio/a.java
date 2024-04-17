package com.withings.device.details.wsd.programs.webradio;

import android.content.Context;
/* compiled from: Hilt_WsdWebRadioActivity.java */
/* loaded from: classes3.dex */
final class a implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_WsdWebRadioActivity f37299a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Hilt_WsdWebRadioActivity hilt_WsdWebRadioActivity) {
        this.f37299a = hilt_WsdWebRadioActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f37299a.inject();
    }
}
