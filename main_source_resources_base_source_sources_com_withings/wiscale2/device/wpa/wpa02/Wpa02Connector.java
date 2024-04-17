package com.withings.wiscale2.device.wpa.wpa02;

import android.content.Context;
import cj.d;
import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.common.device.conversation.BondingMigrationConversation;
import com.withings.device.Device;
import com.withings.wiscale2.device.wpa.wpa02.conversation.Wpa02SyncConversation;
import dj.j;
import dj.t;
import ej.k;
import ej.w;
import fb0.a;
import fl.e;
import fl.p;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import u70.a;
import u70.i;
import vi.o;
import wi.a;
import xi.b;
/* compiled from: Wpa02Connector.kt */
/* loaded from: classes5.dex */
public final class Wpa02Connector implements e.c, e.d, a.c, t.a, a.InterfaceC1810a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f55014a;

    /* renamed from: b  reason: collision with root package name */
    private Device f55015b;

    /* renamed from: c  reason: collision with root package name */
    private final w f55016c;

    /* renamed from: d  reason: collision with root package name */
    private final u70.a f55017d;

    /* renamed from: e  reason: collision with root package name */
    private final t f55018e;

    /* renamed from: f  reason: collision with root package name */
    private final wi.a f55019f;

    /* renamed from: g  reason: collision with root package name */
    private k<?> f55020g;

    /* renamed from: h  reason: collision with root package name */
    private k<?> f55021h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f55022i;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Wpa02Connector.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/wpa/wpa02/Wpa02Connector$BondAndSyncConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public static final class BondAndSyncConversation extends WppDeviceConversation {

        /* renamed from: f  reason: collision with root package name */
        private final gl.t f55023f;

        /* renamed from: g  reason: collision with root package name */
        private final w f55024g;

        /* renamed from: h  reason: collision with root package name */
        private final u70.a f55025h;

        /* renamed from: i  reason: collision with root package name */
        private final Wpa02SyncConversation f55026i;

        public BondAndSyncConversation(gl.t tVar, w wppDeviceManager) {
            u70.a b10 = u70.a.b();
            u.i(b10, "get(...)");
            Wpa02SyncConversation wpa02SyncConversation = new Wpa02SyncConversation(0);
            u.j(wppDeviceManager, "wppDeviceManager");
            this.f55023f = tVar;
            this.f55024g = wppDeviceManager;
            this.f55025h = b10;
            this.f55026i = wpa02SyncConversation;
        }

        /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, com.withings.common.device.conversation.a] */
        @Override // com.withings.comm.remote.conversation.WppDeviceConversation
        public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
            b j5 = x().j();
            u.h(j5, "null cannot be cast to non-null type com.withings.comm.network.ble.BleRemoteDevice");
            int d11 = ((o) j5).d();
            w wVar = this.f55024g;
            if (d11 != 12 && this.f55025h.e()) {
                long j11 = x().i().softVersion;
                gl.t tVar = this.f55023f;
                if (tVar.o(j11)) {
                    wVar.O(x(), new BondingMigrationConversation(tVar, new Object()), BondingMigrationConversation.class);
                }
            }
            wVar.O(x(), this.f55026i, Wpa02SyncConversation.class);
        }
    }

    public Wpa02Connector(Context context, Device device) {
        wi.a aVar;
        w w11 = w.w();
        u.i(w11, "get(...)");
        u70.a b10 = u70.a.b();
        u.i(b10, "get(...)");
        u.j(context, "context");
        u.j(device, "device");
        this.f55014a = context;
        this.f55015b = device;
        this.f55016c = w11;
        this.f55017d = b10;
        this.f55018e = w.w().E(this.f55015b.getMacAddress());
        aVar = wi.a.f105219d;
        if (aVar == null) {
            Context applicationContext = context.getApplicationContext();
            u.i(applicationContext, "getApplicationContext(...)");
            aVar = new wi.a(applicationContext);
            wi.a.f105219d = aVar;
        }
        this.f55019f = aVar;
    }

    private final void e() {
        k<?> kVar = this.f55020g;
        if (kVar != null) {
            kVar.k();
        }
        fl.o g11 = p.f67672b.a().g(this.f55015b);
        u.h(g11, "null cannot be cast to non-null type com.withings.common.device.model.capabilities.DeviceWithBonding");
        w wVar = this.f55016c;
        BondAndSyncConversation bondAndSyncConversation = new BondAndSyncConversation((gl.t) g11, wVar);
        d b10 = jl.a.b(this.f55015b);
        wVar.getClass();
        k<?> u11 = wVar.u(b10, bondAndSyncConversation, BondAndSyncConversation.class);
        this.f55020g = u11;
        u11.r();
        x70.b.c(this, this.f55015b.getMacAddress(), "Submitting connection", new Object[0]);
    }

    @Override // dj.t.a
    public final void D(t lifecycle, dj.u event) {
        u.j(lifecycle, "lifecycle");
        u.j(event, "event");
        if (event instanceof j) {
            x70.b.c(this, this.f55015b.getMacAddress(), "Connection succeeded", new Object[0]);
        } else if (event instanceof dj.b) {
            x70.b.c(this, this.f55015b.getMacAddress(), "Connection closed", new Object[0]);
            e();
        } else if (event instanceof dj.d) {
            x70.b.c(this, this.f55015b.getMacAddress(), "Connection failed", new Object[0]);
        }
    }

    @Override // u70.a.c
    public final long H() {
        return 5000L;
    }

    @Override // fl.e.c
    public final boolean a(Device device) {
        u.j(device, "device");
        return u.e(this.f55015b, device);
    }

    @Override // fl.e.c
    public final void b(Device newDevice) {
        u.j(newDevice, "newDevice");
        this.f55015b = newDevice;
    }

    @Override // wi.a.InterfaceC1810a
    public final void c(boolean z5) {
        i macAddress = this.f55015b.getMacAddress();
        x70.b.c(this, macAddress, "Bluetooth state changed : " + z5, new Object[0]);
        if (z5) {
            e();
        }
    }

    @Override // fl.e.d
    public final void d() {
        gl.j jVar;
        fl.o g11 = p.f67672b.a().g(this.f55015b);
        if (g11 instanceof gl.j) {
            jVar = (gl.j) g11;
        } else {
            jVar = null;
        }
        if (jVar != null) {
            WppDeviceConversation j02 = jVar.j0(null);
            k<?> kVar = this.f55021h;
            if (kVar != null) {
                kVar.k();
            }
            d b10 = jl.a.b(this.f55015b);
            w wVar = this.f55016c;
            wVar.getClass();
            k<?> u11 = wVar.u(b10, j02, j02.getClass());
            this.f55021h = u11;
            u11.r();
            x70.b.c(this, this.f55015b.getMacAddress(), "Submitting synchronisation", new Object[0]);
        }
    }

    @Override // u70.a.c
    public final void f2(long j5) {
        x70.b.c(this, this.f55015b.getMacAddress(), "App enters foreground", new Object[0]);
        d();
    }

    @Override // fl.e.a
    public final void start() {
        x70.b.r(this, "start()", new Object[0]);
        if (this.f55022i) {
            x70.b.r(this, "Already started !", new Object[0]);
            return;
        }
        this.f55018e.d(this);
        this.f55019f.g(this);
        this.f55017d.a(this);
        this.f55022i = true;
        e();
        int i11 = fb0.a.f66901p;
        a.C0918a.a(this.f55014a).s();
    }

    @Override // fl.e.a
    public final void stop() {
        x70.b.r(this, "stop()", new Object[0]);
        k<?> kVar = this.f55020g;
        if (kVar != null) {
            kVar.k();
        }
        this.f55020g = null;
        x70.b.c(this, this.f55015b.getMacAddress(), "Cancel conversation submission", new Object[0]);
        this.f55018e.f(this);
        this.f55016c.s(this.f55015b.getMacAddress());
        this.f55017d.h(this);
        this.f55019f.h(this);
        this.f55022i = false;
    }

    @Override // u70.a.c
    public final void Q2() {
    }
}
