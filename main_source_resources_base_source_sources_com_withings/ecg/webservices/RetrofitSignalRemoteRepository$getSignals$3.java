package com.withings.ecg.webservices;

import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: RetrofitSignalRemoteRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/withings/ecg/webservices/GetSignalsResponse;", "Lcom/withings/ecg/webservices/SignalRetrofit2Api;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.ecg.webservices.RetrofitSignalRemoteRepository$getSignals$3", f = "RetrofitSignalRemoteRepository.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RetrofitSignalRemoteRepository$getSignals$3 extends i implements p<SignalRetrofit2Api, d<? super GetSignalsResponse>, Object> {
    final /* synthetic */ Long $lastUpdate;
    final /* synthetic */ int $offset;
    final /* synthetic */ long $userId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitSignalRemoteRepository$getSignals$3(long j5, int i11, Long l5, d<? super RetrofitSignalRemoteRepository$getSignals$3> dVar) {
        super(2, dVar);
        this.$userId = j5;
        this.$offset = i11;
        this.$lastUpdate = l5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        RetrofitSignalRemoteRepository$getSignals$3 retrofitSignalRemoteRepository$getSignals$3 = new RetrofitSignalRemoteRepository$getSignals$3(this.$userId, this.$offset, this.$lastUpdate, dVar);
        retrofitSignalRemoteRepository$getSignals$3.L$0 = obj;
        return retrofitSignalRemoteRepository$getSignals$3;
    }

    @Override // ym0.p
    public final Object invoke(SignalRetrofit2Api signalRetrofit2Api, d<? super GetSignalsResponse> dVar) {
        return ((RetrofitSignalRemoteRepository$getSignals$3) create(signalRetrofit2Api, dVar)).invokeSuspend(y.f85009a);
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
            long j5 = this.$userId;
            int i12 = this.$offset;
            Long l5 = this.$lastUpdate;
            this.label = 1;
            obj = ((SignalRetrofit2Api) this.L$0).getSignals(j5, i12, l5, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }
}
