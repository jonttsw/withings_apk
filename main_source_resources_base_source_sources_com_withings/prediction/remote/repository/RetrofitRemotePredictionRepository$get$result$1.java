package com.withings.prediction.remote.repository;

import com.withings.prediction.remote.repository.api.GetPredictionResponse;
import com.withings.prediction.remote.repository.api.PredictionRetrofit1Api;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ym0.l;
/* compiled from: RetrofitRemotePredictionRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/withings/prediction/remote/repository/api/GetPredictionResponse;", "Lcom/withings/prediction/remote/repository/api/PredictionRetrofit1Api;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class RetrofitRemotePredictionRepository$get$result$1 extends w implements l<PredictionRetrofit1Api, GetPredictionResponse> {
    final /* synthetic */ Long $lastUpdateInSeconds;
    final /* synthetic */ Integer $type;
    final /* synthetic */ long $userId;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitRemotePredictionRepository$get$result$1(long j5, Integer num, Long l5) {
        super(1);
        this.$userId = j5;
        this.$type = num;
        this.$lastUpdateInSeconds = l5;
    }

    @Override // ym0.l
    public final GetPredictionResponse invoke(PredictionRetrofit1Api withApiForAccount) {
        u.j(withApiForAccount, "$this$withApiForAccount");
        return withApiForAccount.get(this.$userId, this.$type, this.$lastUpdateInSeconds);
    }
}
