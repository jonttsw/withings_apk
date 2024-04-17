package com.withings.authentication.verifyauthentication;

import androidx.camera.camera2.internal.p2;
import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.x0;
import androidx.compose.material.b2;
import androidx.compose.material3.i1;
import androidx.compose.material3.j1;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.node.g;
import com.withings.common.compose.component.v4;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import d2.h1;
import k1.v0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AuthBottomSheetDialog.kt */
/* loaded from: classes3.dex */
public final class k extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f32679a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f32680b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2) {
        super(2);
        this.f32679a = aVar;
        this.f32680b = aVar2;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.ui.e b10;
        androidx.compose.ui.e b11;
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            e.a aVar3 = androidx.compose.ui.e.f8927a;
            b10 = androidx.compose.foundation.c.b(ah.k.m(ah.k.p(e1.e(aVar3, 1.0f))), ((i1) aVar2.D(j1.e())).O(), h1.a());
            aVar2.s(-483455358);
            l0 a11 = androidx.compose.material.v.a(androidx.compose.foundation.layout.e.h(), aVar2, -1323940314);
            int G = aVar2.G();
            v0 l5 = aVar2.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a12 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(b10);
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
                b11 = androidx.compose.foundation.c.b(e1.e(aVar3, 1.0f), ((i1) aVar2.D(j1.e())).O(), h1.a());
                androidx.compose.ui.e g11 = x0.g(b11, yk.h.o(), yk.h.q());
                aVar2.s(1726090621);
                ym0.a<nm0.y> aVar4 = this.f32679a;
                boolean K = aVar2.K(aVar4);
                Object t11 = aVar2.t();
                if (K || t11 == a.C0060a.a()) {
                    t11 = new j(aVar4);
                    aVar2.n(t11);
                }
                aVar2.J();
                nk.a.d(androidx.compose.foundation.h.b(g11, false, (ym0.a) t11, 7), ay.b.u(C1987R.string._CANCEL_, aVar2), 0L, null, 0, 0, null, aVar2, 0, 124);
                aVar2.J();
                b2.a(0.0f, 0.0f, 0, 13, ((yk.w) p2.b(aVar2, 615317871)).f().b(), aVar2, null);
                v4.b(x0.g(aVar3, yk.h.o(), yk.h.q()), ay.b.u(C1987R.string.account_need_to_auth, aVar2), null, null, 0.0f, 0.0f, 0, 0, aVar2, 0, ConstantsWs.WS_STATUS_WRONGBATTERYLVL);
                com.withings.common.compose.component.l.c(x0.i(aVar3, yk.h.o(), yk.h.c(), yk.h.q(), yk.h.q()), ay.b.u(C1987R.string.sign_google, aVar2), null, false, null, null, false, this.f32680b, aVar2, 0, 124);
                defpackage.d.j(aVar2);
            } else {
                a3.g.s();
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}
