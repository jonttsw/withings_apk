package com.withings.survey.ui;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.material3.j5;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.common.compose.component.c5;
import com.withings.library.authentication.api.ConstantsWs;
/* compiled from: ChooseInsightActivity.kt */
/* loaded from: classes4.dex */
final class g extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ChooseInsightActivity f44333a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f44334b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(r8.n nVar, ChooseInsightActivity chooseInsightActivity) {
        super(4);
        this.f44333a = chooseInsightActivity;
        this.f44334b = nVar;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        j5.e(num, cVar, "$this$composable", dVar, "it");
        aVar2.s(-770464960);
        ChooseInsightActivity chooseInsightActivity = this.f44333a;
        boolean K = aVar2.K(chooseInsightActivity);
        Object t11 = aVar2.t();
        if (K || t11 == a.C0060a.a()) {
            t11 = new c(chooseInsightActivity);
            aVar2.n(t11);
        }
        aVar2.J();
        e.j.a(0, 1, aVar2, (ym0.a) t11, false);
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
            l0.r.c(0, c11, k1.j1.a(aVar2), aVar2, 2058660585);
            aVar2.s(-1293220501);
            boolean K2 = aVar2.K(chooseInsightActivity);
            Object t12 = aVar2.t();
            if (K2 || t12 == a.C0060a.a()) {
                t12 = new d(chooseInsightActivity);
                aVar2.n(t12);
            }
            aVar2.J();
            c5.a(0L, 0L, "Choose an insight", true, null, null, null, null, false, (ym0.a) t12, aVar2, 3456, 499);
            if (1.0f > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                androidx.compose.ui.e c13 = n0.y0.c(new LayoutWeightElement(en0.r.f(1.0f, Float.MAX_VALUE), true), n0.y0.b(aVar2), false, 14);
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
                    aVar2.s(-1356857631);
                    boolean K3 = aVar2.K(chooseInsightActivity);
                    Object t13 = aVar2.t();
                    if (K3 || t13 == a.C0060a.a()) {
                        t13 = new e(chooseInsightActivity);
                        aVar2.n(t13);
                    }
                    aVar2.J();
                    androidx.compose.material.x0.b((ym0.a) t13, androidx.compose.foundation.layout.x0.j(aVar3, yk.h.q(), yk.h.q(), yk.h.q(), 0.0f, 8), false, null, 0.0f, q.f44412a, aVar2, 805306368, ConstantsWs.WS_STATUS_WRONG_STRIPE_ENV);
                    androidx.compose.material.x0.b(new f(this.f44334b), androidx.compose.foundation.layout.x0.j(aVar3, yk.h.q(), yk.h.q(), yk.h.q(), 0.0f, 8), false, null, 0.0f, q.f44413b, aVar2, 805306368, ConstantsWs.WS_STATUS_WRONG_STRIPE_ENV);
                    androidx.compose.material3.d.b(aVar2);
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
