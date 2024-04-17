package com.withings.manualLogging.ui.feature.addNote.cycle;

import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import pa.m;
import x1.b;
/* compiled from: CycleTutorialLogWatchScreen.kt */
/* loaded from: classes4.dex */
final class l4 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f41094a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(int i11) {
        super(2);
        this.f41094a = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        String str;
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            e.a aVar3 = androidx.compose.ui.e.f8927a;
            androidx.compose.ui.e j5 = androidx.compose.foundation.layout.x0.j(androidx.compose.foundation.layout.e1.d(aVar3), 0.0f, yk.h.B(), 0.0f, 0.0f, 13);
            androidx.compose.ui.layout.l0 b10 = defpackage.c.b(aVar2, 733328855, false, aVar2, -1323940314);
            int G = aVar2.G();
            k1.v0 l5 = aVar2.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a11 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(j5);
            if (aVar2.i() instanceof k1.d) {
                aVar2.A();
                if (aVar2.e()) {
                    aVar2.F(a11);
                } else {
                    aVar2.m();
                }
                ym0.p c12 = com.google.protobuf.t.c(aVar2, b10, aVar2, l5);
                if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G))) {
                    l0.q.a(G, aVar2, G, c12);
                }
                l0.r.c(0, c11, k1.j1.a(aVar2), aVar2, 2058660585);
                androidx.compose.foundation.layout.m mVar = androidx.compose.foundation.layout.m.f4307a;
                if (this.f41094a == 95) {
                    str = "lottie/hwa10-11_tutorials/LOTTIE-SCANWATCHROSEGOLD-ADD-PERIODS-AND-LOGS.json";
                } else {
                    str = "lottie/hwa10-11_tutorials/LOTTIE-SCANWATCHBLACK-ADD-PERIODS-AND-LOGS.json";
                }
                pa.l c13 = pa.y.c(m.a.a(str), "lottie/hwa10-11_tutorials/images", aVar2, 48, 60);
                pa.h.a(c13.getValue(), androidx.compose.foundation.layout.w0.a(mVar.g(androidx.compose.foundation.layout.e1.e(aVar3, 1.0f), b.a.b()), 1.0f), false, false, null, 0.0f, Integer.MAX_VALUE, false, false, false, null, false, null, null, null, false, aVar2, 1572872, 0, 65468);
                defpackage.d.j(aVar2);
            } else {
                a3.g.s();
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}
