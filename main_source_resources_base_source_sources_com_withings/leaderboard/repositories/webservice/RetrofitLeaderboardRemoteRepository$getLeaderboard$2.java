package com.withings.leaderboard.repositories.webservice;

import com.withings.leaderboard.repositories.data.LeaderboardResult;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ym0.l;
/* compiled from: RetrofitLeaderboardRemoteRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/withings/leaderboard/repositories/data/LeaderboardResult;", "Lcom/withings/leaderboard/repositories/webservice/LeaderboardRetrofit1Api;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class RetrofitLeaderboardRemoteRepository$getLeaderboard$2 extends w implements l<LeaderboardRetrofit1Api, LeaderboardResult> {
    final /* synthetic */ int $measureType;
    final /* synthetic */ long $userId;
    final /* synthetic */ String $weekDate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitLeaderboardRemoteRepository$getLeaderboard$2(String str, int i11, long j5) {
        super(1);
        this.$weekDate = str;
        this.$measureType = i11;
        this.$userId = j5;
    }

    @Override // ym0.l
    public final LeaderboardResult invoke(LeaderboardRetrofit1Api withApiForAccount) {
        u.j(withApiForAccount, "$this$withApiForAccount");
        return withApiForAccount.getLeaderboard(this.$weekDate, this.$measureType, this.$userId);
    }
}
