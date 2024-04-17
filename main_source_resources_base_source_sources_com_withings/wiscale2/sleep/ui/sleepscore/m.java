package com.withings.wiscale2.sleep.ui.sleepscore;

import android.content.Context;
/* compiled from: Hilt_SleepScoreTimeToSleepActivity.java */
/* loaded from: classes5.dex */
final class m implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_SleepScoreTimeToSleepActivity f61145a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(Hilt_SleepScoreTimeToSleepActivity hilt_SleepScoreTimeToSleepActivity) {
        this.f61145a = hilt_SleepScoreTimeToSleepActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f61145a.inject();
    }
}
