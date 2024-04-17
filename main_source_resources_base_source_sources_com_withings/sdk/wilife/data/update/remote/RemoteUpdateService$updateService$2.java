package com.withings.sdk.wilife.data.update.remote;

import com.withings.sdk.wilife.data.update.remote.RemoteUpdateService;
import dr0.b0;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import ym0.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RemoteUpdateService.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/withings/sdk/wilife/data/update/remote/RemoteUpdateService$LocalUpdateService;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RemoteUpdateService$updateService$2 extends w implements a<RemoteUpdateService.LocalUpdateService> {
    final /* synthetic */ RemoteUpdateService this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteUpdateService$updateService$2(RemoteUpdateService remoteUpdateService) {
        super(0);
        this.this$0 = remoteUpdateService;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ym0.a
    public final RemoteUpdateService.LocalUpdateService invoke() {
        b0 b0Var;
        b0Var = this.this$0.f43994retrofit;
        return (RemoteUpdateService.LocalUpdateService) b0Var.b(RemoteUpdateService.LocalUpdateService.class);
    }
}
