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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/withings/ecg/webservices/StoreEcgReviewResponse;", "Lcom/withings/ecg/webservices/EcgReviewRetrofit2Api;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.ecg.webservices.RetrofitEcgReviewRemoteRepository$store$3", f = "RetrofitEcgReviewRemoteRepository.kt", l = {40}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RetrofitEcgReviewRemoteRepository$store$3 extends i implements p<EcgReviewRetrofit2Api, d<? super StoreEcgReviewResponse>, Object> {
    final /* synthetic */ long $deviceId;
    final /* synthetic */ String $stateCode;
    final /* synthetic */ long $userId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitEcgReviewRemoteRepository$store$3(long j5, long j11, String str, d<? super RetrofitEcgReviewRemoteRepository$store$3> dVar) {
        super(2, dVar);
        this.$userId = j5;
        this.$deviceId = j11;
        this.$stateCode = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        RetrofitEcgReviewRemoteRepository$store$3 retrofitEcgReviewRemoteRepository$store$3 = new RetrofitEcgReviewRemoteRepository$store$3(this.$userId, this.$deviceId, this.$stateCode, dVar);
        retrofitEcgReviewRemoteRepository$store$3.L$0 = obj;
        return retrofitEcgReviewRemoteRepository$store$3;
    }

    @Override // ym0.p
    public final Object invoke(EcgReviewRetrofit2Api ecgReviewRetrofit2Api, d<? super StoreEcgReviewResponse> dVar) {
        return ((RetrofitEcgReviewRemoteRepository$store$3) create(ecgReviewRetrofit2Api, dVar)).invokeSuspend(y.f85009a);
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
            String str = this.$stateCode;
            this.label = 1;
            obj = ((EcgReviewRetrofit2Api) this.L$0).store(j5, j11, str, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }
}
