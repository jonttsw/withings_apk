package com.withings.prediction.remote.repository;

import com.withings.prediction.remote.repository.api.GetPredictionResponse;
import com.withings.prediction.remote.repository.api.PredictionRetrofit2Api;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: RetrofitRemotePredictionRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/withings/prediction/remote/repository/api/GetPredictionResponse;", "Lcom/withings/prediction/remote/repository/api/PredictionRetrofit2Api;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.prediction.remote.repository.RetrofitRemotePredictionRepository$get$result$2", f = "RetrofitRemotePredictionRepository.kt", l = {26}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class RetrofitRemotePredictionRepository$get$result$2 extends i implements p<PredictionRetrofit2Api, d<? super GetPredictionResponse>, Object> {
    final /* synthetic */ Long $lastUpdateInSeconds;
    final /* synthetic */ Integer $type;
    final /* synthetic */ long $userId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitRemotePredictionRepository$get$result$2(long j5, Integer num, Long l5, d<? super RetrofitRemotePredictionRepository$get$result$2> dVar) {
        super(2, dVar);
        this.$userId = j5;
        this.$type = num;
        this.$lastUpdateInSeconds = l5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        RetrofitRemotePredictionRepository$get$result$2 retrofitRemotePredictionRepository$get$result$2 = new RetrofitRemotePredictionRepository$get$result$2(this.$userId, this.$type, this.$lastUpdateInSeconds, dVar);
        retrofitRemotePredictionRepository$get$result$2.L$0 = obj;
        return retrofitRemotePredictionRepository$get$result$2;
    }

    @Override // ym0.p
    public final Object invoke(PredictionRetrofit2Api predictionRetrofit2Api, d<? super GetPredictionResponse> dVar) {
        return ((RetrofitRemotePredictionRepository$get$result$2) create(predictionRetrofit2Api, dVar)).invokeSuspend(y.f85009a);
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
            Integer num = this.$type;
            Long l5 = this.$lastUpdateInSeconds;
            this.label = 1;
            obj = ((PredictionRetrofit2Api) this.L$0).get(j5, num, l5, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }
}
