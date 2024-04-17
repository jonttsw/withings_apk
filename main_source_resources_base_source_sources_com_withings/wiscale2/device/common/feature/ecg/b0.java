package com.withings.wiscale2.device.common.feature.ecg;

import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
public final class b0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f51203a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(int i11) {
        super(2);
        this.f51203a = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            e.a aVar3 = androidx.compose.ui.e.f8927a;
            androidx.compose.ui.e s11 = ah.k.s(androidx.compose.foundation.layout.e1.e(aVar3, 1.0f));
            aVar2.s(733328855);
            androidx.compose.ui.layout.l0 c11 = com.withings.authentication.n.c(false, aVar2, -1323940314);
            int G = aVar2.G();
            k1.v0 l5 = aVar2.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a11 = g.a.a();
            s1.a c12 = androidx.compose.ui.layout.y.c(s11);
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
                n0.z.a(s2.d.a(this.f51203a, aVar2), "Ecg description", androidx.compose.foundation.layout.e1.e(aVar3, 1.0f), null, null, 0.0f, null, aVar2, 440, 120);
                defpackage.d.j(aVar2);
            } else {
                a3.g.s();
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}
