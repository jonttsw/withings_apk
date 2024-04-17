package com.withings.cycletracking.ui.viewmodel;

import com.withings.cycletracking.ui.e2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* compiled from: CycleTrackingViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.cycletracking.ui.viewmodel.CycleTrackingViewModel$optionState$1", f = "CycleTrackingViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class q extends kotlin.coroutines.jvm.internal.i implements ym0.q<Integer, wm.j, qm0.d<? super e2.c.b>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Integer f35933a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ wm.j f35934b;

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.i, com.withings.cycletracking.ui.viewmodel.q] */
    @Override // ym0.q
    public final Object invoke(Integer num, wm.j jVar, qm0.d<? super e2.c.b> dVar) {
        ?? iVar = new kotlin.coroutines.jvm.internal.i(3, dVar);
        iVar.f35933a = num;
        iVar.f35934b = jVar;
        return iVar.invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        Integer num = this.f35933a;
        wm.j jVar = this.f35934b;
        return new e2.c.b(num, jVar.c(), jVar.b());
    }
}
