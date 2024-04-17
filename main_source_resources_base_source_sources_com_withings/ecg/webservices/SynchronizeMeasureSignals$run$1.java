package com.withings.ecg.webservices;

import com.withings.ecg.model.HeartSignalMeasurement;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import org.joda.time.DateTime;
import qm0.d;
import ym0.p;
/* compiled from: SynchronizeMeasureSignals.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "Lcom/withings/ecg/model/HeartSignalMeasurement;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.ecg.webservices.SynchronizeMeasureSignals$run$1", f = "SynchronizeMeasureSignals.kt", l = {46}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SynchronizeMeasureSignals$run$1 extends i implements p<CoroutineScope, d<? super List<? extends HeartSignalMeasurement>>, Object> {
    final /* synthetic */ long $localLastUpdate;
    int label;
    final /* synthetic */ SynchronizeMeasureSignals this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SynchronizeMeasureSignals$run$1(SynchronizeMeasureSignals synchronizeMeasureSignals, long j5, d<? super SynchronizeMeasureSignals$run$1> dVar) {
        super(2, dVar);
        this.this$0 = synchronizeMeasureSignals;
        this.$localLastUpdate = j5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new SynchronizeMeasureSignals$run$1(this.this$0, this.$localLastUpdate, dVar);
    }

    @Override // ym0.p
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, d<? super List<? extends HeartSignalMeasurement>> dVar) {
        return invoke2(coroutineScope, (d<? super List<HeartSignalMeasurement>>) dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
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
            DateTime dateTime = new DateTime(this.$localLastUpdate);
            this.label = 1;
            obj = synchronizeMeasureSignals.fetchSignals(dateTime, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        Iterable<SignalResponse> iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(x.y(iterable, 10));
        for (SignalResponse signalResponse : iterable) {
            arrayList.add(ModelsKt.toHeartSignalMeasurement(signalResponse));
        }
        return arrayList;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, d<? super List<HeartSignalMeasurement>> dVar) {
        return ((SynchronizeMeasureSignals$run$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
