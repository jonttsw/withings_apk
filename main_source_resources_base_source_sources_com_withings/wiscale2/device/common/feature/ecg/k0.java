package com.withings.wiscale2.device.common.feature.ecg;

import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import com.withings.common.compose.component.a3;
import com.withings.wiscale2.C1987R;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
public final class k0 extends kotlin.jvm.internal.w implements ym0.q<r0.w, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f51456a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ i5 f51457b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f51458c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f51459d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ r8.n f51460e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(EcgActivationActivity ecgActivationActivity, i5 i5Var, boolean z5, ym0.a<nm0.y> aVar, r8.n nVar) {
        super(3);
        this.f51456a = ecgActivationActivity;
        this.f51457b = i5Var;
        this.f51458c = z5;
        this.f51459d = aVar;
        this.f51460e = nVar;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.w wVar, androidx.compose.runtime.a aVar, Integer num) {
        long j5;
        List list;
        r0.w it = wVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(it, "it");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            e.a aVar3 = androidx.compose.ui.e.f8927a;
            androidx.compose.ui.e d11 = androidx.compose.foundation.layout.e1.d(aVar3);
            androidx.compose.ui.layout.l0 b10 = defpackage.c.b(aVar2, 733328855, false, aVar2, -1323940314);
            int G = aVar2.G();
            k1.v0 l5 = aVar2.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a11 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(d11);
            if (aVar2.i() instanceof k1.d) {
                aVar2.A();
                if (aVar2.e()) {
                    aVar2.F(a11);
                } else {
                    aVar2.m();
                }
                ym0.p c12 = com.google.protobuf.t.c(aVar2, b10, aVar2, l5);
                if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G))) {
                    l0.q.a(G, aVar2, G, c12);
                }
                l0.r.c(0, c11, k1.j1.a(aVar2), aVar2, 2058660585);
                androidx.compose.ui.e d12 = androidx.compose.foundation.layout.e1.d(aVar3);
                i5 i5Var = this.f51457b;
                this.f51456a.A3(i5Var.b(), i5Var.a(), 4102, aVar2, d12);
                androidx.compose.ui.e d13 = androidx.compose.foundation.layout.e1.d(aVar3);
                aVar2.s(-483455358);
                androidx.compose.ui.layout.l0 a12 = androidx.compose.material.v.a(androidx.compose.foundation.layout.e.h(), aVar2, -1323940314);
                int G2 = aVar2.G();
                k1.v0 l6 = aVar2.l();
                ym0.a a13 = g.a.a();
                s1.a c13 = androidx.compose.ui.layout.y.c(d13);
                if (aVar2.i() instanceof k1.d) {
                    aVar2.A();
                    if (aVar2.e()) {
                        aVar2.F(a13);
                    } else {
                        aVar2.m();
                    }
                    ym0.p c14 = com.google.protobuf.t.c(aVar2, a12, aVar2, l6);
                    if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G2))) {
                        l0.q.a(G2, aVar2, G2, c14);
                    }
                    c13.invoke(k1.j1.a(aVar2), aVar2, 0);
                    aVar2.s(2058660585);
                    j5 = d2.f0.f63265i;
                    aVar2.s(2133930759);
                    if (this.f51458c) {
                        aVar2.s(2133930862);
                        ym0.a<nm0.y> aVar4 = this.f51459d;
                        boolean K = aVar2.K(aVar4);
                        Object t11 = aVar2.t();
                        if (K || t11 == a.C0060a.a()) {
                            t11 = new i0(aVar4);
                            aVar2.n(t11);
                        }
                        aVar2.J();
                        list = kotlin.collections.x.V(new a3.b((ym0.a) t11));
                    } else {
                        list = kotlin.collections.i0.f76187a;
                    }
                    List list2 = list;
                    aVar2.J();
                    com.withings.common.compose.component.c5.a(j5, 0L, null, false, null, list2, null, null, false, new j0(this.f51460e), aVar2, 262150, 478);
                    com.withings.common.compose.component.v4.e(null, ay.b.u(C1987R.string.hwa09_ecgExplanationTutorial_video_title, aVar2), null, 0, 0, 0, aVar2, 0, 61);
                    androidx.compose.material3.d.b(aVar2);
                } else {
                    a3.g.s();
                    throw null;
                }
            } else {
                a3.g.s();
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}
