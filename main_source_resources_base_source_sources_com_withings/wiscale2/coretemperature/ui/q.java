package com.withings.wiscale2.coretemperature.ui;

import android.content.Context;
/* compiled from: Hilt_ExploreCoreTemperatureActivity.java */
/* loaded from: classes4.dex */
final class q implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_ExploreCoreTemperatureActivity f50482a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(Hilt_ExploreCoreTemperatureActivity hilt_ExploreCoreTemperatureActivity) {
        this.f50482a = hilt_ExploreCoreTemperatureActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f50482a.inject();
    }
}
