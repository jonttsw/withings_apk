package com.withings.manualLogging.ui.feature.addNote.cycle;

import android.content.Context;
/* compiled from: Hilt_CycleTrackingSymptomsAndPeriodManualLoggingActivity.java */
/* loaded from: classes4.dex */
final class s4 implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_CycleTrackingSymptomsAndPeriodManualLoggingActivity f41217a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s4(Hilt_CycleTrackingSymptomsAndPeriodManualLoggingActivity hilt_CycleTrackingSymptomsAndPeriodManualLoggingActivity) {
        this.f41217a = hilt_CycleTrackingSymptomsAndPeriodManualLoggingActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f41217a.inject();
    }
}
