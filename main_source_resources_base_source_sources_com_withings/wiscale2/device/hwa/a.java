package com.withings.wiscale2.device.hwa;

import android.content.Context;
import cj.c;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.device.Device;
import com.withings.device.DeviceModel;
import com.withings.devicesetup.Setup;
import com.withings.devicesetup.ui.LottieData;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.vasistas.model.Vasistas;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.common.handcalibration.HandCalibration;
import dj.t;
import fl.e;
import fl.l;
import fl.o;
import gj.g;
import gl.f;
import gl.j;
import gl.k;
import gl.l;
import gl.r0;
import java.util.Arrays;
import java.util.List;
import u70.i;
import uc0.e;
import vi.v;
/* compiled from: Hwa0102Model.java */
/* loaded from: classes5.dex */
public final class a implements o, gl.c, l, k, f, lc0.a, r0, j {

    /* renamed from: f  reason: collision with root package name */
    private static final i f54168f = i.c("FF:FF:FF:FF:FF:FF");

    /* renamed from: g  reason: collision with root package name */
    private static final i f54169g = i.c("03:FF:FF:FF:FF:FF");

    /* renamed from: a  reason: collision with root package name */
    private int f54170a;

    /* renamed from: b  reason: collision with root package name */
    private int f54171b;

    /* renamed from: c  reason: collision with root package name */
    private String f54172c;

    /* renamed from: d  reason: collision with root package name */
    private zh0.i f54173d = new zh0.i("Activite", new d());

    /* renamed from: e  reason: collision with root package name */
    private aj.b f54174e = new C0720a();

    /* compiled from: Hwa0102Model.java */
    /* renamed from: com.withings.wiscale2.device.hwa.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    final class C0720a implements aj.b {
        C0720a() {
        }

        @Override // aj.b
        public final aj.a a() {
            return a.this.f54173d;
        }

        @Override // aj.b
        public final int b() {
            return a.this.f54171b;
        }

        @Override // aj.b
        public final cj.c c() {
            return new c();
        }
    }

    /* compiled from: Hwa0102Model.java */
    /* loaded from: classes5.dex */
    public static class b implements pg.f {

        /* renamed from: a  reason: collision with root package name */
        private int f54176a;

        @Override // pg.f
        public final int d() {
            return this.f54176a;
        }

        @Override // pg.f
        public final void f(int i11) {
            this.f54176a = i11;
        }
    }

    /* compiled from: Hwa0102Model.java */
    /* loaded from: classes5.dex */
    private class c implements cj.c, c.b, c.d {
        c() {
        }

        @Override // cj.c
        public final String a() {
            return a.this.f54172c;
        }

        @Override // cj.c
        public final cj.a b(xi.b bVar) {
            return new v();
        }

        @Override // cj.c.d
        public final boolean c(cj.b bVar) {
            vi.o oVar = (vi.o) bVar.j();
            int c11 = bVar.c();
            if (!i.a(oVar.f()).equals(a.f54168f) && !i.a(oVar.f()).equals(a.f54169g) && c11 != 5 && (oVar.getName() == null || !oVar.getName().toLowerCase().contains("bl_hwa"))) {
                return false;
            }
            return true;
        }

        @Override // cj.c
        public final void d(ej.f fVar) {
            if (u70.a.b().d(5000L)) {
                fVar.m();
            }
        }

        @Override // cj.c
        public final boolean f() {
            return false;
        }

        @Override // cj.c
        public final Object g() {
            return new Object();
        }

        @Override // cj.c
        public final long h(cj.b bVar) {
            if (c(bVar)) {
                return 20000L;
            }
            return 100000L;
        }
    }

    /* compiled from: Hwa0102Model.java */
    /* loaded from: classes5.dex */
    private class d implements aj.a {
        d() {
        }

        @Override // aj.a
        public final boolean a(xi.b bVar) {
            return jl.a.c(bVar);
        }

        @Override // aj.a
        public final boolean b(xi.b bVar, cj.d dVar) {
            if ((bVar instanceof vi.o) && new mj.b((vi.o) bVar).d(dVar)) {
                return true;
            }
            return false;
        }

