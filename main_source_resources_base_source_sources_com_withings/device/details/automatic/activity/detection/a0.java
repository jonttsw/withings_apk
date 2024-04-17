package com.withings.device.details.automatic.activity.detection;

import android.content.Context;
/* compiled from: Hilt_AutomaticActivityDetection.java */
/* loaded from: classes3.dex */
final class a0 implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_AutomaticActivityDetection f36683a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0(Hilt_AutomaticActivityDetection hilt_AutomaticActivityDetection) {
        this.f36683a = hilt_AutomaticActivityDetection;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f36683a.inject();
    }
}
