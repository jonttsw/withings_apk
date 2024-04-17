package com.withings.tutorials.ui;

import android.content.Context;
/* compiled from: Hilt_DeviceIntroductionActivity.java */
/* loaded from: classes4.dex */
final class u implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_DeviceIntroductionActivity f46314a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(Hilt_DeviceIntroductionActivity hilt_DeviceIntroductionActivity) {
        this.f46314a = hilt_DeviceIntroductionActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f46314a.inject();
    }
}
