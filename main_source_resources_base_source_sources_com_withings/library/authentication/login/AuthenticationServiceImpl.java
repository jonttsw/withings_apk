package com.withings.library.authentication.login;

import com.withings.library.authentication.host.session.PreviousSessionRepository;
import com.withings.library.authentication.login.state.AuthenticationState;
import com.withings.library.authentication.login.state.LoggedOut;
import com.withings.library.authentication.login.state.factory.LoggedInFactory;
import com.withings.library.authentication.login.state.factory.LoggedOutFactory;
import java.util.Collection;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import nm0.g;
import nm0.h;
import pq0.a;
import qm0.d;
/* compiled from: AuthenticationServiceImpl.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b*\u0010+J\u0019\u0010\u0007\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000bJ%\u0010\u0011\u001a\u00028\u0000\"\b\b\u0000\u0010\u000f*\u00020\t2\u0006\u0010\u0010\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010!R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, d2 = {"Lcom/withings/library/authentication/login/AuthenticationServiceImpl;", "Lcom/withings/library/authentication/login/AuthenticationService;", "Lcom/withings/library/authentication/login/MutableAuthenticationService;", "Lpq0/a;", "", "Lcom/withings/library/authentication/login/Session;", "", "areAllCoherent", "(Ljava/util/List;)Z", "Lcom/withings/library/authentication/login/state/AuthenticationState;", "getState", "(Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/authentication/login/state/LoggedOut;", "initiateLoginSequence", "initiateLoginSequenceWithAutomatedTransition", "T", "newAuthenticationState", "pushNewState", "(Lcom/withings/library/authentication/login/state/AuthenticationState;Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/authentication/host/session/PreviousSessionRepository;", "previousSessionRepository$delegate", "Lnm0/g;", "getPreviousSessionRepository", "()Lcom/withings/library/authentication/host/session/PreviousSessionRepository;", "previousSessionRepository", "Lcom/withings/library/authentication/login/state/factory/LoggedOutFactory;", "loggedOutFactory$delegate", "getLoggedOutFactory", "()Lcom/withings/library/authentication/login/state/factory/LoggedOutFactory;", "loggedOutFactory", "Lcom/withings/library/authentication/login/state/factory/LoggedInFactory;", "loggedInFactory$delegate", "getLoggedInFactory", "()Lcom/withings/library/authentication/login/state/factory/LoggedInFactory;", "loggedInFactory", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_currentState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/Flow;", "getCurrentState", "()Lkotlinx/coroutines/flow/Flow;", "currentState", "<init>", "()V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class AuthenticationServiceImpl implements AuthenticationService, MutableAuthenticationService, a {
    private final MutableStateFlow<AuthenticationState> _currentState;
    private final g loggedInFactory$delegate;
    private final g loggedOutFactory$delegate;
    private final g previousSessionRepository$delegate;

    public AuthenticationServiceImpl() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f76136a;
        this.previousSessionRepository$delegate = h.a(lazyThreadSafetyMode, new AuthenticationServiceImpl$special$$inlined$inject$default$1(this, null, null));
        this.loggedOutFactory$delegate = h.a(lazyThreadSafetyMode, new AuthenticationServiceImpl$special$$inlined$inject$default$2(this, null, null));
        this.loggedInFactory$delegate = h.a(lazyThreadSafetyMode, new AuthenticationServiceImpl$special$$inlined$inject$default$3(this, null, null));
        this._currentState = StateFlowKt.MutableStateFlow(null);
    }

    private final boolean areAllCoherent(List<Session> list) {
        List<Session> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return true;
        }
        for (Session session : list2) {
            if (session.getRequireSecure() && (!session.getRequireSecure() || !session.isSecured())) {
                return false;
            }
        }
        return true;
    }

    private final LoggedInFactory getLoggedInFactory() {
        return (LoggedInFactory) this.loggedInFactory$delegate.getValue();
    }

    private final LoggedOutFactory getLoggedOutFactory() {
        return (LoggedOutFactory) this.loggedOutFactory$delegate.getValue();
    }

    private final PreviousSessionRepository getPreviousSessionRepository() {
        return (PreviousSessionRepository) this.previousSessionRepository$delegate.getValue();
    }

    @Override // com.withings.library.authentication.login.AuthenticationService
    public Flow<AuthenticationState> getCurrentState() {
        return this._currentState;
    }

    @Override // pq0.a
    public oq0.a getKoin() {
        return qq0.a.f93676a.a();
    }

    @Override // com.withings.library.authentication.login.AuthenticationService
    public Object getState(d<? super AuthenticationState> dVar) {
        AuthenticationState value = this._currentState.getValue();
        if (value == null) {
            return initiateLoginSequenceWithAutomatedTransition(dVar);
        }
        return value;
    }

    @Override // com.withings.library.authentication.login.AuthenticationService
    public Object initiateLoginSequence(d<? super LoggedOut> dVar) {
        getPreviousSessionRepository().clearSession();
        return pushNewState(getLoggedOutFactory().buildLoggedOutWithRepo(getLoggedOutFactory().buildLoggedOut()), dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    @Override // com.withings.library.authentication.login.AuthenticationService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object initiateLoginSequenceWithAutomatedTransition(qm0.d<? super com.withings.library.authentication.login.state.AuthenticationState> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.withings.library.authentication.login.AuthenticationServiceImpl$initiateLoginSequenceWithAutomatedTransition$1
            if (r0 == 0) goto L13
            r0 = r7
            com.withings.library.authentication.login.AuthenticationServiceImpl$initiateLoginSequenceWithAutomatedTransition$1 r0 = (com.withings.library.authentication.login.AuthenticationServiceImpl$initiateLoginSequenceWithAutomatedTransition$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.library.authentication.login.AuthenticationServiceImpl$initiateLoginSequenceWithAutomatedTransition$1 r0 = new com.withings.library.authentication.login.AuthenticationServiceImpl$initiateLoginSequenceWithAutomatedTransition$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            nm0.l.b(r7)
            goto L9d
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            nm0.l.b(r7)
            goto L76
        L39:
            nm0.l.b(r7)
            goto Lb9
        L3e:
            nm0.l.b(r7)
            com.withings.library.authentication.host.session.PreviousSessionRepository r7 = r6.getPreviousSessionRepository()
            java.util.List r7 = r7.getPreviousSession()
            r2 = r7
            java.util.Collection r2 = (java.util.Collection) r2
            if (r2 == 0) goto La0
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L55
            goto La0
        L55:
            boolean r2 = r6.areAllCoherent(r7)
            if (r2 == 0) goto L7d
            com.withings.library.authentication.login.state.factory.LoggedInFactory r2 = r6.getLoggedInFactory()
            com.withings.library.authentication.login.state.factory.LoggedInFactory r3 = r6.getLoggedInFactory()
            com.withings.library.authentication.login.state.LoggedIn r7 = r3.buildLoggedIn(r7)
            com.withings.library.authentication.login.state.LoggedIn r7 = r2.buildLoggedInWithRepo(r7)
            r0.label = r4
            r2 = 0
            r3 = 0
            java.lang.Object r7 = com.withings.library.authentication.login.state.LoggedIn.DefaultImpls.renewSessions$default(r7, r2, r0, r5, r3)
            if (r7 != r1) goto L76
            return r1
        L76:
            com.withings.library.authentication.login.state.LoggedIn$RenewOutputState r7 = (com.withings.library.authentication.login.state.LoggedIn.RenewOutputState) r7
            com.withings.library.authentication.login.state.AuthenticationState r7 = com.withings.library.authentication.login.state.helper.OutputStateUnwrapperKt.unwrap(r7)
            goto Lbb
        L7d:
            com.withings.library.authentication.host.session.PreviousSessionRepository r7 = r6.getPreviousSessionRepository()
            r7.clearSession()
            com.withings.library.authentication.login.state.factory.LoggedOutFactory r7 = r6.getLoggedOutFactory()
            com.withings.library.authentication.login.state.factory.LoggedOutFactory r2 = r6.getLoggedOutFactory()
            com.withings.library.authentication.login.state.LoggedOut r2 = r2.buildLoggedOut()
            com.withings.library.authentication.login.state.LoggedOut r7 = r7.buildLoggedOutWithRepo(r2)
            r0.label = r3
            java.lang.Object r7 = r6.pushNewState(r7, r0)
            if (r7 != r1) goto L9d
            return r1
        L9d:
            com.withings.library.authentication.login.state.AuthenticationState r7 = (com.withings.library.authentication.login.state.AuthenticationState) r7
            goto Lbb
        La0:
            com.withings.library.authentication.login.state.factory.LoggedOutFactory r7 = r6.getLoggedOutFactory()
            com.withings.library.authentication.login.state.factory.LoggedOutFactory r2 = r6.getLoggedOutFactory()
            com.withings.library.authentication.login.state.LoggedOut r2 = r2.buildLoggedOut()
            com.withings.library.authentication.login.state.LoggedOut r7 = r7.buildLoggedOutWithRepo(r2)
            r0.label = r5
            java.lang.Object r7 = r6.pushNewState(r7, r0)
            if (r7 != r1) goto Lb9
            return r1
        Lb9:
            com.withings.library.authentication.login.state.AuthenticationState r7 = (com.withings.library.authentication.login.state.AuthenticationState) r7
        Lbb:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.login.AuthenticationServiceImpl.initiateLoginSequenceWithAutomatedTransition(qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    @Override // com.withings.library.authentication.login.MutableAuthenticationService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T extends com.withings.library.authentication.login.state.AuthenticationState> java.lang.Object pushNewState(T r5, qm0.d<? super T> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.withings.library.authentication.login.AuthenticationServiceImpl$pushNewState$1
            if (r0 == 0) goto L13
            r0 = r6
            com.withings.library.authentication.login.AuthenticationServiceImpl$pushNewState$1 r0 = (com.withings.library.authentication.login.AuthenticationServiceImpl$pushNewState$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.library.authentication.login.AuthenticationServiceImpl$pushNewState$1 r0 = new com.withings.library.authentication.login.AuthenticationServiceImpl$pushNewState$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.L$0
            com.withings.library.authentication.login.state.AuthenticationState r5 = (com.withings.library.authentication.login.state.AuthenticationState) r5
            nm0.l.b(r6)
            goto L83
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            nm0.l.b(r6)
            boolean r6 = r5 instanceof com.withings.library.authentication.login.state.LoggedIn
            if (r6 == 0) goto L49
            com.withings.library.authentication.host.session.PreviousSessionRepository r6 = r4.getPreviousSessionRepository()
            r2 = r5
            com.withings.library.authentication.login.state.LoggedIn r2 = (com.withings.library.authentication.login.state.LoggedIn) r2
            java.util.List r2 = r2.getSessions()
            r6.saveSessions(r2)
            goto L76
        L49:
            boolean r6 = r5 instanceof com.withings.library.authentication.login.state.NeedCode2FA
            if (r6 == 0) goto L60
            com.withings.library.authentication.host.session.PreviousSessionRepository r6 = r4.getPreviousSessionRepository()
            r2 = r5
            com.withings.library.authentication.login.state.NeedCode2FA r2 = (com.withings.library.authentication.login.state.NeedCode2FA) r2
            com.withings.library.authentication.login.Session r2 = r2.getSession()
            java.util.List r2 = kotlin.collections.x.V(r2)
            r6.saveSessions(r2)
            goto L76
        L60:
            boolean r6 = r5 instanceof com.withings.library.authentication.login.state.NeedPhoneNumber2FACreation
            if (r6 == 0) goto L76
            com.withings.library.authentication.host.session.PreviousSessionRepository r6 = r4.getPreviousSessionRepository()
            r2 = r5
            com.withings.library.authentication.login.state.NeedPhoneNumber2FACreation r2 = (com.withings.library.authentication.login.state.NeedPhoneNumber2FACreation) r2
            com.withings.library.authentication.login.Session r2 = r2.getSession()
            java.util.List r2 = kotlin.collections.x.V(r2)
            r6.saveSessions(r2)
        L76:
            kotlinx.coroutines.flow.MutableStateFlow<com.withings.library.authentication.login.state.AuthenticationState> r6 = r4._currentState
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r6.emit(r5, r0)
            if (r6 != r1) goto L83
            return r1
        L83:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.login.AuthenticationServiceImpl.pushNewState(com.withings.library.authentication.login.state.AuthenticationState, qm0.d):java.lang.Object");
    }
}
