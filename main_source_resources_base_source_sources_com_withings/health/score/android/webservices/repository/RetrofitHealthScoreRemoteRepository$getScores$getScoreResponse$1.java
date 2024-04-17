package com.withings.health.score.android.webservices.repository;

import kotlin.Metadata;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ym0.l;
/* compiled from: RetrofitHealthScoreRemoteRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/withings/health/score/android/webservices/repository/GetScoreResponse;", "Lcom/withings/health/score/android/webservices/repository/HealthScoreRetrofit1Api;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class RetrofitHealthScoreRemoteRepository$getScores$getScoreResponse$1 extends w implements l<HealthScoreRetrofit1Api, GetScoreResponse> {
    final /* synthetic */ long $lastUpdate;
    final /* synthetic */ n0 $offset;
    final /* synthetic */ long $userId;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitHealthScoreRemoteRepository$getScores$getScoreResponse$1(long j5, long j11, n0 n0Var) {
        super(1);
        this.$userId = j5;
        this.$lastUpdate = j11;
        this.$offset = n0Var;
    }

    @Override // ym0.l
    public final GetScoreResponse invoke(HealthScoreRetrofit1Api withApiForAccount) {
        u.j(withApiForAccount, "$this$withApiForAccount");
        return withApiForAccount.getScores(this.$userId, this.$lastUpdate, Integer.valueOf(this.$offset.f76254a));
    }
}
