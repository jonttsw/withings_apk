package com.withings.missions.android.webservice;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import kotlin.Metadata;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Query;
import xz.c;
/* compiled from: MissionRetrofit1Api.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\t\u001a\u00020\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/withings/missions/android/webservice/MissionRetrofit1Api;", "", "", NavigationArguments.USER_ID, "Lxz/c;", "getMissionList", "(J)Lxz/c;", "", "missions", "completeMission", "(JLjava/lang/String;)Ljava/lang/Object;", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface MissionRetrofit1Api {
    @POST("/v2/mission?action=complete")
    @FormUrlEncoded
    Object completeMission(@Field("userid") long j5, @Field("missions") String str);

    @GET("/v2/mission?action=list")
    c getMissionList(@Query("userid") long j5);
}
