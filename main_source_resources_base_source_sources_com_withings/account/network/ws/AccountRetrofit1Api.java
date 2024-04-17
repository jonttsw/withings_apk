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
import kotlin.Metadata;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;
/* compiled from: AccountRetrofit1Api.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b`\u0018\u00002\u00020\u0001J/\u0010\u0002\u001a\u00020\u00012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007H'¢\u0006\u0002\u0010\bJN\u0010\t\u001a\u00020\u00012\b\b\u0001\u0010\n\u001a\u00020\u00042\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0004H'J\u0012\u0010\u0010\u001a\u00020\u00012\b\b\u0001\u0010\n\u001a\u00020\u0004H'Jl\u0010\u0011\u001a\u00020\u00122\b\b\u0001\u0010\u0013\u001a\u00020\u00042\b\b\u0001\u0010\u0014\u001a\u00020\u00042\b\b\u0001\u0010\u0015\u001a\u00020\u00042\b\b\u0001\u0010\u0016\u001a\u00020\u00172\b\b\u0001\u0010\u0018\u001a\u00020\u00172\b\b\u0001\u0010\u0019\u001a\u00020\u00172\b\b\u0001\u0010\f\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\u00042\b\b\u0001\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\u000f\u001a\u00020\u0004H'J\u0080\u0001\u0010\u0011\u001a\u00020\u001a2\b\b\u0001\u0010\u001b\u001a\u00020\u00042\b\b\u0001\u0010\u001c\u001a\u00020\u00042\b\b\u0001\u0010\u001d\u001a\u00020\u00042\b\b\u0001\u0010\u001e\u001a\u00020\u00042\b\b\u0001\u0010\u0016\u001a\u00020\u00172\b\b\u0001\u0010\u0019\u001a\u00020\u00172\b\b\u0001\u0010\u0018\u001a\u00020\u00172\b\b\u0001\u0010\u0015\u001a\u00020\u00042\b\b\u0001\u0010\f\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\u00042\b\b\u0001\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\u000f\u001a\u00020\u0004H'J\u0084\u0001\u0010\u001f\u001a\u00020 2\b\b\u0001\u0010\u0013\u001a\u00020\u00042\b\b\u0001\u0010\u000b\u001a\u00020\u00042\b\b\u0001\u0010\u0015\u001a\u00020\u00042\b\b\u0001\u0010\u0018\u001a\u00020\u00172\b\b\u0001\u0010\u0019\u001a\u00020\u00172\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0016\u001a\u00020\u00172\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\f\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\u00042\b\b\u0001\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\u000f\u001a\u00020\u0004H'J*\u0010!\u001a\u00020\u00012\b\b\u0001\u0010\u0013\u001a\u00020\u00042\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u0004H'J\u0014\u0010#\u001a\u00020\u00012\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u0004H'J\b\u0010%\u001a\u00020\u0001H'J\b\u0010&\u001a\u00020'H'J\b\u0010(\u001a\u00020)H'J\u0012\u0010*\u001a\u00020+2\b\b\u0001\u0010,\u001a\u00020\u0017H'J\b\u0010-\u001a\u00020.H'J\b\u0010/\u001a\u00020'H'Jb\u00100\u001a\u00020\u001a2\b\b\u0001\u0010\u001b\u001a\u00020\u00042\b\b\u0001\u0010\u001c\u001a\u00020\u00042\b\b\u0001\u0010\u001d\u001a\u00020\u00042\b\b\u0001\u0010\u0016\u001a\u00020\u00172\b\b\u0001\u0010\u001e\u001a\u00020\u00042\b\b\u0001\u0010\f\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\u00042\b\b\u0001\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\u000f\u001a\u00020\u0004H'Jd\u00101\u001a\u0002022\b\b\u0001\u0010\u0013\u001a\u00020\u00042\b\b\u0001\u00103\u001a\u00020\u00042\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0016\u001a\u00020\u00172\b\b\u0001\u0010\u001b\u001a\u00020\u00042\b\b\u0001\u0010\f\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\u00042\b\b\u0001\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\u000f\u001a\u00020\u0004H'JZ\u00101\u001a\u0002022\b\b\u0001\u00104\u001a\u00020\u00042\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0016\u001a\u00020\u00172\b\b\u0001\u0010\u001b\u001a\u00020\u00042\b\b\u0001\u0010\f\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\u00042\b\b\u0001\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\u000f\u001a\u00020\u0004H'J\u0012\u00105\u001a\u00020\u00012\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J\b\u00106\u001a\u000207H'J\u001c\u00108\u001a\u00020\u00012\b\b\u0001\u0010\u0006\u001a\u00020\u00172\b\b\u0001\u0010\u0013\u001a\u00020\u0004H'J\b\u00109\u001a\u00020\u0001H'J\u001c\u0010:\u001a\u00020\u00012\b\b\u0001\u0010\u0013\u001a\u00020\u00042\b\b\u0001\u0010;\u001a\u00020\u0004H'J\u0012\u0010<\u001a\u00020=2\b\b\u0001\u0010>\u001a\u00020\u0004H'J\u0012\u0010?\u001a\u00020\u00012\b\b\u0001\u0010$\u001a\u00020\u0004H'J \u0010@\u001a\u00020\u00012\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010A\u001a\u0004\u0018\u00010\u0004H'J&\u0010B\u001a\u00020\u00012\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010C\u001a\u00020\u00042\b\b\u0001\u0010D\u001a\u00020\u0004H'J&\u0010E\u001a\u00020\u00012\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010F\u001a\u00020\u00042\b\b\u0001\u0010,\u001a\u00020\u0017H'¨\u0006GÀ\u0006\u0003"}, d2 = {"Lcom/withings/account/network/ws/AccountRetrofit1Api;", "", "changePassword", "oldPassword", "", "passwordClear", "accountId", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Ljava/lang/Object;", "checkConfirmationCode", XHTMLText.CODE, "token", "modelName", "typeName", "os", "osVersion", "confirmTotp", "createAccount", "Lcom/withings/webservices/legacy/withings/model/AccountCreation;", "email", "hash", "prefLang", "duration", "", ConstantsWs.JSON_ACCOUNT_KEY_BRANDING, ConstantsWs.JSON_ACCOUNT_KEY_IDACLPFL, "Lcom/withings/webservices/legacy/withings/model/session/AccountSession;", "authProvider", CommonConstant.KEY_ID_TOKEN, "uuid", "clientId", "createAccountWithToken", "Lcom/withings/account/network/ws/AccountCreationResponse;", "createShortCode", "state", "deletePhone", "channel", "deleteTotp", "generateRecoveryCode", "Lcom/withings/account/network/ws/CodesResponse;", "generateTotp", "Lcom/withings/account/models/TotpResponse;", "getAccount", "Lcom/withings/account/network/ws/WsAccount$Response;", "appType", "getAuthentication", "Lcom/withings/account/models/TwoFactorAuthentication$Response;", "getRecoveryCode", FirebaseAnalytics.Event.LOGIN, "providerAuth", "Lcom/withings/account/network/ws/AccountUser;", "shortCode", "jwt", "reactivate", "requestDeletion", "Lcom/withings/account/network/ws/RequestDeletionResponse;", "requestEmailUpdate", "requestEmailValidation", "requestNewPassword", "type", "requestPartnerInfo", "Lcom/withings/account/network/ws/PartnerInfoResponse;", "sessionId", "sendCode", "sendConfirmationCode", "phoneNumber", "updateAccount", "timezone", "language", "updateAccountContext", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface AccountRetrofit1Api {

    /* compiled from: AccountRetrofit1Api.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object deletePhone$default(AccountRetrofit1Api accountRetrofit1Api, String str, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 1) != 0) {
                str = null;
            }
            return accountRetrofit1Api.deletePhone(str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deletePhone");
    }

    static /* synthetic */ Object sendConfirmationCode$default(AccountRetrofit1Api accountRetrofit1Api, String str, String str2, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 1) != 0) {
                str = null;
            }
            return accountRetrofit1Api.sendConfirmationCode(str, str2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendConfirmationCode");
    }

    @POST("/account?action=changepassword")
    @FormUrlEncoded
    Object changePassword(@Field("oldpassword") String str, @Field("password_clear") String str2, @Field("accountid") Long l5) throws WsAuthFailedException, WrongOldPasswordException;

    @POST("/v2/account?action=checkconfirmationcode")
    @FormUrlEncoded
    Object checkConfirmationCode(@Field("code") String str, @Field("token") String str2, @Field("modelname") String str3, @Field("typename") String str4, @Field("os") String str5, @Field("osversion") String str6);

    @POST("/v2/account?action=confirmtotp")
    @FormUrlEncoded
    Object confirmTotp(@Field("code") String str);

    @POST("/account?action=create")
    @FormUrlEncoded
    AccountCreation createAccount(@Field("email") String str, @Field("password") String str2, @Field("preflang") String str3, @Field("duration") int i11, @Field("branding") int i12, @Field("idaclpfl") int i13, @Field("modelname") String str4, @Field("typename") String str5, @Field("os") String str6, @Field("osversion") String str7) throws AlreadyExistsException, UnauthorizedPasswordException;

    @POST("/v2/account?action=providerauth")
    @FormUrlEncoded
    AccountSession createAccount(@Field("authprovider") String str, @Field("id_token") String str2, @Field("uuid") String str3, @Field("client_id") String str4, @Field("duration") int i11, @Field("idaclpfl") int i12, @Field("branding") int i13, @Field("preflang") String str5, @Field("modelname") String str6, @Field("typename") String str7, @Field("os") String str8, @Field("osversion") String str9) throws AlreadyExistsException, UnauthorizedPasswordException;

    @POST("/account?action=create")
    @FormUrlEncoded
    AccountCreationResponse createAccountWithToken(@Field("email") String str, @Field("account_creation_token") String str2, @Field("preflang") String str3, @Field("branding") int i11, @Field("idaclpfl") int i12, @Field("uuid") String str4, @Field("duration") int i13, @Field("authprovider") String str5, @Field("modelname") String str6, @Field("typename") String str7, @Field("os") String str8, @Field("osversion") String str9) throws AlreadyExistsException, UnauthorizedPasswordException;

    @POST("/v2/account?action=createshortcode")
    @FormUrlEncoded
    Object createShortCode(@Field("email") String str, @Field("lang") String str2, @Field("state") String str3);

    @POST("/v2/account?action=deletephone")
    @FormUrlEncoded
    Object deletePhone(@Field("channel") String str);

    @POST("/v2/account?action=deletetotp")
    Object deleteTotp();

    @POST("/v2/account?action=generaterecoverycodes")
    CodesResponse generateRecoveryCode();

    @POST("/v2/account?action=generatetotp")
    TotpResponse generateTotp();

    @POST("/account?action=get")
    @FormUrlEncoded
    WsAccount.Response getAccount(@Field("applitype") int i11);

    @POST("/v2/account?action=getauthentication")
    TwoFactorAuthentication.Response getAuthentication();

    @POST("/v2/account?action=getrecoverycodes")
    CodesResponse getRecoveryCode();

    @POST("/v2/account?action=providerauth")
    @FormUrlEncoded
    AccountSession login(@Field("authprovider") String str, @Field("id_token") String str2, @Field("uuid") String str3, @Field("duration") int i11, @Field("client_id") String str4, @Field("modelname") String str5, @Field("typename") String str6, @Field("os") String str7, @Field("osversion") String str8) throws WsAuthFailedException;

    @POST("/v2/account?action=providerauth")
    @FormUrlEncoded
    AccountUser providerAuth(@Field("jwt") String str, @Field("uuid") String str2, @Field("duration") int i11, @Field("authprovider") String str3, @Field("modelname") String str4, @Field("typename") String str5, @Field("os") String str6, @Field("osversion") String str7) throws WsAuthFailedException;

    @POST("/v2/account?action=providerauth")
    @FormUrlEncoded
    AccountUser providerAuth(@Field("email") String str, @Field("shortcode") String str2, @Field("uuid") String str3, @Field("duration") int i11, @Field("authprovider") String str4, @Field("modelname") String str5, @Field("typename") String str6, @Field("os") String str7, @Field("osversion") String str8) throws WsAuthFailedException;

    @POST("/v2/account?action=reactivate")
    @FormUrlEncoded
    Object reactivate(@Field("accountid") long j5);

    @POST("/v2/account?action=requestdeletion")
    RequestDeletionResponse requestDeletion();

    @POST("/v2/account?action=requestemailupdate")
    @FormUrlEncoded
    Object requestEmailUpdate(@Field("accountid") int i11, @Field("email") String str) throws ObjectNotFoundException;

    @POST("/v2/account?action=requestemailvalidation")
    Object requestEmailValidation() throws ObjectNotFoundException;

    @POST("/v2/account?action=requestcode")
    @FormUrlEncoded
    Object requestNewPassword(@Field("email") String str, @Field("type") String str2) throws ObjectNotFoundException;

    @POST("/v2/account?action=getpartnerinfo")
    PartnerInfoResponse requestPartnerInfo(@Field("sessionid") String str);

    @POST("/v2/account?action=sendcode")
    @FormUrlEncoded
    Object sendCode(@Field("channel") String str);

    @POST("/v2/account?action=sendconfirmationcode")
    @FormUrlEncoded
    Object sendConfirmationCode(@Field("channel") String str, @Field("phonenumber") String str2);

    @POST("/account?action=update")
    @FormUrlEncoded
    Object updateAccount(@Field("accountid") long j5, @Field("timezone") String str, @Field("preflang") String str2);

    @POST("/account?action=updatectx")
    @FormUrlEncoded
    Object updateAccountContext(@Field("accountid") long j5, @Field("context") String str, @Field("applitype") int i11);
}
