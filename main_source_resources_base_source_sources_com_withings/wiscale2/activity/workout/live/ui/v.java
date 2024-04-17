package com.withings.wiscale2.activity.workout.live.ui;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LiveWorkoutActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.live.ui.LiveWorkoutActivity$stopWorkout$1", f = "LiveWorkoutActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class v extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LiveWorkoutActivity f48940a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f48941b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(LiveWorkoutActivity liveWorkoutActivity, boolean z5, qm0.d<? super v> dVar) {
        super(2, dVar);
        this.f48940a = liveWorkoutActivity;
        this.f48941b = z5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new v(this.f48940a, this.f48941b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((v) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        z0 U3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        LiveWorkoutActivity liveWorkoutActivity = this.f48940a;
        liveWorkoutActivity.X3(true);
        U3 = liveWorkoutActivity.U3();
        U3.y1(true, this.f48941b);
        return nm0.y.f85009a;
    }
}
