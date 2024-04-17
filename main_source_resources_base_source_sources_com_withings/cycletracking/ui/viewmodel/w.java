package com.withings.cycletracking.ui.viewmodel;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import wm.d;
/* compiled from: VerticalCalendarPeriodLogViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.cycletracking.ui.viewmodel.VerticalCalendarPeriodLogViewModel$initialPeriodDaysList$1", f = "VerticalCalendarPeriodLogViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class w extends kotlin.coroutines.jvm.internal.i implements ym0.p<List<? extends wm.f>, qm0.d<? super List<? extends wm.f>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f35965a;

    w() {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.i, qm0.d<nm0.y>, com.withings.cycletracking.ui.viewmodel.w] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        ?? iVar = new kotlin.coroutines.jvm.internal.i(2, dVar);
        iVar.f35965a = obj;
        return iVar;
    }

    @Override // ym0.p
    public final Object invoke(List<? extends wm.f> list, qm0.d<? super List<? extends wm.f>> dVar) {
        return ((w) create(list, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        wm.f fVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        ArrayList arrayList = new ArrayList();
        for (wm.f fVar2 : (List) this.f35965a) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : fVar2.a()) {
                wm.d dVar = (wm.d) obj2;
                if (dVar instanceof d.C1823d) {
                    d.C1823d c1823d = (d.C1823d) dVar;
                    if (!c1823d.c() && c1823d.b()) {
                        arrayList2.add(obj2);
                    }
                }
            }
            if (arrayList2.isEmpty()) {
                fVar = null;
            } else {
                fVar = new wm.f(arrayList2);
            }
            if (fVar != null) {
                arrayList.add(fVar);
            }
        }
        return arrayList;
    }
}
