package com.withings.cycletracking.ui.viewmodel;

import com.withings.cycletracking.ui.viewmodel.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CycleTrackingHistoryViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.cycletracking.ui.viewmodel.CycleTrackingHistoryViewModel$state$1", f = "CycleTrackingHistoryViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class i extends kotlin.coroutines.jvm.internal.i implements ym0.p<List<? extends wm.f>, qm0.d<? super h.a>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f35900a;

    i() {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.cycletracking.ui.viewmodel.i, kotlin.coroutines.jvm.internal.i, qm0.d<nm0.y>] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        ?? iVar = new kotlin.coroutines.jvm.internal.i(2, dVar);
        iVar.f35900a = obj;
        return iVar;
    }

    @Override // ym0.p
    public final Object invoke(List<? extends wm.f> list, qm0.d<? super h.a> dVar) {
        return ((i) create(list, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, java.util.Comparator] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        List list = (List) this.f35900a;
        kotlin.jvm.internal.u.j(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            wm.f fVar = (wm.f) obj2;
            if (m0.t.t(fVar.b()) && fVar.d()) {
                arrayList.add(obj2);
            }
        }
        return new h.a(kotlin.collections.x.D0(arrayList, new Object()));
    }
}
