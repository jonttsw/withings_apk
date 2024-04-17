package com.withings.common.device;

import android.app.Application;
import android.os.Build;
import androidx.lifecycle.e1;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import com.withings.device.Device;
import com.withings.device.DeviceModel;
import com.withings.devicesetup.Setup;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
/* compiled from: DeviceSettingsActivity.kt */
/* loaded from: classes3.dex */
final class l extends androidx.lifecycle.b {

    /* renamed from: a  reason: collision with root package name */
    private final aq.a f35214a;

    /* renamed from: b  reason: collision with root package name */
    private final fl.l f35215b;

    /* renamed from: c  reason: collision with root package name */
    private final wi.e f35216c;

    /* renamed from: d  reason: collision with root package name */
    private final j0 f35217d;

    /* renamed from: e  reason: collision with root package name */
    private final k0 f35218e;

    /* renamed from: f  reason: collision with root package name */
    private final j0 f35219f;

    /* renamed from: g  reason: collision with root package name */
    private final j0 f35220g;

    /* renamed from: h  reason: collision with root package name */
    private final j0 f35221h;

    /* compiled from: DeviceSettingsActivity.kt */
    /* loaded from: classes3.dex */
    static final class a extends w implements ym0.l<fl.k, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f35222a = new w(1);

        @Override // ym0.l
        public final String invoke(fl.k kVar) {
            fl.k it = kVar;
            u.j(it, "it");
            return it.b();
        }
    }

    /* compiled from: DeviceSettingsActivity.kt */
    /* loaded from: classes3.dex */
    static final class b extends w implements ym0.l<Boolean, Boolean> {
        b() {
            super(1);
        }

        @Override // ym0.l
        public final Boolean invoke(Boolean bool) {
            boolean z5;
            boolean booleanValue = bool.booleanValue();
            l lVar = l.this;
            if (l.g0(lVar) && l.i0(lVar) && !booleanValue) {
                z5 = true;
            } else {
                z5 = false;
            }
            return Boolean.valueOf(z5);
        }
    }

    /* compiled from: DeviceSettingsActivity.kt */
    /* loaded from: classes3.dex */
    static final class c extends w implements ym0.l<fl.k, Boolean> {
        c() {
            super(1);
        }

        @Override // ym0.l
        public final Boolean invoke(fl.k kVar) {
            boolean z5;
            fl.k it = kVar;
            u.j(it, "it");
            if (Build.VERSION.SDK_INT < 31) {
                l lVar = l.this;
                if (l.g0(lVar) && !l.i0(lVar) && l.j0(lVar)) {
                    z5 = true;
                    return Boolean.valueOf(z5);
                }
            }
            z5 = false;
            return Boolean.valueOf(z5);
        }
    }

    /* compiled from: DeviceSettingsActivity.kt */
    /* loaded from: classes3.dex */
    static final class d extends w implements ym0.l<fl.k, Boolean> {
        d() {
            super(1);
        }

        @Override // ym0.l
        public final Boolean invoke(fl.k kVar) {
            boolean z5;
            fl.k it = kVar;
            u.j(it, "it");
            if (Build.VERSION.SDK_INT >= 31) {
                l lVar = l.this;
                if (l.g0(lVar) && !lVar.f35216c.n()) {
                    z5 = true;
                    return Boolean.valueOf(z5);
                }
            }
            z5 = false;
            return Boolean.valueOf(z5);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Application application, ej.w wVar, fl.p pVar, aq.a aVar, Device device) {
        super(application);
        u.j(device, "device");
        this.f35214a = aVar;
        fl.l g11 = pVar.g(device).g(getApplication(), wVar.E(device.getMacAddress()));
        this.f35215b = g11;
        this.f35216c = new wi.e(getApplication(), (wi.a) null, (ui.d) null, 14);
        this.f35217d = e1.b(g11, a.f35222a);
        fl.o g12 = pVar.g(device);
        DeviceModel model = device.getModel();
        u.i(model, "getModel(...)");
        Setup e02 = g12.e0(model);
        this.f35218e = xw.d.a(e02 != null ? e02.X0() : null);
        this.f35219f = e1.b(g11, new c());
        j0 b10 = e1.b(g11, new d());
        this.f35220g = b10;
        this.f35221h = e1.b(b10, new b());
    }

    public static final boolean g0(l lVar) {
        return lVar.f35215b.x().b() instanceof dj.p;
    }

    public static final boolean i0(l lVar) {
        lVar.f35214a.getClass();
        return !ej.w.w().x().f();
    }

    public static final boolean j0(l lVar) {
        aq.a aVar = lVar.f35214a;
        if (aVar.c() && aVar.d()) {
            return false;
        }
        return true;
    }

    public final k0 k0() {
        return this.f35218e;
    }

    public final j0 m0() {
        return this.f35217d;
    }

    public final j0 p0() {
        return this.f35221h;
    }

    public final j0 q0() {
        return this.f35219f;
    }

    public final j0 r0() {
        return this.f35220g;
    }
}
