package com.withings.notifications.ui;

import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import com.withings.common.compose.component.ButtonSize;
import com.withings.common.compose.component.l2;
import com.withings.wiscale2.C1987R;
import k1.j1;
import k1.o1;
import x1.b;
/* compiled from: NotificationsActivity.kt */
/* loaded from: classes4.dex */
final class f0 extends kotlin.jvm.internal.w implements ym0.q<s0.b, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ o1<Float> f42918a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f42919b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(o1<Float> o1Var, k1.r0<Boolean> r0Var) {
        super(3);
        this.f42918a = o1Var;
        this.f42919b = r0Var;
    }

    @Override // ym0.q
    public final nm0.y invoke(s0.b bVar, androidx.compose.runtime.a aVar, Integer num) {
        int i11;
        s0.b item = bVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(item, "$this$item");
        if ((intValue & 14) == 0) {
            if (aVar2.K(item)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            intValue |= i11;
        }
        if ((intValue & 91) == 18 && aVar2.h()) {
            aVar2.C();
        } else {
            e.a aVar3 = androidx.compose.ui.e.f8927a;
            androidx.compose.ui.e c11 = bj0.d.c(s0.b.b(item, item.c(aVar3, 1.0f)), this.f42918a.getValue().floatValue());
            aVar2.s(733328855);
            androidx.compose.ui.layout.l0 c12 = com.withings.authentication.n.c(false, aVar2, -1323940314);
            int G = aVar2.G();
            k1.v0 l5 = aVar2.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a11 = g.a.a();
            s1.a c13 = androidx.compose.ui.layout.y.c(c11);
            if (aVar2.i() instanceof k1.d) {
                aVar2.A();
                if (aVar2.e()) {
                    aVar2.F(a11);
                } else {
                    aVar2.m();
                }
                ym0.p c14 = com.google.protobuf.t.c(aVar2, c12, aVar2, l5);
                if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G))) {
                    l0.q.a(G, aVar2, G, c14);
                }
                l0.r.c(0, c13, j1.a(aVar2), aVar2, 2058660585);
                androidx.compose.ui.e j5 = androidx.compose.foundation.layout.x0.j(androidx.compose.foundation.layout.m.f4307a.g(aVar3, b.a.e()), 0.0f, yk.h.B(), 0.0f, 0.0f, 13);
                String u11 = ay.b.u(C1987R.string.notificationStack_readCTA, aVar2);
                l2.b bVar2 = new l2.b(s2.d.a(C1987R.drawable.ic_bell, aVar2));
                ButtonSize buttonSize = ButtonSize.f33304f;
                aVar2.s(1320255625);
                Object t11 = aVar2.t();
                if (t11 == a.C0060a.a()) {
                    t11 = new e0(this.f42919b);
                    aVar2.n(t11);
                }
                aVar2.J();
                com.withings.common.compose.component.l.a(j5, u11, bVar2, false, null, buttonSize, false, (ym0.a) t11, aVar2, 12780032, 88);
                defpackage.d.j(aVar2);
            } else {
                a3.g.s();
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}
