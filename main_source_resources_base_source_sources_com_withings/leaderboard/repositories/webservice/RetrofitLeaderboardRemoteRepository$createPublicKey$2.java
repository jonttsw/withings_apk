package com.withings.leaderboard.repositories.webservice;

import com.withings.leaderboard.repositories.data.SharePublicKey;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ym0.l;
/* compiled from: RetrofitLeaderboardRemoteRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/withings/leaderboard/repositories/data/SharePublicKey;", "Lcom/withings/leaderboard/repositories/webservice/LeaderboardRetrofit1Api;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class RetrofitLeaderboardRemoteRepository$createPublicKey$2 extends w implements l<LeaderboardRetrofit1Api, SharePublicKey> {
    final /* synthetic */ long $userId;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitLeaderboardRemoteRepository$createPublicKey$2(long j5) {
        super(1);
        this.$userId = j5;
    }

    @Override // ym0.l
    public final SharePublicKey invoke(LeaderboardRetrofit1Api withApiForAccount) {
        u.j(withApiForAccount, "$this$withApiForAccount");
        return withApiForAccount.createPublicKey(this.$userId);
    }
}
