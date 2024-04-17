package com.withings.sdk.wilife.data.changelog.remote;

import com.withings.sdk.wilife.data.changelog.remote.RemoteChangelogService;
import dr0.b0;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import ym0.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RemoteChangelogService.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/withings/sdk/wilife/data/changelog/remote/RemoteChangelogService$LocalChangelogService;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RemoteChangelogService$changelogService$2 extends w implements a<RemoteChangelogService.LocalChangelogService> {
    final /* synthetic */ RemoteChangelogService this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteChangelogService$changelogService$2(RemoteChangelogService remoteChangelogService) {
        super(0);
        this.this$0 = remoteChangelogService;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ym0.a
    public final RemoteChangelogService.LocalChangelogService invoke() {
        b0 b0Var;
        b0Var = this.this$0.f43993retrofit;
        return (RemoteChangelogService.LocalChangelogService) b0Var.b(RemoteChangelogService.LocalChangelogService.class);
    }
}
