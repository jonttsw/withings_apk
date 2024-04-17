package com.withings.wiscale2.device.common.ui;

import android.content.Context;
/* compiled from: Hilt_RespiratoryScanSettingsActivity.java */
/* loaded from: classes5.dex */
final class q1 implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_RespiratoryScanSettingsActivity f54062a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q1(Hilt_RespiratoryScanSettingsActivity hilt_RespiratoryScanSettingsActivity) {
        this.f54062a = hilt_RespiratoryScanSettingsActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f54062a.inject();
    }
}
