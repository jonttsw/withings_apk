package com.withings.wiscale2.sleep.ui.sleepscore;

import android.content.Context;
/* compiled from: Hilt_SleepScoreSnoringActivity.java */
/* loaded from: classes5.dex */
final class k implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_SleepScoreSnoringActivity f61063a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(Hilt_SleepScoreSnoringActivity hilt_SleepScoreSnoringActivity) {
        this.f61063a = hilt_SleepScoreSnoringActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f61063a.inject();
    }
}
