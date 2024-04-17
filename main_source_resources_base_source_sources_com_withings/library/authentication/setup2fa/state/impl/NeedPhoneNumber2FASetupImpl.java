package com.withings.library.authentication.setup2fa.state.impl;

import com.withings.library.authentication.api.account.AccountApi;
import com.withings.library.authentication.api.error.NetworkExceptionChecker;
import com.withings.library.authentication.di.KoinKt;
import com.withings.library.authentication.setup2fa.state.NeedPhoneNumber2FASetup;
import com.withings.library.authentication.setup2fa.state.factory.NeedCode2FASetupFactory;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
import org.jivesoftware.smack.packet.Session;
import pq0.a;
import v9.e;
/* compiled from: NeedPhoneNumber2FASetupImpl.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b \u0010!J\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\r\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/impl/NeedPhoneNumber2FASetupImpl;", "Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup;", "Lpq0/a;", "", "phoneNumber", "Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup$OutputState;", "registerPhoneNumber", "(Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/authentication/login/Session;", Session.ELEMENT, "Lcom/withings/library/authentication/login/Session;", "Lcom/withings/library/authentication/api/account/AccountApi;", "accountApi$delegate", "Lnm0/g;", "getAccountApi", "()Lcom/withings/library/authentication/api/account/AccountApi;", "accountApi", "Lcom/withings/library/authentication/api/error/NetworkExceptionChecker;", "networkExceptionChecker$delegate", "getNetworkExceptionChecker", "()Lcom/withings/library/authentication/api/error/NetworkExceptionChecker;", "networkExceptionChecker", "Lv9/e;", "log$delegate", "getLog", "()Lv9/e;", "log", "Lcom/withings/library/authentication/setup2fa/state/factory/NeedCode2FASetupFactory;", "needCode2FASetupFactory$delegate", "getNeedCode2FASetupFactory", "()Lcom/withings/library/authentication/setup2fa/state/factory/NeedCode2FASetupFactory;", "needCode2FASetupFactory", "<init>", "(Lcom/withings/library/authentication/login/Session;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class NeedPhoneNumber2FASetupImpl implements NeedPhoneNumber2FASetup, a {
    private final g accountApi$delegate;
    private final g log$delegate;
    private final g needCode2FASetupFactory$delegate;
    private final g networkExceptionChecker$delegate;
    private final com.withings.library.authentication.login.Session session;

    public NeedPhoneNumber2FASetupImpl(com.withings.library.authentication.login.Session session) {
        u.j(session, "session");
        this.session = session;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f76136a;
        this.accountApi$delegate = h.a(lazyThreadSafetyMode, new NeedPhoneNumber2FASetupImpl$special$$inlined$inject$default$1(this, null, null));
        this.networkExceptionChecker$delegate = h.a(lazyThreadSafetyMode, new NeedPhoneNumber2FASetupImpl$special$$inlined$inject$default$2(this, null, null));
        this.log$delegate = KoinKt.injectLogger(this, "LoggedIn");
        this.needCode2FASetupFactory$delegate = h.a(lazyThreadSafetyMode, new NeedPhoneNumber2FASetupImpl$special$$inlined$inject$default$3(this, null, null));
    }

    private final AccountApi getAccountApi() {
        return (AccountApi) this.accountApi$delegate.getValue();
    }

    private final e getLog() {
        return (e) this.log$delegate.getValue();
    }

    private final NeedCode2FASetupFactory getNeedCode2FASetupFactory() {
        return (NeedCode2FASetupFactory) this.needCode2FASetupFactory$delegate.getValue();
    }

    private final NetworkExceptionChecker getNetworkExceptionChecker() {
        return (NetworkExceptionChecker) this.networkExceptionChecker$delegate.getValue();
    }

    @Override // pq0.a
    public oq0.a getKoin() {
        return qq0.a.f93676a.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0098  */
    @Override // com.withings.library.authentication.setup2fa.state.NeedPhoneNumber2FASetup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object registerPhoneNumber(java.lang.String r7, qm0.d<? super com.withings.library.authentication.setup2fa.state.NeedPhoneNumber2FASetup.OutputState> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.withings.library.authentication.setup2fa.state.impl.NeedPhoneNumber2FASetupImpl$registerPhoneNumber$1
            if (r0 == 0) goto L13
            r0 = r8
            com.withings.library.authentication.setup2fa.state.impl.NeedPhoneNumber2FASetupImpl$registerPhoneNumber$1 r0 = (com.withings.library.authentication.setup2fa.state.impl.NeedPhoneNumber2FASetupImpl$registerPhoneNumber$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.library.authentication.setup2fa.state.impl.NeedPhoneNumber2FASetupImpl$registerPhoneNumber$1 r0 = new com.withings.library.authentication.setup2fa.state.impl.NeedPhoneNumber2FASetupImpl$registerPhoneNumber$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            java.lang.String r3 = "Exception during registering phone number process"
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 != r4) goto L39
            java.lang.Object r7 = r0.L$1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r0 = r0.L$0
            com.withings.library.authentication.setup2fa.state.impl.NeedPhoneNumber2FASetupImpl r0 = (com.withings.library.authentication.setup2fa.state.impl.NeedPhoneNumber2FASetupImpl) r0
            nm0.l.b(r8)     // Catch: java.lang.Exception -> L31 com.withings.library.authentication.api.error.WrongStatusException -> L33 com.withings.library.authentication.api.error.WrongStatusException.TooManyRequestException -> L36 com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> Lc9
            goto L62
        L31:
            r7 = move-exception
            goto L7e
        L33:
            r7 = move-exception
            goto La5
        L36:
            r7 = move-exception
            goto Lb6
        L39:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L41:
            nm0.l.b(r8)
            com.withings.library.authentication.api.account.AccountApi r8 = r6.getAccountApi()     // Catch: java.lang.Exception -> L73 com.withings.library.authentication.api.error.WrongStatusException -> L76 com.withings.library.authentication.api.error.WrongStatusException.TooManyRequestException -> L79 com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> L7c
            com.withings.library.authentication.login.Session r2 = r6.session     // Catch: java.lang.Exception -> L73 com.withings.library.authentication.api.error.WrongStatusException -> L76 com.withings.library.authentication.api.error.WrongStatusException.TooManyRequestException -> L79 com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> L7c
            java.lang.String r2 = r2.getSessionId()     // Catch: java.lang.Exception -> L73 com.withings.library.authentication.api.error.WrongStatusException -> L76 com.withings.library.authentication.api.error.WrongStatusException.TooManyRequestException -> L79 com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> L7c
            com.withings.library.authentication.login.Session r5 = r6.session     // Catch: java.lang.Exception -> L73 com.withings.library.authentication.api.error.WrongStatusException -> L76 com.withings.library.authentication.api.error.WrongStatusException.TooManyRequestException -> L79 com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> L7c
            com.withings.library.authentication.login.Server r5 = r5.getServer()     // Catch: java.lang.Exception -> L73 com.withings.library.authentication.api.error.WrongStatusException -> L76 com.withings.library.authentication.api.error.WrongStatusException.TooManyRequestException -> L79 com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> L7c
            r0.L$0 = r6     // Catch: java.lang.Exception -> L73 com.withings.library.authentication.api.error.WrongStatusException -> L76 com.withings.library.authentication.api.error.WrongStatusException.TooManyRequestException -> L79 com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> L7c
            r0.L$1 = r7     // Catch: java.lang.Exception -> L73 com.withings.library.authentication.api.error.WrongStatusException -> L76 com.withings.library.authentication.api.error.WrongStatusException.TooManyRequestException -> L79 com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> L7c
            r0.label = r4     // Catch: java.lang.Exception -> L73 com.withings.library.authentication.api.error.WrongStatusException -> L76 com.withings.library.authentication.api.error.WrongStatusException.TooManyRequestException -> L79 com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> L7c
            java.lang.Object r8 = r8.setupPhoneAndRequestConfirmationCode(r2, r7, r5, r0)     // Catch: java.lang.Exception -> L73 com.withings.library.authentication.api.error.WrongStatusException -> L76 com.withings.library.authentication.api.error.WrongStatusException.TooManyRequestException -> L79 com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> L7c
            if (r8 != r1) goto L61
            return r1
        L61:
            r0 = r6
        L62:
            com.withings.library.authentication.setup2fa.state.NeedPhoneNumber2FASetup$OutputState$SuccessNeedCode2FA r8 = new com.withings.library.authentication.setup2fa.state.NeedPhoneNumber2FASetup$OutputState$SuccessNeedCode2FA     // Catch: java.lang.Exception -> L31 com.withings.library.authentication.api.error.WrongStatusException -> L33 com.withings.library.authentication.api.error.WrongStatusException.TooManyRequestException -> L36 com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> Lc9
            com.withings.library.authentication.setup2fa.state.factory.NeedCode2FASetupFactory r1 = r0.getNeedCode2FASetupFactory()     // Catch: java.lang.Exception -> L31 com.withings.library.authentication.api.error.WrongStatusException -> L33 com.withings.library.authentication.api.error.WrongStatusException.TooManyRequestException -> L36 com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> Lc9
            com.withings.library.authentication.login.Session r2 = r0.session     // Catch: java.lang.Exception -> L31 com.withings.library.authentication.api.error.WrongStatusException -> L33 com.withings.library.authentication.api.error.WrongStatusException.TooManyRequestException -> L36 com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> Lc9
            com.withings.library.authentication.setup2fa.state.NeedCode2FASetup r7 = r1.build(r2, r7, r0)     // Catch: java.lang.Exception -> L31 com.withings.library.authentication.api.error.WrongStatusException -> L33 com.withings.library.authentication.api.error.WrongStatusException.TooManyRequestException -> L36 com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> Lc9
            r8.<init>(r7)     // Catch: java.lang.Exception -> L31 com.withings.library.authentication.api.error.WrongStatusException -> L33 com.withings.library.authentication.api.error.WrongStatusException.TooManyRequestException -> L36 com.withings.library.authentication.api.error.WrongStatusException.AuthTimeoutException -> Lc9
            goto Ld7
        L73:
            r7 = move-exception
            r0 = r6
            goto L7e
        L76:
            r7 = move-exception
            r0 = r6
            goto La5
        L79:
            r7 = move-exception
            r0 = r6
            goto Lb6
        L7c:
            r0 = r6
            goto Lc9
        L7e:
            com.withings.library.authentication.api.error.NetworkExceptionChecker r8 = r0.getNetworkExceptionChecker()
            boolean r8 = r8.isNetworkException(r7)
            if (r8 == 0) goto L98
            v9.e r7 = r0.getLog()
            java.lang.String r8 = "Network error detected during registering phone number process"
            r7.a(r8)
            com.withings.library.authentication.setup2fa.state.NeedPhoneNumber2FASetup$OutputState$NetworkError r7 = new com.withings.library.authentication.setup2fa.state.NeedPhoneNumber2FASetup$OutputState$NetworkError
            r7.<init>(r0)
        L96:
            r8 = r7
            goto Ld7
        L98:
            v9.e r8 = r0.getLog()
            r8.b(r3, r7)
            com.withings.library.authentication.setup2fa.state.NeedPhoneNumber2FASetup$OutputState$GenericError r7 = new com.withings.library.authentication.setup2fa.state.NeedPhoneNumber2FASetup$OutputState$GenericError
            r7.<init>(r0)
            goto L96
        La5:
            v9.e r8 = r0.getLog()
            r8.b(r3, r7)
            com.withings.library.authentication.setup2fa.state.NeedPhoneNumber2FASetup$OutputState$WithingsError r8 = new com.withings.library.authentication.setup2fa.state.NeedPhoneNumber2FASetup$OutputState$WithingsError
            int r7 = r7.getStatus()
            r8.<init>(r0, r7)
            goto Ld7
        Lb6:
            v9.e r8 = r0.getLog()
            java.lang.String r1 = "Too many request detected during registering phone process"
            r8.a(r1)
            com.withings.library.authentication.setup2fa.state.NeedPhoneNumber2FASetup$OutputState$TooManyRequest r8 = new com.withings.library.authentication.setup2fa.state.NeedPhoneNumber2FASetup$OutputState$TooManyRequest
            long r1 = r7.getNextAuthorizedRequestTimestamp()
            r8.<init>(r0, r1)
            goto Ld7
        Lc9:
            v9.e r7 = r0.getLog()
            java.lang.String r8 = "Auth timeout detected during registering phone process"
            r7.a(r8)
            com.withings.library.authentication.setup2fa.state.NeedPhoneNumber2FASetup$OutputState$SensitiveActionNeeded r8 = new com.withings.library.authentication.setup2fa.state.NeedPhoneNumber2FASetup$OutputState$SensitiveActionNeeded
            r8.<init>(r0)
        Ld7:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.setup2fa.state.impl.NeedPhoneNumber2FASetupImpl.registerPhoneNumber(java.lang.String, qm0.d):java.lang.Object");
    }
}
