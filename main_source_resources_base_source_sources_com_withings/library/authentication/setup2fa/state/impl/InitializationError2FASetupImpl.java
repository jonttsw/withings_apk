package com.withings.library.authentication.setup2fa.state.impl;

import com.withings.library.authentication.api.account.AccountApi;
import com.withings.library.authentication.api.error.NetworkExceptionChecker;
import com.withings.library.authentication.di.KoinKt;
import com.withings.library.authentication.login.AuthenticationService;
import com.withings.library.authentication.setup2fa.state.InitializationError2FASetup;
import com.withings.library.authentication.setup2fa.state.factory.InitializationError2FASetupFactory;
import com.withings.library.authentication.setup2fa.state.factory.Registered2FASetupFactory;
import com.withings.library.authentication.setup2fa.state.factory.Unregistered2FASetupFactory;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
import pq0.a;
import v9.e;
/* compiled from: InitializationError2FASetupImpl.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b/\u00100J\u0013\u0010\u0004\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\r\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\r\u001a\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\r\u001a\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\r\u001a\u0004\b,\u0010-\u0082\u0002\u0004\n\u0002\b\u0019¨\u00061"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/impl/InitializationError2FASetupImpl;", "Lcom/withings/library/authentication/setup2fa/state/InitializationError2FASetup;", "Lpq0/a;", "Lcom/withings/library/authentication/setup2fa/state/InitializationError2FASetup$RetryOutputState;", "retryInitialization", "(Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/authentication/setup2fa/state/InitializationError2FASetup$ErrorType;", "errorType", "Lcom/withings/library/authentication/setup2fa/state/InitializationError2FASetup$ErrorType;", "getErrorType", "()Lcom/withings/library/authentication/setup2fa/state/InitializationError2FASetup$ErrorType;", "Lcom/withings/library/authentication/api/error/NetworkExceptionChecker;", "networkExceptionChecker$delegate", "Lnm0/g;", "getNetworkExceptionChecker", "()Lcom/withings/library/authentication/api/error/NetworkExceptionChecker;", "networkExceptionChecker", "Lv9/e;", "log$delegate", "getLog", "()Lv9/e;", "log", "Lcom/withings/library/authentication/setup2fa/state/factory/Registered2FASetupFactory;", "registered2FASetupFactory$delegate", "getRegistered2FASetupFactory", "()Lcom/withings/library/authentication/setup2fa/state/factory/Registered2FASetupFactory;", "registered2FASetupFactory", "Lcom/withings/library/authentication/setup2fa/state/factory/Unregistered2FASetupFactory;", "unregistered2FASetupFactory$delegate", "getUnregistered2FASetupFactory", "()Lcom/withings/library/authentication/setup2fa/state/factory/Unregistered2FASetupFactory;", "unregistered2FASetupFactory", "Lcom/withings/library/authentication/setup2fa/state/factory/InitializationError2FASetupFactory;", "initializationError2FASetupFactory$delegate", "getInitializationError2FASetupFactory", "()Lcom/withings/library/authentication/setup2fa/state/factory/InitializationError2FASetupFactory;", "initializationError2FASetupFactory", "Lcom/withings/library/authentication/api/account/AccountApi;", "accountApi$delegate", "getAccountApi", "()Lcom/withings/library/authentication/api/account/AccountApi;", "accountApi", "Lcom/withings/library/authentication/login/AuthenticationService;", "authenticationService$delegate", "getAuthenticationService", "()Lcom/withings/library/authentication/login/AuthenticationService;", "authenticationService", "<init>", "(Lcom/withings/library/authentication/setup2fa/state/InitializationError2FASetup$ErrorType;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class InitializationError2FASetupImpl implements InitializationError2FASetup, a {
    private final g accountApi$delegate;
    private final g authenticationService$delegate;
    private final InitializationError2FASetup.ErrorType errorType;
    private final g initializationError2FASetupFactory$delegate;
    private final g log$delegate;
    private final g networkExceptionChecker$delegate;
    private final g registered2FASetupFactory$delegate;
    private final g unregistered2FASetupFactory$delegate;

    public InitializationError2FASetupImpl(InitializationError2FASetup.ErrorType errorType) {
        u.j(errorType, "errorType");
        this.errorType = errorType;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f76136a;
        this.networkExceptionChecker$delegate = h.a(lazyThreadSafetyMode, new InitializationError2FASetupImpl$special$$inlined$inject$default$1(this, null, null));
        this.log$delegate = KoinKt.injectLogger(this, "InitializationError2FASetup");
        this.registered2FASetupFactory$delegate = h.a(lazyThreadSafetyMode, new InitializationError2FASetupImpl$special$$inlined$inject$default$2(this, null, null));
        this.unregistered2FASetupFactory$delegate = h.a(lazyThreadSafetyMode, new InitializationError2FASetupImpl$special$$inlined$inject$default$3(this, null, null));
        this.initializationError2FASetupFactory$delegate = h.a(lazyThreadSafetyMode, new InitializationError2FASetupImpl$special$$inlined$inject$default$4(this, null, null));
        this.accountApi$delegate = h.a(lazyThreadSafetyMode, new InitializationError2FASetupImpl$special$$inlined$inject$default$5(this, null, null));
        this.authenticationService$delegate = h.a(lazyThreadSafetyMode, new InitializationError2FASetupImpl$special$$inlined$inject$default$6(this, null, null));
    }

    private final AccountApi getAccountApi() {
        return (AccountApi) this.accountApi$delegate.getValue();
    }

    private final AuthenticationService getAuthenticationService() {
        return (AuthenticationService) this.authenticationService$delegate.getValue();
    }

    private final InitializationError2FASetupFactory getInitializationError2FASetupFactory() {
        return (InitializationError2FASetupFactory) this.initializationError2FASetupFactory$delegate.getValue();
    }

    private final e getLog() {
        return (e) this.log$delegate.getValue();
    }

    private final NetworkExceptionChecker getNetworkExceptionChecker() {
        return (NetworkExceptionChecker) this.networkExceptionChecker$delegate.getValue();
    }

    private final Registered2FASetupFactory getRegistered2FASetupFactory() {
        return (Registered2FASetupFactory) this.registered2FASetupFactory$delegate.getValue();
    }

    private final Unregistered2FASetupFactory getUnregistered2FASetupFactory() {
        return (Unregistered2FASetupFactory) this.unregistered2FASetupFactory$delegate.getValue();
    }

    @Override // com.withings.library.authentication.setup2fa.state.InitializationError2FASetup
    public InitializationError2FASetup.ErrorType getErrorType() {
        return this.errorType;
    }

    @Override // pq0.a
    public oq0.a getKoin() {
        return qq0.a.f93676a.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c5 A[Catch: Exception -> 0x0035, WrongStatusException -> 0x0038, TryCatch #3 {WrongStatusException -> 0x0038, Exception -> 0x0035, blocks: (B:13:0x0030, B:39:0x00ae, B:40:0x00bf, B:42:0x00c5, B:44:0x00cd, B:45:0x00d1, B:47:0x00d9, B:48:0x00ec), top: B:64:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d9 A[Catch: Exception -> 0x0035, WrongStatusException -> 0x0038, TryCatch #3 {WrongStatusException -> 0x0038, Exception -> 0x0035, blocks: (B:13:0x0030, B:39:0x00ae, B:40:0x00bf, B:42:0x00c5, B:44:0x00cd, B:45:0x00d1, B:47:0x00d9, B:48:0x00ec), top: B:64:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ec A[Catch: Exception -> 0x0035, WrongStatusException -> 0x0038, TRY_LEAVE, TryCatch #3 {WrongStatusException -> 0x0038, Exception -> 0x0035, blocks: (B:13:0x0030, B:39:0x00ae, B:40:0x00bf, B:42:0x00c5, B:44:0x00cd, B:45:0x00d1, B:47:0x00d9, B:48:0x00ec), top: B:64:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015d  */
    @Override // com.withings.library.authentication.setup2fa.state.InitializationError2FASetup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object retryInitialization(qm0.d<? super com.withings.library.authentication.setup2fa.state.InitializationError2FASetup.RetryOutputState> r9) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.setup2fa.state.impl.InitializationError2FASetupImpl.retryInitialization(qm0.d):java.lang.Object");
    }
}
