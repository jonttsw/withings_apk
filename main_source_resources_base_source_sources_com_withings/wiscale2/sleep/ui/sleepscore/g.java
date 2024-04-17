package com.withings.wiscale2.sleep.ui.sleepscore;

import android.content.Context;
/* compiled from: Hilt_SleepScoreDurationActivity.java */
/* loaded from: classes5.dex */
final class g implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_SleepScoreDurationActivity f60973a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(Hilt_SleepScoreDurationActivity hilt_SleepScoreDurationActivity) {
        this.f60973a = hilt_SleepScoreDurationActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f60973a.inject();
    }
}
