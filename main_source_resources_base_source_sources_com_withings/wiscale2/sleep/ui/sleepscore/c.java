package com.withings.wiscale2.sleep.ui.sleepscore;

import android.content.Context;
/* compiled from: Hilt_SleepActivity.java */
/* loaded from: classes5.dex */
final class c implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_SleepActivity f60896a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Hilt_SleepActivity hilt_SleepActivity) {
        this.f60896a = hilt_SleepActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f60896a.inject();
    }
}
