package com.withings.wiscale2.device.common.feature.spo2;

import androidx.lifecycle.e1;
import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.j0;
import com.withings.device.Device;
import com.withings.features.platform.model.DeviceFeaturesLiveData;
import com.withings.features.platform.model.PlatformFeature;
import com.withings.features.platform.model.PlatformFeatureKt;
import com.withings.wiscale2.device.common.feature.u;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.x;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
/* compiled from: SpO2ActivationActivity.kt */
/* loaded from: classes5.dex */
public final class q extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final Device f52541a;

    /* renamed from: b  reason: collision with root package name */
    private final com.withings.wiscale2.device.common.feature.c f52542b;

    /* renamed from: c  reason: collision with root package name */
    private final u f52543c;

    /* renamed from: d  reason: collision with root package name */
    private final DeviceFeaturesLiveData f52544d;

    /* renamed from: e  reason: collision with root package name */
    private final j0 f52545e;

    /* renamed from: f  reason: collision with root package name */
    private final j0 f52546f;

    /* renamed from: g  reason: collision with root package name */
    private final xw.n<Boolean> f52547g;

    /* renamed from: h  reason: collision with root package name */
    private final xw.n<Integer> f52548h;

    /* compiled from: SpO2ActivationActivity.kt */
    /* loaded from: classes5.dex */
    static final class a extends w implements ym0.l<List<PlatformFeature>, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f52549a = new w(1);

        @Override // ym0.l
        public final Boolean invoke(List<PlatformFeature> list) {
            List<PlatformFeature> list2 = list;
            kotlin.jvm.internal.u.g(list2);
            List<PlatformFeature> list3 = list2;
            boolean z5 = false;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator<T> it = list3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((PlatformFeature) it.next()).getFeatureId() == 15) {
                        z5 = true;
                        break;
                    }
                }
            }
            return Boolean.valueOf(z5);
        }
    }

    /* compiled from: SpO2ActivationActivity.kt */
    /* loaded from: classes5.dex */
    static final class b extends w implements ym0.l<List<PlatformFeature>, Boolean> {
        b() {
            super(1);
        }

        @Override // ym0.l
        public final Boolean invoke(List<PlatformFeature> list) {
            List<PlatformFeature> list2 = list;
            boolean z5 = false;
            if (list2 != null) {
                List<PlatformFeature> list3 = list2;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator<T> it = list3.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        PlatformFeature platformFeature = (PlatformFeature) it.next();
                        q qVar = q.this;
                        if (PlatformFeatureKt.isActivatedForDevice(platformFeature, qVar.f52541a.getId()) && PlatformFeatureKt.isTutoSeenForDevice(platformFeature, qVar.f52541a.getId())) {
                            z5 = true;
                            break;
                        }
                    }
                }
            }
            return Boolean.valueOf(z5);
        }
    }

    public q(Device device, com.withings.wiscale2.device.common.feature.c deviceScreenModifier, u platformFeatureActivationFactory) {
        kotlin.jvm.internal.u.j(device, "device");
        kotlin.jvm.internal.u.j(deviceScreenModifier, "deviceScreenModifier");
        kotlin.jvm.internal.u.j(platformFeatureActivationFactory, "platformFeatureActivationFactory");
        this.f52541a = device;
        this.f52542b = deviceScreenModifier;
        this.f52543c = platformFeatureActivationFactory;
        DeviceFeaturesLiveData deviceFeaturesLiveData = new DeviceFeaturesLiveData(device.getId(), x.W(15, 3), null, false, 12, null);
        this.f52544d = deviceFeaturesLiveData;
        this.f52545e = e1.b(deviceFeaturesLiveData, a.f52549a);
        this.f52546f = e1.b(deviceFeaturesLiveData, new b());
        this.f52547g = new xw.n<>();
        this.f52548h = new xw.n<>();
    }

    public final void j0() {
        List<? extends PlatformFeature> value = this.f52544d.getValue();
        if (value != null) {
            BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new o(this, value, null), 2, null);
        }
    }

    public final xw.n<Integer> k0() {
        return this.f52548h;
    }

    public final xw.n<Boolean> m0() {
        return this.f52547g;
    }

    public final j0 p0() {
        return this.f52546f;
    }

    public final j0 q0() {
        return this.f52545e;
    }
}
