package com.withings.health.score.android.webservices.repository;

import com.withings.health.score.android.webservices.model.BatchStoreResponsesWs;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ym0.l;
/* compiled from: RetrofitHealthScoreRemoteRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/withings/health/score/android/webservices/model/BatchStoreResponsesWs;", "Lcom/withings/health/score/android/webservices/repository/HealthScoreRetrofit1Api;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class RetrofitHealthScoreRemoteRepository$saveScores$batchStoreResponsesWs$1$1 extends w implements l<HealthScoreRetrofit1Api, BatchStoreResponsesWs> {
    final /* synthetic */ String $batchScoreString;
    final /* synthetic */ long $userId;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitHealthScoreRemoteRepository$saveScores$batchStoreResponsesWs$1$1(long j5, String str) {
        super(1);
        this.$userId = j5;
        this.$batchScoreString = str;
    }

    @Override // ym0.l
    public final BatchStoreResponsesWs invoke(HealthScoreRetrofit1Api withApiForAccount) {
        u.j(withApiForAccount, "$this$withApiForAccount");
        long j5 = this.$userId;
        String batchScoreString = this.$batchScoreString;
        u.i(batchScoreString, "$batchScoreString");
        return withApiForAccount.batchStores(j5, batchScoreString);
    }
}
