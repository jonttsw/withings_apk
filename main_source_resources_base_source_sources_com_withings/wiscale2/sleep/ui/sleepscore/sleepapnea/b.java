package com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea;

import android.content.Context;
/* compiled from: Hilt_SleepDisorderActivity.java */
/* loaded from: classes5.dex */
final class b implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_SleepDisorderActivity f61280a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Hilt_SleepDisorderActivity hilt_SleepDisorderActivity) {
        this.f61280a = hilt_SleepDisorderActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f61280a.inject();
    }
}
