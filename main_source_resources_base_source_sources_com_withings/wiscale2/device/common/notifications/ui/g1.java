package com.withings.wiscale2.device.common.notifications.ui;

import android.app.Application;
import androidx.lifecycle.k1;
import com.withings.device.Device;
import com.withings.features.platform.model.PlatformFeatureRepository;
import com.withings.user.User;
/* compiled from: DeviceNotificationSettingsFragment.kt */
/* loaded from: classes5.dex */
public final class g1 implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    private final Application f52899a;

    /* renamed from: b  reason: collision with root package name */
    private final User f52900b;

    /* renamed from: c  reason: collision with root package name */
    private final Device f52901c;

    /* renamed from: d  reason: collision with root package name */
    private final gb0.c f52902d;

    /* renamed from: e  reason: collision with root package name */
    private final PlatformFeatureRepository f52903e;

    /* renamed from: f  reason: collision with root package name */
    private final kn.e f52904f;

    /* renamed from: g  reason: collision with root package name */
    private final fl.i f52905g;

    /* renamed from: h  reason: collision with root package name */
    private final u60.a f52906h;

    public g1(Application application, User user, Device device, gb0.c appsManager, PlatformFeatureRepository platformFeatureRepository, kn.e eVar, fl.i iVar, u60.a aVar) {
        kotlin.jvm.internal.u.j(device, "device");
        kotlin.jvm.internal.u.j(appsManager, "appsManager");
        this.f52899a = application;
        this.f52900b = user;
        this.f52901c = device;
        this.f52902d = appsManager;
        this.f52903e = platformFeatureRepository;
        this.f52904f = eVar;
        this.f52905g = iVar;
        this.f52906h = aVar;
    }

    @Override // androidx.lifecycle.k1.b
    public final <T extends androidx.lifecycle.g1> T create(Class<T> modelClass, i6.a extras) {
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        kotlin.jvm.internal.u.j(extras, "extras");
        return new f1(this.f52899a, this.f52900b, this.f52901c, this.f52902d, this.f52903e, this.f52904f, this.f52905g, this.f52906h);
    }
}
