package com.withings.tutorials.ui.screens.explanations;

import com.withings.wiscale2.C1987R;
/* compiled from: SleepAverageHR.kt */
/* loaded from: classes4.dex */
public final class p1 {
    public static final void a(ym0.a aVar, ym0.a aVar2, androidx.compose.runtime.a aVar3, int i11) {
        int i12;
        int i13;
        int i14;
        androidx.compose.runtime.b g11 = aVar3.g(1712224464);
        if ((i11 & 14) == 0) {
            if (g11.w(aVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(aVar2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && g11.h()) {
            g11.C();
        } else {
            b70.t0.a(null, s2.d.a(2131232661, g11), ay.b.u(C1987R.string.sleepScore_sleepHR_tutorial_monitorTitle, g11), ay.b.u(C1987R.string.sleepScore_sleepHR_tutorial_monitorDescription, g11), aVar, s1.b.b(g11, 1540361448, new j1(aVar2)), null, g11, ((i12 << 12) & 57344) | 196672, 65);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new k1(aVar, aVar2, i11));
        }
    }

    public static final void b(ym0.a aVar, ym0.a aVar2, androidx.compose.runtime.a aVar3, int i11) {
        int i12;
        int i13;
        int i14;
        androidx.compose.runtime.b g11 = aVar3.g(-1163338232);
        if ((i11 & 14) == 0) {
            if (g11.w(aVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(aVar2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && g11.h()) {
            g11.C();
        } else {
            b70.t0.a(null, s2.d.a(2131232663, g11), ay.b.u(C1987R.string.sleepScore_sleepHR_tutorial_lifestyleTitle, g11), ay.b.u(C1987R.string.sleepScore_sleepHR_tutorial_lifestyleDescription, g11), aVar, s1.b.b(g11, -1335201248, new l1(aVar2)), null, g11, ((i12 << 12) & 57344) | 196672, 65);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new m1(aVar, aVar2, i11));
        }
    }

    public static final void c(ym0.a aVar, ym0.a aVar2, androidx.compose.runtime.a aVar3, int i11) {
        int i12;
        int i13;
        int i14;
        androidx.compose.runtime.b g11 = aVar3.g(-576860814);
        if ((i11 & 14) == 0) {
            if (g11.w(aVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(aVar2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && g11.h()) {
            g11.C();
        } else {
            b70.t0.a(null, s2.d.a(2131232662, g11), ay.b.u(C1987R.string.sleepScore_sleepHR_tutorial_lowTitle, g11), ay.b.u(C1987R.string.sleepScore_sleepHR_tutorial_lowDescription, g11), aVar, s1.b.b(g11, 565755482, new n1(aVar2)), null, g11, ((i12 << 12) & 57344) | 196672, 65);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new o1(aVar, aVar2, i11));
        }
    }
}
