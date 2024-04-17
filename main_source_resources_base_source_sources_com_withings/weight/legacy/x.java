package com.withings.weight.legacy;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WeightDetailFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.legacy.WeightDetailViewModel$deleteMeasure$1", f = "WeightDetailFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class x extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a0 f47086a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ky.d f47087b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(a0 a0Var, ky.d dVar, qm0.d<? super x> dVar2) {
        super(2, dVar2);
        this.f47086a = a0Var;
        this.f47087b = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new x(this.f47086a, this.f47087b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((x) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        fy.a aVar;
        zx.r rVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        a0 a0Var = this.f47086a;
        aVar = a0Var.f47024a;
        aVar.b(this.f47087b);
        rVar = a0Var.f47026c;
        rVar.run();
        a0Var.m0().postValue(Boolean.TRUE);
        return nm0.y.f85009a;
    }
}
