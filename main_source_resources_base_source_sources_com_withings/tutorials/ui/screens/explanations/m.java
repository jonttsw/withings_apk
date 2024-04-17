package com.withings.tutorials.ui.screens.explanations;

import com.withings.wiscale2.C1987R;
/* compiled from: BreathingDisturbance.kt */
/* loaded from: classes4.dex */
public final class m {
    public static final void a(ym0.a aVar, ym0.a aVar2, androidx.compose.runtime.a aVar3, int i11) {
        int i12;
        int i13;
        int i14;
        androidx.compose.runtime.b g11 = aVar3.g(2074530515);
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
            b70.t0.a(null, s2.d.a(2131231168, g11), ay.b.u(C1987R.string.sleepApnea_tutorialTitle1, g11), ay.b.u(C1987R.string.sleepApnea_tutorialDescription1, g11), aVar, s1.b.b(g11, -1586263621, new g(aVar2)), null, g11, ((i12 << 12) & 57344) | 196672, 65);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new h(aVar, aVar2, i11));
        }
    }

    public static final void b(ym0.a aVar, ym0.a aVar2, androidx.compose.runtime.a aVar3, int i11) {
        int i12;
        int i13;
        int i14;
        androidx.compose.runtime.b g11 = aVar3.g(-1398764035);
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
            b70.t0.a(null, s2.d.a(2131231169, g11), ay.b.u(C1987R.string.sleepApnea_tutorialTitle2, g11), ay.b.u(C1987R.string.sleepApnea_tutorialDescription2, g11), aVar, s1.b.b(g11, 7166485, new i(aVar2)), null, g11, ((i12 << 12) & 57344) | 196672, 65);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new j(aVar, aVar2, i11));
        }
    }

    public static final void c(ym0.a aVar, ym0.a aVar2, androidx.compose.runtime.a aVar3, int i11) {
        int i12;
        int i13;
        int i14;
        androidx.compose.runtime.b g11 = aVar3.g(599538169);
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
            b70.t0.a(null, s2.d.a(2131231170, g11), ay.b.u(C1987R.string.sleepApnea_tutorialTitle3, g11), ay.b.u(C1987R.string.sleepApnea_tutorialDescription3, g11), aVar, s1.b.b(g11, 1307073249, new k(aVar2)), null, g11, ((i12 << 12) & 57344) | 196672, 65);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new l(aVar, aVar2, i11));
        }
    }
}
