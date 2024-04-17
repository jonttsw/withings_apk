package com.withings.features.platform.sync;

import com.withings.features.platform.model.Owner;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import org.joda.time.DateTime;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SetPlatformFeature.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "<anonymous parameter 0>", "Lcom/withings/features/platform/model/Owner;", "accountOwner", "Lnm0/y;", "invoke", "(JLcom/withings/features/platform/model/Owner;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class SetPlatformFeature$run$2$4 extends w implements p<Long, Owner, y> {
    final /* synthetic */ SetPlatformFeature this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetPlatformFeature$run$2$4(SetPlatformFeature setPlatformFeature) {
        super(2);
        this.this$0 = setPlatformFeature;
    }

    @Override // ym0.p
    public /* bridge */ /* synthetic */ y invoke(Long l5, Owner owner) {
        invoke(l5.longValue(), owner);
        return y.f85009a;
    }

    public final void invoke(long j5, Owner accountOwner) {
        boolean z5;
        u.j(accountOwner, "accountOwner");
        accountOwner.setModified(DateTime.now().getMillis());
        z5 = this.this$0.enabled;
        accountOwner.setActive(z5);
    }
}
