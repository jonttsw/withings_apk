package com.withings.account.network.ws;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.withings.account.models.TotpResponse;
import com.withings.account.models.TwoFactorAuthentication;
import com.withings.account.network.ws.WsAccount;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.webservices.legacy.common.exception.AlreadyExistsException;
import com.withings.webservices.legacy.common.exception.ObjectNotFoundException;
import com.withings.webservices.legacy.common.exception.UnauthorizedPasswordException;
import com.withings.webservices.legacy.common.exception.WrongOldPasswordException;
import com.withings.webservices.legacy.common.exception.WsAuthFailedException;
import com.withings.webservices.legacy.withings.model.AccountCreation;
import com.withings.webservices.legacy.withings.model.session.AccountSession;
import fr0.c;
import fr0.e;
import fr0.o;
import kotlin.Metadata;
import nm0.y;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;
import qm0.d;
/* compiled from: AccountRetrofit2Api.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006Jt\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u00072\b\b\u0001\u0010\u000f\u001a\u00020\u00072\b\b\u0001\u0010\u0010\u001a\u00020\u00072\b\b\u0001\u0010\u0011\u001a\u00020\u0007H§@¢\u0006\u0004\b\u0013\u0010\u0014J\u008c\u0001\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0015\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u00072\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u00022\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u00022\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\u000e\u001a\u00020\u00072\b\b\u0001\u0010\u000f\u001a\u00020\u00072\b\b\u0001\u0010\u0010\u001a\u00020\u00072\b\b\u0001\u0010\u0011\u001a\u00020\u0007H§@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0088\u0001\u0010\u0013\u001a\u00020\u001d2\b\b\u0001\u0010\u0017\u001a\u00020\u00072\b\b\u0001\u0010\u001b\u001a\u00020\u00072\b\b\u0001\u0010\u0016\u001a\u00020\u00072\b\b\u0001\u0010\u001c\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00072\b\b\u0001\u0010\u000e\u001a\u00020\u00072\b\b\u0001\u0010\u000f\u001a\u00020\u00072\b\b\u0001\u0010\u0010\u001a\u00020\u00072\b\b\u0001\u0010\u0011\u001a\u00020\u0007H§@¢\u0006\u0004\b\u0013\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fH§@¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u001fH§@¢\u0006\u0004\b\"\u0010!Jj\u0010#\u001a\u00020\u001d2\b\b\u0001\u0010\u0017\u001a\u00020\u00072\b\b\u0001\u0010\u001b\u001a\u00020\u00072\b\b\u0001\u0010\u0016\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\u001c\u001a\u00020\u00072\b\b\u0001\u0010\u000e\u001a\u00020\u00072\b\b\u0001\u0010\u000f\u001a\u00020\u00072\b\b\u0001\u0010\u0010\u001a\u00020\u00072\b\b\u0001\u0010\u0011\u001a\u00020\u0007H§@¢\u0006\u0004\b#\u0010$J.\u0010)\u001a\u00020(2\b\b\u0001\u0010&\u001a\u00020%2\b\b\u0001\u0010'\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b)\u0010*J.\u0010-\u001a\u00020(2\b\b\u0001\u0010&\u001a\u00020%2\b\b\u0001\u0010+\u001a\u00020\u00072\b\b\u0001\u0010,\u001a\u00020\u0007H§@¢\u0006\u0004\b-\u0010.J2\u00101\u001a\u00020(2\n\b\u0001\u0010/\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u00100\u001a\u00020\u00072\n\b\u0001\u0010&\u001a\u0004\u0018\u00010%H§@¢\u0006\u0004\b1\u00102J$\u00104\u001a\u00020(2\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u00103\u001a\u00020\u0007H§@¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020(H§@¢\u0006\u0004\b6\u0010!J$\u00107\u001a\u00020(2\b\b\u0001\u0010&\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b7\u00108J\u001a\u0010:\u001a\u00020(2\b\b\u0001\u00109\u001a\u00020\u0007H§@¢\u0006\u0004\b:\u0010;J\u001c\u0010<\u001a\u00020(2\n\b\u0003\u00109\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0004\b<\u0010;J(\u0010>\u001a\u00020(2\n\b\u0003\u00109\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010=\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0004\b>\u00105JV\u0010@\u001a\u00020(2\b\b\u0001\u0010?\u001a\u00020\u00072\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0004\b@\u0010AJ\u0010\u0010C\u001a\u00020BH§@¢\u0006\u0004\bC\u0010!J2\u0010E\u001a\u00020(2\b\b\u0001\u0010\b\u001a\u00020\u00072\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010D\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0004\bE\u0010FJl\u0010I\u001a\u00020H2\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010G\u001a\u00020\u00072\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\u0017\u001a\u00020\u00072\b\b\u0001\u0010\u000e\u001a\u00020\u00072\b\b\u0001\u0010\u000f\u001a\u00020\u00072\b\b\u0001\u0010\u0010\u001a\u00020\u00072\b\b\u0001\u0010\u0011\u001a\u00020\u0007H§@¢\u0006\u0004\bI\u0010$Jb\u0010I\u001a\u00020H2\b\b\u0001\u0010J\u001a\u00020\u00072\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\u0017\u001a\u00020\u00072\b\b\u0001\u0010\u000e\u001a\u00020\u00072\b\b\u0001\u0010\u000f\u001a\u00020\u00072\b\b\u0001\u0010\u0010\u001a\u00020\u00072\b\b\u0001\u0010\u0011\u001a\u00020\u0007H§@¢\u0006\u0004\bI\u0010KJ\u0010\u0010M\u001a\u00020LH§@¢\u0006\u0004\bM\u0010!J\u001a\u0010P\u001a\u00020O2\b\b\u0001\u0010N\u001a\u00020\u0007H§@¢\u0006\u0004\bP\u0010;J\u001a\u0010Q\u001a\u00020(2\b\b\u0001\u0010&\u001a\u00020%H§@¢\u0006\u0004\bQ\u0010RJ\u0010\u0010T\u001a\u00020SH§@¢\u0006\u0004\bT\u0010!J\u001a\u0010U\u001a\u00020(2\b\b\u0001\u0010?\u001a\u00020\u0007H§@¢\u0006\u0004\bU\u0010;J\u0010\u0010V\u001a\u00020(H§@¢\u0006\u0004\bV\u0010!¨\u0006WÀ\u0006\u0003"}, d2 = {"Lcom/withings/account/network/ws/AccountRetrofit2Api;", "", "", "appType", "Lcom/withings/account/network/ws/WsAccount$Response;", "getAccount", "(ILqm0/d;)Ljava/lang/Object;", "", "email", "hash", "prefLang", "duration", ConstantsWs.JSON_ACCOUNT_KEY_BRANDING, ConstantsWs.JSON_ACCOUNT_KEY_IDACLPFL, "modelName", "typeName", "os", "osVersion", "Lcom/withings/webservices/legacy/withings/model/AccountCreation;", "createAccount", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "token", "uuid", "authProvider", "Lcom/withings/account/network/ws/AccountCreationResponse;", "createAccountWithToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", CommonConstant.KEY_ID_TOKEN, "clientId", "Lcom/withings/webservices/legacy/withings/model/session/AccountSession;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/account/network/ws/CodesResponse;", "getRecoveryCode", "(Lqm0/d;)Ljava/lang/Object;", "generateRecoveryCode", FirebaseAnalytics.Event.LOGIN, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "", "accountId", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Lnm0/y;", "updateAccountContext", "(JLjava/lang/String;ILqm0/d;)Ljava/lang/Object;", "timezone", "language", "updateAccount", "(JLjava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "oldPassword", "passwordClear", "changePassword", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lqm0/d;)Ljava/lang/Object;", "type", "requestNewPassword", "(Ljava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "requestEmailValidation", "requestEmailUpdate", "(ILjava/lang/String;Lqm0/d;)Ljava/lang/Object;", "channel", "sendCode", "(Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "deletePhone", "phoneNumber", "sendConfirmationCode", XHTMLText.CODE, "checkConfirmationCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/account/models/TwoFactorAuthentication$Response;", "getAuthentication", "state", "createShortCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "shortCode", "Lcom/withings/account/network/ws/AccountUser;", "providerAuth", "jwt", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/account/network/ws/RequestDeletionResponse;", "requestDeletion", "sessionId", "Lcom/withings/account/network/ws/PartnerInfoResponse;", "requestPartnerInfo", "reactivate", "(JLqm0/d;)Ljava/lang/Object;", "Lcom/withings/account/models/TotpResponse;", "generateTotp", "confirmTotp", "deleteTotp", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface AccountRetrofit2Api {

    /* compiled from: AccountRetrofit2Api.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object deletePhone$default(AccountRetrofit2Api accountRetrofit2Api, String str, d dVar, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 1) != 0) {
                str = null;
            }
            return accountRetrofit2Api.deletePhone(str, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deletePhone");
    }

    static /* synthetic */ Object sendConfirmationCode$default(AccountRetrofit2Api accountRetrofit2Api, String str, String str2, d dVar, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 1) != 0) {
                str = null;
            }
            return accountRetrofit2Api.sendConfirmationCode(str, str2, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendConfirmationCode");
    }

    @e
    @o("account?action=changepassword")
    Object changePassword(@c("oldpassword") String str, @c("password_clear") String str2, @c("accountid") Long l5, d<? super y> dVar) throws WsAuthFailedException, WrongOldPasswordException;

    @e
    @o("v2/account?action=checkconfirmationcode")
    Object checkConfirmationCode(@c("code") String str, @c("token") String str2, @c("modelname") String str3, @c("typename") String str4, @c("os") String str5, @c("osversion") String str6, d<? super y> dVar);

    @e
    @o("v2/account?action=confirmtotp")
    Object confirmTotp(@c("code") String str, d<? super y> dVar);

    @e
    @o("account?action=create")
    Object createAccount(@c("email") String str, @c("password") String str2, @c("preflang") String str3, @c("duration") int i11, @c("branding") int i12, @c("idaclpfl") int i13, @c("modelname") String str4, @c("typename") String str5, @c("os") String str6, @c("osversion") String str7, d<? super AccountCreation> dVar) throws AlreadyExistsException, UnauthorizedPasswordException;

    @e
    @o("v2/account?action=providerauth")
    Object createAccount(@c("authprovider") String str, @c("id_token") String str2, @c("uuid") String str3, @c("client_id") String str4, @c("duration") int i11, @c("idaclpfl") int i12, @c("branding") int i13, @c("preflang") String str5, @c("modelname") String str6, @c("typename") String str7, @c("os") String str8, @c("osversion") String str9, d<? super AccountSession> dVar) throws AlreadyExistsException, UnauthorizedPasswordException;

    @e
    @o("account?action=create")
    Object createAccountWithToken(@c("email") String str, @c("account_creation_token") String str2, @c("preflang") String str3, @c("branding") int i11, @c("idaclpfl") int i12, @c("uuid") String str4, @c("duration") int i13, @c("authprovider") String str5, @c("modelname") String str6, @c("typename") String str7, @c("os") String str8, @c("osversion") String str9, d<? super AccountCreationResponse> dVar) throws AlreadyExistsException, UnauthorizedPasswordException;

    @e
    @o("v2/account?action=createshortcode")
    Object createShortCode(@c("email") String str, @c("lang") String str2, @c("state") String str3, d<? super y> dVar);

    @e
    @o("v2/account?action=deletephone")
    Object deletePhone(@c("channel") String str, d<? super y> dVar);

    @o("v2/account?action=deletetotp")
    Object deleteTotp(d<? super y> dVar);

    @o("v2/account?action=generaterecoverycodes")
    Object generateRecoveryCode(d<? super CodesResponse> dVar);

    @o("v2/account?action=generatetotp")
    Object generateTotp(d<? super TotpResponse> dVar);

    @e
    @o("account?action=get")
    Object getAccount(@c("applitype") int i11, d<? super WsAccount.Response> dVar);

    @o("v2/account?action=getauthentication")
    Object getAuthentication(d<? super TwoFactorAuthentication.Response> dVar);

    @o("v2/account?action=getrecoverycodes")
    Object getRecoveryCode(d<? super CodesResponse> dVar);

    @e
    @o("v2/account?action=providerauth")
    Object login(@c("authprovider") String str, @c("id_token") String str2, @c("uuid") String str3, @c("duration") int i11, @c("client_id") String str4, @c("modelname") String str5, @c("typename") String str6, @c("os") String str7, @c("osversion") String str8, d<? super AccountSession> dVar) throws WsAuthFailedException;

    @e
    @o("v2/account?action=providerauth")
    Object providerAuth(@c("jwt") String str, @c("uuid") String str2, @c("duration") int i11, @c("authprovider") String str3, @c("modelname") String str4, @c("typename") String str5, @c("os") String str6, @c("osversion") String str7, d<? super AccountUser> dVar) throws WsAuthFailedException;

    @e
    @o("v2/account?action=providerauth")
    Object providerAuth(@c("email") String str, @c("shortcode") String str2, @c("uuid") String str3, @c("duration") int i11, @c("authprovider") String str4, @c("modelname") String str5, @c("typename") String str6, @c("os") String str7, @c("osversion") String str8, d<? super AccountUser> dVar) throws WsAuthFailedException;

    @e
    @o("v2/account?action=reactivate")
    Object reactivate(@c("accountid") long j5, d<? super y> dVar);

    @o("v2/account?action=requestdeletion")
    Object requestDeletion(d<? super RequestDeletionResponse> dVar);

    @e
    @o("v2/account?action=requestemailupdate")
    Object requestEmailUpdate(@c("accountid") int i11, @c("email") String str, d<? super y> dVar) throws ObjectNotFoundException;

    @o("v2/account?action=requestemailvalidation")
    Object requestEmailValidation(d<? super y> dVar) throws ObjectNotFoundException;

    @e
    @o("v2/account?action=requestcode")
    Object requestNewPassword(@c("email") String str, @c("type") String str2, d<? super y> dVar) throws ObjectNotFoundException;

    @o("v2/account?action=getpartnerinfo")
    Object requestPartnerInfo(@c("sessionid") String str, d<? super PartnerInfoResponse> dVar);

    @e
    @o("v2/account?action=sendcode")
    Object sendCode(@c("channel") String str, d<? super y> dVar);

    @e
    @o("v2/account?action=sendconfirmationcode")
    Object sendConfirmationCode(@c("channel") String str, @c("phonenumber") String str2, d<? super y> dVar);

    @e
    @o("account?action=update")
    Object updateAccount(@c("accountid") long j5, @c("timezone") String str, @c("preflang") String str2, d<? super y> dVar);

    @e
    @o("account?action=updatectx")
    Object updateAccountContext(@c("accountid") long j5, @c("context") String str, @c("applitype") int i11, d<? super y> dVar);
}
