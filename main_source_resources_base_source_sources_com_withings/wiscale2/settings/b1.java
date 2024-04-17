package com.withings.wiscale2.settings;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
/* compiled from: Password.kt */
/* loaded from: classes5.dex */
final class b1 extends kotlin.jvm.internal.w implements ym0.q<r0.w, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ com.withings.wiscale2.account.password.r f59873a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1.r0<String> f59874b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f59875c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.platform.k4 f59876d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ SettingsViewModel f59877e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f59878f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(com.withings.wiscale2.account.password.r rVar, k1.r0<String> r0Var, k1.r0<Boolean> r0Var2, androidx.compose.ui.platform.k4 k4Var, SettingsViewModel settingsViewModel, k1.r0<Boolean> r0Var3) {
        super(3);
        this.f59873a = rVar;
        this.f59874b = r0Var;
        this.f59875c = r0Var2;
        this.f59876d = k4Var;
        this.f59877e = settingsViewModel;
        this.f59878f = r0Var3;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.w wVar, androidx.compose.runtime.a aVar, Integer num) {
        int i11;
        r0.w padding = wVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(padding, "padding");
        if ((intValue & 14) == 0) {
            if (aVar2.K(padding)) {
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
            androidx.compose.ui.e d11 = androidx.compose.foundation.layout.e1.d(androidx.compose.foundation.layout.x0.e(aVar3, padding));
            aVar2.s(-483455358);
            androidx.compose.ui.layout.l0 a11 = androidx.compose.material.v.a(androidx.compose.foundation.layout.e.h(), aVar2, -1323940314);
            int G = aVar2.G();
            k1.v0 l5 = aVar2.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a12 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(d11);
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
                    androidx.compose.ui.e c13 = n0.y0.c(e11.n(new LayoutWeightElement(en0.r.f(1.0f, Float.MAX_VALUE), true)), n0.y0.b(aVar2), false, 14);
                    androidx.compose.ui.layout.l0 b10 = com.withings.authentication.n.b(a0.d.b(aVar2, -483455358), aVar2, -1323940314);
                    int G2 = aVar2.G();
                    k1.v0 l6 = aVar2.l();
                    ym0.a a13 = g.a.a();
                    s1.a c14 = androidx.compose.ui.layout.y.c(c13);
                    if (aVar2.i() instanceof k1.d) {
                        aVar2.A();
                        if (aVar2.e()) {
                            aVar2.F(a13);
                        } else {
                            aVar2.m();
                        }
                        ym0.p c15 = com.google.protobuf.t.c(aVar2, b10, aVar2, l6);
                        if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G2))) {
                            l0.q.a(G2, aVar2, G2, c15);
                        }
                        l0.r.c(0, c14, k1.j1.a(aVar2), aVar2, 2058660585);
                        com.withings.common.compose.component.v4.b(null, ay.b.u(C1987R.string.settings_account_create_password, aVar2), ay.b.u(C1987R.string.account_password_reset_detail, aVar2), null, 0.0f, 0.0f, 0, 0, aVar2, 0, ConstantsWs.WS_STATUS_WRONG_DATE_FORMAT);
                        String u11 = ay.b.u(C1987R.string._PASSWORD_, aVar2);
                        b2.k kVar = new b2.k();
                        k1.r0<String> r0Var = this.f59874b;
                        k1.r0<Boolean> r0Var2 = this.f59875c;
                        com.withings.wiscale2.account.password.r rVar = this.f59873a;
                        x0 x0Var = new x0(r0Var, r0Var2, rVar);
                        androidx.compose.ui.platform.k4 k4Var = this.f59876d;
                        SettingsViewModel settingsViewModel = this.f59877e;
                        l0.d(u11, kVar, rVar, x0Var, new y0(k4Var, settingsViewModel, r0Var), aVar2, 512);
                        aVar2.J();
                        aVar2.o();
                        aVar2.J();
                        aVar2.J();
                        wk.i.a(null, true, s1.b.b(aVar2, -991519412, new a1(r0Var2, this.f59878f, r0Var, k4Var, settingsViewModel)), null, aVar2, 432, 9);
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
