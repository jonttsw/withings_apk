package com.withings.wiscale2.sleep.ui.sleepscore;

import android.content.Context;
/* compiled from: Hilt_SleepScoreRegularityActivity.java */
/* loaded from: classes5.dex */
final class j implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_SleepScoreRegularityActivity f61022a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(Hilt_SleepScoreRegularityActivity hilt_SleepScoreRegularityActivity) {
        this.f61022a = hilt_SleepScoreRegularityActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f61022a.inject();
    }
}
