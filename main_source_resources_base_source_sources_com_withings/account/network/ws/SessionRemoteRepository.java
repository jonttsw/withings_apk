package com.withings.account.network.ws;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.withings.webservices.legacy.common.exception.WsAuthFailedException;
import com.withings.webservices.legacy.withings.model.Once;
import com.withings.webservices.legacy.withings.model.session.AccountSession;
import com.withings.webservices.legacy.withings.model.session.Session;
import kotlin.Metadata;
import nm0.y;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;
import qm0.d;
/* compiled from: SessionRemoteRepository.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H¦@¢\u0006\u0004\b\n\u0010\u000bJr\u0010\u0006\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0017Jp\u0010\u001c\u001a\u00020\u00162\b\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0018\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001b\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u001c\u0010\u001dJ@\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b!\u0010\"J@\u0010$\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b$\u0010\"J@\u0010%\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b%\u0010\"J\u0010\u0010'\u001a\u00020&H¦@¢\u0006\u0004\b'\u0010(J,\u0010*\u001a\u00020)2\u0006\u0010\u001e\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b*\u0010\u000bJ \u0010-\u001a\u00020,2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u0002H¦@¢\u0006\u0004\b-\u0010.¨\u0006/À\u0006\u0003"}, d2 = {"Lcom/withings/account/network/ws/SessionRemoteRepository;", "", "", "syncContext", "withSyncContext", "(Ljava/lang/String;)Lcom/withings/account/network/ws/SessionRemoteRepository;", FirebaseAnalytics.Event.LOGIN, "hash", "duration", "Lcom/withings/webservices/legacy/withings/model/session/Session;", "getSession", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "email", "providerAuth", "passwordClear", "", "uuid", "token", "modelName", "typeName", "os", "osVersion", "Lcom/withings/webservices/legacy/withings/model/session/AccountSession;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "authProvider", "authToken", "providerToken", "appUUID", "loginFromAuthProvider", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "sessionId", XHTMLText.CODE, "Lcom/withings/account/network/ws/RenewResponse;", "renew", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "totpCode", "renewWithTotp", "renewWithRecoveryCode", "Lcom/withings/webservices/legacy/withings/model/Once;", "getOnce", "(Lqm0/d;)Ljava/lang/Object;", "Lnm0/y;", "logout", "virtualDeviceToken", "Lcom/withings/account/network/ws/IsVerifiedResponse;", "isVerified", "(Ljava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface SessionRemoteRepository {
    Object getOnce(d<? super Once> dVar);

    Object getSession(String str, String str2, String str3, d<? super Session> dVar) throws WsAuthFailedException;

    Object isVerified(String str, String str2, d<? super IsVerifiedResponse> dVar) throws WsAuthFailedException;

    Object login(String str, String str2, String str3, String str4, int i11, String str5, String str6, String str7, String str8, String str9, String str10, d<? super AccountSession> dVar) throws WsAuthFailedException;

    Object loginFromAuthProvider(String str, String str2, String str3, String str4, String str5, String str6, int i11, String str7, String str8, String str9, String str10, d<? super AccountSession> dVar) throws WsAuthFailedException;

    Object logout(String str, String str2, String str3, d<? super y> dVar) throws WsAuthFailedException;

    Object renew(String str, String str2, String str3, String str4, String str5, d<? super RenewResponse> dVar) throws WsAuthFailedException;

    Object renewWithRecoveryCode(String str, String str2, String str3, String str4, String str5, d<? super RenewResponse> dVar) throws WsAuthFailedException;

    Object renewWithTotp(String str, String str2, String str3, String str4, String str5, d<? super RenewResponse> dVar) throws WsAuthFailedException;

    SessionRemoteRepository withSyncContext(String str);
}
