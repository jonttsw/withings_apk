package com.withings.library.authentication.login.state.factory;

import com.withings.library.authentication.api.account.AccountApi;
import com.withings.library.authentication.di.KoinKt;
import com.withings.library.authentication.host.device.DeviceInformationProvider;
import com.withings.library.authentication.login.Session;
import com.withings.library.authentication.login.state.LoggedIn;
import com.withings.library.authentication.login.state.impl.LoggedInImpl;
import com.withings.library.authentication.login.state.impl.LoggedInWithRepo;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
import pq0.a;
import v9.e;
/* compiled from: LoggedInFactoryImpl.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\f\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016¢\u0006\u0004\b\f\u0010\bR\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lcom/withings/library/authentication/login/state/factory/LoggedInFactoryImpl;", "Lcom/withings/library/authentication/login/state/factory/LoggedInFactory;", "Lpq0/a;", "", "Lcom/withings/library/authentication/login/Session;", "sessions", "Lcom/withings/library/authentication/login/state/LoggedIn;", "buildLoggedIn", "(Ljava/util/List;)Lcom/withings/library/authentication/login/state/LoggedIn;", "buildLoggedInWithPartnerSessionRetrieving", "(Ljava/util/List;Lqm0/d;)Ljava/lang/Object;", "loggedIn", "buildLoggedInWithRepo", "(Lcom/withings/library/authentication/login/state/LoggedIn;)Lcom/withings/library/authentication/login/state/LoggedIn;", "Lcom/withings/library/authentication/api/account/AccountApi;", "accountApi$delegate", "Lnm0/g;", "getAccountApi", "()Lcom/withings/library/authentication/api/account/AccountApi;", "accountApi", "Lcom/withings/library/authentication/host/device/DeviceInformationProvider;", "deviceInformationProvider$delegate", "getDeviceInformationProvider", "()Lcom/withings/library/authentication/host/device/DeviceInformationProvider;", "deviceInformationProvider", "Lv9/e;", "log$delegate", "getLog", "()Lv9/e;", "log", "<init>", "()V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class LoggedInFactoryImpl implements LoggedInFactory, a {
    private final g accountApi$delegate;
    private final g deviceInformationProvider$delegate;
    private final g log$delegate;

    public LoggedInFactoryImpl() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f76136a;
        this.accountApi$delegate = h.a(lazyThreadSafetyMode, new LoggedInFactoryImpl$special$$inlined$inject$default$1(this, null, null));
        this.deviceInformationProvider$delegate = h.a(lazyThreadSafetyMode, new LoggedInFactoryImpl$special$$inlined$inject$default$2(this, null, null));
        this.log$delegate = KoinKt.injectLogger(this, "LoggedInFactory");
    }

    private final AccountApi getAccountApi() {
        return (AccountApi) this.accountApi$delegate.getValue();
    }

    private final DeviceInformationProvider getDeviceInformationProvider() {
        return (DeviceInformationProvider) this.deviceInformationProvider$delegate.getValue();
    }

    private final e getLog() {
        return (e) this.log$delegate.getValue();
    }

    @Override // com.withings.library.authentication.login.state.factory.LoggedInFactory
    public LoggedIn buildLoggedIn(List<Session> sessions) {
        u.j(sessions, "sessions");
        return new LoggedInImpl(sessions);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061 A[Catch: Exception -> 0x00a8, TRY_LEAVE, TryCatch #2 {Exception -> 0x00a8, blocks: (B:21:0x005b, B:23:0x0061), top: B:40:0x005b }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0091 -> B:27:0x0093). Please submit an issue!!! */
    @Override // com.withings.library.authentication.login.state.factory.LoggedInFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object buildLoggedInWithPartnerSessionRetrieving(java.util.List<com.withings.library.authentication.login.Session> r11, qm0.d<? super com.withings.library.authentication.login.state.LoggedIn> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.withings.library.authentication.login.state.factory.LoggedInFactoryImpl$buildLoggedInWithPartnerSessionRetrieving$1
            if (r0 == 0) goto L13
            r0 = r12
            com.withings.library.authentication.login.state.factory.LoggedInFactoryImpl$buildLoggedInWithPartnerSessionRetrieving$1 r0 = (com.withings.library.authentication.login.state.factory.LoggedInFactoryImpl$buildLoggedInWithPartnerSessionRetrieving$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.library.authentication.login.state.factory.LoggedInFactoryImpl$buildLoggedInWithPartnerSessionRetrieving$1 r0 = new com.withings.library.authentication.login.state.factory.LoggedInFactoryImpl$buildLoggedInWithPartnerSessionRetrieving$1
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L4a
            if (r2 != r3) goto L42
            java.lang.Object r11 = r0.L$5
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r2 = r0.L$4
            com.withings.library.authentication.login.Session r2 = (com.withings.library.authentication.login.Session) r2
            java.lang.Object r4 = r0.L$3
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r5 = r0.L$2
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r6 = r0.L$1
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r0.L$0
            com.withings.library.authentication.login.state.factory.LoggedInFactoryImpl r7 = (com.withings.library.authentication.login.state.factory.LoggedInFactoryImpl) r7
            nm0.l.b(r12)     // Catch: java.lang.Exception -> L3f
            goto L93
        L3f:
            r11 = move-exception
            goto Laf
        L42:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L4a:
            nm0.l.b(r12)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r12 = r11
            java.lang.Iterable r12 = (java.lang.Iterable) r12     // Catch: java.lang.Exception -> Lac
            java.util.Iterator r12 = r12.iterator()     // Catch: java.lang.Exception -> Lac
            r7 = r10
            r4 = r12
        L5b:
            boolean r12 = r4.hasNext()     // Catch: java.lang.Exception -> La8
            if (r12 == 0) goto Lc5
            java.lang.Object r12 = r4.next()     // Catch: java.lang.Exception -> La8
            r2 = r12
            com.withings.library.authentication.login.Session r2 = (com.withings.library.authentication.login.Session) r2     // Catch: java.lang.Exception -> La8
            com.withings.library.authentication.api.account.AccountApi r12 = r7.getAccountApi()     // Catch: java.lang.Exception -> La8
            java.lang.String r6 = r2.getSessionId()     // Catch: java.lang.Exception -> La8
            com.withings.library.authentication.host.device.DeviceInformationProvider r8 = r7.getDeviceInformationProvider()     // Catch: java.lang.Exception -> La8
            java.lang.String r8 = r8.getDeviceId()     // Catch: java.lang.Exception -> La8
            com.withings.library.authentication.login.Server r9 = r2.getServer()     // Catch: java.lang.Exception -> La8
            r0.L$0 = r7     // Catch: java.lang.Exception -> La8
            r0.L$1 = r11     // Catch: java.lang.Exception -> La8
            r0.L$2 = r5     // Catch: java.lang.Exception -> La8
            r0.L$3 = r4     // Catch: java.lang.Exception -> La8
            r0.L$4 = r2     // Catch: java.lang.Exception -> La8
            r0.L$5 = r5     // Catch: java.lang.Exception -> La8
            r0.label = r3     // Catch: java.lang.Exception -> La8
            java.lang.Object r12 = r12.requestPartnerSession(r6, r8, r9, r0)     // Catch: java.lang.Exception -> La8
            if (r12 != r1) goto L91
            return r1
        L91:
            r6 = r11
            r11 = r5
        L93:
            com.withings.library.authentication.api.account.partnersession.PartnerSessionResponse r12 = (com.withings.library.authentication.api.account.partnersession.PartnerSessionResponse) r12     // Catch: java.lang.Exception -> L3f
            com.withings.library.authentication.login.Server r8 = r2.getServer()     // Catch: java.lang.Exception -> L3f
            com.withings.library.authentication.login.LoginMethod r2 = r2.getLoginMethod()     // Catch: java.lang.Exception -> L3f
            java.util.List r12 = com.withings.library.authentication.api.account.partnersession.PartnerSessionResponseKt.toSessions(r12, r8, r2)     // Catch: java.lang.Exception -> L3f
            java.util.Collection r12 = (java.util.Collection) r12     // Catch: java.lang.Exception -> L3f
            r11.addAll(r12)     // Catch: java.lang.Exception -> L3f
            r11 = r6
            goto L5b
        La8:
            r12 = move-exception
        La9:
            r6 = r11
            r11 = r12
            goto Laf
        Lac:
            r12 = move-exception
            r7 = r10
            goto La9
        Laf:
            v9.e r12 = r7.getLog()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Exception during partner session creation : "
            r0.<init>(r1)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            r12.a(r11)
            r11 = r6
        Lc5:
            java.util.Collection r11 = (java.util.Collection) r11
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r11 = kotlin.collections.x.l0(r5, r11)
            com.withings.library.authentication.login.state.LoggedIn r11 = r7.buildLoggedIn(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.login.state.factory.LoggedInFactoryImpl.buildLoggedInWithPartnerSessionRetrieving(java.util.List, qm0.d):java.lang.Object");
    }

    @Override // com.withings.library.authentication.login.state.factory.LoggedInFactory
    public LoggedIn buildLoggedInWithRepo(LoggedIn loggedIn) {
        u.j(loggedIn, "loggedIn");
        return new LoggedInWithRepo(loggedIn);
    }

    @Override // pq0.a
    public oq0.a getKoin() {
        return qq0.a.f93676a.a();
    }

    @Override // com.withings.library.authentication.login.state.factory.LoggedInFactory
    public LoggedIn buildLoggedInWithRepo(List<Session> sessions) {
        u.j(sessions, "sessions");
        return new LoggedInWithRepo(buildLoggedIn(sessions));
    }
}
