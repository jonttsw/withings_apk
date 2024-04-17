package com.withings.common.compose.component;

import android.content.Context;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.material.h6;
import androidx.compose.material3.p8;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.library.authentication.api.ConstantsWs;
import ga.f;
import java.util.List;
import x1.b;
/* compiled from: SliderWithImage.kt */
/* loaded from: classes3.dex */
public final class l4 {
    public static final void a(int i11, int i12, int i13, androidx.compose.runtime.a aVar, androidx.compose.ui.e eVar, List items, ym0.l onValueChange) {
        e.a aVar2;
        int i14;
        float f11;
        int i15;
        float f12;
        kotlin.jvm.internal.u.j(items, "items");
        kotlin.jvm.internal.u.j(onValueChange, "onValueChange");
        androidx.compose.runtime.b g11 = aVar.g(-72526455);
        if ((i13 & 1) != 0) {
            aVar2 = androidx.compose.ui.e.f8927a;
        } else {
            aVar2 = eVar;
        }
        if ((i13 & 4) != 0) {
            i14 = ((i4) kotlin.collections.x.I(items)).a();
        } else {
            i14 = i11;
        }
        g11.s(-532373310);
        Object t11 = g11.t();
        if (t11 == a.C0060a.a()) {
            t11 = androidx.compose.runtime.l0.f(((i4) items.get(i14)).c(), androidx.compose.runtime.v0.f8878a);
            g11.n(t11);
        }
        k1.r0 r0Var = (k1.r0) t11;
        Object a11 = com.huawei.hms.health.a.a(g11, -532373233);
        if (a11 == a.C0060a.a()) {
            a11 = androidx.compose.runtime.l0.f(((i4) items.get(i14)).b(), androidx.compose.runtime.v0.f8878a);
            g11.n(a11);
        }
        k1.r0 r0Var2 = (k1.r0) a11;
        Object a12 = com.huawei.hms.health.a.a(g11, -532373156);
        if (a12 == a.C0060a.a()) {
            a12 = androidx.compose.runtime.l0.f(Float.valueOf(i14), androidx.compose.runtime.v0.f8878a);
            g11.n(a12);
        }
        k1.r0 r0Var3 = (k1.r0) a12;
        g11.J();
        e.a aVar3 = androidx.compose.ui.e.f8927a;
        androidx.compose.ui.e n11 = androidx.compose.foundation.layout.x0.j(androidx.compose.foundation.layout.e1.d(aVar3), 0.0f, 0.0f, 0.0f, yk.h.b(), 7).n(aVar2);
        g11.s(-483455358);
        androidx.compose.ui.layout.l0 b10 = android.support.v4.media.session.c.b(androidx.compose.foundation.layout.e.h(), g11, -1323940314);
        int G = g11.G();
        k1.v0 l5 = g11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a13 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(n11);
        if (g11.i() instanceof k1.d) {
            g11.A();
            if (g11.e()) {
                g11.F(a13);
            } else {
                g11.m();
            }
            ym0.p b11 = com.withings.authentication.e.b(g11, b10, g11, l5);
            if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                androidx.camera.camera2.internal.l0.d(G, g11, G, b11);
            }
            c11.invoke(k1.j1.a(g11), g11, 0);
            g11.s(2058660585);
            f.a aVar4 = new f.a((Context) g11.D(androidx.compose.ui.platform.u0.d()));
            aVar4.d((String) r0Var2.getValue());
            aVar4.f();
            aVar4.j();
            aVar4.c();
            x9.c a14 = x9.n.a(aVar4.b(), g11, 8);
            g11.s(-861930810);
            String str = (String) r0Var2.getValue();
            if (str == null || str.length() == 0) {
                f11 = 1.0f;
                i15 = -1323940314;
            } else {
                f11 = 1.0f;
                i15 = -1323940314;
                n0.z.a(a14, "Slider image", androidx.compose.foundation.layout.w0.a(aVar3, 1.0f), null, null, 0.0f, null, g11, 432, 120);
            }
            g11.J();
            g11.s(-861930589);
            String str2 = (String) r0Var.getValue();
            if (str2 != null && str2.length() > 0) {
                androidx.compose.ui.e f13 = androidx.compose.foundation.layout.x0.f(new HorizontalAlignElement(b.a.g()), yk.h.q());
                String str3 = (String) r0Var.getValue();
                kotlin.jvm.internal.u.g(str3);
                nk.a0.g(0, 0, 28, 0L, g11, f13, null, str3);
            }
            g11.J();
            androidx.compose.ui.e h11 = androidx.compose.foundation.layout.x0.h(androidx.compose.foundation.layout.e1.e(aVar3, f11), yk.h.r(), 0.0f, 2);
            g11.s(693286680);
            androidx.compose.ui.layout.l0 a15 = a0.a.a(androidx.compose.foundation.layout.e.g(), g11, i15);
            int G2 = g11.G();
            k1.v0 l6 = g11.l();
            ym0.a a16 = g.a.a();
            s1.a c12 = androidx.compose.ui.layout.y.c(h11);
            if (g11.i() instanceof k1.d) {
                g11.A();
                if (g11.e()) {
                    g11.F(a16);
                } else {
                    g11.m();
                }
                ym0.p b12 = com.withings.authentication.e.b(g11, a15, g11, l6);
                if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G2))) {
                    androidx.camera.camera2.internal.l0.d(G2, g11, G2, b12);
                }
                dq.x.b(0, c12, k1.j1.a(g11), g11, 2058660585);
                g11.s(1318365901);
                String c13 = ((i4) kotlin.collections.x.I(items)).c();
                if (c13 == null || c13.length() == 0) {
                    f12 = 0.0f;
                } else {
                    String c14 = ((i4) kotlin.collections.x.I(items)).c();
                    kotlin.jvm.internal.u.g(c14);
                    f12 = 0.0f;
                    nk.a.d(aVar3, c14, 0L, null, 0, 0, null, g11, 6, 124);
                }
                g11.J();
                if (f11 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    r0.d0.a(new LayoutWeightElement(en0.r.f(f11, Float.MAX_VALUE), true), g11);
                    g11.s(-861930002);
                    String c15 = ((i4) kotlin.collections.x.T(items)).c();
                    if (c15 != null && c15.length() != 0) {
                        String c16 = ((i4) kotlin.collections.x.T(items)).c();
                        kotlin.jvm.internal.u.g(c16);
                        nk.a.d(null, c16, 0L, null, 0, 0, null, g11, 0, 125);
                    }
                    g11.J();
                    g11.J();
                    g11.o();
                    g11.J();
                    g11.J();
                    int i16 = i14;
                    androidx.compose.ui.e eVar2 = aVar2;
                    p8.a(((Number) r0Var3.getValue()).floatValue(), new j4(items, onValueChange, r0Var3, r0Var, r0Var2), androidx.compose.foundation.layout.x0.h(aVar3, yk.h.q(), f12, 2), false, en0.r.p(f12, kotlin.collections.x.M(items)), items.size() - 2, null, null, null, g11, ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED, 456);
                    androidx.compose.runtime.v b13 = h6.b(g11);
                    if (b13 != null) {
                        b13.G(new k4(i16, i12, i13, eVar2, items, onValueChange));
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException(defpackage.b.b("invalid weight ", f11, "; must be greater than zero").toString());
            }
            a3.g.s();
            throw null;
        }
        a3.g.s();
        throw null;
    }
}
