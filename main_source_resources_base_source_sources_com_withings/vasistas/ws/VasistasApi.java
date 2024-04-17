package com.withings.vasistas.ws;

import com.withings.vasistas.ws.WsVasistasSerie;
import com.withings.webservices.legacy.common.exception.WsAuthFailedException;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;
/* loaded from: classes4.dex */
public interface VasistasApi {
    @POST("/v2/measure?action=getvasistas")
    @FormUrlEncoded
    WsVasistasSerie.Response getVasistas(@Field("userid") long j5, @Field("startdate") long j11, @Field("enddate") long j12, @Field("vasistas_category") String str, @Field(encodeValue = false, value = "meastype") String str2);

    @POST("/v2/measure?action=storewamhf")
    @FormUrlEncoded
    Object storeVasistas(@Field("userid") long j5, @Field("vasistas_category") String str, @Field("measuregrps") String str2);

    @POST("/v2/measure?action=storewamhf")
    @FormUrlEncoded
    Object storeVasistas(@Field("userid") long j5, @Field("vasistas_category") String str, @Field("measuregrps") String str2, @Field("deviceid") int i11) throws WsAuthFailedException;
}
