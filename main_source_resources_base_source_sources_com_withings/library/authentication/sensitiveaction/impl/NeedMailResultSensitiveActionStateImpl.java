package com.withings.library.authentication.sensitiveaction.impl;

import com.withings.library.authentication.api.account.AccountApi;
import com.withings.library.authentication.api.constant.ApiConstantProvider;
import com.withings.library.authentication.api.error.NetworkExceptionChecker;
import com.withings.library.authentication.di.KoinKt;
import com.withings.library.authentication.host.app.ApplicationInformationProvider;
import com.withings.library.authentication.host.device.DeviceInformationProvider;
import com.withings.library.authentication.login.Server;
import com.withings.library.authentication.login.session.verify.SessionVerifier;
import com.withings.library.authentication.login.state.update.LoggedInUpdaterService;
import com.withings.library.authentication.sensitiveaction.factory.NeedCode2FASensitiveActionFactory;
import com.withings.library.authentication.sensitiveaction.factory.NeedPhoneNumberSensitiveActionStateFactory;
import com.withings.library.authentication.sensitiveaction.factory.VerifiedSensitiveActionStateFactory;
import com.withings.library.authentication.sensitiveaction.state.NeedMailResultSensitiveActionState;
import com.withings.library.authentication.utils.locale.LocaleProvider;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;
import pq0.a;
import v9.e;
/* compiled from: NeedMailResultSensitiveActionStateImpl.kt */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\bT\u0010UJ\u0017\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\nJ\u0013\u0010\u000e\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0019\u001a\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0019\u001a\u0004\b)\u0010*R\u001b\u00100\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u0019\u001a\u0004\b.\u0010/R\u001b\u00105\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\u0019\u001a\u0004\b3\u00104R\u001b\u0010:\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010\u0019\u001a\u0004\b8\u00109R\u001b\u0010?\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010\u0019\u001a\u0004\b=\u0010>R\u001b\u0010D\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010\u0019\u001a\u0004\bB\u0010CR\u001b\u0010I\u001a\u00020E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010\u0019\u001a\u0004\bG\u0010HR\u001b\u0010N\u001a\u00020J8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010\u0019\u001a\u0004\bL\u0010MR\u001b\u0010S\u001a\u00020O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010\u0019\u001a\u0004\bQ\u0010R\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006V"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/impl/NeedMailResultSensitiveActionStateImpl;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState;", "Lpq0/a;", "Lcom/withings/library/authentication/login/session/verify/SessionVerifierResult;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState$OutputState;", "toOutputState", "(Lcom/withings/library/authentication/login/session/verify/SessionVerifierResult;Lqm0/d;)Ljava/lang/Object;", "", XHTMLText.CODE, "injectCode", "(Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "jwtToken", "injectJWTToken", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailResultSensitiveActionState$ResendMailOutputState;", "resendMail", "(Lqm0/d;)Ljava/lang/Object;", "email", "Ljava/lang/String;", "getEmail", "()Ljava/lang/String;", "Lcom/withings/library/authentication/login/Server;", "server", "Lcom/withings/library/authentication/login/Server;", "Lcom/withings/library/authentication/sensitiveaction/factory/NeedPhoneNumberSensitiveActionStateFactory;", "needPhoneNumberSensitiveActionStateFactory$delegate", "Lnm0/g;", "getNeedPhoneNumberSensitiveActionStateFactory", "()Lcom/withings/library/authentication/sensitiveaction/factory/NeedPhoneNumberSensitiveActionStateFactory;", "needPhoneNumberSensitiveActionStateFactory", "Lcom/withings/library/authentication/sensitiveaction/factory/NeedCode2FASensitiveActionFactory;", "needCode2FASensitiveActionFactory$delegate", "getNeedCode2FASensitiveActionFactory", "()Lcom/withings/library/authentication/sensitiveaction/factory/NeedCode2FASensitiveActionFactory;", "needCode2FASensitiveActionFactory", "Lcom/withings/library/authentication/sensitiveaction/factory/VerifiedSensitiveActionStateFactory;", "verifiedSensitiveActionStateFactory$delegate", "getVerifiedSensitiveActionStateFactory", "()Lcom/withings/library/authentication/sensitiveaction/factory/VerifiedSensitiveActionStateFactory;", "verifiedSensitiveActionStateFactory", "Lcom/withings/library/authentication/api/account/AccountApi;", "accountApi$delegate", "getAccountApi", "()Lcom/withings/library/authentication/api/account/AccountApi;", "accountApi", "Lcom/withings/library/authentication/host/device/DeviceInformationProvider;", "deviceInformationProvider$delegate", "getDeviceInformationProvider", "()Lcom/withings/library/authentication/host/device/DeviceInformationProvider;", "deviceInformationProvider", "Lcom/withings/library/authentication/host/app/ApplicationInformationProvider;", "applicationInformationProvider$delegate", "getApplicationInformationProvider", "()Lcom/withings/library/authentication/host/app/ApplicationInformationProvider;", "applicationInformationProvider", "Lcom/withings/library/authentication/api/constant/ApiConstantProvider;", "apiConstantProvider$delegate", "getApiConstantProvider", "()Lcom/withings/library/authentication/api/constant/ApiConstantProvider;", "apiConstantProvider", "Lcom/withings/library/authentication/api/error/NetworkExceptionChecker;", "networkExceptionChecker$delegate", "getNetworkExceptionChecker", "()Lcom/withings/library/authentication/api/error/NetworkExceptionChecker;", "networkExceptionChecker", "Lv9/e;", "log$delegate", "getLog", "()Lv9/e;", "log", "Lcom/withings/library/authentication/utils/locale/LocaleProvider;", "localeProvider$delegate", "getLocaleProvider", "()Lcom/withings/library/authentication/utils/locale/LocaleProvider;", "localeProvider", "Lcom/withings/library/authentication/login/session/verify/SessionVerifier;", "sessionVerifier$delegate", "getSessionVerifier", "()Lcom/withings/library/authentication/login/session/verify/SessionVerifier;", "sessionVerifier", "Lcom/withings/library/authentication/login/state/update/LoggedInUpdaterService;", "loggedInUpdaterService$delegate", "getLoggedInUpdaterService", "()Lcom/withings/library/authentication/login/state/update/LoggedInUpdaterService;", "loggedInUpdaterService", "<init>", "(Ljava/lang/String;Lcom/withings/library/authentication/login/Server;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class NeedMailResultSensitiveActionStateImpl implements NeedMailResultSensitiveActionState, a {
    private final g accountApi$delegate;
    private final g apiConstantProvider$delegate;
    private final g applicationInformationProvider$delegate;
    private final g deviceInformationProvider$delegate;
    private final String email;
    private final g localeProvider$delegate;
    private final g log$delegate;
    private final g loggedInUpdaterService$delegate;
    private final g needCode2FASensitiveActionFactory$delegate;
    private final g needPhoneNumberSensitiveActionStateFactory$delegate;
    private final g networkExceptionChecker$delegate;
    private final Server server;
    private final g sessionVerifier$delegate;
    private final g verifiedSensitiveActionStateFactory$delegate;

    public NeedMailResultSensitiveActionStateImpl(String email, Server server) {
        u.j(email, "email");
        u.j(server, "server");
        this.email = email;
        this.server = server;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f76136a;
        this.needPhoneNumberSensitiveActionStateFactory$delegate = h.a(lazyThreadSafetyMode, new NeedMailResultSensitiveActionStateImpl$special$$inlined$inject$default$1(this, null, null));
        this.needCode2FASensitiveActionFactory$delegate = h.a(lazyThreadSafetyMode, new NeedMailResultSensitiveActionStateImpl$special$$inlined$inject$default$2(this, null, null));
        this.verifiedSensitiveActionStateFactory$delegate = h.a(lazyThreadSafetyMode, new NeedMailResultSensitiveActionStateImpl$special$$inlined$inject$default$3(this, null, null));
        this.accountApi$delegate = h.a(lazyThreadSafetyMode, new NeedMailResultSensitiveActionStateImpl$special$$inlined$inject$default$4(this, null, null));
        this.deviceInformationProvider$delegate = h.a(lazyThreadSafetyMode, new NeedMailResultSensitiveActionStateImpl$special$$inlined$inject$default$5(this, null, null));
        this.applicationInformationProvider$delegate = h.a(lazyThreadSafetyMode, new NeedMailResultSensitiveActionStateImpl$special$$inlined$inject$default$6(this, null, null));
        this.apiConstantProvider$delegate = h.a(lazyThreadSafetyMode, new NeedMailResultSensitiveActionStateImpl$special$$inlined$inject$default$7(this, null, null));
        this.networkExceptionChecker$delegate = h.a(lazyThreadSafetyMode, new NeedMailResultSensitiveActionStateImpl$special$$inlined$inject$default$8(this, null, null));
        this.log$delegate = KoinKt.injectLogger(this, "NeedMailResult");
        this.localeProvider$delegate = h.a(lazyThreadSafetyMode, new NeedMailResultSensitiveActionStateImpl$special$$inlined$inject$default$9(this, null, null));
        this.sessionVerifier$delegate = h.a(lazyThreadSafetyMode, new NeedMailResultSensitiveActionStateImpl$special$$inlined$inject$default$10(this, null, null));
        this.loggedInUpdaterService$delegate = h.a(lazyThreadSafetyMode, new NeedMailResultSensitiveActionStateImpl$special$$inlined$inject$default$11(this, null, null));
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

    private final DeviceInformationProvider getDeviceInformationProvider() {
        return (DeviceInformationProvider) this.deviceInformationProvider$delegate.getValue();
    }

    private final LocaleProvider getLocaleProvider() {
        return (LocaleProvider) this.localeProvider$delegate.getValue();
    }

    private final e getLog() {
        return (e) this.log$delegate.getValue();
    }

    private final LoggedInUpdaterService getLoggedInUpdaterService() {
        return (LoggedInUpdaterService) this.loggedInUpdaterService$delegate.getValue();
    }

    private final NeedCode2FASensitiveActionFactory getNeedCode2FASensitiveActionFactory() {
        return (NeedCode2FASensitiveActionFactory) this.needCode2FASensitiveActionFactory$delegate.getValue();
    }

    private final NeedPhoneNumberSensitiveActionStateFactory getNeedPhoneNumberSensitiveActionStateFactory() {
        return (NeedPhoneNumberSensitiveActionStateFactory) this.needPhoneNumberSensitiveActionStateFactory$delegate.getValue();
    }

    private final NetworkExceptionChecker getNetworkExceptionChecker() {
        return (NetworkExceptionChecker) this.networkExceptionChecker$delegate.getValue();
    }

    private final SessionVerifier getSessionVerifier() {
        return (SessionVerifier) this.sessionVerifier$delegate.getValue();
    }

    private final VerifiedSensitiveActionStateFactory getVerifiedSensitiveActionStateFactory() {
        return (VerifiedSensitiveActionStateFactory) this.verifiedSensitiveActionStateFactory$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object toOutputState(com.withings.library.authentication.login.session.verify.SessionVerifierResult r5, qm0.d<? super com.withings.library.authentication.sensitiveaction.state.NeedMailResultSensitiveActionState.OutputState> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.withings.library.authentication.sensitiveaction.impl.NeedMailResultSensitiveActionStateImpl$toOutputState$1
            if (r0 == 0) goto L13
            r0 = r6
            com.withings.library.authentication.sensitiveaction.impl.NeedMailResultSensitiveActionStateImpl$toOutputState$1 r0 = (com.withings.library.authentication.sensitiveaction.impl.NeedMailResultSensitiveActionStateImpl$toOutputState$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.library.authentication.sensitiveaction.impl.NeedMailResultSensitiveActionStateImpl$toOutputState$1 r0 = new com.withings.library.authentication.sensitiveaction.impl.NeedMailResultSensitiveActionStateImpl$toOutputState$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.L$1
            com.withings.library.authentication.login.session.verify.SessionVerifierResult r5 = (com.withings.library.authentication.login.session.verify.SessionVerifierResult) r5
            java.lang.Object r0 = r0.L$0
            com.withings.library.authentication.sensitiveaction.impl.NeedMailResultSensitiveActionStateImpl r0 = (com.withings.library.authentication.sensitiveaction.impl.NeedMailResultSensitiveActionStateImpl) r0
            nm0.l.b(r6)
            goto L89
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            nm0.l.b(r6)
            boolean r6 = r5 instanceof com.withings.library.authentication.login.session.verify.SessionVerifierResult.Need2FACode
            if (r6 == 0) goto L59
            com.withings.library.authentication.sensitiveaction.state.NeedMailResultSensitiveActionState$OutputState$SuccessNeedCode2FA r6 = new com.withings.library.authentication.sensitiveaction.state.NeedMailResultSensitiveActionState$OutputState$SuccessNeedCode2FA
            com.withings.library.authentication.sensitiveaction.factory.NeedCode2FASensitiveActionFactory r0 = r4.getNeedCode2FASensitiveActionFactory()
            r1 = r5
            com.withings.library.authentication.login.session.verify.SessionVerifierResult$Need2FACode r1 = (com.withings.library.authentication.login.session.verify.SessionVerifierResult.Need2FACode) r1
            java.lang.String r1 = r1.getPhoneNumber()
            com.withings.library.authentication.login.Session r5 = r5.getSession()
            com.withings.library.authentication.sensitiveaction.state.Sequence$Verification r2 = com.withings.library.authentication.sensitiveaction.state.Sequence.Verification.INSTANCE
            com.withings.library.authentication.sensitiveaction.state.NeedCode2FASensitiveAction r5 = r0.build(r1, r5, r2)
            r6.<init>(r5)
            goto L9a
        L59:
            boolean r6 = r5 instanceof com.withings.library.authentication.login.session.verify.SessionVerifierResult.NeedPhoneNumber
            if (r6 == 0) goto L6f
            com.withings.library.authentication.sensitiveaction.state.NeedMailResultSensitiveActionState$OutputState$SuccessNeedPhoneNumber r6 = new com.withings.library.authentication.sensitiveaction.state.NeedMailResultSensitiveActionState$OutputState$SuccessNeedPhoneNumber
            com.withings.library.authentication.sensitiveaction.factory.NeedPhoneNumberSensitiveActionStateFactory r0 = r4.getNeedPhoneNumberSensitiveActionStateFactory()
            com.withings.library.authentication.login.Session r5 = r5.getSession()
            com.withings.library.authentication.sensitiveaction.state.NeedPhoneNumberSensitiveActionState r5 = r0.build(r5)
            r6.<init>(r5)
            goto L9a
        L6f:
            boolean r6 = r5 instanceof com.withings.library.authentication.login.session.verify.SessionVerifierResult.Success
            if (r6 == 0) goto L9b
            com.withings.library.authentication.login.state.update.LoggedInUpdaterService r6 = r4.getLoggedInUpdaterService()
            com.withings.library.authentication.login.Session r2 = r5.getSession()
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r6 = r6.updateLoggedInWithSession(r2, r0)
            if (r6 != r1) goto L88
            return r1
        L88:
            r0 = r4
        L89:
            com.withings.library.authentication.sensitiveaction.state.NeedMailResultSensitiveActionState$OutputState$SuccessVerified r6 = new com.withings.library.authentication.sensitiveaction.state.NeedMailResultSensitiveActionState$OutputState$SuccessVerified
            com.withings.library.authentication.sensitiveaction.factory.VerifiedSensitiveActionStateFactory r0 = r0.getVerifiedSensitiveActionStateFactory()
            com.withings.library.authentication.login.Session r5 = r5.getSession()
            com.withings.library.authentication.sensitiveaction.state.VerifiedSensitiveActionState r5 = r0.build(r5)
            r6.<init>(r5)
        L9a:
            return r6
        L9b:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.sensitiveaction.impl.NeedMailResultSensitiveActionStateImpl.toOutputState(com.withings.library.authentication.login.session.verify.SessionVerifierResult, qm0.d):java.lang.Object");
    }

    @Override // com.withings.library.authentication.sensitiveaction.state.NeedMailResultSensitiveActionState
    public String getEmail() {
        return this.email;
    }

    @Override // pq0.a
    public oq0.a getKoin() {
        return qq0.a.f93676a.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0138  */
    @Override // com.withings.library.authentication.sensitiveaction.state.NeedMailResultSensitiveActionState
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object injectCode(java.lang.String r22, qm0.d<? super com.withings.library.authentication.sensitiveaction.state.NeedMailResultSensitiveActionState.OutputState> r23) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.sensitiveaction.impl.NeedMailResultSensitiveActionStateImpl.injectCode(java.lang.String, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0107 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0133  */
    @Override // com.withings.library.authentication.sensitiveaction.state.NeedMailResultSensitiveActionState
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object injectJWTToken(java.lang.String r21, qm0.d<? super com.withings.library.authentication.sensitiveaction.state.NeedMailResultSensitiveActionState.OutputState> r22) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.sensitiveaction.impl.NeedMailResultSensitiveActionStateImpl.injectJWTToken(java.lang.String, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0088  */
    @Override // com.withings.library.authentication.sensitiveaction.state.NeedMailResultSensitiveActionState
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object resendMail(qm0.d<? super com.withings.library.authentication.sensitiveaction.state.NeedMailResultSensitiveActionState.ResendMailOutputState> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.withings.library.authentication.sensitiveaction.impl.NeedMailResultSensitiveActionStateImpl$resendMail$1
            if (r0 == 0) goto L14
            r0 = r9
            com.withings.library.authentication.sensitiveaction.impl.NeedMailResultSensitiveActionStateImpl$resendMail$1 r0 = (com.withings.library.authentication.sensitiveaction.impl.NeedMailResultSensitiveActionStateImpl$resendMail$1) r0
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
            com.withings.library.authentication.sensitiveaction.impl.NeedMailResultSensitiveActionStateImpl$resendMail$1 r0 = new com.withings.library.authentication.sensitiveaction.impl.NeedMailResultSensitiveActionStateImpl$resendMail$1
            r0.<init>(r8, r9)
            goto L12
        L1a:
            java.lang.Object r9 = r6.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r6.label
            java.lang.String r7 = "Exception during resend of mail"
            r2 = 1
            if (r1 == 0) goto L3b
            if (r1 != r2) goto L33
            java.lang.Object r0 = r6.L$0
            com.withings.library.authentication.sensitiveaction.impl.NeedMailResultSensitiveActionStateImpl r0 = (com.withings.library.authentication.sensitiveaction.impl.NeedMailResultSensitiveActionStateImpl) r0
            nm0.l.b(r9)     // Catch: java.lang.Exception -> L2f com.withings.library.authentication.api.error.WrongStatusException -> L31
            goto L63
        L2f:
            r9 = move-exception
            goto L6f
        L31:
            r9 = move-exception
            goto L95
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3b:
            nm0.l.b(r9)
            com.withings.library.authentication.utils.ShortCodeCreator$Companion r9 = com.withings.library.authentication.utils.ShortCodeCreator.Companion
            java.lang.String r4 = r9.createShortCode()
            com.withings.library.authentication.api.account.AccountApi r1 = r8.getAccountApi()     // Catch: java.lang.Exception -> L69 com.withings.library.authentication.api.error.WrongStatusException -> L6c
            java.lang.String r9 = r8.getEmail()     // Catch: java.lang.Exception -> L69 com.withings.library.authentication.api.error.WrongStatusException -> L6c
            com.withings.library.authentication.utils.locale.LocaleProvider r3 = r8.getLocaleProvider()     // Catch: java.lang.Exception -> L69 com.withings.library.authentication.api.error.WrongStatusException -> L6c
            java.lang.String r3 = r3.getLang()     // Catch: java.lang.Exception -> L69 com.withings.library.authentication.api.error.WrongStatusException -> L6c
            com.withings.library.authentication.login.Server r5 = r8.server     // Catch: java.lang.Exception -> L69 com.withings.library.authentication.api.error.WrongStatusException -> L6c
            r6.L$0 = r8     // Catch: java.lang.Exception -> L69 com.withings.library.authentication.api.error.WrongStatusException -> L6c
            r6.label = r2     // Catch: java.lang.Exception -> L69 com.withings.library.authentication.api.error.WrongStatusException -> L6c
            r2 = r9
            java.lang.Object r9 = r1.sendShortCode(r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L69 com.withings.library.authentication.api.error.WrongStatusException -> L6c
            if (r9 != r0) goto L62
            return r0
        L62:
            r0 = r8
        L63:
            com.withings.library.authentication.sensitiveaction.state.NeedMailResultSensitiveActionState$ResendMailOutputState$SuccessResendMail r9 = new com.withings.library.authentication.sensitiveaction.state.NeedMailResultSensitiveActionState$ResendMailOutputState$SuccessResendMail     // Catch: java.lang.Exception -> L2f com.withings.library.authentication.api.error.WrongStatusException -> L31
            r9.<init>(r0)     // Catch: java.lang.Exception -> L2f com.withings.library.authentication.api.error.WrongStatusException -> L31
            goto La6
        L69:
            r9 = move-exception
            r0 = r8
            goto L6f
        L6c:
            r9 = move-exception
            r0 = r8
            goto L95
        L6f:
            com.withings.library.authentication.api.error.NetworkExceptionChecker r1 = r0.getNetworkExceptionChecker()
            boolean r1 = r1.isNetworkException(r9)
            if (r1 == 0) goto L88
            v9.e r9 = r0.getLog()
            java.lang.String r1 = "Network error during  resend of mail"
            r9.a(r1)
            com.withings.library.authentication.sensitiveaction.state.NeedMailResultSensitiveActionState$ResendMailOutputState$NetworkError r9 = new com.withings.library.authentication.sensitiveaction.state.NeedMailResultSensitiveActionState$ResendMailOutputState$NetworkError
            r9.<init>(r0)
            goto La6
        L88:
            v9.e r1 = r0.getLog()
            r1.b(r7, r9)
            com.withings.library.authentication.sensitiveaction.state.NeedMailResultSensitiveActionState$ResendMailOutputState$GenericError r9 = new com.withings.library.authentication.sensitiveaction.state.NeedMailResultSensitiveActionState$ResendMailOutputState$GenericError
            r9.<init>(r0)
            goto La6
        L95:
            v9.e r1 = r0.getLog()
            r1.b(r7, r9)
            com.withings.library.authentication.sensitiveaction.state.NeedMailResultSensitiveActionState$ResendMailOutputState$WithingsError r1 = new com.withings.library.authentication.sensitiveaction.state.NeedMailResultSensitiveActionState$ResendMailOutputState$WithingsError
            int r9 = r9.getStatus()
            r1.<init>(r0, r9)
            r9 = r1
        La6:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.sensitiveaction.impl.NeedMailResultSensitiveActionStateImpl.resendMail(qm0.d):java.lang.Object");
    }
}
