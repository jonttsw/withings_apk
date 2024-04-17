package com.withings.wiscale2.settings;

import android.content.Context;
/* compiled from: Hilt_UnitsActivity.java */
/* loaded from: classes5.dex */
final class i0 implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_UnitsActivity f60041a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i0(Hilt_UnitsActivity hilt_UnitsActivity) {
        this.f60041a = hilt_UnitsActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f60041a.inject();
    }
}
