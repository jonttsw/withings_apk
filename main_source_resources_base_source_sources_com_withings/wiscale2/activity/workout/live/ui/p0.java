package com.withings.wiscale2.activity.workout.live.ui;

import com.withings.views.view.HorizontalScaleView;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LiveWorkoutViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.live.ui.LiveWorkoutViewModel$horizontalScaleLiveData$1", f = "LiveWorkoutViewModel.kt", l = {91}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class p0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<HorizontalScaleView.e>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f48917a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f48918b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ z0 f48919c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(z0 z0Var, qm0.d<? super p0> dVar) {
        super(2, dVar);
        this.f48919c = z0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        p0 p0Var = new p0(this.f48919c, dVar);
        p0Var.f48918b = obj;
        return p0Var;
    }

    @Override // ym0.p
    public final Object invoke(androidx.lifecycle.h0<HorizontalScaleView.e> h0Var, qm0.d<? super nm0.y> dVar) {
        return ((p0) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f48917a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            HorizontalScaleView.e F0 = z0.F0(this.f48919c);
            this.f48917a = 1;
            if (((androidx.lifecycle.h0) this.f48918b).emit(F0, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
