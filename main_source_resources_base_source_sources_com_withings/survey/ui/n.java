package com.withings.survey.ui;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.common.compose.component.c5;
/* compiled from: ChooseInsightActivity.kt */
/* loaded from: classes4.dex */
final class n extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ r8.n f44387a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ChooseInsightActivity f44388b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(r8.n nVar, ChooseInsightActivity chooseInsightActivity) {
        super(4);
        this.f44387a = nVar;
        this.f44388b = chooseInsightActivity;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        l0.c composable = cVar;
        androidx.navigation.d it = dVar;
        androidx.compose.runtime.a aVar2 = aVar;
        num.intValue();
        kotlin.jvm.internal.u.j(composable, "$this$composable");
        kotlin.jvm.internal.u.j(it, "it");
        androidx.compose.ui.platform.l1 l1Var = (androidx.compose.ui.platform.l1) aVar2.D(androidx.compose.ui.platform.n1.d());
        aVar2.s(-770462680);
        Object t11 = aVar2.t();
        if (t11 == a.C0060a.a()) {
            t11 = androidx.compose.runtime.l0.f("", androidx.compose.runtime.v0.f8878a);
            aVar2.n(t11);
        }
        k1.r0 r0Var = (k1.r0) t11;
        aVar2.J();
        r8.n nVar = this.f44387a;
        e.j.a(0, 1, aVar2, new h(nVar), false);
        aVar2.s(-483455358);
        e.a aVar3 = androidx.compose.ui.e.f8927a;
        androidx.compose.ui.layout.l0 a11 = androidx.compose.material.v.a(androidx.compose.foundation.layout.e.h(), aVar2, -1323940314);
        int G = aVar2.G();
        k1.v0 l5 = aVar2.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a12 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(aVar3);
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
            c5.a(0L, 0L, "Choose an insight", true, null, null, null, null, false, new i(nVar), aVar2, 3456, 499);
            if (1.0f > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(en0.r.f(1.0f, Float.MAX_VALUE), true);
                aVar2.s(-483455358);
                androidx.compose.ui.layout.l0 a13 = androidx.compose.material.v.a(androidx.compose.foundation.layout.e.h(), aVar2, -1323940314);
                int G2 = aVar2.G();
                k1.v0 l6 = aVar2.l();
                ym0.a a14 = g.a.a();
                s1.a c13 = androidx.compose.ui.layout.y.c(layoutWeightElement);
                if (aVar2.i() instanceof k1.d) {
                    aVar2.A();
                    if (aVar2.e()) {
                        aVar2.F(a14);
                    } else {
                        aVar2.m();
                    }
                    ym0.p c14 = com.google.protobuf.t.c(aVar2, a13, aVar2, l6);
                    if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G2))) {
                        l0.q.a(G2, aVar2, G2, c14);
                    }
                    l0.r.c(0, c13, k1.j1.a(aVar2), aVar2, 2058660585);
                    nk.a0.g(0, 0, 28, 0L, aVar2, androidx.compose.foundation.layout.x0.f(aVar3, yk.h.q()), null, (String) r0Var.getValue());
                    aVar2.J();
                    aVar2.o();
                    aVar2.J();
                    aVar2.J();
                    wk.i.a(null, false, s1.b.b(aVar2, 941003290, new k(l1Var, r0Var)), s1.b.b(aVar2, -901745957, new m(this.f44388b, r0Var)), aVar2, 3456, 3);
                    defpackage.d.j(aVar2);
                    return nm0.y.f85009a;
                }
                a3.g.s();
                throw null;
            }
            throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
        }
        a3.g.s();
        throw null;
    }
}
