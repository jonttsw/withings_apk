package com.withings.fever.ui;

import android.content.Context;
/* compiled from: Hilt_BodyTemperatureActivity.java */
/* loaded from: classes3.dex */
final class s0 implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_BodyTemperatureActivity f39409a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s0(Hilt_BodyTemperatureActivity hilt_BodyTemperatureActivity) {
        this.f39409a = hilt_BodyTemperatureActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f39409a.inject();
    }
}
