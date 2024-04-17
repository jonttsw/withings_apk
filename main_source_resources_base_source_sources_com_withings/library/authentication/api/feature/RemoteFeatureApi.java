package com.withings.library.authentication.api.feature;

import kotlin.Metadata;
import kotlin.jvm.internal.u;
import qk0.a;
/* compiled from: RemoteFeatureApi.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/withings/library/authentication/api/feature/RemoteFeatureApi;", "Lcom/withings/library/authentication/api/feature/FeatureApi;", "", "sessionId", "Lcom/withings/library/authentication/api/feature/PlatformFeatureList;", "getPlatformFeatures", "(Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "Lqk0/a;", "httpClient", "Lqk0/a;", "<init>", "(Lqk0/a;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RemoteFeatureApi implements FeatureApi {
    private final a httpClient;

    public RemoteFeatureApi(a httpClient) {
        u.j(httpClient, "httpClient");
        this.httpClient = httpClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    @Override // com.withings.library.authentication.api.feature.FeatureApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getPlatformFeatures(java.lang.String r8, qm0.d<? super com.withings.library.authentication.api.feature.PlatformFeatureList> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.withings.library.authentication.api.feature.RemoteFeatureApi$getPlatformFeatures$1
            if (r0 == 0) goto L13
            r0 = r9
            com.withings.library.authentication.api.feature.RemoteFeatureApi$getPlatformFeatures$1 r0 = (com.withings.library.authentication.api.feature.RemoteFeatureApi$getPlatformFeatures$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.library.authentication.api.feature.RemoteFeatureApi$getPlatformFeatures$1 r0 = new com.withings.library.authentication.api.feature.RemoteFeatureApi$getPlatformFeatures$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            nm0.l.b(r9)
            goto L82
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            nm0.l.b(r9)
            goto L61
        L36:
            nm0.l.b(r9)
            qk0.a r9 = r7.httpClient
            zk0.d r2 = new zk0.d
            r2.<init>()
            com.withings.library.authentication.api.feature.RemoteFeatureApi$getPlatformFeatures$2$1 r5 = com.withings.library.authentication.api.feature.RemoteFeatureApi$getPlatformFeatures$2$1.INSTANCE
            r2.o(r5)
            el0.z$a r5 = el0.z.f65720b
            el0.b0 r5 = el0.d0.a()
            java.lang.String r6 = "sessionid"
            r5.e(r6, r8)
            el0.z r8 = r5.n()
            bl0.g r8 = androidx.compose.material.n3.c(r8, r2, r2, r9)
            r0.label = r4
            java.lang.Object r9 = r8.b(r0)
            if (r9 != r1) goto L61
            return r1
        L61:
            bl0.c r9 = (bl0.c) r9
            rk0.a r8 = r9.b()
            java.lang.Class<com.withings.library.authentication.api.feature.PlatformFeatureList> r9 = com.withings.library.authentication.api.feature.PlatformFeatureList.class
            fn0.o r2 = kotlin.jvm.internal.q0.l(r9)
            java.lang.reflect.Type r4 = fn0.t.f(r2)
            fn0.d r9 = kotlin.jvm.internal.q0.b(r9)
            kl0.a r9 = androidx.camera.camera2.internal.s2.y(r4, r9, r2)
            r0.label = r3
            java.lang.Object r9 = r8.a(r9, r0)
            if (r9 != r1) goto L82
            return r1
        L82:
            if (r9 == 0) goto L87
            com.withings.library.authentication.api.feature.PlatformFeatureList r9 = (com.withings.library.authentication.api.feature.PlatformFeatureList) r9
            return r9
        L87:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            java.lang.String r9 = "null cannot be cast to non-null type com.withings.library.authentication.api.feature.PlatformFeatureList"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.api.feature.RemoteFeatureApi.getPlatformFeatures(java.lang.String, qm0.d):java.lang.Object");
    }
}
