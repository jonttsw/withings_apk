package com.withings.library.authentication.sensitiveaction.impl;

import com.withings.library.authentication.sensitiveaction.MutableSensitiveActionService;
import com.withings.library.authentication.sensitiveaction.factory.InitializationErrorSensitiveActionStateFactory;
import com.withings.library.authentication.sensitiveaction.factory.NeedGoogleSignInInfoSensitiveActionStateFactory;
import com.withings.library.authentication.sensitiveaction.factory.NeedMailSensitiveActionStateFactory;
import com.withings.library.authentication.sensitiveaction.state.InitializationErrorSensitiveActionState;
import com.withings.library.authentication.sensitiveaction.state.NeedGoogleSignInInfoSensitiveActionState;
import com.withings.library.authentication.sensitiveaction.state.NeedMailSensitiveActionState;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
import pq0.a;
/* compiled from: InitializationErrorSensitiveActionStateWithRepo.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\f\u001a\u00020\u0001¢\u0006\u0004\b'\u0010(J\u0013\u0010\u0003\u001a\u00020\u0001*\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0003\u001a\u00020\u0005*\u00020\u0005H\u0002¢\u0006\u0004\b\u0003\u0010\u0006J\u0013\u0010\u0003\u001a\u00020\u0007*\u00020\u0007H\u0002¢\u0006\u0004\b\u0003\u0010\bJ\u0013\u0010\n\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/impl/InitializationErrorSensitiveActionStateWithRepo;", "Lcom/withings/library/authentication/sensitiveaction/state/InitializationErrorSensitiveActionState;", "Lpq0/a;", "withRepo", "(Lcom/withings/library/authentication/sensitiveaction/state/InitializationErrorSensitiveActionState;)Lcom/withings/library/authentication/sensitiveaction/state/InitializationErrorSensitiveActionState;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState;", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState;)Lcom/withings/library/authentication/sensitiveaction/state/NeedGoogleSignInInfoSensitiveActionState;", "Lcom/withings/library/authentication/sensitiveaction/state/NeedMailSensitiveActionState;", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedMailSensitiveActionState;)Lcom/withings/library/authentication/sensitiveaction/state/NeedMailSensitiveActionState;", "Lcom/withings/library/authentication/sensitiveaction/state/InitializationErrorSensitiveActionState$RetryOutputState;", "retryInitialization", "(Lqm0/d;)Ljava/lang/Object;", "delegate", "Lcom/withings/library/authentication/sensitiveaction/state/InitializationErrorSensitiveActionState;", "Lcom/withings/library/authentication/sensitiveaction/MutableSensitiveActionService;", "mutableSensitiveActionService$delegate", "Lnm0/g;", "getMutableSensitiveActionService", "()Lcom/withings/library/authentication/sensitiveaction/MutableSensitiveActionService;", "mutableSensitiveActionService", "Lcom/withings/library/authentication/sensitiveaction/factory/InitializationErrorSensitiveActionStateFactory;", "initializationErrorSensitiveActionStateFactory$delegate", "getInitializationErrorSensitiveActionStateFactory", "()Lcom/withings/library/authentication/sensitiveaction/factory/InitializationErrorSensitiveActionStateFactory;", "initializationErrorSensitiveActionStateFactory", "Lcom/withings/library/authentication/sensitiveaction/factory/NeedGoogleSignInInfoSensitiveActionStateFactory;", "needGoogleSignInInfoSensitiveActionStateFactory$delegate", "getNeedGoogleSignInInfoSensitiveActionStateFactory", "()Lcom/withings/library/authentication/sensitiveaction/factory/NeedGoogleSignInInfoSensitiveActionStateFactory;", "needGoogleSignInInfoSensitiveActionStateFactory", "Lcom/withings/library/authentication/sensitiveaction/factory/NeedMailSensitiveActionStateFactory;", "needMailSensitiveActionStateFactory$delegate", "getNeedMailSensitiveActionStateFactory", "()Lcom/withings/library/authentication/sensitiveaction/factory/NeedMailSensitiveActionStateFactory;", "needMailSensitiveActionStateFactory", "Lcom/withings/library/authentication/sensitiveaction/state/InitializationErrorSensitiveActionState$ErrorType;", "getErrorType", "()Lcom/withings/library/authentication/sensitiveaction/state/InitializationErrorSensitiveActionState$ErrorType;", "errorType", "<init>", "(Lcom/withings/library/authentication/sensitiveaction/state/InitializationErrorSensitiveActionState;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class InitializationErrorSensitiveActionStateWithRepo implements InitializationErrorSensitiveActionState, a {
    private final InitializationErrorSensitiveActionState delegate;
    private final g initializationErrorSensitiveActionStateFactory$delegate;
    private final g mutableSensitiveActionService$delegate;
    private final g needGoogleSignInInfoSensitiveActionStateFactory$delegate;
    private final g needMailSensitiveActionStateFactory$delegate;

    public InitializationErrorSensitiveActionStateWithRepo(InitializationErrorSensitiveActionState delegate) {
        u.j(delegate, "delegate");
        this.delegate = delegate;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f76136a;
        this.mutableSensitiveActionService$delegate = h.a(lazyThreadSafetyMode, new InitializationErrorSensitiveActionStateWithRepo$special$$inlined$inject$default$1(this, null, null));
        this.initializationErrorSensitiveActionStateFactory$delegate = h.a(lazyThreadSafetyMode, new InitializationErrorSensitiveActionStateWithRepo$special$$inlined$inject$default$2(this, null, null));
        this.needGoogleSignInInfoSensitiveActionStateFactory$delegate = h.a(lazyThreadSafetyMode, new InitializationErrorSensitiveActionStateWithRepo$special$$inlined$inject$default$3(this, null, null));
        this.needMailSensitiveActionStateFactory$delegate = h.a(lazyThreadSafetyMode, new InitializationErrorSensitiveActionStateWithRepo$special$$inlined$inject$default$4(this, null, null));
    }

    private final InitializationErrorSensitiveActionStateFactory getInitializationErrorSensitiveActionStateFactory() {
        return (InitializationErrorSensitiveActionStateFactory) this.initializationErrorSensitiveActionStateFactory$delegate.getValue();
    }

    private final MutableSensitiveActionService getMutableSensitiveActionService() {
        return (MutableSensitiveActionService) this.mutableSensitiveActionService$delegate.getValue();
    }

    private final NeedGoogleSignInInfoSensitiveActionStateFactory getNeedGoogleSignInInfoSensitiveActionStateFactory() {
        return (NeedGoogleSignInInfoSensitiveActionStateFactory) this.needGoogleSignInInfoSensitiveActionStateFactory$delegate.getValue();
    }

    private final NeedMailSensitiveActionStateFactory getNeedMailSensitiveActionStateFactory() {
        return (NeedMailSensitiveActionStateFactory) this.needMailSensitiveActionStateFactory$delegate.getValue();
    }

    private final InitializationErrorSensitiveActionState withRepo(InitializationErrorSensitiveActionState initializationErrorSensitiveActionState) {
        return getInitializationErrorSensitiveActionStateFactory().buildWithRepo(initializationErrorSensitiveActionState);
    }

    @Override // com.withings.library.authentication.sensitiveaction.state.InitializationErrorSensitiveActionState
    public InitializationErrorSensitiveActionState.ErrorType getErrorType() {
        return this.delegate.getErrorType();
    }

    @Override // pq0.a
    public oq0.a getKoin() {
        return qq0.a.f93676a.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    @Override // com.withings.library.authentication.sensitiveaction.state.InitializationErrorSensitiveActionState
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object retryInitialization(qm0.d<? super com.withings.library.authentication.sensitiveaction.state.InitializationErrorSensitiveActionState.RetryOutputState> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.withings.library.authentication.sensitiveaction.impl.InitializationErrorSensitiveActionStateWithRepo$retryInitialization$1
            if (r0 == 0) goto L13
            r0 = r9
            com.withings.library.authentication.sensitiveaction.impl.InitializationErrorSensitiveActionStateWithRepo$retryInitialization$1 r0 = (com.withings.library.authentication.sensitiveaction.impl.InitializationErrorSensitiveActionStateWithRepo$retryInitialization$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.library.authentication.sensitiveaction.impl.InitializationErrorSensitiveActionStateWithRepo$retryInitialization$1 r0 = new com.withings.library.authentication.sensitiveaction.impl.InitializationErrorSensitiveActionStateWithRepo$retryInitialization$1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L49
            if (r2 == r6) goto L41
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            nm0.l.b(r9)
            goto Lc4
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L39:
            nm0.l.b(r9)
            goto L9f
        L3d:
            nm0.l.b(r9)
            goto L7a
        L41:
            java.lang.Object r2 = r0.L$0
            com.withings.library.authentication.sensitiveaction.impl.InitializationErrorSensitiveActionStateWithRepo r2 = (com.withings.library.authentication.sensitiveaction.impl.InitializationErrorSensitiveActionStateWithRepo) r2
            nm0.l.b(r9)
            goto L5a
        L49:
            nm0.l.b(r9)
            com.withings.library.authentication.sensitiveaction.state.InitializationErrorSensitiveActionState r9 = r8.delegate
            r0.L$0 = r8
            r0.label = r6
            java.lang.Object r9 = r9.retryInitialization(r0)
            if (r9 != r1) goto L59
            return r1
        L59:
            r2 = r8
        L5a:
            com.withings.library.authentication.sensitiveaction.state.InitializationErrorSensitiveActionState$RetryOutputState r9 = (com.withings.library.authentication.sensitiveaction.state.InitializationErrorSensitiveActionState.RetryOutputState) r9
            boolean r6 = r9 instanceof com.withings.library.authentication.sensitiveaction.state.InitializationErrorSensitiveActionState.RetryOutputState.Error
            r7 = 0
            if (r6 == 0) goto L82
            com.withings.library.authentication.sensitiveaction.MutableSensitiveActionService r3 = r2.getMutableSensitiveActionService()
            com.withings.library.authentication.sensitiveaction.state.InitializationErrorSensitiveActionState$RetryOutputState$Error r9 = (com.withings.library.authentication.sensitiveaction.state.InitializationErrorSensitiveActionState.RetryOutputState.Error) r9
            com.withings.library.authentication.sensitiveaction.state.InitializationErrorSensitiveActionState r9 = r9.getSensitiveActionState()
            com.withings.library.authentication.sensitiveaction.state.InitializationErrorSensitiveActionState r9 = r2.withRepo(r9)
            r0.L$0 = r7
            r0.label = r5
            java.lang.Object r9 = r3.pushNewState(r9, r0)
            if (r9 != r1) goto L7a
            return r1
        L7a:
            com.withings.library.authentication.sensitiveaction.state.InitializationErrorSensitiveActionState r9 = (com.withings.library.authentication.sensitiveaction.state.InitializationErrorSensitiveActionState) r9
            com.withings.library.authentication.sensitiveaction.state.InitializationErrorSensitiveActionState$RetryOutputState$Error r0 = new com.withings.library.authentication.sensitiveaction.state.InitializationErrorSensitiveActionState$RetryOutputState$Error
            r0.<init>(r9)
            goto Lcb
        L82:
            boolean r5 = r9 instanceof com.withings.library.authentication.sensitiveaction.state.InitializationErrorSensitiveActionState.RetryOutputState.SuccessNeedGoogleSignIn
            if (r5 == 0) goto La7
            com.withings.library.authentication.sensitiveaction.MutableSensitiveActionService r3 = r2.getMutableSensitiveActionService()
            com.withings.library.authentication.sensitiveaction.state.InitializationErrorSensitiveActionState$RetryOutputState$SuccessNeedGoogleSignIn r9 = (com.withings.library.authentication.sensitiveaction.state.InitializationErrorSensitiveActionState.RetryOutputState.SuccessNeedGoogleSignIn) r9
            com.withings.library.authentication.sensitiveaction.state.NeedGoogleSignInInfoSensitiveActionState r9 = r9.getSensitiveActionState()
            com.withings.library.authentication.sensitiveaction.state.NeedGoogleSignInInfoSensitiveActionState r9 = r2.withRepo(r9)
            r0.L$0 = r7
            r0.label = r4
            java.lang.Object r9 = r3.pushNewState(r9, r0)
            if (r9 != r1) goto L9f
            return r1
        L9f:
            com.withings.library.authentication.sensitiveaction.state.NeedGoogleSignInInfoSensitiveActionState r9 = (com.withings.library.authentication.sensitiveaction.state.NeedGoogleSignInInfoSensitiveActionState) r9
            com.withings.library.authentication.sensitiveaction.state.InitializationErrorSensitiveActionState$RetryOutputState$SuccessNeedGoogleSignIn r0 = new com.withings.library.authentication.sensitiveaction.state.InitializationErrorSensitiveActionState$RetryOutputState$SuccessNeedGoogleSignIn
            r0.<init>(r9)
            goto Lcb
        La7:
            boolean r4 = r9 instanceof com.withings.library.authentication.sensitiveaction.state.InitializationErrorSensitiveActionState.RetryOutputState.SuccessNeedMail
            if (r4 == 0) goto Lcc
            com.withings.library.authentication.sensitiveaction.MutableSensitiveActionService r4 = r2.getMutableSensitiveActionService()
            com.withings.library.authentication.sensitiveaction.state.InitializationErrorSensitiveActionState$RetryOutputState$SuccessNeedMail r9 = (com.withings.library.authentication.sensitiveaction.state.InitializationErrorSensitiveActionState.RetryOutputState.SuccessNeedMail) r9
            com.withings.library.authentication.sensitiveaction.state.NeedMailSensitiveActionState r9 = r9.getSensitiveActionState()
            com.withings.library.authentication.sensitiveaction.state.NeedMailSensitiveActionState r9 = r2.withRepo(r9)
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r9 = r4.pushNewState(r9, r0)
            if (r9 != r1) goto Lc4
            return r1
        Lc4:
            com.withings.library.authentication.sensitiveaction.state.NeedMailSensitiveActionState r9 = (com.withings.library.authentication.sensitiveaction.state.NeedMailSensitiveActionState) r9
            com.withings.library.authentication.sensitiveaction.state.InitializationErrorSensitiveActionState$RetryOutputState$SuccessNeedMail r0 = new com.withings.library.authentication.sensitiveaction.state.InitializationErrorSensitiveActionState$RetryOutputState$SuccessNeedMail
            r0.<init>(r9)
        Lcb:
            return r0
        Lcc:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.sensitiveaction.impl.InitializationErrorSensitiveActionStateWithRepo.retryInitialization(qm0.d):java.lang.Object");
    }

    private final NeedGoogleSignInInfoSensitiveActionState withRepo(NeedGoogleSignInInfoSensitiveActionState needGoogleSignInInfoSensitiveActionState) {
        return getNeedGoogleSignInInfoSensitiveActionStateFactory().buildWithRepo(needGoogleSignInInfoSensitiveActionState);
    }

    private final NeedMailSensitiveActionState withRepo(NeedMailSensitiveActionState needMailSensitiveActionState) {
        return getNeedMailSensitiveActionStateFactory().buildWithRepo(needMailSensitiveActionState);
    }
}
