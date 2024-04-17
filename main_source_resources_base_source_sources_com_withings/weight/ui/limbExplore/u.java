package com.withings.weight.ui.limbExplore;

import com.withings.graph.GraphPeriod;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import org.joda.time.Interval;
/* compiled from: SegmentalLimbExploreViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.ui.limbExplore.SegmentalLimbExploreViewModel$onAfterViewportChanged$1", f = "SegmentalLimbExploreViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_IGLUCOSE_BLOOD_GLUCOSE}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class u extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    MutableStateFlow f47723a;

    /* renamed from: b  reason: collision with root package name */
    int f47724b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ GraphPeriod f47725c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ a0 f47726d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Interval f47727e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(GraphPeriod graphPeriod, a0 a0Var, Interval interval, qm0.d<? super u> dVar) {
        super(2, dVar);
        this.f47725c = graphPeriod;
        this.f47726d = a0Var;
        this.f47727e = interval;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new u(this.f47725c, this.f47726d, this.f47727e, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((u) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        SharedFlow sharedFlow;
        MutableStateFlow mutableStateFlow3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f47724b;
        if (i11 != 0) {
            if (i11 == 1) {
                mutableStateFlow3 = this.f47723a;
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            GraphPeriod graphPeriod = GraphPeriod.f39507g;
            GraphPeriod graphPeriod2 = this.f47725c;
            a0 a0Var = this.f47726d;
            if (graphPeriod2 == graphPeriod) {
                mutableStateFlow2 = a0Var.f47672h;
                sharedFlow = a0Var.f47674j;
                this.f47723a = mutableStateFlow2;
                this.f47724b = 1;
                Object last = FlowKt.last(sharedFlow, this);
                if (last == coroutineSingletons) {
                    return coroutineSingletons;
                }
                mutableStateFlow3 = mutableStateFlow2;
                obj = last;
            } else {
                mutableStateFlow = a0Var.f47672h;
                mutableStateFlow.setValue(this.f47727e);
                return nm0.y.f85009a;
            }
        }
        mutableStateFlow3.setValue(obj);
        return nm0.y.f85009a;
    }
}