        @Override // aj.a
        public final g c() {
            return new g.b(vi.o.class);
        }

        @Override // aj.a
        public final boolean d(xi.b bVar) {
            if (!(bVar instanceof vi.o)) {
                return false;
            }
            int a11 = new mj.b((vi.o) bVar).a();
            if (a11 != a.this.f54170a && a11 != 52) {
                return false;
            }
            return true;
        }
    }

    private a(int i11, int i12, String str) {
        this.f54170a = i11;
        this.f54171b = i12;
        this.f54172c = str;
    }

    public static a o() {
        return new a(52, 11, "HWA01");
    }

    public static a q() {
        return new a(53, 12, "HWA02");
    }

    @Override // fl.o
    public final String A() {
        if (this.f54170a == 52) {
            return "6212567026833";
        }
        return "4411850657041";
    }

    @Override // fl.o
    public final int B(String str) {
        return 2131232448;
    }

    @Override // gl.r0
    public final List<Vasistas.Category> C() {
        return Arrays.asList(Vasistas.Category.BODY, Vasistas.Category.MOTION);
    }

    @Override // fl.o
    public final int E(String str) {
        if (this.f54170a == 52) {
            return C1987R.string._HWA01_FAQ_WALKTHROUGH_URL_;
        }
        return C1987R.string._HWA02_FAQ_WALKTHROUGH_URL_;
    }

    @Override // gl.j
    public final int G(String str) {
        if (!ConstantsWs.DEVICE_COLOR_STEEL_BLACK.equals(str) && !ConstantsWs.DEVICE_COLOR_STEEL_WHITE.equals(str) && !ConstantsWs.DEVICE_COLOR_GOLD_RED.equals(str) && !ConstantsWs.DEVICE_COLOR_GOLD_BROWN.equals(str) && !ConstantsWs.DEVICE_COLOR_GOLD_PINK.equals(str) && !ConstantsWs.DEVICE_COLOR_FULL_BLACK.equals(str)) {
            return C1987R.string._HWA02_NOTIF_SYNC_TITLE_;
        }
        return C1987R.string._HWA01_NOTIF_SYNC_TITLE_;
    }

    @Override // gl.c
    public final boolean H(long j5) {
        if (j5 < 1070 && j5 != 0) {
            return false;
        }
        return true;
    }

