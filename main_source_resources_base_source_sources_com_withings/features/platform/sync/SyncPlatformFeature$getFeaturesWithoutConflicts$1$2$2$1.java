package com.withings.features.platform.sync;

import com.withings.features.platform.model.Owner;
import com.withings.features.platform.model.PlatformFeature;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ym0.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SyncPlatformFeature.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/withings/features/platform/model/Owner;", "invoke", "(Lcom/withings/features/platform/model/Owner;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SyncPlatformFeature$getFeaturesWithoutConflicts$1$2$2$1 extends w implements l<Owner, Boolean> {
    final /* synthetic */ PlatformFeature $wsFeature;
    final /* synthetic */ SyncPlatformFeature this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncPlatformFeature$getFeaturesWithoutConflicts$1$2$2$1(SyncPlatformFeature syncPlatformFeature, PlatformFeature platformFeature) {
        super(1);
        this.this$0 = syncPlatformFeature;
        this.$wsFeature = platformFeature;
    }

    @Override // ym0.l
    public final Boolean invoke(Owner it) {
        boolean hasOwnerOverrideByAny;
        u.j(it, "it");
        hasOwnerOverrideByAny = this.this$0.hasOwnerOverrideByAny(it, this.$wsFeature.getOwners());
        return Boolean.valueOf(hasOwnerOverrideByAny);
    }
}
