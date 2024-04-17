package com.withings.measurements.ui;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* compiled from: MeasurementsViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.measurements.ui.MeasurementsViewModel$scrollToTop$1", f = "MeasurementsViewModel.kt", l = {102}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class l2 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f42075a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MeasurementsViewModel f42076b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(MeasurementsViewModel measurementsViewModel, qm0.d<? super l2> dVar) {
        super(2, dVar);
        this.f42076b = measurementsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new l2(this.f42076b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((l2) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        MutableSharedFlow mutableSharedFlow;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f42075a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            mutableSharedFlow = this.f42076b.f41961q;
            nm0.y yVar = nm0.y.f85009a;
            this.f42075a = 1;
            if (mutableSharedFlow.emit(yVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
