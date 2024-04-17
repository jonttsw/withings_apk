package com.withings.tutorials.ui.screens.modes.athlete;

import android.content.Context;
/* compiled from: Hilt_AthleteModeActivity.java */
/* loaded from: classes4.dex */
final class p implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_AthleteModeActivity f45608a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(Hilt_AthleteModeActivity hilt_AthleteModeActivity) {
        this.f45608a = hilt_AthleteModeActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f45608a.inject();
    }
}
