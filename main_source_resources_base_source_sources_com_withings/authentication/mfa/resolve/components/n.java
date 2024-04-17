package com.withings.authentication.mfa.resolve.components;

import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.x0;
import androidx.compose.material3.g9;
import androidx.compose.runtime.v;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.layout.y;
import androidx.compose.ui.node.g;
import com.withings.common.compose.component.ButtonSize;
import com.withings.common.compose.component.v4;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import dq.x;
import ep0.a;
import java.util.Locale;
import k1.j1;
import k1.v0;
import kotlin.jvm.internal.u;
import kotlin.time.DurationUnit;
import ym0.p;
/* compiled from: TooManyRequestsBottomSheet.kt */
/* loaded from: classes3.dex */
public final class n {
    public static final void a(int i11, int i12, androidx.compose.runtime.a aVar, ym0.a onCancel) {
        int i13;
        String str;
        androidx.compose.runtime.b bVar;
        int i14;
        int i15;
        u.j(onCancel, "onCancel");
        androidx.compose.runtime.b g11 = aVar.g(-188889331);
        if ((i12 & 14) == 0) {
            if (g11.c(i11)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i13 = i15 | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            if (g11.w(onCancel)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i13 |= i14;
        }
        if ((i13 & 91) == 18 && g11.h()) {
            g11.C();
            bVar = g11;
        } else {
            DurationUnit durationUnit = DurationUnit.f78024d;
            long j5 = ep0.c.j(i11, durationUnit);
            a.C0892a c0892a = ep0.a.f65838b;
            DurationUnit durationUnit2 = DurationUnit.f78025e;
            if (ep0.a.f(j5, ep0.c.j(1, durationUnit2)) > 0) {
                g11.s(197998101);
                long q11 = ep0.a.q(ep0.c.j(i11, durationUnit), durationUnit2);
                String lowerCase = ay.b.u(C1987R.string._MINUTES_, g11).toLowerCase(Locale.ROOT);
                u.i(lowerCase, "toLowerCase(...)");
                str = q11 + " " + lowerCase;
                g11.J();
            } else if (ep0.a.h(ep0.c.j(i11, durationUnit), ep0.c.j(1, durationUnit2))) {
                g11.s(197998314);
                String lowerCase2 = ay.b.u(C1987R.string._MINUTE_, g11).toLowerCase(Locale.ROOT);
                u.i(lowerCase2, "toLowerCase(...)");
                str = i11 + " " + lowerCase2;
                g11.J();
            } else {
                g11.s(197998423);
                String lowerCase3 = ay.b.u(C1987R.string._SECONDS_, g11).toLowerCase(Locale.ROOT);
                u.i(lowerCase3, "toLowerCase(...)");
                str = i11 + " " + lowerCase3;
                g11.J();
            }
            e.a aVar2 = androidx.compose.ui.e.f8927a;
            androidx.compose.ui.e j11 = x0.j(aVar2, 0.0f, yk.h.r(), 0.0f, 0.0f, 13);
            g11.s(-483455358);
            l0 b10 = android.support.v4.media.session.c.b(androidx.compose.foundation.layout.e.h(), g11, -1323940314);
            int G = g11.G();
            v0 l5 = g11.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a11 = g.a.a();
            s1.a c11 = y.c(j11);
            if (g11.i() instanceof k1.d) {
                g11.A();
                if (g11.e()) {
                    g11.F(a11);
                } else {
                    g11.m();
                }
                p b11 = com.withings.authentication.e.b(g11, b10, g11, l5);
                if (g11.e() || !u.e(g11.t(), Integer.valueOf(G))) {
                    androidx.camera.camera2.internal.l0.d(G, g11, G, b11);
                }
                x.b(0, c11, j1.a(g11), g11, 2058660585);
                com.withings.common.compose.component.v0.b(0.0f, g11, 0, 1);
                v4.b(x0.g(aVar2, yk.h.d(), yk.h.r()), ay.b.v(C1987R.string.mfa_login_antiBrutForce_title, new Object[]{str}, g11), ay.b.u(C1987R.string.mfa_login_antiBrutForce_description, g11), null, 0.0f, 0.0f, 0, 0, g11, 0, ConstantsWs.WS_STATUS_WRONGDEVICETYPE);
                com.withings.common.compose.component.v0.b(0.0f, g11, 0, 1);
                bVar = g11;
                com.withings.common.compose.component.l.a(x0.g(e1.e(aVar2, 1.0f), yk.h.o(), yk.h.f()), ay.b.u(C1987R.string._CLOSE_, g11), null, false, null, ButtonSize.f33303e, false, onCancel, g11, ((i13 << 18) & 29360128) | 196608, 92);
                g9.a(bVar);
            } else {
                a3.g.s();
                throw null;
            }
        }
        v o02 = bVar.o0();
        if (o02 != null) {
            o02.G(new m(i11, i12, onCancel));
        }
    }
}
