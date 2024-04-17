package com.withings.wiscale2.activity.workout.live.ui;
/* compiled from: View.kt */
/* loaded from: classes4.dex */
public final class t implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LiveWorkoutActivity f48930a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f48931b;

    public t(LiveWorkoutActivity liveWorkoutActivity, long j5) {
        this.f48930a = liveWorkoutActivity;
        this.f48931b = j5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LiveWorkoutActivity.G3(this.f48930a).animate().setDuration(this.f48931b).alpha(0.0f);
    }
}
