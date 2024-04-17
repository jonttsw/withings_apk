package com.withings.sdk.wilife.data.changelog.remote;

import com.google.gson.Gson;
import com.withings.sdk.wilife.data.update.remote.ErrorResponse;
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
/* compiled from: RemoteChangelogService.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/withings/sdk/wilife/data/changelog/remote/RemoteChangelogService;", "", "Lq40/a;", "changelogRequest", "Lcom/withings/sdk/wilife/data/changelog/Changelog;", "isChangelogAvailable", "(Lq40/a;Lqm0/d;)Ljava/lang/Object;", "Ldr0/b0;", "retrofit", "Ldr0/b0;", "Lcom/withings/sdk/wilife/data/changelog/remote/RemoteChangelogService$LocalChangelogService;", "changelogService$delegate", "Lnm0/g;", "getChangelogService", "()Lcom/withings/sdk/wilife/data/changelog/remote/RemoteChangelogService$LocalChangelogService;", "changelogService", "<init>", "()V", "LocalChangelogService", "wilife-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RemoteChangelogService {
    private final g changelogService$delegate;

    /* renamed from: retrofit  reason: collision with root package name */
    private final b0 f43993retrofit;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RemoteChangelogService.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bb\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/withings/sdk/wilife/data/changelog/remote/RemoteChangelogService$LocalChangelogService;", "", "", "VersionId", "Lke/d;", "Lcom/withings/sdk/wilife/data/changelog/remote/RemoteChangelog;", "Lcom/withings/sdk/wilife/data/update/remote/ErrorResponse;", "getChangelog", "(Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "wilife-sdk_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public interface LocalChangelogService {
        @f("store/changelog")
        Object getChangelog(@t("version_id") String str, d<? super ke.d<RemoteChangelog, ErrorResponse>> dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [ke.f, dr0.c$a] */
    public RemoteChangelogService() {
        b0.b bVar = new b0.b();
        bVar.c("https://api-wilife.corp.withings.com");
        bVar.b(a.c(new Gson()));
        bVar.a(new c.a());
        this.f43993retrofit = bVar.d();
        this.changelogService$delegate = h.b(new RemoteChangelogService$changelogService$2(this));
    }

    private final LocalChangelogService getChangelogService() {
        Object value = this.changelogService$delegate.getValue();
        u.i(value, "getValue(...)");
        return (LocalChangelogService) value;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object isChangelogAvailable(q40.a r5, qm0.d<? super com.withings.sdk.wilife.data.changelog.Changelog> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.withings.sdk.wilife.data.changelog.remote.RemoteChangelogService$isChangelogAvailable$1
            if (r0 == 0) goto L13
            r0 = r6
            com.withings.sdk.wilife.data.changelog.remote.RemoteChangelogService$isChangelogAvailable$1 r0 = (com.withings.sdk.wilife.data.changelog.remote.RemoteChangelogService$isChangelogAvailable$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.sdk.wilife.data.changelog.remote.RemoteChangelogService$isChangelogAvailable$1 r0 = new com.withings.sdk.wilife.data.changelog.remote.RemoteChangelogService$isChangelogAvailable$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            nm0.l.b(r6)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            nm0.l.b(r6)
            com.withings.sdk.wilife.data.changelog.remote.RemoteChangelogService$LocalChangelogService r6 = r4.getChangelogService()
            java.lang.String r5 = r5.a()
            r0.label = r3
            java.lang.Object r6 = r6.getChangelog(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            ke.d r6 = (ke.d) r6
            boolean r5 = r6 instanceof ke.d.c
            if (r5 == 0) goto L56
            ke.d$c r6 = (ke.d.c) r6
            java.lang.Object r5 = r6.a()
            com.withings.sdk.wilife.data.changelog.remote.RemoteChangelog r5 = (com.withings.sdk.wilife.data.changelog.remote.RemoteChangelog) r5
            com.withings.sdk.wilife.data.changelog.Changelog r5 = com.withings.sdk.wilife.data.changelog.remote.RemoteChangelogKt.convertToChangeLog(r5)
            goto L57
        L56:
            r5 = 0
        L57:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.sdk.wilife.data.changelog.remote.RemoteChangelogService.isChangelogAvailable(q40.a, qm0.d):java.lang.Object");
    }
}
