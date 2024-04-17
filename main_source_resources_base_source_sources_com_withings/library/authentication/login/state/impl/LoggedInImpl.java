package com.withings.library.authentication.login.state.impl;

import com.withings.library.authentication.api.auth.AuthApi;
import com.withings.library.authentication.api.constant.ApiConstantProvider;
import com.withings.library.authentication.api.error.NetworkExceptionChecker;
import com.withings.library.authentication.di.KoinKt;
import com.withings.library.authentication.host.app.ApplicationInformationProvider;
import com.withings.library.authentication.host.device.DeviceInformationProvider;
import com.withings.library.authentication.host.session.PreviousSessionRepository;
import com.withings.library.authentication.login.session.multi.MultiSessionRetriever;
import com.withings.library.authentication.login.session.verify.SessionVerifier;
import com.withings.library.authentication.login.session.verify.SessionVerifierResult;
import com.withings.library.authentication.login.state.AuthenticationState;
import com.withings.library.authentication.login.state.LoggedIn;
import com.withings.library.authentication.login.state.NeedCode2FA;
import com.withings.library.authentication.login.state.NeedPhoneNumber2FACreation;
import com.withings.library.authentication.login.state.Sequence;
import com.withings.library.authentication.login.state.factory.LoggedInFactory;
import com.withings.library.authentication.login.state.factory.LoggedOutFactory;
import com.withings.library.authentication.login.state.factory.NeedCode2FAFactory;
import com.withings.library.authentication.login.state.factory.NeedPhoneNumber2FACreationFactory;
import com.withings.library.authentication.sensitiveaction.SensitiveActionService;
import com.withings.library.authentication.setup2fa.Setup2FAService;
import com.withings.library.authentication.updateaccount.UpdateAccountService;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
import org.jivesoftware.smack.packet.Session;
import pq0.a;
import v9.e;
/* compiled from: LoggedInImpl.kt */
@Metadata(d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0000\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000f0&¢\u0006\u0004\b|\u0010}J\u0013\u0010\u0004\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\u0006*\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u0005J\u001b\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0005J\u001b\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0096@ø\u0001\u0000¢\u0006\u0004\b$\u0010%R \u0010'\u001a\b\u0012\u0004\u0012\u00020\u000f0&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001b\u00100\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001b\u00105\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\b3\u00104R\u001b\u0010:\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010-\u001a\u0004\b8\u00109R\u001b\u0010?\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010-\u001a\u0004\b=\u0010>R\u001b\u0010D\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010-\u001a\u0004\bB\u0010CR\u001b\u0010I\u001a\u00020E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010-\u001a\u0004\bG\u0010HR\u001b\u0010N\u001a\u00020J8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010-\u001a\u0004\bL\u0010MR\u001b\u0010S\u001a\u00020O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010-\u001a\u0004\bQ\u0010RR\u001b\u0010X\u001a\u00020T8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u0010-\u001a\u0004\bV\u0010WR\u001b\u0010]\u001a\u00020Y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010-\u001a\u0004\b[\u0010\\R\u001b\u0010b\u001a\u00020^8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b_\u0010-\u001a\u0004\b`\u0010aR\u001b\u0010g\u001a\u00020c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bd\u0010-\u001a\u0004\be\u0010fR\u001b\u0010l\u001a\u00020h8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bi\u0010-\u001a\u0004\bj\u0010kR\u001b\u0010q\u001a\u00020m8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bn\u0010-\u001a\u0004\bo\u0010pR\u001b\u0010v\u001a\u00020r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bs\u0010-\u001a\u0004\bt\u0010uR\u001b\u0010{\u001a\u00020w8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bx\u0010-\u001a\u0004\by\u0010z\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006~"}, d2 = {"Lcom/withings/library/authentication/login/state/impl/LoggedInImpl;", "Lcom/withings/library/authentication/login/state/LoggedIn;", "Lpq0/a;", "Lnm0/y;", "manageLoggedOutTransition", "(Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/authentication/login/state/AuthenticationState;", "Lcom/withings/library/authentication/login/state/LoggedIn$RenewOutputState;", "toRenewOutputState", "(Lcom/withings/library/authentication/login/state/AuthenticationState;)Lcom/withings/library/authentication/login/state/LoggedIn$RenewOutputState;", "Lcom/withings/library/authentication/login/session/verify/SessionVerifierResult;", "toAuthState", "(Lcom/withings/library/authentication/login/session/verify/SessionVerifierResult;)Lcom/withings/library/authentication/login/state/AuthenticationState;", "Lcom/withings/library/authentication/login/state/LoggedIn$LogoutOutputState;", "logout", "Lcom/withings/library/authentication/login/Session;", Session.ELEMENT, "renewSession", "(Lcom/withings/library/authentication/login/Session;Lqm0/d;)Ljava/lang/Object;", "", "force", "renewSessions", "(ZLqm0/d;)Ljava/lang/Object;", "renewAndRetrieveSessions", "Lcom/withings/library/authentication/updateaccount/AccountContextRequest;", "accountContextRequest", "Lcom/withings/library/authentication/login/state/LoggedIn$UpdateContextOutputState;", "updateAccountContext", "(Lcom/withings/library/authentication/updateaccount/AccountContextRequest;Lqm0/d;)Ljava/lang/Object;", "", "sessionId", "", "accountId", "Lcom/withings/library/authentication/login/Server;", "server", "Lcom/withings/library/authentication/api/account/AccountContext;", "getAccountContext", "(Ljava/lang/String;JLcom/withings/library/authentication/login/Server;Lqm0/d;)Ljava/lang/Object;", "", "sessions", "Ljava/util/List;", "getSessions", "()Ljava/util/List;", "Lcom/withings/library/authentication/api/auth/AuthApi;", "authApi$delegate", "Lnm0/g;", "getAuthApi", "()Lcom/withings/library/authentication/api/auth/AuthApi;", "authApi", "Lcom/withings/library/authentication/host/device/DeviceInformationProvider;", "deviceInformationProvider$delegate", "getDeviceInformationProvider", "()Lcom/withings/library/authentication/host/device/DeviceInformationProvider;", "deviceInformationProvider", "Lcom/withings/library/authentication/api/error/NetworkExceptionChecker;", "networkExceptionChecker$delegate", "getNetworkExceptionChecker", "()Lcom/withings/library/authentication/api/error/NetworkExceptionChecker;", "networkExceptionChecker", "Lcom/withings/library/authentication/host/app/ApplicationInformationProvider;", "applicationInformationProvider$delegate", "getApplicationInformationProvider", "()Lcom/withings/library/authentication/host/app/ApplicationInformationProvider;", "applicationInformationProvider", "Lcom/withings/library/authentication/api/constant/ApiConstantProvider;", "apiConstantProvider$delegate", "getApiConstantProvider", "()Lcom/withings/library/authentication/api/constant/ApiConstantProvider;", "apiConstantProvider", "Lcom/withings/library/authentication/login/session/verify/SessionVerifier;", "sessionVerifier$delegate", "getSessionVerifier", "()Lcom/withings/library/authentication/login/session/verify/SessionVerifier;", "sessionVerifier", "Lv9/e;", "log$delegate", "getLog", "()Lv9/e;", "log", "Lcom/withings/library/authentication/host/session/PreviousSessionRepository;", "previousSessionRepository$delegate", "getPreviousSessionRepository", "()Lcom/withings/library/authentication/host/session/PreviousSessionRepository;", "previousSessionRepository", "Lcom/withings/library/authentication/login/state/factory/LoggedOutFactory;", "loggedOutFactory$delegate", "getLoggedOutFactory", "()Lcom/withings/library/authentication/login/state/factory/LoggedOutFactory;", "loggedOutFactory", "Lcom/withings/library/authentication/login/state/factory/LoggedInFactory;", "loggedInFactory$delegate", "getLoggedInFactory", "()Lcom/withings/library/authentication/login/state/factory/LoggedInFactory;", "loggedInFactory", "Lcom/withings/library/authentication/login/state/factory/NeedPhoneNumber2FACreationFactory;", "needPhoneNumber2FACreationFactory$delegate", "getNeedPhoneNumber2FACreationFactory", "()Lcom/withings/library/authentication/login/state/factory/NeedPhoneNumber2FACreationFactory;", "needPhoneNumber2FACreationFactory", "Lcom/withings/library/authentication/login/state/factory/NeedCode2FAFactory;", "needCode2FAFactory$delegate", "getNeedCode2FAFactory", "()Lcom/withings/library/authentication/login/state/factory/NeedCode2FAFactory;", "needCode2FAFactory", "Lcom/withings/library/authentication/setup2fa/Setup2FAService;", "setup2FAService$delegate", "getSetup2FAService", "()Lcom/withings/library/authentication/setup2fa/Setup2FAService;", "setup2FAService", "Lcom/withings/library/authentication/updateaccount/UpdateAccountService;", "updateAccountService$delegate", "getUpdateAccountService", "()Lcom/withings/library/authentication/updateaccount/UpdateAccountService;", "updateAccountService", "Lcom/withings/library/authentication/login/session/multi/MultiSessionRetriever;", "multiSessionRetriever$delegate", "getMultiSessionRetriever", "()Lcom/withings/library/authentication/login/session/multi/MultiSessionRetriever;", "multiSessionRetriever", "Lcom/withings/library/authentication/sensitiveaction/SensitiveActionService;", "sensitiveActionService$delegate", "getSensitiveActionService", "()Lcom/withings/library/authentication/sensitiveaction/SensitiveActionService;", "sensitiveActionService", "<init>", "(Ljava/util/List;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class LoggedInImpl implements LoggedIn, a {
    private final g apiConstantProvider$delegate;
    private final g applicationInformationProvider$delegate;
    private final g authApi$delegate;
    private final g deviceInformationProvider$delegate;
    private final g log$delegate;
    private final g loggedInFactory$delegate;
    private final g loggedOutFactory$delegate;
    private final g multiSessionRetriever$delegate;
    private final g needCode2FAFactory$delegate;
    private final g needPhoneNumber2FACreationFactory$delegate;
    private final g networkExceptionChecker$delegate;
    private final g previousSessionRepository$delegate;
    private final g sensitiveActionService$delegate;
    private final g sessionVerifier$delegate;
    private final List<com.withings.library.authentication.login.Session> sessions;
    private final g setup2FAService$delegate;
    private final g updateAccountService$delegate;

    public LoggedInImpl(List<com.withings.library.authentication.login.Session> sessions) {
        u.j(sessions, "sessions");
        this.sessions = sessions;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f76136a;
        this.authApi$delegate = h.a(lazyThreadSafetyMode, new LoggedInImpl$special$$inlined$inject$default$1(this, null, null));
        this.deviceInformationProvider$delegate = h.a(lazyThreadSafetyMode, new LoggedInImpl$special$$inlined$inject$default$2(this, null, null));
        this.networkExceptionChecker$delegate = h.a(lazyThreadSafetyMode, new LoggedInImpl$special$$inlined$inject$default$3(this, null, null));
        this.applicationInformationProvider$delegate = h.a(lazyThreadSafetyMode, new LoggedInImpl$special$$inlined$inject$default$4(this, null, null));
        this.apiConstantProvider$delegate = h.a(lazyThreadSafetyMode, new LoggedInImpl$special$$inlined$inject$default$5(this, null, null));
        this.sessionVerifier$delegate = h.a(lazyThreadSafetyMode, new LoggedInImpl$special$$inlined$inject$default$6(this, null, null));
        this.log$delegate = KoinKt.injectLogger(this, "LoggedIn");
        this.previousSessionRepository$delegate = h.a(lazyThreadSafetyMode, new LoggedInImpl$special$$inlined$inject$default$7(this, null, null));
        this.loggedOutFactory$delegate = h.a(lazyThreadSafetyMode, new LoggedInImpl$special$$inlined$inject$default$8(this, null, null));
        this.loggedInFactory$delegate = h.a(lazyThreadSafetyMode, new LoggedInImpl$special$$inlined$inject$default$9(this, null, null));
        this.needPhoneNumber2FACreationFactory$delegate = h.a(lazyThreadSafetyMode, new LoggedInImpl$special$$inlined$inject$default$10(this, null, null));
        this.needCode2FAFactory$delegate = h.a(lazyThreadSafetyMode, new LoggedInImpl$special$$inlined$inject$default$11(this, null, null));
        this.setup2FAService$delegate = h.a(lazyThreadSafetyMode, new LoggedInImpl$special$$inlined$inject$default$12(this, null, null));
        this.updateAccountService$delegate = h.a(lazyThreadSafetyMode, new LoggedInImpl$special$$inlined$inject$default$13(this, null, null));
        this.multiSessionRetriever$delegate = h.a(lazyThreadSafetyMode, new LoggedInImpl$special$$inlined$inject$default$14(this, null, null));
        this.sensitiveActionService$delegate = h.a(lazyThreadSafetyMode, new LoggedInImpl$special$$inlined$inject$default$15(this, null, null));
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

    private final NeedCode2FAFactory getNeedCode2FAFactory() {
        return (NeedCode2FAFactory) this.needCode2FAFactory$delegate.getValue();
    }

    private final NeedPhoneNumber2FACreationFactory getNeedPhoneNumber2FACreationFactory() {
        return (NeedPhoneNumber2FACreationFactory) this.needPhoneNumber2FACreationFactory$delegate.getValue();
    }

    private final NetworkExceptionChecker getNetworkExceptionChecker() {
        return (NetworkExceptionChecker) this.networkExceptionChecker$delegate.getValue();
    }

    private final PreviousSessionRepository getPreviousSessionRepository() {
        return (PreviousSessionRepository) this.previousSessionRepository$delegate.getValue();
    }

    private final SensitiveActionService getSensitiveActionService() {
        return (SensitiveActionService) this.sensitiveActionService$delegate.getValue();
    }

    private final SessionVerifier getSessionVerifier() {
        return (SessionVerifier) this.sessionVerifier$delegate.getValue();
    }

    private final Setup2FAService getSetup2FAService() {
        return (Setup2FAService) this.setup2FAService$delegate.getValue();
    }

    private final UpdateAccountService getUpdateAccountService() {
        return (UpdateAccountService) this.updateAccountService$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object manageLoggedOutTransition(qm0.d<? super nm0.y> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.withings.library.authentication.login.state.impl.LoggedInImpl$manageLoggedOutTransition$1
            if (r0 == 0) goto L13
            r0 = r6
            com.withings.library.authentication.login.state.impl.LoggedInImpl$manageLoggedOutTransition$1 r0 = (com.withings.library.authentication.login.state.impl.LoggedInImpl$manageLoggedOutTransition$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.library.authentication.login.state.impl.LoggedInImpl$manageLoggedOutTransition$1 r0 = new com.withings.library.authentication.login.state.impl.LoggedInImpl$manageLoggedOutTransition$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            nm0.l.b(r6)
            goto L64
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            java.lang.Object r2 = r0.L$0
            com.withings.library.authentication.login.state.impl.LoggedInImpl r2 = (com.withings.library.authentication.login.state.impl.LoggedInImpl) r2
            nm0.l.b(r6)
            goto L54
        L3a:
            nm0.l.b(r6)
            com.withings.library.authentication.host.session.PreviousSessionRepository r6 = r5.getPreviousSessionRepository()
            r6.clearSession()
            com.withings.library.authentication.setup2fa.Setup2FAService r6 = r5.getSetup2FAService()
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r6.clearState(r0)
            if (r6 != r1) goto L53
            return r1
        L53:
            r2 = r5
        L54:
            com.withings.library.authentication.sensitiveaction.SensitiveActionService r6 = r2.getSensitiveActionService()
            r2 = 0
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r6 = r6.clearState(r0)
            if (r6 != r1) goto L64
            return r1
        L64:
            nm0.y r6 = nm0.y.f85009a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.login.state.impl.LoggedInImpl.manageLoggedOutTransition(qm0.d):java.lang.Object");
    }

    private final AuthenticationState toAuthState(SessionVerifierResult sessionVerifierResult) {
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

    private final LoggedIn.RenewOutputState toRenewOutputState(AuthenticationState authenticationState) {
        if (authenticationState instanceof LoggedIn) {
            return new LoggedIn.RenewOutputState.SuccessLoggedIn((LoggedIn) authenticationState);
        }
        if (authenticationState instanceof NeedPhoneNumber2FACreation) {
            return new LoggedIn.RenewOutputState.SuccessNeedPhoneNumber2FACreation((NeedPhoneNumber2FACreation) authenticationState);
        }
        if (authenticationState instanceof NeedCode2FA) {
            return new LoggedIn.RenewOutputState.SuccessNeed2FACode((NeedCode2FA) authenticationState);
        }
        return new LoggedIn.RenewOutputState.GenericError(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006e  */
    @Override // com.withings.library.authentication.login.state.LoggedIn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getAccountContext(java.lang.String r9, long r10, com.withings.library.authentication.login.Server r12, qm0.d<? super com.withings.library.authentication.api.account.AccountContext> r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof com.withings.library.authentication.login.state.impl.LoggedInImpl$getAccountContext$1
            if (r0 == 0) goto L14
            r0 = r13
            com.withings.library.authentication.login.state.impl.LoggedInImpl$getAccountContext$1 r0 = (com.withings.library.authentication.login.state.impl.LoggedInImpl$getAccountContext$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            com.withings.library.authentication.login.state.impl.LoggedInImpl$getAccountContext$1 r0 = new com.withings.library.authentication.login.state.impl.LoggedInImpl$getAccountContext$1
            r0.<init>(r8, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r6.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r6.label
            r2 = 1
            r7 = 0
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L32
            java.lang.Object r9 = r6.L$0
            com.withings.library.authentication.login.state.impl.LoggedInImpl r9 = (com.withings.library.authentication.login.state.impl.LoggedInImpl) r9
            nm0.l.b(r13)     // Catch: java.lang.Exception -> L2e com.withings.library.authentication.api.error.WrongStatusException -> L30
            goto L50
        L2e:
            r10 = move-exception
            goto L5a
        L30:
            r10 = move-exception
            goto L78
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            nm0.l.b(r13)
            com.withings.library.authentication.updateaccount.UpdateAccountService r1 = r8.getUpdateAccountService()     // Catch: java.lang.Exception -> L54 com.withings.library.authentication.api.error.WrongStatusException -> L57
            r6.L$0 = r8     // Catch: java.lang.Exception -> L54 com.withings.library.authentication.api.error.WrongStatusException -> L57
            r6.label = r2     // Catch: java.lang.Exception -> L54 com.withings.library.authentication.api.error.WrongStatusException -> L57
            r2 = r9
            r3 = r10
            r5 = r12
            java.lang.Object r13 = r1.getAccountContext(r2, r3, r5, r6)     // Catch: java.lang.Exception -> L54 com.withings.library.authentication.api.error.WrongStatusException -> L57
            if (r13 != r0) goto L4f
            return r0
        L4f:
            r9 = r8
        L50:
            com.withings.library.authentication.api.account.AccountContext r13 = (com.withings.library.authentication.api.account.AccountContext) r13     // Catch: java.lang.Exception -> L2e com.withings.library.authentication.api.error.WrongStatusException -> L30
            r7 = r13
            goto L81
        L54:
            r10 = move-exception
            r9 = r8
            goto L5a
        L57:
            r10 = move-exception
            r9 = r8
            goto L78
        L5a:
            com.withings.library.authentication.api.error.NetworkExceptionChecker r11 = r9.getNetworkExceptionChecker()
            boolean r11 = r11.isNetworkException(r10)
            if (r11 == 0) goto L6e
            v9.e r9 = r9.getLog()
            java.lang.String r10 = "Network error detected during get account context"
            r9.a(r10)
            goto L81
        L6e:
            v9.e r9 = r9.getLog()
            java.lang.String r11 = "Exception during get account context"
            r9.b(r11, r10)
            goto L81
        L78:
            v9.e r9 = r9.getLog()
            java.lang.String r11 = "Error detected during get account context"
            r9.b(r11, r10)
        L81:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.login.state.impl.LoggedInImpl.getAccountContext(java.lang.String, long, com.withings.library.authentication.login.Server, qm0.d):java.lang.Object");
    }

    @Override // pq0.a
    public oq0.a getKoin() {
        return qq0.a.f93676a.a();
    }

    @Override // com.withings.library.authentication.login.state.LoggedIn
    public List<com.withings.library.authentication.login.Session> getSessions() {
        return this.sessions;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:29|30|31|32|33|34|(1:36)(7:37|22|23|(0)|26|27|(2:53|(1:55)(3:56|11|(0)(0)))(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bb, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bc, code lost:
        r9 = r4;
        r10 = r6;
        r4 = r8;
        r8 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c1, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c2, code lost:
        r9 = r4;
        r10 = r6;
        r4 = r8;
        r8 = r15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00b1 -> B:32:0x00b5). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00d7 -> B:33:0x00b6). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00e6 -> B:33:0x00b6). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00f5 -> B:33:0x00b6). Please submit an issue!!! */
    @Override // com.withings.library.authentication.login.state.LoggedIn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object logout(qm0.d<? super com.withings.library.authentication.login.state.LoggedIn.LogoutOutputState> r17) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.login.state.impl.LoggedInImpl.logout(qm0.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(2:3|(4:5|6|7|8))|94|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0065, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
        r3 = -2147483648(0xffffffff80000000, float:-0.0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
        r3 = -2147483648(0xffffffff80000000, float:-0.0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006d, code lost:
        r3 = -2147483648(0xffffffff80000000, float:-0.0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0070, code lost:
        r3 = -2147483648(0xffffffff80000000, float:-0.0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0116 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0122 A[Catch: Exception -> 0x0065, WrongStatusException -> 0x0069, ExpiredCreationTokenException -> 0x006d, AuthFailedException -> 0x0070, TRY_LEAVE, TryCatch #5 {AuthFailedException -> 0x0070, ExpiredCreationTokenException -> 0x006d, WrongStatusException -> 0x0069, Exception -> 0x0065, blocks: (B:25:0x0060, B:45:0x0118, B:47:0x0122, B:65:0x0175, B:34:0x007b), top: B:92:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0141 A[Catch: Exception -> 0x0049, WrongStatusException -> 0x004c, ExpiredCreationTokenException -> 0x01c1, AuthFailedException -> 0x01e7, TryCatch #6 {AuthFailedException -> 0x01e7, ExpiredCreationTokenException -> 0x01c1, WrongStatusException -> 0x004c, Exception -> 0x0049, blocks: (B:15:0x0044, B:56:0x0157, B:22:0x0053, B:51:0x013b, B:53:0x0141, B:57:0x0160, B:62:0x0169, B:60:0x0165, B:63:0x016f, B:41:0x00f3), top: B:92:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0160 A[Catch: Exception -> 0x0049, WrongStatusException -> 0x004c, ExpiredCreationTokenException -> 0x01c1, AuthFailedException -> 0x01e7, TryCatch #6 {AuthFailedException -> 0x01e7, ExpiredCreationTokenException -> 0x01c1, WrongStatusException -> 0x004c, Exception -> 0x0049, blocks: (B:15:0x0044, B:56:0x0157, B:22:0x0053, B:51:0x013b, B:53:0x0141, B:57:0x0160, B:62:0x0169, B:60:0x0165, B:63:0x016f, B:41:0x00f3), top: B:92:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0175 A[Catch: Exception -> 0x0065, WrongStatusException -> 0x0069, ExpiredCreationTokenException -> 0x006d, AuthFailedException -> 0x0070, TRY_ENTER, TRY_LEAVE, TryCatch #5 {AuthFailedException -> 0x0070, ExpiredCreationTokenException -> 0x006d, WrongStatusException -> 0x0069, Exception -> 0x0065, blocks: (B:25:0x0060, B:45:0x0118, B:47:0x0122, B:65:0x0175, B:34:0x007b), top: B:92:0x0023 }] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // com.withings.library.authentication.login.state.LoggedIn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object renewAndRetrieveSessions(qm0.d<? super com.withings.library.authentication.login.state.LoggedIn.RenewOutputState> r22) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.login.state.impl.LoggedInImpl.renewAndRetrieveSessions(qm0.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(6:5|6|(1:(1:(1:(1:(4:12|13|14|15)(2:17|18))(4:19|20|14|15))(9:21|22|23|24|25|26|(1:28)|29|31))(4:54|55|56|57))(7:73|74|75|76|77|78|(1:80)(1:81))|58|59|(1:61)(6:62|25|26|(0)|29|31)))|94|6|(0)(0)|58|59|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x015f, code lost:
        r0 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0161, code lost:
        r0 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01c5, code lost:
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01ec, code lost:
        return r12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013e A[Catch: Exception -> 0x005b, WrongStatusException -> 0x005e, ExpiredCreationTokenException -> 0x0153, AuthFailedException -> 0x0156, TryCatch #17 {AuthFailedException -> 0x0156, ExpiredCreationTokenException -> 0x0153, blocks: (B:49:0x0134, B:51:0x013e, B:54:0x0159), top: B:85:0x0134 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ec A[RETURN] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.util.List] */
    @Override // com.withings.library.authentication.login.state.LoggedIn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object renewSession(com.withings.library.authentication.login.Session r25, qm0.d<? super com.withings.library.authentication.login.state.LoggedIn.RenewOutputState> r26) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.login.state.impl.LoggedInImpl.renewSession(com.withings.library.authentication.login.Session, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(2:3|(4:5|6|7|(1:(1:(1:(1:(3:13|14|15)(2:17|18))(3:19|20|21))(10:22|23|24|25|26|(2:86|(2:90|(2:92|93)(1:94))(2:88|89))(1:28)|29|30|31|(5:33|34|35|36|(1:38)(4:39|40|41|(1:43)(8:44|25|26|(0)(0)|29|30|31|(3:75|76|77)(0))))(0)))(6:101|102|103|40|41|(0)(0)))(9:104|105|106|(6:109|(1:119)(1:112)|113|(2:115|116)(1:118)|117|107)|120|121|(1:123)|124|(5:126|127|30|31|(0)(0))(3:129|76|77))))|140|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
        r0 = r1;
        r1 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
        r0 = r1;
        r1 = r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x029a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0107 A[Catch: Exception -> 0x0223, WrongStatusException -> 0x0227, ExpiredCreationTokenException -> 0x022b, AuthFailedException -> 0x022e, TRY_LEAVE, TryCatch #11 {AuthFailedException -> 0x022e, ExpiredCreationTokenException -> 0x022b, WrongStatusException -> 0x0227, Exception -> 0x0223, blocks: (B:56:0x0101, B:58:0x0107), top: B:127:0x0101 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b5 A[Catch: Exception -> 0x01c1, WrongStatusException -> 0x01c5, ExpiredCreationTokenException -> 0x01c9, AuthFailedException -> 0x01cd, TryCatch #8 {AuthFailedException -> 0x01cd, ExpiredCreationTokenException -> 0x01c9, WrongStatusException -> 0x01c5, Exception -> 0x01c1, blocks: (B:68:0x01ab, B:70:0x01b5, B:77:0x01d1, B:79:0x01d5, B:81:0x01e5, B:83:0x01e9, B:85:0x01f9), top: B:133:0x01ab }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d1 A[Catch: Exception -> 0x01c1, WrongStatusException -> 0x01c5, ExpiredCreationTokenException -> 0x01c9, AuthFailedException -> 0x01cd, TryCatch #8 {AuthFailedException -> 0x01cd, ExpiredCreationTokenException -> 0x01c9, WrongStatusException -> 0x01c5, Exception -> 0x01c1, blocks: (B:68:0x01ab, B:70:0x01b5, B:77:0x01d1, B:79:0x01d5, B:81:0x01e5, B:83:0x01e9, B:85:0x01f9), top: B:133:0x01ab }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x01aa -> B:133:0x01ab). Please submit an issue!!! */
    @Override // com.withings.library.authentication.login.state.LoggedIn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object renewSessions(boolean r25, qm0.d<? super com.withings.library.authentication.login.state.LoggedIn.RenewOutputState> r26) {
        /*
            Method dump skipped, instructions count: 721
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.login.state.impl.LoggedInImpl.renewSessions(boolean, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0073  */
    @Override // com.withings.library.authentication.login.state.LoggedIn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object updateAccountContext(com.withings.library.authentication.updateaccount.AccountContextRequest r6, qm0.d<? super com.withings.library.authentication.login.state.LoggedIn.UpdateContextOutputState> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.withings.library.authentication.login.state.impl.LoggedInImpl$updateAccountContext$1
            if (r0 == 0) goto L13
            r0 = r7
            com.withings.library.authentication.login.state.impl.LoggedInImpl$updateAccountContext$1 r0 = (com.withings.library.authentication.login.state.impl.LoggedInImpl$updateAccountContext$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.library.authentication.login.state.impl.LoggedInImpl$updateAccountContext$1 r0 = new com.withings.library.authentication.login.state.impl.LoggedInImpl$updateAccountContext$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            java.lang.String r3 = "Exception during update context"
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 != r4) goto L31
            java.lang.Object r6 = r0.L$0
            com.withings.library.authentication.login.state.impl.LoggedInImpl r6 = (com.withings.library.authentication.login.state.impl.LoggedInImpl) r6
            nm0.l.b(r7)     // Catch: java.lang.Exception -> L2d com.withings.library.authentication.api.error.WrongStatusException -> L2f com.withings.library.authentication.api.error.WrongStatusException.AuthFailedException -> L92
            goto L4c
        L2d:
            r7 = move-exception
            goto L5a
        L2f:
            r7 = move-exception
            goto L80
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            nm0.l.b(r7)
            com.withings.library.authentication.updateaccount.UpdateAccountService r7 = r5.getUpdateAccountService()     // Catch: java.lang.Exception -> L52 com.withings.library.authentication.api.error.WrongStatusException -> L55 com.withings.library.authentication.api.error.WrongStatusException.AuthFailedException -> L58
            r0.L$0 = r5     // Catch: java.lang.Exception -> L52 com.withings.library.authentication.api.error.WrongStatusException -> L55 com.withings.library.authentication.api.error.WrongStatusException.AuthFailedException -> L58
            r0.label = r4     // Catch: java.lang.Exception -> L52 com.withings.library.authentication.api.error.WrongStatusException -> L55 com.withings.library.authentication.api.error.WrongStatusException.AuthFailedException -> L58
            java.lang.Object r6 = r7.updateAccountContext(r6, r0)     // Catch: java.lang.Exception -> L52 com.withings.library.authentication.api.error.WrongStatusException -> L55 com.withings.library.authentication.api.error.WrongStatusException.AuthFailedException -> L58
            if (r6 != r1) goto L4b
            return r1
        L4b:
            r6 = r5
        L4c:
            com.withings.library.authentication.login.state.LoggedIn$UpdateContextOutputState$SuccessUpdate r7 = new com.withings.library.authentication.login.state.LoggedIn$UpdateContextOutputState$SuccessUpdate     // Catch: java.lang.Exception -> L2d com.withings.library.authentication.api.error.WrongStatusException -> L2f com.withings.library.authentication.api.error.WrongStatusException.AuthFailedException -> L92
            r7.<init>(r6)     // Catch: java.lang.Exception -> L2d com.withings.library.authentication.api.error.WrongStatusException -> L2f com.withings.library.authentication.api.error.WrongStatusException.AuthFailedException -> L92
            goto La0
        L52:
            r7 = move-exception
            r6 = r5
            goto L5a
        L55:
            r7 = move-exception
            r6 = r5
            goto L80
        L58:
            r6 = r5
            goto L92
        L5a:
            com.withings.library.authentication.api.error.NetworkExceptionChecker r0 = r6.getNetworkExceptionChecker()
            boolean r0 = r0.isNetworkException(r7)
            if (r0 == 0) goto L73
            v9.e r7 = r6.getLog()
            java.lang.String r0 = "Network error detected update context"
            r7.a(r0)
            com.withings.library.authentication.login.state.LoggedIn$UpdateContextOutputState$NetworkError r7 = new com.withings.library.authentication.login.state.LoggedIn$UpdateContextOutputState$NetworkError
            r7.<init>(r6)
            goto La0
        L73:
            v9.e r0 = r6.getLog()
            r0.b(r3, r7)
            com.withings.library.authentication.login.state.LoggedIn$UpdateContextOutputState$GenericError r7 = new com.withings.library.authentication.login.state.LoggedIn$UpdateContextOutputState$GenericError
            r7.<init>(r6)
            goto La0
        L80:
            v9.e r0 = r6.getLog()
            r0.b(r3, r7)
            com.withings.library.authentication.login.state.LoggedIn$UpdateContextOutputState$WithingsError r0 = new com.withings.library.authentication.login.state.LoggedIn$UpdateContextOutputState$WithingsError
            int r7 = r7.getStatus()
            r0.<init>(r6, r7)
            r7 = r0
            goto La0
        L92:
            v9.e r7 = r6.getLog()
            java.lang.String r0 = "Auth failed during update context"
            r7.a(r0)
            com.withings.library.authentication.login.state.LoggedIn$UpdateContextOutputState$AuthenticationFailed r7 = new com.withings.library.authentication.login.state.LoggedIn$UpdateContextOutputState$AuthenticationFailed
            r7.<init>(r6)
        La0:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.login.state.impl.LoggedInImpl.updateAccountContext(com.withings.library.authentication.updateaccount.AccountContextRequest, qm0.d):java.lang.Object");
    }
}
