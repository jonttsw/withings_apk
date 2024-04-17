package com.withings.measurements.ui;

import android.content.Context;
/* compiled from: Hilt_HealthVerticalActivity.java */
/* loaded from: classes4.dex */
final class q1 implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_HealthVerticalActivity f42123a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q1(Hilt_HealthVerticalActivity hilt_HealthVerticalActivity) {
        this.f42123a = hilt_HealthVerticalActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f42123a.inject();
    }
}
