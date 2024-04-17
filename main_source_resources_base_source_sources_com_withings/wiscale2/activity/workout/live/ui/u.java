package com.withings.wiscale2.activity.workout.live.ui;

import java.util.TimerTask;
/* compiled from: LiveWorkoutActivity.kt */
/* loaded from: classes4.dex */
public final class u extends TimerTask {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f48933b = 0;

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LiveWorkoutActivity f48934a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(LiveWorkoutActivity liveWorkoutActivity) {
        this.f48934a = liveWorkoutActivity;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        LiveWorkoutActivity liveWorkoutActivity = this.f48934a;
        liveWorkoutActivity.runOnUiThread(new x.o(liveWorkoutActivity, 2));
    }
}
