package com.withings.ecg.webservices;

import com.withings.ecg.model.HeartSignalMeasurement;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: SynchronizeMeasureSignals.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.ecg.webservices.SynchronizeMeasureSignals$run$3$1", f = "SynchronizeMeasureSignals.kt", l = {56}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SynchronizeMeasureSignals$run$3$1 extends i implements p<CoroutineScope, d<? super y>, Object> {
    final /* synthetic */ HeartSignalMeasurement $it;
    int label;
    final /* synthetic */ SynchronizeMeasureSignals this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SynchronizeMeasureSignals$run$3$1(SynchronizeMeasureSignals synchronizeMeasureSignals, HeartSignalMeasurement heartSignalMeasurement, d<? super SynchronizeMeasureSignals$run$3$1> dVar) {
        super(2, dVar);
        this.this$0 = synchronizeMeasureSignals;
        this.$it = heartSignalMeasurement;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new SynchronizeMeasureSignals$run$3$1(this.this$0, this.$it, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object deleteMeasurement;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            l.b(obj);
            SynchronizeMeasureSignals synchronizeMeasureSignals = this.this$0;
            HeartSignalMeasurement heartSignalMeasurement = this.$it;
            this.label = 1;
            deleteMeasurement = synchronizeMeasureSignals.deleteMeasurement(heartSignalMeasurement, this);
            if (deleteMeasurement == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return y.f85009a;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
        return ((SynchronizeMeasureSignals$run$3$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
