package com.withings.wiscale2.device.common.feature.afib;

import com.withings.features.platform.model.PlatformFeature;
import com.withings.features.platform.model.PlatformFeatureKt;
import java.util.List;
import kotlin.collections.x;
import kotlin.jvm.internal.w;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AfibSettingsActivity.kt */
/* loaded from: classes5.dex */
public final class r extends w implements ym0.l<List<PlatformFeature>, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ s f51034a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar) {
        super(1);
        this.f51034a = sVar;
    }

    @Override // ym0.l
    public final Boolean invoke(List<PlatformFeature> list) {
        boolean z5;
        List<PlatformFeature> list2 = list;
        kotlin.jvm.internal.u.g(list2);
        PlatformFeature platformFeature = (PlatformFeature) x.K(list2);
        if (platformFeature != null) {
            z5 = PlatformFeatureKt.isActivatedForDevice(platformFeature, this.f51034a.i0().getId());
        } else {
            z5 = false;
        }
        return Boolean.valueOf(z5);
    }
}
