package com.withings.account.network.ws;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.Gson;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.withings.account.models.TotpResponse;
import com.withings.account.models.TwoFactorAuthentication;
import com.withings.account.network.ws.WsAccount;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.webservices.legacy.withings.model.AccountCreation;
import com.withings.webservices.legacy.withings.model.session.AccountSession;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import nm0.y;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;
import q00.f;
import s00.a;
import s00.b;
import s00.d;
/* compiled from: RetrofitAccountRemoteRepository.kt */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 i2\u00020\u0001:\u0001iB#\u0012\u0006\u0010]\u001a\u00020\\\u0012\u0006\u0010`\u001a\u00020_\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bg\u0010hJ\u0019\u0010\u0004\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0007\u0010\bJP\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J`\u0010\u0013\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0013\u0010\u001aJd\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u001eH\u0096@¢\u0006\u0004\b\u001f\u0010\bJ\u0010\u0010 \u001a\u00020\u001eH\u0096@¢\u0006\u0004\b \u0010\bJX\u0010!\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b!\u0010\"J \u0010(\u001a\u00020'2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0096@¢\u0006\u0004\b(\u0010)J(\u0010,\u001a\u00020'2\u0006\u0010$\u001a\u00020#2\u0006\u0010*\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b,\u0010-J,\u00100\u001a\u00020'2\b\u0010.\u001a\u0004\u0018\u00010\u00022\u0006\u0010/\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010#H\u0096@¢\u0006\u0004\b0\u00101J\u0018\u00102\u001a\u00020'2\u0006\u0010\t\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020'H\u0096@¢\u0006\u0004\b4\u0010\bJ \u00105\u001a\u00020'2\u0006\u0010$\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020'H\u0096@¢\u0006\u0004\b7\u0010\bJ\u0010\u00108\u001a\u00020'H\u0096@¢\u0006\u0004\b8\u0010\bJ\u0010\u00109\u001a\u00020'H\u0096@¢\u0006\u0004\b9\u0010\bJ\u0010\u0010:\u001a\u00020'H\u0096@¢\u0006\u0004\b:\u0010\bJ\u0010\u0010;\u001a\u00020'H\u0096@¢\u0006\u0004\b;\u0010\bJ\u0010\u0010<\u001a\u00020'H\u0096@¢\u0006\u0004\b<\u0010\bJ\u0010\u0010=\u001a\u00020'H\u0096@¢\u0006\u0004\b=\u0010\bJ\u001a\u0010?\u001a\u00020'2\b\u0010>\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b?\u00103J\u001a\u0010@\u001a\u00020'2\b\u0010>\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b@\u00103J\u001a\u0010A\u001a\u00020'2\b\u0010>\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\bA\u00103JJ\u0010C\u001a\u00020'2\u0006\u0010B\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\bC\u0010DJ\u0010\u0010F\u001a\u00020EH\u0096@¢\u0006\u0004\bF\u0010\bJ,\u0010H\u001a\u00020'2\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u0010G\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\bH\u0010IJR\u0010L\u001a\u00020K2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010J\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0096@¢\u0006\u0004\bL\u0010\u0014JJ\u0010L\u001a\u00020K2\u0006\u0010M\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0096@¢\u0006\u0004\bL\u0010NJ\u0010\u0010P\u001a\u00020OH\u0096@¢\u0006\u0004\bP\u0010\bJ \u0010T\u001a\u00020S2\u0006\u0010Q\u001a\u00020\u00022\u0006\u0010R\u001a\u00020\u0002H\u0096@¢\u0006\u0004\bT\u0010UJ\u0018\u0010V\u001a\u00020'2\u0006\u0010$\u001a\u00020#H\u0096@¢\u0006\u0004\bV\u0010WJ\u0010\u0010Y\u001a\u00020XH\u0096@¢\u0006\u0004\bY\u0010\bJ\u0018\u0010Z\u001a\u00020'2\u0006\u0010B\u001a\u00020\u0002H\u0096@¢\u0006\u0004\bZ\u00103J\u0010\u0010[\u001a\u00020'H\u0096@¢\u0006\u0004\b[\u0010\bR\u0014\u0010]\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010`\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR \u0010e\u001a\u000e\u0012\u0004\u0012\u00020c\u0012\u0004\u0012\u00020d0b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010f¨\u0006j"}, d2 = {"Lcom/withings/account/network/ws/RetrofitAccountRemoteRepository;", "Lcom/withings/account/network/ws/AccountRemoteRepository;", "", "syncContext", "withSyncContext", "(Ljava/lang/String;)Lcom/withings/account/network/ws/AccountRemoteRepository;", "Lcom/withings/account/network/ws/WsAccount$Response;", "getAccount", "(Lqm0/d;)Ljava/lang/Object;", "email", "hash", "prefLang", "", "duration", "modelName", "typeName", "os", "osVersion", "Lcom/withings/webservices/legacy/withings/model/AccountCreation;", "createAccount", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "authProvider", CommonConstant.KEY_ID_TOKEN, "uuid", "clientId", "Lcom/withings/webservices/legacy/withings/model/session/AccountSession;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "token", "Lcom/withings/account/network/ws/AccountCreationResponse;", "createAccountWithToken", "Lcom/withings/account/network/ws/CodesResponse;", "getRecoveryCode", "generateRecoveryCode", FirebaseAnalytics.Event.LOGIN, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "", "accountId", "Lcom/withings/account/network/ws/WsAccount$Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Lnm0/y;", "updateAccountContext", "(JLcom/withings/account/network/ws/WsAccount$Context;Lqm0/d;)Ljava/lang/Object;", "timezone", "language", "updateAccount", "(JLjava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "oldPassword", "passwordClear", "changePassword", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lqm0/d;)Ljava/lang/Object;", "requestNewPassword", "(Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "requestEmailValidation", "requestEmailUpdate", "(ILjava/lang/String;Lqm0/d;)Ljava/lang/Object;", "sendCodeWhatsApp", "sendCodeSms", "sendCodeCall", "deleteAllPhoneFactors", "deleteWhatsapp", "deleteSms", "deleteCall", "phoneNumber", "sendConfirmationCodeWhatsApp", "sendConfirmationCodeSms", "sendConfirmationCodeCall", XHTMLText.CODE, "checkConfirmationCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/account/models/TwoFactorAuthentication$Response;", "getAuthentication", "state", "createShortCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "shortCode", "Lcom/withings/account/network/ws/AccountUser;", "providerAuth", "jwt", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/account/network/ws/RequestDeletionResponse;", "requestDeletion", "baseUrl", "sessionId", "Lcom/withings/account/network/ws/PartnerInfoResponse;", "requestPartnerInfo", "(Ljava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "reactivate", "(JLqm0/d;)Ljava/lang/Object;", "Lcom/withings/account/models/TotpResponse;", "generateTotp", "confirmTotp", "deleteTotp", "Ls00/b;", "compatWebservicesFactory", "Ls00/b;", "Ls00/d$b;", "sensitiveActionsErrorHandler", "Ls00/d$b;", "Ls00/a;", "Lcom/withings/account/network/ws/AccountRetrofit1Api;", "Lcom/withings/account/network/ws/AccountRetrofit2Api;", "compatWs", "Ls00/a;", "<init>", "(Ls00/b;Ls00/d$b;Ljava/lang/String;)V", "Companion", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class RetrofitAccountRemoteRepository implements AccountRemoteRepository {
    @Deprecated
    public static final int APP_TYPE_VALUE = 20;
    @Deprecated
    public static final String CHANNEL_CALL = "call";
    @Deprecated
    public static final String CHANNEL_SMS = "sms";
    @Deprecated
    public static final String CHANNEL_WHATSAPP = "whatsapp";
    @Deprecated
    public static final int IDACLPFL_VALUE = 2;
    @Deprecated
    public static final String REQUEST_CODE_TYPE_PASSWORD = "password";
    private final b compatWebservicesFactory;
    private final a<AccountRetrofit1Api, AccountRetrofit2Api> compatWs;
    private final d.b sensitiveActionsErrorHandler;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: RetrofitAccountRemoteRepository.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/withings/account/network/ws/RetrofitAccountRemoteRepository$Companion;", "", "()V", "APP_TYPE_VALUE", "", "CHANNEL_CALL", "", "CHANNEL_SMS", "CHANNEL_WHATSAPP", "IDACLPFL_VALUE", "REQUEST_CODE_TYPE_PASSWORD", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    private static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }
    }

    public RetrofitAccountRemoteRepository(b compatWebservicesFactory, d.b sensitiveActionsErrorHandler, String str) {
        u.j(compatWebservicesFactory, "compatWebservicesFactory");
        u.j(sensitiveActionsErrorHandler, "sensitiveActionsErrorHandler");
        this.compatWebservicesFactory = compatWebservicesFactory;
        this.sensitiveActionsErrorHandler = sensitiveActionsErrorHandler;
        f a11 = compatWebservicesFactory.a(str, AccountRetrofit1Api.class, AccountRetrofit2Api.class);
        this.compatWs = a11;
        a11.j(TwoFactorAuthentication.class, new TwoFactorAuthentication.Deserializer());
        a11.j(AccountUser.class, new AccountUserDeserializer());
    }

    @Override // com.withings.account.network.ws.AccountRemoteRepository
    public Object changePassword(String str, String str2, Long l5, qm0.d<? super y> dVar) {
        return a.d(this.compatWs, new RetrofitAccountRemoteRepository$changePassword$2(str, str2, l5), new RetrofitAccountRemoteRepository$changePassword$3(str, str2, l5, null), null, false, dVar, ConstantsWs.WS_STATUS_WRONGBATTERYLVL);
    }

    @Override // com.withings.account.network.ws.AccountRemoteRepository
    public Object checkConfirmationCode(String str, String str2, String str3, String str4, String str5, String str6, qm0.d<? super y> dVar) {
        return a.d(this.compatWs, new RetrofitAccountRemoteRepository$checkConfirmationCode$2(str, str2, str3, str4, str5, str6), new RetrofitAccountRemoteRepository$checkConfirmationCode$3(str, str2, str3, str4, str5, str6, null), this.sensitiveActionsErrorHandler, false, dVar, ConstantsWs.WS_STATUS_ASSOCSTATEUNKNOWN);
    }

    @Override // com.withings.account.network.ws.AccountRemoteRepository
    public Object confirmTotp(String str, qm0.d<? super y> dVar) {
        return a.d(this.compatWs, new RetrofitAccountRemoteRepository$confirmTotp$2(str), new RetrofitAccountRemoteRepository$confirmTotp$3(str, null), this.sensitiveActionsErrorHandler, false, dVar, ConstantsWs.WS_STATUS_ASSOCSTATEUNKNOWN);
    }

    @Override // com.withings.account.network.ws.AccountRemoteRepository
    public Object createAccount(String str, String str2, String str3, int i11, String str4, String str5, String str6, String str7, qm0.d<? super AccountCreation> dVar) {
        return a.a(this.compatWs, new RetrofitAccountRemoteRepository$createAccount$2(str, str2, str3, i11, str4, str5, str6, str7), new RetrofitAccountRemoteRepository$createAccount$3(str, str2, str3, i11, str4, str5, str6, str7, null), null, null, false, dVar, ConstantsWs.WS_STATUS_WRONG_STRIPE_ENV);
    }

    @Override // com.withings.account.network.ws.AccountRemoteRepository
    public Object createAccountWithToken(String str, String str2, String str3, String str4, int i11, String str5, String str6, String str7, String str8, String str9, qm0.d<? super AccountCreationResponse> dVar) {
        return a.a(this.compatWs, new RetrofitAccountRemoteRepository$createAccountWithToken$2(str, str2, str3, str4, i11, str5, str6, str7, str8, str9), new RetrofitAccountRemoteRepository$createAccountWithToken$3(str, str2, str3, str4, i11, str5, str6, str7, str8, str9, null), null, null, false, dVar, ConstantsWs.WS_STATUS_WRONG_STRIPE_ENV);
    }

    @Override // com.withings.account.network.ws.AccountRemoteRepository
    public Object createShortCode(String str, String str2, String str3, qm0.d<? super y> dVar) {
        return a.a(this.compatWs, new RetrofitAccountRemoteRepository$createShortCode$2(str, str2, str3), new RetrofitAccountRemoteRepository$createShortCode$3(str, str2, str3, null), null, null, false, dVar, ConstantsWs.WS_STATUS_WRONG_STRIPE_ENV);
    }

    @Override // com.withings.account.network.ws.AccountRemoteRepository
    public Object deleteAllPhoneFactors(qm0.d<? super y> dVar) {
        return a.d(this.compatWs, RetrofitAccountRemoteRepository$deleteAllPhoneFactors$2.INSTANCE, new RetrofitAccountRemoteRepository$deleteAllPhoneFactors$3(null), this.sensitiveActionsErrorHandler, false, dVar, ConstantsWs.WS_STATUS_ASSOCSTATEUNKNOWN);
    }

    @Override // com.withings.account.network.ws.AccountRemoteRepository
    public Object deleteCall(qm0.d<? super y> dVar) {
        return a.d(this.compatWs, RetrofitAccountRemoteRepository$deleteCall$2.INSTANCE, new RetrofitAccountRemoteRepository$deleteCall$3(null), this.sensitiveActionsErrorHandler, false, dVar, ConstantsWs.WS_STATUS_ASSOCSTATEUNKNOWN);
    }

    @Override // com.withings.account.network.ws.AccountRemoteRepository
    public Object deleteSms(qm0.d<? super y> dVar) {
        return a.d(this.compatWs, RetrofitAccountRemoteRepository$deleteSms$2.INSTANCE, new RetrofitAccountRemoteRepository$deleteSms$3(null), this.sensitiveActionsErrorHandler, false, dVar, ConstantsWs.WS_STATUS_ASSOCSTATEUNKNOWN);
    }

    @Override // com.withings.account.network.ws.AccountRemoteRepository
    public Object deleteTotp(qm0.d<? super y> dVar) {
        return a.d(this.compatWs, RetrofitAccountRemoteRepository$deleteTotp$2.INSTANCE, new RetrofitAccountRemoteRepository$deleteTotp$3(null), this.sensitiveActionsErrorHandler, false, dVar, ConstantsWs.WS_STATUS_ASSOCSTATEUNKNOWN);
    }

    @Override // com.withings.account.network.ws.AccountRemoteRepository
    public Object deleteWhatsapp(qm0.d<? super y> dVar) {
        return a.d(this.compatWs, RetrofitAccountRemoteRepository$deleteWhatsapp$2.INSTANCE, new RetrofitAccountRemoteRepository$deleteWhatsapp$3(null), this.sensitiveActionsErrorHandler, false, dVar, ConstantsWs.WS_STATUS_ASSOCSTATEUNKNOWN);
    }

    @Override // com.withings.account.network.ws.AccountRemoteRepository
    public Object generateRecoveryCode(qm0.d<? super CodesResponse> dVar) {
        return a.d(this.compatWs, RetrofitAccountRemoteRepository$generateRecoveryCode$2.INSTANCE, new RetrofitAccountRemoteRepository$generateRecoveryCode$3(null), this.sensitiveActionsErrorHandler, false, dVar, ConstantsWs.WS_STATUS_ASSOCSTATEUNKNOWN);
    }

    @Override // com.withings.account.network.ws.AccountRemoteRepository
    public Object generateTotp(qm0.d<? super TotpResponse> dVar) {
        return a.d(this.compatWs, RetrofitAccountRemoteRepository$generateTotp$2.INSTANCE, new RetrofitAccountRemoteRepository$generateTotp$3(null), this.sensitiveActionsErrorHandler, false, dVar, ConstantsWs.WS_STATUS_ASSOCSTATEUNKNOWN);
    }

    @Override // com.withings.account.network.ws.AccountRemoteRepository
    public Object getAccount(qm0.d<? super WsAccount.Response> dVar) {
        return a.d(this.compatWs, RetrofitAccountRemoteRepository$getAccount$2.INSTANCE, new RetrofitAccountRemoteRepository$getAccount$3(null), null, false, dVar, 124);
    }

    @Override // com.withings.account.network.ws.AccountRemoteRepository
    public Object getAuthentication(qm0.d<? super TwoFactorAuthentication.Response> dVar) {
        return a.d(this.compatWs, RetrofitAccountRemoteRepository$getAuthentication$2.INSTANCE, new RetrofitAccountRemoteRepository$getAuthentication$3(null), null, false, dVar, 124);
    }

    @Override // com.withings.account.network.ws.AccountRemoteRepository
    public Object getRecoveryCode(qm0.d<? super CodesResponse> dVar) {
        return a.d(this.compatWs, RetrofitAccountRemoteRepository$getRecoveryCode$2.INSTANCE, new RetrofitAccountRemoteRepository$getRecoveryCode$3(null), this.sensitiveActionsErrorHandler, false, dVar, ConstantsWs.WS_STATUS_ASSOCSTATEUNKNOWN);
    }

    @Override // com.withings.account.network.ws.AccountRemoteRepository
    public Object login(String str, String str2, String str3, int i11, String str4, String str5, String str6, String str7, String str8, qm0.d<? super AccountSession> dVar) {
        return a.a(this.compatWs, new RetrofitAccountRemoteRepository$login$2(str, str2, str3, i11, str4, str5, str6, str7, str8), new RetrofitAccountRemoteRepository$login$3(str, str2, str3, i11, str4, str5, str6, str7, str8, null), null, null, false, dVar, ConstantsWs.WS_STATUS_WRONG_STRIPE_ENV);
    }

    @Override // com.withings.account.network.ws.AccountRemoteRepository
    public Object providerAuth(String str, String str2, int i11, String str3, String str4, String str5, String str6, qm0.d<? super AccountUser> dVar) {
        return a.a(this.compatWs, new RetrofitAccountRemoteRepository$providerAuth$5(str, str2, i11, str3, str4, str5, str6), new RetrofitAccountRemoteRepository$providerAuth$6(str, str2, i11, str3, str4, str5, str6, null), null, null, false, dVar, ConstantsWs.WS_STATUS_WRONG_STRIPE_ENV);
    }

    @Override // com.withings.account.network.ws.AccountRemoteRepository
    public Object reactivate(long j5, qm0.d<? super y> dVar) {
        return a.d(this.compatWs, new RetrofitAccountRemoteRepository$reactivate$2(j5), new RetrofitAccountRemoteRepository$reactivate$3(j5, null), null, false, dVar, ConstantsWs.WS_STATUS_WRONGBATTERYLVL);
    }

    @Override // com.withings.account.network.ws.AccountRemoteRepository
    public Object requestDeletion(qm0.d<? super RequestDeletionResponse> dVar) {
        return a.d(this.compatWs, RetrofitAccountRemoteRepository$requestDeletion$2.INSTANCE, new RetrofitAccountRemoteRepository$requestDeletion$3(null), this.sensitiveActionsErrorHandler, false, dVar, ConstantsWs.WS_STATUS_ASSOCSTATEUNKNOWN);
    }

    @Override // com.withings.account.network.ws.AccountRemoteRepository
    public Object requestEmailUpdate(int i11, String str, qm0.d<? super y> dVar) {
        return a.d(this.compatWs, new RetrofitAccountRemoteRepository$requestEmailUpdate$2(i11, str), new RetrofitAccountRemoteRepository$requestEmailUpdate$3(i11, str, null), this.sensitiveActionsErrorHandler, false, dVar, ConstantsWs.WS_STATUS_ASSOCSTATEUNKNOWN);
    }

    @Override // com.withings.account.network.ws.AccountRemoteRepository
    public Object requestEmailValidation(qm0.d<? super y> dVar) {
        return a.d(this.compatWs, RetrofitAccountRemoteRepository$requestEmailValidation$2.INSTANCE, new RetrofitAccountRemoteRepository$requestEmailValidation$3(null), this.sensitiveActionsErrorHandler, false, dVar, ConstantsWs.WS_STATUS_ASSOCSTATEUNKNOWN);
    }

    @Override // com.withings.account.network.ws.AccountRemoteRepository
    public Object requestNewPassword(String str, qm0.d<? super y> dVar) {
        return a.a(this.compatWs, new RetrofitAccountRemoteRepository$requestNewPassword$2(str), new RetrofitAccountRemoteRepository$requestNewPassword$3(str, null), null, null, false, dVar, ConstantsWs.WS_STATUS_WRONG_STRIPE_ENV);
    }

    @Override // com.withings.account.network.ws.AccountRemoteRepository
    public Object requestPartnerInfo(String str, String str2, qm0.d<? super PartnerInfoResponse> dVar) {
        return a.a(this.compatWs, new RetrofitAccountRemoteRepository$requestPartnerInfo$2(str2), new RetrofitAccountRemoteRepository$requestPartnerInfo$3(str2, null), str, null, false, dVar, 504);
    }

    @Override // com.withings.account.network.ws.AccountRemoteRepository
    public Object sendCodeCall(qm0.d<? super y> dVar) {
        return a.d(this.compatWs, RetrofitAccountRemoteRepository$sendCodeCall$2.INSTANCE, new RetrofitAccountRemoteRepository$sendCodeCall$3(null), this.sensitiveActionsErrorHandler, false, dVar, ConstantsWs.WS_STATUS_ASSOCSTATEUNKNOWN);
    }

    @Override // com.withings.account.network.ws.AccountRemoteRepository
    public Object sendCodeSms(qm0.d<? super y> dVar) {
        return a.d(this.compatWs, RetrofitAccountRemoteRepository$sendCodeSms$2.INSTANCE, new RetrofitAccountRemoteRepository$sendCodeSms$3(null), this.sensitiveActionsErrorHandler, false, dVar, ConstantsWs.WS_STATUS_ASSOCSTATEUNKNOWN);
    }

    @Override // com.withings.account.network.ws.AccountRemoteRepository
    public Object sendCodeWhatsApp(qm0.d<? super y> dVar) {
        return a.d(this.compatWs, RetrofitAccountRemoteRepository$sendCodeWhatsApp$2.INSTANCE, new RetrofitAccountRemoteRepository$sendCodeWhatsApp$3(null), this.sensitiveActionsErrorHandler, false, dVar, ConstantsWs.WS_STATUS_ASSOCSTATEUNKNOWN);
    }

    @Override // com.withings.account.network.ws.AccountRemoteRepository
    public Object sendConfirmationCodeCall(String str, qm0.d<? super y> dVar) {
        return a.d(this.compatWs, new RetrofitAccountRemoteRepository$sendConfirmationCodeCall$2(str), new RetrofitAccountRemoteRepository$sendConfirmationCodeCall$3(str, null), this.sensitiveActionsErrorHandler, false, dVar, ConstantsWs.WS_STATUS_ASSOCSTATEUNKNOWN);
    }

    @Override // com.withings.account.network.ws.AccountRemoteRepository
    public Object sendConfirmationCodeSms(String str, qm0.d<? super y> dVar) {
        return a.d(this.compatWs, new RetrofitAccountRemoteRepository$sendConfirmationCodeSms$2(str), new RetrofitAccountRemoteRepository$sendConfirmationCodeSms$3(str, null), this.sensitiveActionsErrorHandler, false, dVar, ConstantsWs.WS_STATUS_ASSOCSTATEUNKNOWN);
    }

    @Override // com.withings.account.network.ws.AccountRemoteRepository
    public Object sendConfirmationCodeWhatsApp(String str, qm0.d<? super y> dVar) {
        return a.d(this.compatWs, new RetrofitAccountRemoteRepository$sendConfirmationCodeWhatsApp$2(str), new RetrofitAccountRemoteRepository$sendConfirmationCodeWhatsApp$3(str, null), this.sensitiveActionsErrorHandler, false, dVar, ConstantsWs.WS_STATUS_ASSOCSTATEUNKNOWN);
    }

    @Override // com.withings.account.network.ws.AccountRemoteRepository
    public Object updateAccount(long j5, String str, String str2, qm0.d<? super y> dVar) {
        return a.d(this.compatWs, new RetrofitAccountRemoteRepository$updateAccount$2(j5, str, str2), new RetrofitAccountRemoteRepository$updateAccount$3(j5, str, str2, null), null, false, dVar, ConstantsWs.WS_STATUS_WRONGBATTERYLVL);
    }

    @Override // com.withings.account.network.ws.AccountRemoteRepository
    public Object updateAccountContext(long j5, WsAccount.Context context, qm0.d<? super y> dVar) {
        String json = new Gson().toJson(context);
        return a.d(this.compatWs, new RetrofitAccountRemoteRepository$updateAccountContext$2(j5, json), new RetrofitAccountRemoteRepository$updateAccountContext$3(j5, json, null), null, false, dVar, ConstantsWs.WS_STATUS_WRONGBATTERYLVL);
    }

    @Override // com.withings.account.network.ws.AccountRemoteRepository
    public AccountRemoteRepository withSyncContext(String str) {
        return new RetrofitAccountRemoteRepository(this.compatWebservicesFactory, this.sensitiveActionsErrorHandler, str);
    }

    @Override // com.withings.account.network.ws.AccountRemoteRepository
    public Object createAccount(String str, String str2, String str3, String str4, int i11, String str5, String str6, String str7, String str8, String str9, qm0.d<? super AccountSession> dVar) {
        return a.a(this.compatWs, new RetrofitAccountRemoteRepository$createAccount$5(str, str2, str3, str4, i11, str5, str6, str7, str8, str9), new RetrofitAccountRemoteRepository$createAccount$6(str, str2, str3, str4, i11, str5, str6, str7, str8, str9, null), null, null, false, dVar, ConstantsWs.WS_STATUS_WRONG_STRIPE_ENV);
    }

    @Override // com.withings.account.network.ws.AccountRemoteRepository
    public Object providerAuth(String str, String str2, String str3, int i11, String str4, String str5, String str6, String str7, qm0.d<? super AccountUser> dVar) {
        return a.a(this.compatWs, new RetrofitAccountRemoteRepository$providerAuth$2(str, str2, str3, i11, str4, str5, str6, str7), new RetrofitAccountRemoteRepository$providerAuth$3(str, str2, str3, i11, str4, str5, str6, str7, null), null, null, false, dVar, ConstantsWs.WS_STATUS_WRONG_STRIPE_ENV);
    }

    public /* synthetic */ RetrofitAccountRemoteRepository(b bVar, d.b bVar2, String str, int i11, m mVar) {
        this(bVar, bVar2, (i11 & 4) != 0 ? null : str);
    }
}
