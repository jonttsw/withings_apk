package com.withings.measurements.ui;

import fz.a;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* compiled from: HealthVerticalViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.measurements.ui.SleepVerticalViewModel$buildCriterias$1", f = "HealthVerticalViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class o2 extends kotlin.coroutines.jvm.internal.i implements ym0.q<a.k, a.j, qm0.d<? super List<? extends fz.a>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ a.k f42117a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ a.j f42118b;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.measurements.ui.o2, kotlin.coroutines.jvm.internal.i] */
    @Override // ym0.q
    public final Object invoke(a.k kVar, a.j jVar, qm0.d<? super List<? extends fz.a>> dVar) {
        ?? iVar = new kotlin.coroutines.jvm.internal.i(3, dVar);
        iVar.f42117a = kVar;
        iVar.f42118b = jVar;
        return iVar.invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        return kotlin.collections.x.W(this.f42117a, this.f42118b);
    }
}
