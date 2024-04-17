package com.withings.wiscale2.activity.workout.ui.detail;

import android.content.Context;
/* compiled from: Hilt_AllWorkoutsActivity.java */
/* loaded from: classes4.dex */
final class y implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_AllWorkoutsActivity f49823a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(Hilt_AllWorkoutsActivity hilt_AllWorkoutsActivity) {
        this.f49823a = hilt_AllWorkoutsActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f49823a.inject();
    }
}
