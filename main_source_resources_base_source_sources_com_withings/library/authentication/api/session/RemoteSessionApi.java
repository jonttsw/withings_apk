package com.withings.library.authentication.api.session;

import com.withings.library.authentication.api.httpclient.HttpClientRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;
/* compiled from: RemoteSessionApi.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0006JC\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013JC\u0010\u0015\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lcom/withings/library/authentication/api/session/RemoteSessionApi;", "Lcom/withings/library/authentication/api/session/SessionApi;", "Lcom/withings/library/authentication/login/Server;", "server", "Lcom/withings/library/authentication/api/session/once/Once;", "getOnce", "(Lcom/withings/library/authentication/login/Server;Lqm0/d;)Ljava/lang/Object;", "Lnm0/y;", "deleteSession", "", "sessionId", XHTMLText.CODE, "deviceUuid", "Lcom/withings/library/authentication/api/VirtualDeviceInformation;", "virtualDeviceInformation", "", "rememberDevice", "Lcom/withings/library/authentication/api/session/RenewResponse;", "renew", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withings/library/authentication/api/VirtualDeviceInformation;ZLcom/withings/library/authentication/login/Server;Lqm0/d;)Ljava/lang/Object;", "recoveryCode", "renewWithRecoveryCode", "Lcom/withings/library/authentication/api/httpclient/HttpClientRepository;", "httpClientRepository", "Lcom/withings/library/authentication/api/httpclient/HttpClientRepository;", "<init>", "(Lcom/withings/library/authentication/api/httpclient/HttpClientRepository;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RemoteSessionApi implements SessionApi {
    private final HttpClientRepository httpClientRepository;

    public RemoteSessionApi(HttpClientRepository httpClientRepository) {
        u.j(httpClientRepository, "httpClientRepository");
        this.httpClientRepository = httpClientRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    @Override // com.withings.library.authentication.api.session.SessionApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object deleteSession(com.withings.library.authentication.login.Server r6, qm0.d<? super nm0.y> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.withings.library.authentication.api.session.RemoteSessionApi$deleteSession$1
            if (r0 == 0) goto L13
            r0 = r7
            com.withings.library.authentication.api.session.RemoteSessionApi$deleteSession$1 r0 = (com.withings.library.authentication.api.session.RemoteSessionApi$deleteSession$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.library.authentication.api.session.RemoteSessionApi$deleteSession$1 r0 = new com.withings.library.authentication.api.session.RemoteSessionApi$deleteSession$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            nm0.l.b(r7)
            goto L7f
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            nm0.l.b(r7)
            goto L5e
        L36:
            nm0.l.b(r7)
            com.withings.library.authentication.api.httpclient.HttpClientRepository r7 = r5.httpClientRepository
            qk0.a r6 = r7.getHttpClient(r6)
            zk0.d r7 = new zk0.d
            r7.<init>()
            com.withings.library.authentication.api.session.RemoteSessionApi$deleteSession$2$1 r2 = com.withings.library.authentication.api.session.RemoteSessionApi$deleteSession$2$1.INSTANCE
            r7.o(r2)
            el0.u r2 = el0.u.c()
            r7.m(r2)
            bl0.g r2 = new bl0.g
            r2.<init>(r7, r6)
            r0.label = r4
            java.lang.Object r7 = r2.b(r0)
            if (r7 != r1) goto L5e
            return r1
        L5e:
            bl0.c r7 = (bl0.c) r7
            rk0.a r6 = r7.b()
            java.lang.Class<com.withings.library.authentication.api.StubResponse> r7 = com.withings.library.authentication.api.StubResponse.class
            fn0.o r2 = kotlin.jvm.internal.q0.l(r7)
            java.lang.reflect.Type r4 = fn0.t.f(r2)
            fn0.d r7 = kotlin.jvm.internal.q0.b(r7)
            kl0.a r7 = androidx.camera.camera2.internal.s2.y(r4, r7, r2)
            r0.label = r3
            java.lang.Object r7 = r6.a(r7, r0)
            if (r7 != r1) goto L7f
            return r1
        L7f:
            if (r7 == 0) goto L86
            com.withings.library.authentication.api.StubResponse r7 = (com.withings.library.authentication.api.StubResponse) r7
            nm0.y r6 = nm0.y.f85009a
            return r6
        L86:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r7 = "null cannot be cast to non-null type com.withings.library.authentication.api.StubResponse"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.api.session.RemoteSessionApi.deleteSession(com.withings.library.authentication.login.Server, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0084  */
    @Override // com.withings.library.authentication.api.session.SessionApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getOnce(com.withings.library.authentication.login.Server r6, qm0.d<? super com.withings.library.authentication.api.session.once.Once> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.withings.library.authentication.api.session.RemoteSessionApi$getOnce$1
            if (r0 == 0) goto L13
            r0 = r7
            com.withings.library.authentication.api.session.RemoteSessionApi$getOnce$1 r0 = (com.withings.library.authentication.api.session.RemoteSessionApi$getOnce$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.library.authentication.api.session.RemoteSessionApi$getOnce$1 r0 = new com.withings.library.authentication.api.session.RemoteSessionApi$getOnce$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            nm0.l.b(r7)
            goto L7f
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            nm0.l.b(r7)
            goto L5e
        L36:
            nm0.l.b(r7)
            com.withings.library.authentication.api.httpclient.HttpClientRepository r7 = r5.httpClientRepository
            qk0.a r6 = r7.getHttpClient(r6)
            zk0.d r7 = new zk0.d
            r7.<init>()
            com.withings.library.authentication.api.session.RemoteSessionApi$getOnce$2$1 r2 = com.withings.library.authentication.api.session.RemoteSessionApi$getOnce$2$1.INSTANCE
            r7.o(r2)
            el0.u r2 = el0.u.a()
            r7.m(r2)
            bl0.g r2 = new bl0.g
            r2.<init>(r7, r6)
            r0.label = r4
            java.lang.Object r7 = r2.b(r0)
            if (r7 != r1) goto L5e
            return r1
        L5e:
            bl0.c r7 = (bl0.c) r7
            rk0.a r6 = r7.b()
            java.lang.Class<com.withings.library.authentication.api.session.once.Once> r7 = com.withings.library.authentication.api.session.once.Once.class
            fn0.o r2 = kotlin.jvm.internal.q0.l(r7)
            java.lang.reflect.Type r4 = fn0.t.f(r2)
            fn0.d r7 = kotlin.jvm.internal.q0.b(r7)
            kl0.a r7 = androidx.camera.camera2.internal.s2.y(r4, r7, r2)
            r0.label = r3
            java.lang.Object r7 = r6.a(r7, r0)
            if (r7 != r1) goto L7f
            return r1
        L7f:
            if (r7 == 0) goto L84
            com.withings.library.authentication.api.session.once.Once r7 = (com.withings.library.authentication.api.session.once.Once) r7
            return r7
        L84:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r7 = "null cannot be cast to non-null type com.withings.library.authentication.api.session.once.Once"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.api.session.RemoteSessionApi.getOnce(com.withings.library.authentication.login.Server, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00df  */
    @Override // com.withings.library.authentication.api.session.SessionApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object renew(java.lang.String r7, java.lang.String r8, java.lang.String r9, com.withings.library.authentication.api.VirtualDeviceInformation r10, boolean r11, com.withings.library.authentication.login.Server r12, qm0.d<? super com.withings.library.authentication.api.session.RenewResponse> r13) {
        /*
            r6 = this;
            boolean r0 = r13 instanceof com.withings.library.authentication.api.session.RemoteSessionApi$renew$1
            if (r0 == 0) goto L13
            r0 = r13
            com.withings.library.authentication.api.session.RemoteSessionApi$renew$1 r0 = (com.withings.library.authentication.api.session.RemoteSessionApi$renew$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.library.authentication.api.session.RemoteSessionApi$renew$1 r0 = new com.withings.library.authentication.api.session.RemoteSessionApi$renew$1
            r0.<init>(r6, r13)
        L18:
            java.lang.Object r13 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            nm0.l.b(r13)
            goto Lda
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            nm0.l.b(r13)
            goto Lb9
        L38:
            nm0.l.b(r13)
            com.withings.library.authentication.api.httpclient.HttpClientRepository r13 = r6.httpClientRepository
            qk0.a r12 = r13.getHttpClient(r12)
            zk0.d r13 = new zk0.d
            r13.<init>()
            com.withings.library.authentication.api.session.RemoteSessionApi$renew$2$1 r2 = com.withings.library.authentication.api.session.RemoteSessionApi$renew$2$1.INSTANCE
            r13.o(r2)
            el0.z$a r2 = el0.z.f65720b
            el0.b0 r2 = el0.d0.a()
            java.lang.String r5 = "sessionid"
            r2.e(r5, r7)
            java.lang.String r7 = "code"
            r2.e(r7, r8)
            java.lang.String r7 = com.withings.library.authentication.utils.api.BooleanToKtorStringKt.toKtorString(r11)
            java.lang.String r8 = "is_secure"
            r2.e(r8, r7)
            java.lang.String r7 = "token"
            r2.e(r7, r9)
            java.lang.String r7 = r10.getModelName()
            java.lang.String r8 = "modelname"
            r2.e(r8, r7)
            java.lang.String r7 = "typename"
            java.lang.String r8 = r10.getTypeName()
            r2.e(r7, r8)
            java.lang.String r7 = "os"
            java.lang.String r8 = r10.getOs()
            r2.e(r7, r8)
            java.lang.String r7 = "apppfm"
            java.lang.String r8 = r10.getOs()
            r2.e(r7, r8)
            java.lang.String r7 = "appliver"
            java.lang.String r8 = r10.getAppVersion()
            r2.e(r7, r8)
            java.lang.String r7 = "appname"
            java.lang.String r8 = r10.getAppName()
            r2.e(r7, r8)
            java.lang.String r7 = "osversion"
            java.lang.String r8 = r10.getOsVersion()
            r2.e(r7, r8)
            el0.z r7 = r2.n()
            bl0.g r7 = androidx.compose.material.n3.c(r7, r13, r13, r12)
            r0.label = r4
            java.lang.Object r13 = r7.b(r0)
            if (r13 != r1) goto Lb9
            return r1
        Lb9:
            bl0.c r13 = (bl0.c) r13
            rk0.a r7 = r13.b()
            java.lang.Class<com.withings.library.authentication.api.session.RenewResponse> r8 = com.withings.library.authentication.api.session.RenewResponse.class
            fn0.o r9 = kotlin.jvm.internal.q0.l(r8)
            java.lang.reflect.Type r10 = fn0.t.f(r9)
            fn0.d r8 = kotlin.jvm.internal.q0.b(r8)
            kl0.a r8 = androidx.camera.camera2.internal.s2.y(r10, r8, r9)
            r0.label = r3
            java.lang.Object r13 = r7.a(r8, r0)
            if (r13 != r1) goto Lda
            return r1
        Lda:
            if (r13 == 0) goto Ldf
            com.withings.library.authentication.api.session.RenewResponse r13 = (com.withings.library.authentication.api.session.RenewResponse) r13
            return r13
        Ldf:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r8 = "null cannot be cast to non-null type com.withings.library.authentication.api.session.RenewResponse"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.api.session.RemoteSessionApi.renew(java.lang.String, java.lang.String, java.lang.String, com.withings.library.authentication.api.VirtualDeviceInformation, boolean, com.withings.library.authentication.login.Server, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00df  */
    @Override // com.withings.library.authentication.api.session.SessionApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object renewWithRecoveryCode(java.lang.String r7, java.lang.String r8, java.lang.String r9, com.withings.library.authentication.api.VirtualDeviceInformation r10, boolean r11, com.withings.library.authentication.login.Server r12, qm0.d<? super com.withings.library.authentication.api.session.RenewResponse> r13) {
        /*
            r6 = this;
            boolean r0 = r13 instanceof com.withings.library.authentication.api.session.RemoteSessionApi$renewWithRecoveryCode$1
            if (r0 == 0) goto L13
            r0 = r13
            com.withings.library.authentication.api.session.RemoteSessionApi$renewWithRecoveryCode$1 r0 = (com.withings.library.authentication.api.session.RemoteSessionApi$renewWithRecoveryCode$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.library.authentication.api.session.RemoteSessionApi$renewWithRecoveryCode$1 r0 = new com.withings.library.authentication.api.session.RemoteSessionApi$renewWithRecoveryCode$1
            r0.<init>(r6, r13)
        L18:
            java.lang.Object r13 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            nm0.l.b(r13)
            goto Lda
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            nm0.l.b(r13)
            goto Lb9
        L38:
            nm0.l.b(r13)
            com.withings.library.authentication.api.httpclient.HttpClientRepository r13 = r6.httpClientRepository
            qk0.a r12 = r13.getHttpClient(r12)
            zk0.d r13 = new zk0.d
            r13.<init>()
            com.withings.library.authentication.api.session.RemoteSessionApi$renewWithRecoveryCode$2$1 r2 = com.withings.library.authentication.api.session.RemoteSessionApi$renewWithRecoveryCode$2$1.INSTANCE
            r13.o(r2)
            el0.z$a r2 = el0.z.f65720b
            el0.b0 r2 = el0.d0.a()
            java.lang.String r5 = "sessionid"
            r2.e(r5, r7)
            java.lang.String r7 = "recovery_code"
            r2.e(r7, r8)
            java.lang.String r7 = com.withings.library.authentication.utils.api.BooleanToKtorStringKt.toKtorString(r11)
            java.lang.String r8 = "is_secure"
            r2.e(r8, r7)
            java.lang.String r7 = "token"
            r2.e(r7, r9)
            java.lang.String r7 = r10.getModelName()
            java.lang.String r8 = "modelname"
            r2.e(r8, r7)
            java.lang.String r7 = "typename"
            java.lang.String r8 = r10.getTypeName()
            r2.e(r7, r8)
            java.lang.String r7 = "os"
            java.lang.String r8 = r10.getOs()
            r2.e(r7, r8)
            java.lang.String r7 = "apppfm"
            java.lang.String r8 = r10.getOs()
            r2.e(r7, r8)
            java.lang.String r7 = "appliver"
            java.lang.String r8 = r10.getAppVersion()
            r2.e(r7, r8)
            java.lang.String r7 = "appname"
            java.lang.String r8 = r10.getAppName()
            r2.e(r7, r8)
            java.lang.String r7 = "osversion"
            java.lang.String r8 = r10.getOsVersion()
            r2.e(r7, r8)
            el0.z r7 = r2.n()
            bl0.g r7 = androidx.compose.material.n3.c(r7, r13, r13, r12)
            r0.label = r4
            java.lang.Object r13 = r7.b(r0)
            if (r13 != r1) goto Lb9
            return r1
        Lb9:
            bl0.c r13 = (bl0.c) r13
            rk0.a r7 = r13.b()
            java.lang.Class<com.withings.library.authentication.api.session.RenewResponse> r8 = com.withings.library.authentication.api.session.RenewResponse.class
            fn0.o r9 = kotlin.jvm.internal.q0.l(r8)
            java.lang.reflect.Type r10 = fn0.t.f(r9)
            fn0.d r8 = kotlin.jvm.internal.q0.b(r8)
            kl0.a r8 = androidx.camera.camera2.internal.s2.y(r10, r8, r9)
            r0.label = r3
            java.lang.Object r13 = r7.a(r8, r0)
            if (r13 != r1) goto Lda
            return r1
        Lda:
            if (r13 == 0) goto Ldf
            com.withings.library.authentication.api.session.RenewResponse r13 = (com.withings.library.authentication.api.session.RenewResponse) r13
            return r13
        Ldf:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r8 = "null cannot be cast to non-null type com.withings.library.authentication.api.session.RenewResponse"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.api.session.RemoteSessionApi.renewWithRecoveryCode(java.lang.String, java.lang.String, java.lang.String, com.withings.library.authentication.api.VirtualDeviceInformation, boolean, com.withings.library.authentication.login.Server, qm0.d):java.lang.Object");
    }
}
