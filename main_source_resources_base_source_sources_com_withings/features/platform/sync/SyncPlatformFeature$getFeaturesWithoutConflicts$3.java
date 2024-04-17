package com.withings.features.platform.sync;

import com.withings.features.platform.model.PlatformFeature;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ym0.l;
/* compiled from: SyncPlatformFeature.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/withings/features/platform/model/PlatformFeature;", "invoke", "(Lcom/withings/features/platform/model/PlatformFeature;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class SyncPlatformFeature$getFeaturesWithoutConflicts$3 extends w implements l<PlatformFeature, Boolean> {
    public static final SyncPlatformFeature$getFeaturesWithoutConflicts$3 INSTANCE = new SyncPlatformFeature$getFeaturesWithoutConflicts$3();

    SyncPlatformFeature$getFeaturesWithoutConflicts$3() {
        super(1);
    }

    @Override // ym0.l
    public final Boolean invoke(PlatformFeature it) {
        u.j(it, "it");
        return Boolean.valueOf(it.getOwners().isEmpty());
    }
}
