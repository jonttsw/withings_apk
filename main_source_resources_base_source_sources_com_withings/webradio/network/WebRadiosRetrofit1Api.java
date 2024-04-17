package com.withings.webradio.network;

import com.withings.webradio.model.WsAirableWebRadioResponse;
import com.withings.webservices.legacy.withings.model.airable.WsAirableSubCategoryList;
import com.withings.webservices.legacy.withings.model.airable.WsAirableTree;
import kotlin.Metadata;
import org.apache.http.cookie.ClientCookie;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;
/* compiled from: WebRadiosRetrofit1Api.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005H'J\u0014\u0010\u0006\u001a\u00020\u00072\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005H'J\u0014\u0010\b\u001a\u00020\t2\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005H'¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/withings/webradio/network/WebRadiosRetrofit1Api;", "", "getAirableSubCategory", "Lcom/withings/webservices/legacy/withings/model/airable/WsAirableSubCategoryList;", ClientCookie.PATH_ATTR, "", "getAirableTree", "Lcom/withings/webservices/legacy/withings/model/airable/WsAirableTree;", "getAirableWebRadios", "Lcom/withings/webradio/model/WsAirableWebRadioResponse;", "webradio_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface WebRadiosRetrofit1Api {
    @POST("/v2/partner?action=getdata&method=GET&brand=29")
    @FormUrlEncoded
    WsAirableSubCategoryList getAirableSubCategory(@Field("path") String str);

    @POST("/v2/partner?action=getdata&method=GET&brand=29")
    @FormUrlEncoded
    WsAirableTree getAirableTree(@Field("path") String str);

    @POST("/v2/partner?action=getdata&method=GET&brand=29")
    @FormUrlEncoded
    WsAirableWebRadioResponse getAirableWebRadios(@Field("path") String str);
}
