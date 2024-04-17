package com.withings.device.details.automatic.activity.detection;

import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.x0;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.node.g;
import com.withings.library.authentication.api.ConstantsWs;
import java.util.Map;
import k1.j1;
import k1.r0;
import k1.v0;
import n0.y0;
import n0.z0;
import r0.d0;
/* compiled from: AutomaticActivityDetection.kt */
/* loaded from: classes3.dex */
final class p extends kotlin.jvm.internal.w implements ym0.q<r0.w, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ z0 f36724a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AutomaticActivityDetection f36725b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(z0 z0Var, AutomaticActivityDetection automaticActivityDetection) {
        super(3);
        this.f36724a = z0Var;
        this.f36725b = automaticActivityDetection;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.w wVar, androidx.compose.runtime.a aVar, Integer num) {
        int i11;
        r0.w paddingValues = wVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(paddingValues, "paddingValues");
        if ((intValue & 14) == 0) {
            if (aVar2.K(paddingValues)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            intValue |= i11;
        }
        if ((intValue & 91) == 18 && aVar2.h()) {
            aVar2.C();
        } else {
            e.a aVar3 = androidx.compose.ui.e.f8927a;
            androidx.compose.ui.e e11 = e1.e(y0.c(x0.e(ah.k.p(aVar3), paddingValues), this.f36724a, false, 14), 1.0f);
            aVar2.s(-483455358);
            l0 a11 = androidx.compose.material.v.a(androidx.compose.foundation.layout.e.h(), aVar2, -1323940314);
            int G = aVar2.G();
            v0 l5 = aVar2.l();
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
                l0.r.c(0, c11, j1.a(aVar2), aVar2, 2058660585);
                AutomaticActivityDetection automaticActivityDetection = this.f36725b;
                AutomaticActivityDetection.A3(automaticActivityDetection, aVar2, 8);
                d0.a(e1.f(aVar3, yk.h.B()), aVar2);
                r0 c13 = h6.b.c(AutomaticActivityDetection.E3(automaticActivityDetection).j0(), aVar2);
                r0 c14 = h6.b.c(AutomaticActivityDetection.E3(automaticActivityDetection).i0(), aVar2);
                AutomaticActivityDetection.z3(automaticActivityDetection, ((Boolean) c13.getValue()).booleanValue(), new n(automaticActivityDetection), aVar2, 512);
                AutomaticActivityDetection.D3(automaticActivityDetection, (Map) c14.getValue(), new o(automaticActivityDetection), aVar2, ConstantsWs.WS_STATUS_ALREADY_EXIST);
                aVar2.J();
                aVar2.o();
                aVar2.J();
                aVar2.J();
            } else {
                a3.g.s();
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}
