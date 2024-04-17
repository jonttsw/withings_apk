package com.withings.wiscale2.activity.workout.live.ui;
/* compiled from: LiveWorkoutActivity.kt */
/* loaded from: classes4.dex */
final class n extends kotlin.jvm.internal.w implements ym0.l<Boolean, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LiveWorkoutActivity f48911a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(LiveWorkoutActivity liveWorkoutActivity) {
        super(1);
        this.f48911a = liveWorkoutActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(Boolean bool) {
        Boolean bool2 = bool;
        if (bool2 != null) {
            LiveWorkoutActivity.O3(this.f48911a, bool2.booleanValue());
        }
        return nm0.y.f85009a;
    }
}
