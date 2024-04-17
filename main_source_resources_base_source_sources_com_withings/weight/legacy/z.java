package com.withings.weight.legacy;

import fy.c0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WeightDetailFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.legacy.WeightDetailViewModel$updateMeasureGroup$1", f = "WeightDetailFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class z extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a0 f47092a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ky.d f47093b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(a0 a0Var, ky.d dVar, qm0.d<? super z> dVar2) {
        super(2, dVar2);
        this.f47092a = a0Var;
        this.f47093b = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new z(this.f47092a, this.f47093b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((z) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        c0 c0Var;
        zx.r rVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        a0 a0Var = this.f47092a;
        c0Var = a0Var.f47025b;
        c0Var.b(this.f47093b);
        rVar = a0Var.f47026c;
        rVar.run();
        return nm0.y.f85009a;
    }
}
