package com.withings.wiscale2.device.common.feature.respiratoryscan;

import android.content.Context;
/* compiled from: Hilt_RespiratoryScanActivationActivity.java */
/* loaded from: classes5.dex */
final class a implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_RespiratoryScanActivationActivity f52445a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Hilt_RespiratoryScanActivationActivity hilt_RespiratoryScanActivationActivity) {
        this.f52445a = hilt_RespiratoryScanActivationActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f52445a.inject();
    }
}
