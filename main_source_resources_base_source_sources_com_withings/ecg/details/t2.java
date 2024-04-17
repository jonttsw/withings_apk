package com.withings.ecg.details;

import android.content.Context;
/* compiled from: Hilt_WaitingSignalResultActivity.java */
/* loaded from: classes3.dex */
final class t2 implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_WaitingSignalResultActivity f38339a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t2(Hilt_WaitingSignalResultActivity hilt_WaitingSignalResultActivity) {
        this.f38339a = hilt_WaitingSignalResultActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f38339a.inject();
    }
}
