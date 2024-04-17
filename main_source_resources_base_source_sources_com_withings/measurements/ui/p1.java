package com.withings.measurements.ui;

import fz.a;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* compiled from: HealthVerticalViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.measurements.ui.HeartVerticalViewModel$buildCriterias$1", f = "HealthVerticalViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class p1 extends kotlin.coroutines.jvm.internal.i implements ym0.s<a.g, a.b, a.o, a.e, qm0.d<? super List<? extends fz.a>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ a.g f42119a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ a.b f42120b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ a.o f42121c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ a.e f42122d;

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        a.g gVar = this.f42119a;
        return kotlin.collections.x.W(this.f42120b, this.f42122d, gVar, this.f42121c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.i, com.withings.measurements.ui.p1] */
    @Override // ym0.s
    public final Object k(a.g gVar, a.b bVar, a.o oVar, a.e eVar, qm0.d<? super List<? extends fz.a>> dVar) {
        ?? iVar = new kotlin.coroutines.jvm.internal.i(5, dVar);
        iVar.f42119a = gVar;
        iVar.f42120b = bVar;
        iVar.f42121c = oVar;
        iVar.f42122d = eVar;
        return iVar.invokeSuspend(nm0.y.f85009a);
    }
}
