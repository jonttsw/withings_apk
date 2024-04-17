package com.withings.weight.presentation.ui;

import com.withings.graph.model.NormalityZoneUiModel;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import m90.f;
/* compiled from: WeightActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.ui.WeightActivity$getUiStateFlow$bmiStateFlow$1", f = "WeightActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class b0 extends kotlin.coroutines.jvm.internal.i implements ym0.r<f90.d, m90.h<m90.a>, NormalityZoneUiModel, qm0.d<? super f.b.d>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ f90.d f47208a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ m90.h f47209b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ NormalityZoneUiModel f47210c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ WeightActivity f47211d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(WeightActivity weightActivity, qm0.d<? super b0> dVar) {
        super(4, dVar);
        this.f47211d = weightActivity;
    }

    @Override // ym0.r
    public final Object invoke(f90.d dVar, m90.h<m90.a> hVar, NormalityZoneUiModel normalityZoneUiModel, qm0.d<? super f.b.d> dVar2) {
        b0 b0Var = new b0(this.f47211d, dVar2);
        b0Var.f47208a = dVar;
        b0Var.f47209b = hVar;
        b0Var.f47210c = normalityZoneUiModel;
        return b0Var.invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        f90.d dVar = this.f47208a;
        m90.h hVar = this.f47209b;
        NormalityZoneUiModel normalityZoneUiModel = this.f47210c;
        WeightActivity weightActivity = this.f47211d;
        return new f.b.d(dVar, n90.u.b(hVar, weightActivity), n90.u.a(hVar, weightActivity, normalityZoneUiModel), normalityZoneUiModel);
    }
}
