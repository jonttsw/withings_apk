package com.withings.wiscale2.sleep.ui.sleepscore;

import android.content.Context;
/* compiled from: Hilt_SleepScoreInterruptionsActivity.java */
/* loaded from: classes5.dex */
final class h implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_SleepScoreInterruptionsActivity f60982a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(Hilt_SleepScoreInterruptionsActivity hilt_SleepScoreInterruptionsActivity) {
        this.f60982a = hilt_SleepScoreInterruptionsActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f60982a.inject();
    }
}
