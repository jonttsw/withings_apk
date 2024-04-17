package com.withings.wiscale2.sleep.ui.sleepscore;

import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.material.w7;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import com.withings.wiscale2.sleep.ui.sleepscore.SleepAverageHRStatus;
import com.withings.wiscale2.track.data.SleepStat;
import x1.b;
/* compiled from: SleepAverageHRSectionView.kt */
/* loaded from: classes5.dex */
final class h0 extends kotlin.jvm.internal.w implements ym0.q<r0.c, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SleepStat f60983a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(SleepStat sleepStat) {
        super(3);
        this.f60983a = sleepStat;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.c cVar, androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.ui.e b10;
        r0.c LabelCell = cVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(LabelCell, "$this$LabelCell");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            aVar2.s(693286680);
            e.a aVar3 = androidx.compose.ui.e.f8927a;
            androidx.compose.ui.layout.l0 i11 = w7.i(androidx.compose.foundation.layout.e.g(), aVar2, -1323940314);
            int G = aVar2.G();
            k1.v0 l5 = aVar2.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a11 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(aVar3);
            if (aVar2.i() instanceof k1.d) {
                aVar2.A();
                if (aVar2.e()) {
                    aVar2.F(a11);
                } else {
                    aVar2.m();
                }
                ym0.p c12 = com.google.protobuf.t.c(aVar2, i11, aVar2, l5);
                if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G))) {
                    l0.q.a(G, aVar2, G, c12);
                }
                l0.r.c(0, c11, k1.j1.a(aVar2), aVar2, 2058660585);
                SleepStat sleepStat = this.f60983a;
                nk.j.i(0, 0, 28, 0L, aVar2, androidx.compose.foundation.layout.x0.j(aVar3, 0.0f, 0.0f, yk.h.a(), 0.0f, 11), null, sleepStat.getFormattedValue());
                androidx.compose.ui.e g11 = androidx.collection.c.g(androidx.compose.foundation.layout.e1.n(new VerticalAlignElement(b.a.i()), yk.h.c()), x0.h.e());
                SleepAverageHRStatus.a aVar4 = SleepAverageHRStatus.f60613d;
                int value = sleepStat.getValue();
                aVar4.getClass();
                b10 = androidx.compose.foundation.c.b(g11, s2.b.a(SleepAverageHRStatus.a.a(value).a(), aVar2), d2.h1.a());
                androidx.compose.foundation.layout.k.a(b10, aVar2, 0);
                aVar2.J();
                aVar2.o();
                aVar2.J();
                aVar2.J();
            } else {
                a3.g.s();
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}
