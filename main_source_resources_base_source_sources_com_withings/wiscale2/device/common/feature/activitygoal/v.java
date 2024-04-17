package com.withings.wiscale2.device.common.feature.activitygoal;

import android.content.Context;
/* compiled from: Hilt_SetFitnessAndStepsGoalActivity.java */
/* loaded from: classes5.dex */
final class v implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_SetFitnessAndStepsGoalActivity f50966a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(Hilt_SetFitnessAndStepsGoalActivity hilt_SetFitnessAndStepsGoalActivity) {
        this.f50966a = hilt_SetFitnessAndStepsGoalActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f50966a.inject();
    }
}
