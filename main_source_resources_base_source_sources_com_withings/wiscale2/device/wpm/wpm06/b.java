package com.withings.wiscale2.device.wpm.wpm06;

import android.content.Context;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.device.Device;
import com.withings.device.DeviceModel;
import com.withings.devicesetup.Setup;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.wpm.wpm06.conversation.Wpm06SyncConversation;
import fl.e;
import fl.l;
import fl.o;
import gj.g;
import gl.a0;
import gl.f;
import gl.g;
import gl.g0;
import gl.j;
import gl.k;
import gl.n0;
import gl.p;
import gl.t;
import java.util.Locale;
import jq.e;
import kotlin.jvm.internal.u;
import vi.w;
import wb0.q;
import we0.n;
import yi.d;
/* compiled from: Wpm06Model.kt */
/* loaded from: classes5.dex */
public final class b implements o, k, f, o.a, g, t, p, jq.c, j, g0, a0, n0 {

    /* compiled from: Wpm06Model.kt */
    /* loaded from: classes5.dex */
    private static final class a implements cj.c {
        @Override // cj.c
        public final String a() {
            return "WPM06";
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
        public final long h(cj.b wppDevice) {
            u.j(wppDevice, "wppDevice");
            return 30000L;
        }
    }

    /* compiled from: Wpm06Model.kt */
    /* renamed from: com.withings.wiscale2.device.wpm.wpm06.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    private static final class C0736b implements aj.a {
        @Override // aj.a
        public final boolean a(xi.b remoteDevice) {
            u.j(remoteDevice, "remoteDevice");
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0057, code lost:
            if (kotlin.jvm.internal.u.e(r1, "bpm connect pro ".concat(r0)) != false) goto L9;
         */
        @Override // aj.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean b(xi.b r6, cj.d r7) {
            /*
                r5 = this;
                java.lang.String r0 = "remoteDevice"
                kotlin.jvm.internal.u.j(r6, r0)
                java.lang.String r0 = "identity"
                kotlin.jvm.internal.u.j(r7, r0)
                boolean r0 = r6 instanceof vi.o
                if (r0 == 0) goto L6d
                vi.o r6 = (vi.o) r6
                int r0 = r6.d()
                r1 = 12
                if (r0 != r1) goto L5a
                u70.i r0 = r7.d()
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "toString(...)"
                kotlin.jvm.internal.u.i(r0, r1)
                r1 = 2
                java.lang.String r2 = "substring(...)"
                java.lang.String r0 = androidx.compose.material.r3.b(r0, r1, r2)
                java.util.Locale r1 = java.util.Locale.ROOT
                java.lang.String r0 = r0.toLowerCase(r1)
                java.lang.String r2 = "toLowerCase(...)"
                kotlin.jvm.internal.u.i(r0, r2)
                java.lang.String r3 = r6.getName()
                if (r3 == 0) goto L5a
                java.lang.String r3 = r6.getName()
                java.lang.String r4 = "getName(...)"
                kotlin.jvm.internal.u.i(r3, r4)
                java.lang.String r1 = r3.toLowerCase(r1)
                kotlin.jvm.internal.u.i(r1, r2)
                java.lang.String r2 = "bpm connect pro "
                java.lang.String r0 = r2.concat(r0)
                boolean r0 = kotlin.jvm.internal.u.e(r1, r0)
                if (r0 == 0) goto L5a
                goto L6b
            L5a:
                boolean r0 = r6.k()
                if (r0 == 0) goto L6d
                mj.b r0 = new mj.b
                r0.<init>(r6)
                boolean r6 = r0.d(r7)
                if (r6 == 0) goto L6d
            L6b:
                r6 = 1
                goto L6e
            L6d:
                r6 = 0
            L6e:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.wpm.wpm06.b.C0736b.b(xi.b, cj.d):boolean");
        }

        @Override // aj.a
        public final gj.g c() {
            return new gj.f(new g.b(wi.c.class), new g.b(vi.o.class));
        }

        @Override // aj.a
        public final boolean d(xi.b remoteDevice) {
            u.j(remoteDevice, "remoteDevice");
            if (!(remoteDevice instanceof vi.o)) {
                return false;
            }
            vi.o oVar = (vi.o) remoteDevice;
            if (new mj.b(oVar).a() != 46) {
                if (oVar.d() != 12 || oVar.getName() == null) {
                    return false;
                }
                String name = oVar.getName();
                u.i(name, "getName(...)");
                String lowerCase = name.toLowerCase(Locale.ROOT);
                u.i(lowerCase, "toLowerCase(...)");
                if (!dp0.j.r(lowerCase, "BPM Connect Pro", false)) {
                    return false;
                }
            }
            return true;
        }
    }

    /* compiled from: Wpm06Model.kt */
    /* loaded from: classes5.dex */
    public static final class c implements aj.b {
        /* JADX WARN: Type inference failed for: r0v0, types: [aj.a, java.lang.Object] */
        @Override // aj.b
        public final aj.a a() {
            return new Object();
        }

        @Override // aj.b
        public final int b() {
            return 36;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [cj.c, java.lang.Object] */
        @Override // aj.b
        public final cj.c c() {
            return new Object();
        }
    }

    @Override // fl.o
    public final String A() {
        return "6215752935825";
    }

    @Override // fl.o
    public final int B(String str) {
        return 2131232956;
    }

    @Override // fl.o
    public final int E(String str) {
        return n.a(46).f37577z;
    }

    @Override // gl.j
    public final int G(String str) {
        return C1987R.string._SYNC_IN_PROGRESS_WIDGET_TITLE_;
    }

    @Override // fl.o
    public final int I(String str) {
        return C1987R.string._WPM06_NAME_;
    }

    @Override // fl.o
    public final int M(String str) {
        return 2131231271;
    }

    @Override // fl.o
    public final int Q() {
        return C1987R.string._SHOP_DEFAULT_URL_;
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
        return new Wpm06UpgradeSetup();
    }

    @Override // gl.a0
    public final boolean V(Device device) {
        u.j(device, "device");
        if (device.getNetwork() == 4) {
            return true;
        }
        return false;
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
        return 46;
    }

    @Override // fl.o
    public final int a0() {
        return 0;
    }

    @Override // gl.j
    public final d b(Context context) {
        u.j(context, "context");
        return new wi.g(context);
    }

    @Override // fl.o
    public final Setup e0(DeviceModel deviceModel) {
        return new Wpm06InstallSetup();
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

    @Override // gl.a0
    public final boolean i() {
        return false;
    }

    @Override // jq.c
    public final boolean j(int i11, long j5) {
        return true;
    }

    @Override // gl.j
    public final WppDeviceConversation j0(Integer num) {
        return new Wpm06SyncConversation(0);
    }

    @Override // jq.c
    public final boolean k0() {
        return false;
    }

    @Override // gl.a0
    public final boolean l0() {
        return false;
    }

    @Override // gl.n0
    public final int m() {
        return C1987R.string._ZENDESK_WPM06_URL_;
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
        return new Wpm06NetworkSetup();
    }

    @Override // gl.a0
    public final boolean q() {
        return false;
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
        u.j(context, "context");
        u.j(device, "device");
        ej.w w11 = ej.w.w();
        u.i(w11, "get(...)");
        return new fl.a(context, device, w11, new com.withings.wiscale2.device.wpm.wpm06.a(w11));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aj.b, java.lang.Object] */
    @Override // fl.o
    public final aj.b w() {
        return new Object();
    }

    @Override // fl.o.a
    public final boolean x() {
        return true;
    }
}
