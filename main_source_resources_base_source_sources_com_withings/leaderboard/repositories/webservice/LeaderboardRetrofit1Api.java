package com.withings.leaderboard.repositories.webservice;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.leaderboard.repositories.data.LeaderboardResult;
import com.withings.leaderboard.repositories.data.SharePublicKey;
import com.withings.leaderboard.repositories.data.SharePublicKeys;
import com.withings.webservices.legacy.common.exception.AlreadyExistsException;
import kotlin.Metadata;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;
/* compiled from: LeaderboardRetrofit1Api.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b`\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H'J*\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H'J\u0014\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H'J \u0010\u000e\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u00052\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\tH'J4\u0010\u0010\u001a\u00020\u00012\b\b\u0001\u0010\u0011\u001a\u00020\u00052\b\b\u0001\u0010\u0012\u001a\u00020\u00052\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\tH'J\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0016\u001a\u00020\u0005H'¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lcom/withings/leaderboard/repositories/webservice/LeaderboardRetrofit1Api;", "", "createPublicKey", "Lcom/withings/leaderboard/repositories/data/SharePublicKey;", NavigationArguments.USER_ID, "", "getLeaderboard", "Lcom/withings/leaderboard/repositories/data/LeaderboardResult;", "weekDate", "", "measureType", "", "getPublicKey", "Lcom/withings/leaderboard/repositories/data/SharePublicKeys;", "join", "hash", "pushMessage", "userid", "targetuserid", "message", "options", "revoke", "targetId", "leaderboard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface LeaderboardRetrofit1Api {
    @POST("/v2/leaderboard?action=createpublickey")
    @FormUrlEncoded
    SharePublicKey createPublicKey(@Field("userid") long j5);

    @POST("/v2/leaderboard?action=getbyuserid")
    @FormUrlEncoded
    LeaderboardResult getLeaderboard(@Field("date") String str, @Field("meastype") int i11, @Field("userid") long j5);

    @POST("/v2/leaderboard?action=getpublickey")
    @FormUrlEncoded
    SharePublicKeys getPublicKey(@Field("userid") long j5);

    @POST("/v2/leaderboard?action=join")
    @FormUrlEncoded
    Object join(@Field("userid") long j5, @Field("hash") String str) throws AlreadyExistsException;

    @POST("/v2/leaderboard?action=pushmessage")
    @FormUrlEncoded
    Object pushMessage(@Field("userid") long j5, @Field("targetuserid") long j11, @Field("message") String str, @Field("options") String str2);

    @POST("/v2/leaderboard?action=revoke")
    @FormUrlEncoded
    Object revoke(@Field("userid") long j5, @Field("targetuserid") long j11);
}
