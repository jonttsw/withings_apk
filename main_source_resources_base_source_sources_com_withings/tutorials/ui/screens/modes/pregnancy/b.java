package com.withings.tutorials.ui.screens.modes.pregnancy;

import android.content.Context;
/* compiled from: Hilt_PregnancyModeActivity.java */
/* loaded from: classes4.dex */
final class b implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_PregnancyModeActivity f45844a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Hilt_PregnancyModeActivity hilt_PregnancyModeActivity) {
        this.f45844a = hilt_PregnancyModeActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f45844a.inject();
    }
}
