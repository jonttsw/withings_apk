package com.withings.weight.presentation.ui;

import com.withings.graph.model.NormalityZoneUiModel;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import m90.e;
/* compiled from: BodyCompositionActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.ui.BodyCompositionActivity$getSecondaryCardStateFlow$1", f = "BodyCompositionActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class d extends kotlin.coroutines.jvm.internal.i implements ym0.r<f90.d, m90.h<m90.d>, NormalityZoneUiModel, qm0.d<? super e.b.f>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ f90.d f47217a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ m90.h f47218b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ NormalityZoneUiModel f47219c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ BodyCompositionActivity f47220d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(BodyCompositionActivity bodyCompositionActivity, qm0.d<? super d> dVar) {
        super(4, dVar);
        this.f47220d = bodyCompositionActivity;
    }

    @Override // ym0.r
    public final Object invoke(f90.d dVar, m90.h<m90.d> hVar, NormalityZoneUiModel normalityZoneUiModel, qm0.d<? super e.b.f> dVar2) {
        d dVar3 = new d(this.f47220d, dVar2);
        dVar3.f47217a = dVar;
        dVar3.f47218b = hVar;
        dVar3.f47219c = normalityZoneUiModel;
        return dVar3.invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        f90.d dVar = this.f47217a;
        m90.h hVar = this.f47218b;
        NormalityZoneUiModel normalityZoneUiModel = this.f47219c;
        BodyCompositionActivity bodyCompositionActivity = this.f47220d;
        return new e.b.f(dVar, n90.u.b(hVar, bodyCompositionActivity), n90.u.a(hVar, bodyCompositionActivity, normalityZoneUiModel), normalityZoneUiModel);
    }
}
