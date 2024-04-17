package com.withings.wiscale2.activity.workout.live.ui;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import org.joda.time.DateTime;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LiveWorkoutViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.live.ui.LiveWorkoutViewModel$pausedOrResumedFromPhone$1", f = "LiveWorkoutViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_MUSCLE_MASS_SEGMENT}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class a1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f48850a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ z0 f48851b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(z0 z0Var, qm0.d<? super a1> dVar) {
        super(2, dVar);
        this.f48851b = z0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new a1(this.f48851b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((a1) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f48850a;
        z0 z0Var = this.f48851b;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            Boolean bool = (Boolean) z0Var.f48962n.getValue();
            if (bool != null && !bool.booleanValue()) {
                z0Var.Q = DateTime.now();
                this.f48850a = 1;
                if (z0.M0(z0Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                z0Var.y1(false, false);
                return nm0.y.f85009a;
            }
        }
        xw.d.e(z0Var.f48962n, Boolean.TRUE);
        z0Var.f48954f.m(z0Var.c1());
        return nm0.y.f85009a;
    }
}
