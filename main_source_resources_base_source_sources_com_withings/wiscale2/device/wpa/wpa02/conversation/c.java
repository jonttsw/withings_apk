package com.withings.wiscale2.device.wpa.wpa02.conversation;

import com.withings.comm.remote.exception.ConnectionClosedException;
import com.withings.device.Device;
import com.withings.wiscale2.device.wpa.wpa02.conversation.Wpa02LaunchMeasurementConversation;
import com.withings.wiscale2.device.wpa.wpa02.ui.features.cleansing.Wpa02CleansingModeViewModel;
import ej.k;
import ej.w;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.u;
import me0.d;
import nm0.g;
import nm0.h;
import nm0.l;
import nm0.y;
/* compiled from: Wpa02Submitter.kt */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final Device f55054a;

    /* renamed from: b  reason: collision with root package name */
    private final w f55055b;

    /* renamed from: c  reason: collision with root package name */
    private final Wpa02LaunchMeasurementConversation.a f55056c;

    /* renamed from: d  reason: collision with root package name */
    private final me0.c f55057d;

    /* renamed from: e  reason: collision with root package name */
    private final d f55058e;

    /* renamed from: f  reason: collision with root package name */
    private final g f55059f;

    /* renamed from: g  reason: collision with root package name */
    private Wpa02LaunchMeasurementConversation f55060g;

    /* renamed from: h  reason: collision with root package name */
    private k<Wpa02LaunchMeasurementConversation> f55061h;

    /* renamed from: i  reason: collision with root package name */
    private Wpa02CartridgeConversation f55062i;

    /* renamed from: j  reason: collision with root package name */
    private k<Wpa02CartridgeConversation> f55063j;

    /* renamed from: k  reason: collision with root package name */
    private Wpa02CleansingConversation f55064k;

    /* renamed from: l  reason: collision with root package name */
    private k<Wpa02CleansingConversation> f55065l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f55066m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f55067n;

    public c(Device device, w wppDeviceManager, Wpa02LaunchMeasurementConversation.a aVar, me0.c cVar, Wpa02CleansingModeViewModel wpa02CleansingModeViewModel, int i11) {
        aVar = (i11 & 4) != 0 ? null : aVar;
        cVar = (i11 & 8) != 0 ? null : cVar;
        wpa02CleansingModeViewModel = (i11 & 16) != 0 ? null : wpa02CleansingModeViewModel;
        u.j(device, "device");
        u.j(wppDeviceManager, "wppDeviceManager");
        this.f55054a = device;
        this.f55055b = wppDeviceManager;
        this.f55056c = aVar;
        this.f55057d = cVar;
        this.f55058e = wpa02CleansingModeViewModel;
        this.f55059f = h.b(new b(this));
    }

    public final void b() {
        this.f55066m = false;
        Wpa02CleansingConversation wpa02CleansingConversation = this.f55064k;
        if (wpa02CleansingConversation != null) {
            wpa02CleansingConversation.p();
        }
        k<Wpa02CleansingConversation> kVar = this.f55065l;
        if (kVar != null) {
            kVar.k();
        }
    }

    public final void c() {
        this.f55066m = false;
        Wpa02LaunchMeasurementConversation wpa02LaunchMeasurementConversation = this.f55060g;
        if (wpa02LaunchMeasurementConversation != null) {
            wpa02LaunchMeasurementConversation.p();
        }
        k<Wpa02LaunchMeasurementConversation> kVar = this.f55061h;
        if (kVar != null) {
            kVar.k();
        }
    }

    public final void d() throws IOException, ConnectionClosedException {
        Wpa02CartridgeConversation wpa02CartridgeConversation;
        if (this.f55066m && (wpa02CartridgeConversation = this.f55062i) != null) {
            wpa02CartridgeConversation.L();
        }
    }

    public final void e() {
        Wpa02CartridgeConversation wpa02CartridgeConversation = this.f55062i;
        if (wpa02CartridgeConversation != null) {
            wpa02CartridgeConversation.M();
            y yVar = y.f85009a;
        }
    }

    public final void f() {
        me0.c cVar;
        Object a11;
        if (!this.f55066m && (cVar = this.f55057d) != null) {
            this.f55062i = new Wpa02CartridgeConversation(cVar);
            k<Wpa02CartridgeConversation> t11 = this.f55055b.t((cj.d) this.f55059f.getValue(), this.f55062i);
            this.f55063j = t11;
            try {
                t11.r();
                this.f55066m = true;
                a11 = y.f85009a;
            } catch (Throwable th2) {
                a11 = l.a(th2);
            }
            Throwable b10 = nm0.k.b(a11);
            if (b10 != null) {
                x70.b.d(this, "Submitted conversation raised exception " + b10, new Object[0]);
            }
        }
    }

    public final void g() {
        d dVar;
        Object a11;
        if (!this.f55066m && (dVar = this.f55058e) != null) {
            this.f55064k = new Wpa02CleansingConversation(dVar);
            k<Wpa02CleansingConversation> t11 = this.f55055b.t((cj.d) this.f55059f.getValue(), this.f55064k);
            this.f55065l = t11;
            try {
                t11.r();
                this.f55066m = true;
                a11 = y.f85009a;
            } catch (Throwable th2) {
                a11 = l.a(th2);
            }
            Throwable b10 = nm0.k.b(a11);
            if (b10 != null) {
                x70.b.d(this, "Submitted conversation raised exception " + b10, new Object[0]);
            }
        }
    }

    public final boolean h() {
        return this.f55066m;
    }

    public final void i(List stripTypes) {
        u.j(stripTypes, "stripTypes");
        Wpa02LaunchMeasurementConversation wpa02LaunchMeasurementConversation = this.f55060g;
        if (wpa02LaunchMeasurementConversation != null) {
            wpa02LaunchMeasurementConversation.L(stripTypes);
            y yVar = y.f85009a;
        }
    }

    public final void j() {
        cj.b x11;
        Wpa02CartridgeConversation wpa02CartridgeConversation = this.f55062i;
        if (wpa02CartridgeConversation != null && (x11 = wpa02CartridgeConversation.x()) != null && x11.n()) {
            x70.b.b(wpa02CartridgeConversation, "Cartridge starting install", new Object[0]);
            nj.a aVar = new nj.a(wpa02CartridgeConversation.x());
            aVar.c((short) 2468, new com.withings.comm.wpp.h[0]);
            aVar.j();
        }
        this.f55067n = true;
    }

    public final void k() {
        if (this.f55066m) {
            this.f55066m = false;
            Wpa02CartridgeConversation wpa02CartridgeConversation = this.f55062i;
            if (wpa02CartridgeConversation != null) {
                if (this.f55067n) {
                    try {
                        if (wpa02CartridgeConversation.x() != null && wpa02CartridgeConversation.x().n()) {
                            x70.b.b(wpa02CartridgeConversation, "Cartridge stopping install", new Object[0]);
                            nj.a aVar = new nj.a(wpa02CartridgeConversation.x());
                            aVar.c((short) 2469, new com.withings.comm.wpp.h[0]);
                            aVar.j();
                        }
                    }
                }
                try {
                    Throwable b10 = nm0.k.b(y.f85009a);
                    if (b10 != null) {
                        b10.printStackTrace();
                    }
                    wpa02CartridgeConversation.p();
                }
            }
            this.f55067n = false;
            k<Wpa02CartridgeConversation> kVar = this.f55063j;
            if (kVar != null) {
                kVar.k();
            }
        }
    }

    public final void l() {
        Wpa02LaunchMeasurementConversation.a aVar = this.f55056c;
        if (aVar != null) {
            this.f55060g = new Wpa02LaunchMeasurementConversation(aVar);
            Wpa02LaunchMeasurementConversation wpa02LaunchMeasurementConversation = this.f55060g;
            k<Wpa02LaunchMeasurementConversation> t11 = this.f55055b.t((cj.d) this.f55059f.getValue(), wpa02LaunchMeasurementConversation);
            this.f55061h = t11;
            try {
                t11.r();
                this.f55066m = true;
            } catch (IllegalStateException e11) {
                x70.b.r(this, "Conversation already submitted. " + e11, new Object[0]);
            }
        }
    }
}
