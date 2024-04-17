package com.withings.sdk.wilife.data.update.remote;

import com.google.gson.Gson;
import dr0.b0;
import dr0.c;
import er0.a;
import fr0.f;
import fr0.t;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
import qm0.d;
import s40.c;
/* compiled from: RemoteUpdateService.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/withings/sdk/wilife/data/update/remote/RemoteUpdateService;", "Ls40/c;", "Ls40/b;", "updateRequest", "Ls40/a;", "isUpdateAvailable", "(Ls40/b;Lqm0/d;)Ljava/lang/Object;", "Ldr0/b0;", "retrofit", "Ldr0/b0;", "Lcom/withings/sdk/wilife/data/update/remote/RemoteUpdateService$LocalUpdateService;", "updateService$delegate", "Lnm0/g;", "getUpdateService", "()Lcom/withings/sdk/wilife/data/update/remote/RemoteUpdateService$LocalUpdateService;", "updateService", "<init>", "()V", "LocalUpdateService", "wilife-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RemoteUpdateService implements c {

    /* renamed from: retrofit  reason: collision with root package name */
    private final b0 f43994retrofit;
    private final g updateService$delegate;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RemoteUpdateService.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bb\u0018\u00002\u00020\u0001J0\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/withings/sdk/wilife/data/update/remote/RemoteUpdateService$LocalUpdateService;", "", "", "deviceId", "applicationVersionId", "Lke/d;", "Lcom/withings/sdk/wilife/data/update/remote/RemoteUpdate;", "Lcom/withings/sdk/wilife/data/update/remote/ErrorResponse;", "isUpdateAvailable", "(Ljava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "wilife-sdk_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public interface LocalUpdateService {
        @f("store/last_available_version")
        Object isUpdateAvailable(@t("device_id") String str, @t("app_version_id") String str2, d<? super ke.d<RemoteUpdate, ErrorResponse>> dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [ke.f, dr0.c$a] */
    public RemoteUpdateService() {
        b0.b bVar = new b0.b();
        bVar.c("https://api-wilife.corp.withings.com");
        bVar.b(a.c(new Gson()));
        bVar.a(new c.a());
        this.f43994retrofit = bVar.d();
        this.updateService$delegate = h.b(new RemoteUpdateService$updateService$2(this));
    }

    private final LocalUpdateService getUpdateService() {
        Object value = this.updateService$delegate.getValue();
        u.i(value, "getValue(...)");
        return (LocalUpdateService) value;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    @Override // s40.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object isUpdateAvailable(s40.b r6, qm0.d<? super s40.a> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.withings.sdk.wilife.data.update.remote.RemoteUpdateService$isUpdateAvailable$1
            if (r0 == 0) goto L13
            r0 = r7
            com.withings.sdk.wilife.data.update.remote.RemoteUpdateService$isUpdateAvailable$1 r0 = (com.withings.sdk.wilife.data.update.remote.RemoteUpdateService$isUpdateAvailable$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.sdk.wilife.data.update.remote.RemoteUpdateService$isUpdateAvailable$1 r0 = new com.withings.sdk.wilife.data.update.remote.RemoteUpdateService$isUpdateAvailable$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 1
            java.lang.String r4 = "Wilife-SDK"
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            nm0.l.b(r7)
            goto L5a
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            nm0.l.b(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r2 = "Request update "
            r7.<init>(r2)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            android.util.Log.d(r4, r7)
            com.withings.sdk.wilife.data.update.remote.RemoteUpdateService$LocalUpdateService r7 = r5.getUpdateService()
            java.lang.String r2 = r6.d()
            java.lang.String r6 = r6.a()
            r0.label = r3
            java.lang.Object r7 = r7.isUpdateAvailable(r2, r6, r0)
            if (r7 != r1) goto L5a
            return r1
        L5a:
            ke.d r7 = (ke.d) r7
            boolean r6 = r7 instanceof ke.d.c
            if (r6 == 0) goto L82
            ke.d$c r7 = (ke.d.c) r7
            java.lang.Object r6 = r7.a()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Update received "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            android.util.Log.d(r4, r6)
            java.lang.Object r6 = r7.a()
            com.withings.sdk.wilife.data.update.remote.RemoteUpdate r6 = (com.withings.sdk.wilife.data.update.remote.RemoteUpdate) r6
            s40.a r6 = com.withings.sdk.wilife.data.update.remote.RemoteUpdateKt.convertToUpdate(r6)
            goto L8f
        L82:
            java.lang.String r6 = "Error during update request"
            android.util.Log.e(r4, r6)
            java.lang.String r6 = r7.toString()
            android.util.Log.e(r4, r6)
            r6 = 0
        L8f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.sdk.wilife.data.update.remote.RemoteUpdateService.isUpdateAvailable(s40.b, qm0.d):java.lang.Object");
    }
}
