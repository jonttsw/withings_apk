package com.withings.cycletracking.ui.viewmodel;

import com.withings.cycletracking.ui.e2;
import com.withings.features.FeatureFlag;
import com.withings.graph.GraphPeriod;
import dn.b;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* compiled from: CycleTrackingViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.cycletracking.ui.viewmodel.CycleTrackingViewModel$uiState$1", f = "CycleTrackingViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class t extends kotlin.coroutines.jvm.internal.i implements ym0.s<e2.c.C0470c, List<? extends b.InterfaceC0847b>, List<? extends wm.f>, PredictionState, qm0.d<? super e2.c>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ e2.c.C0470c f35944a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ List f35945b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ List f35946c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ PredictionState f35947d;

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        e2.c.C0470c c0470c = this.f35944a;
        List list = this.f35945b;
        List list2 = this.f35946c;
        PredictionState predictionState = this.f35947d;
        GraphPeriod[] graphPeriodArr = new GraphPeriod[2];
        graphPeriodArr[0] = GraphPeriod.f39502b;
        GraphPeriod graphPeriod = GraphPeriod.f39504d;
        if (!wr.b.c(FeatureFlag.f39108e)) {
            graphPeriod = null;
        }
        graphPeriodArr[1] = graphPeriod;
        return new e2.c(c0470c, list, list2, predictionState, kotlin.collections.l.z(graphPeriodArr));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.i, com.withings.cycletracking.ui.viewmodel.t] */
    @Override // ym0.s
    public final Object k(e2.c.C0470c c0470c, List<? extends b.InterfaceC0847b> list, List<? extends wm.f> list2, PredictionState predictionState, qm0.d<? super e2.c> dVar) {
        ?? iVar = new kotlin.coroutines.jvm.internal.i(5, dVar);
        iVar.f35944a = c0470c;
        iVar.f35945b = list;
        iVar.f35946c = list2;
        iVar.f35947d = predictionState;
        return iVar.invokeSuspend(nm0.y.f85009a);
    }
}
