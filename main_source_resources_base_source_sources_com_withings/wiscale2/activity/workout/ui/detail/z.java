package com.withings.wiscale2.activity.workout.ui.detail;

import android.content.Context;
/* compiled from: Hilt_PostWorkoutActivity.java */
/* loaded from: classes4.dex */
final class z implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_PostWorkoutActivity f49832a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(Hilt_PostWorkoutActivity hilt_PostWorkoutActivity) {
        this.f49832a = hilt_PostWorkoutActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f49832a.inject();
    }
}
