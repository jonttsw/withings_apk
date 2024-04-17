package com.withings.ecg.webservices;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.k;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: GetSignalData.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/k;", "Lcom/withings/ecg/webservices/GetSignalResponse;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lnm0/k;"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.ecg.webservices.GetSignalData$run$1", f = "GetSignalData.kt", l = {45}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class GetSignalData$run$1 extends i implements p<CoroutineScope, d<? super k<? extends GetSignalResponse>>, Object> {
    int label;
    final /* synthetic */ GetSignalData this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSignalData$run$1(GetSignalData getSignalData, d<? super GetSignalData$run$1> dVar) {
        super(2, dVar);
        this.this$0 = getSignalData;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new GetSignalData$run$1(this.this$0, dVar);
    }

    @Override // ym0.p
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, d<? super k<? extends GetSignalResponse>> dVar) {
        return invoke2(coroutineScope, (d<? super k<GetSignalResponse>>) dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
        if (r0 != null) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0083  */
    /* JADX WARN: Type inference failed for: r11v10, types: [com.withings.ecg.webservices.GetSignalResponse] */
    /* JADX WARN: Type inference failed for: r11v2, types: [nm0.k$a] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v8 */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r10.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L18
            if (r1 != r2) goto L10
            nm0.l.b(r11)     // Catch: java.lang.Throwable -> Le
            goto L4d
        Le:
            r11 = move-exception
            goto L62
        L10:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L18:
            nm0.l.b(r11)
            com.withings.ecg.webservices.GetSignalData r11 = r10.this$0
            com.withings.ecg.model.HeartSignalMeasurement r1 = com.withings.ecg.webservices.GetSignalData.access$getHeartSignal$p(r11)     // Catch: java.lang.Throwable -> Le
            com.withings.ecg.model.Signal r1 = r1.getSignal()     // Catch: java.lang.Throwable -> Le
            java.lang.Long r1 = r1.getSignalId()     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L60
            long r7 = r1.longValue()     // Catch: java.lang.Throwable -> Le
            com.withings.ecg.webservices.SignalRemoteRepository r1 = com.withings.ecg.webservices.GetSignalData.access$getSignalRemoteRepository$p(r11)     // Catch: java.lang.Throwable -> Le
            java.lang.String r4 = r11.getSyncContext()     // Catch: java.lang.Throwable -> Le
            com.withings.ecg.webservices.SignalRemoteRepository r4 = r1.withSyncContext(r4)     // Catch: java.lang.Throwable -> Le
            com.withings.ecg.model.HeartSignalMeasurement r11 = com.withings.ecg.webservices.GetSignalData.access$getHeartSignal$p(r11)     // Catch: java.lang.Throwable -> Le
            long r5 = r11.getUserID()     // Catch: java.lang.Throwable -> Le
            r10.label = r2     // Catch: java.lang.Throwable -> Le
            r9 = r10
            java.lang.Object r11 = r4.getSignal(r5, r7, r9)     // Catch: java.lang.Throwable -> Le
            if (r11 != r0) goto L4d
            return r0
        L4d:
            com.withings.ecg.webservices.GetSignalResponse r11 = (com.withings.ecg.webservices.GetSignalResponse) r11     // Catch: java.lang.Throwable -> Le
            if (r11 == 0) goto L60
            com.withings.ecg.webservices.SignalResponse r0 = r11.getSignal()     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L5c
            java.lang.String r0 = r0.getSignal()     // Catch: java.lang.Throwable -> Le
            goto L5d
        L5c:
            r0 = r3
        L5d:
            if (r0 == 0) goto L60
            goto L66
        L60:
            r11 = r3
            goto L66
        L62:
            nm0.k$a r11 = nm0.l.a(r11)
        L66:
            com.withings.ecg.webservices.GetSignalData r0 = r10.this$0
            boolean r1 = r11 instanceof nm0.k.a
            r1 = r1 ^ r2
            if (r1 == 0) goto Lbe
            r1 = r11
            com.withings.ecg.webservices.GetSignalResponse r1 = (com.withings.ecg.webservices.GetSignalResponse) r1
            if (r1 == 0) goto Lbe
            com.withings.ecg.webservices.SignalResponse r1 = r1.getSignal()
            if (r1 == 0) goto L7c
            java.lang.String r3 = r1.getSignal()
        L7c:
            r1 = 0
            byte[] r1 = android.util.Base64.decode(r3, r1)
            if (r1 == 0) goto Lbe
            com.withings.ecg.model.HeartSignalMeasurement r2 = com.withings.ecg.webservices.GetSignalData.access$getHeartSignal$p(r0)
            com.withings.ecg.model.Signal r2 = r2.getSignal()
            mq.h r3 = new mq.h
            android.content.Context r4 = com.withings.ecg.webservices.GetSignalData.access$getContext$p(r0)
            r3.<init>(r4)
            com.withings.ecg.model.HeartSignalMeasurement r4 = com.withings.ecg.webservices.GetSignalData.access$getHeartSignal$p(r0)
            org.joda.time.DateTime r4 = r4.getTimestamp()
            long r4 = r4.getMillis()
            com.withings.ecg.model.HeartSignalMeasurement r6 = com.withings.ecg.webservices.GetSignalData.access$getHeartSignal$p(r0)
            com.withings.ecg.model.Signal r6 = r6.getSignal()
            com.withings.ecg.model.SignalMeta r6 = r6.getMeta()
            java.lang.String r1 = r3.a(r4, r6, r1)
            r2.setSignalPath(r1)
            com.withings.ecg.model.HeartSignalRepository r1 = com.withings.ecg.webservices.GetSignalData.access$getHeartSignalRepository$p(r0)
            com.withings.ecg.model.HeartSignalMeasurement r0 = com.withings.ecg.webservices.GetSignalData.access$getHeartSignal$p(r0)
            r1.update(r0)
        Lbe:
            nm0.k r11 = nm0.k.a(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.ecg.webservices.GetSignalData$run$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, d<? super k<GetSignalResponse>> dVar) {
        return ((GetSignalData$run$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
