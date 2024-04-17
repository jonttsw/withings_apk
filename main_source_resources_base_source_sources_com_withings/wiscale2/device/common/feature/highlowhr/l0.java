package com.withings.wiscale2.device.common.feature.highlowhr;

import android.content.Context;
/* compiled from: Hilt_HighLowHRSettingsActivity.java */
/* loaded from: classes5.dex */
final class l0 implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_HighLowHRSettingsActivity f52300a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l0(Hilt_HighLowHRSettingsActivity hilt_HighLowHRSettingsActivity) {
        this.f52300a = hilt_HighLowHRSettingsActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f52300a.inject();
    }
}
