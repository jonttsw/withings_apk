package com.withings.wiscale2.activity.workout.live.ui;
/* compiled from: LiveWorkoutActivity.kt */
/* loaded from: classes4.dex */
final class l extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LiveWorkoutActivity f48907a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(LiveWorkoutActivity liveWorkoutActivity) {
        super(2);
        this.f48907a = liveWorkoutActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            yk.o.b(false, s1.b.b(aVar2, 874102773, new k(this.f48907a)), aVar2, 48, 1);
        }
        return nm0.y.f85009a;
    }
}
