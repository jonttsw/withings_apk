package com.withings.details.height;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.c1;
import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.x0;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.node.g;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import k1.j1;
import k1.v0;
import x1.b;
/* compiled from: HeightListActivity.kt */
/* loaded from: classes3.dex */
final class k extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f36618a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str) {
        super(2);
        this.f36618a = str;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            androidx.compose.ui.e g11 = x0.g(e1.e(androidx.compose.ui.e.f8927a, 1.0f), yk.h.o(), yk.h.c());
            int i11 = androidx.compose.foundation.layout.e.f4229i;
            l0 a11 = c1.a(a0.d.b(aVar2, 693286680), b.a.l(), aVar2);
            aVar2.s(-1323940314);
            int G = aVar2.G();
            v0 l5 = aVar2.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a12 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(g11);
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
                l0.r.c(0, c11, j1.a(aVar2), aVar2, 2058660585);
                if (1.0f > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    nk.a0.g(0, 0, 28, 0L, aVar2, new LayoutWeightElement(en0.r.f(1.0f, Float.MAX_VALUE), true), null, this.f36618a);
                    defpackage.d.j(aVar2);
                } else {
                    throw new IllegalArgumentException(defpackage.b.b("invalid weight ", 1.0f, "; must be greater than zero").toString());
                }
            } else {
                a3.g.s();
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}
