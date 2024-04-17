package com.withings.wiscale2.settings;

import androidx.compose.material3.o7;
import androidx.compose.ui.node.g;
import x1.b;
/* compiled from: SettingsActivity.kt */
/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static s1.a f60023a = new s1.a(false, -1682764807, a.f60024a);

    /* compiled from: SettingsActivity.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f60024a = new kotlin.jvm.internal.w(2);

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            long j5;
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                x1.d e11 = b.a.e();
                androidx.compose.ui.e n11 = androidx.compose.foundation.layout.e1.n(androidx.compose.ui.e.f8927a, 100);
                j5 = d2.f0.f63261e;
                androidx.compose.ui.e b10 = androidx.compose.foundation.c.b(n11, j5, x0.h.b(8));
                aVar2.s(733328855);
                androidx.compose.ui.layout.l0 d11 = androidx.compose.foundation.layout.k.d(e11, false, aVar2);
                aVar2.s(-1323940314);
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
                    ym0.p c12 = com.google.protobuf.t.c(aVar2, d11, aVar2, l5);
                    if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G))) {
                        l0.q.a(G, aVar2, G, c12);
                    }
                    l0.r.c(0, c11, k1.j1.a(aVar2), aVar2, 2058660585);
                    o7.a(0.0f, 0, 0, 31, 0L, 0L, aVar2, null);
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
