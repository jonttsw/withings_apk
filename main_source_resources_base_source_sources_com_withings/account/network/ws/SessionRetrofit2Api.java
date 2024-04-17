package com.withings.account.network.ws;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.withings.webservices.legacy.common.exception.WsAuthFailedException;
import com.withings.webservices.legacy.withings.model.Once;
import com.withings.webservices.legacy.withings.model.session.AccountSession;
import com.withings.webservices.legacy.withings.model.session.Session;
import fr0.c;
import fr0.e;
import fr0.o;
import kotlin.Metadata;
import nm0.y;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;
import qm0.d;
/* compiled from: SessionRetrofit2Api.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J.\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u0005H§@¢\u0006\u0004\b\n\u0010\u000bJ\u0088\u0001\u0010\u0006\u001a\u00020\u00162\b\b\u0001\u0010\f\u001a\u00020\u00052\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u0010\b\u001a\u00020\u000f2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u0010\u0012\u001a\u00020\u00052\b\b\u0001\u0010\u0013\u001a\u00020\u00052\b\b\u0001\u0010\u0014\u001a\u00020\u00052\b\b\u0001\u0010\u0015\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0006\u0010\u0017J\u0086\u0001\u0010\u001c\u001a\u00020\u00162\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u0010\u0018\u001a\u00020\u00052\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u0010\u001b\u001a\u00020\u00052\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u0010\b\u001a\u00020\u000f2\b\b\u0001\u0010\u0012\u001a\u00020\u00052\b\b\u0001\u0010\u0013\u001a\u00020\u00052\b\b\u0001\u0010\u0014\u001a\u00020\u00052\b\b\u0001\u0010\u0015\u001a\u00020\u0005H§@¢\u0006\u0004\b\u001c\u0010\u001dJ2\u0010 \u001a\u00020\u001f2\b\b\u0001\u0010\u001e\u001a\u00020\u00052\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0004\b \u0010\u000bJT\u0010%\u001a\u00020$2\b\b\u0001\u0010\u001e\u001a\u00020\u00052\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u0010#\u001a\u00020\"2\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0004\b%\u0010&JT\u0010(\u001a\u00020$2\b\b\u0001\u0010\u001e\u001a\u00020\u00052\n\b\u0001\u0010'\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u0010#\u001a\u00020\"2\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0004\b(\u0010&JT\u0010)\u001a\u00020$2\b\b\u0001\u0010\u001e\u001a\u00020\u00052\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u0010#\u001a\u00020\"2\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0004\b)\u0010&J$\u0010,\u001a\u00020+2\b\b\u0001\u0010\u001e\u001a\u00020\u00052\b\b\u0001\u0010*\u001a\u00020\u0005H§@¢\u0006\u0004\b,\u0010-¨\u0006.À\u0006\u0003"}, d2 = {"Lcom/withings/account/network/ws/SessionRetrofit2Api;", "", "Lcom/withings/webservices/legacy/withings/model/Once;", "getOnce", "(Lqm0/d;)Ljava/lang/Object;", "", FirebaseAnalytics.Event.LOGIN, "hash", "duration", "Lcom/withings/webservices/legacy/withings/model/session/Session;", "getSession", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "email", "providerAuth", "passwordClear", "", "uuid", "token", "modelName", "typeName", "os", "osVersion", "Lcom/withings/webservices/legacy/withings/model/session/AccountSession;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "authProvider", "authToken", "providerToken", "appUUID", "loginFromAuthProvider", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "sessionId", "Lnm0/y;", "logout", XHTMLText.CODE, "", "isSecure", "Lcom/withings/account/network/ws/RenewResponse;", "renew", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "totpToken", "renewWithTotp", "renewWithRecoveryCode", "virtualDeviceToken", "Lcom/withings/account/network/ws/IsVerifiedResponse;", "isVerified", "(Ljava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface SessionRetrofit2Api {
    @o("once?action=get")
    Object getOnce(d<? super Once> dVar);

    @e
    @o("session?action=new")
    Object getSession(@c("auth") String str, @c("hash") String str2, @c("duration") String str3, d<? super Session> dVar) throws WsAuthFailedException;

    @e
    @o("session?action=isverified")
    Object isVerified(@c("sessionid") String str, @c("token") String str2, d<? super IsVerifiedResponse> dVar) throws WsAuthFailedException;

    @e
    @o("auth?action=login")
    Object login(@c("email") String str, @c("authprovider") String str2, @c("hash") String str3, @c("password") String str4, @c("duration") int i11, @c("uuid") String str5, @c("token") String str6, @c("modelname") String str7, @c("typename") String str8, @c("os") String str9, @c("osversion") String str10, d<? super AccountSession> dVar) throws WsAuthFailedException;

    @e
    @o("auth?action=login")
    Object loginFromAuthProvider(@c("email") String str, @c("authprovider") String str2, @c("auth_token") String str3, @c("providertoken") String str4, @c("uuid") String str5, @c("token") String str6, @c("duration") int i11, @c("modelname") String str7, @c("typename") String str8, @c("os") String str9, @c("osversion") String str10, d<? super AccountSession> dVar) throws WsAuthFailedException;

    @e
    @o("auth?action=logout")
    Object logout(@c("sessionid") String str, @c("authprovider") String str2, @c("uuid") String str3, d<? super y> dVar) throws WsAuthFailedException;

    @e
    @o("session?action=renew")
    Object renew(@c("sessionid") String str, @c("code") String str2, @c("is_secure") boolean z5, @c("modelname") String str3, @c("typename") String str4, @c("os") String str5, d<? super RenewResponse> dVar) throws WsAuthFailedException;

    @e
    @o("session?action=renew")
    Object renewWithRecoveryCode(@c("sessionid") String str, @c("recovery_code") String str2, @c("is_secure") boolean z5, @c("modelname") String str3, @c("typename") String str4, @c("os") String str5, d<? super RenewResponse> dVar) throws WsAuthFailedException;

    @e
    @o("session?action=renew")
    Object renewWithTotp(@c("sessionid") String str, @c("totp_token") String str2, @c("is_secure") boolean z5, @c("modelname") String str3, @c("typename") String str4, @c("os") String str5, d<? super RenewResponse> dVar) throws WsAuthFailedException;
}
