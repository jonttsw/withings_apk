package com.withings.manualLogging.ui.feature.addNote.cycle;

import androidx.compose.runtime.a;
import com.withings.library.authentication.api.ConstantsWs;
/* compiled from: CycleTutorialLogWatchScreen.kt */
/* loaded from: classes4.dex */
public final class q4 {
    public static final void a(int i11, int i12, androidx.compose.runtime.a aVar, ym0.a onFinish, ym0.a onNextClicked) {
        int i13;
        boolean z5;
        androidx.compose.runtime.b bVar;
        int i14;
        int i15;
        int i16;
        kotlin.jvm.internal.u.j(onFinish, "onFinish");
        kotlin.jvm.internal.u.j(onNextClicked, "onNextClicked");
        androidx.compose.runtime.b g11 = aVar.g(238115239);
        if ((i12 & 14) == 0) {
            if (g11.c(i11)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i13 = i16 | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            if (g11.w(onFinish)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i13 |= i15;
        }
        if ((i12 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.w(onNextClicked)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i13 |= i14;
        }
        if ((i13 & 731) == 146 && g11.h()) {
            g11.C();
            bVar = g11;
        } else {
            g11.s(732302188);
            if ((i13 & 112) == 32) {
                z5 = true;
            } else {
                z5 = false;
            }
            Object t11 = g11.t();
            if (z5 || t11 == a.C0060a.a()) {
                t11 = new k4(onFinish);
                g11.n(t11);
            }
            g11.J();
            e.j.a(0, 1, g11, (ym0.a) t11, false);
            h2.d a11 = f1.d.a();
            long O = ((androidx.compose.material3.i1) g11.D(androidx.compose.material3.j1.e())).O();
            r0.x xVar = new r0.x(yk.h.o(), yk.h.B(), yk.h.o(), yk.h.s());
            int i17 = androidx.compose.foundation.layout.e.f4229i;
            bVar = g11;
            wk.c0.b(null, null, a11, onFinish, s1.b.b(g11, -2130546604, new l4(i11)), s1.b.b(g11, 1181427315, new m4(i11)), s1.b.b(g11, 198433938, new n4(onNextClicked)), null, O, false, xVar, androidx.compose.foundation.layout.e.o(yk.h.B()), 0.0f, true, s1.b.b(g11, 1802874989, new o4(i11)), bVar, ((i13 << 6) & 7168) | 1794048, 27648, 4739);
        }
        androidx.compose.runtime.v o02 = bVar.o0();
        if (o02 != null) {
            o02.G(new p4(i11, i12, onFinish, onNextClicked));
        }
    }
}
