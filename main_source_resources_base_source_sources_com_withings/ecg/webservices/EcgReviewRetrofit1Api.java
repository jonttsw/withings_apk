package com.withings.ecg.webservices;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.webservices.legacy.common.exception.UnauthorizedException;
import kotlin.Metadata;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Query;
/* compiled from: EcgReviewRetrofit1Api.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J\u001c\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'J\b\u0010\n\u001a\u00020\u000bH'J&\u0010\f\u001a\u00020\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\u0007H'J&\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u0007H'¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lcom/withings/ecg/webservices/EcgReviewRetrofit1Api;", "", "checkCode", NavigationArguments.USER_ID, "", "deviceId", XHTMLText.CODE, "", "get", "Lcom/withings/ecg/webservices/GetEcgReviewResponse;", "getStatesList", "Lcom/withings/ecg/webservices/ListStateCodeResponse;", "sendCode", "phoneNumber", "store", "Lcom/withings/ecg/webservices/StoreEcgReviewResponse;", "stateCode", "ecg_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface EcgReviewRetrofit1Api {
    @POST("/v2/ecgreview?action=checkcode")
    @FormUrlEncoded
    Object checkCode(@Query("userid") long j5, @Query("deviceid") long j11, @Field("code") String str) throws UnauthorizedException;

    @GET("/v2/ecgreview?action=get")
    GetEcgReviewResponse get(@Query("userid") long j5, @Query("deviceid") long j11);

    @GET("/v2/ecgreview?action=liststatecodes")
    ListStateCodeResponse getStatesList();

    @POST("/v2/ecgreview?action=sendcode")
    Object sendCode(@Query("userid") long j5, @Query("deviceid") long j11, @Query("phonenumber") String str) throws UnauthorizedException;

    @POST("/v2/ecgreview?action=store")
    StoreEcgReviewResponse store(@Query("userid") long j5, @Query("deviceid") long j11, @Query("state_code") String str);
}
