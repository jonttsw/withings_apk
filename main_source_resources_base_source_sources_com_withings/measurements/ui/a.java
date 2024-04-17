package com.withings.measurements.ui;

import fz.a;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* compiled from: HealthVerticalViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.measurements.ui.ActivityVerticalViewModel$buildCriterias$1", f = "HealthVerticalViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class a extends kotlin.coroutines.jvm.internal.i implements ym0.q<a.m, a.InterfaceC0950a, qm0.d<? super List<? extends fz.a>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ a.m f42016a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ a.InterfaceC0950a f42017b;

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.i, com.withings.measurements.ui.a] */
    @Override // ym0.q
    public final Object invoke(a.m mVar, a.InterfaceC0950a interfaceC0950a, qm0.d<? super List<? extends fz.a>> dVar) {
        ?? iVar = new kotlin.coroutines.jvm.internal.i(3, dVar);
        iVar.f42016a = mVar;
        iVar.f42017b = interfaceC0950a;
        return iVar.invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        return kotlin.collections.x.W(this.f42016a, this.f42017b);
    }
}
