package com.withings.wiscale2.device.common.feature.ecg;

import androidx.compose.foundation.layout.e;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import com.withings.wiscale2.C1987R;
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class e1 extends kotlin.jvm.internal.w implements ym0.q<s0.b, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ rq.e f51292a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(rq.e eVar) {
        super(3);
        this.f51292a = eVar;
    }

    @Override // ym0.q
    public final nm0.y invoke(s0.b bVar, androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.ui.e b10;
        s0.b item = bVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(item, "$this$item");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            e.a aVar3 = androidx.compose.ui.e.f8927a;
            b10 = androidx.compose.foundation.c.b(androidx.compose.foundation.layout.x0.j(androidx.compose.foundation.layout.e1.e(aVar3, 1.0f), 0.0f, 0.0f, 0.0f, yk.h.q(), 7), ((androidx.compose.material3.i1) aVar2.D(androidx.compose.material3.j1.e())).O(), d2.h1.a());
            int i11 = androidx.compose.foundation.layout.e.f4229i;
            e.h o11 = androidx.compose.foundation.layout.e.o(yk.h.q());
            aVar2.s(-483455358);
            androidx.compose.ui.layout.l0 b11 = com.withings.authentication.n.b(o11, aVar2, -1323940314);
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
                c11.invoke(k1.j1.a(aVar2), aVar2, 0);
                aVar2.s(2058660585);
                androidx.compose.ui.e j5 = androidx.compose.foundation.layout.x0.j(aVar3, 0.0f, yk.h.q(), 0.0f, 0.0f, 13);
                rq.e eVar = this.f51292a;
                rq.c.a(eVar, j5, aVar2, 0, 0);
                com.withings.common.compose.component.b4.a(ay.b.u(C1987R.string._DETAILS_, aVar2), ay.b.u(eVar.b(), aVar2), null, null, aVar2, 0, 12);
                androidx.compose.material.b2.a(0.0f, 0.0f, 0, 15, 0L, aVar2, null);
                defpackage.d.j(aVar2);
            } else {
                a3.g.s();
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}
