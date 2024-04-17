package com.withings.wiscale2.settings;

import androidx.compose.material.w7;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import com.withings.common.compose.component.input.InputFieldType;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
/* compiled from: Password.kt */
/* loaded from: classes5.dex */
final class v0 extends kotlin.jvm.internal.w implements ym0.q<r0.w, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k1.r0<InputFieldType> f60340a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1.r0<b2.k> f60341b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ com.withings.wiscale2.account.password.r f60342c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ k1.r0<String> f60343d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f60344e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ k1.r0<String> f60345f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f60346g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.platform.k4 f60347h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ SettingsViewModel f60348i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(k1.r0<InputFieldType> r0Var, k1.r0<b2.k> r0Var2, com.withings.wiscale2.account.password.r rVar, k1.r0<String> r0Var3, k1.r0<Boolean> r0Var4, k1.r0<String> r0Var5, k1.r0<Boolean> r0Var6, androidx.compose.ui.platform.k4 k4Var, SettingsViewModel settingsViewModel) {
        super(3);
        this.f60340a = r0Var;
        this.f60341b = r0Var2;
        this.f60342c = rVar;
        this.f60343d = r0Var3;
        this.f60344e = r0Var4;
        this.f60345f = r0Var5;
        this.f60346g = r0Var6;
        this.f60347h = k4Var;
        this.f60348i = settingsViewModel;
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
            androidx.compose.ui.e c11 = n0.y0.c(androidx.compose.foundation.layout.x0.j(androidx.compose.foundation.layout.e1.d(aVar3), 0.0f, 0.0f, 0.0f, padding.a(), 7), n0.y0.b(aVar2), false, 14);
            int i12 = androidx.compose.foundation.layout.e.f4229i;
            androidx.compose.ui.layout.l0 b10 = com.withings.authentication.n.b(a0.d.b(aVar2, -483455358), aVar2, -1323940314);
            int G = aVar2.G();
            k1.v0 l5 = aVar2.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a11 = g.a.a();
            s1.a c12 = androidx.compose.ui.layout.y.c(c11);
            if (aVar2.i() instanceof k1.d) {
                aVar2.A();
                if (aVar2.e()) {
                    aVar2.F(a11);
                } else {
                    aVar2.m();
                }
                ym0.p c13 = com.google.protobuf.t.c(aVar2, b10, aVar2, l5);
                if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G))) {
                    l0.q.a(G, aVar2, G, c13);
                }
                l0.r.c(0, c12, k1.j1.a(aVar2), aVar2, 2058660585);
                com.withings.common.compose.component.v4.b(null, ay.b.u(C1987R.string._CHANGE_PASSWORD_, aVar2), ay.b.u(C1987R.string.account_password_reset_detail, aVar2), null, 0.0f, 0.0f, 0, 0, aVar2, 0, ConstantsWs.WS_STATUS_WRONG_DATE_FORMAT);
                String u11 = ay.b.u(C1987R.string._OLD_PASSWORD_, aVar2);
                androidx.compose.ui.e j5 = androidx.compose.foundation.layout.x0.j(aVar3, yk.h.o(), yk.h.r(), yk.h.o(), 0.0f, 8);
                k1.r0<String> r0Var = this.f60343d;
                String value = r0Var.getValue();
                b2.k kVar = new b2.k();
                aVar2.s(-2007858647);
                Object t11 = aVar2.t();
                if (t11 == a.C0060a.a()) {
                    t11 = new q0(r0Var);
                    aVar2.n(t11);
                }
                ym0.l lVar = (ym0.l) t11;
                Object j11 = w7.j(aVar2, -2007858440);
                a.C0060a.C0061a a12 = a.C0060a.a();
                k1.r0<b2.k> r0Var2 = this.f60341b;
                if (j11 == a12) {
                    j11 = new r0(r0Var2);
                    aVar2.n(j11);
                }
                aVar2.J();
                l0.e(j5, u11, this.f60340a, value, null, lVar, kVar, 6, (ym0.a) j11, null, aVar2, 113443200, ConstantsWs.WS_STATUS_ACCOUNT_DELETION_ERROR);
                androidx.compose.ui.e h11 = androidx.compose.foundation.layout.x0.h(aVar3, yk.h.o(), 0.0f, 2);
                aVar2.s(-2007858210);
                Object t12 = aVar2.t();
                if (t12 == a.C0060a.a()) {
                    t12 = new s0(this.f60344e);
                    aVar2.n(t12);
                }
                aVar2.J();
                nk.u.c(0, 0, 0, 60, 0L, aVar2, androidx.compose.foundation.h.b(h11, false, (ym0.a) t12, 7), nk.g0.a(((androidx.compose.material3.i1) aVar2.D(androidx.compose.material3.j1.e())).J(), ay.b.u(C1987R.string.account_password_forget_resetByEmail, aVar2)), null);
                k1.r0<String> r0Var3 = this.f60345f;
                k1.r0<Boolean> r0Var4 = this.f60346g;
                com.withings.wiscale2.account.password.r rVar = this.f60342c;
                l0.d(ay.b.u(C1987R.string._NEW_PASSWORD_, aVar2), r0Var2.getValue(), rVar, new t0(r0Var3, r0Var4, rVar), new u0(r0Var4, r0Var3, r0Var, this.f60347h, this.f60348i), aVar2, 512);
                r0.d0.a(androidx.compose.foundation.layout.e1.f(aVar3, yk.h.q()), aVar2);
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
