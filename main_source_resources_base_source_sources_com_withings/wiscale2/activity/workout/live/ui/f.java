package com.withings.wiscale2.activity.workout.live.ui;

import android.content.Context;
/* compiled from: Hilt_LiveWorkoutActivity.java */
/* loaded from: classes4.dex */
final class f implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_LiveWorkoutActivity f48882a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(Hilt_LiveWorkoutActivity hilt_LiveWorkoutActivity) {
        this.f48882a = hilt_LiveWorkoutActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f48882a.inject();
    }
}
