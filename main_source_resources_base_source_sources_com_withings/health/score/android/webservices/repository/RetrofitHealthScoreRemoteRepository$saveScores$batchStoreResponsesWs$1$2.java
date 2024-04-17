package com.withings.health.score.android.webservices.repository;

import com.withings.health.score.android.webservices.model.BatchStoreResponsesWs;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: RetrofitHealthScoreRemoteRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/withings/health/score/android/webservices/model/BatchStoreResponsesWs;", "Lcom/withings/health/score/android/webservices/repository/HealthScoreRetrofit2Api;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.health.score.android.webservices.repository.RetrofitHealthScoreRemoteRepository$saveScores$batchStoreResponsesWs$1$2", f = "RetrofitHealthScoreRemoteRepository.kt", l = {ConstantsWs.MEASURE_TYPE_NHS_RIGHT_FOOT}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RetrofitHealthScoreRemoteRepository$saveScores$batchStoreResponsesWs$1$2 extends i implements p<HealthScoreRetrofit2Api, d<? super BatchStoreResponsesWs>, Object> {
    final /* synthetic */ String $batchScoreString;
    final /* synthetic */ long $userId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitHealthScoreRemoteRepository$saveScores$batchStoreResponsesWs$1$2(long j5, String str, d<? super RetrofitHealthScoreRemoteRepository$saveScores$batchStoreResponsesWs$1$2> dVar) {
        super(2, dVar);
        this.$userId = j5;
        this.$batchScoreString = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        RetrofitHealthScoreRemoteRepository$saveScores$batchStoreResponsesWs$1$2 retrofitHealthScoreRemoteRepository$saveScores$batchStoreResponsesWs$1$2 = new RetrofitHealthScoreRemoteRepository$saveScores$batchStoreResponsesWs$1$2(this.$userId, this.$batchScoreString, dVar);
        retrofitHealthScoreRemoteRepository$saveScores$batchStoreResponsesWs$1$2.L$0 = obj;
        return retrofitHealthScoreRemoteRepository$saveScores$batchStoreResponsesWs$1$2;
    }

    @Override // ym0.p
    public final Object invoke(HealthScoreRetrofit2Api healthScoreRetrofit2Api, d<? super BatchStoreResponsesWs> dVar) {
        return ((RetrofitHealthScoreRemoteRepository$saveScores$batchStoreResponsesWs$1$2) create(healthScoreRetrofit2Api, dVar)).invokeSuspend(y.f85009a);
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
            String batchScoreString = this.$batchScoreString;
            u.i(batchScoreString, "$batchScoreString");
            this.label = 1;
            obj = ((HealthScoreRetrofit2Api) this.L$0).batchStores(j5, batchScoreString, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }
}
