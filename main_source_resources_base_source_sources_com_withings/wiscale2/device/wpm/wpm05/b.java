package com.withings.wiscale2.device.wpm.wpm05;

import android.content.Context;
import androidx.compose.material.r3;
import cj.c;
import cj.d;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.device.Device;
import com.withings.device.DeviceModel;
import com.withings.devicesetup.Setup;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.data.WiscaleDBH;
import com.withings.wiscale2.device.wpm.wpm05.conversation.Wpm05SyncConversation;
import fl.e;
import fl.l;
import fl.o;
import fy.v;
import gj.g;
import gl.f;
import gl.g;
import gl.g0;
import gl.j;
import gl.k;
import gl.p;
import gl.t;
import java.util.Locale;
import jq.e;
import kotlin.jvm.internal.u;
import m70.i;
import vi.w;
import wb0.q;
import we0.n;
/* compiled from: Wpm05Model.kt */
/* loaded from: classes5.dex */
public final class b implements o, k, f, o.a, g, t, p, jq.c, j, g0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f55902a;

    /* renamed from: b  reason: collision with root package name */
    private final String f55903b;

    /* renamed from: c  reason: collision with root package name */
    private final c f55904c;

    /* compiled from: Wpm05Model.kt */
    /* loaded from: classes5.dex */
    private static final class a implements cj.c, c.b {
        @Override // cj.c
        public final String a() {
            return "WPM05";
        }

        @Override // cj.c
        public final cj.a b(xi.b remoteDevice) {
            u.j(remoteDevice, "remoteDevice");
            return new w(0);
        }

        @Override // cj.c
        public final void d(ej.f connectionManager) {
            u.j(connectionManager, "connectionManager");
            connectionManager.m();
        }

        @Override // cj.c
        public final boolean f() {
            return true;
        }

        @Override // cj.c
        public final /* bridge */ /* synthetic */ Object g() {
            return null;
        }

        @Override // cj.c
        public final long h(cj.b bVar) {
            return 60000L;
        }
    }

    /* compiled from: Wpm05Model.kt */
    /* renamed from: com.withings.wiscale2.device.wpm.wpm05.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    private static final class C0735b implements aj.a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f55905a;

        public C0735b(Context context) {
            u.j(context, "context");
            this.f55905a = context;
        }

        @Override // aj.a
        public final boolean a(xi.b remoteDevice) {
            u.j(remoteDevice, "remoteDevice");
            return true;
        }

        @Override // aj.a
        public final boolean b(xi.b remoteDevice, d identity) {
            u.j(remoteDevice, "remoteDevice");
            u.j(identity, "identity");
            if (remoteDevice instanceof vi.o) {
                if (!new mj.b((vi.o) remoteDevice).d(identity)) {
                    String iVar = identity.d().toString();
                    u.g(iVar);
                    String b10 = r3.b(iVar, 2, "substring(...)");
                    Locale locale = Locale.ROOT;
                    String lowerCase = b10.toLowerCase(locale);
                    u.i(lowerCase, "toLowerCase(...)");
                    String name = remoteDevice.getName();
                    if (name != null) {
                        String lowerCase2 = name.toLowerCase(locale);
                        u.i(lowerCase2, "toLowerCase(...)");
                        if (u.e(lowerCase2, "wpm05 ".concat(lowerCase)) || u.e(lowerCase2, "bpm connect ".concat(lowerCase))) {
                        }
                    }
                }
                return true;
            }
            return false;
        }

        @Override // aj.a
        public final gj.g c() {
            return new gj.f(new wb0.a(this.f55905a), new g.b(vi.o.class));
        }

        @Override // aj.a
        public final boolean d(xi.b remoteDevice) {
            vi.o oVar;
            String name;
            u.j(remoteDevice, "remoteDevice");
            boolean z5 = remoteDevice instanceof vi.o;
            if (!z5 || new mj.b((vi.o) remoteDevice).a() != 45) {
                if (z5) {
                    oVar = (vi.o) remoteDevice;
                } else {
                    oVar = null;
                }
                if (oVar == null || oVar.d() != 12 || (name = ((vi.o) remoteDevice).getName()) == null) {
                    return false;
                }
                String lowerCase = name.toLowerCase(Locale.ROOT);
                u.i(lowerCase, "toLowerCase(...)");
                if (!dp0.j.r(lowerCase, "wpm05", false) && !dp0.j.r(lowerCase, "bpm connect", false)) {
                    return false;
                }
            }
            return true;
        }
    }

    /* compiled from: Wpm05Model.kt */
    /* loaded from: classes5.dex */
    public static final class c implements aj.b {
        c() {
        }

        @Override // aj.b
        public final aj.a a() {
            return new C0735b(b.this.c());
        }

        @Override // aj.b
        public final int b() {
            return 30;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [cj.c, java.lang.Object] */
        @Override // aj.b
        public final cj.c c() {
            return new Object();
        }
    }

    public b(Context context) {
        u.j(context, "context");
        this.f55902a = context;
        n.a(45);
        this.f55903b = "6215752935825";
        this.f55904c = new c();
    }

    @Override // fl.o
    public final String A() {
        return this.f55903b;
    }

    @Override // fl.o
    public final int B(String str) {
        return 2131232955;
    }

    @Override // fl.o
    public final int E(String str) {
        return n.a(45).f37577z;
    }

    @Override // gl.j
    public final int G(String str) {
        return C1987R.string._SYNC_IN_PROGRESS_WIDGET_TITLE_;
    }

    @Override // fl.o
    public final int I(String str) {
        return C1987R.string.wpm05_name;
    }

    @Override // fl.o
    public final int M(String str) {
        return 2131231304;
    }

    @Override // fl.o
    public final int Q() {
        return C1987R.string._SHOP_WPM05_URL_;
    }

    @Override // jq.c
    public final int[] R() {
        return new int[]{3};
    }

    @Override // gl.p
    public final int S(int i11, int i12) {
        if (i12 <= 10) {
            return C1987R.string.wpm05_criticalBatteryUrl;
        }
        return C1987R.string.wpm05_lowBatteryUrl;
    }

    @Override // gl.f
    public final Setup U(Device device) {
        u.j(device, "device");
        return new Wpm05UpgradeSetup();
    }

    @Override // fl.o
    public final boolean W(Context context) {
        u.j(context, "context");
        return true;
    }

    @Override // jq.c
    public final e Y() {
        return new q();
    }

    @Override // fl.o
    public final int a() {
        return 45;
    }

    @Override // fl.o
    public final int a0() {
        return 0;
    }

    @Override // gl.j
    public final yi.d b(Context context) {
        u.j(context, "context");
        return uc0.e.a(context);
    }

    public final Context c() {
        return this.f55902a;
    }

    @Override // fl.o
    public final Setup e0(DeviceModel deviceModel) {
        return new Wpm05InstallSetup();
    }

    @Override // fl.o
    public final l g(Context context, dj.t tVar) {
        u.j(context, "context");
        return new l(context, tVar, null, 28);
    }

    @Override // gl.p
    public final boolean g0(int i11, int i12) {
        if (i12 < 20) {
            return true;
        }
        return false;
    }

    @Override // fl.o
    public final int getDeviceType() {
        return 4;
    }

    @Override // jq.c
    public final boolean j(int i11, long j5) {
        return true;
    }

    @Override // gl.j
    public final WppDeviceConversation j0(Integer num) {
        vf.c cVar;
        i b10 = i.b();
        u.i(b10, "get(...)");
        cVar = vf.c.f103617d;
        if (cVar != null) {
            kn.e c11 = kn.e.c();
            u.i(c11, "get(...)");
            WiscaleDBH f11 = WiscaleDBH.f();
            u.i(f11, "get(...)");
            sw.a z5 = sw.a.z();
            u.i(z5, "get(...)");
            return new Wpm05SyncConversation(b10, cVar, c11, new v(new zx.v(z5), f11, zx.j.f111082d.a()));
        }
        throw new IllegalArgumentException("You must call init before".toString());
    }

    @Override // jq.c
    public final boolean k0() {
        return false;
    }

    @Override // fl.o
    public final boolean n(int i11) {
        return true;
    }

    @Override // gl.t
    public final boolean o(long j5) {
        return true;
    }

    @Override // gl.g
    public final Setup p(Device device) {
        u.j(device, "device");
        return new Wpm05NetworkSetup();
    }

    @Override // gl.p
    public final int r(int i11, int i12) {
        if (i12 <= 10) {
            return C1987R.string.wpm05_criticalBatteryContent;
        }
        return C1987R.string.wpm05_lowBatteryContent;
    }

    @Override // fl.o
    public final e.c t(Context context, Device device) {
        vf.c cVar;
        u.j(context, "context");
        u.j(device, "device");
        ej.w w11 = ej.w.w();
        u.i(w11, "get(...)");
        i b10 = i.b();
        u.i(b10, "get(...)");
        kn.e c11 = kn.e.c();
        u.i(c11, "get(...)");
        cVar = vf.c.f103617d;
        if (cVar != null) {
            WiscaleDBH f11 = WiscaleDBH.f();
            u.i(f11, "get(...)");
            sw.a z5 = sw.a.z();
            u.i(z5, "get(...)");
            return new fl.a(context, device, w11, new com.withings.wiscale2.device.wpm.wpm05.a(b10, cVar, c11, new v(new zx.v(z5), f11, zx.j.f111082d.a()), w11));
        }
        throw new IllegalArgumentException("You must call init before".toString());
    }

    @Override // fl.o
    public final aj.b w() {
        return this.f55904c;
    }

    @Override // fl.o.a
    public final boolean x() {
        return true;
    }
}
