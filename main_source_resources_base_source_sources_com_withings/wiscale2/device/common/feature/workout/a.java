package com.withings.wiscale2.device.common.feature.workout;

import android.content.Context;
/* compiled from: Hilt_WorkoutTutorialActivity.java */
/* loaded from: classes5.dex */
final class a implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_WorkoutTutorialActivity f52653a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Hilt_WorkoutTutorialActivity hilt_WorkoutTutorialActivity) {
        this.f52653a = hilt_WorkoutTutorialActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f52653a.inject();
    }
}
