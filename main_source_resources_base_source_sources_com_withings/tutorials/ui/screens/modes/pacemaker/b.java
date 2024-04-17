package com.withings.tutorials.ui.screens.modes.pacemaker;

import android.content.Context;
/* compiled from: Hilt_PacemakerModeActivity.java */
/* loaded from: classes4.dex */
final class b implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_PacemakerModeActivity f45713a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Hilt_PacemakerModeActivity hilt_PacemakerModeActivity) {
        this.f45713a = hilt_PacemakerModeActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f45713a.inject();
    }
}
