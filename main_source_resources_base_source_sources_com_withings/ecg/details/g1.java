package com.withings.ecg.details;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowCollector;
/* compiled from: EcgInReviewViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.ecg.details.EcgInReviewViewModel$ecgReviewStatusFromBackend$2", f = "EcgInReviewViewModel.kt", l = {111}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class g1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<FlowCollector<? super rq.b>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f38226a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f38227b;

    g1() {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.ecg.details.g1, kotlin.coroutines.jvm.internal.i, qm0.d<nm0.y>] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        ?? iVar = new kotlin.coroutines.jvm.internal.i(2, dVar);
        iVar.f38227b = obj;
        return iVar;
    }

    @Override // ym0.p
    public final Object invoke(FlowCollector<? super rq.b> flowCollector, qm0.d<? super nm0.y> dVar) {
        return ((g1) create(flowCollector, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f38226a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            this.f38226a = 1;
            if (((FlowCollector) this.f38227b).emit(null, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
