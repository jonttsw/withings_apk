package com.withings.account.network.ws;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.webservices.legacy.withings.model.Once;
import com.withings.webservices.legacy.withings.model.session.AccountSession;
import com.withings.webservices.legacy.withings.model.session.Session;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import nm0.y;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;
import q00.f;
import s00.a;
import s00.d;
/* compiled from: RetrofitSessionRemoteRepository.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u00102\u001a\u00020/\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b8\u00109J\u0019\u0010\u0004\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\n\u0010\u000bJr\u0010\u0006\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0006\u0010\u0017Jp\u0010\u001c\u001a\u00020\u00162\b\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0018\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001b\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ@\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b!\u0010\"J@\u0010$\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b$\u0010\"J@\u0010%\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b%\u0010\"J\u0010\u0010'\u001a\u00020&H\u0096@¢\u0006\u0004\b'\u0010(J,\u0010*\u001a\u00020)2\u0006\u0010\u001e\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b*\u0010\u000bJ \u0010-\u001a\u00020,2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00101R \u00106\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u000205038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u0006:"}, d2 = {"Lcom/withings/account/network/ws/RetrofitSessionRemoteRepository;", "Lcom/withings/account/network/ws/SessionRemoteRepository;", "", "syncContext", "withSyncContext", "(Ljava/lang/String;)Lcom/withings/account/network/ws/SessionRemoteRepository;", FirebaseAnalytics.Event.LOGIN, "hash", "duration", "Lcom/withings/webservices/legacy/withings/model/session/Session;", "getSession", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "email", "providerAuth", "passwordClear", "", "uuid", "token", "modelName", "typeName", "os", "osVersion", "Lcom/withings/webservices/legacy/withings/model/session/AccountSession;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "authProvider", "authToken", "providerToken", "appUUID", "loginFromAuthProvider", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "sessionId", XHTMLText.CODE, "Lcom/withings/account/network/ws/RenewResponse;", "renew", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "totpCode", "renewWithTotp", "renewWithRecoveryCode", "Lcom/withings/webservices/legacy/withings/model/Once;", "getOnce", "(Lqm0/d;)Ljava/lang/Object;", "Lnm0/y;", "logout", "virtualDeviceToken", "Lcom/withings/account/network/ws/IsVerifiedResponse;", "isVerified", "(Ljava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "Ls00/d;", "wsRetrofit1NoAuth", "Ls00/d;", "wsRetrofit2NoAuth", "Lq00/f;", "Lcom/withings/account/network/ws/SessionRetrofit1Api;", "Lcom/withings/account/network/ws/SessionRetrofit2Api;", "compatWs", "Lq00/f;", "<init>", "(Ls00/d;Ls00/d;Ljava/lang/String;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class RetrofitSessionRemoteRepository implements SessionRemoteRepository {
    public static final int $stable = 8;
    private final f<SessionRetrofit1Api, SessionRetrofit2Api> compatWs;
    private final d wsRetrofit1NoAuth;
    private final d wsRetrofit2NoAuth;

    public RetrofitSessionRemoteRepository(d wsRetrofit1NoAuth, d wsRetrofit2NoAuth, String str) {
        u.j(wsRetrofit1NoAuth, "wsRetrofit1NoAuth");
        u.j(wsRetrofit2NoAuth, "wsRetrofit2NoAuth");
        this.wsRetrofit1NoAuth = wsRetrofit1NoAuth;
        this.wsRetrofit2NoAuth = wsRetrofit2NoAuth;
        this.compatWs = new f<>(SessionRetrofit1Api.class, SessionRetrofit2Api.class, wsRetrofit1NoAuth, wsRetrofit2NoAuth, str);
    }

    @Override // com.withings.account.network.ws.SessionRemoteRepository
    public Object getOnce(qm0.d<? super Once> dVar) {
        return a.a(this.compatWs, RetrofitSessionRemoteRepository$getOnce$2.INSTANCE, new RetrofitSessionRemoteRepository$getOnce$3(null), null, null, false, dVar, ConstantsWs.WS_STATUS_WRONG_STRIPE_ENV);
    }

    @Override // com.withings.account.network.ws.SessionRemoteRepository
    public Object getSession(String str, String str2, String str3, qm0.d<? super Session> dVar) {
        return a.a(this.compatWs, new RetrofitSessionRemoteRepository$getSession$2(str, str2, str3), new RetrofitSessionRemoteRepository$getSession$3(str, str2, str3, null), null, null, false, dVar, ConstantsWs.WS_STATUS_WRONG_STRIPE_ENV);
    }

    @Override // com.withings.account.network.ws.SessionRemoteRepository
    public Object isVerified(String str, String str2, qm0.d<? super IsVerifiedResponse> dVar) {
        return a.a(this.compatWs, new RetrofitSessionRemoteRepository$isVerified$2(str, str2), new RetrofitSessionRemoteRepository$isVerified$3(str, str2, null), null, null, false, dVar, ConstantsWs.WS_STATUS_WRONG_STRIPE_ENV);
    }

    @Override // com.withings.account.network.ws.SessionRemoteRepository
    public Object login(String str, String str2, String str3, String str4, int i11, String str5, String str6, String str7, String str8, String str9, String str10, qm0.d<? super AccountSession> dVar) {
        return a.a(this.compatWs, new RetrofitSessionRemoteRepository$login$2(str, str2, str3, str4, i11, str5, str6, str7, str8, str9, str10), new RetrofitSessionRemoteRepository$login$3(str, str2, str3, str4, i11, str5, str6, str7, str8, str9, str10, null), null, null, false, dVar, ConstantsWs.WS_STATUS_WRONG_STRIPE_ENV);
    }

    @Override // com.withings.account.network.ws.SessionRemoteRepository
    public Object loginFromAuthProvider(String str, String str2, String str3, String str4, String str5, String str6, int i11, String str7, String str8, String str9, String str10, qm0.d<? super AccountSession> dVar) {
        return a.a(this.compatWs, new RetrofitSessionRemoteRepository$loginFromAuthProvider$2(str, str2, str3, str4, str5, str6, i11, str7, str8, str9, str10), new RetrofitSessionRemoteRepository$loginFromAuthProvider$3(str, str2, str3, str4, str5, str6, i11, str7, str8, str9, str10, null), null, null, false, dVar, ConstantsWs.WS_STATUS_WRONG_STRIPE_ENV);
    }

    @Override // com.withings.account.network.ws.SessionRemoteRepository
    public Object logout(String str, String str2, String str3, qm0.d<? super y> dVar) {
        return a.a(this.compatWs, new RetrofitSessionRemoteRepository$logout$2(str, str2, str3), new RetrofitSessionRemoteRepository$logout$3(str, str2, str3, null), null, null, false, dVar, ConstantsWs.WS_STATUS_WRONG_STRIPE_ENV);
    }

    @Override // com.withings.account.network.ws.SessionRemoteRepository
    public Object renew(String str, String str2, String str3, String str4, String str5, qm0.d<? super RenewResponse> dVar) {
        return a.a(this.compatWs, new RetrofitSessionRemoteRepository$renew$2(str, str2, str3, str4, str5), new RetrofitSessionRemoteRepository$renew$3(str, str2, str3, str4, str5, null), null, null, false, dVar, ConstantsWs.WS_STATUS_WRONG_STRIPE_ENV);
    }

    @Override // com.withings.account.network.ws.SessionRemoteRepository
    public Object renewWithRecoveryCode(String str, String str2, String str3, String str4, String str5, qm0.d<? super RenewResponse> dVar) {
        return a.a(this.compatWs, new RetrofitSessionRemoteRepository$renewWithRecoveryCode$2(str, str2, str3, str4, str5), new RetrofitSessionRemoteRepository$renewWithRecoveryCode$3(str, str2, str3, str4, str5, null), null, null, false, dVar, ConstantsWs.WS_STATUS_WRONG_STRIPE_ENV);
    }

    @Override // com.withings.account.network.ws.SessionRemoteRepository
    public Object renewWithTotp(String str, String str2, String str3, String str4, String str5, qm0.d<? super RenewResponse> dVar) {
        return a.a(this.compatWs, new RetrofitSessionRemoteRepository$renewWithTotp$2(str, str2, str3, str4, str5), new RetrofitSessionRemoteRepository$renewWithTotp$3(str, str2, str3, str4, str5, null), null, null, false, dVar, ConstantsWs.WS_STATUS_WRONG_STRIPE_ENV);
    }

    @Override // com.withings.account.network.ws.SessionRemoteRepository
    public SessionRemoteRepository withSyncContext(String str) {
        return new RetrofitSessionRemoteRepository(this.wsRetrofit1NoAuth, this.wsRetrofit2NoAuth, str);
    }

    public /* synthetic */ RetrofitSessionRemoteRepository(d dVar, d dVar2, String str, int i11, m mVar) {
        this(dVar, dVar2, (i11 & 4) != 0 ? null : str);
    }
}
