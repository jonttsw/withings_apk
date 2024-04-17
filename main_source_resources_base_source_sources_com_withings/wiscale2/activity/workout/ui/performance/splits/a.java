package com.withings.wiscale2.activity.workout.ui.performance.splits;

import android.content.Context;
/* compiled from: Hilt_WorkoutSplitsActivity.java */
/* loaded from: classes4.dex */
final class a implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_WorkoutSplitsActivity f49972a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Hilt_WorkoutSplitsActivity hilt_WorkoutSplitsActivity) {
        this.f49972a = hilt_WorkoutSplitsActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f49972a.inject();
    }
}
