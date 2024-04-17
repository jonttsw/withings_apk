package com.withings.wiscale2.device.wpa.wpa02.ui.features.cartridge;

import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.w0;
import androidx.compose.foundation.layout.x0;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.node.g;
import com.withings.common.compose.component.v4;
import com.withings.wiscale2.C1987R;
import k1.j1;
import k1.v0;
import pa.m;
import x1.b;
/* compiled from: CartridgeActivationScreen.kt */
/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static s1.a f55183a = new s1.a(false, -843842368, a.f55185a);

    /* renamed from: b  reason: collision with root package name */
    public static s1.a f55184b = new s1.a(false, -1654591174, b.f55186a);

    /* compiled from: CartridgeActivationScreen.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f55185a = new kotlin.jvm.internal.w(2);

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                v4.e(x0.j(x0.h(e1.e(androidx.compose.ui.e.f8927a, 1.0f), 0.0f, yk.h.q(), 1), 0.0f, yk.h.q(), 0.0f, 0.0f, 13), ay.b.u(C1987R.string.wpa02_activatingCartridge_title, aVar2), ay.b.u(C1987R.string.wpa02_activatingCartridge_description, aVar2), 0, 0, 2, aVar2, 196608, 24);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: CartridgeActivationScreen.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f55186a = new kotlin.jvm.internal.w(3);

        @Override // ym0.q
        public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            r0.h GuidedPresentation = hVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(GuidedPresentation, "$this$GuidedPresentation");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                aVar2.s(733328855);
                e.a aVar3 = androidx.compose.ui.e.f8927a;
                l0 c11 = com.withings.authentication.n.c(false, aVar2, -1323940314);
                int G = aVar2.G();
                v0 l5 = aVar2.l();
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
                    l0.r.c(0, c12, j1.a(aVar2), aVar2, 2058660585);
                    androidx.compose.foundation.layout.m mVar = androidx.compose.foundation.layout.m.f4307a;
                    String assetName = ay.b.u(C1987R.string.asset_loading, aVar2);
                    kotlin.jvm.internal.u.j(assetName, "assetName");
                    pa.l c14 = pa.y.c(m.a.a(assetName), (String) kotlin.collections.x.K(dp0.j.o(assetName, new String[]{"/"})), aVar2, 0, 60);
                    pa.h.a(c14.getValue(), x0.f(w0.a(mVar.g(aVar3, b.a.e()), 1.0f), yk.h.u()), false, false, null, 0.0f, Integer.MAX_VALUE, false, false, false, null, false, null, null, null, false, aVar2, 1572872, 0, 65468);
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
