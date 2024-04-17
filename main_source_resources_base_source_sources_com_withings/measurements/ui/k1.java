package com.withings.measurements.ui;

import androidx.compose.material.n3;
import androidx.compose.material3.o7;
import androidx.compose.ui.node.g;
import com.withings.measurement.model.MeasurementsVertical;
import com.withings.measurements.ui.verticals.a;
/* compiled from: HealthVerticalActivity.kt */
/* loaded from: classes4.dex */
final class k1 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HealthVerticalActivity f42069a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MeasurementsVertical f42070b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(HealthVerticalActivity healthVerticalActivity, MeasurementsVertical measurementsVertical) {
        super(2);
        this.f42069a = healthVerticalActivity;
        this.f42070b = measurementsVertical;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.ui.e b10;
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            HealthVerticalActivity healthVerticalActivity = this.f42069a;
            com.withings.measurements.ui.verticals.a aVar3 = (com.withings.measurements.ui.verticals.a) h6.b.c(healthVerticalActivity.J3().k0(), aVar2).getValue();
            if (aVar3 instanceof a.C0560a) {
                aVar2.s(-748311584);
                com.withings.core.ui.b.a(s1.b.b(aVar2, -1565186867, new j1(aVar3, this.f42070b, healthVerticalActivity)), aVar2, 6);
                aVar2.J();
            } else if (aVar3 instanceof a.b) {
                aVar2.s(-748300074);
                b10 = androidx.compose.foundation.c.b(androidx.compose.foundation.layout.e1.d(androidx.compose.ui.e.f8927a), ((androidx.compose.material3.i1) aVar2.D(androidx.compose.material3.j1.e())).a(), d2.h1.a());
                androidx.compose.ui.layout.l0 b11 = n3.b(aVar2, 733328855, false, aVar2, -1323940314);
                int G = aVar2.G();
                k1.v0 l5 = aVar2.l();
                androidx.compose.ui.node.g.D.getClass();
                ym0.a a11 = g.a.a();
                s1.a c11 = androidx.compose.ui.layout.y.c(b10);
                if (aVar2.i() instanceof k1.d) {
                    aVar2.A();
                    if (aVar2.e()) {
                        aVar2.F(a11);
                    } else {
                        aVar2.m();
                    }
                    ym0.p c12 = com.google.protobuf.t.c(aVar2, b11, aVar2, l5);
                    if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G))) {
                        l0.q.a(G, aVar2, G, c12);
                    }
                    l0.r.c(0, c11, k1.j1.a(aVar2), aVar2, 2058660585);
                    o7.a(0.0f, 0, 0, 31, 0L, 0L, aVar2, null);
                    aVar2.J();
                    aVar2.o();
                    aVar2.J();
                    aVar2.J();
                    aVar2.J();
                } else {
                    a3.g.s();
                    throw null;
                }
            } else {
                aVar2.s(-748299678);
                aVar2.J();
            }
        }
        return nm0.y.f85009a;
    }
}
