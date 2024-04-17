package com.withings.wiscale2.device.common.feature.afib;

import com.withings.features.platform.model.PlatformFeature;
import com.withings.features.platform.model.PlatformFeatureKt;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.w;
/* compiled from: AfibActivationActivity.kt */
/* loaded from: classes5.dex */
final class f extends w implements ym0.l<List<PlatformFeature>, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h f51017a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar) {
        super(1);
        this.f51017a = hVar;
    }

    @Override // ym0.l
    public final Boolean invoke(List<PlatformFeature> list) {
        Object obj;
        List<PlatformFeature> list2 = list;
        kotlin.jvm.internal.u.g(list2);
        Iterator<T> it = list2.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((PlatformFeature) obj).getFeatureId() == 14) {
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
            h hVar = this.f51017a;
            if (PlatformFeatureKt.isActivatedForDevice(platformFeature, hVar.k0().getId()) && PlatformFeatureKt.isTutoSeenForDevice(platformFeature, hVar.k0().getId())) {
                z5 = true;
            }
        }
        return Boolean.valueOf(z5);
    }
}
