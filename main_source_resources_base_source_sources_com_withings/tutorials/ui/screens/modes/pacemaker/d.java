package com.withings.tutorials.ui.screens.modes.pacemaker;

import k1.r0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import nm0.y;
import ym0.p;
/* compiled from: PacemakerMode.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.tutorials.ui.screens.modes.pacemaker.PacemakerMode$ActivatePacemakerScreen$2$1", f = "PacemakerMode.kt", l = {103}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class d extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f45756a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PacemakerModeViewModel f45757b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<y> f45758c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ r0<Boolean> f45759d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(PacemakerModeViewModel pacemakerModeViewModel, ym0.a<y> aVar, r0<Boolean> r0Var, qm0.d<? super d> dVar) {
        super(2, dVar);
        this.f45757b = pacemakerModeViewModel;
        this.f45758c = aVar;
        this.f45759d = r0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new d(this.f45757b, this.f45758c, this.f45759d, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((d) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f45756a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            SharedFlow<Boolean> m02 = this.f45757b.m0();
            this.f45756a = 1;
            obj = FlowKt.first(m02, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            this.f45759d.setValue(Boolean.TRUE);
        } else {
            this.f45758c.invoke();
        }
        return y.f85009a;
    }
}
