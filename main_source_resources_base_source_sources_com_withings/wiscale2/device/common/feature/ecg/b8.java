package com.withings.wiscale2.device.common.feature.ecg;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.library.authentication.api.ConstantsWs;
import x1.b;
import x1.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
public final class b8 extends kotlin.jvm.internal.w implements ym0.q<r0.w, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ rq.e f51216a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ WBS08EcgActivationActivity f51217b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f51218c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ a f51219d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ a f51220e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8(rq.e eVar, WBS08EcgActivationActivity wBS08EcgActivationActivity, ym0.a<nm0.y> aVar, a aVar2, a aVar3) {
        super(3);
        this.f51216a = eVar;
        this.f51217b = wBS08EcgActivationActivity;
        this.f51218c = aVar;
        this.f51219d = aVar2;
        this.f51220e = aVar3;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.w wVar, androidx.compose.runtime.a aVar, Integer num) {
        r0.w it = wVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(it, "it");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            e.a aVar3 = androidx.compose.ui.e.f8927a;
            androidx.compose.ui.e p11 = ah.k.p(n0.y0.c(androidx.compose.foundation.layout.e1.d(aVar3), n0.y0.b(aVar2), false, 14));
            d.a g11 = b.a.g();
            aVar2.s(-483455358);
            androidx.compose.ui.layout.l0 a11 = androidx.compose.foundation.layout.n.a(androidx.compose.foundation.layout.e.h(), g11, aVar2);
            aVar2.s(-1323940314);
            int G = aVar2.G();
            k1.v0 l5 = aVar2.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a12 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(p11);
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
                androidx.compose.ui.e e11 = androidx.compose.foundation.layout.e1.e(aVar3, 1.0f);
                if (1.0f > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    androidx.compose.ui.e n11 = e11.n(new LayoutWeightElement(en0.r.f(1.0f, Float.MAX_VALUE), true));
                    androidx.compose.ui.layout.l0 b10 = defpackage.c.b(aVar2, 733328855, false, aVar2, -1323940314);
                    int G2 = aVar2.G();
                    k1.v0 l6 = aVar2.l();
                    ym0.a a13 = g.a.a();
                    s1.a c13 = androidx.compose.ui.layout.y.c(n11);
                    if (aVar2.i() instanceof k1.d) {
                        aVar2.A();
                        if (aVar2.e()) {
                            aVar2.F(a13);
                        } else {
                            aVar2.m();
                        }
                        ym0.p c14 = com.google.protobuf.t.c(aVar2, b10, aVar2, l6);
                        if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G2))) {
                            l0.q.a(G2, aVar2, G2, c14);
                        }
                        l0.r.c(0, c13, k1.j1.a(aVar2), aVar2, 2058660585);
                        s0.a.a(androidx.compose.foundation.layout.e1.d(aVar3), null, null, false, null, null, null, false, new y7(this.f51216a, this.f51217b, this.f51218c), aVar2, 6, ConstantsWs.WS_STATUS_NOREPOUSER);
                        aVar2.J();
                        aVar2.o();
                        aVar2.J();
                        aVar2.J();
                        wk.i.a(null, true, s1.b.b(aVar2, 1811998871, new z7(this.f51219d)), s1.b.b(aVar2, -655469386, new a8(this.f51220e)), aVar2, 3504, 1);
                        defpackage.d.j(aVar2);
                    } else {
                        a3.g.s();
                        throw null;
                    }
                } else {
                    throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
                }
            } else {
                a3.g.s();
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}
