package com.withings.wiscale2.device.common.screen.ui;

import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import sc0.b;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ScreenSelectionActivity.kt */
/* loaded from: classes5.dex */
public final class t0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List<sc0.b> f53429a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.l<sc0.b, nm0.y> f53430b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.l<sc0.b, nm0.y> f53431c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f53432d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f53433e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f53434f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ ym0.l<Integer, nm0.y> f53435g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t0(List<sc0.b> list, ym0.l<? super sc0.b, nm0.y> lVar, ym0.l<? super sc0.b, nm0.y> lVar2, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, ym0.a<nm0.y> aVar3, ym0.l<? super Integer, nm0.y> lVar3) {
        super(2);
        this.f53429a = list;
        this.f53430b = lVar;
        this.f53431c = lVar2;
        this.f53432d = aVar;
        this.f53433e = aVar2;
        this.f53434f = aVar3;
        this.f53435g = lVar3;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.ui.e b10;
        s1.a b11;
        s1.a b12;
        s1.a aVar2;
        androidx.compose.runtime.a aVar3 = aVar;
        int i11 = 2;
        if ((num.intValue() & 11) == 2 && aVar3.h()) {
            aVar3.C();
        } else {
            aVar3.s(-483455358);
            e.a aVar4 = androidx.compose.ui.e.f8927a;
            androidx.compose.ui.layout.l0 a11 = androidx.compose.material.v.a(androidx.compose.foundation.layout.e.h(), aVar3, -1323940314);
            int G = aVar3.G();
            k1.v0 l5 = aVar3.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a12 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(aVar4);
            if (aVar3.i() instanceof k1.d) {
                aVar3.A();
                if (aVar3.e()) {
                    aVar3.F(a12);
                } else {
                    aVar3.m();
                }
                ym0.p c12 = com.google.protobuf.t.c(aVar3, a11, aVar3, l5);
                if (aVar3.e() || !kotlin.jvm.internal.u.e(aVar3.t(), Integer.valueOf(G))) {
                    l0.q.a(G, aVar3, G, c12);
                }
                l0.r.c(0, c11, k1.j1.a(aVar3), aVar3, 2058660585);
                aVar3.s(-1621103074);
                List<sc0.b> list = this.f53429a;
                int i12 = 0;
                for (Object obj : list) {
                    int i13 = i12 + 1;
                    if (i12 >= 0) {
                        sc0.b bVar = (sc0.b) obj;
                        aVar3.z(778204958, Long.valueOf(bVar.b()));
                        b10 = androidx.compose.foundation.c.b(androidx.compose.ui.e.f8927a, w1.i(bVar.d(), aVar3), d2.h1.a());
                        androidx.compose.ui.e h11 = androidx.compose.foundation.layout.x0.h(b10, yk.h.d(), 0.0f, i11);
                        String e11 = bVar.e();
                        b.InterfaceC1611b d11 = bVar.d();
                        if ((d11 instanceof b.InterfaceC1611b.g) || (d11 instanceof b.InterfaceC1611b.h) || (d11 instanceof b.InterfaceC1611b.e) || (d11 instanceof b.InterfaceC1611b.C1612b)) {
                            b11 = s1.b.b(aVar3, -1727657026, new i0(bVar, this.f53430b));
                        } else {
                            b11 = null;
                        }
                        b.InterfaceC1611b d12 = bVar.d();
                        if (d12 instanceof b.InterfaceC1611b.i) {
                            aVar2 = null;
                        } else {
                            if ((d12 instanceof b.InterfaceC1611b.g) || (d12 instanceof b.InterfaceC1611b.h) || (d12 instanceof b.InterfaceC1611b.e) || (d12 instanceof b.InterfaceC1611b.a)) {
                                b12 = s1.b.b(aVar3, -41821092, new k0(bVar, this.f53431c));
                            } else if (d12 instanceof b.InterfaceC1611b.d) {
                                b12 = s1.b.b(aVar3, -17585285, new m0(this.f53432d));
                            } else if (d12 instanceof b.InterfaceC1611b.f) {
                                b12 = s1.b.b(aVar3, 6650522, new o0(this.f53433e));
                            } else if (d12 instanceof b.InterfaceC1611b.c) {
                                b12 = s1.b.b(aVar3, 30886329, new q0(this.f53434f));
                            } else if (d12 instanceof b.InterfaceC1611b.C1612b) {
                                b12 = s1.b.b(aVar3, 55122136, new s0(bVar, this.f53435g));
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar2 = b12;
                        }
                        int i14 = i12;
                        List<sc0.b> list2 = list;
                        int i15 = i11;
                        androidx.compose.runtime.a aVar5 = aVar3;
                        com.withings.common.compose.component.o.g(h11, b11, aVar2, e11, null, false, false, false, null, null, null, aVar3, 0, 0, 2032);
                        if (i14 != kotlin.collections.x.M(list2)) {
                            androidx.compose.material.b2.a(0.0f, 0.0f, 0, 15, 0L, aVar5, null);
                        }
                        aVar5.I();
                        i12 = i13;
                        aVar3 = aVar5;
                        list = list2;
                        i11 = i15;
                    } else {
                        kotlin.collections.x.K0();
                        throw null;
                    }
                }
                androidx.compose.material.v.b(aVar3);
            } else {
                a3.g.s();
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}
