package com.withings.weight.ui.limbExplore;

import com.withings.weight.android.model.SegmentalBodyCompositionMeasureType;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowCollector;
import org.joda.time.Interval;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SegmentalLimbExploreViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.ui.limbExplore.SegmentalLimbExploreViewModel$graphMaxViewportBounds$1", f = "SegmentalLimbExploreViewModel.kt", l = {85, 86}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class q extends kotlin.coroutines.jvm.internal.i implements ym0.p<FlowCollector<? super Interval>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f47709a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f47710b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ a0 f47711c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ long f47712d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(a0 a0Var, long j5, qm0.d<? super q> dVar) {
        super(2, dVar);
        this.f47711c = a0Var;
        this.f47712d = j5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        q qVar = new q(this.f47711c, this.f47712d, dVar);
        qVar.f47710b = obj;
        return qVar;
    }

    @Override // ym0.p
    public final Object invoke(FlowCollector<? super Interval> flowCollector, qm0.d<? super nm0.y> dVar) {
        return ((q) create(flowCollector, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        v90.g gVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f47709a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    nm0.l.b(obj);
                    return nm0.y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowCollector = (FlowCollector) this.f47710b;
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            flowCollector = (FlowCollector) this.f47710b;
            gVar = this.f47711c.f47665a;
            int wsIdentifier = SegmentalBodyCompositionMeasureType.MuscleMass.getWsIdentifier();
            this.f47710b = flowCollector;
            this.f47709a = 1;
            obj = gVar.b(this.f47712d, wsIdentifier, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        this.f47710b = null;
        this.f47709a = 2;
        if (flowCollector.emit((Interval) obj, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return nm0.y.f85009a;
    }
}
