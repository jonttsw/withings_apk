package com.withings.wiscale2.activity.workout.ui.map;

import android.content.Context;
/* compiled from: Hilt_WorkoutMapActivity.java */
/* loaded from: classes4.dex */
final class a implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_WorkoutMapActivity f49871a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Hilt_WorkoutMapActivity hilt_WorkoutMapActivity) {
        this.f49871a = hilt_WorkoutMapActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f49871a.inject();
    }
}
