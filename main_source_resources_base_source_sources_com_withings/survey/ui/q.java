package com.withings.survey.ui;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.ui.node.g;
import x1.b;
/* compiled from: ChooseInsightActivity.kt */
/* loaded from: classes4.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static s1.a f44412a = new s1.a(false, -1033501986, a.f44414a);

    /* renamed from: b  reason: collision with root package name */
    public static s1.a f44413b = new s1.a(false, 1187581013, b.f44415a);

    /* compiled from: ChooseInsightActivity.kt */
    /* loaded from: classes4.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f44414a = new kotlin.jvm.internal.w(2);

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                androidx.compose.ui.e f11 = androidx.compose.foundation.layout.x0.f(androidx.compose.foundation.layout.e1.e(androidx.compose.ui.e.f8927a, 1.0f), yk.h.q());
                aVar2.s(-483455358);
                androidx.compose.ui.layout.l0 a11 = androidx.compose.material.v.a(androidx.compose.foundation.layout.e.h(), aVar2, -1323940314);
                int G = aVar2.G();
                k1.v0 l5 = aVar2.l();
                androidx.compose.ui.node.g.D.getClass();
                ym0.a a12 = g.a.a();
                s1.a c11 = androidx.compose.ui.layout.y.c(f11);
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
                    c11.invoke(k1.j1.a(aVar2), aVar2, 0);
                    aVar2.s(2058660585);
                    nk.a0.g(0, 48, 28, 0L, aVar2, new HorizontalAlignElement(b.a.g()), null, "Survey 4710");
                    defpackage.d.j(aVar2);
                } else {
                    a3.g.s();
                    throw null;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: ChooseInsightActivity.kt */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f44415a = new kotlin.jvm.internal.w(2);

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                androidx.compose.ui.e f11 = androidx.compose.foundation.layout.x0.f(androidx.compose.foundation.layout.e1.e(androidx.compose.ui.e.f8927a, 1.0f), yk.h.q());
                aVar2.s(-483455358);
                androidx.compose.ui.layout.l0 a11 = androidx.compose.material.v.a(androidx.compose.foundation.layout.e.h(), aVar2, -1323940314);
                int G = aVar2.G();
                k1.v0 l5 = aVar2.l();
                androidx.compose.ui.node.g.D.getClass();
                ym0.a a12 = g.a.a();
                s1.a c11 = androidx.compose.ui.layout.y.c(f11);
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
                    c11.invoke(k1.j1.a(aVar2), aVar2, 0);
                    aVar2.s(2058660585);
                    nk.a0.g(0, 48, 28, 0L, aVar2, new HorizontalAlignElement(b.a.g()), null, "Add insight manually");
                    defpackage.d.j(aVar2);
                } else {
                    a3.g.s();
                    throw null;
                }
            }
            return nm0.y.f85009a;
        }
    }
}
