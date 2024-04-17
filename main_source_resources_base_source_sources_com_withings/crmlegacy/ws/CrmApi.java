package com.withings.crmlegacy.ws;

import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;
/* loaded from: classes3.dex */
public interface CrmApi {
    public static final String SAVE_FALSE = "f";
    public static final String SAVE_TRUE = "t";

    @POST("/v2/crm?action=feedbackbatch")
    @FormUrlEncoded
    Object feedback(@Field("data") String str);

    @POST("/v2/crm?action=feedback")
    @FormUrlEncoded
    Object feedback(@Field("crmid") String str, @Field("crmevent") String str2, @Field("userid") long j5);

    @POST("/v2/crm?action=setproperty")
    @FormUrlEncoded
    Object setProperty(@Field("userid") Long l5, @Field("property") String str, @Field("value") String str2);

    @POST("/v2/crm?action=setproperty")
    @FormUrlEncoded
    Object setProperty(@Field("userid") Long l5, @Field("property") String str, @Field("value") String str2, @Field("save") String str3);
}
