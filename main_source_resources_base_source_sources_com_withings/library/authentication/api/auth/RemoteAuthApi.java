package com.withings.library.authentication.api.auth;

import com.withings.library.authentication.api.httpclient.HttpClientRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: RemoteAuthApi.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ;\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ;\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\fJC\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lcom/withings/library/authentication/api/auth/RemoteAuthApi;", "Lcom/withings/library/authentication/api/auth/AuthApi;", "", "email", "password", "token", "Lcom/withings/library/authentication/api/VirtualDeviceInformation;", "virtualDeviceInformation", "Lcom/withings/library/authentication/login/Server;", "server", "Lcom/withings/library/authentication/api/auth/accountsession/AccountSession;", "loginWithClearPassword", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withings/library/authentication/api/VirtualDeviceInformation;Lcom/withings/library/authentication/login/Server;Lqm0/d;)Ljava/lang/Object;", "hash", "loginWithHashedPassword", "authToken", "providerToken", "deviceUuid", "Lcom/withings/library/authentication/login/ProviderType;", "providerType", "loginFromAuthProvider", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withings/library/authentication/api/VirtualDeviceInformation;Lcom/withings/library/authentication/login/ProviderType;Lcom/withings/library/authentication/login/Server;Lqm0/d;)Ljava/lang/Object;", "sessionId", "Lnm0/y;", "logout", "(Ljava/lang/String;Ljava/lang/String;Lcom/withings/library/authentication/login/ProviderType;Lcom/withings/library/authentication/login/Server;Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/authentication/api/httpclient/HttpClientRepository;", "httpClientRepository", "Lcom/withings/library/authentication/api/httpclient/HttpClientRepository;", "<init>", "(Lcom/withings/library/authentication/api/httpclient/HttpClientRepository;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RemoteAuthApi implements AuthApi {
    private final HttpClientRepository httpClientRepository;

    public RemoteAuthApi(HttpClientRepository httpClientRepository) {
        u.j(httpClientRepository, "httpClientRepository");
        this.httpClientRepository = httpClientRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x010e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0118  */
    @Override // com.withings.library.authentication.api.auth.AuthApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object loginFromAuthProvider(java.lang.String r15, java.lang.String r16, java.lang.String r17, com.withings.library.authentication.api.VirtualDeviceInformation r18, com.withings.library.authentication.login.ProviderType r19, com.withings.library.authentication.login.Server r20, qm0.d<? super com.withings.library.authentication.api.auth.accountsession.AccountSession> r21) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.api.auth.RemoteAuthApi.loginFromAuthProvider(java.lang.String, java.lang.String, java.lang.String, com.withings.library.authentication.api.VirtualDeviceInformation, com.withings.library.authentication.login.ProviderType, com.withings.library.authentication.login.Server, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0101  */
    @Override // com.withings.library.authentication.api.auth.AuthApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object loginWithClearPassword(java.lang.String r9, java.lang.String r10, java.lang.String r11, com.withings.library.authentication.api.VirtualDeviceInformation r12, com.withings.library.authentication.login.Server r13, qm0.d<? super com.withings.library.authentication.api.auth.accountsession.AccountSession> r14) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.api.auth.RemoteAuthApi.loginWithClearPassword(java.lang.String, java.lang.String, java.lang.String, com.withings.library.authentication.api.VirtualDeviceInformation, com.withings.library.authentication.login.Server, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0101  */
    @Override // com.withings.library.authentication.api.auth.AuthApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object loginWithHashedPassword(java.lang.String r9, java.lang.String r10, java.lang.String r11, com.withings.library.authentication.api.VirtualDeviceInformation r12, com.withings.library.authentication.login.Server r13, qm0.d<? super com.withings.library.authentication.api.auth.accountsession.AccountSession> r14) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.api.auth.RemoteAuthApi.loginWithHashedPassword(java.lang.String, java.lang.String, java.lang.String, com.withings.library.authentication.api.VirtualDeviceInformation, com.withings.library.authentication.login.Server, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    @Override // com.withings.library.authentication.api.auth.AuthApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object logout(java.lang.String r7, java.lang.String r8, com.withings.library.authentication.login.ProviderType r9, com.withings.library.authentication.login.Server r10, qm0.d<? super nm0.y> r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof com.withings.library.authentication.api.auth.RemoteAuthApi$logout$1
            if (r0 == 0) goto L13
            r0 = r11
            com.withings.library.authentication.api.auth.RemoteAuthApi$logout$1 r0 = (com.withings.library.authentication.api.auth.RemoteAuthApi$logout$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.library.authentication.api.auth.RemoteAuthApi$logout$1 r0 = new com.withings.library.authentication.api.auth.RemoteAuthApi$logout$1
            r0.<init>(r6, r11)
        L18:
            java.lang.Object r11 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            nm0.l.b(r11)
            goto L94
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            nm0.l.b(r11)
            goto L73
        L36:
            nm0.l.b(r11)
            com.withings.library.authentication.api.httpclient.HttpClientRepository r11 = r6.httpClientRepository
            qk0.a r10 = r11.getHttpClient(r10)
            zk0.d r11 = new zk0.d
            r11.<init>()
            com.withings.library.authentication.api.auth.RemoteAuthApi$logout$2$1 r2 = com.withings.library.authentication.api.auth.RemoteAuthApi$logout$2$1.INSTANCE
            r11.o(r2)
            el0.z$a r2 = el0.z.f65720b
            el0.b0 r2 = el0.d0.a()
            java.lang.String r5 = "sessionid"
            r2.e(r5, r7)
            java.lang.String r7 = "uuid"
            r2.e(r7, r8)
            java.lang.String r7 = "authprovider"
            java.lang.String r8 = r9.getValue()
            r2.e(r7, r8)
            el0.z r7 = r2.n()
            bl0.g r7 = androidx.compose.material.n3.c(r7, r11, r11, r10)
            r0.label = r4
            java.lang.Object r11 = r7.b(r0)
            if (r11 != r1) goto L73
            return r1
        L73:
            bl0.c r11 = (bl0.c) r11
            rk0.a r7 = r11.b()
            java.lang.Class<com.withings.library.authentication.api.StubResponse> r8 = com.withings.library.authentication.api.StubResponse.class
            fn0.o r9 = kotlin.jvm.internal.q0.l(r8)
            java.lang.reflect.Type r10 = fn0.t.f(r9)
            fn0.d r8 = kotlin.jvm.internal.q0.b(r8)
            kl0.a r8 = androidx.camera.camera2.internal.s2.y(r10, r8, r9)
            r0.label = r3
            java.lang.Object r11 = r7.a(r8, r0)
            if (r11 != r1) goto L94
            return r1
        L94:
            if (r11 == 0) goto L9b
            com.withings.library.authentication.api.StubResponse r11 = (com.withings.library.authentication.api.StubResponse) r11
            nm0.y r7 = nm0.y.f85009a
            return r7
        L9b:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r8 = "null cannot be cast to non-null type com.withings.library.authentication.api.StubResponse"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.api.auth.RemoteAuthApi.logout(java.lang.String, java.lang.String, com.withings.library.authentication.login.ProviderType, com.withings.library.authentication.login.Server, qm0.d):java.lang.Object");
    }
}
