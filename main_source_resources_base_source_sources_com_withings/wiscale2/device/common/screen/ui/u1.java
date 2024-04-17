package com.withings.wiscale2.device.common.screen.ui;

import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import sc0.b;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ScreenSelectionActivity.kt */
/* loaded from: classes5.dex */
public final class u1 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ sc0.c f53448a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f53449b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f53450c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.l<Integer, nm0.y> f53451d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ym0.l<sc0.b, nm0.y> f53452e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u1(sc0.c cVar, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, ym0.l<? super Integer, nm0.y> lVar, ym0.l<? super sc0.b, nm0.y> lVar2) {
        super(2);
        this.f53448a = cVar;
        this.f53449b = aVar;
        this.f53450c = aVar2;
        this.f53451d = lVar;
        this.f53452e = lVar2;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.ui.e b10;
        s1.a b11;
        androidx.compose.runtime.a aVar2 = aVar;
        int i11 = 2;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            aVar2.s(-483455358);
            e.a aVar3 = androidx.compose.ui.e.f8927a;
            androidx.compose.ui.layout.l0 a11 = androidx.compose.material.v.a(androidx.compose.foundation.layout.e.h(), aVar2, -1323940314);
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
                aVar2.s(-1010473648);
                sc0.c cVar = this.f53448a;
                int i12 = 0;
                for (Object obj : cVar.b()) {
                    int i13 = i12 + 1;
                    if (i12 >= 0) {
                        sc0.b bVar = (sc0.b) obj;
                        aVar2.z(-1436790964, Long.valueOf(bVar.b()));
                        b10 = androidx.compose.foundation.c.b(androidx.compose.ui.e.f8927a, w1.i(bVar.d(), aVar2), d2.h1.a());
                        androidx.compose.ui.e h11 = androidx.compose.foundation.layout.x0.h(b10, yk.h.d(), 0.0f, i11);
                        String e11 = bVar.e();
                        b.InterfaceC1611b d11 = bVar.d();
                        if (d11 instanceof b.InterfaceC1611b.d) {
                            b11 = s1.b.b(aVar2, 1956058668, new n1(this.f53449b));
                        } else if (d11 instanceof b.InterfaceC1611b.f) {
                            b11 = s1.b.b(aVar2, -1796556061, new p1(this.f53450c));
                        } else if (d11 instanceof b.InterfaceC1611b.C1612b) {
                            b11 = s1.b.b(aVar2, 1912268644, new r1(bVar, this.f53451d));
                        } else {
                            b11 = s1.b.b(aVar2, 93580995, new t1(bVar, this.f53452e));
                        }
                        int i14 = i12;
                        sc0.c cVar2 = cVar;
                        int i15 = i11;
                        androidx.compose.runtime.a aVar4 = aVar2;
                        com.withings.common.compose.component.o.g(h11, null, b11, e11, null, false, false, false, null, null, null, aVar2, 0, 0, 2034);
                        if (i14 != kotlin.collections.x.M(cVar2.b())) {
                            androidx.compose.material.b2.a(0.0f, 0.0f, 0, 15, 0L, aVar4, null);
                        }
                        aVar4.I();
                        i12 = i13;
                        aVar2 = aVar4;
                        cVar = cVar2;
                        i11 = i15;
                    } else {
                        kotlin.collections.x.K0();
                        throw null;
                    }
                }
                androidx.compose.material.v.b(aVar2);
            } else {
                a3.g.s();
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}
