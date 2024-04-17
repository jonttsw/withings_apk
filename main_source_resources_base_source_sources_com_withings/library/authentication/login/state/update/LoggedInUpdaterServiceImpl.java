package com.withings.library.authentication.login.state.update;

import com.withings.library.authentication.login.AuthenticationService;
import com.withings.library.authentication.login.MutableAuthenticationService;
import com.withings.library.authentication.login.state.factory.LoggedInFactory;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import nm0.g;
import nm0.h;
import org.jivesoftware.smack.packet.Session;
import pq0.a;
/* compiled from: LoggedInUpdaterServiceImpl.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/withings/library/authentication/login/state/update/LoggedInUpdaterServiceImpl;", "Lcom/withings/library/authentication/login/state/update/LoggedInUpdaterService;", "Lpq0/a;", "Lcom/withings/library/authentication/login/Session;", Session.ELEMENT, "Lnm0/y;", "updateLoggedInWithSession", "(Lcom/withings/library/authentication/login/Session;Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/authentication/login/AuthenticationService;", "authenticationService$delegate", "Lnm0/g;", "getAuthenticationService", "()Lcom/withings/library/authentication/login/AuthenticationService;", "authenticationService", "Lcom/withings/library/authentication/login/MutableAuthenticationService;", "mutableAuthenticationService$delegate", "getMutableAuthenticationService", "()Lcom/withings/library/authentication/login/MutableAuthenticationService;", "mutableAuthenticationService", "Lcom/withings/library/authentication/login/state/factory/LoggedInFactory;", "loggedInFactory$delegate", "getLoggedInFactory", "()Lcom/withings/library/authentication/login/state/factory/LoggedInFactory;", "loggedInFactory", "<init>", "()V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class LoggedInUpdaterServiceImpl implements LoggedInUpdaterService, a {
    private final g authenticationService$delegate;
    private final g loggedInFactory$delegate;
    private final g mutableAuthenticationService$delegate;

    public LoggedInUpdaterServiceImpl() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f76136a;
        this.authenticationService$delegate = h.a(lazyThreadSafetyMode, new LoggedInUpdaterServiceImpl$special$$inlined$inject$default$1(this, null, null));
        this.mutableAuthenticationService$delegate = h.a(lazyThreadSafetyMode, new LoggedInUpdaterServiceImpl$special$$inlined$inject$default$2(this, null, null));
        this.loggedInFactory$delegate = h.a(lazyThreadSafetyMode, new LoggedInUpdaterServiceImpl$special$$inlined$inject$default$3(this, null, null));
    }

    private final AuthenticationService getAuthenticationService() {
        return (AuthenticationService) this.authenticationService$delegate.getValue();
    }

    private final LoggedInFactory getLoggedInFactory() {
        return (LoggedInFactory) this.loggedInFactory$delegate.getValue();
    }

    private final MutableAuthenticationService getMutableAuthenticationService() {
        return (MutableAuthenticationService) this.mutableAuthenticationService$delegate.getValue();
    }

    @Override // pq0.a
    public oq0.a getKoin() {
        return qq0.a.f93676a.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bc  */
    @Override // com.withings.library.authentication.login.state.update.LoggedInUpdaterService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object updateLoggedInWithSession(com.withings.library.authentication.login.Session r12, qm0.d<? super nm0.y> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.withings.library.authentication.login.state.update.LoggedInUpdaterServiceImpl$updateLoggedInWithSession$1
            if (r0 == 0) goto L13
            r0 = r13
            com.withings.library.authentication.login.state.update.LoggedInUpdaterServiceImpl$updateLoggedInWithSession$1 r0 = (com.withings.library.authentication.login.state.update.LoggedInUpdaterServiceImpl$updateLoggedInWithSession$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.library.authentication.login.state.update.LoggedInUpdaterServiceImpl$updateLoggedInWithSession$1 r0 = new com.withings.library.authentication.login.state.update.LoggedInUpdaterServiceImpl$updateLoggedInWithSession$1
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L3f
            if (r2 == r3) goto L33
            if (r2 != r4) goto L2b
            nm0.l.b(r13)
            goto Lb9
        L2b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L33:
            java.lang.Object r12 = r0.L$1
            com.withings.library.authentication.login.Session r12 = (com.withings.library.authentication.login.Session) r12
            java.lang.Object r2 = r0.L$0
            com.withings.library.authentication.login.state.update.LoggedInUpdaterServiceImpl r2 = (com.withings.library.authentication.login.state.update.LoggedInUpdaterServiceImpl) r2
            nm0.l.b(r13)
            goto L54
        L3f:
            nm0.l.b(r13)
            com.withings.library.authentication.login.AuthenticationService r13 = r11.getAuthenticationService()
            r0.L$0 = r11
            r0.L$1 = r12
            r0.label = r3
            java.lang.Object r13 = r13.getState(r0)
            if (r13 != r1) goto L53
            return r1
        L53:
            r2 = r11
        L54:
            com.withings.library.authentication.login.state.AuthenticationState r13 = (com.withings.library.authentication.login.state.AuthenticationState) r13
            boolean r3 = r13 instanceof com.withings.library.authentication.login.state.LoggedIn
            if (r3 == 0) goto Lbc
            com.withings.library.authentication.login.state.LoggedIn r13 = (com.withings.library.authentication.login.state.LoggedIn) r13
            java.util.List r13 = r13.getSessions()
            java.util.Collection r13 = (java.util.Collection) r13
            java.util.ArrayList r13 = kotlin.collections.x.S0(r13)
            java.util.Iterator r3 = r13.iterator()
            r5 = 0
        L6b:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L95
            java.lang.Object r6 = r3.next()
            com.withings.library.authentication.login.Session r6 = (com.withings.library.authentication.login.Session) r6
            long r7 = r12.getAccountId()
            long r9 = r6.getAccountId()
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 != 0) goto L92
            com.withings.library.authentication.login.Server r7 = r12.getServer()
            com.withings.library.authentication.login.Server r6 = r6.getServer()
            boolean r6 = kotlin.jvm.internal.u.e(r7, r6)
            if (r6 == 0) goto L92
            goto L96
        L92:
            int r5 = r5 + 1
            goto L6b
        L95:
            r5 = -1
        L96:
            if (r5 < 0) goto L9c
            r13.set(r5, r12)
            goto L9f
        L9c:
            r13.add(r12)
        L9f:
            com.withings.library.authentication.login.state.factory.LoggedInFactory r12 = r2.getLoggedInFactory()
            com.withings.library.authentication.login.state.LoggedIn r12 = r12.buildLoggedInWithRepo(r13)
            com.withings.library.authentication.login.MutableAuthenticationService r13 = r2.getMutableAuthenticationService()
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r4
            java.lang.Object r12 = r13.pushNewState(r12, r0)
            if (r12 != r1) goto Lb9
            return r1
        Lb9:
            nm0.y r12 = nm0.y.f85009a
            return r12
        Lbc:
            boolean r12 = r13 instanceof com.withings.library.authentication.login.state.LoggedOut
            if (r12 == 0) goto Lc1
            goto Ld2
        Lc1:
            boolean r12 = r13 instanceof com.withings.library.authentication.login.state.NeedAccountCreation
            if (r12 == 0) goto Lc6
            goto Ld2
        Lc6:
            boolean r12 = r13 instanceof com.withings.library.authentication.login.state.NeedCode2FA
            if (r12 == 0) goto Lcb
            goto Ld2
        Lcb:
            boolean r12 = r13 instanceof com.withings.library.authentication.login.state.NeedMailResult
            if (r12 == 0) goto Ld0
            goto Ld2
        Ld0:
            boolean r12 = r13 instanceof com.withings.library.authentication.login.state.NeedPhoneNumber2FACreation
        Ld2:
            nm0.y r12 = nm0.y.f85009a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.login.state.update.LoggedInUpdaterServiceImpl.updateLoggedInWithSession(com.withings.library.authentication.login.Session, qm0.d):java.lang.Object");
    }
}
