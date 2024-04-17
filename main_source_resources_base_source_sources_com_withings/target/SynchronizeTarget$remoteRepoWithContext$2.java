package com.withings.target;

import com.withings.target.data.api.TargetRemoteRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import ym0.a;
/* compiled from: SynchronizeTarget.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/withings/target/data/api/TargetRemoteRepository;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class SynchronizeTarget$remoteRepoWithContext$2 extends w implements a<TargetRemoteRepository> {
    final /* synthetic */ TargetRemoteRepository $remoteRepository;
    final /* synthetic */ SynchronizeTarget this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SynchronizeTarget$remoteRepoWithContext$2(TargetRemoteRepository targetRemoteRepository, SynchronizeTarget synchronizeTarget) {
        super(0);
        this.$remoteRepository = targetRemoteRepository;
        this.this$0 = synchronizeTarget;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ym0.a
    public final TargetRemoteRepository invoke() {
        return this.$remoteRepository.withSyncContext(this.this$0.getSyncContext());
    }
}
