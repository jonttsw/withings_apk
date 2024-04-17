package com.withings.wiscale2.device.common.notifications.ui;

import android.app.Application;
import com.withings.comm.wpp.generated.object.AncsStatus;
import com.withings.device.Device;
import com.withings.features.platform.model.PlatformFeature;
import com.withings.features.platform.model.PlatformFeatureKt;
import com.withings.features.platform.model.PlatformFeatureRepository;
import com.withings.user.User;
import com.withings.wiscale2.device.common.notifications.ui.l1;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
/* compiled from: DeviceNotificationSettingsFragment.kt */
/* loaded from: classes5.dex */
public final class f1 extends androidx.lifecycle.b {

    /* renamed from: a */
    private final User f52873a;

    /* renamed from: b */
    private final Device f52874b;

    /* renamed from: c */
    private final gb0.c f52875c;

    /* renamed from: d */
    private final PlatformFeatureRepository f52876d;

    /* renamed from: e */
    private final fl.i f52877e;

    /* renamed from: f */
    private final u60.a f52878f;

    /* renamed from: g */
    private final th0.i f52879g;

    /* renamed from: h */
    private final fb0.b f52880h;

    /* renamed from: i */
    private final Flow<h1> f52881i;

    /* renamed from: j */
    private final Flow<Boolean> f52882j;

    /* renamed from: k */
    private final Flow<Device> f52883k;

    /* renamed from: l */
    private final Flow<nm0.y> f52884l;

    /* renamed from: m */
    private final Flow<List<Short>> f52885m;

    /* renamed from: n */
    private final Flow<List<String>> f52886n;

    /* renamed from: o */
    private final Flow<List<b>> f52887o;

    /* renamed from: p */
    private final Flow<List<a>> f52888p;

    /* renamed from: q */
    private final MutableStateFlow<Boolean> f52889q;

    /* renamed from: r */
    private final MutableStateFlow<Boolean> f52890r;

    /* renamed from: s */
    private final MutableStateFlow<k1> f52891s;

    /* renamed from: t */
    private final MutableStateFlow<k1> f52892t;

    /* renamed from: u */
    private final MutableStateFlow<l1> f52893u;

    /* renamed from: v */
    private final MutableStateFlow f52894v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(Application app, User user, Device device, gb0.c appsManager, PlatformFeatureRepository platformFeatureRepository, kn.e deviceManager, fl.i deviceModelRepository, u60.a featureActivationUseCase) {
        super(app);
        fb0.b bVar;
        th0.i iVar = new th0.i(app);
        bVar = fb0.b.f66904h;
        if (bVar != null) {
            kotlin.jvm.internal.u.j(app, "app");
            kotlin.jvm.internal.u.j(user, "user");
            kotlin.jvm.internal.u.j(device, "device");
            kotlin.jvm.internal.u.j(appsManager, "appsManager");
            kotlin.jvm.internal.u.j(platformFeatureRepository, "platformFeatureRepository");
            kotlin.jvm.internal.u.j(deviceManager, "deviceManager");
            kotlin.jvm.internal.u.j(deviceModelRepository, "deviceModelRepository");
            kotlin.jvm.internal.u.j(featureActivationUseCase, "featureActivationUseCase");
            this.f52873a = user;
            this.f52874b = device;
            this.f52875c = appsManager;
            this.f52876d = platformFeatureRepository;
            this.f52877e = deviceModelRepository;
            this.f52878f = featureActivationUseCase;
            this.f52879g = iVar;
            this.f52880h = bVar;
            this.f52881i = FlowKt.flowOn(FlowKt.mapLatest(FlowKt.flow(new z0(this, null)), new a1(this, null)), Dispatchers.getIO());
            this.f52882j = FlowKt.flowOn(FlowKt.flowOf(Boolean.valueOf(M0().status == 1)), Dispatchers.getIO());
            this.f52883k = FlowKt.flowOn(androidx.lifecycle.q.a(new fl.h(androidx.lifecycle.h1.a(this), deviceManager, device.getId())), Dispatchers.getIO());
            Flow<nm0.y> callbackFlow = FlowKt.callbackFlow(new x0(this, null));
            this.f52884l = callbackFlow;
            this.f52885m = FlowKt.flowOn(FlowKt.flow(new c1(callbackFlow, null, this)), Dispatchers.getIO());
            this.f52886n = FlowKt.flowOn(FlowKt.flow(new d1(callbackFlow, null, this)), Dispatchers.getIO());
            this.f52887o = FlowKt.flowOn(FlowKt.flow(new y0(this, null)), Dispatchers.getIO());
            this.f52888p = FlowKt.flowOn(FlowKt.flow(new w0(this, null)), Dispatchers.getIO());
            MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
            this.f52889q = MutableStateFlow;
            this.f52890r = MutableStateFlow;
            MutableStateFlow<k1> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
            this.f52891s = MutableStateFlow2;
            this.f52892t = MutableStateFlow2;
            MutableStateFlow<l1> MutableStateFlow3 = StateFlowKt.MutableStateFlow(l1.b.f52946a);
            this.f52893u = MutableStateFlow3;
            this.f52894v = MutableStateFlow3;
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(this), null, null, new u0(this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(this), null, null, new v0(this, null), 3, null);
            return;
        }
        kotlin.jvm.internal.u.s("instance");
        throw null;
    }

