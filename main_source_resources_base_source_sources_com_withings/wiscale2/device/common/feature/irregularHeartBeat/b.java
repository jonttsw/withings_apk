package com.withings.wiscale2.device.common.feature.irregularHeartBeat;

import android.content.Context;
/* compiled from: Hilt_IrregularHeartBeatSettingsActivity.java */
/* loaded from: classes5.dex */
final class b implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_IrregularHeartBeatSettingsActivity f52355a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Hilt_IrregularHeartBeatSettingsActivity hilt_IrregularHeartBeatSettingsActivity) {
        this.f52355a = hilt_IrregularHeartBeatSettingsActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f52355a.inject();
    }
}
