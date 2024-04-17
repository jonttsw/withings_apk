package com.withings.tutorials.ui.screens.howtouse;

import android.content.Context;
/* compiled from: Hilt_HowToTakeAMeasurementActivity.java */
/* loaded from: classes4.dex */
final class b implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_HowToTakeAMeasurementActivity f45383a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Hilt_HowToTakeAMeasurementActivity hilt_HowToTakeAMeasurementActivity) {
        this.f45383a = hilt_HowToTakeAMeasurementActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f45383a.inject();
    }
}
