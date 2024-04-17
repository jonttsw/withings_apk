package com.withings.library.authentication.sensitiveaction.impl;

import com.withings.library.authentication.login.AuthenticationService;
import com.withings.library.authentication.sensitiveaction.factory.InitializationErrorSensitiveActionStateFactory;
import com.withings.library.authentication.sensitiveaction.factory.NeedGoogleSignInInfoSensitiveActionStateFactory;
import com.withings.library.authentication.sensitiveaction.factory.NeedMailSensitiveActionStateFactory;
import com.withings.library.authentication.sensitiveaction.state.InitializationErrorSensitiveActionState;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
import pq0.a;
/* compiled from: InitializationErrorSensitiveActionStateImpl.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b \u0010!J\u0013\u0010\u0004\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\r\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/impl/InitializationErrorSensitiveActionStateImpl;", "Lcom/withings/library/authentication/sensitiveaction/state/InitializationErrorSensitiveActionState;", "Lpq0/a;", "Lcom/withings/library/authentication/sensitiveaction/state/InitializationErrorSensitiveActionState$RetryOutputState;", "retryInitialization", "(Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/authentication/sensitiveaction/state/InitializationErrorSensitiveActionState$ErrorType;", "errorType", "Lcom/withings/library/authentication/sensitiveaction/state/InitializationErrorSensitiveActionState$ErrorType;", "getErrorType", "()Lcom/withings/library/authentication/sensitiveaction/state/InitializationErrorSensitiveActionState$ErrorType;", "Lcom/withings/library/authentication/login/AuthenticationService;", "authenticationService$delegate", "Lnm0/g;", "getAuthenticationService", "()Lcom/withings/library/authentication/login/AuthenticationService;", "authenticationService", "Lcom/withings/library/authentication/sensitiveaction/factory/InitializationErrorSensitiveActionStateFactory;", "initializationErrorFactory$delegate", "getInitializationErrorFactory", "()Lcom/withings/library/authentication/sensitiveaction/factory/InitializationErrorSensitiveActionStateFactory;", "initializationErrorFactory", "Lcom/withings/library/authentication/sensitiveaction/factory/NeedGoogleSignInInfoSensitiveActionStateFactory;", "needGoogleSignInInfoSensitiveActionStateFactory$delegate", "getNeedGoogleSignInInfoSensitiveActionStateFactory", "()Lcom/withings/library/authentication/sensitiveaction/factory/NeedGoogleSignInInfoSensitiveActionStateFactory;", "needGoogleSignInInfoSensitiveActionStateFactory", "Lcom/withings/library/authentication/sensitiveaction/factory/NeedMailSensitiveActionStateFactory;", "needMailSensitiveActionStateFactory$delegate", "getNeedMailSensitiveActionStateFactory", "()Lcom/withings/library/authentication/sensitiveaction/factory/NeedMailSensitiveActionStateFactory;", "needMailSensitiveActionStateFactory", "<init>", "(Lcom/withings/library/authentication/sensitiveaction/state/InitializationErrorSensitiveActionState$ErrorType;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class InitializationErrorSensitiveActionStateImpl implements InitializationErrorSensitiveActionState, a {
    private final g authenticationService$delegate;
    private final InitializationErrorSensitiveActionState.ErrorType errorType;
    private final g initializationErrorFactory$delegate;
    private final g needGoogleSignInInfoSensitiveActionStateFactory$delegate;
    private final g needMailSensitiveActionStateFactory$delegate;

    public InitializationErrorSensitiveActionStateImpl(InitializationErrorSensitiveActionState.ErrorType errorType) {
        u.j(errorType, "errorType");
        this.errorType = errorType;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f76136a;
        this.authenticationService$delegate = h.a(lazyThreadSafetyMode, new InitializationErrorSensitiveActionStateImpl$special$$inlined$inject$default$1(this, null, null));
        this.initializationErrorFactory$delegate = h.a(lazyThreadSafetyMode, new InitializationErrorSensitiveActionStateImpl$special$$inlined$inject$default$2(this, null, null));
        this.needGoogleSignInInfoSensitiveActionStateFactory$delegate = h.a(lazyThreadSafetyMode, new InitializationErrorSensitiveActionStateImpl$special$$inlined$inject$default$3(this, null, null));
        this.needMailSensitiveActionStateFactory$delegate = h.a(lazyThreadSafetyMode, new InitializationErrorSensitiveActionStateImpl$special$$inlined$inject$default$4(this, null, null));
    }

    private final AuthenticationService getAuthenticationService() {
        return (AuthenticationService) this.authenticationService$delegate.getValue();
    }

    private final InitializationErrorSensitiveActionStateFactory getInitializationErrorFactory() {
        return (InitializationErrorSensitiveActionStateFactory) this.initializationErrorFactory$delegate.getValue();
    }

    private final NeedGoogleSignInInfoSensitiveActionStateFactory getNeedGoogleSignInInfoSensitiveActionStateFactory() {
        return (NeedGoogleSignInInfoSensitiveActionStateFactory) this.needGoogleSignInInfoSensitiveActionStateFactory$delegate.getValue();
    }

    private final NeedMailSensitiveActionStateFactory getNeedMailSensitiveActionStateFactory() {
        return (NeedMailSensitiveActionStateFactory) this.needMailSensitiveActionStateFactory$delegate.getValue();
    }

    @Override // com.withings.library.authentication.sensitiveaction.state.InitializationErrorSensitiveActionState
    public InitializationErrorSensitiveActionState.ErrorType getErrorType() {
        return this.errorType;
    }

    @Override // pq0.a
    public oq0.a getKoin() {
        return qq0.a.f93676a.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cb  */
    @Override // com.withings.library.authentication.sensitiveaction.state.InitializationErrorSensitiveActionState
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object retryInitialization(qm0.d<? super com.withings.library.authentication.sensitiveaction.state.InitializationErrorSensitiveActionState.RetryOutputState> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.withings.library.authentication.sensitiveaction.impl.InitializationErrorSensitiveActionStateImpl$retryInitialization$1
            if (r0 == 0) goto L13
            r0 = r5
            com.withings.library.authentication.sensitiveaction.impl.InitializationErrorSensitiveActionStateImpl$retryInitialization$1 r0 = (com.withings.library.authentication.sensitiveaction.impl.InitializationErrorSensitiveActionStateImpl$retryInitialization$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.library.authentication.sensitiveaction.impl.InitializationErrorSensitiveActionStateImpl$retryInitialization$1 r0 = new com.withings.library.authentication.sensitiveaction.impl.InitializationErrorSensitiveActionStateImpl$retryInitialization$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.L$0
            com.withings.library.authentication.sensitiveaction.impl.InitializationErrorSensitiveActionStateImpl r0 = (com.withings.library.authentication.sensitiveaction.impl.InitializationErrorSensitiveActionStateImpl) r0
            nm0.l.b(r5)
            goto L46
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            nm0.l.b(r5)
            com.withings.library.authentication.login.AuthenticationService r5 = r4.getAuthenticationService()
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.getState(r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            r0 = r4
        L46:
            com.withings.library.authentication.login.state.AuthenticationState r5 = (com.withings.library.authentication.login.state.AuthenticationState) r5
            boolean r1 = r5 instanceof com.withings.library.authentication.login.state.LoggedIn
            if (r1 == 0) goto Lcb
            com.withings.library.authentication.login.state.LoggedIn r5 = (com.withings.library.authentication.login.state.LoggedIn) r5
            java.util.List r1 = r5.getSessions()
            com.withings.library.authentication.login.Session r1 = com.withings.library.authentication.login.SessionKt.getMainSession(r1)
            boolean r2 = com.withings.library.authentication.login.SessionKt.isStillValid(r1)
            if (r2 == 0) goto L5d
            goto L5e
        L5d:
            r1 = 0
        L5e:
            if (r1 != 0) goto L7b
            com.withings.library.authentication.sensitiveaction.state.InitializationErrorSensitiveActionState$RetryOutputState$Error r1 = new com.withings.library.authentication.sensitiveaction.state.InitializationErrorSensitiveActionState$RetryOutputState$Error
            com.withings.library.authentication.sensitiveaction.factory.InitializationErrorSensitiveActionStateFactory r0 = r0.getInitializationErrorFactory()
            com.withings.library.authentication.sensitiveaction.state.InitializationErrorSensitiveActionState$ErrorType$OutdatedSession r2 = new com.withings.library.authentication.sensitiveaction.state.InitializationErrorSensitiveActionState$ErrorType$OutdatedSession
            java.util.List r5 = r5.getSessions()
            com.withings.library.authentication.login.Session r5 = com.withings.library.authentication.login.SessionKt.getMainSession(r5)
            r2.<init>(r5)
            com.withings.library.authentication.sensitiveaction.state.InitializationErrorSensitiveActionState r5 = r0.build(r2)
            r1.<init>(r5)
            return r1
        L7b:
            com.withings.library.authentication.login.ProviderType r5 = r1.getProviderType()
            com.withings.library.authentication.login.ProviderType$APPLE r2 = com.withings.library.authentication.login.ProviderType.APPLE.INSTANCE
            boolean r2 = kotlin.jvm.internal.u.e(r5, r2)
            if (r2 != 0) goto Lc3
            com.withings.library.authentication.login.ProviderType$GOOGLE r2 = com.withings.library.authentication.login.ProviderType.GOOGLE.INSTANCE
            boolean r2 = kotlin.jvm.internal.u.e(r5, r2)
            if (r2 == 0) goto La2
            com.withings.library.authentication.sensitiveaction.state.InitializationErrorSensitiveActionState$RetryOutputState$SuccessNeedGoogleSignIn r5 = new com.withings.library.authentication.sensitiveaction.state.InitializationErrorSensitiveActionState$RetryOutputState$SuccessNeedGoogleSignIn
            com.withings.library.authentication.sensitiveaction.factory.NeedGoogleSignInInfoSensitiveActionStateFactory r0 = r0.getNeedGoogleSignInInfoSensitiveActionStateFactory()
            com.withings.library.authentication.sensitiveaction.impl.InitializationErrorSensitiveActionStateImpl$retryInitialization$2 r2 = new com.withings.library.authentication.sensitiveaction.impl.InitializationErrorSensitiveActionStateImpl$retryInitialization$2
            r2.<init>(r1)
            com.withings.library.authentication.sensitiveaction.state.NeedGoogleSignInInfoSensitiveActionState r0 = r0.build(r2)
            r5.<init>(r0)
            goto Lbc
        La2:
            com.withings.library.authentication.login.ProviderType$WITHINGS r2 = com.withings.library.authentication.login.ProviderType.WITHINGS.INSTANCE
            boolean r5 = kotlin.jvm.internal.u.e(r5, r2)
            if (r5 == 0) goto Lbd
            com.withings.library.authentication.sensitiveaction.state.InitializationErrorSensitiveActionState$RetryOutputState$SuccessNeedMail r5 = new com.withings.library.authentication.sensitiveaction.state.InitializationErrorSensitiveActionState$RetryOutputState$SuccessNeedMail
            com.withings.library.authentication.sensitiveaction.factory.NeedMailSensitiveActionStateFactory r0 = r0.getNeedMailSensitiveActionStateFactory()
            com.withings.library.authentication.sensitiveaction.impl.InitializationErrorSensitiveActionStateImpl$retryInitialization$3 r2 = new com.withings.library.authentication.sensitiveaction.impl.InitializationErrorSensitiveActionStateImpl$retryInitialization$3
            r2.<init>(r1)
            com.withings.library.authentication.sensitiveaction.state.NeedMailSensitiveActionState r0 = r0.build(r2)
            r5.<init>(r0)
        Lbc:
            return r5
        Lbd:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        Lc3:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r0 = "Provider type apple not managed"
            r5.<init>(r0)
            throw r5
        Lcb:
            com.withings.library.authentication.sensitiveaction.state.InitializationErrorSensitiveActionState$RetryOutputState$Error r5 = new com.withings.library.authentication.sensitiveaction.state.InitializationErrorSensitiveActionState$RetryOutputState$Error
            com.withings.library.authentication.sensitiveaction.factory.InitializationErrorSensitiveActionStateFactory r0 = r0.getInitializationErrorFactory()
            com.withings.library.authentication.sensitiveaction.state.InitializationErrorSensitiveActionState$ErrorType$NotLoggedIn r1 = com.withings.library.authentication.sensitiveaction.state.InitializationErrorSensitiveActionState.ErrorType.NotLoggedIn.INSTANCE
            com.withings.library.authentication.sensitiveaction.state.InitializationErrorSensitiveActionState r0 = r0.build(r1)
            r5.<init>(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.sensitiveaction.impl.InitializationErrorSensitiveActionStateImpl.retryInitialization(qm0.d):java.lang.Object");
    }
}
