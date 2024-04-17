package com.withings.wiscale2.partner.ui;

import androidx.compose.material.c5;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import com.withings.partner.model.Partner;
import com.withings.wiscale2.partner.ui.e0;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PartnerExchangesFragment.kt */
/* loaded from: classes5.dex */
public final class s0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k1.o1<Partner> f59202a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ e0 f59203b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k1.o1<Boolean> f59204c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f59205d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ c5 f59206e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(k1.r0 r0Var, e0 e0Var, k1.r0 r0Var2, CoroutineScope coroutineScope, c5 c5Var) {
        super(2);
        this.f59202a = r0Var;
        this.f59203b = e0Var;
        this.f59204c = r0Var2;
        this.f59205d = coroutineScope;
        this.f59206e = c5Var;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            e.a aVar3 = androidx.compose.ui.e.f8927a;
            androidx.compose.ui.e p11 = ah.k.p(aVar3);
            aVar2.s(-483455358);
            androidx.compose.ui.layout.l0 a11 = androidx.compose.material.v.a(androidx.compose.foundation.layout.e.h(), aVar2, -1323940314);
            int G = aVar2.G();
            k1.v0 l5 = aVar2.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a12 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(p11);
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
                e0.a aVar4 = e0.f58960f;
                k1.o1<Partner> o1Var = this.f59202a;
                String u11 = ay.b.u(o1Var.getValue().w(), aVar2);
                e0 e0Var = this.f59203b;
                com.withings.common.compose.component.c5.a(0L, 0L, u11, false, null, null, null, null, false, new p0(e0Var), aVar2, 0, 507);
                androidx.compose.ui.e c13 = n0.y0.c(aVar3, n0.y0.b(aVar2), false, 14);
                aVar2.s(-483455358);
                androidx.compose.ui.layout.l0 a13 = androidx.compose.material.v.a(androidx.compose.foundation.layout.e.h(), aVar2, -1323940314);
                int G2 = aVar2.G();
                k1.v0 l6 = aVar2.l();
                ym0.a a14 = g.a.a();
                s1.a c14 = androidx.compose.ui.layout.y.c(c13);
                if (aVar2.i() instanceof k1.d) {
                    aVar2.A();
                    if (aVar2.e()) {
                        aVar2.F(a14);
                    } else {
                        aVar2.m();
                    }
                    ym0.p c15 = com.google.protobuf.t.c(aVar2, a13, aVar2, l6);
                    if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G2))) {
                        l0.q.a(G2, aVar2, G2, c15);
                    }
                    c14.invoke(k1.j1.a(aVar2), aVar2, 0);
                    aVar2.s(2058660585);
                    e0.C1(e0Var, androidx.compose.foundation.layout.x0.h(aVar3, 0.0f, yk.h.q(), 1), o1Var.getValue(), this.f59204c.getValue().booleanValue(), aVar2, 4096, 0);
                    e0.y1(e0Var, aVar2, 8);
                    e0.A1(e0Var, aVar2, 8);
                    e0.w1(e0Var, new r0(this.f59206e, this.f59205d), aVar2, 64);
                    aVar2.J();
                    aVar2.o();
                    aVar2.J();
                    aVar2.J();
                    aVar2.J();
                    aVar2.o();
                    aVar2.J();
                    aVar2.J();
                } else {
                    a3.g.s();
                    throw null;
                }
            } else {
                a3.g.s();
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}
