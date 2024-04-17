package com.withings.account.network.ws;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.withings.account.models.TotpResponse;
import com.withings.account.models.TwoFactorAuthentication;
import com.withings.account.network.ws.WsAccount;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.webservices.legacy.withings.model.AccountCreation;
import com.withings.webservices.legacy.withings.model.session.AccountSession;
import kotlin.Metadata;
import nm0.y;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;
import qm0.d;
/* compiled from: AccountRemoteRepository.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u0007\u0010\bJP\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0013\u0010\u0014Jd\u0010\u0019\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0019\u0010\u001aJ`\u0010\u0013\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0013\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u001eH¦@¢\u0006\u0004\b\u001f\u0010\bJ\u0010\u0010 \u001a\u00020\u001eH¦@¢\u0006\u0004\b \u0010\bJX\u0010!\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H¦@¢\u0006\u0004\b!\u0010\"J \u0010(\u001a\u00020'2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H¦@¢\u0006\u0004\b(\u0010)J(\u0010,\u001a\u00020'2\u0006\u0010$\u001a\u00020#2\u0006\u0010*\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u0002H¦@¢\u0006\u0004\b,\u0010-J0\u00100\u001a\u00020'2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00022\u0006\u0010/\u001a\u00020\u00022\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#H¦@¢\u0006\u0004\b0\u00101J\u0018\u00102\u001a\u00020'2\u0006\u0010\t\u001a\u00020\u0002H¦@¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020'H¦@¢\u0006\u0004\b4\u0010\bJ \u00105\u001a\u00020'2\u0006\u0010$\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0002H¦@¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020'H¦@¢\u0006\u0004\b7\u0010\bJ\u0010\u00108\u001a\u00020'H¦@¢\u0006\u0004\b8\u0010\bJ\u0010\u00109\u001a\u00020'H¦@¢\u0006\u0004\b9\u0010\bJ\u0010\u0010:\u001a\u00020'H¦@¢\u0006\u0004\b:\u0010\bJ\u0010\u0010;\u001a\u00020'H¦@¢\u0006\u0004\b;\u0010\bJ\u0010\u0010<\u001a\u00020'H¦@¢\u0006\u0004\b<\u0010\bJ\u0010\u0010=\u001a\u00020'H¦@¢\u0006\u0004\b=\u0010\bJ\u001a\u0010?\u001a\u00020'2\b\u0010>\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b?\u00103J\u001a\u0010@\u001a\u00020'2\b\u0010>\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b@\u00103J\u001a\u0010A\u001a\u00020'2\b\u0010>\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\bA\u00103JJ\u0010C\u001a\u00020'2\u0006\u0010B\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\bC\u0010DJ\u0010\u0010F\u001a\u00020EH¦@¢\u0006\u0004\bF\u0010\bJ,\u0010H\u001a\u00020'2\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u0010G\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\bH\u0010IJR\u0010L\u001a\u00020K2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010J\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H¦@¢\u0006\u0004\bL\u0010\u0014JJ\u0010L\u001a\u00020K2\u0006\u0010M\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H¦@¢\u0006\u0004\bL\u0010NJ\u0010\u0010P\u001a\u00020OH¦@¢\u0006\u0004\bP\u0010\bJ \u0010T\u001a\u00020S2\u0006\u0010Q\u001a\u00020\u00022\u0006\u0010R\u001a\u00020\u0002H¦@¢\u0006\u0004\bT\u0010UJ\u0018\u0010V\u001a\u00020'2\u0006\u0010$\u001a\u00020#H¦@¢\u0006\u0004\bV\u0010WJ\u0010\u0010Y\u001a\u00020XH¦@¢\u0006\u0004\bY\u0010\bJ\u0018\u0010Z\u001a\u00020'2\u0006\u0010B\u001a\u00020\u0002H¦@¢\u0006\u0004\bZ\u00103J\u0010\u0010[\u001a\u00020'H¦@¢\u0006\u0004\b[\u0010\b¨\u0006\\À\u0006\u0003"}, d2 = {"Lcom/withings/account/network/ws/AccountRemoteRepository;", "", "", "syncContext", "withSyncContext", "(Ljava/lang/String;)Lcom/withings/account/network/ws/AccountRemoteRepository;", "Lcom/withings/account/network/ws/WsAccount$Response;", "getAccount", "(Lqm0/d;)Ljava/lang/Object;", "email", "hash", "prefLang", "", "duration", "modelName", "typeName", "os", "osVersion", "Lcom/withings/webservices/legacy/withings/model/AccountCreation;", "createAccount", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "token", "uuid", "authProvider", "Lcom/withings/account/network/ws/AccountCreationResponse;", "createAccountWithToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", CommonConstant.KEY_ID_TOKEN, "clientId", "Lcom/withings/webservices/legacy/withings/model/session/AccountSession;", "Lcom/withings/account/network/ws/CodesResponse;", "getRecoveryCode", "generateRecoveryCode", FirebaseAnalytics.Event.LOGIN, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "", "accountId", "Lcom/withings/account/network/ws/WsAccount$Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Lnm0/y;", "updateAccountContext", "(JLcom/withings/account/network/ws/WsAccount$Context;Lqm0/d;)Ljava/lang/Object;", "timezone", "language", "updateAccount", "(JLjava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "oldPassword", "passwordClear", "changePassword", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lqm0/d;)Ljava/lang/Object;", "requestNewPassword", "(Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "requestEmailValidation", "requestEmailUpdate", "(ILjava/lang/String;Lqm0/d;)Ljava/lang/Object;", "sendCodeWhatsApp", "sendCodeSms", "sendCodeCall", "deleteAllPhoneFactors", "deleteWhatsapp", "deleteSms", "deleteCall", "phoneNumber", "sendConfirmationCodeWhatsApp", "sendConfirmationCodeSms", "sendConfirmationCodeCall", XHTMLText.CODE, "checkConfirmationCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/account/models/TwoFactorAuthentication$Response;", "getAuthentication", "state", "createShortCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "shortCode", "Lcom/withings/account/network/ws/AccountUser;", "providerAuth", "jwt", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/account/network/ws/RequestDeletionResponse;", "requestDeletion", "baseUrl", "sessionId", "Lcom/withings/account/network/ws/PartnerInfoResponse;", "requestPartnerInfo", "(Ljava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "reactivate", "(JLqm0/d;)Ljava/lang/Object;", "Lcom/withings/account/models/TotpResponse;", "generateTotp", "confirmTotp", "deleteTotp", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface AccountRemoteRepository {

    /* compiled from: AccountRemoteRepository.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object changePassword$default(AccountRemoteRepository accountRemoteRepository, String str, String str2, Long l5, d dVar, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 1) != 0) {
                str = null;
            }
            if ((i11 & 4) != 0) {
                l5 = null;
            }
            return accountRemoteRepository.changePassword(str, str2, l5, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: changePassword");
    }

    Object changePassword(String str, String str2, Long l5, d<? super y> dVar);

    Object checkConfirmationCode(String str, String str2, String str3, String str4, String str5, String str6, d<? super y> dVar);

    Object confirmTotp(String str, d<? super y> dVar);

    Object createAccount(String str, String str2, String str3, int i11, String str4, String str5, String str6, String str7, d<? super AccountCreation> dVar);

    Object createAccount(String str, String str2, String str3, String str4, int i11, String str5, String str6, String str7, String str8, String str9, d<? super AccountSession> dVar);

    Object createAccountWithToken(String str, String str2, String str3, String str4, int i11, String str5, String str6, String str7, String str8, String str9, d<? super AccountCreationResponse> dVar);

    Object createShortCode(String str, String str2, String str3, d<? super y> dVar);

    Object deleteAllPhoneFactors(d<? super y> dVar);

    Object deleteCall(d<? super y> dVar);

    Object deleteSms(d<? super y> dVar);

    Object deleteTotp(d<? super y> dVar);

    Object deleteWhatsapp(d<? super y> dVar);

    Object generateRecoveryCode(d<? super CodesResponse> dVar);

    Object generateTotp(d<? super TotpResponse> dVar);

    Object getAccount(d<? super WsAccount.Response> dVar);

    Object getAuthentication(d<? super TwoFactorAuthentication.Response> dVar);

    Object getRecoveryCode(d<? super CodesResponse> dVar);

    Object login(String str, String str2, String str3, int i11, String str4, String str5, String str6, String str7, String str8, d<? super AccountSession> dVar);

    Object providerAuth(String str, String str2, int i11, String str3, String str4, String str5, String str6, d<? super AccountUser> dVar);

    Object providerAuth(String str, String str2, String str3, int i11, String str4, String str5, String str6, String str7, d<? super AccountUser> dVar);

    Object reactivate(long j5, d<? super y> dVar);

    Object requestDeletion(d<? super RequestDeletionResponse> dVar);

    Object requestEmailUpdate(int i11, String str, d<? super y> dVar);

    Object requestEmailValidation(d<? super y> dVar);

    Object requestNewPassword(String str, d<? super y> dVar);

    Object requestPartnerInfo(String str, String str2, d<? super PartnerInfoResponse> dVar);

    Object sendCodeCall(d<? super y> dVar);

    Object sendCodeSms(d<? super y> dVar);

    Object sendCodeWhatsApp(d<? super y> dVar);

    Object sendConfirmationCodeCall(String str, d<? super y> dVar);

    Object sendConfirmationCodeSms(String str, d<? super y> dVar);

    Object sendConfirmationCodeWhatsApp(String str, d<? super y> dVar);

    Object updateAccount(long j5, String str, String str2, d<? super y> dVar);

    Object updateAccountContext(long j5, WsAccount.Context context, d<? super y> dVar);

    AccountRemoteRepository withSyncContext(String str);
}
