package com.withings.fever.ui;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.joda.time.Interval;
/* compiled from: BodyTemperatureViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.fever.ui.BodyTemperatureViewModel$onViewportChange$1", f = "BodyTemperatureViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_PWV_REACHED_COUNT, ConstantsWs.MEASURE_TYPE_NHS_LEFT_FOOT}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class g0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f39239a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ o0 f39240b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ws.f f39241c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(o0 o0Var, ws.f fVar, qm0.d<? super g0> dVar) {
        super(2, dVar);
        this.f39240b = o0Var;
        this.f39241c = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new g0(this.f39240b, this.f39241c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((g0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        i0 i0Var;
        MutableSharedFlow mutableSharedFlow;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f39239a;
        o0 o0Var = this.f39240b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    nm0.l.b(obj);
                    return nm0.y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            i0Var = o0Var.f39390j;
            this.f39239a = 1;
            obj = FlowKt.first(i0Var, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        Interval interval = (Interval) obj;
        ws.f fVar = this.f39241c;
        o0.t0(o0Var, fVar.b(), fVar.a());
        mutableSharedFlow = o0Var.f39391k;
        Interval interval2 = new Interval(androidx.activity.b0.n(fVar, interval), androidx.activity.b0.l(fVar, interval));
        this.f39239a = 2;
        if (mutableSharedFlow.emit(interval2, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return nm0.y.f85009a;
    }
}
