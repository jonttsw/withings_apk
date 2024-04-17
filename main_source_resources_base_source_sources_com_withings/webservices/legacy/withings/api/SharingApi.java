package com.withings.webservices.legacy.withings.api;

import com.withings.webservices.legacy.withings.model.Sharing;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;
@Deprecated
/* loaded from: classes4.dex */
public interface SharingApi {
    public static final String ROOT_URL = "https://my.withings.com/fr/account";

    @POST("/addsharing")
    @FormUrlEncoded
    Object create(@Field("email") String str, @Field("userid") long j5, @Field("sessionid") String str2);

    @POST("/getsharings")
    @FormUrlEncoded
    Sharing.List get(@Field("userid") long j5, @Field("sessionid") String str);
}
