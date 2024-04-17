package com.withings.measurements.ui;

import com.withings.library.authentication.api.ConstantsWs;
import gz.j0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: MeasurementsViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.measurements.ui.MeasurementsViewModel$saveSeenMeasurement$1", f = "MeasurementsViewModel.kt", l = {ConstantsWs.WS_STATUS_WRONGMACADDRESS}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class k2 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f42071a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MeasurementsViewModel f42072b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ j0.a f42073c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(MeasurementsViewModel measurementsViewModel, j0.a aVar, qm0.d<? super k2> dVar) {
        super(2, dVar);
        this.f42072b = measurementsViewModel;
        this.f42073c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new k2(this.f42072b, this.f42073c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((k2) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        oz.i iVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f42071a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            iVar = this.f42072b.f41954j;
            this.f42071a = 1;
            if (iVar.a(this.f42073c, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
