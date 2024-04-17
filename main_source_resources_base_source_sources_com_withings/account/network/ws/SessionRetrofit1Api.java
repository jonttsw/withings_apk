package com.withings.account.network.ws;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.withings.webservices.legacy.common.exception.WsAuthFailedException;
import com.withings.webservices.legacy.withings.model.Once;
import com.withings.webservices.legacy.withings.model.session.AccountSession;
import com.withings.webservices.legacy.withings.model.session.Session;
import kotlin.Metadata;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;
/* compiled from: SessionRetrofit1Api.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J&\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u0007H'J\u001c\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u00072\b\b\u0001\u0010\r\u001a\u00020\u0007H'J\u0080\u0001\u0010\u0006\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u00072\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\t\u001a\u00020\u00122\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\u0015\u001a\u00020\u00072\b\b\u0001\u0010\u0016\u001a\u00020\u00072\b\b\u0001\u0010\u0017\u001a\u00020\u00072\b\b\u0001\u0010\u0018\u001a\u00020\u0007H'J~\u0010\u0019\u001a\u00020\u000e2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\u001a\u001a\u00020\u00072\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\u001d\u001a\u00020\u00072\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\t\u001a\u00020\u00122\b\b\u0001\u0010\u0015\u001a\u00020\u00072\b\b\u0001\u0010\u0016\u001a\u00020\u00072\b\b\u0001\u0010\u0017\u001a\u00020\u00072\b\b\u0001\u0010\u0018\u001a\u00020\u0007H'J*\u0010\u001e\u001a\u00020\u00012\b\b\u0001\u0010\f\u001a\u00020\u00072\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0007H'JL\u0010\u001f\u001a\u00020 2\b\b\u0001\u0010\f\u001a\u00020\u00072\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\"\u001a\u00020#2\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0007H'JL\u0010$\u001a\u00020 2\b\b\u0001\u0010\f\u001a\u00020\u00072\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\"\u001a\u00020#2\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0007H'JL\u0010%\u001a\u00020 2\b\b\u0001\u0010\f\u001a\u00020\u00072\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\"\u001a\u00020#2\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0007H'¨\u0006'À\u0006\u0003"}, d2 = {"Lcom/withings/account/network/ws/SessionRetrofit1Api;", "", "getOnce", "Lcom/withings/webservices/legacy/withings/model/Once;", "getSession", "Lcom/withings/webservices/legacy/withings/model/session/Session;", FirebaseAnalytics.Event.LOGIN, "", "hash", "duration", "isVerified", "Lcom/withings/account/network/ws/IsVerifiedResponse;", "sessionId", "virtualDeviceToken", "Lcom/withings/webservices/legacy/withings/model/session/AccountSession;", "email", "providerAuth", "passwordClear", "", "uuid", "token", "modelName", "typeName", "os", "osVersion", "loginFromAuthProvider", "authProvider", "authToken", "providerToken", "appUUID", "logout", "renew", "Lcom/withings/account/network/ws/RenewResponse;", XHTMLText.CODE, "isSecure", "", "renewWithRecoveryCode", "renewWithTotp", "totpToken", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SessionRetrofit1Api {
    @POST("/once?action=get")
    Once getOnce();

    @POST("/session?action=new")
    @FormUrlEncoded
    Session getSession(@Field("auth") String str, @Field("hash") String str2, @Field("duration") String str3) throws WsAuthFailedException;

    @POST("/session?action=isverified")
    @FormUrlEncoded
    IsVerifiedResponse isVerified(@Field("sessionid") String str, @Field("token") String str2) throws WsAuthFailedException;

    @POST("/auth?action=login")
    @FormUrlEncoded
    AccountSession login(@Field("email") String str, @Field("authprovider") String str2, @Field("hash") String str3, @Field("password") String str4, @Field("duration") int i11, @Field("uuid") String str5, @Field("token") String str6, @Field("modelname") String str7, @Field("typename") String str8, @Field("os") String str9, @Field("osversion") String str10) throws WsAuthFailedException;

    @POST("/auth?action=login")
    @FormUrlEncoded
    AccountSession loginFromAuthProvider(@Field("email") String str, @Field("authprovider") String str2, @Field("auth_token") String str3, @Field("providertoken") String str4, @Field("uuid") String str5, @Field("token") String str6, @Field("duration") int i11, @Field("modelname") String str7, @Field("typename") String str8, @Field("os") String str9, @Field("osversion") String str10) throws WsAuthFailedException;

    @POST("/auth?action=logout")
    @FormUrlEncoded
    Object logout(@Field("sessionid") String str, @Field("authprovider") String str2, @Field("uuid") String str3) throws WsAuthFailedException;

    @POST("/session?action=renew")
    @FormUrlEncoded
    RenewResponse renew(@Field("sessionid") String str, @Field("code") String str2, @Field("is_secure") boolean z5, @Field("modelname") String str3, @Field("typename") String str4, @Field("os") String str5) throws WsAuthFailedException;

    @POST("/session?action=renew")
    @FormUrlEncoded
    RenewResponse renewWithRecoveryCode(@Field("sessionid") String str, @Field("recovery_code") String str2, @Field("is_secure") boolean z5, @Field("modelname") String str3, @Field("typename") String str4, @Field("os") String str5) throws WsAuthFailedException;

    @POST("/session?action=renew")
    @FormUrlEncoded
    RenewResponse renewWithTotp(@Field("sessionid") String str, @Field("totp_token") String str2, @Field("is_secure") boolean z5, @Field("modelname") String str3, @Field("typename") String str4, @Field("os") String str5) throws WsAuthFailedException;
}
