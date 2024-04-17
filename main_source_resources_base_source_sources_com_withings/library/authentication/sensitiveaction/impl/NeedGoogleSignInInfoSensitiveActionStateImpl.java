package com.withings.library.authentication.sensitiveaction.impl;

import com.huawei.hms.support.feature.result.CommonConstant;
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
import com.withings.library.authentication.sensitiveaction.factory.NeedGoogleSignInInfoSensitiveActionStateFactory;
import com.withings.library.authentication.sensitiveaction.factory.NeedPhoneNumberSensitiveActionStateFactory;
import com.withings.library.authentication.sensitiveaction.factory.VerifiedSensitiveActionStateFactory;
import com.withings.library.authentication.sensitiveaction.state.NeedGoogleSignInInfoSensitiveActionState;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
import pq0.a;
import v9.e;
/* compiled from: NeedGoogleSignInInfoSensitiveActionStateImpl.kt */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\bP\u0010QJ\u0017\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u000bJ#\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000bR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0015\u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u0015\u001a\u0004\b*\u0010+R\u001b\u00101\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u0015\u001a\u0004\b/\u00100R\u001b\u00106\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\u0015\u001a\u0004\b4\u00105R\u001b\u0010;\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010\u0015\u001a\u0004\b9\u0010:R\u001b\u0010@\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010\u0015\u001a\u0004\b>\u0010?R\u001b\u0010E\u001a\u00020A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010\u0015\u001a\u0004\bC\u0010DR\u001b\u0010J\u001a\u00020F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010\u0015\u001a\u0004\bH\u0010IR\u001b\u0010O\u001a\u00020K8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010\u0015\u001a\u0004\bM\u0010N\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006R"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/impl/NeedGoogleSignInInfoSensitiveActionStateImpl;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState;", "Lpq0/a;", "Lcom/withings/library/authentication/login/session/verify/SessionVerifierResult;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState$InjectInfoOutputState;", "toOutputState", "(Lcom/withings/library/authentication/login/session/verify/SessionVerifierResult;Lqm0/d;)Ljava/lang/Object;", "", CommonConstant.KEY_ID_TOKEN, "clientId", "injectIdToken", "(Ljava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "injectProviderCodeWithIdToken", "providerCode", "injectProviderCodeWithProviderCode", "Lkotlin/Function0;", "Lcom/withings/library/authentication/login/Server;", "server", "Lym0/a;", "Lcom/withings/library/authentication/sensitiveaction/factory/NeedPhoneNumberSensitiveActionStateFactory;", "needPhoneNumberSensitiveActionStateFactory$delegate", "Lnm0/g;", "getNeedPhoneNumberSensitiveActionStateFactory", "()Lcom/withings/library/authentication/sensitiveaction/factory/NeedPhoneNumberSensitiveActionStateFactory;", "needPhoneNumberSensitiveActionStateFactory", "Lcom/withings/library/authentication/sensitiveaction/factory/NeedCode2FASensitiveActionFactory;", "needCode2FASensitiveActionFactory$delegate", "getNeedCode2FASensitiveActionFactory", "()Lcom/withings/library/authentication/sensitiveaction/factory/NeedCode2FASensitiveActionFactory;", "needCode2FASensitiveActionFactory", "Lcom/withings/library/authentication/sensitiveaction/factory/VerifiedSensitiveActionStateFactory;", "verifiedSensitiveActionStateFactory$delegate", "getVerifiedSensitiveActionStateFactory", "()Lcom/withings/library/authentication/sensitiveaction/factory/VerifiedSensitiveActionStateFactory;", "verifiedSensitiveActionStateFactory", "Lcom/withings/library/authentication/sensitiveaction/factory/NeedGoogleSignInInfoSensitiveActionStateFactory;", "needGoogleSignInInfoSensitiveActionStateFactory$delegate", "getNeedGoogleSignInInfoSensitiveActionStateFactory", "()Lcom/withings/library/authentication/sensitiveaction/factory/NeedGoogleSignInInfoSensitiveActionStateFactory;", "needGoogleSignInInfoSensitiveActionStateFactory", "Lcom/withings/library/authentication/api/account/AccountApi;", "accountApi$delegate", "getAccountApi", "()Lcom/withings/library/authentication/api/account/AccountApi;", "accountApi", "Lcom/withings/library/authentication/host/device/DeviceInformationProvider;", "deviceInformationProvider$delegate", "getDeviceInformationProvider", "()Lcom/withings/library/authentication/host/device/DeviceInformationProvider;", "deviceInformationProvider", "Lcom/withings/library/authentication/host/app/ApplicationInformationProvider;", "applicationInformationProvider$delegate", "getApplicationInformationProvider", "()Lcom/withings/library/authentication/host/app/ApplicationInformationProvider;", "applicationInformationProvider", "Lcom/withings/library/authentication/api/constant/ApiConstantProvider;", "apiConstantProvider$delegate", "getApiConstantProvider", "()Lcom/withings/library/authentication/api/constant/ApiConstantProvider;", "apiConstantProvider", "Lcom/withings/library/authentication/login/session/verify/SessionVerifier;", "sessionVerifier$delegate", "getSessionVerifier", "()Lcom/withings/library/authentication/login/session/verify/SessionVerifier;", "sessionVerifier", "Lcom/withings/library/authentication/api/error/NetworkExceptionChecker;", "networkExceptionChecker$delegate", "getNetworkExceptionChecker", "()Lcom/withings/library/authentication/api/error/NetworkExceptionChecker;", "networkExceptionChecker", "Lv9/e;", "log$delegate", "getLog", "()Lv9/e;", "log", "Lcom/withings/library/authentication/login/state/update/LoggedInUpdaterService;", "loggedInUpdaterService$delegate", "getLoggedInUpdaterService", "()Lcom/withings/library/authentication/login/state/update/LoggedInUpdaterService;", "loggedInUpdaterService", "<init>", "(Lym0/a;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class NeedGoogleSignInInfoSensitiveActionStateImpl implements NeedGoogleSignInInfoSensitiveActionState, a {
    private final g accountApi$delegate;
    private final g apiConstantProvider$delegate;
    private final g applicationInformationProvider$delegate;
    private final g deviceInformationProvider$delegate;
    private final g log$delegate;
    private final g loggedInUpdaterService$delegate;
    private final g needCode2FASensitiveActionFactory$delegate;
    private final g needGoogleSignInInfoSensitiveActionStateFactory$delegate;
    private final g needPhoneNumberSensitiveActionStateFactory$delegate;
    private final g networkExceptionChecker$delegate;
    private final ym0.a<Server> server;
    private final g sessionVerifier$delegate;
    private final g verifiedSensitiveActionStateFactory$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    public NeedGoogleSignInInfoSensitiveActionStateImpl(ym0.a<? extends Server> server) {
        u.j(server, "server");
        this.server = server;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f76136a;
        this.needPhoneNumberSensitiveActionStateFactory$delegate = h.a(lazyThreadSafetyMode, new NeedGoogleSignInInfoSensitiveActionStateImpl$special$$inlined$inject$default$1(this, null, null));
        this.needCode2FASensitiveActionFactory$delegate = h.a(lazyThreadSafetyMode, new NeedGoogleSignInInfoSensitiveActionStateImpl$special$$inlined$inject$default$2(this, null, null));
        this.verifiedSensitiveActionStateFactory$delegate = h.a(lazyThreadSafetyMode, new NeedGoogleSignInInfoSensitiveActionStateImpl$special$$inlined$inject$default$3(this, null, null));
        this.needGoogleSignInInfoSensitiveActionStateFactory$delegate = h.a(lazyThreadSafetyMode, new NeedGoogleSignInInfoSensitiveActionStateImpl$special$$inlined$inject$default$4(this, null, null));
        this.accountApi$delegate = h.a(lazyThreadSafetyMode, new NeedGoogleSignInInfoSensitiveActionStateImpl$special$$inlined$inject$default$5(this, null, null));
        this.deviceInformationProvider$delegate = h.a(lazyThreadSafetyMode, new NeedGoogleSignInInfoSensitiveActionStateImpl$special$$inlined$inject$default$6(this, null, null));
        this.applicationInformationProvider$delegate = h.a(lazyThreadSafetyMode, new NeedGoogleSignInInfoSensitiveActionStateImpl$special$$inlined$inject$default$7(this, null, null));
        this.apiConstantProvider$delegate = h.a(lazyThreadSafetyMode, new NeedGoogleSignInInfoSensitiveActionStateImpl$special$$inlined$inject$default$8(this, null, null));
        this.sessionVerifier$delegate = h.a(lazyThreadSafetyMode, new NeedGoogleSignInInfoSensitiveActionStateImpl$special$$inlined$inject$default$9(this, null, null));
        this.networkExceptionChecker$delegate = h.a(lazyThreadSafetyMode, new NeedGoogleSignInInfoSensitiveActionStateImpl$special$$inlined$inject$default$10(this, null, null));
        this.log$delegate = KoinKt.injectLogger(this, "NeedGoogleSignInInfoSensitiveActionState");
        this.loggedInUpdaterService$delegate = h.a(lazyThreadSafetyMode, new NeedGoogleSignInInfoSensitiveActionStateImpl$special$$inlined$inject$default$11(this, null, null));
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

    private final e getLog() {
        return (e) this.log$delegate.getValue();
    }

    private final LoggedInUpdaterService getLoggedInUpdaterService() {
        return (LoggedInUpdaterService) this.loggedInUpdaterService$delegate.getValue();
    }

    private final NeedCode2FASensitiveActionFactory getNeedCode2FASensitiveActionFactory() {
        return (NeedCode2FASensitiveActionFactory) this.needCode2FASensitiveActionFactory$delegate.getValue();
    }

    private final NeedGoogleSignInInfoSensitiveActionStateFactory getNeedGoogleSignInInfoSensitiveActionStateFactory() {
        return (NeedGoogleSignInInfoSensitiveActionStateFactory) this.needGoogleSignInInfoSensitiveActionStateFactory$delegate.getValue();
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
    public final java.lang.Object toOutputState(com.withings.library.authentication.login.session.verify.SessionVerifierResult r5, qm0.d<? super com.withings.library.authentication.sensitiveaction.state.NeedGoogleSignInInfoSensitiveActionState.InjectInfoOutputState> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.withings.library.authentication.sensitiveaction.impl.NeedGoogleSignInInfoSensitiveActionStateImpl$toOutputState$1
            if (r0 == 0) goto L13
            r0 = r6
            com.withings.library.authentication.sensitiveaction.impl.NeedGoogleSignInInfoSensitiveActionStateImpl$toOutputState$1 r0 = (com.withings.library.authentication.sensitiveaction.impl.NeedGoogleSignInInfoSensitiveActionStateImpl$toOutputState$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.library.authentication.sensitiveaction.impl.NeedGoogleSignInInfoSensitiveActionStateImpl$toOutputState$1 r0 = new com.withings.library.authentication.sensitiveaction.impl.NeedGoogleSignInInfoSensitiveActionStateImpl$toOutputState$1
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
            com.withings.library.authentication.sensitiveaction.impl.NeedGoogleSignInInfoSensitiveActionStateImpl r0 = (com.withings.library.authentication.sensitiveaction.impl.NeedGoogleSignInInfoSensitiveActionStateImpl) r0
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
            com.withings.library.authentication.sensitiveaction.state.NeedGoogleSignInInfoSensitiveActionState$InjectInfoOutputState$SuccessNeedCode2FA r6 = new com.withings.library.authentication.sensitiveaction.state.NeedGoogleSignInInfoSensitiveActionState$InjectInfoOutputState$SuccessNeedCode2FA
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
            com.withings.library.authentication.sensitiveaction.state.NeedGoogleSignInInfoSensitiveActionState$InjectInfoOutputState$SuccessNeedPhoneNumber r6 = new com.withings.library.authentication.sensitiveaction.state.NeedGoogleSignInInfoSensitiveActionState$InjectInfoOutputState$SuccessNeedPhoneNumber
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
            com.withings.library.authentication.sensitiveaction.state.NeedGoogleSignInInfoSensitiveActionState$InjectInfoOutputState$SuccessVerified r6 = new com.withings.library.authentication.sensitiveaction.state.NeedGoogleSignInInfoSensitiveActionState$InjectInfoOutputState$SuccessVerified
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
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.sensitiveaction.impl.NeedGoogleSignInInfoSensitiveActionStateImpl.toOutputState(com.withings.library.authentication.login.session.verify.SessionVerifierResult, qm0.d):java.lang.Object");
    }

    @Override // pq0.a
    public oq0.a getKoin() {
        return qq0.a.f93676a.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d9 A[RETURN] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.withings.library.authentication.sensitiveaction.impl.NeedGoogleSignInInfoSensitiveActionStateImpl, com.withings.library.authentication.sensitiveaction.state.NeedGoogleSignInInfoSensitiveActionState] */
    /* JADX WARN: Type inference failed for: r5v7, types: [com.withings.library.authentication.sensitiveaction.impl.NeedGoogleSignInInfoSensitiveActionStateImpl, com.withings.library.authentication.sensitiveaction.state.NeedGoogleSignInInfoSensitiveActionState] */
    /* JADX WARN: Type inference failed for: r5v8, types: [com.withings.library.authentication.sensitiveaction.impl.NeedGoogleSignInInfoSensitiveActionStateImpl, com.withings.library.authentication.sensitiveaction.state.NeedGoogleSignInInfoSensitiveActionState] */
    /* JADX WARN: Type inference failed for: r5v9, types: [com.withings.library.authentication.sensitiveaction.impl.NeedGoogleSignInInfoSensitiveActionStateImpl] */
    @Override // com.withings.library.authentication.sensitiveaction.state.NeedGoogleSignInInfoSensitiveActionState
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object injectIdToken(java.lang.String r25, java.lang.String r26, qm0.d<? super com.withings.library.authentication.sensitiveaction.state.NeedGoogleSignInInfoSensitiveActionState.InjectInfoOutputState> r27) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.sensitiveaction.impl.NeedGoogleSignInInfoSensitiveActionStateImpl.injectIdToken(java.lang.String, java.lang.String, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d9 A[RETURN] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.withings.library.authentication.sensitiveaction.impl.NeedGoogleSignInInfoSensitiveActionStateImpl, com.withings.library.authentication.sensitiveaction.state.NeedGoogleSignInInfoSensitiveActionState] */
    /* JADX WARN: Type inference failed for: r5v7, types: [com.withings.library.authentication.sensitiveaction.impl.NeedGoogleSignInInfoSensitiveActionStateImpl, com.withings.library.authentication.sensitiveaction.state.NeedGoogleSignInInfoSensitiveActionState] */
    /* JADX WARN: Type inference failed for: r5v8, types: [com.withings.library.authentication.sensitiveaction.impl.NeedGoogleSignInInfoSensitiveActionStateImpl, com.withings.library.authentication.sensitiveaction.state.NeedGoogleSignInInfoSensitiveActionState] */
    /* JADX WARN: Type inference failed for: r5v9, types: [com.withings.library.authentication.sensitiveaction.impl.NeedGoogleSignInInfoSensitiveActionStateImpl] */
    @Override // com.withings.library.authentication.sensitiveaction.state.NeedGoogleSignInInfoSensitiveActionState
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object injectProviderCodeWithIdToken(java.lang.String r25, java.lang.String r26, qm0.d<? super com.withings.library.authentication.sensitiveaction.state.NeedGoogleSignInInfoSensitiveActionState.InjectInfoOutputState> r27) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.sensitiveaction.impl.NeedGoogleSignInInfoSensitiveActionStateImpl.injectProviderCodeWithIdToken(java.lang.String, java.lang.String, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d9 A[RETURN] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.withings.library.authentication.sensitiveaction.impl.NeedGoogleSignInInfoSensitiveActionStateImpl, com.withings.library.authentication.sensitiveaction.state.NeedGoogleSignInInfoSensitiveActionState] */
    /* JADX WARN: Type inference failed for: r5v7, types: [com.withings.library.authentication.sensitiveaction.impl.NeedGoogleSignInInfoSensitiveActionStateImpl, com.withings.library.authentication.sensitiveaction.state.NeedGoogleSignInInfoSensitiveActionState] */
    /* JADX WARN: Type inference failed for: r5v8, types: [com.withings.library.authentication.sensitiveaction.impl.NeedGoogleSignInInfoSensitiveActionStateImpl, com.withings.library.authentication.sensitiveaction.state.NeedGoogleSignInInfoSensitiveActionState] */
    /* JADX WARN: Type inference failed for: r5v9, types: [com.withings.library.authentication.sensitiveaction.impl.NeedGoogleSignInInfoSensitiveActionStateImpl] */
    @Override // com.withings.library.authentication.sensitiveaction.state.NeedGoogleSignInInfoSensitiveActionState
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object injectProviderCodeWithProviderCode(java.lang.String r25, java.lang.String r26, qm0.d<? super com.withings.library.authentication.sensitiveaction.state.NeedGoogleSignInInfoSensitiveActionState.InjectInfoOutputState> r27) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.sensitiveaction.impl.NeedGoogleSignInInfoSensitiveActionStateImpl.injectProviderCodeWithProviderCode(java.lang.String, java.lang.String, qm0.d):java.lang.Object");
    }
}
