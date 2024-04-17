package com.withings.wiscale2.vo2max.view;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.g;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import java.util.List;
import x1.b;
/* compiled from: Vo2MaxTextSelector.kt */
/* loaded from: classes5.dex */
final class x0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f62853a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ u0.i0 f62854b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f62855c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ List<String> f62856d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(ym0.a<nm0.y> aVar, u0.i0 i0Var, ym0.a<nm0.y> aVar2, List<String> list) {
        super(2);
        this.f62853a = aVar;
        this.f62854b = i0Var;
        this.f62855c = aVar2;
        this.f62856d = list;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        boolean z5;
        List<String> list;
        boolean z11;
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            androidx.compose.ui.e h11 = androidx.compose.foundation.layout.x0.h(androidx.compose.ui.e.f8927a, 0.0f, yk.h.b(), 1);
            androidx.compose.ui.layout.l0 a11 = androidx.activity.a0.a(aVar2, 693286680, b.a.i(), aVar2, -1323940314);
            int G = aVar2.G();
            k1.v0 l5 = aVar2.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a12 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(h11);
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
                aVar2.s(1056656688);
                ym0.a<nm0.y> aVar3 = this.f62853a;
                boolean K = aVar2.K(aVar3);
                Object t11 = aVar2.t();
                if (K || t11 == a.C0060a.a()) {
                    t11 = new u0(aVar3);
                    aVar2.n(t11);
                }
                ym0.a aVar4 = (ym0.a) t11;
                aVar2.J();
                u0.i0 i0Var = this.f62854b;
                if (i0Var.s() > 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                y0.b(aVar4, z5, s2.e.b(C1987R.drawable.ic_utilitary_leftsm, aVar2), null, aVar2, 0, 8);
                if (1.0f > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    u0.o.a(i0Var, new LayoutWeightElement(en0.r.f(1.0f, Float.MAX_VALUE), true), null, null, 0, 0.0f, null, null, false, false, null, null, s1.b.b(aVar2, -13042200, new v0(this.f62856d)), aVar2, 0, ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED, 4092);
                    aVar2.s(1056657460);
                    ym0.a<nm0.y> aVar5 = this.f62855c;
                    boolean K2 = aVar2.K(aVar5);
                    Object t12 = aVar2.t();
                    if (K2 || t12 == a.C0060a.a()) {
                        t12 = new w0(aVar5);
                        aVar2.n(t12);
                    }
                    ym0.a aVar6 = (ym0.a) t12;
                    aVar2.J();
                    if (i0Var.s() < list.size() - 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    y0.b(aVar6, z11, s2.e.b(C1987R.drawable.ic_utilitary_rightsm, aVar2), null, aVar2, 0, 8);
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
