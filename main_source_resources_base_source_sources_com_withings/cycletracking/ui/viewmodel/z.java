package com.withings.cycletracking.ui.viewmodel;

import bk.e;
import dn.b;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* compiled from: VerticalCalendarPeriodLogViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.cycletracking.ui.viewmodel.VerticalCalendarPeriodLogViewModel$uiDailyGraphViewItems$1", f = "VerticalCalendarPeriodLogViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class z extends kotlin.coroutines.jvm.internal.i implements ym0.p<List<? extends b.a>, qm0.d<? super List<? extends e.o>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f35975a;

    z() {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.cycletracking.ui.viewmodel.z, kotlin.coroutines.jvm.internal.i, qm0.d<nm0.y>] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        ?? iVar = new kotlin.coroutines.jvm.internal.i(2, dVar);
        iVar.f35975a = obj;
        return iVar;
    }

    @Override // ym0.p
    public final Object invoke(List<? extends b.a> list, qm0.d<? super List<? extends e.o>> dVar) {
        return ((z) create(list, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        return dn.d.a((List) this.f35975a);
    }
}
