package com.withings.tutorials.ui.screens.explanations;

import com.withings.wiscale2.C1987R;
/* compiled from: SleepScore.kt */
/* loaded from: classes4.dex */
public final class c2 {
    public static final void a(ym0.a aVar, ym0.a aVar2, androidx.compose.runtime.a aVar3, int i11) {
        int i12;
        int i13;
        int i14;
        androidx.compose.runtime.b g11 = aVar3.g(-1587433997);
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
            b70.t0.a(androidx.compose.foundation.layout.x0.j(androidx.compose.ui.e.f8927a, 0.0f, yk.h.u(), 0.0f, 0.0f, 13), s2.d.a(2131232668, g11), ay.b.u(C1987R.string.sleepScoreTutorial_learnTitle, g11), ay.b.u(C1987R.string.sleepScoreTutorial_learnText, g11), aVar, s1.b.b(g11, -1958090021, new w1(aVar2)), null, g11, ((i12 << 12) & 57344) | 196672, 64);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new x1(aVar, aVar2, i11));
        }
    }

    public static final void b(ym0.a aVar, ym0.a aVar2, androidx.compose.runtime.a aVar3, int i11) {
        int i12;
        int i13;
        int i14;
        androidx.compose.runtime.b g11 = aVar3.g(1881467003);
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
            b70.t0.a(androidx.compose.foundation.layout.x0.j(androidx.compose.ui.e.f8927a, 0.0f, yk.h.u(), 0.0f, 0.0f, 13), s2.d.a(2131232666, g11), ay.b.u(C1987R.string.sleepScoreTutorial_introductionTitle, g11), ay.b.u(C1987R.string.sleepScoreTutorial_introductionText, g11), aVar, s1.b.b(g11, -2141949597, new y1(aVar2)), null, g11, ((i12 << 12) & 57344) | 196672, 64);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new z1(aVar, aVar2, i11));
        }
    }

    public static final void c(ym0.a aVar, ym0.a aVar2, androidx.compose.runtime.a aVar3, int i11) {
        int i12;
        int i13;
        int i14;
        androidx.compose.runtime.b g11 = aVar3.g(-247944565);
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
            b70.t0.a(androidx.compose.foundation.layout.x0.j(androidx.compose.ui.e.f8927a, 0.0f, yk.h.u(), 0.0f, 0.0f, 13), s2.d.a(2131232667, g11), ay.b.u(C1987R.string.sleepScoreTutorial_controlTitle, g11), ay.b.u(C1987R.string.sleepScoreTutorial_controlText, g11), aVar, s1.b.b(g11, 33901939, new a2(aVar2)), null, g11, ((i12 << 12) & 57344) | 196672, 64);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new b2(aVar, aVar2, i11));
        }
    }
}
