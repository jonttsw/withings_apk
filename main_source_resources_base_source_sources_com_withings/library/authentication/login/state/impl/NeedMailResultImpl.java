package com.withings.library.authentication.login.state.impl;

import com.withings.library.authentication.api.account.AccountApi;
import com.withings.library.authentication.api.constant.ApiConstantProvider;
import com.withings.library.authentication.api.error.NetworkExceptionChecker;
import com.withings.library.authentication.di.KoinKt;
import com.withings.library.authentication.host.app.ApplicationInformationProvider;
import com.withings.library.authentication.host.device.DeviceInformationProvider;
import com.withings.library.authentication.login.Server;
import com.withings.library.authentication.login.session.verify.SessionVerifier;
import com.withings.library.authentication.login.session.verify.SessionVerifierResult;
import com.withings.library.authentication.login.state.AuthenticationState;
import com.withings.library.authentication.login.state.NeedMailResult;
import com.withings.library.authentication.login.state.Sequence;
import com.withings.library.authentication.login.state.factory.LoggedInFactory;
import com.withings.library.authentication.login.state.factory.NeedAccountCreationFactory;
import com.withings.library.authentication.login.state.factory.NeedCode2FAFactory;
import com.withings.library.authentication.login.state.factory.NeedPhoneNumber2FACreationFactory;
import com.withings.library.authentication.utils.locale.LocaleProvider;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;
import pq0.a;
import v9.e;
/* compiled from: NeedMailResultImpl.kt */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\bV\u0010WJ\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000bJ\u0013\u0010\u000f\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u001b\u001a\u0004\b+\u0010,R\u001b\u00102\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u001b\u001a\u0004\b0\u00101R\u001b\u00107\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\u001b\u001a\u0004\b5\u00106R\u001b\u0010<\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010\u001b\u001a\u0004\b:\u0010;R\u001b\u0010A\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010\u001b\u001a\u0004\b?\u0010@R\u001b\u0010F\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010\u001b\u001a\u0004\bD\u0010ER\u001b\u0010K\u001a\u00020G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010\u001b\u001a\u0004\bI\u0010JR\u001b\u0010P\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010\u001b\u001a\u0004\bN\u0010OR\u001b\u0010U\u001a\u00020Q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010\u001b\u001a\u0004\bS\u0010T\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006X"}, d2 = {"Lcom/withings/library/authentication/login/state/impl/NeedMailResultImpl;", "Lcom/withings/library/authentication/login/state/NeedMailResult;", "Lpq0/a;", "Lcom/withings/library/authentication/login/session/verify/SessionVerifierResult;", "Lcom/withings/library/authentication/login/state/AuthenticationState;", "toAuthenticationState", "(Lcom/withings/library/authentication/login/session/verify/SessionVerifierResult;)Lcom/withings/library/authentication/login/state/AuthenticationState;", "", XHTMLText.CODE, "Lcom/withings/library/authentication/login/state/NeedMailResult$OutputState;", "injectCode", "(Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "jwtToken", "injectJWTToken", "Lcom/withings/library/authentication/login/state/NeedMailResult$ResendMailOutputState;", "resendMail", "(Lqm0/d;)Ljava/lang/Object;", "email", "Ljava/lang/String;", "shortCode", "getShortCode", "()Ljava/lang/String;", "Lcom/withings/library/authentication/login/Server;", "server", "Lcom/withings/library/authentication/login/Server;", "Lcom/withings/library/authentication/api/account/AccountApi;", "accountApi$delegate", "Lnm0/g;", "getAccountApi", "()Lcom/withings/library/authentication/api/account/AccountApi;", "accountApi", "Lcom/withings/library/authentication/host/device/DeviceInformationProvider;", "deviceInformationProvider$delegate", "getDeviceInformationProvider", "()Lcom/withings/library/authentication/host/device/DeviceInformationProvider;", "deviceInformationProvider", "Lcom/withings/library/authentication/host/app/ApplicationInformationProvider;", "applicationInformationProvider$delegate", "getApplicationInformationProvider", "()Lcom/withings/library/authentication/host/app/ApplicationInformationProvider;", "applicationInformationProvider", "Lcom/withings/library/authentication/api/constant/ApiConstantProvider;", "apiConstantProvider$delegate", "getApiConstantProvider", "()Lcom/withings/library/authentication/api/constant/ApiConstantProvider;", "apiConstantProvider", "Lcom/withings/library/authentication/login/session/verify/SessionVerifier;", "sessionVerifier$delegate", "getSessionVerifier", "()Lcom/withings/library/authentication/login/session/verify/SessionVerifier;", "sessionVerifier", "Lcom/withings/library/authentication/api/error/NetworkExceptionChecker;", "networkExceptionChecker$delegate", "getNetworkExceptionChecker", "()Lcom/withings/library/authentication/api/error/NetworkExceptionChecker;", "networkExceptionChecker", "Lcom/withings/library/authentication/login/state/factory/NeedAccountCreationFactory;", "needAccountCreationFactory$delegate", "getNeedAccountCreationFactory", "()Lcom/withings/library/authentication/login/state/factory/NeedAccountCreationFactory;", "needAccountCreationFactory", "Lv9/e;", "log$delegate", "getLog", "()Lv9/e;", "log", "Lcom/withings/library/authentication/utils/locale/LocaleProvider;", "localeProvider$delegate", "getLocaleProvider", "()Lcom/withings/library/authentication/utils/locale/LocaleProvider;", "localeProvider", "Lcom/withings/library/authentication/login/state/factory/NeedCode2FAFactory;", "needCode2FAFactory$delegate", "getNeedCode2FAFactory", "()Lcom/withings/library/authentication/login/state/factory/NeedCode2FAFactory;", "needCode2FAFactory", "Lcom/withings/library/authentication/login/state/factory/NeedPhoneNumber2FACreationFactory;", "needPhoneNumber2FACreationFactory$delegate", "getNeedPhoneNumber2FACreationFactory", "()Lcom/withings/library/authentication/login/state/factory/NeedPhoneNumber2FACreationFactory;", "needPhoneNumber2FACreationFactory", "Lcom/withings/library/authentication/login/state/factory/LoggedInFactory;", "loggedInFactory$delegate", "getLoggedInFactory", "()Lcom/withings/library/authentication/login/state/factory/LoggedInFactory;", "loggedInFactory", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withings/library/authentication/login/Server;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class NeedMailResultImpl implements NeedMailResult, a {
    private final g accountApi$delegate;
    private final g apiConstantProvider$delegate;
    private final g applicationInformationProvider$delegate;
    private final g deviceInformationProvider$delegate;
    private final String email;
    private final g localeProvider$delegate;
    private final g log$delegate;
    private final g loggedInFactory$delegate;
    private final g needAccountCreationFactory$delegate;
    private final g needCode2FAFactory$delegate;
    private final g needPhoneNumber2FACreationFactory$delegate;
    private final g networkExceptionChecker$delegate;
    private final Server server;
    private final g sessionVerifier$delegate;
    private final String shortCode;

    public NeedMailResultImpl(String email, String shortCode, Server server) {
        u.j(email, "email");
        u.j(shortCode, "shortCode");
        u.j(server, "server");
        this.email = email;
        this.shortCode = shortCode;
        this.server = server;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f76136a;
        this.accountApi$delegate = h.a(lazyThreadSafetyMode, new NeedMailResultImpl$special$$inlined$inject$default$1(this, null, null));
        this.deviceInformationProvider$delegate = h.a(lazyThreadSafetyMode, new NeedMailResultImpl$special$$inlined$inject$default$2(this, null, null));
        this.applicationInformationProvider$delegate = h.a(lazyThreadSafetyMode, new NeedMailResultImpl$special$$inlined$inject$default$3(this, null, null));
        this.apiConstantProvider$delegate = h.a(lazyThreadSafetyMode, new NeedMailResultImpl$special$$inlined$inject$default$4(this, null, null));
        this.sessionVerifier$delegate = h.a(lazyThreadSafetyMode, new NeedMailResultImpl$special$$inlined$inject$default$5(this, null, null));
        this.networkExceptionChecker$delegate = h.a(lazyThreadSafetyMode, new NeedMailResultImpl$special$$inlined$inject$default$6(this, null, null));
        this.needAccountCreationFactory$delegate = h.a(lazyThreadSafetyMode, new NeedMailResultImpl$special$$inlined$inject$default$7(this, null, null));
        this.log$delegate = KoinKt.injectLogger(this, "NeedMailResult");
        this.localeProvider$delegate = h.a(lazyThreadSafetyMode, new NeedMailResultImpl$special$$inlined$inject$default$8(this, null, null));
        this.needCode2FAFactory$delegate = h.a(lazyThreadSafetyMode, new NeedMailResultImpl$special$$inlined$inject$default$9(this, null, null));
        this.needPhoneNumber2FACreationFactory$delegate = h.a(lazyThreadSafetyMode, new NeedMailResultImpl$special$$inlined$inject$default$10(this, null, null));
        this.loggedInFactory$delegate = h.a(lazyThreadSafetyMode, new NeedMailResultImpl$special$$inlined$inject$default$11(this, null, null));
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

    private final LoggedInFactory getLoggedInFactory() {
        return (LoggedInFactory) this.loggedInFactory$delegate.getValue();
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

    @Override // pq0.a
    public oq0.a getKoin() {
        return qq0.a.f93676a.a();
    }

    @Override // com.withings.library.authentication.login.state.NeedMailResult
    public String getShortCode() {
        return this.shortCode;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0115  */
    @Override // com.withings.library.authentication.login.state.NeedMailResult
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object injectCode(java.lang.String r20, qm0.d<? super com.withings.library.authentication.login.state.NeedMailResult.OutputState> r21) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.login.state.impl.NeedMailResultImpl.injectCode(java.lang.String, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0101  */
    @Override // com.withings.library.authentication.login.state.NeedMailResult
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object injectJWTToken(java.lang.String r19, qm0.d<? super com.withings.library.authentication.login.state.NeedMailResult.OutputState> r20) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.login.state.impl.NeedMailResultImpl.injectJWTToken(java.lang.String, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0086  */
    @Override // com.withings.library.authentication.login.state.NeedMailResult
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object resendMail(qm0.d<? super com.withings.library.authentication.login.state.NeedMailResult.ResendMailOutputState> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.withings.library.authentication.login.state.impl.NeedMailResultImpl$resendMail$1
            if (r0 == 0) goto L14
            r0 = r9
            com.withings.library.authentication.login.state.impl.NeedMailResultImpl$resendMail$1 r0 = (com.withings.library.authentication.login.state.impl.NeedMailResultImpl$resendMail$1) r0
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
            com.withings.library.authentication.login.state.impl.NeedMailResultImpl$resendMail$1 r0 = new com.withings.library.authentication.login.state.impl.NeedMailResultImpl$resendMail$1
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
            com.withings.library.authentication.login.state.impl.NeedMailResultImpl r0 = (com.withings.library.authentication.login.state.impl.NeedMailResultImpl) r0
            nm0.l.b(r9)     // Catch: java.lang.Exception -> L2f com.withings.library.authentication.api.error.WrongStatusException -> L31
            goto L61
        L2f:
            r9 = move-exception
            goto L6d
        L31:
            r9 = move-exception
            goto L93
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3b:
            nm0.l.b(r9)
            com.withings.library.authentication.utils.ShortCodeCreator$Companion r9 = com.withings.library.authentication.utils.ShortCodeCreator.Companion
            java.lang.String r4 = r9.createShortCode()
            com.withings.library.authentication.api.account.AccountApi r1 = r8.getAccountApi()     // Catch: java.lang.Exception -> L67 com.withings.library.authentication.api.error.WrongStatusException -> L6a
            java.lang.String r9 = r8.email     // Catch: java.lang.Exception -> L67 com.withings.library.authentication.api.error.WrongStatusException -> L6a
            com.withings.library.authentication.utils.locale.LocaleProvider r3 = r8.getLocaleProvider()     // Catch: java.lang.Exception -> L67 com.withings.library.authentication.api.error.WrongStatusException -> L6a
            java.lang.String r3 = r3.getLang()     // Catch: java.lang.Exception -> L67 com.withings.library.authentication.api.error.WrongStatusException -> L6a
            com.withings.library.authentication.login.Server r5 = r8.server     // Catch: java.lang.Exception -> L67 com.withings.library.authentication.api.error.WrongStatusException -> L6a
            r6.L$0 = r8     // Catch: java.lang.Exception -> L67 com.withings.library.authentication.api.error.WrongStatusException -> L6a
            r6.label = r2     // Catch: java.lang.Exception -> L67 com.withings.library.authentication.api.error.WrongStatusException -> L6a
            r2 = r9
            java.lang.Object r9 = r1.sendShortCode(r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L67 com.withings.library.authentication.api.error.WrongStatusException -> L6a
            if (r9 != r0) goto L60
            return r0
        L60:
            r0 = r8
        L61:
            com.withings.library.authentication.login.state.NeedMailResult$ResendMailOutputState$SuccessResendMail r9 = new com.withings.library.authentication.login.state.NeedMailResult$ResendMailOutputState$SuccessResendMail     // Catch: java.lang.Exception -> L2f com.withings.library.authentication.api.error.WrongStatusException -> L31
            r9.<init>(r0)     // Catch: java.lang.Exception -> L2f com.withings.library.authentication.api.error.WrongStatusException -> L31
            goto La4
        L67:
            r9 = move-exception
            r0 = r8
            goto L6d
        L6a:
            r9 = move-exception
            r0 = r8
            goto L93
        L6d:
            com.withings.library.authentication.api.error.NetworkExceptionChecker r1 = r0.getNetworkExceptionChecker()
            boolean r1 = r1.isNetworkException(r9)
            if (r1 == 0) goto L86
            v9.e r9 = r0.getLog()
            java.lang.String r1 = "Network error during  resend of mail"
            r9.a(r1)
            com.withings.library.authentication.login.state.NeedMailResult$ResendMailOutputState$NetworkError r9 = new com.withings.library.authentication.login.state.NeedMailResult$ResendMailOutputState$NetworkError
            r9.<init>(r0)
            goto La4
        L86:
            v9.e r1 = r0.getLog()
            r1.b(r7, r9)
            com.withings.library.authentication.login.state.NeedMailResult$ResendMailOutputState$GenericError r9 = new com.withings.library.authentication.login.state.NeedMailResult$ResendMailOutputState$GenericError
            r9.<init>(r0)
            goto La4
        L93:
            v9.e r1 = r0.getLog()
            r1.b(r7, r9)
            com.withings.library.authentication.login.state.NeedMailResult$ResendMailOutputState$WithingsError r1 = new com.withings.library.authentication.login.state.NeedMailResult$ResendMailOutputState$WithingsError
            int r9 = r9.getStatus()
            r1.<init>(r0, r9)
            r9 = r1
        La4:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.login.state.impl.NeedMailResultImpl.resendMail(qm0.d):java.lang.Object");
    }
}
