package com.withings.wiscale2.vascularage;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: Merge.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.vascularage.VascularAgeViewModel$special$$inlined$flatMapLatest$1", f = "VascularAgeViewModel.kt", l = {193}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class c1 extends kotlin.coroutines.jvm.internal.i implements ym0.q<FlowCollector<? super h>, Boolean, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f62256a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ FlowCollector f62257b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f62258c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ r0 f62259d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(r0 r0Var, qm0.d dVar) {
        super(3, dVar);
        this.f62259d = r0Var;
    }

    @Override // ym0.q
    public final Object invoke(FlowCollector<? super h> flowCollector, Boolean bool, qm0.d<? super nm0.y> dVar) {
        c1 c1Var = new c1(this.f62259d, dVar);
        c1Var.f62257b = flowCollector;
        c1Var.f62258c = bool;
        return c1Var.invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Flow flowOf;
        StateFlow stateFlow;
        SharedFlow sharedFlow;
        SharedFlow sharedFlow2;
        StateFlow stateFlow2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f62256a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            FlowCollector flowCollector = this.f62257b;
            if (((Boolean) this.f62258c).booleanValue()) {
                r0 r0Var = this.f62259d;
                stateFlow = r0Var.f62464y;
                sharedFlow = r0Var.f62459t;
                sharedFlow2 = r0Var.f62465z;
                stateFlow2 = r0Var.f62463x;
                flowOf = FlowKt.combine(stateFlow, sharedFlow, sharedFlow2, stateFlow2, new y0(r0Var, null));
            } else {
                flowOf = FlowKt.flowOf(null);
            }
            this.f62256a = 1;
            if (FlowKt.emitAll(flowCollector, flowOf, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
