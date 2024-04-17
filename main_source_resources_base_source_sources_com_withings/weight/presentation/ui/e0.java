package com.withings.weight.presentation.ui;

import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* compiled from: WeightActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.ui.WeightActivity$getUiStateFlow$graphsFlow$1", f = "WeightActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class e0 extends kotlin.coroutines.jvm.internal.i implements ym0.q<f90.e, Boolean, qm0.d<? super List<? extends ts.d>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ f90.e f47233a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ boolean f47234b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ WeightActivity f47235c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(WeightActivity weightActivity, qm0.d<? super e0> dVar) {
        super(3, dVar);
        this.f47235c = weightActivity;
    }

    @Override // ym0.q
    public final Object invoke(f90.e eVar, Boolean bool, qm0.d<? super List<? extends ts.d>> dVar) {
        boolean booleanValue = bool.booleanValue();
        e0 e0Var = new e0(this.f47235c, dVar);
        e0Var.f47233a = eVar;
        e0Var.f47234b = booleanValue;
        return e0Var.invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        f90.e eVar = this.f47233a;
        boolean z5 = this.f47234b;
        WeightActivity weightActivity = this.f47235c;
        n90.q qVar = weightActivity.f47149g;
        if (qVar != null) {
            return qVar.c(eVar, WeightActivity.C3(weightActivity), WeightActivity.z3(weightActivity), z5);
        }
        kotlin.jvm.internal.u.s("createWeightGraphs");
        throw null;
    }
}
