package com.withings.wiscale2.sleep.ui.sleepscore;

import androidx.compose.foundation.layout.e;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import com.withings.wiscale2.track.data.SleepScoreColorHelper;
import x1.b;
import x1.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SleepWeekFragment.kt */
/* loaded from: classes5.dex */
public final class z3 extends kotlin.jvm.internal.w implements ym0.q<r0.c, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f61586a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(int i11) {
        super(3);
        this.f61586a = i11;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.c cVar, androidx.compose.runtime.a aVar, Integer num) {
        String valueOf;
        r0.c LabelCell = cVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(LabelCell, "$this$LabelCell");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            d.b i11 = b.a.i();
            int i12 = androidx.compose.foundation.layout.e.f4229i;
            e.h b10 = a0.d.b(aVar2, 693286680);
            e.a aVar3 = androidx.compose.ui.e.f8927a;
            androidx.compose.ui.layout.l0 a11 = androidx.compose.foundation.layout.c1.a(b10, i11, aVar2);
            aVar2.s(-1323940314);
            int G = aVar2.G();
            k1.v0 l5 = aVar2.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a12 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(aVar3);
            if (aVar2.i() instanceof k1.d) {
                aVar2.A();
                if (aVar2.e()) {
                    aVar2.F(a12);
                } else {
                    aVar2.m();
                }
                ym0.p c12 = com.google.protobuf.t.c(aVar2, a11, aVar2, l5);
                if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G))) {
                    l0.q.a(G, aVar2, G, c12);
                }
                l0.r.c(0, c11, k1.j1.a(aVar2), aVar2, 2058660585);
                androidx.compose.ui.e n11 = androidx.compose.foundation.layout.e1.n(aVar3, 12);
                SleepScoreColorHelper sleepScoreColorHelper = SleepScoreColorHelper.INSTANCE;
                int i13 = this.f61586a;
                androidx.compose.foundation.layout.k.a(androidx.compose.foundation.c.b(n11, s2.b.a(sleepScoreColorHelper.getSleepScoreColorRes(i13), aVar2), x0.h.e()), aVar2, 0);
                if (i13 == 0) {
                    valueOf = "-";
                } else {
                    valueOf = String.valueOf(i13);
                }
                nk.j.d(0, 0, 29, 0L, aVar2, null, null, valueOf);
                defpackage.d.j(aVar2);
            } else {
                a3.g.s();
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}
