package com.withings.wiscale2.sleep.ui.sleepscore;

import android.content.Context;
/* compiled from: Hilt_SleepScoreRecoveryActivity.java */
/* loaded from: classes5.dex */
final class i implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_SleepScoreRecoveryActivity f61017a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(Hilt_SleepScoreRecoveryActivity hilt_SleepScoreRecoveryActivity) {
        this.f61017a = hilt_SleepScoreRecoveryActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f61017a.inject();
    }
}
