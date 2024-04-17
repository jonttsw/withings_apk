package com.withings.measurements.ui;

import fz.a;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* compiled from: HealthVerticalViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.measurements.ui.BodyVerticalViewModel$buildCriterias$1", f = "HealthVerticalViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class b extends kotlin.coroutines.jvm.internal.i implements ym0.q<a.c, a.d, qm0.d<? super List<? extends fz.a>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ a.c f42018a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ a.d f42019b;

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.i, com.withings.measurements.ui.b] */
    @Override // ym0.q
    public final Object invoke(a.c cVar, a.d dVar, qm0.d<? super List<? extends fz.a>> dVar2) {
        ?? iVar = new kotlin.coroutines.jvm.internal.i(3, dVar2);
        iVar.f42018a = cVar;
        iVar.f42019b = dVar;
        return iVar.invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        return kotlin.collections.x.W(this.f42018a, this.f42019b);
    }
}
