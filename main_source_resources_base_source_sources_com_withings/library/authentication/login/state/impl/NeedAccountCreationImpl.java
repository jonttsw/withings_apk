package com.withings.library.authentication.login.state.impl;

import com.withings.library.authentication.api.account.Account;
import com.withings.library.authentication.api.account.AccountApi;
import com.withings.library.authentication.api.account.AccountCreationResponse;
import com.withings.library.authentication.api.error.NetworkExceptionChecker;
import com.withings.library.authentication.di.KoinKt;
import com.withings.library.authentication.host.device.DeviceInformationProvider;
import com.withings.library.authentication.login.LoginMethod;
import com.withings.library.authentication.login.ProviderType;
import com.withings.library.authentication.login.Server;
import com.withings.library.authentication.login.SessionKt;
import com.withings.library.authentication.login.SessionType;
import com.withings.library.authentication.login.session.verify.SessionVerifier;
import com.withings.library.authentication.login.session.verify.SessionVerifierResult;
import com.withings.library.authentication.login.state.AuthenticationState;
import com.withings.library.authentication.login.state.NeedAccountCreation;
import com.withings.library.authentication.login.state.Sequence;
import com.withings.library.authentication.login.state.factory.LoggedInFactory;
import com.withings.library.authentication.login.state.factory.LoggedOutFactory;
import com.withings.library.authentication.login.state.factory.NeedCode2FAFactory;
import com.withings.library.authentication.login.state.factory.NeedPhoneNumber2FACreationFactory;
import com.withings.library.authentication.updateaccount.UpdateAccountService;
import com.withings.library.authentication.utils.TimeKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
import pq0.a;
import v9.e;
/* compiled from: NeedAccountCreationImpl.kt */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0014\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\bP\u0010QJ\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010+R\u001b\u00101\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u001f\u001a\u0004\b/\u00100R\u001b\u00106\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\u001f\u001a\u0004\b4\u00105R\u001b\u0010;\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010\u001f\u001a\u0004\b9\u0010:R\u001b\u0010@\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010\u001f\u001a\u0004\b>\u0010?R\u001b\u0010E\u001a\u00020A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010\u001f\u001a\u0004\bC\u0010DR\u001b\u0010J\u001a\u00020F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010\u001f\u001a\u0004\bH\u0010IR\u001b\u0010O\u001a\u00020K8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010\u001f\u001a\u0004\bM\u0010N\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006R"}, d2 = {"Lcom/withings/library/authentication/login/state/impl/NeedAccountCreationImpl;", "Lcom/withings/library/authentication/login/state/NeedAccountCreation;", "Lpq0/a;", "Lcom/withings/library/authentication/api/account/AccountCreationResponse;", "Lcom/withings/library/authentication/login/SessionType;", "sessionType", "Lcom/withings/library/authentication/login/session/verify/SessionVerifier$SessionVerifierRequest;", "toVerifierRequest", "(Lcom/withings/library/authentication/api/account/AccountCreationResponse;Lcom/withings/library/authentication/login/SessionType;)Lcom/withings/library/authentication/login/session/verify/SessionVerifier$SessionVerifierRequest;", "Lcom/withings/library/authentication/login/session/verify/SessionVerifierResult;", "Lcom/withings/library/authentication/login/state/AuthenticationState;", "toAuthenticationState", "(Lcom/withings/library/authentication/login/session/verify/SessionVerifierResult;)Lcom/withings/library/authentication/login/state/AuthenticationState;", "", "prefLang", "", "subscribed", "Lcom/withings/library/authentication/login/state/NeedAccountCreation$OutputState;", "createAccount", "(Ljava/lang/String;ZLqm0/d;)Ljava/lang/Object;", "email", "Ljava/lang/String;", "accountCreationToken", "Lcom/withings/library/authentication/login/ProviderType;", "providerType", "Lcom/withings/library/authentication/login/ProviderType;", "Lcom/withings/library/authentication/login/Server;", "server", "Lcom/withings/library/authentication/login/Server;", "Lcom/withings/library/authentication/api/account/AccountApi;", "accountApi$delegate", "Lnm0/g;", "getAccountApi", "()Lcom/withings/library/authentication/api/account/AccountApi;", "accountApi", "Lcom/withings/library/authentication/host/device/DeviceInformationProvider;", "deviceInformationProvider$delegate", "getDeviceInformationProvider", "()Lcom/withings/library/authentication/host/device/DeviceInformationProvider;", "deviceInformationProvider", "Lcom/withings/library/authentication/login/session/verify/SessionVerifier;", "sessionVerifier$delegate", "getSessionVerifier", "()Lcom/withings/library/authentication/login/session/verify/SessionVerifier;", "sessionVerifier", "Lv9/e;", "log$delegate", "getLog", "()Lv9/e;", "log", "Lcom/withings/library/authentication/api/error/NetworkExceptionChecker;", "networkExceptionChecker$delegate", "getNetworkExceptionChecker", "()Lcom/withings/library/authentication/api/error/NetworkExceptionChecker;", "networkExceptionChecker", "Lcom/withings/library/authentication/updateaccount/UpdateAccountService;", "updateAccountService$delegate", "getUpdateAccountService", "()Lcom/withings/library/authentication/updateaccount/UpdateAccountService;", "updateAccountService", "Lcom/withings/library/authentication/login/state/factory/LoggedOutFactory;", "loggedOutFactory$delegate", "getLoggedOutFactory", "()Lcom/withings/library/authentication/login/state/factory/LoggedOutFactory;", "loggedOutFactory", "Lcom/withings/library/authentication/login/state/factory/NeedCode2FAFactory;", "needCode2FAFactory$delegate", "getNeedCode2FAFactory", "()Lcom/withings/library/authentication/login/state/factory/NeedCode2FAFactory;", "needCode2FAFactory", "Lcom/withings/library/authentication/login/state/factory/NeedPhoneNumber2FACreationFactory;", "needPhoneNumber2FACreationFactory$delegate", "getNeedPhoneNumber2FACreationFactory", "()Lcom/withings/library/authentication/login/state/factory/NeedPhoneNumber2FACreationFactory;", "needPhoneNumber2FACreationFactory", "Lcom/withings/library/authentication/login/state/factory/LoggedInFactory;", "loggedInFactory$delegate", "getLoggedInFactory", "()Lcom/withings/library/authentication/login/state/factory/LoggedInFactory;", "loggedInFactory", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withings/library/authentication/login/ProviderType;Lcom/withings/library/authentication/login/Server;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class NeedAccountCreationImpl implements NeedAccountCreation, a {
    private final g accountApi$delegate;
    private final String accountCreationToken;
    private final g deviceInformationProvider$delegate;
    private final String email;
    private final g log$delegate;
    private final g loggedInFactory$delegate;
    private final g loggedOutFactory$delegate;
    private final g needCode2FAFactory$delegate;
    private final g needPhoneNumber2FACreationFactory$delegate;
    private final g networkExceptionChecker$delegate;
    private final ProviderType providerType;
    private final Server server;
    private final g sessionVerifier$delegate;
    private final g updateAccountService$delegate;

    public NeedAccountCreationImpl(String email, String accountCreationToken, ProviderType providerType, Server server) {
        u.j(email, "email");
        u.j(accountCreationToken, "accountCreationToken");
        u.j(providerType, "providerType");
        u.j(server, "server");
        this.email = email;
        this.accountCreationToken = accountCreationToken;
        this.providerType = providerType;
        this.server = server;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f76136a;
        this.accountApi$delegate = h.a(lazyThreadSafetyMode, new NeedAccountCreationImpl$special$$inlined$inject$default$1(this, null, null));
        this.deviceInformationProvider$delegate = h.a(lazyThreadSafetyMode, new NeedAccountCreationImpl$special$$inlined$inject$default$2(this, null, null));
        this.sessionVerifier$delegate = h.a(lazyThreadSafetyMode, new NeedAccountCreationImpl$special$$inlined$inject$default$3(this, null, null));
        this.log$delegate = KoinKt.injectLogger(this, "NeedAccountCreation");
        this.networkExceptionChecker$delegate = h.a(lazyThreadSafetyMode, new NeedAccountCreationImpl$special$$inlined$inject$default$4(this, null, null));
        this.updateAccountService$delegate = h.a(lazyThreadSafetyMode, new NeedAccountCreationImpl$special$$inlined$inject$default$5(this, null, null));
        this.loggedOutFactory$delegate = h.a(lazyThreadSafetyMode, new NeedAccountCreationImpl$special$$inlined$inject$default$6(this, null, null));
        this.needCode2FAFactory$delegate = h.a(lazyThreadSafetyMode, new NeedAccountCreationImpl$special$$inlined$inject$default$7(this, null, null));
        this.needPhoneNumber2FACreationFactory$delegate = h.a(lazyThreadSafetyMode, new NeedAccountCreationImpl$special$$inlined$inject$default$8(this, null, null));
        this.loggedInFactory$delegate = h.a(lazyThreadSafetyMode, new NeedAccountCreationImpl$special$$inlined$inject$default$9(this, null, null));
    }

    private final AccountApi getAccountApi() {
        return (AccountApi) this.accountApi$delegate.getValue();
    }

    private final DeviceInformationProvider getDeviceInformationProvider() {
        return (DeviceInformationProvider) this.deviceInformationProvider$delegate.getValue();
    }

    private final e getLog() {
        return (e) this.log$delegate.getValue();
    }

    private final LoggedInFactory getLoggedInFactory() {
        return (LoggedInFactory) this.loggedInFactory$delegate.getValue();
    }

    private final LoggedOutFactory getLoggedOutFactory() {
        return (LoggedOutFactory) this.loggedOutFactory$delegate.getValue();
    }

    private final NeedCode2FAFactory getNeedCode2FAFactory() {
        return (NeedCode2FAFactory) this.needCode2FAFactory$delegate.getValue();
    }

    private final NeedPhoneNumber2FACreationFactory getNeedPhoneNumber2FACreationFactory() {
        return (NeedPhoneNumber2FACreationFactory) this.needPhoneNumber2FACreationFactory$delegate.getValue();
    }

    private final NetworkExceptionChecker getNetworkExceptionChecker() {
        return (NetworkExceptionChecker) this.networkExceptionChecker$delegate.getValue();
    }

    private final SessionVerifier getSessionVerifier() {
        return (SessionVerifier) this.sessionVerifier$delegate.getValue();
    }

    private final UpdateAccountService getUpdateAccountService() {
        return (UpdateAccountService) this.updateAccountService$delegate.getValue();
    }

    private final AuthenticationState toAuthenticationState(SessionVerifierResult sessionVerifierResult) {
        if (sessionVerifierResult instanceof SessionVerifierResult.Need2FACode) {
            return getNeedCode2FAFactory().buildNeedCode2FA(Sequence.Verification.INSTANCE, sessionVerifierResult.getSession(), ((SessionVerifierResult.Need2FACode) sessionVerifierResult).getPhoneNumber());
        }
        if (sessionVerifierResult instanceof SessionVerifierResult.NeedPhoneNumber) {
            return getNeedPhoneNumber2FACreationFactory().buildNeedPhoneNumber2FACreation(sessionVerifierResult.getSession());
        }
        if (sessionVerifierResult instanceof SessionVerifierResult.Success) {
            return getLoggedInFactory().buildLoggedIn(x.V(sessionVerifierResult.getSession()));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final SessionVerifier.SessionVerifierRequest toVerifierRequest(AccountCreationResponse accountCreationResponse, SessionType sessionType) {
        return new SessionVerifier.SessionVerifierRequest(accountCreationResponse.getSessionId(), ((Account) x.I(accountCreationResponse.getAccounts())).getId(), accountCreationResponse.getRequireSecureSession(), accountCreationResponse.getProviderToken(), accountCreationResponse.getAuthToken(), TimeKt.getSystemTimeInMillis() + ep0.a.i(SessionKt.getSESSION_TIME_TO_LIVE()), this.providerType, false, sessionType, LoginMethod.UNKNOWN.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:3|(10:5|6|7|(1:(1:(1:(7:12|13|14|15|(1:17)|18|20)(2:38|39))(5:40|41|42|43|(1:45)(5:46|15|(0)|18|20)))(4:57|58|59|60))(4:65|66|67|(1:69)(1:70))|61|62|(1:64)|42|43|(0)(0)))|82|6|7|(0)(0)|61|62|(0)|42|43|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00fe, code lost:
        r4.getLog().b("Exception during context update", r0);
        r0 = r3;
        r3 = 0;
        r4 = r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0123 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0159  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.withings.library.authentication.login.state.impl.NeedAccountCreationImpl] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    @Override // com.withings.library.authentication.login.state.NeedAccountCreation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object createAccount(java.lang.String r24, boolean r25, qm0.d<? super com.withings.library.authentication.login.state.NeedAccountCreation.OutputState> r26) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.login.state.impl.NeedAccountCreationImpl.createAccount(java.lang.String, boolean, qm0.d):java.lang.Object");
    }

    @Override // pq0.a
    public oq0.a getKoin() {
        return qq0.a.f93676a.a();
    }
}
