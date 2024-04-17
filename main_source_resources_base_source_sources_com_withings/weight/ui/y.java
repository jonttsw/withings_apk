package com.withings.weight.ui;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* compiled from: SegmentalBodyCompositionViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.ui.SegmentalBodyCompositionViewModel$previousMeasurement$1", f = "SegmentalBodyCompositionViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_LEUKOCYTES, ConstantsWs.MEASURE_TYPE_HR_SD_NN}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class y extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f47885a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ v f47886b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(v vVar, qm0.d<? super y> dVar) {
        super(2, dVar);
        this.f47886b = vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new y(this.f47886b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((y) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f47885a;
        v vVar = this.f47886b;
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
            MutableSharedFlow mutableSharedFlow = vVar.f47846q;
            this.f47885a = 1;
            obj = FlowKt.first(mutableSharedFlow, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        int intValue = ((Number) obj).intValue();
        MutableSharedFlow mutableSharedFlow2 = vVar.f47846q;
        Integer num = new Integer(intValue - 1);
        this.f47885a = 2;
        if (mutableSharedFlow2.emit(num, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return nm0.y.f85009a;
    }
}
