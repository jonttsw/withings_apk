package com.withings.tutorials.ui.screens.appssync.healthconnect;

import android.content.Context;
/* compiled from: Hilt_HealthConnectActivationActivity.java */
/* loaded from: classes4.dex */
final class i1 implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_HealthConnectActivationActivity f44977a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i1(Hilt_HealthConnectActivationActivity hilt_HealthConnectActivationActivity) {
        this.f44977a = hilt_HealthConnectActivationActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f44977a.inject();
    }
}
