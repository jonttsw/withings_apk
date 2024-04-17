package com.withings.wiscale2.sleep.ui.sleepscore;

import android.content.Context;
/* compiled from: Hilt_SleepScoreTimeToGetUpActivity.java */
/* loaded from: classes5.dex */
final class l implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_SleepScoreTimeToGetUpActivity f61137a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(Hilt_SleepScoreTimeToGetUpActivity hilt_SleepScoreTimeToGetUpActivity) {
        this.f61137a = hilt_SleepScoreTimeToGetUpActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f61137a.inject();
    }
}
