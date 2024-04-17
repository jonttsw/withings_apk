package com.withings.leaderboard.repositories.webservice;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.leaderboard.repositories.data.LeaderboardResult;
import com.withings.leaderboard.repositories.data.SharePublicKey;
import com.withings.leaderboard.repositories.data.SharePublicKeys;
import com.withings.webservices.legacy.common.exception.AlreadyExistsException;
import fr0.c;
import fr0.e;
import fr0.o;
import kotlin.Metadata;
import nm0.y;
import qm0.d;
/* compiled from: LeaderboardRetrofit2Api.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b`\u0018\u00002\u00020\u0001J<\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0004\b\t\u0010\nJ2\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0001\u0010\u000e\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u000e\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0016\u0010\u0014J$\u0010\u0018\u001a\u00020\b2\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u0017\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001b\u001a\u00020\b2\b\b\u0001\u0010\u000e\u001a\u00020\u00022\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001dÀ\u0006\u0003"}, d2 = {"Lcom/withings/leaderboard/repositories/webservice/LeaderboardRetrofit2Api;", "", "", "userid", "targetuserid", "", "message", "options", "Lnm0/y;", "pushMessage", "(JJLjava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "weekDate", "", "measureType", NavigationArguments.USER_ID, "Lcom/withings/leaderboard/repositories/data/LeaderboardResult;", "getLeaderboard", "(Ljava/lang/String;IJLqm0/d;)Ljava/lang/Object;", "Lcom/withings/leaderboard/repositories/data/SharePublicKeys;", "getPublicKey", "(JLqm0/d;)Ljava/lang/Object;", "Lcom/withings/leaderboard/repositories/data/SharePublicKey;", "createPublicKey", "targetId", "revoke", "(JJLqm0/d;)Ljava/lang/Object;", "hash", "join", "(JLjava/lang/String;Lqm0/d;)Ljava/lang/Object;", "leaderboard_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface LeaderboardRetrofit2Api {
    @e
    @o("v2/leaderboard?action=createpublickey")
    Object createPublicKey(@c("userid") long j5, d<? super SharePublicKey> dVar);

    @e
    @o("v2/leaderboard?action=getbyuserid")
    Object getLeaderboard(@c("date") String str, @c("meastype") int i11, @c("userid") long j5, d<? super LeaderboardResult> dVar);

    @e
    @o("v2/leaderboard?action=getpublickey")
    Object getPublicKey(@c("userid") long j5, d<? super SharePublicKeys> dVar);

    @e
    @o("v2/leaderboard?action=join")
    Object join(@c("userid") long j5, @c("hash") String str, d<? super y> dVar) throws AlreadyExistsException;

    @e
    @o("v2/leaderboard?action=pushmessage")
    Object pushMessage(@c("userid") long j5, @c("targetuserid") long j11, @c("message") String str, @c("options") String str2, d<? super y> dVar);

    @e
    @o("v2/leaderboard?action=revoke")
    Object revoke(@c("userid") long j5, @c("targetuserid") long j11, d<? super y> dVar);
}
