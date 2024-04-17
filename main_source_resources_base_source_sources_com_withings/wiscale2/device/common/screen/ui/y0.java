package com.withings.wiscale2.device.common.screen.ui;

import androidx.compose.material.f5;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import com.withings.devicescreens.model.CustomScreenMode;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.common.screen.ui.y1;
import x1.b;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ScreenSelectionActivity.kt */
/* loaded from: classes5.dex */
public final class y0 extends kotlin.jvm.internal.w implements ym0.q<r0.w, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f53470a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ y1 f53471b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f53472c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f53473d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ym0.l<sc0.b, nm0.y> f53474e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ ym0.l<Integer, nm0.y> f53475f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f53476g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f53477h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ ym0.l<sc0.b, nm0.y> f53478i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f53479j;

    /* renamed from: k  reason: collision with root package name */
    final /* synthetic */ ym0.l<sc0.b, nm0.y> f53480k;

    /* renamed from: l  reason: collision with root package name */
    final /* synthetic */ ym0.p<Integer, Integer, nm0.y> f53481l;

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ ym0.l<CustomScreenMode, nm0.y> f53482m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y0(androidx.compose.ui.e eVar, y1 y1Var, boolean z5, ym0.a<nm0.y> aVar, ym0.l<? super sc0.b, nm0.y> lVar, ym0.l<? super Integer, nm0.y> lVar2, ym0.a<nm0.y> aVar2, ym0.a<nm0.y> aVar3, ym0.l<? super sc0.b, nm0.y> lVar3, ym0.a<nm0.y> aVar4, ym0.l<? super sc0.b, nm0.y> lVar4, ym0.p<? super Integer, ? super Integer, nm0.y> pVar, ym0.l<? super CustomScreenMode, nm0.y> lVar5) {
        super(3);
        this.f53470a = eVar;
        this.f53471b = y1Var;
        this.f53472c = z5;
        this.f53473d = aVar;
        this.f53474e = lVar;
        this.f53475f = lVar2;
        this.f53476g = aVar2;
        this.f53477h = aVar3;
        this.f53478i = lVar3;
        this.f53479j = aVar4;
        this.f53480k = lVar4;
        this.f53481l = pVar;
        this.f53482m = lVar5;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.w wVar, androidx.compose.runtime.a aVar, Integer num) {
        boolean z5;
        boolean z11;
        int i11;
        r0.w it = wVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(it, "it");
        if ((intValue & 14) == 0) {
            if (aVar2.K(it)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            intValue |= i11;
        }
        if ((intValue & 91) == 18 && aVar2.h()) {
            aVar2.C();
        } else {
            androidx.compose.ui.e eVar = this.f53470a;
            androidx.compose.ui.e e11 = androidx.compose.foundation.layout.e1.e(eVar, 1.0f);
            aVar2.s(-483455358);
            androidx.compose.ui.layout.l0 a11 = androidx.compose.material.v.a(androidx.compose.foundation.layout.e.h(), aVar2, -1323940314);
            int G = aVar2.G();
            k1.v0 l5 = aVar2.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a12 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(e11);
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
                r0.i iVar = r0.i.f94242a;
                e.a aVar3 = androidx.compose.ui.e.f8927a;
                androidx.compose.ui.e c13 = n0.y0.c(iVar.a(aVar3, true), n0.y0.b(aVar2), false, 14);
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
                    l0.r.c(0, c14, k1.j1.a(aVar2), aVar2, 2058660585);
                    r0.d0.a(androidx.compose.foundation.layout.x0.h(androidx.compose.foundation.layout.x0.e(aVar3, it), 0.0f, yk.h.B(), 1), aVar2);
                    y1 y1Var = this.f53471b;
                    boolean z12 = y1Var instanceof y1.d;
                    if (!z12 && !(y1Var instanceof y1.a)) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    l0.g.c(iVar, z5, null, null, null, null, s1.b.b(aVar2, 83391716, new x0(y1Var, this.f53482m)), aVar2, 1572870, 30);
                    boolean z13 = y1Var instanceof y1.c;
                    if (z13) {
                        aVar2.s(-1443842886);
                        androidx.compose.ui.e d11 = androidx.compose.foundation.layout.e1.d(aVar3);
                        aVar2.s(733328855);
                        androidx.compose.ui.layout.l0 c16 = com.withings.authentication.n.c(false, aVar2, -1323940314);
                        int G3 = aVar2.G();
                        k1.v0 l11 = aVar2.l();
                        ym0.a a15 = g.a.a();
                        s1.a c17 = androidx.compose.ui.layout.y.c(d11);
                        if (aVar2.i() instanceof k1.d) {
                            aVar2.A();
                            if (aVar2.e()) {
                                aVar2.F(a15);
                            } else {
                                aVar2.m();
                            }
                            ym0.p c18 = com.google.protobuf.t.c(aVar2, c16, aVar2, l11);
                            if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G3))) {
                                l0.q.a(G3, aVar2, G3, c18);
                            }
                            l0.r.c(0, c17, k1.j1.a(aVar2), aVar2, 2058660585);
                            z11 = z13;
                            f5.b(0.0f, 0, 0, 30, 0L, 0L, aVar2, androidx.compose.foundation.layout.m.f4307a.g(aVar3, b.a.e()));
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
                        z11 = z13;
                        ym0.l<sc0.b, nm0.y> lVar = this.f53474e;
                        ym0.l<Integer, nm0.y> lVar2 = this.f53475f;
                        ym0.a<nm0.y> aVar4 = this.f53476g;
                        ym0.a<nm0.y> aVar5 = this.f53477h;
                        if (z12) {
                            aVar2.s(-1443842611);
                            w1.h(((y1.d) y1Var).a(), lVar, lVar2, aVar4, aVar5, aVar2, 8);
                            aVar2.J();
                        } else {
                            boolean z14 = y1Var instanceof y1.a;
                            ym0.l<sc0.b, nm0.y> lVar3 = this.f53478i;
                            ym0.a<nm0.y> aVar6 = this.f53479j;
                            ym0.l<sc0.b, nm0.y> lVar4 = this.f53480k;
                            if (z14) {
                                aVar2.s(-1443842093);
                                y1.a aVar7 = (y1.a) y1Var;
                                w1.b(aVar7.a(), lVar, lVar3, lVar2, aVar4, aVar5, aVar6, aVar2, 8, 0);
                                w1.c(aVar7.b(), lVar, lVar4, lVar2, aVar4, aVar5, aVar6, aVar2, 8);
                                aVar2.J();
                            } else if (y1Var instanceof y1.b) {
                                aVar2.s(-1443840836);
                                y1.b bVar = (y1.b) y1Var;
                                w1.e(bVar.a(), this.f53481l, lVar3, lVar2, aVar2, 8);
                                w1.c(kotlin.collections.x.V(new sc0.c(null, bVar.b())), null, lVar4, lVar2, aVar4, aVar5, aVar6, aVar2, 56);
                                aVar2.J();
                            } else {
                                aVar2.s(-1443839879);
                                aVar2.J();
                            }
                        }
                    }
                    aVar2.J();
                    aVar2.o();
                    aVar2.J();
                    aVar2.J();
                    com.withings.common.compose.component.l.a(androidx.compose.foundation.layout.x0.g(ah.k.p(eVar), yk.h.o(), yk.h.f()), ay.b.u(C1987R.string.customizeScreens_addToScale_button, aVar2), null, !z11, null, null, this.f53472c, this.f53473d, aVar2, 0, 52);
                    defpackage.d.j(aVar2);
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
