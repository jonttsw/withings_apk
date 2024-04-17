package com.withings.healthplus.contentscreens.android.webservice;

import com.withings.contentproviders.eightfit.model.webservice.WsWellnessTaskResponse;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import kotlin.Metadata;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;
/* compiled from: WellnessTaskRetrofit1Api.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\bH'J&\u0010\t\u001a\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\n\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\bH'¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/withings/healthplus/contentscreens/android/webservice/WellnessTaskRetrofit1Api;", "", "getWsWellnessTask", "Lcom/withings/contentproviders/eightfit/model/webservice/WsWellnessTaskResponse;", "relatedProgramTaskId", "", NavigationArguments.CONTENT_ID, NavigationArguments.USER_ID, "", "swapTask", "targetContentId", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface WellnessTaskRetrofit1Api {
    @POST("/v2/wellnesstask?action=get")
    @FormUrlEncoded
    WsWellnessTaskResponse getWsWellnessTask(@Field("remote_program_task_id") String str, @Field("remote_task_id") String str2, @Field("userid") long j5) throws Exception;

    @POST("/v2/wellnesstask?action=swap")
    @FormUrlEncoded
    Object swapTask(@Field("remote_program_task_id") String str, @Field("target_remote_task_id") String str2, @Field("userid") long j5) throws Exception;
}
