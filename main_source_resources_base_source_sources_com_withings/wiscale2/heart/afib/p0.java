package com.withings.wiscale2.heart.afib;

import android.content.Context;
/* compiled from: Hilt_AFibDetailActivity.java */
/* loaded from: classes5.dex */
final class p0 implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_AFibDetailActivity f57226a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p0(Hilt_AFibDetailActivity hilt_AFibDetailActivity) {
        this.f57226a = hilt_AFibDetailActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f57226a.inject();
    }
}
