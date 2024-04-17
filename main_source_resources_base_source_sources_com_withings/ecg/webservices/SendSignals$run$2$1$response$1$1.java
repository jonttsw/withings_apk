package com.withings.ecg.webservices;

import com.withings.ecg.model.HeartSignalMeasurement;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: SendSignals.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/withings/ecg/webservices/StoreSignalResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.ecg.webservices.SendSignals$run$2$1$response$1$1", f = "SendSignals.kt", l = {53}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SendSignals$run$2$1$response$1$1 extends i implements p<CoroutineScope, d<? super StoreSignalResponse>, Object> {
    final /* synthetic */ byte[] $signalByteArray;
    final /* synthetic */ HeartSignalMeasurement $signalMeasurement;
    int label;
    final /* synthetic */ SendSignals this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendSignals$run$2$1$response$1$1(SendSignals sendSignals, HeartSignalMeasurement heartSignalMeasurement, byte[] bArr, d<? super SendSignals$run$2$1$response$1$1> dVar) {
        super(2, dVar);
        this.this$0 = sendSignals;
        this.$signalMeasurement = heartSignalMeasurement;
        this.$signalByteArray = bArr;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new SendSignals$run$2$1$response$1$1(this.this$0, this.$signalMeasurement, this.$signalByteArray, dVar);
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
            SendSignals sendSignals = this.this$0;
            HeartSignalMeasurement heartSignalMeasurement = this.$signalMeasurement;
            byte[] bArr = this.$signalByteArray;
            Long deviceId = heartSignalMeasurement.getDeviceId();
            u.g(deviceId);
            long longValue = deviceId.longValue();
            this.label = 1;
            obj = sendSignals.sendSignal(heartSignalMeasurement, bArr, longValue, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super StoreSignalResponse> dVar) {
        return ((SendSignals$run$2$1$response$1$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
