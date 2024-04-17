package com.withings.wiscale2.dashboard;

import androidx.lifecycle.h0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import nm0.y;
/* compiled from: DashboardViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.dashboard.DashboardViewModel$emptyMetricsEnabled$1$1", f = "DashboardViewModel.kt", l = {56, 56}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class o extends kotlin.coroutines.jvm.internal.i implements ym0.p<h0<Boolean>, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f50596a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f50597b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ wg0.a f50598c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(wg0.a aVar, qm0.d<? super o> dVar) {
        super(2, dVar);
        this.f50598c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        o oVar = new o(this.f50598c, dVar);
        oVar.f50597b = obj;
        return oVar;
    }

    @Override // ym0.p
    public final Object invoke(h0<Boolean> h0Var, qm0.d<? super y> dVar) {
        return ((o) create(h0Var, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        h0 h0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f50596a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    nm0.l.b(obj);
                    return y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h0Var = (h0) this.f50597b;
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            h0Var = (h0) this.f50597b;
            this.f50597b = h0Var;
            this.f50596a = 1;
            obj = this.f50598c.a(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        this.f50597b = null;
        this.f50596a = 2;
        if (h0Var.emit(obj, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return y.f85009a;
    }
}
