package com.withings.wiscale2.profile;

import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import androidx.compose.ui.platform.ComposeView;
import com.withings.common.compose.component.y3;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.profile.h;
/* compiled from: ProfileFragment.kt */
/* loaded from: classes5.dex */
final class q0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h.a f59457a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ q f59458b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ComposeView f59459c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(h.a aVar, q qVar, ComposeView composeView) {
        super(2);
        this.f59457a = aVar;
        this.f59458b = qVar;
        this.f59459c = composeView;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            aVar2.s(733328855);
            e.a aVar3 = androidx.compose.ui.e.f8927a;
            androidx.compose.ui.layout.l0 c11 = com.withings.authentication.n.c(false, aVar2, -1323940314);
            int G = aVar2.G();
            k1.v0 l5 = aVar2.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a11 = g.a.a();
            s1.a c12 = androidx.compose.ui.layout.y.c(aVar3);
            if (aVar2.i() instanceof k1.d) {
                aVar2.A();
                if (aVar2.e()) {
                    aVar2.F(a11);
                } else {
                    aVar2.m();
                }
                ym0.p c13 = com.google.protobuf.t.c(aVar2, c11, aVar2, l5);
                if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G))) {
                    l0.q.a(G, aVar2, G, c13);
                }
                l0.r.c(0, c12, k1.j1.a(aVar2), aVar2, 2058660585);
                String u11 = ay.b.u(C1987R.string.profile_goal_title, aVar2);
                int i11 = androidx.compose.foundation.layout.e.f4229i;
                y3.d(null, u11, androidx.compose.foundation.layout.e.o(yk.h.B()), yk.h.B(), 0.0f, 0L, s1.b.b(aVar2, 1002755490, new p0(this.f59457a, this.f59458b, this.f59459c)), aVar2, 1572864, 49);
                defpackage.d.j(aVar2);
            } else {
                a3.g.s();
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}
