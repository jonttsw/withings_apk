package com.withings.wiscale2.heart.heartrate;

import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: HeartRateDayFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.heart.heartrate.HeartRateDayViewModel$deleteMeasures$1", f = "HeartRateDayFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class h0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e0 f57654a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ List<ky.d> f57655b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(e0 e0Var, List<ky.d> list, qm0.d<? super h0> dVar) {
        super(2, dVar);
        this.f57654a = e0Var;
        this.f57655b = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new h0(this.f57654a, this.f57655b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((h0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        fy.b bVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        e0 e0Var = this.f57654a;
        bVar = e0Var.f57593j;
        bVar.a(this.f57655b);
        e0Var.V0();
        return nm0.y.f85009a;
    }
}
