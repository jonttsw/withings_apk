package com.withings.wiscale2.activity.workout.live.ui;

import android.widget.ImageButton;
/* compiled from: LiveWorkoutActivity.kt */
/* loaded from: classes4.dex */
final class o extends kotlin.jvm.internal.w implements ym0.l<Boolean, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LiveWorkoutActivity f48913a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(LiveWorkoutActivity liveWorkoutActivity) {
        super(1);
        this.f48913a = liveWorkoutActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(Boolean bool) {
        int i11;
        z0 U3;
        Boolean bool2 = bool;
        LiveWorkoutActivity liveWorkoutActivity = this.f48913a;
        ImageButton J3 = LiveWorkoutActivity.J3(liveWorkoutActivity);
        kotlin.jvm.internal.u.g(bool2);
        if (bool2.booleanValue()) {
            U3 = liveWorkoutActivity.U3();
            if (!U3.V0()) {
                i11 = 0;
                J3.setVisibility(i11);
                return nm0.y.f85009a;
            }
        }
        i11 = 8;
        J3.setVisibility(i11);
        return nm0.y.f85009a;
    }
}
