package com.withings.survey.webservice;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.webservices.legacy.common.exception.InvalidParamsException;
import f50.i;
import kotlin.Metadata;
import org.jivesoftware.smackx.jiveproperties.packet.JivePropertiesExtension;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;
/* compiled from: SurveyApi.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J]\u0010\u0010\u001a\u00020\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\b2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\bH'¢\u0006\u0004\b\u0010\u0010\u0011JS\u0010\u0013\u001a\u00020\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\b2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\bH'¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lcom/withings/survey/webservice/SurveyApi;", "", "", NavigationArguments.USER_ID, "id", "Lf50/i;", "getSurveyById", "(JJ)Lf50/i;", "", "property", "value", "save", "", "triggerCrm", "idSurvey", "submitId", "setProperty", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", JivePropertiesExtension.ELEMENT, "setPropertyBatch", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface SurveyApi {
    @POST("/v2/insight?action=getbyconversationid")
    @FormUrlEncoded
    i getSurveyById(@Field("userid") long j5, @Field("conversationid") long j11) throws InvalidParamsException;

    @POST("/v2/crm?action=setproperty")
    @FormUrlEncoded
    Object setProperty(@Field("userid") long j5, @Field("property") String str, @Field("value") String str2, @Field("save") String str3, @Field("trigger_crm") Boolean bool, @Field("surveyid") String str4, @Field("submitid") String str5);

    @POST("/v2/crm?action=setpropertybatch")
    @FormUrlEncoded
    Object setPropertyBatch(@Field("userid") long j5, @Field("properties") String str, @Field("save") String str2, @Field("trigger_crm") Boolean bool, @Field("surveyid") String str3, @Field("submitid") String str4);
}
