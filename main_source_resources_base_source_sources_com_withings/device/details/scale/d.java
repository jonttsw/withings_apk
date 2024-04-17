package com.withings.device.details.scale;

import android.content.Context;
/* compiled from: Hilt_ScaleSharingActivity.java */
/* loaded from: classes3.dex */
final class d implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_ScaleSharingActivity f36922a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Hilt_ScaleSharingActivity hilt_ScaleSharingActivity) {
        this.f36922a = hilt_ScaleSharingActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f36922a.inject();
    }
}
