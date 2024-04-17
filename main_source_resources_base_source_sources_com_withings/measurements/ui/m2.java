package com.withings.measurements.ui;

import fz.a;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* compiled from: HealthVerticalViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.measurements.ui.NutritionVerticalViewModel$buildCriterias$1", f = "HealthVerticalViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class m2 extends kotlin.coroutines.jvm.internal.i implements ym0.s<a.h, a.p, a.i, a.l, qm0.d<? super List<? extends fz.a>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ a.h f42078a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ a.p f42079b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ a.i f42080c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ a.l f42081d;

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        return kotlin.collections.x.W(this.f42078a, this.f42079b, this.f42080c, this.f42081d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.measurements.ui.m2, kotlin.coroutines.jvm.internal.i] */
    @Override // ym0.s
    public final Object k(a.h hVar, a.p pVar, a.i iVar, a.l lVar, qm0.d<? super List<? extends fz.a>> dVar) {
        ?? iVar2 = new kotlin.coroutines.jvm.internal.i(5, dVar);
        iVar2.f42078a = hVar;
        iVar2.f42079b = pVar;
        iVar2.f42080c = iVar;
        iVar2.f42081d = lVar;
        return iVar2.invokeSuspend(nm0.y.f85009a);
    }
}
