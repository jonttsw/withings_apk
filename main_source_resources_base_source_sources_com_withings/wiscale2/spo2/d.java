package com.withings.wiscale2.spo2;

import android.content.Context;
/* compiled from: Hilt_Spo2Activity.java */
/* loaded from: classes5.dex */
final class d implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_Spo2Activity f61653a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Hilt_Spo2Activity hilt_Spo2Activity) {
        this.f61653a = hilt_Spo2Activity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f61653a.inject();
    }
}
