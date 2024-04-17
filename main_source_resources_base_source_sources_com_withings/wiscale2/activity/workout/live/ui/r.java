package com.withings.wiscale2.activity.workout.live.ui;
/* compiled from: LiveWorkoutActivity.kt */
/* loaded from: classes4.dex */
final class r extends kotlin.jvm.internal.w implements ym0.l<Boolean, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LiveWorkoutActivity f48922a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(LiveWorkoutActivity liveWorkoutActivity) {
        super(1);
        this.f48922a = liveWorkoutActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(Boolean bool) {
        Boolean bool2 = bool;
        if (bool2 != null) {
            LiveWorkoutActivity.M3(this.f48922a, bool2.booleanValue());
        }
        return nm0.y.f85009a;
    }
}
