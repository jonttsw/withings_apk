package com.withings.wiscale2.heart.afib;

import android.content.Context;
/* compiled from: Hilt_AFibActivity.java */
/* loaded from: classes5.dex */
final class o0 implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_AFibActivity f57220a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o0(Hilt_AFibActivity hilt_AFibActivity) {
        this.f57220a = hilt_AFibActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f57220a.inject();
    }
}
