package com.withings.wiscale2.device.common.feature.irregularHeartBeat;

import androidx.lifecycle.e1;
import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.j0;
import com.withings.device.Device;
import com.withings.features.platform.model.DeviceFeaturesLiveData;
import com.withings.features.platform.model.PlatformFeatureRepository;
import com.withings.wiscale2.device.common.feature.u;
import ej.w;
import kotlin.collections.x;
/* compiled from: IrregularHeartBeatActivationActivity.kt */
/* loaded from: classes5.dex */
public final class i extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final Device f52363a;

    /* renamed from: b  reason: collision with root package name */
    private final u f52364b;

    /* renamed from: c  reason: collision with root package name */
    private final DeviceFeaturesLiveData f52365c;

    /* renamed from: d  reason: collision with root package name */
    private final j0 f52366d;

    /* renamed from: e  reason: collision with root package name */
    private final zo.a f52367e;

    public i(w wVar, Device device, PlatformFeatureRepository featureRepository, u platformFeatureActivationFactory) {
        kotlin.jvm.internal.u.j(device, "device");
        kotlin.jvm.internal.u.j(platformFeatureActivationFactory, "platformFeatureActivationFactory");
        kotlin.jvm.internal.u.j(featureRepository, "featureRepository");
        this.f52363a = device;
        this.f52364b = platformFeatureActivationFactory;
        DeviceFeaturesLiveData deviceFeaturesLiveData = new DeviceFeaturesLiveData(device.getId(), x.W(13, 17), featureRepository, false, 8, null);
        this.f52365c = deviceFeaturesLiveData;
        this.f52366d = e1.b(deviceFeaturesLiveData, new g(this));
        this.f52367e = new zo.a(device, wVar, h1.a(this).getCoroutineContext());
    }

    public final j0 k0() {
        return this.f52366d;
    }
}