    public static final boolean G0(f1 f1Var, short s11) {
        f1Var.f52880h.getClass();
        int i11 = 1;
        if (s11 != 1) {
            i11 = -1;
        }
        th0.i iVar = f1Var.f52879g;
        iVar.getClass();
        String[] c11 = th0.i.c(i11);
        return iVar.a((String[]) Arrays.copyOf(c11, c11.length));
    }

    public static final boolean K0(f1 f1Var, List list, int i11) {
        Object obj;
        f1Var.getClass();
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((PlatformFeature) obj).getFeatureId() == i11) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            PlatformFeature platformFeature = (PlatformFeature) obj;
            if (platformFeature != null) {
                return PlatformFeatureKt.isActivatedForDevice(platformFeature, f1Var.f52874b.getId());
            }
        }
        return false;
    }

    private final AncsStatus M0() {
        AncsStatus i11 = this.f52880h.i(this.f52874b);
        if (i11 == null) {
            AncsStatus ancsStatus = new AncsStatus();
            ancsStatus.status = (short) 1;
            return ancsStatus;
        }
        return i11;
    }

    public static final /* synthetic */ gb0.c j0(f1 f1Var) {
        return f1Var.f52875c;
    }

    public final Flow<List<String>> O0() {
        return this.f52886n;
    }

    public final Flow<List<Short>> R0() {
        return this.f52885m;
    }

    public final MutableStateFlow<Boolean> T0() {
        return this.f52890r;
    }

    public final MutableStateFlow<k1> U0() {
        return this.f52892t;
    }

    public final MutableStateFlow V0() {
        return this.f52894v;
    }

    public final void W0() {
        u70.i macAddress = this.f52874b.getMacAddress();
        kotlin.jvm.internal.u.i(macAddress, "getMacAddress(...)");
        this.f52875c.n(macAddress);
    }

    public final void X0(String packageName, boolean z5, boolean z11) {
        kotlin.jvm.internal.u.j(packageName, "packageName");
        Device device = this.f52874b;
        gb0.c cVar = this.f52875c;
        if (z5) {
            if (z11 && !this.f52879g.b()) {
                this.f52889q.setValue(Boolean.TRUE);
            }
            u70.i macAddress = device.getMacAddress();
            kotlin.jvm.internal.u.i(macAddress, "getMacAddress(...)");
            cVar.e(macAddress, packageName);
            return;
        }
        u70.i macAddress2 = device.getMacAddress();
        kotlin.jvm.internal.u.i(macAddress2, "getMacAddress(...)");
        cVar.c(macAddress2, packageName);
    }

    public final AncsStatus Y0(boolean z5, b defaultApp) {
        kotlin.jvm.internal.u.j(defaultApp, "defaultApp");
        String c11 = defaultApp.c();
        if (c11 != null) {
            boolean z11 = true;
            if (M0().status != 1) {
                z11 = false;
            }
            X0(c11, z5, z11);
        }
        return Z0(z5, (short) Integer.parseInt(defaultApp.a()));
    }

    public final AncsStatus Z0(boolean z5, short s11) {
        boolean z11;
        fb0.b bVar;
        int i11;
        if (M0().status == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        th0.i iVar = this.f52879g;
        int i12 = -1;
        Device device = this.f52874b;
        gb0.c cVar = this.f52875c;
        if (z5 && z11) {
            this.f52880h.getClass();
            if (s11 == 1) {
                i11 = 1;
            } else {
                i11 = -1;
            }
            iVar.getClass();
            String[] c11 = th0.i.c(i11);
            if (iVar.a((String[]) Arrays.copyOf(c11, c11.length))) {
                u70.i macAddress = device.getMacAddress();
                kotlin.jvm.internal.u.i(macAddress, "getMacAddress(...)");
                cVar.f(s11, macAddress);
                if (!z5 && z11) {
                    AncsStatus M0 = M0();
                    bVar = fb0.b.f66904h;
                    if (bVar != null) {
                        if (s11 == 1) {
                            i12 = 1;
                        }
                        iVar.getClass();
                        String[] c12 = th0.i.c(i12);
                        if (iVar.a((String[]) Arrays.copyOf(c12, c12.length))) {
                            M0.status = (short) 1;
                            return M0;
                        }
                        this.f52892t.setValue(new k1(kotlin.collections.l.a0(c12), s11));
                        return M0;
                    }
                    kotlin.jvm.internal.u.s("instance");
                    throw null;
                }
                return M0();
            }
        }
        if (z11) {
            u70.i macAddress2 = device.getMacAddress();
            kotlin.jvm.internal.u.i(macAddress2, "getMacAddress(...)");
            cVar.d(s11, macAddress2);
        }
        if (!z5) {
        }
        return M0();
    }

    public final AncsStatus a1() {
        AncsStatus M0 = M0();
        short s11 = 1;
        if (M0.status == 1) {
            s11 = 0;
        }
        M0.status = s11;
        this.f52880h.k(this.f52874b, M0);
        return M0;
    }
}
