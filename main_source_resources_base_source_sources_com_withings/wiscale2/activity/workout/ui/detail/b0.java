package com.withings.wiscale2.activity.workout.ui.detail;

import android.content.Context;
/* compiled from: Hilt_WorkoutListActivity.java */
/* loaded from: classes4.dex */
final class b0 implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_WorkoutListActivity f49120a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b0(Hilt_WorkoutListActivity hilt_WorkoutListActivity) {
        this.f49120a = hilt_WorkoutListActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f49120a.inject();
    }
}
