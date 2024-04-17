package com.withings.vasistas.ws;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.vasistas.ws.WsVasistasSerie;
import com.withings.webservices.legacy.common.exception.WsAuthFailedException;
import kotlin.Metadata;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;
/* compiled from: VasistasRetrofit1Api.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\b`\u0018\u00002\u00020\u0001J>\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\tH'J,\u0010\u000b\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u00052\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\tH'J6\u0010\u000b\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u00052\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\t2\b\b\u0001\u0010\r\u001a\u00020\u000eH'¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/withings/vasistas/ws/VasistasRetrofit1Api;", "", "getVasistas", "Lcom/withings/vasistas/ws/WsVasistasSerie$Response;", NavigationArguments.USER_ID, "", "startDate", "endDate", "category", "", "measureTypes", "storeVasistas", "vasistasSerie", "deviceId", "", "core-data-vasistas_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface VasistasRetrofit1Api {
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
