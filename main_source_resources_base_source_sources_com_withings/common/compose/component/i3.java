package com.withings.common.compose.component;

import android.content.Context;
import androidx.compose.foundation.layout.e;
import androidx.compose.material.g6;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import java.util.List;
import x1.b;
/* compiled from: RecommendedDevicesSection.kt */
/* loaded from: classes3.dex */
public final class i3 {
    public static final void a(int i11, int i12, androidx.compose.runtime.a aVar, androidx.compose.ui.e eVar, String str, List listDevices, ym0.l onDeviceClick) {
        e.a aVar2;
        String str2;
        ym0.a aVar3;
        boolean z5;
        kotlin.jvm.internal.u.j(listDevices, "listDevices");
        kotlin.jvm.internal.u.j(onDeviceClick, "onDeviceClick");
        androidx.compose.runtime.b g11 = aVar.g(-291813827);
        if ((i12 & 2) != 0) {
            aVar2 = androidx.compose.ui.e.f8927a;
        } else {
            aVar2 = eVar;
        }
        if ((i12 & 8) != 0) {
            str2 = null;
        } else {
            str2 = str;
        }
        int i13 = androidx.compose.foundation.layout.e.f4229i;
        e.h b10 = g6.b(g11, -483455358);
        e.a aVar4 = androidx.compose.ui.e.f8927a;
        androidx.compose.ui.layout.l0 a11 = com.withings.authentication.e.a(b10, g11, -1323940314);
        int G = g11.G();
        k1.v0 l5 = g11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a12 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(aVar4);
        if (g11.i() instanceof k1.d) {
            g11.A();
            if (g11.e()) {
                g11.F(a12);
            } else {
                g11.m();
            }
            ym0.p b11 = com.withings.authentication.e.b(g11, a11, g11, l5);
            if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                androidx.camera.camera2.internal.l0.d(G, g11, G, b11);
            }
            dq.x.b(0, c11, k1.j1.a(g11), g11, 2058660585);
            int i14 = i11 >> 3;
            v4.b(aVar2, ay.b.u(C1987R.string.programsMeasurement_recommendedDevices_title, g11), str2, null, 0.0f, 0.0f, 0, 0, g11, (i14 & 14) | (i14 & ConstantsWs.HWFAILURE_ZERO), ConstantsWs.WS_STATUS_WRONGDEVICETYPE);
            androidx.compose.ui.e a13 = n0.y0.a(aVar4, n0.y0.b(g11));
            androidx.compose.ui.layout.l0 a14 = androidx.compose.foundation.layout.c1.a(g6.b(g11, 693286680), b.a.l(), g11);
            g11.s(-1323940314);
            int G2 = g11.G();
            k1.v0 l6 = g11.l();
            ym0.a a15 = g.a.a();
            s1.a c12 = androidx.compose.ui.layout.y.c(a13);
            if (g11.i() instanceof k1.d) {
                g11.A();
                if (g11.e()) {
                    g11.F(a15);
                } else {
                    g11.m();
                }
                ym0.p b12 = com.withings.authentication.e.b(g11, a14, g11, l6);
                if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G2))) {
                    androidx.camera.camera2.internal.l0.d(G2, g11, G2, b12);
                }
                dq.x.b(0, c12, k1.j1.a(g11), g11, 2058660585);
                g11.s(1116927865);
                int i15 = 0;
                for (Object obj : listDevices) {
                    int i16 = i15 + 1;
                    if (i15 >= 0) {
                        kk.a aVar5 = (kk.a) obj;
                        float o11 = i15 == 0 ? yk.h.o() : 0;
                        float o12 = i15 == listDevices.size() - 1 ? yk.h.o() : 0;
                        Context context = (Context) g11.D(androidx.compose.ui.platform.u0.d());
                        androidx.compose.ui.e j5 = androidx.compose.foundation.layout.x0.j(androidx.compose.ui.e.f8927a, o11, 0.0f, o12, 0.0f, 10);
                        String u11 = ay.b.u(aVar5.d(), g11);
                        Object f11 = aVar5.f();
                        if (f11 == null) {
                            f11 = Integer.valueOf(aVar5.b());
                        }
                        Object obj2 = f11;
                        boolean g12 = aVar5.g();
                        g11.s(1385309824);
                        if (!aVar5.g()) {
                            g11.s(-1609356978);
                            if ((((i11 & ConstantsWs.HWFAILURE_ZERO) ^ ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED) > 256 && g11.K(onDeviceClick)) || (i11 & ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED) == 256) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            boolean K = g11.K(aVar5) | z5;
                            Object t11 = g11.t();
                            if (K || t11 == a.C0060a.a()) {
                                t11 = new g3(onDeviceClick, aVar5);
                                g11.n(t11);
                            }
                            aVar3 = (ym0.a) t11;
                            g11.J();
                        } else {
                            aVar3 = null;
                        }
                        g11.J();
                        jk.b.a(g12, u11, obj2, aVar3, j5, g11, 512, 0);
                        i15 = i16;
                    } else {
                        kotlin.collections.x.K0();
                        throw null;
                    }
                }
                g11.J();
                g11.J();
                g11.o();
                g11.J();
                g11.J();
                g11.J();
                g11.o();
                g11.J();
                g11.J();
                androidx.compose.runtime.v o02 = g11.o0();
                if (o02 != null) {
                    o02.G(new h3(i11, i12, aVar2, str2, listDevices, onDeviceClick));
                    return;
                }
                return;
            }
            a3.g.s();
            throw null;
        }
        a3.g.s();
        throw null;
    }
}
