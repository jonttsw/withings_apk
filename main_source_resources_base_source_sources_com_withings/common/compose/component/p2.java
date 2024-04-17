package com.withings.common.compose.component;

import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import x1.b;
/* compiled from: ImageRadioButton.kt */
/* loaded from: classes3.dex */
public final class p2 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ImageRadioButton.kt */
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f34513a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f34514b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f34515c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ g2.c f34516d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.f f34517e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ m0.t0<Boolean> f34518f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f34519g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ String f34520h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, androidx.compose.ui.e eVar, ym0.a<nm0.y> aVar, g2.c cVar, androidx.compose.ui.layout.f fVar, m0.t0<Boolean> t0Var, boolean z5, String str2) {
            super(3);
            this.f34513a = str;
            this.f34514b = eVar;
            this.f34515c = aVar;
            this.f34516d = cVar;
            this.f34517e = fVar;
            this.f34518f = t0Var;
            this.f34519g = z5;
            this.f34520h = str2;
        }

        @Override // ym0.q
        public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            int i11;
            r0.h Card = hVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(Card, "$this$Card");
            if ((intValue & 14) == 0) {
                if (aVar2.K(Card)) {
                    i11 = 4;
                } else {
                    i11 = 2;
                }
                intValue |= i11;
            }
            int i12 = intValue;
            if ((i12 & 91) == 18 && aVar2.h()) {
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
                    androidx.compose.foundation.layout.m mVar = androidx.compose.foundation.layout.m.f4307a;
                    androidx.compose.ui.e d11 = androidx.compose.foundation.layout.e1.d(this.f34514b);
                    aVar2.s(147586047);
                    ym0.a<nm0.y> aVar4 = this.f34515c;
                    boolean K = aVar2.K(aVar4);
                    Object t11 = aVar2.t();
                    if (K || t11 == a.C0060a.a()) {
                        t11 = new n2(aVar4);
                        aVar2.n(t11);
                    }
                    aVar2.J();
                    n0.z.a(this.f34516d, null, androidx.compose.foundation.h.b(d11, false, (ym0.a) t11, 7), null, this.f34517e, 0.0f, null, aVar2, 56, 104);
                    aVar2.s(-1092198378);
                    String str = this.f34513a;
                    if (str == null) {
                        l0.g.b(Card, this.f34518f, mVar.g(androidx.compose.foundation.layout.x0.f(aVar3, yk.h.c()), b.a.c()), androidx.compose.animation.p.h(m0.k.d(200, 0, null, 6), 0.0f, 2), androidx.compose.animation.p.i(m0.k.d(200, 0, null, 6), 2), null, l0.f34037a, aVar2, (i12 & 14) | 1600512, 16);
                    }
                    androidx.compose.material.v.b(aVar2);
                    if (str != null) {
                        CellVerticalMargin cellVerticalMargin = CellVerticalMargin.f33312d;
                        androidx.compose.ui.e f11 = androidx.compose.foundation.layout.x0.f(aVar3, yk.h.d());
                        aVar2.s(147587268);
                        boolean K2 = aVar2.K(aVar4);
                        Object t12 = aVar2.t();
                        if (K2 || t12 == a.C0060a.a()) {
                            t12 = new o2(aVar4);
                            aVar2.n(t12);
                        }
                        aVar2.J();
                        o.i(f11, this.f34519g, (ym0.l) t12, null, null, str, this.f34520h, false, false, false, cellVerticalMargin, aVar2, 6, 6, 920);
                    }
                } else {
                    a3.g.s();
                    throw null;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ImageRadioButton.kt */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f34521a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g2.c f34522b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f34523c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f34524d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.f f34525e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f34526f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f34527g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f34528h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f34529i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.e eVar, g2.c cVar, boolean z5, ym0.a<nm0.y> aVar, androidx.compose.ui.layout.f fVar, String str, String str2, int i11, int i12) {
            super(2);
            this.f34521a = eVar;
            this.f34522b = cVar;
            this.f34523c = z5;
            this.f34524d = aVar;
            this.f34525e = fVar;
            this.f34526f = str;
            this.f34527g = str2;
            this.f34528h = i11;
            this.f34529i = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f34528h | 1);
            String str = this.f34526f;
            String str2 = this.f34527g;
            p2.a(this.f34521a, this.f34522b, this.f34523c, this.f34524d, this.f34525e, str, str2, aVar, g11, this.f34529i);
            return nm0.y.f85009a;
        }
    }

    public static final void a(androidx.compose.ui.e eVar, g2.c imagePainter, boolean z5, ym0.a<nm0.y> onSelectionChange, androidx.compose.ui.layout.f imageContentScale, String str, String str2, androidx.compose.runtime.a aVar, int i11, int i12) {
        e.a aVar2;
        String str3;
        String str4;
        float f11;
        kotlin.jvm.internal.u.j(imagePainter, "imagePainter");
        kotlin.jvm.internal.u.j(onSelectionChange, "onSelectionChange");
        kotlin.jvm.internal.u.j(imageContentScale, "imageContentScale");
        androidx.compose.runtime.b g11 = aVar.g(-1592456331);
        if ((i12 & 1) != 0) {
            aVar2 = androidx.compose.ui.e.f8927a;
        } else {
            aVar2 = eVar;
        }
        if ((i12 & 32) != 0) {
            str3 = null;
        } else {
            str3 = str;
        }
        if ((i12 & 64) != 0) {
            str4 = null;
        } else {
            str4 = str2;
        }
        g11.s(-471099878);
        Object t11 = g11.t();
        if (t11 == a.C0060a.a()) {
            t11 = new m0.t0(Boolean.FALSE);
            g11.n(t11);
        }
        m0.t0 t0Var = (m0.t0) t11;
        g11.J();
        t0Var.g(Boolean.valueOf(z5));
        if (z5) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        androidx.compose.material3.d1.a(null, x0.h.b(yk.h.c()), androidx.compose.material3.z0.b(((androidx.compose.material3.i1) g11.D(androidx.compose.material3.j1.e())).a(), g11, 0), null, ah.k.b(d2.f0.l(((androidx.compose.material3.i1) g11.D(androidx.compose.material3.j1.e())).J(), ((Number) m0.f.b(f11, m0.k.d(200, 0, m0.c0.c(), 2), "borderAlpha", g11, 3072, 20).getValue()).floatValue()), 2), s1.b.b(g11, 619558467, new a(str3, aVar2, onSelectionChange, imagePainter, imageContentScale, t0Var, z5, str4)), g11, 196608, 9);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new b(aVar2, imagePainter, z5, onSelectionChange, imageContentScale, str3, str4, i11, i12));
        }
    }
}
