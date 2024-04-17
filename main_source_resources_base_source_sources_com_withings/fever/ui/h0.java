package com.withings.fever.ui;

import com.withings.user.core.models.User;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: Merge.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.fever.ui.BodyTemperatureViewModel$special$$inlined$flatMapLatest$1", f = "BodyTemperatureViewModel.kt", l = {193}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class h0 extends kotlin.coroutines.jvm.internal.i implements ym0.q<FlowCollector<? super List<? extends as.h>>, User, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f39285a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ FlowCollector f39286b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f39287c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ o0 f39288d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(o0 o0Var, qm0.d dVar) {
        super(3, dVar);
        this.f39288d = o0Var;
    }

    @Override // ym0.q
    public final Object invoke(FlowCollector<? super List<? extends as.h>> flowCollector, User user, qm0.d<? super nm0.y> dVar) {
        h0 h0Var = new h0(this.f39288d, dVar);
        h0Var.f39286b = flowCollector;
        h0Var.f39287c = user;
        return h0Var.invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        iy.e eVar;
        ky.c cVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f39285a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            FlowCollector flowCollector = this.f39286b;
            User user = (User) this.f39287c;
            o0 o0Var = this.f39288d;
            eVar = o0Var.f39381a;
            cVar = o0Var.f39383c;
            n0 n0Var = new n0(iy.a.c(eVar, cVar, user.getId(), 71, null, null, null, false, false, null, 1528), o0Var, user);
            this.f39285a = 1;
            if (FlowKt.emitAll(flowCollector, n0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
