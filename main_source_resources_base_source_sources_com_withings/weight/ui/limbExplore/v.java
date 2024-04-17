package com.withings.weight.ui.limbExplore;

import com.withings.common.compose.component.m4;
import com.withings.weight.core.model.LimbModel;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import org.joda.time.DateTime;
import org.joda.time.Interval;
/* compiled from: Merge.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.ui.limbExplore.SegmentalLimbExploreViewModel$special$$inlined$flatMapLatest$1", f = "SegmentalLimbExploreViewModel.kt", l = {193}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class v extends kotlin.coroutines.jvm.internal.i implements ym0.q<FlowCollector<? super List<? extends m4>>, Interval, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f47728a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ FlowCollector f47729b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f47730c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ a0 f47731d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ LimbModel f47732e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ long f47733f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(qm0.d dVar, a0 a0Var, LimbModel limbModel, long j5) {
        super(3, dVar);
        this.f47731d = a0Var;
        this.f47732e = limbModel;
        this.f47733f = j5;
    }

    @Override // ym0.q
    public final Object invoke(FlowCollector<? super List<? extends m4>> flowCollector, Interval interval, qm0.d<? super nm0.y> dVar) {
        v vVar = new v(dVar, this.f47731d, this.f47732e, this.f47733f);
        vVar.f47729b = flowCollector;
        vVar.f47730c = interval;
        return vVar.invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Flow flowOf;
        v90.c cVar;
        SharedFlow sharedFlow;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f47728a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            FlowCollector flowCollector = this.f47729b;
            Interval interval = (Interval) this.f47730c;
            if (interval != null) {
                a0 a0Var = this.f47731d;
                cVar = a0Var.f47666b;
                DateTime start = interval.getStart();
                kotlin.jvm.internal.u.i(start, "getStart(...)");
                DateTime end = interval.getEnd();
                kotlin.jvm.internal.u.i(end, "getEnd(...)");
                v90.d c11 = cVar.c(this.f47732e, this.f47733f, start, end);
                sharedFlow = a0Var.f47671g;
                flowOf = FlowKt.combine(c11, sharedFlow, new t(a0Var, null));
            } else {
                flowOf = FlowKt.flowOf(kotlin.collections.x.W(new m4("--", null, null, null, 14), new m4("--", null, null, null, 14)));
            }
            this.f47728a = 1;
            if (FlowKt.emitAll(flowCollector, flowOf, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
