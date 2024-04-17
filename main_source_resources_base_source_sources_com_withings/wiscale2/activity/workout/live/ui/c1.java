package com.withings.wiscale2.activity.workout.live.ui;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LiveWorkoutViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.live.ui.LiveWorkoutViewModel$sendResumeCommand$1", f = "LiveWorkoutViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class c1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ z0 f48862a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f48863b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(z0 z0Var, int i11, qm0.d<? super c1> dVar) {
        super(2, dVar);
        this.f48862a = z0Var;
        this.f48863b = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new c1(this.f48862a, this.f48863b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((c1) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ax.c cVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        z0 z0Var = this.f48862a;
        z0.T0(z0Var, this.f48863b);
        if (z0Var.c1().getPauseState() != null) {
            if (!z0Var.c1().isInAppWorkout()) {
                cVar = z0Var.f48958j;
                cVar.a(z0Var.c1());
            }
            xw.d.e(z0Var.f48962n, Boolean.valueOf(z0Var.c1().isInPause()));
            z0Var.f48954f.m(z0Var.c1());
        }
        return nm0.y.f85009a;
    }
}
