package com.withings.manualLogging.ui.feature.addNote.cycle;

import android.content.Context;
/* compiled from: Hilt_CycleOnBoardingManualLoggingActivity.java */
/* loaded from: classes4.dex */
final class r4 implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_CycleOnBoardingManualLoggingActivity f41201a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r4(Hilt_CycleOnBoardingManualLoggingActivity hilt_CycleOnBoardingManualLoggingActivity) {
        this.f41201a = hilt_CycleOnBoardingManualLoggingActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f41201a.inject();
    }
}
