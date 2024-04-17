package com.withings.wiscale2.sleep.ui.sleepscore;

import android.content.Context;
/* compiled from: Hilt_SecondarySleepActivity.java */
/* loaded from: classes5.dex */
final class b implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_SecondarySleepActivity f60889a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Hilt_SecondarySleepActivity hilt_SecondarySleepActivity) {
        this.f60889a = hilt_SecondarySleepActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f60889a.inject();
    }
}
