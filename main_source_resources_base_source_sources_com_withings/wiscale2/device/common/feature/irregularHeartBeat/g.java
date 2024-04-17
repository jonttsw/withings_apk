package com.withings.wiscale2.device.common.feature.irregularHeartBeat;

import com.withings.device.Device;
import com.withings.features.platform.model.PlatformFeature;
import com.withings.features.platform.model.PlatformFeatureKt;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: IrregularHeartBeatActivationActivity.kt */
/* loaded from: classes5.dex */
public final class g extends w implements ym0.l<List<PlatformFeature>, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ i f52359a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar) {
        super(1);
        this.f52359a = iVar;
    }

    @Override // ym0.l
    public final Boolean invoke(List<PlatformFeature> list) {
        Object obj;
        Device device;
        Device device2;
        List<PlatformFeature> list2 = list;
        u.g(list2);
        Iterator<T> it = list2.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((PlatformFeature) obj).getFeatureId() == 13) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        PlatformFeature platformFeature = (PlatformFeature) obj;
        boolean z5 = false;
        if (platformFeature != null) {
            i iVar = this.f52359a;
            device = iVar.f52363a;
            if (PlatformFeatureKt.isActivatedForDevice(platformFeature, device.getId())) {
                device2 = iVar.f52363a;
                if (PlatformFeatureKt.isTutoSeenForDevice(platformFeature, device2.getId())) {
                    z5 = true;
                }
            }
        }
        return Boolean.valueOf(z5);
    }
}
