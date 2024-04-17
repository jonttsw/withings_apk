package com.withings.wiscale2.device.common.feature.afib;

import androidx.lifecycle.e1;
import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.j0;
import com.withings.device.Device;
import com.withings.features.platform.model.DeviceFeaturesLiveData;
import com.withings.features.platform.model.PlatformFeatureRepository;
import ej.w;
import kotlin.collections.x;
/* compiled from: AfibActivationActivity.kt */
/* loaded from: classes5.dex */
public final class h extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final Device f51020a;

    /* renamed from: b  reason: collision with root package name */
    private final com.withings.wiscale2.device.common.feature.u f51021b;

    /* renamed from: c  reason: collision with root package name */
    private final zo.a f51022c;

    /* renamed from: d  reason: collision with root package name */
    private final DeviceFeaturesLiveData f51023d;

    /* renamed from: e  reason: collision with root package name */
    private final j0 f51024e;

    public h(w wVar, Device device, PlatformFeatureRepository featureRepository, com.withings.wiscale2.device.common.feature.u platformFeatureActivationFactory) {
        kotlin.jvm.internal.u.j(device, "device");
        kotlin.jvm.internal.u.j(featureRepository, "featureRepository");
        kotlin.jvm.internal.u.j(platformFeatureActivationFactory, "platformFeatureActivationFactory");
        this.f51020a = device;
        this.f51021b = platformFeatureActivationFactory;
        this.f51022c = new zo.a(device, wVar, h1.a(this).getCoroutineContext());
        DeviceFeaturesLiveData deviceFeaturesLiveData = new DeviceFeaturesLiveData(device.getId(), x.W(14, 17), featureRepository, false, 8, null);
        this.f51023d = deviceFeaturesLiveData;
        this.f51024e = e1.b(deviceFeaturesLiveData, new f(this));
    }

    public final j0 j0() {
        return this.f51024e;
    }

    public final Device k0() {
        return this.f51020a;
    }

    public final boolean m0() {
        Boolean bool = (Boolean) this.f51024e.getValue();
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        return bool.booleanValue();
    }
}
