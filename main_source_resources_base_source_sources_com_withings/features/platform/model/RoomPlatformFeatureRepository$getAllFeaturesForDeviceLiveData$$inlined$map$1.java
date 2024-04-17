package com.withings.features.platform.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import ym0.l;
/* compiled from: LiveData.kt */
@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0006\u0010\u0005\u001a\u00028\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"X", "Y", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class RoomPlatformFeatureRepository$getAllFeaturesForDeviceLiveData$$inlined$map$1 extends w implements l<List<? extends PlatformFeature>, List<? extends PlatformFeature>> {
    final /* synthetic */ long $deviceId$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomPlatformFeatureRepository$getAllFeaturesForDeviceLiveData$$inlined$map$1(long j5) {
        super(1);
        this.$deviceId$inlined = j5;
    }

    @Override // ym0.l
    public final List<? extends PlatformFeature> invoke(List<? extends PlatformFeature> list) {
        DeviceOwner deviceOwner;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            List<Owner> owners = ((PlatformFeature) obj).getOwners();
            if (!(owners instanceof Collection) || !owners.isEmpty()) {
                Iterator<T> it = owners.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Owner owner = (Owner) it.next();
                        if (owner instanceof DeviceOwner) {
                            deviceOwner = (DeviceOwner) owner;
                        } else {
                            deviceOwner = null;
                        }
                        if (deviceOwner != null) {
                            Long deviceId = deviceOwner.getDeviceId();
                            long j5 = this.$deviceId$inlined;
                            if (deviceId != null && deviceId.longValue() == j5) {
                                arrayList.add(obj);
                                break;
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
