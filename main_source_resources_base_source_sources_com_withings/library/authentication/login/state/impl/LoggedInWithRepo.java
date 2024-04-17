package com.withings.library.authentication.login.state.impl;

import com.withings.library.authentication.api.account.AccountContext;
import com.withings.library.authentication.login.MutableAuthenticationService;
import com.withings.library.authentication.login.Server;
import com.withings.library.authentication.login.state.LoggedIn;
import com.withings.library.authentication.login.state.LoggedOut;
import com.withings.library.authentication.login.state.NeedCode2FA;
import com.withings.library.authentication.login.state.NeedPhoneNumber2FACreation;
import com.withings.library.authentication.login.state.factory.LoggedInFactory;
import com.withings.library.authentication.login.state.factory.LoggedOutFactory;
import com.withings.library.authentication.login.state.factory.NeedCode2FAFactory;
import com.withings.library.authentication.login.state.factory.NeedPhoneNumber2FACreationFactory;
import com.withings.library.authentication.updateaccount.AccountContextRequest;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
import org.jivesoftware.smack.packet.Session;
import pq0.a;
import qm0.d;
/* compiled from: LoggedInWithRepo.kt */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010&\u001a\u00020\u0001¢\u0006\u0004\bF\u0010GJ\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0006J\u0013\u0010\u0004\u001a\u00020\u0007*\u00020\u0007H\u0002¢\u0006\u0004\b\u0004\u0010\bJ\u0013\u0010\u0004\u001a\u00020\t*\u00020\tH\u0002¢\u0006\u0004\b\u0004\u0010\nJ\u0013\u0010\f\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\rJ\u001b\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0096@ø\u0001\u0000¢\u0006\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001b\u00102\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b0\u00101R\u001b\u00107\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010*\u001a\u0004\b5\u00106R\u001b\u0010<\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010*\u001a\u0004\b:\u0010;R\u001b\u0010A\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010*\u001a\u0004\b?\u0010@R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\u000e0B8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010D\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006H"}, d2 = {"Lcom/withings/library/authentication/login/state/impl/LoggedInWithRepo;", "Lcom/withings/library/authentication/login/state/LoggedIn;", "Lpq0/a;", "Lcom/withings/library/authentication/login/state/LoggedOut;", "withRepo", "(Lcom/withings/library/authentication/login/state/LoggedOut;)Lcom/withings/library/authentication/login/state/LoggedOut;", "(Lcom/withings/library/authentication/login/state/LoggedIn;)Lcom/withings/library/authentication/login/state/LoggedIn;", "Lcom/withings/library/authentication/login/state/NeedCode2FA;", "(Lcom/withings/library/authentication/login/state/NeedCode2FA;)Lcom/withings/library/authentication/login/state/NeedCode2FA;", "Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation;", "(Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation;)Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation;", "Lcom/withings/library/authentication/login/state/LoggedIn$LogoutOutputState;", "logout", "(Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/authentication/login/Session;", Session.ELEMENT, "Lcom/withings/library/authentication/login/state/LoggedIn$RenewOutputState;", "renewSession", "(Lcom/withings/library/authentication/login/Session;Lqm0/d;)Ljava/lang/Object;", "", "force", "renewSessions", "(ZLqm0/d;)Ljava/lang/Object;", "renewAndRetrieveSessions", "Lcom/withings/library/authentication/updateaccount/AccountContextRequest;", "accountContextRequest", "Lcom/withings/library/authentication/login/state/LoggedIn$UpdateContextOutputState;", "updateAccountContext", "(Lcom/withings/library/authentication/updateaccount/AccountContextRequest;Lqm0/d;)Ljava/lang/Object;", "", "sessionId", "", "accountId", "Lcom/withings/library/authentication/login/Server;", "server", "Lcom/withings/library/authentication/api/account/AccountContext;", "getAccountContext", "(Ljava/lang/String;JLcom/withings/library/authentication/login/Server;Lqm0/d;)Ljava/lang/Object;", "delegate", "Lcom/withings/library/authentication/login/state/LoggedIn;", "Lcom/withings/library/authentication/login/MutableAuthenticationService;", "mutableAuthenticationService$delegate", "Lnm0/g;", "getMutableAuthenticationService", "()Lcom/withings/library/authentication/login/MutableAuthenticationService;", "mutableAuthenticationService", "Lcom/withings/library/authentication/login/state/factory/LoggedOutFactory;", "loggedOutFactory$delegate", "getLoggedOutFactory", "()Lcom/withings/library/authentication/login/state/factory/LoggedOutFactory;", "loggedOutFactory", "Lcom/withings/library/authentication/login/state/factory/LoggedInFactory;", "loggedInFactory$delegate", "getLoggedInFactory", "()Lcom/withings/library/authentication/login/state/factory/LoggedInFactory;", "loggedInFactory", "Lcom/withings/library/authentication/login/state/factory/NeedCode2FAFactory;", "needCode2FAFactory$delegate", "getNeedCode2FAFactory", "()Lcom/withings/library/authentication/login/state/factory/NeedCode2FAFactory;", "needCode2FAFactory", "Lcom/withings/library/authentication/login/state/factory/NeedPhoneNumber2FACreationFactory;", "needPhoneNumber2FACreationFactory$delegate", "getNeedPhoneNumber2FACreationFactory", "()Lcom/withings/library/authentication/login/state/factory/NeedPhoneNumber2FACreationFactory;", "needPhoneNumber2FACreationFactory", "", "getSessions", "()Ljava/util/List;", "sessions", "<init>", "(Lcom/withings/library/authentication/login/state/LoggedIn;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class LoggedInWithRepo implements LoggedIn, a {
    private final LoggedIn delegate;
    private final g loggedInFactory$delegate;
    private final g loggedOutFactory$delegate;
    private final g mutableAuthenticationService$delegate;
    private final g needCode2FAFactory$delegate;
    private final g needPhoneNumber2FACreationFactory$delegate;

    public LoggedInWithRepo(LoggedIn delegate) {
        u.j(delegate, "delegate");
        this.delegate = delegate;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f76136a;
        this.mutableAuthenticationService$delegate = h.a(lazyThreadSafetyMode, new LoggedInWithRepo$special$$inlined$inject$default$1(this, null, null));
        this.loggedOutFactory$delegate = h.a(lazyThreadSafetyMode, new LoggedInWithRepo$special$$inlined$inject$default$2(this, null, null));
        this.loggedInFactory$delegate = h.a(lazyThreadSafetyMode, new LoggedInWithRepo$special$$inlined$inject$default$3(this, null, null));
        this.needCode2FAFactory$delegate = h.a(lazyThreadSafetyMode, new LoggedInWithRepo$special$$inlined$inject$default$4(this, null, null));
        this.needPhoneNumber2FACreationFactory$delegate = h.a(lazyThreadSafetyMode, new LoggedInWithRepo$special$$inlined$inject$default$5(this, null, null));
    }

    private final LoggedInFactory getLoggedInFactory() {
        return (LoggedInFactory) this.loggedInFactory$delegate.getValue();
    }

    private final LoggedOutFactory getLoggedOutFactory() {
        return (LoggedOutFactory) this.loggedOutFactory$delegate.getValue();
    }

    private final MutableAuthenticationService getMutableAuthenticationService() {
        return (MutableAuthenticationService) this.mutableAuthenticationService$delegate.getValue();
    }

    private final NeedCode2FAFactory getNeedCode2FAFactory() {
        return (NeedCode2FAFactory) this.needCode2FAFactory$delegate.getValue();
    }

    private final NeedPhoneNumber2FACreationFactory getNeedPhoneNumber2FACreationFactory() {
        return (NeedPhoneNumber2FACreationFactory) this.needPhoneNumber2FACreationFactory$delegate.getValue();
    }

    private final LoggedOut withRepo(LoggedOut loggedOut) {
        return getLoggedOutFactory().buildLoggedOutWithRepo(loggedOut);
    }

    @Override // com.withings.library.authentication.login.state.LoggedIn
    public Object getAccountContext(String str, long j5, Server server, d<? super AccountContext> dVar) {
        return this.delegate.getAccountContext(str, j5, server, dVar);
    }

    @Override // pq0.a
    public oq0.a getKoin() {
        return qq0.a.f93676a.a();
    }

    @Override // com.withings.library.authentication.login.state.LoggedIn
    public List<com.withings.library.authentication.login.Session> getSessions() {
        return this.delegate.getSessions();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    @Override // com.withings.library.authentication.login.state.LoggedIn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object logout(qm0.d<? super com.withings.library.authentication.login.state.LoggedIn.LogoutOutputState> r11) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.login.state.impl.LoggedInWithRepo.logout(qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
    @Override // com.withings.library.authentication.login.state.LoggedIn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object renewAndRetrieveSessions(qm0.d<? super com.withings.library.authentication.login.state.LoggedIn.RenewOutputState> r7) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.login.state.impl.LoggedInWithRepo.renewAndRetrieveSessions(qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
    @Override // com.withings.library.authentication.login.state.LoggedIn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object renewSession(com.withings.library.authentication.login.Session r6, qm0.d<? super com.withings.library.authentication.login.state.LoggedIn.RenewOutputState> r7) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.login.state.impl.LoggedInWithRepo.renewSession(com.withings.library.authentication.login.Session, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
    @Override // com.withings.library.authentication.login.state.LoggedIn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object renewSessions(boolean r6, qm0.d<? super com.withings.library.authentication.login.state.LoggedIn.RenewOutputState> r7) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.login.state.impl.LoggedInWithRepo.renewSessions(boolean, qm0.d):java.lang.Object");
    }

    @Override // com.withings.library.authentication.login.state.LoggedIn
    public Object updateAccountContext(AccountContextRequest accountContextRequest, d<? super LoggedIn.UpdateContextOutputState> dVar) {
        return this.delegate.updateAccountContext(accountContextRequest, dVar);
    }

    private final LoggedIn withRepo(LoggedIn loggedIn) {
        return getLoggedInFactory().buildLoggedInWithRepo(loggedIn);
    }

    private final NeedCode2FA withRepo(NeedCode2FA needCode2FA) {
        return getNeedCode2FAFactory().buildNeedCode2FAWithRepo(needCode2FA);
    }

    private final NeedPhoneNumber2FACreation withRepo(NeedPhoneNumber2FACreation needPhoneNumber2FACreation) {
        return getNeedPhoneNumber2FACreationFactory().buildNeedPhoneNumber2FACreationWithRepo(needPhoneNumber2FACreation);
    }
}
