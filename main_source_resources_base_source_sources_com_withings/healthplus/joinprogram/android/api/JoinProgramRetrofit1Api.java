package com.withings.healthplus.joinprogram.android.api;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import kotlin.Metadata;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;
import tu.b;
/* compiled from: JoinProgramRetrofit1Api.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J9\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\t\u0010\nJ-\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\t\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/withings/healthplus/joinprogram/android/api/JoinProgramRetrofit1Api;", "", "", NavigationArguments.USER_ID, "", NavigationArguments.PROGRAM_ID, "forceJoin", "startDateInSeconds", "Ltu/b;", "joinProgram", "(JIILjava/lang/Long;)Ltu/b;", "targetType", "", "targetValue", "(JILjava/lang/String;)Ltu/b;", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface JoinProgramRetrofit1Api {
    @POST("/v2/wellness?action=join")
    @FormUrlEncoded
    b joinProgram(@Field("userid") long j5, @Field("programid") int i11, @Field("force") int i12, @Field("startdate") Long l5) throws Exception;

    @POST("/v2/wellness?action=join")
    @FormUrlEncoded
    b joinProgram(@Field("userid") long j5, @Field("target_type") int i11, @Field("target_value") String str) throws Exception;
}
