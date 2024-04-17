package com.withings.library.authentication.login.state.impl;

import com.huawei.hms.support.feature.result.CommonConstant;
import com.withings.library.authentication.api.account.AccountApi;
import com.withings.library.authentication.api.auth.AuthApi;
import com.withings.library.authentication.api.constant.ApiConstantProvider;
import com.withings.library.authentication.api.error.NetworkExceptionChecker;
import com.withings.library.authentication.di.KoinKt;
import com.withings.library.authentication.host.app.ApplicationInformationProvider;
import com.withings.library.authentication.host.device.DeviceInformationProvider;
import com.withings.library.authentication.login.Server;
import com.withings.library.authentication.login.session.multi.MultiSessionRetriever;
import com.withings.library.authentication.login.session.verify.SessionVerifier;
import com.withings.library.authentication.login.state.AuthenticationState;
import com.withings.library.authentication.login.state.LoggedIn;
import com.withings.library.authentication.login.state.LoggedOut;
import com.withings.library.authentication.login.state.NeedAccountCreation;
import com.withings.library.authentication.login.state.NeedCode2FA;
import com.withings.library.authentication.login.state.NeedPhoneNumber2FACreation;
import com.withings.library.authentication.login.state.factory.LoggedInFactory;
import com.withings.library.authentication.login.state.factory.LoggedOutFactory;
import com.withings.library.authentication.login.state.factory.NeedAccountCreationFactory;
import com.withings.library.authentication.login.state.factory.NeedCode2FAFactory;
import com.withings.library.authentication.login.state.factory.NeedPhoneNumber2FACreationFactory;
import com.withings.library.authentication.utils.locale.LocaleProvider;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
import pq0.a;
import v9.e;
/* compiled from: LoggedOutImpl.kt */
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d¢\u0006\u0004\bm\u0010nJ\u0017\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\b\u001a\u00020\u0004*\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000eJ+\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0016J\u001b\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001aR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010*R\u001b\u00100\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010#\u001a\u0004\b.\u0010/R\u001b\u00105\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010#\u001a\u0004\b3\u00104R\u001b\u0010:\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010#\u001a\u0004\b8\u00109R\u001b\u0010?\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010#\u001a\u0004\b=\u0010>R\u001b\u0010D\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010#\u001a\u0004\bB\u0010CR\u001b\u0010I\u001a\u00020E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010#\u001a\u0004\bG\u0010HR\u001b\u0010N\u001a\u00020J8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010#\u001a\u0004\bL\u0010MR\u001b\u0010S\u001a\u00020O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010#\u001a\u0004\bQ\u0010RR\u001b\u0010X\u001a\u00020T8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u0010#\u001a\u0004\bV\u0010WR\u001b\u0010]\u001a\u00020Y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010#\u001a\u0004\b[\u0010\\R\u001b\u0010b\u001a\u00020^8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b_\u0010#\u001a\u0004\b`\u0010aR\u001b\u0010g\u001a\u00020c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bd\u0010#\u001a\u0004\be\u0010fR\u001b\u0010l\u001a\u00020h8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bi\u0010#\u001a\u0004\bj\u0010k\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006o"}, d2 = {"Lcom/withings/library/authentication/login/state/impl/LoggedOutImpl;", "Lcom/withings/library/authentication/login/state/LoggedOut;", "Lpq0/a;", "Lcom/withings/library/authentication/login/session/verify/SessionVerifierResult;", "Lcom/withings/library/authentication/login/state/LoggedOut$OutputState;", "toMultiOutputState", "(Lcom/withings/library/authentication/login/session/verify/SessionVerifierResult;Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/authentication/login/state/AuthenticationState;", "toOutputState", "(Lcom/withings/library/authentication/login/state/AuthenticationState;)Lcom/withings/library/authentication/login/state/LoggedOut$OutputState;", "", "email", "password", "loginWithPassword", "(Ljava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "hashedPassword", "loginWithHashedPassword", "Lcom/withings/library/authentication/login/ProviderType;", "providerType", CommonConstant.KEY_ID_TOKEN, "clientId", "loginWithExternalProviderAndIdToken", "(Lcom/withings/library/authentication/login/ProviderType;Ljava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "providerCode", "loginWithExternalProviderAndProviderCode", "loginWithMail", "(Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/authentication/login/state/LoggedOut$NewPasswordOutputState;", "requestNewPassword", "Lkotlin/Function0;", "Lcom/withings/library/authentication/login/Server;", "server", "Lym0/a;", "Lcom/withings/library/authentication/api/auth/AuthApi;", "authApi$delegate", "Lnm0/g;", "getAuthApi", "()Lcom/withings/library/authentication/api/auth/AuthApi;", "authApi", "Lcom/withings/library/authentication/api/account/AccountApi;", "accountApi$delegate", "getAccountApi", "()Lcom/withings/library/authentication/api/account/AccountApi;", "accountApi", "Lcom/withings/library/authentication/host/device/DeviceInformationProvider;", "deviceInformationProvider$delegate", "getDeviceInformationProvider", "()Lcom/withings/library/authentication/host/device/DeviceInformationProvider;", "deviceInformationProvider", "Lcom/withings/library/authentication/host/app/ApplicationInformationProvider;", "applicationInformationProvider$delegate", "getApplicationInformationProvider", "()Lcom/withings/library/authentication/host/app/ApplicationInformationProvider;", "applicationInformationProvider", "Lcom/withings/library/authentication/api/constant/ApiConstantProvider;", "apiConstantProvider$delegate", "getApiConstantProvider", "()Lcom/withings/library/authentication/api/constant/ApiConstantProvider;", "apiConstantProvider", "Lcom/withings/library/authentication/login/session/verify/SessionVerifier;", "sessionVerifier$delegate", "getSessionVerifier", "()Lcom/withings/library/authentication/login/session/verify/SessionVerifier;", "sessionVerifier", "Lcom/withings/library/authentication/utils/locale/LocaleProvider;", "localeProvider$delegate", "getLocaleProvider", "()Lcom/withings/library/authentication/utils/locale/LocaleProvider;", "localeProvider", "Lcom/withings/library/authentication/api/error/NetworkExceptionChecker;", "networkExceptionChecker$delegate", "getNetworkExceptionChecker", "()Lcom/withings/library/authentication/api/error/NetworkExceptionChecker;", "networkExceptionChecker", "Lv9/e;", "log$delegate", "getLog", "()Lv9/e;", "log", "Lcom/withings/library/authentication/login/state/factory/LoggedOutFactory;", "loggedOutFactory$delegate", "getLoggedOutFactory", "()Lcom/withings/library/authentication/login/state/factory/LoggedOutFactory;", "loggedOutFactory", "Lcom/withings/library/authentication/login/state/factory/LoggedInFactory;", "loggedInFactory$delegate", "getLoggedInFactory", "()Lcom/withings/library/authentication/login/state/factory/LoggedInFactory;", "loggedInFactory", "Lcom/withings/library/authentication/login/state/factory/NeedCode2FAFactory;", "needCode2FAFactory$delegate", "getNeedCode2FAFactory", "()Lcom/withings/library/authentication/login/state/factory/NeedCode2FAFactory;", "needCode2FAFactory", "Lcom/withings/library/authentication/login/state/factory/NeedPhoneNumber2FACreationFactory;", "needPhoneNumber2FACreationFactory$delegate", "getNeedPhoneNumber2FACreationFactory", "()Lcom/withings/library/authentication/login/state/factory/NeedPhoneNumber2FACreationFactory;", "needPhoneNumber2FACreationFactory", "Lcom/withings/library/authentication/login/state/factory/NeedAccountCreationFactory;", "needAccountCreationFactory$delegate", "getNeedAccountCreationFactory", "()Lcom/withings/library/authentication/login/state/factory/NeedAccountCreationFactory;", "needAccountCreationFactory", "Lcom/withings/library/authentication/login/session/multi/MultiSessionRetriever;", "multiSessionRetriever$delegate", "getMultiSessionRetriever", "()Lcom/withings/library/authentication/login/session/multi/MultiSessionRetriever;", "multiSessionRetriever", "<init>", "(Lym0/a;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class LoggedOutImpl implements LoggedOut, a {
    private final g accountApi$delegate;
    private final g apiConstantProvider$delegate;
    private final g applicationInformationProvider$delegate;
    private final g authApi$delegate;
    private final g deviceInformationProvider$delegate;
    private final g localeProvider$delegate;
    private final g log$delegate;
    private final g loggedInFactory$delegate;
    private final g loggedOutFactory$delegate;
    private final g multiSessionRetriever$delegate;
    private final g needAccountCreationFactory$delegate;
    private final g needCode2FAFactory$delegate;
    private final g needPhoneNumber2FACreationFactory$delegate;
    private final g networkExceptionChecker$delegate;
    private final ym0.a<Server> server;
    private final g sessionVerifier$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    public LoggedOutImpl(ym0.a<? extends Server> server) {
        u.j(server, "server");
        this.server = server;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f76136a;
        this.authApi$delegate = h.a(lazyThreadSafetyMode, new LoggedOutImpl$special$$inlined$inject$default$1(this, null, null));
        this.accountApi$delegate = h.a(lazyThreadSafetyMode, new LoggedOutImpl$special$$inlined$inject$default$2(this, null, null));
        this.deviceInformationProvider$delegate = h.a(lazyThreadSafetyMode, new LoggedOutImpl$special$$inlined$inject$default$3(this, null, null));
        this.applicationInformationProvider$delegate = h.a(lazyThreadSafetyMode, new LoggedOutImpl$special$$inlined$inject$default$4(this, null, null));
        this.apiConstantProvider$delegate = h.a(lazyThreadSafetyMode, new LoggedOutImpl$special$$inlined$inject$default$5(this, null, null));
        this.sessionVerifier$delegate = h.a(lazyThreadSafetyMode, new LoggedOutImpl$special$$inlined$inject$default$6(this, null, null));
        this.localeProvider$delegate = h.a(lazyThreadSafetyMode, new LoggedOutImpl$special$$inlined$inject$default$7(this, null, null));
        this.networkExceptionChecker$delegate = h.a(lazyThreadSafetyMode, new LoggedOutImpl$special$$inlined$inject$default$8(this, null, null));
        this.log$delegate = KoinKt.injectLogger(this, "LoggedOut");
        this.loggedOutFactory$delegate = h.a(lazyThreadSafetyMode, new LoggedOutImpl$special$$inlined$inject$default$9(this, null, null));
        this.loggedInFactory$delegate = h.a(lazyThreadSafetyMode, new LoggedOutImpl$special$$inlined$inject$default$10(this, null, null));
        this.needCode2FAFactory$delegate = h.a(lazyThreadSafetyMode, new LoggedOutImpl$special$$inlined$inject$default$11(this, null, null));
        this.needPhoneNumber2FACreationFactory$delegate = h.a(lazyThreadSafetyMode, new LoggedOutImpl$special$$inlined$inject$default$12(this, null, null));
        this.needAccountCreationFactory$delegate = h.a(lazyThreadSafetyMode, new LoggedOutImpl$special$$inlined$inject$default$13(this, null, null));
        this.multiSessionRetriever$delegate = h.a(lazyThreadSafetyMode, new LoggedOutImpl$special$$inlined$inject$default$14(this, null, null));
    }

    private final AccountApi getAccountApi() {
        return (AccountApi) this.accountApi$delegate.getValue();
    }

    private final ApiConstantProvider getApiConstantProvider() {
        return (ApiConstantProvider) this.apiConstantProvider$delegate.getValue();
    }

    private final ApplicationInformationProvider getApplicationInformationProvider() {
        return (ApplicationInformationProvider) this.applicationInformationProvider$delegate.getValue();
    }

    private final AuthApi getAuthApi() {
        return (AuthApi) this.authApi$delegate.getValue();
    }

    private final DeviceInformationProvider getDeviceInformationProvider() {
        return (DeviceInformationProvider) this.deviceInformationProvider$delegate.getValue();
    }

    private final LocaleProvider getLocaleProvider() {
        return (LocaleProvider) this.localeProvider$delegate.getValue();
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

    private final MultiSessionRetriever getMultiSessionRetriever() {
        return (MultiSessionRetriever) this.multiSessionRetriever$delegate.getValue();
    }

    private final NeedAccountCreationFactory getNeedAccountCreationFactory() {
        return (NeedAccountCreationFactory) this.needAccountCreationFactory$delegate.getValue();
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object toMultiOutputState(com.withings.library.authentication.login.session.verify.SessionVerifierResult r6, qm0.d<? super com.withings.library.authentication.login.state.LoggedOut.OutputState> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.withings.library.authentication.login.state.impl.LoggedOutImpl$toMultiOutputState$1
            if (r0 == 0) goto L13
            r0 = r7
            com.withings.library.authentication.login.state.impl.LoggedOutImpl$toMultiOutputState$1 r0 = (com.withings.library.authentication.login.state.impl.LoggedOutImpl$toMultiOutputState$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.library.authentication.login.state.impl.LoggedOutImpl$toMultiOutputState$1 r0 = new com.withings.library.authentication.login.state.impl.LoggedOutImpl$toMultiOutputState$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            nm0.l.b(r7)
            goto L75
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.L$0
            com.withings.library.authentication.login.state.impl.LoggedOutImpl r6 = (com.withings.library.authentication.login.state.impl.LoggedOutImpl) r6
            nm0.l.b(r7)
            goto L59
        L3a:
            nm0.l.b(r7)
            boolean r7 = r6 instanceof com.withings.library.authentication.login.session.verify.SessionVerifierResult.Success
            if (r7 == 0) goto L82
            com.withings.library.authentication.login.session.multi.MultiSessionRetriever r7 = r5.getMultiSessionRetriever()
            com.withings.library.authentication.login.Session r6 = r6.getSession()
            java.util.List r6 = kotlin.collections.x.V(r6)
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r7 = r7.retrieve(r6, r0)
            if (r7 != r1) goto L58
            return r1
        L58:
            r6 = r5
        L59:
            com.withings.library.authentication.login.state.AuthenticationState r7 = (com.withings.library.authentication.login.state.AuthenticationState) r7
            boolean r2 = r7 instanceof com.withings.library.authentication.login.state.LoggedIn
            if (r2 == 0) goto L7d
            com.withings.library.authentication.login.state.factory.LoggedInFactory r6 = r6.getLoggedInFactory()
            com.withings.library.authentication.login.state.LoggedIn r7 = (com.withings.library.authentication.login.state.LoggedIn) r7
            java.util.List r7 = r7.getSessions()
            r2 = 0
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r7 = r6.buildLoggedInWithPartnerSessionRetrieving(r7, r0)
            if (r7 != r1) goto L75
            return r1
        L75:
            com.withings.library.authentication.login.state.LoggedIn r7 = (com.withings.library.authentication.login.state.LoggedIn) r7
            com.withings.library.authentication.login.state.LoggedOut$OutputState$SuccessLoggedIn r6 = new com.withings.library.authentication.login.state.LoggedOut$OutputState$SuccessLoggedIn
            r6.<init>(r7)
            goto Lc9
        L7d:
            com.withings.library.authentication.login.state.LoggedOut$OutputState r6 = r6.toOutputState(r7)
            goto Lc9
        L82:
            boolean r7 = r6 instanceof com.withings.library.authentication.login.session.verify.SessionVerifierResult.Need2FACode
            kotlin.collections.i0 r0 = kotlin.collections.i0.f76187a
            if (r7 == 0) goto Lab
            com.withings.library.authentication.login.state.LoggedOut$OutputState$SuccessNeed2FACode r7 = new com.withings.library.authentication.login.state.LoggedOut$OutputState$SuccessNeed2FACode
            com.withings.library.authentication.login.state.factory.NeedCode2FAFactory r1 = r5.getNeedCode2FAFactory()
            com.withings.library.authentication.login.state.factory.NeedCode2FAFactory r2 = r5.getNeedCode2FAFactory()
            com.withings.library.authentication.login.state.Sequence$Verification r3 = com.withings.library.authentication.login.state.Sequence.Verification.INSTANCE
            com.withings.library.authentication.login.Session r4 = r6.getSession()
            com.withings.library.authentication.login.session.verify.SessionVerifierResult$Need2FACode r6 = (com.withings.library.authentication.login.session.verify.SessionVerifierResult.Need2FACode) r6
            java.lang.String r6 = r6.getPhoneNumber()
            com.withings.library.authentication.login.state.NeedCode2FA r6 = r2.buildNeedCode2FA(r3, r4, r6)
            com.withings.library.authentication.login.state.NeedCode2FA r6 = r1.buildNeedCode2FAMulti(r6, r0)
            r7.<init>(r6)
        La9:
            r6 = r7
            goto Lc9
        Lab:
            boolean r7 = r6 instanceof com.withings.library.authentication.login.session.verify.SessionVerifierResult.NeedPhoneNumber
            if (r7 == 0) goto Lca
            com.withings.library.authentication.login.state.LoggedOut$OutputState$SuccessNeedPhoneNumber2FACreation r7 = new com.withings.library.authentication.login.state.LoggedOut$OutputState$SuccessNeedPhoneNumber2FACreation
            com.withings.library.authentication.login.state.factory.NeedPhoneNumber2FACreationFactory r1 = r5.getNeedPhoneNumber2FACreationFactory()
            com.withings.library.authentication.login.state.factory.NeedPhoneNumber2FACreationFactory r2 = r5.getNeedPhoneNumber2FACreationFactory()
            com.withings.library.authentication.login.Session r6 = r6.getSession()
            com.withings.library.authentication.login.state.NeedPhoneNumber2FACreation r6 = r2.buildNeedPhoneNumber2FACreation(r6)
            com.withings.library.authentication.login.state.NeedPhoneNumber2FACreation r6 = r1.buildNeedPhoneNumber2FACreationMulti(r6, r0)
            r7.<init>(r6)
            goto La9
        Lc9:
            return r6
        Lca:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.login.state.impl.LoggedOutImpl.toMultiOutputState(com.withings.library.authentication.login.session.verify.SessionVerifierResult, qm0.d):java.lang.Object");
    }

    private final LoggedOut.OutputState toOutputState(AuthenticationState authenticationState) {
        if (authenticationState instanceof LoggedIn) {
            return new LoggedOut.OutputState.SuccessLoggedIn((LoggedIn) authenticationState);
        }
        if (authenticationState instanceof NeedPhoneNumber2FACreation) {
            return new LoggedOut.OutputState.SuccessNeedPhoneNumber2FACreation((NeedPhoneNumber2FACreation) authenticationState);
        }
        if (authenticationState instanceof NeedCode2FA) {
            return new LoggedOut.OutputState.SuccessNeed2FACode((NeedCode2FA) authenticationState);
        }
        if (authenticationState instanceof NeedAccountCreation) {
            return new LoggedOut.OutputState.SuccessNeedAccountCreation((NeedAccountCreation) authenticationState);
        }
        return new LoggedOut.OutputState.GenericError(this);
    }

    @Override // pq0.a
    public oq0.a getKoin() {
        return qq0.a.f93676a.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0259 A[RETURN] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [com.withings.library.authentication.login.ProviderType] */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.withings.library.authentication.login.ProviderType] */
    @Override // com.withings.library.authentication.login.state.LoggedOut
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object loginWithExternalProviderAndIdToken(com.withings.library.authentication.login.ProviderType r25, java.lang.String r26, java.lang.String r27, qm0.d<? super com.withings.library.authentication.login.state.LoggedOut.OutputState> r28) {
        /*
            Method dump skipped, instructions count: 605
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.login.state.impl.LoggedOutImpl.loginWithExternalProviderAndIdToken(com.withings.library.authentication.login.ProviderType, java.lang.String, java.lang.String, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0259 A[RETURN] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [com.withings.library.authentication.login.ProviderType] */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.withings.library.authentication.login.ProviderType] */
    @Override // com.withings.library.authentication.login.state.LoggedOut
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object loginWithExternalProviderAndProviderCode(com.withings.library.authentication.login.ProviderType r25, java.lang.String r26, java.lang.String r27, qm0.d<? super com.withings.library.authentication.login.state.LoggedOut.OutputState> r28) {
        /*
            Method dump skipped, instructions count: 605
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.login.state.impl.LoggedOutImpl.loginWithExternalProviderAndProviderCode(com.withings.library.authentication.login.ProviderType, java.lang.String, java.lang.String, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:7|(2:67|(1:(1:(1:(3:72|53|54)(2:73|74))(5:75|76|77|29|31))(7:78|79|80|81|24|25|(1:27)(3:28|29|31)))(3:85|86|87))(7:9|10|11|12|13|14|(1:16)(1:18))|19|20|(1:22)(4:23|24|25|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x013b, code lost:
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0135 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d7 A[RETURN] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24, types: [com.withings.library.authentication.login.state.impl.LoggedOutImpl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v34 */
    @Override // com.withings.library.authentication.login.state.LoggedOut
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object loginWithHashedPassword(java.lang.String r23, java.lang.String r24, qm0.d<? super com.withings.library.authentication.login.state.LoggedOut.OutputState> r25) {
        /*
            Method dump skipped, instructions count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.login.state.impl.LoggedOutImpl.loginWithHashedPassword(java.lang.String, java.lang.String, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(6:5|6|(1:(1:(3:10|11|12)(2:14|15))(4:16|17|18|19))(4:41|42|43|(1:45)(1:46))|20|21|23))|54|6|(0)(0)|20|21|23|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0097, code lost:
        r11 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0119, code lost:
        return r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0119 A[RETURN] */
    @Override // com.withings.library.authentication.login.state.LoggedOut
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object loginWithMail(java.lang.String r10, qm0.d<? super com.withings.library.authentication.login.state.LoggedOut.OutputState> r11) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.login.state.impl.LoggedOutImpl.loginWithMail(java.lang.String, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:7|(2:67|(1:(1:(1:(3:72|53|54)(2:73|74))(5:75|76|77|29|31))(7:78|79|80|81|24|25|(1:27)(3:28|29|31)))(3:85|86|87))(7:9|10|11|12|13|14|(1:16)(1:18))|19|20|(1:22)(4:23|24|25|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x013b, code lost:
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0135 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d7 A[RETURN] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24, types: [com.withings.library.authentication.login.state.impl.LoggedOutImpl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v34 */
    @Override // com.withings.library.authentication.login.state.LoggedOut
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object loginWithPassword(java.lang.String r23, java.lang.String r24, qm0.d<? super com.withings.library.authentication.login.state.LoggedOut.OutputState> r25) {
        /*
            Method dump skipped, instructions count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.login.state.impl.LoggedOutImpl.loginWithPassword(java.lang.String, java.lang.String, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0077  */
    @Override // com.withings.library.authentication.login.state.LoggedOut
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object requestNewPassword(java.lang.String r5, qm0.d<? super com.withings.library.authentication.login.state.LoggedOut.NewPasswordOutputState> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.withings.library.authentication.login.state.impl.LoggedOutImpl$requestNewPassword$1
            if (r0 == 0) goto L13
            r0 = r6
            com.withings.library.authentication.login.state.impl.LoggedOutImpl$requestNewPassword$1 r0 = (com.withings.library.authentication.login.state.impl.LoggedOutImpl$requestNewPassword$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.library.authentication.login.state.impl.LoggedOutImpl$requestNewPassword$1 r0 = new com.withings.library.authentication.login.state.impl.LoggedOutImpl$requestNewPassword$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.L$0
            com.withings.library.authentication.login.state.impl.LoggedOutImpl r5 = (com.withings.library.authentication.login.state.impl.LoggedOutImpl) r5
            nm0.l.b(r6)     // Catch: java.lang.Exception -> L2b com.withings.library.authentication.api.error.WrongStatusException -> L2d
            goto L52
        L2b:
            r6 = move-exception
            goto L5e
        L2d:
            r6 = move-exception
            goto L86
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            nm0.l.b(r6)
            com.withings.library.authentication.api.account.AccountApi r6 = r4.getAccountApi()     // Catch: java.lang.Exception -> L58 com.withings.library.authentication.api.error.WrongStatusException -> L5b
            ym0.a<com.withings.library.authentication.login.Server> r2 = r4.server     // Catch: java.lang.Exception -> L58 com.withings.library.authentication.api.error.WrongStatusException -> L5b
            java.lang.Object r2 = r2.invoke()     // Catch: java.lang.Exception -> L58 com.withings.library.authentication.api.error.WrongStatusException -> L5b
            com.withings.library.authentication.login.Server r2 = (com.withings.library.authentication.login.Server) r2     // Catch: java.lang.Exception -> L58 com.withings.library.authentication.api.error.WrongStatusException -> L5b
            r0.L$0 = r4     // Catch: java.lang.Exception -> L58 com.withings.library.authentication.api.error.WrongStatusException -> L5b
            r0.label = r3     // Catch: java.lang.Exception -> L58 com.withings.library.authentication.api.error.WrongStatusException -> L5b
            java.lang.Object r5 = r6.requestNewPassword(r5, r2, r0)     // Catch: java.lang.Exception -> L58 com.withings.library.authentication.api.error.WrongStatusException -> L5b
            if (r5 != r1) goto L51
            return r1
        L51:
            r5 = r4
        L52:
            com.withings.library.authentication.login.state.LoggedOut$NewPasswordOutputState$SuccessLoggedOut r6 = new com.withings.library.authentication.login.state.LoggedOut$NewPasswordOutputState$SuccessLoggedOut     // Catch: java.lang.Exception -> L2b com.withings.library.authentication.api.error.WrongStatusException -> L2d
            r6.<init>(r5)     // Catch: java.lang.Exception -> L2b com.withings.library.authentication.api.error.WrongStatusException -> L2d
            goto L99
        L58:
            r6 = move-exception
            r5 = r4
            goto L5e
        L5b:
            r6 = move-exception
            r5 = r4
            goto L86
        L5e:
            com.withings.library.authentication.api.error.NetworkExceptionChecker r0 = r5.getNetworkExceptionChecker()
            boolean r0 = r0.isNetworkException(r6)
            if (r0 == 0) goto L77
            v9.e r6 = r5.getLog()
            java.lang.String r0 = "Network error detected during new password process"
            r6.a(r0)
            com.withings.library.authentication.login.state.LoggedOut$NewPasswordOutputState$NetworkError r6 = new com.withings.library.authentication.login.state.LoggedOut$NewPasswordOutputState$NetworkError
            r6.<init>(r5)
            goto L99
        L77:
            v9.e r0 = r5.getLog()
            java.lang.String r1 = "Exception during during new password process"
            r0.b(r1, r6)
            com.withings.library.authentication.login.state.LoggedOut$NewPasswordOutputState$GenericError r6 = new com.withings.library.authentication.login.state.LoggedOut$NewPasswordOutputState$GenericError
            r6.<init>(r5)
            goto L99
        L86:
            v9.e r0 = r5.getLog()
            java.lang.String r1 = "Exception during new password process"
            r0.b(r1, r6)
            com.withings.library.authentication.login.state.LoggedOut$NewPasswordOutputState$WithingsError r0 = new com.withings.library.authentication.login.state.LoggedOut$NewPasswordOutputState$WithingsError
            int r6 = r6.getStatus()
            r0.<init>(r5, r6)
            r6 = r0
        L99:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.login.state.impl.LoggedOutImpl.requestNewPassword(java.lang.String, qm0.d):java.lang.Object");
    }
}
