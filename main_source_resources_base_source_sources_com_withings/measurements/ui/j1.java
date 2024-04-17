package com.withings.measurements.ui;

import androidx.camera.camera2.internal.q2;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import com.withings.common.compose.component.c3;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.measurement.model.MeasurementsVertical;
import com.withings.measurements.ui.verticals.a;
import com.withings.user.core.models.User;
import kotlinx.coroutines.CoroutineScope;
import x1.b;
/* compiled from: HealthVerticalActivity.kt */
/* loaded from: classes4.dex */
final class j1 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ com.withings.measurements.ui.verticals.a f42066a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MeasurementsVertical f42067b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ HealthVerticalActivity f42068c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(com.withings.measurements.ui.verticals.a aVar, MeasurementsVertical measurementsVertical, HealthVerticalActivity healthVerticalActivity) {
        super(2);
        this.f42066a = aVar;
        this.f42067b = measurementsVertical;
        this.f42068c = healthVerticalActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        User I3;
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            Object a11 = q2.a(aVar2, 773894976, -492369756);
            if (a11 == a.C0060a.a()) {
                a11 = androidx.camera.camera2.internal.q.b(k1.y.i(aVar2), aVar2);
            }
            aVar2.J();
            CoroutineScope a12 = ((androidx.compose.runtime.k) a11).a();
            aVar2.J();
            com.withings.measurements.ui.verticals.a aVar3 = this.f42066a;
            a.C0560a c0560a = (a.C0560a) aVar3;
            u0.k0 e11 = u0.n0.e(c0560a.a().indexOf(this.f42067b), new i1(aVar3), aVar2, 0);
            HealthVerticalActivity healthVerticalActivity = this.f42068c;
            cz.l lVar = healthVerticalActivity.f41919i;
            if (lVar != null) {
                I3 = healthVerticalActivity.I3();
                k1.r0 a13 = androidx.compose.runtime.l0.a(lVar.b(I3.getId()), Boolean.FALSE, null, aVar2, 2);
                k1.y.f(Integer.valueOf(e11.L()), new c(this.f42066a, e11, (androidx.lifecycle.d0) aVar2.D(androidx.compose.ui.platform.u0.f()), this.f42068c, null), aVar2);
                e.a aVar4 = androidx.compose.ui.e.f8927a;
                androidx.compose.ui.e d11 = androidx.compose.foundation.layout.e1.d(aVar4);
                androidx.compose.ui.layout.l0 b10 = defpackage.c.b(aVar2, 733328855, false, aVar2, -1323940314);
                int G = aVar2.G();
                k1.v0 l5 = aVar2.l();
                androidx.compose.ui.node.g.D.getClass();
                ym0.a a14 = g.a.a();
                s1.a c11 = androidx.compose.ui.layout.y.c(d11);
                if (aVar2.i() instanceof k1.d) {
                    aVar2.A();
                    if (aVar2.e()) {
                        aVar2.F(a14);
                    } else {
                        aVar2.m();
                    }
                    ym0.p c12 = com.google.protobuf.t.c(aVar2, b10, aVar2, l5);
                    if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G))) {
                        l0.q.a(G, aVar2, G, c12);
                    }
                    l0.r.c(0, c11, k1.j1.a(aVar2), aVar2, 2058660585);
                    androidx.compose.foundation.layout.m mVar = androidx.compose.foundation.layout.m.f4307a;
                    u0.o.a(e11, androidx.compose.foundation.layout.e1.d(aVar4), null, null, 3, 0.0f, null, null, false, false, new d(aVar3), null, s1.b.b(aVar2, 1587978198, new h1(aVar3, healthVerticalActivity, a13, a12)), aVar2, 24624, ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED, 3052);
                    c3.a(c0560a.a().size(), e11.s(), androidx.compose.foundation.layout.x0.j(ah.k.p(mVar.g(aVar4, b.a.b())), 0.0f, 0.0f, 0.0f, yk.h.d(), 7), aVar2, 0, 0);
                    defpackage.d.j(aVar2);
                } else {
                    a3.g.s();
                    throw null;
                }
            } else {
                kotlin.jvm.internal.u.s("healthScoreInfoCardRepository");
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}
