package com.withings.features.platform.sync;

import com.withings.features.platform.model.AccountOwner;
import com.withings.features.platform.model.DeviceOwner;
import com.withings.features.platform.model.Owner;
import com.withings.features.platform.model.PlatformFeature;
import com.withings.features.platform.model.PlatformFeatureRepository;
import com.withings.webservices.legacy.sync.BaseSyncAction;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import nm0.j;
import nm0.k;
import nm0.l;
import nm0.y;
import org.jivesoftware.smack.sm.packet.StreamManagement;
/* compiled from: SetPlatformFeature.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/withings/features/platform/sync/SetPlatformFeature;", "Lcom/withings/webservices/legacy/sync/BaseSyncAction;", "Lnm0/y;", "run", "()V", "Lcom/withings/features/platform/model/PlatformFeature;", "platformFeature", "Lcom/withings/features/platform/model/PlatformFeature;", "", "deviceId", "Ljava/lang/Long;", "accountId", "Lcom/withings/features/platform/model/PlatformFeatureRepository;", "platformFeatureRepository", "Lcom/withings/features/platform/model/PlatformFeatureRepository;", "Lqr/a;", "platformFeatureApi", "Lqr/a;", "", StreamManagement.Enabled.ELEMENT, "Z", "<init>", "(Lcom/withings/features/platform/model/PlatformFeature;Ljava/lang/Long;Ljava/lang/Long;Lcom/withings/features/platform/model/PlatformFeatureRepository;Lqr/a;Z)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class SetPlatformFeature extends BaseSyncAction {
    private final Long accountId;
    private final Long deviceId;
    private final boolean enabled;
    private final PlatformFeature platformFeature;
    private final qr.a platformFeatureApi;
    private final PlatformFeatureRepository platformFeatureRepository;

    public SetPlatformFeature(PlatformFeature platformFeature, Long l5, Long l6, PlatformFeatureRepository platformFeatureRepository, qr.a platformFeatureApi, boolean z5) {
        u.j(platformFeature, "platformFeature");
        u.j(platformFeatureRepository, "platformFeatureRepository");
        u.j(platformFeatureApi, "platformFeatureApi");
        this.platformFeature = platformFeature;
        this.deviceId = l5;
        this.accountId = l6;
        this.platformFeatureRepository = platformFeatureRepository;
        this.platformFeatureApi = platformFeatureApi;
        this.enabled = z5;
    }

    @Override // com.withings.webservices.legacy.sync.BaseSyncAction, com.withings.webservices.legacy.sync.SyncAction.WithSyncContext, com.withings.webservices.legacy.sync.SyncAction, vh.a
    public void run() {
        Object a11;
        Object obj;
        Object obj2 = null;
        try {
            BuildersKt__BuildersKt.runBlocking$default(null, new SetPlatformFeature$run$1$1(this, null), 1, null);
            a11 = y.f85009a;
        } catch (Throwable th2) {
            a11 = l.a(th2);
        }
        if (!(a11 instanceof k.a)) {
            y yVar = (y) a11;
            this.platformFeature.setSynced(true);
            Long l5 = this.deviceId;
            Iterator<T> it = this.platformFeature.getOwners().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    Owner owner = (Owner) obj;
                    if ((owner instanceof DeviceOwner) && u.e(((DeviceOwner) owner).getDeviceId(), this.deviceId)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            cr.a.a(new j(l5, obj), new SetPlatformFeature$run$2$2(this));
            Long l6 = this.accountId;
            Iterator<T> it2 = this.platformFeature.getOwners().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Owner owner2 = (Owner) next;
                if ((owner2 instanceof AccountOwner) && u.e(((AccountOwner) owner2).getAccountId(), this.accountId)) {
                    obj2 = next;
                    break;
                }
            }
            cr.a.a(new j(l6, obj2), new SetPlatformFeature$run$2$4(this));
            this.platformFeatureRepository.updateFeature(this.platformFeature);
        }
        if (k.b(a11) != null) {
            x70.b.d(this, android.support.v4.media.a.a("error setting platform feature ", this.platformFeature.getFeatureId()), new Object[0]);
        }
    }

    public /* synthetic */ SetPlatformFeature(PlatformFeature platformFeature, Long l5, Long l6, PlatformFeatureRepository platformFeatureRepository, qr.a aVar, boolean z5, int i11, m mVar) {
        this(platformFeature, (i11 & 2) != 0 ? null : l5, (i11 & 4) != 0 ? null : l6, platformFeatureRepository, aVar, z5);
    }
}
