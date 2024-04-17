package com.withings.wiscale2.device.common.ui;

import com.withings.device.Device;
import com.withings.features.platform.model.PlatformFeature;
import com.withings.features.platform.model.PlatformFeatureRepository;
import java.util.List;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
/* compiled from: MedicalFeatureListActivity.kt */
/* loaded from: classes5.dex */
public final class x1 extends androidx.lifecycle.g1 {

    /* renamed from: a  reason: collision with root package name */
    private final Device f54120a;

    /* renamed from: b  reason: collision with root package name */
    private final com.withings.wiscale2.device.common.feature.u f54121b;

    /* renamed from: c  reason: collision with root package name */
    private SharedFlow<? extends List<PlatformFeature>> f54122c;

    public x1(Device device, com.withings.wiscale2.device.common.feature.u platformFeatureActivationFactory, PlatformFeatureRepository platformFeatureRepository) {
        kotlin.jvm.internal.u.j(device, "device");
        kotlin.jvm.internal.u.j(platformFeatureActivationFactory, "platformFeatureActivationFactory");
        kotlin.jvm.internal.u.j(platformFeatureRepository, "platformFeatureRepository");
        this.f54120a = device;
        this.f54121b = platformFeatureActivationFactory;
        this.f54122c = FlowKt.shareIn(platformFeatureRepository.getAllFeaturesForDeviceFlow(device.getId()), androidx.lifecycle.h1.a(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 0L, 0L, 3, null), 1);
    }

    public final SharedFlow<List<PlatformFeature>> i0() {
        return this.f54122c;
    }
}
