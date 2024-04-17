package com.withings.ecg.webservices;

import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: RetrofitEcgReviewRemoteRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/withings/ecg/webservices/GetEcgReviewResponse;", "Lcom/withings/ecg/webservices/EcgReviewRetrofit2Api;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.ecg.webservices.RetrofitEcgReviewRemoteRepository$get$3", f = "RetrofitEcgReviewRemoteRepository.kt", l = {26}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RetrofitEcgReviewRemoteRepository$get$3 extends i implements p<EcgReviewRetrofit2Api, d<? super GetEcgReviewResponse>, Object> {
    final /* synthetic */ long $deviceId;
    final /* synthetic */ long $userId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitEcgReviewRemoteRepository$get$3(long j5, long j11, d<? super RetrofitEcgReviewRemoteRepository$get$3> dVar) {
        super(2, dVar);
        this.$userId = j5;
        this.$deviceId = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        RetrofitEcgReviewRemoteRepository$get$3 retrofitEcgReviewRemoteRepository$get$3 = new RetrofitEcgReviewRemoteRepository$get$3(this.$userId, this.$deviceId, dVar);
        retrofitEcgReviewRemoteRepository$get$3.L$0 = obj;
        return retrofitEcgReviewRemoteRepository$get$3;
    }

    @Override // ym0.p
    public final Object invoke(EcgReviewRetrofit2Api ecgReviewRetrofit2Api, d<? super GetEcgReviewResponse> dVar) {
        return ((RetrofitEcgReviewRemoteRepository$get$3) create(ecgReviewRetrofit2Api, dVar)).invokeSuspend(y.f85009a);
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
            long j11 = this.$deviceId;
            this.label = 1;
            obj = ((EcgReviewRetrofit2Api) this.L$0).get(j5, j11, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }
}
