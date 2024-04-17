package com.withings.wiscale2.device.common.feature.irregularHeartBeat;

import android.content.Context;
/* compiled from: Hilt_IrregularHeartBeatActivationActivity.java */
/* loaded from: classes5.dex */
final class a implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_IrregularHeartBeatActivationActivity f52354a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Hilt_IrregularHeartBeatActivationActivity hilt_IrregularHeartBeatActivationActivity) {
        this.f52354a = hilt_IrregularHeartBeatActivationActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f52354a.inject();
    }
}
