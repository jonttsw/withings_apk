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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/withings/ecg/webservices/GetSignalResponse;", "Lcom/withings/ecg/webservices/SignalRetrofit2Api;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.ecg.webservices.RetrofitSignalRemoteRepository$getSignal$3", f = "RetrofitSignalRemoteRepository.kt", l = {26}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RetrofitSignalRemoteRepository$getSignal$3 extends i implements p<SignalRetrofit2Api, d<? super GetSignalResponse>, Object> {
    final /* synthetic */ long $signalId;
    final /* synthetic */ long $userId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitSignalRemoteRepository$getSignal$3(long j5, long j11, d<? super RetrofitSignalRemoteRepository$getSignal$3> dVar) {
        super(2, dVar);
        this.$userId = j5;
        this.$signalId = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        RetrofitSignalRemoteRepository$getSignal$3 retrofitSignalRemoteRepository$getSignal$3 = new RetrofitSignalRemoteRepository$getSignal$3(this.$userId, this.$signalId, dVar);
        retrofitSignalRemoteRepository$getSignal$3.L$0 = obj;
        return retrofitSignalRemoteRepository$getSignal$3;
    }

    @Override // ym0.p
    public final Object invoke(SignalRetrofit2Api signalRetrofit2Api, d<? super GetSignalResponse> dVar) {
        return ((RetrofitSignalRemoteRepository$getSignal$3) create(signalRetrofit2Api, dVar)).invokeSuspend(y.f85009a);
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
            long j11 = this.$signalId;
            this.label = 1;
            obj = ((SignalRetrofit2Api) this.L$0).getSignal(j5, j11, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }
}
