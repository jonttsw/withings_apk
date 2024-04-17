package com.withings.wiscale2.partner.ui;

import androidx.compose.foundation.layout.e;
import androidx.compose.material.c5;
import androidx.compose.ui.node.g;
import com.withings.wiscale2.C1987R;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PartnerExchangesFragment.kt */
/* loaded from: classes5.dex */
public final class o0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e0 f59172a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f59173b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ c5 f59174c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(e0 e0Var, CoroutineScope coroutineScope, c5 c5Var) {
        super(2);
        this.f59172a = e0Var;
        this.f59173b = coroutineScope;
        this.f59174c = c5Var;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            androidx.compose.ui.e g11 = androidx.compose.foundation.layout.x0.g(androidx.compose.ui.e.f8927a, yk.h.o(), yk.h.B());
            int i11 = androidx.compose.foundation.layout.e.f4229i;
            e.h o11 = androidx.compose.foundation.layout.e.o(yk.h.c());
            aVar2.s(-483455358);
            androidx.compose.ui.layout.l0 b10 = com.withings.authentication.n.b(o11, aVar2, -1323940314);
            int G = aVar2.G();
            k1.v0 l5 = aVar2.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a11 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(g11);
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
                e0 e0Var = this.f59172a;
                nk.a.d(null, ay.b.u(e0.F1(e0Var), aVar2), 0L, null, 0, 0, null, aVar2, 0, 125);
                com.withings.common.compose.component.l.a(null, ay.b.u(C1987R.string.partner_deactivate, aVar2), null, false, null, null, false, new l0(e0Var), aVar2, 0, 125);
                com.withings.common.compose.component.l.c(null, ay.b.u(C1987R.string._CANCEL_, aVar2), null, false, null, null, false, new n0(this.f59174c, this.f59173b), aVar2, 0, 125);
                defpackage.d.j(aVar2);
            } else {
                a3.g.s();
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}
