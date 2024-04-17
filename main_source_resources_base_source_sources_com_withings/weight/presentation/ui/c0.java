package com.withings.weight.presentation.ui;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import m90.f;
/* compiled from: WeightActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.ui.WeightActivity$getUiStateFlow$bmrStateFlow$1", f = "WeightActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class c0 extends kotlin.coroutines.jvm.internal.i implements ym0.q<f90.d, m90.h<m90.b>, qm0.d<? super f.b.d>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ f90.d f47214a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ m90.h f47215b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ WeightActivity f47216c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(WeightActivity weightActivity, qm0.d<? super c0> dVar) {
        super(3, dVar);
        this.f47216c = weightActivity;
    }

    @Override // ym0.q
    public final Object invoke(f90.d dVar, m90.h<m90.b> hVar, qm0.d<? super f.b.d> dVar2) {
        c0 c0Var = new c0(this.f47216c, dVar2);
        c0Var.f47214a = dVar;
        c0Var.f47215b = hVar;
        return c0Var.invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        f90.d dVar = this.f47214a;
        m90.h hVar = this.f47215b;
        WeightActivity weightActivity = this.f47216c;
        return new f.b.d(dVar, n90.u.b(hVar, weightActivity), n90.u.a(hVar, weightActivity, null), null);
    }
}
