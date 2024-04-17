package com.withings.wiscale2.device.common.handcalibration.v2;

import androidx.lifecycle.d0;
import androidx.lifecycle.l0;
import com.withings.device.Device;
import com.withings.wiscale2.device.common.handcalibration.v2.HandsCalibrationConversation;
import dj.p;
import ej.w;
import fl.l;
import kotlin.jvm.internal.u;
import nm0.y;
/* compiled from: HandsCalibrationActivity.kt */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final Device f52764a;

    /* renamed from: b  reason: collision with root package name */
    private final d0 f52765b;

    /* renamed from: c  reason: collision with root package name */
    public l f52766c;

    /* renamed from: d  reason: collision with root package name */
    private final a f52767d;

    /* renamed from: e  reason: collision with root package name */
    private d f52768e;

    /* renamed from: f  reason: collision with root package name */
    private g f52769f;

    /* renamed from: g  reason: collision with root package name */
    private ej.k<HandsCalibrationConversation> f52770g;

    /* renamed from: h  reason: collision with root package name */
    private HandsCalibrationConversation f52771h;

    /* renamed from: i  reason: collision with root package name */
    private final b f52772i;

    /* JADX WARN: Type inference failed for: r2v1, types: [com.withings.wiscale2.device.common.handcalibration.v2.a] */
    public c(Device device, HandsCalibrationActivity lifecycleOwner) {
        u.j(device, "device");
        u.j(lifecycleOwner, "lifecycleOwner");
        this.f52764a = device;
        this.f52765b = lifecycleOwner;
        this.f52767d = new l0() { // from class: com.withings.wiscale2.device.common.handcalibration.v2.a
            @Override // androidx.lifecycle.l0
            public final void onChanged(Object obj) {
                c.a(c.this, (fl.k) obj);
            }
        };
        this.f52772i = new b(this);
    }

    public static void a(c this$0, fl.k deviceState) {
        HandsCalibrationConversation.State state;
        d dVar;
        d dVar2;
        u.j(this$0, "this$0");
        u.j(deviceState, "deviceState");
        String b10 = deviceState.b();
        HandsCalibrationConversation handsCalibrationConversation = this$0.f52771h;
        if (handsCalibrationConversation != null) {
            state = handsCalibrationConversation.L();
        } else {
            state = null;
        }
        if (state == null && (dVar2 = this$0.f52768e) != null) {
            if (b10 == null) {
                b10 = "";
            }
            dVar2.d3(this$0, b10);
        }
        l lVar = this$0.f52766c;
        if (lVar != null) {
            dj.u b11 = lVar.x().b();
            if (b11 instanceof p) {
                int d11 = ((p) b11).d();
                if ((d11 == 4 || d11 == 3 || d11 == 5 || d11 == 8) && (dVar = this$0.f52768e) != null) {
                    dVar.y0(this$0);
                    return;
                }
                return;
            }
            return;
        }
        u.s("deviceStateLiveData");
        throw null;
    }

    public static final void b(c cVar, HandsCalibrationConversation handsCalibrationConversation) {
        g gVar;
        cVar.f52771h = handsCalibrationConversation;
        if (handsCalibrationConversation != null && (gVar = cVar.f52769f) != null) {
            gVar.g(handsCalibrationConversation);
            handsCalibrationConversation.N(gVar);
        }
    }

    public final void c() {
        g gVar = this.f52769f;
        if (gVar != null) {
            gVar.c();
            y yVar = y.f85009a;
        }
    }

    public final boolean d() {
        g gVar = this.f52769f;
        if (gVar != null) {
            return gVar.d();
        }
        return false;
    }

    public final void e() {
        ej.k<HandsCalibrationConversation> kVar = this.f52770g;
        if (kVar != null) {
            kVar.k();
        }
        HandsCalibrationConversation handsCalibrationConversation = this.f52771h;
        if (handsCalibrationConversation != null) {
            handsCalibrationConversation.p();
        }
        l lVar = this.f52766c;
        if (lVar != null) {
            lVar.removeObserver(this.f52767d);
        } else {
            u.s("deviceStateLiveData");
            throw null;
        }
    }

    public final void f(int i11) {
        g gVar = this.f52769f;
        if (gVar != null) {
            gVar.f(i11);
            y yVar = y.f85009a;
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.withings.wiscale2.device.common.handcalibration.v2.e, com.withings.wiscale2.device.common.handcalibration.v2.g, java.lang.Object] */
    public final void g(d dVar) {
        this.f52768e = dVar;
        a aVar = this.f52767d;
        if (dVar != null) {
            l lVar = this.f52766c;
            if (lVar != null) {
                lVar.observe(this.f52765b, aVar);
                g gVar = this.f52769f;
                if (gVar != null) {
                    gVar.h(this.f52768e);
                    return;
                } else if (this.f52770g == null) {
                    Device device = this.f52764a;
                    cj.d b10 = jl.a.b(device);
                    ?? obj = new Object();
                    this.f52769f = obj;
                    obj.h(this.f52768e);
                    device.getColor();
                    HandsCalibrationConversation handsCalibrationConversation = new HandsCalibrationConversation(obj, false, false);
                    w w11 = w.w();
                    w11.getClass();
                    ej.k<HandsCalibrationConversation> u11 = w11.u(b10, handsCalibrationConversation, HandsCalibrationConversation.class);
                    u11.n(this.f52772i);
                    u11.r();
                    this.f52770g = u11;
                    return;
                } else {
                    return;
                }
            }
            u.s("deviceStateLiveData");
            throw null;
        }
        l lVar2 = this.f52766c;
        if (lVar2 != null) {
            lVar2.removeObserver(aVar);
        } else {
            u.s("deviceStateLiveData");
            throw null;
        }
    }

    public final void h() {
        g gVar = this.f52769f;
        if (gVar != null) {
            gVar.i();
            y yVar = y.f85009a;
        }
    }
}
