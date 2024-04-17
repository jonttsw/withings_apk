package com.withings.wiscale2.vo2max.view;

import com.withings.library.measure.MeasuresGroup;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Vo2maxNote.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.vo2max.view.Vo2maxNoteViewModel$updateMeasureGroup$1", f = "Vo2maxNote.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class z1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a2 f62887a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MeasuresGroup f62888b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(a2 a2Var, MeasuresGroup measuresGroup, qm0.d<? super z1> dVar) {
        super(2, dVar);
        this.f62887a = a2Var;
        this.f62888b = measuresGroup;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new z1(this.f62887a, this.f62888b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((z1) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        fy.c0 c0Var;
        zx.r rVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        a2 a2Var = this.f62887a;
        c0Var = a2Var.f62688c;
        c0Var.b(hy.g.a(this.f62888b));
        rVar = a2Var.f62686a;
        rVar.run();
        return nm0.y.f85009a;
    }
}
