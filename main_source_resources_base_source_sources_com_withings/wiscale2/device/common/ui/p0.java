package com.withings.wiscale2.device.common.ui;

import android.app.Application;
import com.withings.device.DeviceModel;
/* compiled from: DeviceSharingActivity.kt */
/* loaded from: classes5.dex */
public final class p0 extends androidx.lifecycle.b {

    /* renamed from: a  reason: collision with root package name */
    private final DeviceModel f54037a;

    /* renamed from: b  reason: collision with root package name */
    private final u70.i f54038b;

    /* renamed from: c  reason: collision with root package name */
    private final m70.i f54039c;

    /* renamed from: d  reason: collision with root package name */
    private final kn.e f54040d;

    /* renamed from: e  reason: collision with root package name */
    private final xw.n<a> f54041e;

    /* renamed from: f  reason: collision with root package name */
    private androidx.lifecycle.j0 f54042f;

    /* renamed from: g  reason: collision with root package name */
    private androidx.lifecycle.j0 f54043g;

    /* renamed from: h  reason: collision with root package name */
    private androidx.lifecycle.j0 f54044h;

    /* compiled from: DeviceSharingActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f54045a;

        /* renamed from: b  reason: collision with root package name */
        private final Exception f54046b;

        public a() {
            this(null, null, 3);
        }

        public final Exception a() {
            return this.f54046b;
        }

        public final String b() {
            return this.f54045a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (kotlin.jvm.internal.u.e(this.f54045a, aVar.f54045a) && kotlin.jvm.internal.u.e(this.f54046b, aVar.f54046b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int i11 = 0;
            String str = this.f54045a;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i12 = hashCode * 31;
            Exception exc = this.f54046b;
            if (exc != null) {
                i11 = exc.hashCode();
            }
            return i12 + i11;
        }

        public final String toString() {
            return "SharingResult(message=" + this.f54045a + ", exception=" + this.f54046b + ")";
        }

        public a(String str, Exception exc, int i11) {
            str = (i11 & 1) != 0 ? null : str;
            exc = (i11 & 2) != 0 ? null : exc;
            this.f54045a = str;
            this.f54046b = exc;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(Application application, DeviceModel deviceModel, u70.i iVar) {
        super(application);
        fl.o oVar;
        m70.i b10 = m70.i.b();
        kotlin.jvm.internal.u.i(b10, "get(...)");
        kn.e c11 = kn.e.c();
        kotlin.jvm.internal.u.i(c11, "get(...)");
        this.f54037a = deviceModel;
        this.f54038b = iVar;
        this.f54039c = b10;
        this.f54040d = c11;
        this.f54041e = new xw.n<>();
        if (deviceModel != null) {
            oVar = fl.p.f67672b.a().d(deviceModel.b());
        } else {
            oVar = null;
        }
        androidx.lifecycle.k0 a11 = xw.d.a(oVar);
        this.f54042f = androidx.lifecycle.e1.b(a11, new w0(this, application));
        this.f54043g = androidx.lifecycle.e1.b(a11, new r0(this, application));
        this.f54044h = androidx.lifecycle.e1.b(a11, new t0(this));
    }

    public final androidx.lifecycle.j0 f0() {
        return this.f54043g;
    }

    public final kn.e g0() {
        return this.f54040d;
    }

    public final DeviceModel i0() {
        return this.f54037a;
    }

    public final androidx.lifecycle.j0 j0() {
        return this.f54044h;
    }

    public final u70.i k0() {
        return this.f54038b;
    }

    public final xw.n<a> m0() {
        return this.f54041e;
    }

    public final androidx.lifecycle.j0 p0() {
        return this.f54042f;
    }

    public final m70.i q0() {
        return this.f54039c;
    }
}
