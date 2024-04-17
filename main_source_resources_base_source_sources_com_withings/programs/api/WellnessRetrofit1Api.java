package com.withings.programs.api;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.manualLogging.data.webservice.healthAttribute.GetHealthAttributeResponse;
import com.withings.programs.model.webservice.enrolledProgram.WsEnrolledPrograms;
import com.withings.programs.model.webservice.wellnessPrograms.WsWellnessPrograms;
import kotlin.Metadata;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Query;
/* compiled from: WellnessRetrofit1Api.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u001c\u0010\u0007\u001a\u00020\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J&\u0010\u0007\u001a\u00020\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\nH'J\u001c\u0010\u000b\u001a\u00020\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J-\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u000e\u001a\u00020\u00042\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0002\u0010\u0010J\u001c\u0010\u0011\u001a\u00020\u00122\b\b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u000e\u001a\u00020\u0004H'¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lcom/withings/programs/api/WellnessRetrofit1Api;", "", "archiveProgram", NavigationArguments.USER_ID, "", NavigationArguments.PROGRAM_ID, "", "cancelProgram", "targetType", "targetValue", "", "finishProgram", "getEnrolledPrograms", "Lcom/withings/programs/model/webservice/enrolledProgram/WsEnrolledPrograms;", "lastupdate", GetHealthAttributeResponse.FIELD_OFFSET_NAME, "(JJLjava/lang/Integer;)Lcom/withings/programs/model/webservice/enrolledProgram/WsEnrolledPrograms;", "getWellnessPrograms", "Lcom/withings/programs/model/webservice/wellnessPrograms/WsWellnessPrograms;", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface WellnessRetrofit1Api {
    @POST("/v2/wellness?action=archive")
    @FormUrlEncoded
    Object archiveProgram(@Field("userid") long j5, @Field("programid") int i11) throws Exception;

    @POST("/v2/wellness?action=cancel")
    @FormUrlEncoded
    Object cancelProgram(@Field("userid") long j5, @Field("programid") int i11) throws Exception;

    @POST("/v2/wellness?action=cancel")
    @FormUrlEncoded
    Object cancelProgram(@Field("userid") long j5, @Field("target_type") int i11, @Field("target_value") String str) throws Exception;

    @GET("/v2/wellness?action=finish")
    Object finishProgram(@Query("userid") long j5, @Query("programid") int i11);

    @POST("/v2/wellness?action=getenrolled")
    @FormUrlEncoded
    WsEnrolledPrograms getEnrolledPrograms(@Field("userid") long j5, @Field("lastupdate") long j11, @Field("offset") Integer num) throws Exception;

    @POST("/v2/wellness?action=discover")
    @FormUrlEncoded
    WsWellnessPrograms getWellnessPrograms(@Field("userid") long j5, @Field("lastupdate") long j11);
}
