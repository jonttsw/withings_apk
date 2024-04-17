package com.withings.leaderboard.repositories.webservice;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.leaderboard.repositories.data.LeaderboardResult;
import com.withings.leaderboard.repositories.data.SharePublicKey;
import com.withings.leaderboard.repositories.data.SharePublicKeys;
import kotlin.Metadata;
import nm0.y;
import qm0.d;
/* compiled from: LeaderboardRemoteRepository.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\f\u0010\rJ,\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u0019\u0010\u0017J \u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u001b\u0010\u001cJ\"\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 À\u0006\u0003"}, d2 = {"Lcom/withings/leaderboard/repositories/webservice/LeaderboardRemoteRepository;", "", "", "syncContext", "withSyncContext", "(Ljava/lang/String;)Lcom/withings/leaderboard/repositories/webservice/LeaderboardRemoteRepository;", "", "userid", "targetUserId", "message", "options", "Lnm0/y;", "pushMessage", "(JJLjava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "weekDate", "", "measureType", NavigationArguments.USER_ID, "Lcom/withings/leaderboard/repositories/data/LeaderboardResult;", "getLeaderboard", "(Ljava/lang/String;IJLqm0/d;)Ljava/lang/Object;", "Lcom/withings/leaderboard/repositories/data/SharePublicKeys;", "getPublicKey", "(JLqm0/d;)Ljava/lang/Object;", "Lcom/withings/leaderboard/repositories/data/SharePublicKey;", "createPublicKey", "targetId", "revoke", "(JJLqm0/d;)Ljava/lang/Object;", "hash", "join", "(JLjava/lang/String;Lqm0/d;)Ljava/lang/Object;", "leaderboard_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface LeaderboardRemoteRepository {
    Object createPublicKey(long j5, d<? super SharePublicKey> dVar);

    Object getLeaderboard(String str, int i11, long j5, d<? super LeaderboardResult> dVar);

    Object getPublicKey(long j5, d<? super SharePublicKeys> dVar);

    Object join(long j5, String str, d<? super y> dVar);

    Object pushMessage(long j5, long j11, String str, String str2, d<? super y> dVar);

    Object revoke(long j5, long j11, d<? super y> dVar);

    LeaderboardRemoteRepository withSyncContext(String str);
}
