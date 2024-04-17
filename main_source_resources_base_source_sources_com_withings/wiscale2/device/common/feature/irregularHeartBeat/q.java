package com.withings.wiscale2.device.common.feature.irregularHeartBeat;

import com.withings.features.platform.model.PlatformFeature;
import com.withings.features.platform.model.PlatformFeatureKt;
import java.util.List;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: IrregularHeartBeatSettingsActivity.kt */
/* loaded from: classes5.dex */
public final class q extends w implements ym0.l<List<PlatformFeature>, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ s f52373a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s sVar) {
        super(1);
        this.f52373a = sVar;
    }

    @Override // ym0.l
    public final Boolean invoke(List<PlatformFeature> list) {
        boolean z5;
        List<PlatformFeature> list2 = list;
        u.g(list2);
        PlatformFeature platformFeature = (PlatformFeature) x.K(list2);
        if (platformFeature != null) {
            z5 = PlatformFeatureKt.isActivatedForDevice(platformFeature, this.f52373a.f52375a.getId());
        } else {
            z5 = false;
        }
        return Boolean.valueOf(z5);
    }
}
