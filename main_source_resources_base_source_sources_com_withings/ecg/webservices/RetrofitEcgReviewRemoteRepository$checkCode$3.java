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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/withings/ecg/webservices/EcgReviewRetrofit2Api;", "Lnm0/y;", "<anonymous>", "(Lcom/withings/ecg/webservices/EcgReviewRetrofit2Api;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.ecg.webservices.RetrofitEcgReviewRemoteRepository$checkCode$3", f = "RetrofitEcgReviewRemoteRepository.kt", l = {54}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RetrofitEcgReviewRemoteRepository$checkCode$3 extends i implements p<EcgReviewRetrofit2Api, d<? super y>, Object> {
    final /* synthetic */ String $code;
    final /* synthetic */ long $deviceId;
    final /* synthetic */ long $userId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitEcgReviewRemoteRepository$checkCode$3(long j5, long j11, String str, d<? super RetrofitEcgReviewRemoteRepository$checkCode$3> dVar) {
        super(2, dVar);
        this.$userId = j5;
        this.$deviceId = j11;
        this.$code = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        RetrofitEcgReviewRemoteRepository$checkCode$3 retrofitEcgReviewRemoteRepository$checkCode$3 = new RetrofitEcgReviewRemoteRepository$checkCode$3(this.$userId, this.$deviceId, this.$code, dVar);
        retrofitEcgReviewRemoteRepository$checkCode$3.L$0 = obj;
        return retrofitEcgReviewRemoteRepository$checkCode$3;
    }

    @Override // ym0.p
    public final Object invoke(EcgReviewRetrofit2Api ecgReviewRetrofit2Api, d<? super y> dVar) {
        return ((RetrofitEcgReviewRemoteRepository$checkCode$3) create(ecgReviewRetrofit2Api, dVar)).invokeSuspend(y.f85009a);
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
            String str = this.$code;
            this.label = 1;
            if (((EcgReviewRetrofit2Api) this.L$0).checkCode(j5, j11, str, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return y.f85009a;
    }
}
