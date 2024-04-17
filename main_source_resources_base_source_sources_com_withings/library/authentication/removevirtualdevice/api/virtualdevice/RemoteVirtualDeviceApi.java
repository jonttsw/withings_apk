package com.withings.library.authentication.removevirtualdevice.api.virtualdevice;

import com.withings.library.authentication.api.httpclient.HttpClientRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: RemoteVirtualDeviceApi.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J[\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/withings/library/authentication/removevirtualdevice/api/virtualdevice/RemoteVirtualDeviceApi;", "Lcom/withings/library/authentication/removevirtualdevice/api/virtualdevice/VirtualDeviceApi;", "", "sessionId", "deviceUuid", "modelName", "typeName", "os", "appVersion", "appName", "osVersion", "Lcom/withings/library/authentication/login/Server;", "server", "Lnm0/y;", "deleteVirtualDevice", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withings/library/authentication/login/Server;Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/authentication/api/httpclient/HttpClientRepository;", "httpClientRepository", "Lcom/withings/library/authentication/api/httpclient/HttpClientRepository;", "<init>", "(Lcom/withings/library/authentication/api/httpclient/HttpClientRepository;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RemoteVirtualDeviceApi implements VirtualDeviceApi {
    private final HttpClientRepository httpClientRepository;

    public RemoteVirtualDeviceApi(HttpClientRepository httpClientRepository) {
        u.j(httpClientRepository, "httpClientRepository");
        this.httpClientRepository = httpClientRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c7  */
    @Override // com.withings.library.authentication.removevirtualdevice.api.virtualdevice.VirtualDeviceApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object deleteVirtualDevice(java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, com.withings.library.authentication.login.Server r20, qm0.d<? super nm0.y> r21) {
        /*
            r11 = this;
            r0 = r11
            r1 = r16
            r2 = r21
            boolean r3 = r2 instanceof com.withings.library.authentication.removevirtualdevice.api.virtualdevice.RemoteVirtualDeviceApi$deleteVirtualDevice$1
            if (r3 == 0) goto L18
            r3 = r2
            com.withings.library.authentication.removevirtualdevice.api.virtualdevice.RemoteVirtualDeviceApi$deleteVirtualDevice$1 r3 = (com.withings.library.authentication.removevirtualdevice.api.virtualdevice.RemoteVirtualDeviceApi$deleteVirtualDevice$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L18
            int r4 = r4 - r5
            r3.label = r4
            goto L1d
        L18:
            com.withings.library.authentication.removevirtualdevice.api.virtualdevice.RemoteVirtualDeviceApi$deleteVirtualDevice$1 r3 = new com.withings.library.authentication.removevirtualdevice.api.virtualdevice.RemoteVirtualDeviceApi$deleteVirtualDevice$1
            r3.<init>(r11, r2)
        L1d:
            java.lang.Object r2 = r3.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r4 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r5 = r3.label
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L3c
            if (r5 == r7) goto L38
            if (r5 != r6) goto L30
            nm0.l.b(r2)
            goto Lc0
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L38:
            nm0.l.b(r2)
            goto L9f
        L3c:
            nm0.l.b(r2)
            com.withings.library.authentication.api.httpclient.HttpClientRepository r2 = r0.httpClientRepository
            r5 = r20
            qk0.a r2 = r2.getHttpClient(r5)
            zk0.d r5 = new zk0.d
            r5.<init>()
            com.withings.library.authentication.removevirtualdevice.api.virtualdevice.RemoteVirtualDeviceApi$deleteVirtualDevice$2$1 r8 = com.withings.library.authentication.removevirtualdevice.api.virtualdevice.RemoteVirtualDeviceApi$deleteVirtualDevice$2$1.INSTANCE
            r5.o(r8)
            el0.z$a r8 = el0.z.f65720b
            el0.b0 r8 = el0.d0.a()
            java.lang.String r9 = "sessionid"
            r10 = r12
            r8.e(r9, r12)
            java.lang.String r9 = "token"
            r10 = r13
            r8.e(r9, r13)
            java.lang.String r9 = "modelname"
            r10 = r14
            r8.e(r9, r14)
            java.lang.String r9 = "typename"
            r10 = r15
            r8.e(r9, r15)
            java.lang.String r9 = "os"
            r8.e(r9, r1)
            java.lang.String r9 = "apppfm"
            r8.e(r9, r1)
            java.lang.String r1 = "appliver"
            r9 = r17
            r8.e(r1, r9)
            java.lang.String r1 = "appname"
            r9 = r18
            r8.e(r1, r9)
            java.lang.String r1 = "osversion"
            r9 = r19
            r8.e(r1, r9)
            el0.z r1 = r8.n()
            bl0.g r1 = androidx.compose.material.n3.c(r1, r5, r5, r2)
            r3.label = r7
            java.lang.Object r2 = r1.b(r3)
            if (r2 != r4) goto L9f
            return r4
        L9f:
            bl0.c r2 = (bl0.c) r2
            rk0.a r1 = r2.b()
            java.lang.Class<com.withings.library.authentication.api.StubResponse> r2 = com.withings.library.authentication.api.StubResponse.class
            fn0.o r5 = kotlin.jvm.internal.q0.l(r2)
            java.lang.reflect.Type r7 = fn0.t.f(r5)
            fn0.d r2 = kotlin.jvm.internal.q0.b(r2)
            kl0.a r2 = androidx.camera.camera2.internal.s2.y(r7, r2, r5)
            r3.label = r6
            java.lang.Object r2 = r1.a(r2, r3)
            if (r2 != r4) goto Lc0
            return r4
        Lc0:
            if (r2 == 0) goto Lc7
            com.withings.library.authentication.api.StubResponse r2 = (com.withings.library.authentication.api.StubResponse) r2
            nm0.y r1 = nm0.y.f85009a
            return r1
        Lc7:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "null cannot be cast to non-null type com.withings.library.authentication.api.StubResponse"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.removevirtualdevice.api.virtualdevice.RemoteVirtualDeviceApi.deleteVirtualDevice(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.withings.library.authentication.login.Server, qm0.d):java.lang.Object");
    }
}
