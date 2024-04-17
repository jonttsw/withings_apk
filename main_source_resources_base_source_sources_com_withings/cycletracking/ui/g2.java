package com.withings.cycletracking.ui;

import android.content.Context;
/* compiled from: Hilt_CycleTrackingActivity.java */
/* loaded from: classes3.dex */
final class g2 implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_CycleTrackingActivity f35561a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g2(Hilt_CycleTrackingActivity hilt_CycleTrackingActivity) {
        this.f35561a = hilt_CycleTrackingActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f35561a.inject();
    }
}
