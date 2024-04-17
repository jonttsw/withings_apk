package com.withings.wiscale2.manuallogging.ui.addSleep;

import android.content.Context;
/* compiled from: Hilt_AddSleepTrackActivity.java */
/* loaded from: classes5.dex */
final class o implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_AddSleepTrackActivity f58075a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(Hilt_AddSleepTrackActivity hilt_AddSleepTrackActivity) {
        this.f58075a = hilt_AddSleepTrackActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f58075a.inject();
    }
}
