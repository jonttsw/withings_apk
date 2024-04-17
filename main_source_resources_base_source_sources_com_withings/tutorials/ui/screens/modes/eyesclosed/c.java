package com.withings.tutorials.ui.screens.modes.eyesclosed;

import k1.r0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import nm0.y;
import ym0.p;
/* compiled from: EyesClosedMode.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.tutorials.ui.screens.modes.eyesclosed.EyesClosedMode$ActivationScreen$2$1", f = "EyesClosedMode.kt", l = {105}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class c extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f45672a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ EyesClosedModeViewModel f45673b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<y> f45674c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ r0<Boolean> f45675d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(EyesClosedModeViewModel eyesClosedModeViewModel, ym0.a<y> aVar, r0<Boolean> r0Var, qm0.d<? super c> dVar) {
        super(2, dVar);
        this.f45673b = eyesClosedModeViewModel;
        this.f45674c = aVar;
        this.f45675d = r0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new c(this.f45673b, this.f45674c, this.f45675d, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((c) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f45672a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            SharedFlow<Boolean> m02 = this.f45673b.m0();
            this.f45672a = 1;
            obj = FlowKt.first(m02, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            this.f45675d.setValue(Boolean.TRUE);
        } else {
            this.f45674c.invoke();
        }
        return y.f85009a;
    }
}
