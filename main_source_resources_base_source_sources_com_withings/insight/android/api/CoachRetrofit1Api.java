package com.withings.insight.android.api;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.insight.core.model.InsightContainer;
import com.withings.insight.core.model.UpdateScenarioResponse;
import com.withings.webservices.legacy.common.exception.InvalidParamsException;
import kotlin.Metadata;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;
/* compiled from: CoachRetrofit1Api.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'J\u001c\u0010\u0007\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\tH'J0\u0010\n\u001a\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\fH'JD\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0011\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0012\u001a\u00020\f2\b\b\u0001\u0010\u0013\u001a\u00020\t2\b\b\u0001\u0010\u0014\u001a\u00020\tH'¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lcom/withings/insight/android/api/CoachRetrofit1Api;", "", "getByConversationId", "Lcom/withings/insight/core/model/InsightContainer;", NavigationArguments.USER_ID, "", "id", "getInsight", "force", "", "triggerAction", "type", "", "data", "crmid", "updateCoach", "Lcom/withings/insight/core/model/UpdateScenarioResponse;", "programid", "scenario", "read", "opened", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface CoachRetrofit1Api {
    @POST("/v2/insight?action=getbyconversationid")
    @FormUrlEncoded
    InsightContainer getByConversationId(@Field("userid") long j5, @Field("conversationid") long j11) throws InvalidParamsException;

    @POST("/v2/insight?action=getcoach")
    @FormUrlEncoded
    InsightContainer getInsight(@Field("userid") long j5, @Field("force") boolean z5) throws InvalidParamsException;

    @POST("/v2/coach?action=trigger")
    @FormUrlEncoded
    Object triggerAction(@Field("userid") long j5, @Field("type") String str, @Field("data") String str2, @Field("crmid") String str3) throws InvalidParamsException;

    @POST("/v2/insight?action=updatecoach")
    @FormUrlEncoded
    UpdateScenarioResponse updateCoach(@Field("userid") long j5, @Field("programid") long j11, @Field("insightid") long j12, @Field("scenario") String str, @Field("is_read") boolean z5, @Field("is_opened") boolean z11) throws InvalidParamsException;
}
