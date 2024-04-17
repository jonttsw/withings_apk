package com.withings.wiscale2.settings;

import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import com.withings.wiscale2.C1987R;
import x1.b;
import x1.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SettingsActivity.kt */
/* loaded from: classes5.dex */
public final class t2 extends kotlin.jvm.internal.w implements ym0.q<r0.w, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SettingsActivity f60304a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f60305b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f60306c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f60307d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f60308e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f60309f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ SettingsViewModel f60310g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f60311h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(SettingsActivity settingsActivity, boolean z5, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, ym0.a<nm0.y> aVar3, ym0.a<nm0.y> aVar4, SettingsViewModel settingsViewModel, k1.r0<Boolean> r0Var) {
        super(3);
        this.f60304a = settingsActivity;
        this.f60305b = z5;
        this.f60306c = aVar;
        this.f60307d = aVar2;
        this.f60308e = aVar3;
        this.f60309f = aVar4;
        this.f60310g = settingsViewModel;
        this.f60311h = r0Var;
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
            d.a g11 = b.a.g();
            e.a aVar3 = androidx.compose.ui.e.f8927a;
            androidx.compose.ui.e p11 = ah.k.p(androidx.compose.foundation.layout.x0.j(n0.y0.c(androidx.compose.foundation.layout.e1.d(aVar3), n0.y0.b(aVar2), false, 14), 0.0f, yk.h.B(), 0.0f, 0.0f, 13));
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
                ym0.a<nm0.y> aVar4 = this.f60307d;
                SettingsActivity settingsActivity = this.f60304a;
                SettingsActivity.A3(settingsActivity, this.f60305b, this.f60306c, aVar4, this.f60308e, this.f60309f, aVar2, 262144);
                SettingsActivity.B3(settingsActivity, aVar2, 8);
                aVar2.s(-848549076);
                aVar2.J();
                aVar2.s(-848548966);
                aVar2.J();
                SettingsActivity.D3(settingsActivity, aVar2, 8);
                r0.d0.a(androidx.compose.foundation.layout.e1.f(aVar3, yk.h.q()), aVar2);
                SettingsActivity.C3(settingsActivity, this.f60310g, aVar2, 72);
                r0.d0.a(androidx.compose.foundation.layout.e1.f(aVar3, yk.h.q()), aVar2);
                nk.a.d(null, ay.b.u(C1987R.string._WITHINGS_HEALTH_COMPANION_, aVar2), 0L, null, 0, 0, null, aVar2, 0, 125);
                nk.a.g(0, 0, 48, 61, 0L, aVar2, null, null, "6.4.0");
                aVar2.s(942045497);
                k1.r0<Boolean> r0Var = this.f60311h;
                if (r0Var.getValue().booleanValue()) {
                    aVar2.s(-848548033);
                    boolean K = aVar2.K(r0Var);
                    Object t11 = aVar2.t();
                    if (K || t11 == a.C0060a.a()) {
                        t11 = new s2(r0Var);
                        aVar2.n(t11);
                    }
                    aVar2.J();
                    androidx.compose.ui.window.b.a((ym0.a) t11, new androidx.compose.ui.window.q(4), h.f60023a, aVar2, 432, 0);
                }
                androidx.compose.material.v.b(aVar2);
            } else {
                a3.g.s();
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}
