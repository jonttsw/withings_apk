package com.withings.leaderboard.repositories.webservice;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.leaderboard.repositories.data.LeaderboardResult;
import com.withings.leaderboard.repositories.data.SharePublicKey;
import com.withings.leaderboard.repositories.data.SharePublicKeys;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import nm0.y;
import qm0.d;
import s00.a;
import s00.b;
/* compiled from: RetrofitLeaderboardRemoteRepository.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010!\u001a\u00020 \u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b(\u0010)J\u0019\u0010\u0004\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\f\u0010\rJ,\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0019\u0010\u0017J \u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ\"\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lcom/withings/leaderboard/repositories/webservice/RetrofitLeaderboardRemoteRepository;", "Lcom/withings/leaderboard/repositories/webservice/LeaderboardRemoteRepository;", "", "syncContext", "withSyncContext", "(Ljava/lang/String;)Lcom/withings/leaderboard/repositories/webservice/LeaderboardRemoteRepository;", "", "userid", "targetUserId", "message", "options", "Lnm0/y;", "pushMessage", "(JJLjava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "weekDate", "", "measureType", NavigationArguments.USER_ID, "Lcom/withings/leaderboard/repositories/data/LeaderboardResult;", "getLeaderboard", "(Ljava/lang/String;IJLqm0/d;)Ljava/lang/Object;", "Lcom/withings/leaderboard/repositories/data/SharePublicKeys;", "getPublicKey", "(JLqm0/d;)Ljava/lang/Object;", "Lcom/withings/leaderboard/repositories/data/SharePublicKey;", "createPublicKey", "targetId", "revoke", "(JJLqm0/d;)Ljava/lang/Object;", "hash", "join", "(JLjava/lang/String;Lqm0/d;)Ljava/lang/Object;", "Ls00/b;", "compatWebservicesFactory", "Ls00/b;", "Ls00/a;", "Lcom/withings/leaderboard/repositories/webservice/LeaderboardRetrofit1Api;", "Lcom/withings/leaderboard/repositories/webservice/LeaderboardRetrofit2Api;", "compatWS", "Ls00/a;", "<init>", "(Ls00/b;Ljava/lang/String;)V", "leaderboard_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class RetrofitLeaderboardRemoteRepository implements LeaderboardRemoteRepository {
    public static final int $stable = 8;
    private final a<LeaderboardRetrofit1Api, LeaderboardRetrofit2Api> compatWS;
    private final b compatWebservicesFactory;

    public RetrofitLeaderboardRemoteRepository(b compatWebservicesFactory, String str) {
        u.j(compatWebservicesFactory, "compatWebservicesFactory");
        this.compatWebservicesFactory = compatWebservicesFactory;
        this.compatWS = compatWebservicesFactory.a(str, LeaderboardRetrofit1Api.class, LeaderboardRetrofit2Api.class);
    }

    @Override // com.withings.leaderboard.repositories.webservice.LeaderboardRemoteRepository
    public Object createPublicKey(long j5, d<? super SharePublicKey> dVar) {
        return a.d(this.compatWS, new RetrofitLeaderboardRemoteRepository$createPublicKey$2(j5), new RetrofitLeaderboardRemoteRepository$createPublicKey$3(j5, null), null, false, dVar, ConstantsWs.WS_STATUS_WRONGBATTERYLVL);
    }

    @Override // com.withings.leaderboard.repositories.webservice.LeaderboardRemoteRepository
    public Object getLeaderboard(String str, int i11, long j5, d<? super LeaderboardResult> dVar) {
        return a.d(this.compatWS, new RetrofitLeaderboardRemoteRepository$getLeaderboard$2(str, i11, j5), new RetrofitLeaderboardRemoteRepository$getLeaderboard$3(str, i11, j5, null), null, false, dVar, 124);
    }

    @Override // com.withings.leaderboard.repositories.webservice.LeaderboardRemoteRepository
    public Object getPublicKey(long j5, d<? super SharePublicKeys> dVar) {
        return a.d(this.compatWS, new RetrofitLeaderboardRemoteRepository$getPublicKey$2(j5), new RetrofitLeaderboardRemoteRepository$getPublicKey$3(j5, null), null, false, dVar, ConstantsWs.WS_STATUS_WRONGBATTERYLVL);
    }

    @Override // com.withings.leaderboard.repositories.webservice.LeaderboardRemoteRepository
    public Object join(long j5, String str, d<? super y> dVar) {
        return a.d(this.compatWS, new RetrofitLeaderboardRemoteRepository$join$2(j5, str), new RetrofitLeaderboardRemoteRepository$join$3(j5, str, null), null, false, dVar, ConstantsWs.WS_STATUS_WRONGBATTERYLVL);
    }

    @Override // com.withings.leaderboard.repositories.webservice.LeaderboardRemoteRepository
    public Object pushMessage(long j5, long j11, String str, String str2, d<? super y> dVar) {
        return a.d(this.compatWS, new RetrofitLeaderboardRemoteRepository$pushMessage$2(j5, j11, str, str2), new RetrofitLeaderboardRemoteRepository$pushMessage$3(j5, j11, str, str2, null), null, false, dVar, ConstantsWs.WS_STATUS_WRONGBATTERYLVL);
    }

    @Override // com.withings.leaderboard.repositories.webservice.LeaderboardRemoteRepository
    public Object revoke(long j5, long j11, d<? super y> dVar) {
        return a.d(this.compatWS, new RetrofitLeaderboardRemoteRepository$revoke$2(j5, j11), new RetrofitLeaderboardRemoteRepository$revoke$3(j5, j11, null), null, false, dVar, ConstantsWs.WS_STATUS_WRONGBATTERYLVL);
    }

    @Override // com.withings.leaderboard.repositories.webservice.LeaderboardRemoteRepository
    public LeaderboardRemoteRepository withSyncContext(String str) {
        return new RetrofitLeaderboardRemoteRepository(this.compatWebservicesFactory, str);
    }

    public /* synthetic */ RetrofitLeaderboardRemoteRepository(b bVar, String str, int i11, m mVar) {
        this(bVar, (i11 & 2) != 0 ? null : str);
    }
}
