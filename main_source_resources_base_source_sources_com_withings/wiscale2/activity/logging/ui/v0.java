package com.withings.wiscale2.activity.logging.ui;

import android.content.Context;
/* compiled from: Hilt_EditWorkoutActivity.java */
/* loaded from: classes4.dex */
final class v0 implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_EditWorkoutActivity f48462a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v0(Hilt_EditWorkoutActivity hilt_EditWorkoutActivity) {
        this.f48462a = hilt_EditWorkoutActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f48462a.inject();
    }
}
