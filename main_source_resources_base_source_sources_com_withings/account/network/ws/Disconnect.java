package com.withings.account.network.ws;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import vf.d;
/* compiled from: Disconnect.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/withings/account/network/ws/Disconnect;", "", "Lcom/withings/account/core/model/Account;", "account", "Lnm0/y;", "logout", "(Lcom/withings/account/core/model/Account;Lqm0/d;)Ljava/lang/Object;", "run", "Lcom/withings/account/network/ws/SessionRemoteRepository;", "sessionRemoteRepository", "Lcom/withings/account/network/ws/SessionRemoteRepository;", "Lyf/d;", "healthmateSessionDao", "Lyf/d;", "Lvf/d;", "fcmRegisterer", "Lvf/d;", "<init>", "(Lcom/withings/account/network/ws/SessionRemoteRepository;Lyf/d;Lvf/d;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class Disconnect {
    public static final int $stable = 0;
    private final d fcmRegisterer;
    private final yf.d healthmateSessionDao;
    private final SessionRemoteRepository sessionRemoteRepository;

    @Inject
    public Disconnect(SessionRemoteRepository sessionRemoteRepository, yf.d healthmateSessionDao, d fcmRegisterer) {
        u.j(sessionRemoteRepository, "sessionRemoteRepository");
        u.j(healthmateSessionDao, "healthmateSessionDao");
        u.j(fcmRegisterer, "fcmRegisterer");
        this.sessionRemoteRepository = sessionRemoteRepository;
        this.healthmateSessionDao = healthmateSessionDao;
        this.fcmRegisterer = fcmRegisterer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(6:5|6|7|(1:(1:(6:11|12|13|(1:15)|16|17)(2:20|21))(1:22))(2:39|(1:41)(1:42))|23|(2:37|38)(10:27|(1:29)(1:36)|(1:31)(1:35)|32|(1:34)|12|13|(0)|16|17)))|45|6|7|(0)(0)|23|(1:25)|37|38) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a1, code lost:
        r8 = nm0.l.a(r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object logout(com.withings.account.core.model.Account r8, qm0.d<? super nm0.y> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.withings.account.network.ws.Disconnect$logout$1
            if (r0 == 0) goto L13
            r0 = r9
            com.withings.account.network.ws.Disconnect$logout$1 r0 = (com.withings.account.network.ws.Disconnect$logout$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.account.network.ws.Disconnect$logout$1 r0 = new com.withings.account.network.ws.Disconnect$logout$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            nm0.l.b(r9)     // Catch: java.lang.Throwable -> L2b
            goto L9e
        L2b:
            r8 = move-exception
            goto La1
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            java.lang.Object r8 = r0.L$1
            com.withings.account.core.model.Account r8 = (com.withings.account.core.model.Account) r8
            java.lang.Object r2 = r0.L$0
            com.withings.account.network.ws.Disconnect r2 = (com.withings.account.network.ws.Disconnect) r2
            nm0.l.b(r9)
            goto L59
        L42:
            nm0.l.b(r9)
            yf.d r9 = r7.healthmateSessionDao
            long r5 = r8.e()
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r9 = r9.c(r5, r0)
            if (r9 != r1) goto L58
            return r1
        L58:
            r2 = r7
        L59:
            sf.d r9 = (sf.d) r9
            if (r9 == 0) goto Lb1
            java.lang.String r9 = r9.n()
            if (r9 != 0) goto L64
            goto Lb1
        L64:
            com.withings.account.core.model.Account$b r4 = r8.i()     // Catch: java.lang.Throwable -> L2b
            sf.c r4 = r4.d()     // Catch: java.lang.Throwable -> L2b
            boolean r5 = r4 instanceof sf.c.b     // Catch: java.lang.Throwable -> L2b
            r6 = 0
            if (r5 == 0) goto L74
            sf.c$b r4 = (sf.c.b) r4     // Catch: java.lang.Throwable -> L2b
            goto L75
        L74:
            r4 = r6
        L75:
            if (r4 == 0) goto L7c
            java.lang.String r4 = r4.a()     // Catch: java.lang.Throwable -> L2b
            goto L7d
        L7c:
            r4 = r6
        L7d:
            com.withings.account.network.ws.SessionRemoteRepository r2 = r2.sessionRemoteRepository     // Catch: java.lang.Throwable -> L2b
            java.lang.String r5 = "disconnect"
            com.withings.account.network.ws.SessionRemoteRepository r2 = r2.withSyncContext(r5)     // Catch: java.lang.Throwable -> L2b
            com.withings.account.core.model.Account$b r8 = r8.i()     // Catch: java.lang.Throwable -> L2b
            sf.c r8 = r8.d()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r8 = r8.b()     // Catch: java.lang.Throwable -> L2b
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L2b
            r0.L$1 = r6     // Catch: java.lang.Throwable -> L2b
            r0.label = r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r8 = r2.logout(r9, r4, r8, r0)     // Catch: java.lang.Throwable -> L2b
            if (r8 != r1) goto L9e
            return r1
        L9e:
            nm0.y r8 = nm0.y.f85009a     // Catch: java.lang.Throwable -> L2b
            goto La5
        La1:
            nm0.k$a r8 = nm0.l.a(r8)
        La5:
            java.lang.Throwable r8 = nm0.k.b(r8)
            if (r8 == 0) goto Lae
            x70.b.n(r8)
        Lae:
            nm0.y r8 = nm0.y.f85009a
            return r8
        Lb1:
            nm0.y r8 = nm0.y.f85009a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.account.network.ws.Disconnect.logout(com.withings.account.core.model.Account, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:3|(11:5|6|7|(1:(1:(6:11|12|13|(1:15)|16|17)(2:20|21))(3:22|23|24))(4:28|29|(2:33|(1:35))|36)|25|(1:27)|12|13|(0)|16|17))|39|6|7|(0)(0)|25|(0)|12|13|(0)|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0079, code lost:
        r6 = nm0.l.a(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object run(com.withings.account.core.model.Account r6, qm0.d<? super nm0.y> r7) throws java.lang.Exception {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.withings.account.network.ws.Disconnect$run$1
            if (r0 == 0) goto L13
            r0 = r7
            com.withings.account.network.ws.Disconnect$run$1 r0 = (com.withings.account.network.ws.Disconnect$run$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.account.network.ws.Disconnect$run$1 r0 = new com.withings.account.network.ws.Disconnect$run$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            nm0.l.b(r7)     // Catch: java.lang.Throwable -> L2a
            goto L76
        L2a:
            r6 = move-exception
            goto L79
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.L$1
            com.withings.account.network.ws.Disconnect r6 = (com.withings.account.network.ws.Disconnect) r6
            java.lang.Object r2 = r0.L$0
            com.withings.account.core.model.Account r2 = (com.withings.account.core.model.Account) r2
            nm0.l.b(r7)     // Catch: java.lang.Throwable -> L2a
            r7 = r6
            r6 = r2
            goto L68
        L42:
            nm0.l.b(r7)
            java.lang.String r7 = r6.b()     // Catch: java.lang.Throwable -> L2a
            boolean r7 = dp0.j.D(r7)     // Catch: java.lang.Throwable -> L2a
            r7 = r7 ^ r4
            if (r7 == 0) goto L67
            vf.d r7 = r5.fcmRegisterer     // Catch: java.lang.Throwable -> L2a
            int r7 = r7.b()     // Catch: java.lang.Throwable -> L2a
            if (r7 < 0) goto L67
            vf.d r7 = r5.fcmRegisterer     // Catch: java.lang.Throwable -> L2a
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L2a
            r0.L$1 = r5     // Catch: java.lang.Throwable -> L2a
            r0.label = r4     // Catch: java.lang.Throwable -> L2a
            nm0.y r7 = r7.a()     // Catch: java.lang.Throwable -> L2a
            if (r7 != r1) goto L67
            return r1
        L67:
            r7 = r5
        L68:
            r2 = 0
            r0.L$0 = r2     // Catch: java.lang.Throwable -> L2a
            r0.L$1 = r2     // Catch: java.lang.Throwable -> L2a
            r0.label = r3     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r6 = r7.logout(r6, r0)     // Catch: java.lang.Throwable -> L2a
            if (r6 != r1) goto L76
            return r1
        L76:
            nm0.y r6 = nm0.y.f85009a     // Catch: java.lang.Throwable -> L2a
            goto L7d
        L79:
            nm0.k$a r6 = nm0.l.a(r6)
        L7d:
            java.lang.Throwable r6 = nm0.k.b(r6)
            if (r6 == 0) goto L86
            x70.b.n(r6)
        L86:
            nm0.y r6 = nm0.y.f85009a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.account.network.ws.Disconnect.run(com.withings.account.core.model.Account, qm0.d):java.lang.Object");
    }
}
