package com.withings.tutorials.ui.screens.modes.eyesclosed;

import android.content.Context;
/* compiled from: Hilt_EyesClosedModeActivity.java */
/* loaded from: classes4.dex */
final class o implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_EyesClosedModeActivity f45691a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(Hilt_EyesClosedModeActivity hilt_EyesClosedModeActivity) {
        this.f45691a = hilt_EyesClosedModeActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f45691a.inject();
    }
}
