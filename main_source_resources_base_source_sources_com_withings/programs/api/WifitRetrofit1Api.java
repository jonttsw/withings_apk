package com.withings.programs.api;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.programs.model.webservice.programdetail.WsProgramTaskDetailResponse;
import com.withings.programs.model.webservice.programoverview.WsProgramOverview;
import com.withings.programs.model.webservice.wellnesstasks.WsWellnessTasks;
import kotlin.Metadata;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;
/* compiled from: WifitRetrofit1Api.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J(\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\t\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\n\u001a\u00020\u000bH'J\u001c\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\t\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0004H'J:\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\t\u001a\u00020\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u00062\b\b\u0001\u0010\u0011\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0012\u001a\u00020\u0006H'¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lcom/withings/programs/api/WifitRetrofit1Api;", "", "completeTasks", NavigationArguments.USER_ID, "", "tasks", "", "getWsListWellnessTasks", "Lcom/withings/programs/model/webservice/wellnesstasks/WsWellnessTasks;", NavigationArguments.PROGRAM_ID, NavigationArguments.INSTANCE_ID, "", "getWsProgramOverview", "Lcom/withings/programs/model/webservice/programoverview/WsProgramOverview;", "getWsWellnessTask", "Lcom/withings/programs/model/webservice/programdetail/WsProgramTaskDetailResponse;", "identifier", "taskIdentifier", "type", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface WifitRetrofit1Api {
    @POST("/v2/wellnesstask?action=complete")
    @FormUrlEncoded
    Object completeTasks(@Field("userid") long j5, @Field("tasks") String str) throws Exception;

    @POST("/v2/wellnesstask?action=list")
    @FormUrlEncoded
    WsWellnessTasks getWsListWellnessTasks(@Field("programid") long j5, @Field("userid") long j11, @Field("instanceid") int i11) throws Exception;

    @POST("/v2/wellness?action=get")
    @FormUrlEncoded
    WsProgramOverview getWsProgramOverview(@Field("programid") long j5, @Field("userid") long j11) throws Exception;

    @POST("/v2/wellnesstask?action=get")
    @FormUrlEncoded
    WsProgramTaskDetailResponse getWsWellnessTask(@Field("programid") long j5, @Field("remote_task_id") String str, @Field("remote_program_task_id") String str2, @Field("userid") long j11, @Field("task_type") String str3) throws Exception;
}