    @Override // fl.o
    public final int I(String str) {
        if (str == null) {
            if (this.f54170a != 52) {
                return C1987R.string._MD_ACTIVITE_STEEL_;
            }
            return C1987R.string._MD_HWA01_;
        }
        char c11 = 65535;
        switch (str.hashCode()) {
            case -1331732797:
                if (str.equals(ConstantsWs.DEVICE_COLOR_GOLD_PINK)) {
                    c11 = 0;
                    break;
                }
                break;
            case -902311155:
                if (str.equals(ConstantsWs.DEVICE_COLOR_SILVER)) {
                    c11 = 1;
                    break;
                }
                break;
            case 3181279:
                if (str.equals(ConstantsWs.DEVICE_COLOR_GREY)) {
                    c11 = 2;
                    break;
                }
                break;
            case 3441014:
                if (str.equals(ConstantsWs.DEVICE_COLOR_PINK)) {
                    c11 = 3;
                    break;
                }
                break;
            case 3522692:
                if (str.equals(ConstantsWs.DEVICE_COLOR_SAND)) {
                    c11 = 4;
                    break;
                }
                break;
            case 93332111:
                if (str.equals(ConstantsWs.DEVICE_COLOR_AZURE)) {
                    c11 = 5;
                    break;
                }
                break;
            case 93818879:
                if (str.equals(ConstantsWs.DEVICE_COLOR_BLACK)) {
                    c11 = 6;
                    break;
                }
                break;
            case 1653296521:
                if (str.equals(ConstantsWs.DEVICE_COLOR_GOLD_BROWN)) {
                    c11 = 7;
                    break;
                }
                break;
            case 2035252644:
                if (str.equals(ConstantsWs.DEVICE_COLOR_GOLD_RED)) {
                    c11 = '\b';
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
            case 7:
            case '\b':
                return C1987R.string._HWA02_STEEL_GOLD_NAME_;
            case 1:
            case 6:
                return C1987R.string._MD_HWA01_;
            case 2:
            case 3:
            case 4:
            case 5:
                return C1987R.string._MD_ACTIVITE_POP_;
            default:
                return C1987R.string._MD_ACTIVITE_STEEL_;
        }
    }

    @Override // lc0.a
    public final int J() {
        return C1987R.string.setup_deviceConnected_subtitle;
    }

    @Override // fl.o
    public final int M(String str) {
        if (str == null) {
            if (this.f54170a != 52) {
                return 2131231276;
            }
            return 2131231275;
        } else if (ConstantsWs.DEVICE_COLOR_STEEL_BLACK.equals(str)) {
            return 2131231276;
        } else {
            return 2131231275;
        }
    }

    @Override // gl.r0
    public final boolean O() {
        return false;
    }

    @Override // fl.o
    public final int Q() {
        return C1987R.string._SHOP_DEFAULT_URL_;
    }

    @Override // gl.f
    public final Setup U(Device device) {
        return new Hwa0102UpgradeSetup(device.getModel(), false);
    }

    @Override // fl.o
    public final boolean W(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
    }

    @Override // lc0.a
    public final int Z() {
        return yc0.a.a(this.f54170a, null).f37549d;
    }

    @Override // fl.o
    public final int a() {
        return this.f54170a;
    }

    @Override // fl.o
    public final int a0() {
        return 0;
    }

    @Override // gl.j
    public final yi.d b(Context context) {
        return e.a(context);
    }

    @Override // gl.r0
    public final boolean c() {
        return false;
    }

    @Override // fl.o
    public final Setup e0(DeviceModel deviceModel) {
        return new Hwa0102InstallSetup(deviceModel);
    }

    @Override // gl.r0
    public final boolean f0() {
        return false;
    }

    @Override // fl.o
    public final fl.l g(Context context, t tVar) {
        return new fl.l(context, tVar, new l.a(C1987R.string._HWA01_SEARCHING_DETAILS_, true));
    }

    @Override // fl.o
    public final int getDeviceType() {
        return 16;
    }

    @Override // lc0.a
    public final int h() {
        return C1987R.string.setup_deviceConnected_title;
    }

    @Override // gl.r0
    public final boolean i0() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.wiscale2.device.hwa.b, java.lang.Object] */
    @Override // gl.j
    public final WppDeviceConversation j0(Integer num) {
        return new HwaSyncConversation(new Object());
    }

    @Override // gl.c
    public final boolean k(long j5) {
        if (j5 < 1500 && j5 != 0) {
            return false;
        }
        return true;
    }

    @Override // gl.c
    public final boolean m(long j5) {
        if (j5 < 1090 && j5 != 0) {
            return false;
        }
        return true;
    }

    @Override // fl.o
    public final boolean n(int i11) {
        return false;
    }

    @Override // lc0.a
    public final List<HandCalibration> p() {
        return Arrays.asList(new HandCalibration((short) 1, C1987R.string._CALIBRATE_HOURS_HAND_, false), new HandCalibration((short) 0, C1987R.string._CALIBRATE_MINUTES_HAND_, false), new HandCalibration((short) 2, C1987R.string._CALIBRATE_MOTION_HAND_, true));
    }

    @Override // fl.o
    public final e.c t(Context context, Device device) {
        if (W(context)) {
            long firmware = device.getFirmware();
            if (firmware >= 600 || firmware == 0) {
                return new HwaConnector(context, device);
            }
            return null;
        }
        return null;
    }

    @Override // lc0.a
    public final LottieData u() {
        return null;
    }

    @Override // fl.o
    public final aj.b w() {
        return this.f54174e;
    }

    @Override // gl.r0
    public final boolean y() {
        return false;
    }

    @Override // lc0.a
    public final int z() {
        return yc0.a.a(this.f54170a, null).f37549d;
    }
}
