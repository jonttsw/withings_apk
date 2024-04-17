package com.withings.cycletracking.ui.viewmodel;

import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* compiled from: CycleTrackingViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.cycletracking.ui.viewmodel.CycleTrackingViewModel$inDepthCardUiModel$1", f = "CycleTrackingViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class o extends kotlin.coroutines.jvm.internal.i implements ym0.s<en.k, en.n, en.c, List<? extends Integer>, qm0.d<? super en.l>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ en.k f35926a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ en.n f35927b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ en.c f35928c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ List f35929d;

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        return new en.l(this.f35928c, this.f35929d, this.f35926a, this.f35927b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.cycletracking.ui.viewmodel.o, kotlin.coroutines.jvm.internal.i] */
    @Override // ym0.s
    public final Object k(en.k kVar, en.n nVar, en.c cVar, List<? extends Integer> list, qm0.d<? super en.l> dVar) {
        ?? iVar = new kotlin.coroutines.jvm.internal.i(5, dVar);
        iVar.f35926a = kVar;
        iVar.f35927b = nVar;
        iVar.f35928c = cVar;
        iVar.f35929d = list;
        return iVar.invokeSuspend(nm0.y.f85009a);
    }
}
