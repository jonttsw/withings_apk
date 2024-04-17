package com.withings.authentication.mfa.main.components;

import ah.o;
import androidx.activity.a0;
import androidx.camera.camera2.internal.p2;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.x0;
import androidx.compose.material.v;
import androidx.compose.material.w7;
import androidx.compose.material3.a5;
import androidx.compose.material3.d1;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.node.g;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.protobuf.t;
import com.withings.common.compose.component.b5;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import d2.f0;
import k1.j1;
import k1.v0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import l0.r;
import nm0.y;
import x1.b;
import ym0.p;
import ym0.q;
/* compiled from: TotpComponent.kt */
/* loaded from: classes3.dex */
public final class k {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TotpComponent.kt */
    /* loaded from: classes3.dex */
    public static final class a extends w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f31707a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31708b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ym0.a aVar, boolean z5) {
            super(0);
            this.f31707a = z5;
            this.f31708b = aVar;
        }

        @Override // ym0.a
        public final y invoke() {
            if (!this.f31707a) {
                this.f31708b.invoke();
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TotpComponent.kt */
    /* loaded from: classes3.dex */
    public static final class b extends w implements q<r0.h, androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f31709a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31710b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ym0.a aVar, boolean z5) {
            super(3);
            this.f31709a = z5;
            this.f31710b = aVar;
        }

        @Override // ym0.q
        public final y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            r0.h Card = hVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            u.j(Card, "$this$Card");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                e.a aVar3 = androidx.compose.ui.e.f8927a;
                androidx.compose.ui.e f11 = x0.f(e1.e(aVar3, 1.0f), yk.h.d());
                l0 a11 = a0.a(aVar2, 693286680, b.a.i(), aVar2, -1323940314);
                int G = aVar2.G();
                v0 l5 = aVar2.l();
                androidx.compose.ui.node.g.D.getClass();
                ym0.a a12 = g.a.a();
                s1.a c11 = androidx.compose.ui.layout.y.c(f11);
                if (aVar2.i() instanceof k1.d) {
                    aVar2.A();
                    if (aVar2.e()) {
                        aVar2.F(a12);
                    } else {
                        aVar2.m();
                    }
                    p c12 = t.c(aVar2, a11, aVar2, l5);
                    if (aVar2.e() || !u.e(aVar2.t(), Integer.valueOf(G))) {
                        l0.q.a(G, aVar2, G, c12);
                    }
                    r.c(0, c11, j1.a(aVar2), aVar2, 2058660585);
                    aVar2.s(-483455358);
                    l0 a13 = v.a(androidx.compose.foundation.layout.e.h(), aVar2, -1323940314);
                    int G2 = aVar2.G();
                    v0 l6 = aVar2.l();
                    ym0.a a14 = g.a.a();
                    s1.a c13 = androidx.compose.ui.layout.y.c(aVar3);
                    if (aVar2.i() instanceof k1.d) {
                        aVar2.A();
                        if (aVar2.e()) {
                            aVar2.F(a14);
                        } else {
                            aVar2.m();
                        }
                        p c14 = t.c(aVar2, a13, aVar2, l6);
                        if (aVar2.e() || !u.e(aVar2.t(), Integer.valueOf(G2))) {
                            l0.q.a(G2, aVar2, G2, c14);
                        }
                        c13.invoke(j1.a(aVar2), aVar2, 0);
                        aVar2.s(2058660585);
                        androidx.compose.ui.e j5 = x0.j(aVar3, 0.0f, 0.0f, 0.0f, yk.h.a(), 7);
                        String u11 = ay.b.u(C1987R.string.mfa_settings_recommendedTag, aVar2);
                        aVar2.J();
                        nk.a0.b(0, 0, 18, ((yk.w) p2.b(aVar2, 615317871)).g().c(), aVar2, j5, null, u11);
                        androidx.compose.ui.e e11 = e1.e(aVar3, 1.0f);
                        aVar2.s(693286680);
                        l0 i11 = w7.i(androidx.compose.foundation.layout.e.g(), aVar2, -1323940314);
                        int G3 = aVar2.G();
                        v0 l11 = aVar2.l();
                        ym0.a a15 = g.a.a();
                        s1.a c15 = androidx.compose.ui.layout.y.c(e11);
                        if (aVar2.i() instanceof k1.d) {
                            aVar2.A();
                            if (aVar2.e()) {
                                aVar2.F(a15);
                            } else {
                                aVar2.m();
                            }
                            p c16 = t.c(aVar2, i11, aVar2, l11);
                            if (aVar2.e() || !u.e(aVar2.t(), Integer.valueOf(G3))) {
                                l0.q.a(G3, aVar2, G3, c16);
                            }
                            r.c(0, c15, j1.a(aVar2), aVar2, 2058660585);
                            if (1.0f > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(en0.r.f(1.0f, Float.MAX_VALUE), true);
                                aVar2.s(-483455358);
                                l0 a16 = v.a(androidx.compose.foundation.layout.e.h(), aVar2, -1323940314);
                                int G4 = aVar2.G();
                                v0 l12 = aVar2.l();
                                ym0.a a17 = g.a.a();
                                s1.a c17 = androidx.compose.ui.layout.y.c(layoutWeightElement);
                                if (aVar2.i() instanceof k1.d) {
                                    aVar2.A();
                                    if (aVar2.e()) {
                                        aVar2.F(a17);
                                    } else {
                                        aVar2.m();
                                    }
                                    p c18 = t.c(aVar2, a16, aVar2, l12);
                                    if (aVar2.e() || !u.e(aVar2.t(), Integer.valueOf(G4))) {
                                        l0.q.a(G4, aVar2, G4, c18);
                                    }
                                    r.c(0, c17, j1.a(aVar2), aVar2, 2058660585);
                                    nk.a0.i(0, 0, 29, 0L, aVar2, null, null, ay.b.u(C1987R.string.mfa_type_authenticationApp, aVar2));
                                    nk.a.g(0, 0, 0, 61, 0L, aVar2, null, null, ay.b.u(C1987R.string.mfa_type_authenticationApp_description, aVar2));
                                    defpackage.d.j(aVar2);
                                    if (this.f31709a) {
                                        aVar2.s(392533673);
                                        androidx.compose.ui.e j11 = x0.j(aVar3, yk.h.c(), 0.0f, 0.0f, 0.0f, 14);
                                        aVar2.s(392533844);
                                        ym0.a<y> aVar4 = this.f31710b;
                                        boolean K = aVar2.K(aVar4);
                                        Object t11 = aVar2.t();
                                        if (K || t11 == a.C0060a.a()) {
                                            t11 = new l(aVar4);
                                            aVar2.n(t11);
                                        }
                                        aVar2.J();
                                        b5.a(true, (ym0.l) t11, j11, false, null, aVar2, 6, 24);
                                        aVar2.J();
                                    } else {
                                        aVar2.s(392533945);
                                        a5.b(f1.h.a(), "", x0.j(aVar3, yk.h.c(), 0.0f, 0.0f, 0.0f, 14), ((f0) aVar2.D(yk.f.b())).t(), aVar2, 48, 0);
                                        aVar2.J();
                                    }
                                    aVar2.J();
                                    aVar2.o();
                                    aVar2.J();
                                    aVar2.J();
                                    aVar2.J();
                                    aVar2.o();
                                    aVar2.J();
                                    aVar2.J();
                                    aVar2.J();
                                    aVar2.o();
                                    aVar2.J();
                                    aVar2.J();
                                } else {
                                    a3.g.s();
                                    throw null;
                                }
                            } else {
                                throw new IllegalArgumentException(defpackage.b.b("invalid weight ", 1.0f, "; must be greater than zero").toString());
                            }
                        } else {
                            a3.g.s();
                            throw null;
                        }
                    } else {
                        a3.g.s();
                        throw null;
                    }
                } else {
                    a3.g.s();
                    throw null;
                }
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TotpComponent.kt */
    /* loaded from: classes3.dex */
    public static final class c extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f31711a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31712b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31713c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f31714d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z5, ym0.a<y> aVar, ym0.a<y> aVar2, int i11) {
            super(2);
            this.f31711a = z5;
            this.f31712b = aVar;
            this.f31713c = aVar2;
            this.f31714d = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = o.g(this.f31714d | 1);
            ym0.a<y> aVar2 = this.f31712b;
            ym0.a<y> aVar3 = this.f31713c;
            k.a(this.f31711a, aVar2, aVar3, aVar, g11);
            return y.f85009a;
        }
    }

    public static final void a(boolean z5, ym0.a<y> onEnableClick, ym0.a<y> onDisableClick, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        boolean z11;
        int i13;
        int i14;
        int i15;
        u.j(onEnableClick, "onEnableClick");
        u.j(onDisableClick, "onDisableClick");
        androidx.compose.runtime.b g11 = aVar.g(-1231275719);
        if ((i11 & 14) == 0) {
            if (g11.a(z5)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(onEnableClick)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.w(onDisableClick)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        int i16 = i12;
        if ((i16 & 731) == 146 && g11.h()) {
            g11.C();
        } else {
            e.a aVar2 = androidx.compose.ui.e.f8927a;
            nk.a0.f(0, 0, 28, 0L, g11, x0.j(aVar2, 0.0f, 0.0f, 0.0f, yk.h.c(), 7), null, ay.b.u(C1987R.string.mfa_settings_timeBasedSection_title, g11));
            g11.s(-1675477619);
            boolean z12 = true;
            if ((i16 & 14) == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((i16 & 112) != 32) {
                z12 = false;
            }
            boolean z13 = z11 | z12;
            Object t11 = g11.t();
            if (z13 || t11 == a.C0060a.a()) {
                t11 = new a(onEnableClick, z5);
                g11.n(t11);
            }
            g11.J();
            d1.a(androidx.compose.foundation.h.b(aVar2, false, (ym0.a) t11, 7), null, null, null, null, s1.b.b(g11, -929685369, new b(onDisableClick, z5)), g11, 196608, 30);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new c(z5, onEnableClick, onDisableClick, i11));
        }
    }
}
