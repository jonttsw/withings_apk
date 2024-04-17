package com.withings.authentication.mfa.main.components;

import ah.o;
import androidx.compose.foundation.layout.c1;
import androidx.compose.foundation.layout.e;
import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.x0;
import androidx.compose.material3.d1;
import androidx.compose.material3.g9;
import androidx.compose.material3.i1;
import androidx.compose.material3.z0;
import androidx.compose.runtime.a;
import androidx.compose.runtime.v;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.node.g;
import com.withings.common.compose.component.ButtonSize;
import com.withings.common.compose.component.ColorStyle;
import com.withings.common.compose.component.n1;
import com.withings.common.compose.component.v0;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import dq.x;
import k1.j1;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nk.a0;
import nm0.y;
import qk.gc;
import qk.n9;
import x1.b;
import x1.d;
import ym0.p;
import ym0.q;
/* compiled from: MfaBottomSheets.kt */
/* loaded from: classes3.dex */
public final class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MfaBottomSheets.kt */
    /* renamed from: com.withings.authentication.mfa.main.components.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0411a extends w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31650a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0411a(ym0.a<y> aVar) {
            super(0);
            this.f31650a = aVar;
        }

        @Override // ym0.a
        public final y invoke() {
            this.f31650a.invoke();
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MfaBottomSheets.kt */
    /* loaded from: classes3.dex */
    public static final class b extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f31651a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f31652b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31653c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31654d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f31655e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i11, boolean z5, ym0.a<y> aVar, ym0.a<y> aVar2, int i12) {
            super(2);
            this.f31651a = i11;
            this.f31652b = z5;
            this.f31653c = aVar;
            this.f31654d = aVar2;
            this.f31655e = i12;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = o.g(this.f31655e | 1);
            ym0.a<y> aVar2 = this.f31653c;
            ym0.a<y> aVar3 = this.f31654d;
            a.a(this.f31651a, this.f31652b, aVar2, aVar3, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MfaBottomSheets.kt */
    /* loaded from: classes3.dex */
    public static final class c extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f31656a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31657b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31658c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f31659d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z5, ym0.a<y> aVar, ym0.a<y> aVar2, int i11) {
            super(2);
            this.f31656a = z5;
            this.f31657b = aVar;
            this.f31658c = aVar2;
            this.f31659d = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = o.g(this.f31659d | 1);
            ym0.a<y> aVar2 = this.f31657b;
            ym0.a<y> aVar3 = this.f31658c;
            a.b(this.f31656a, aVar2, aVar3, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MfaBottomSheets.kt */
    /* loaded from: classes3.dex */
    public static final class d extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f31660a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31661b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31662c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f31663d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z5, ym0.a<y> aVar, ym0.a<y> aVar2, int i11) {
            super(2);
            this.f31660a = z5;
            this.f31661b = aVar;
            this.f31662c = aVar2;
            this.f31663d = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = o.g(this.f31663d | 1);
            ym0.a<y> aVar2 = this.f31661b;
            ym0.a<y> aVar3 = this.f31662c;
            a.c(this.f31660a, aVar2, aVar3, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MfaBottomSheets.kt */
    /* loaded from: classes3.dex */
    public static final class e extends w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31664a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ym0.a<y> aVar) {
            super(0);
            this.f31664a = aVar;
        }

        @Override // ym0.a
        public final y invoke() {
            this.f31664a.invoke();
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MfaBottomSheets.kt */
    /* loaded from: classes3.dex */
    public static final class f extends w implements q<r0.h, androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31665a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31666b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(ym0.a<y> aVar, ym0.a<y> aVar2) {
            super(3);
            this.f31665a = aVar;
            this.f31666b = aVar2;
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
                androidx.compose.ui.e h11 = x0.h(aVar3, yk.h.o(), 0.0f, 2);
                aVar2.s(-1096759932);
                ym0.a<y> aVar4 = this.f31665a;
                boolean K = aVar2.K(aVar4);
                Object t11 = aVar2.t();
                if (K || t11 == a.C0060a.a()) {
                    t11 = new com.withings.authentication.mfa.main.components.b(aVar4);
                    aVar2.n(t11);
                }
                aVar2.J();
                com.withings.common.compose.component.o.o(androidx.compose.foundation.h.b(h11, false, (ym0.a) t11, 7), null, ay.b.u(C1987R.string.mfa_settings_phone_update_option, aVar2), null, null, false, false, true, null, null, null, null, null, aVar2, 12582912, 0, 8058);
                v0.b(0.0f, aVar2, 0, 1);
                androidx.compose.ui.e h12 = x0.h(aVar3, yk.h.o(), 0.0f, 2);
                aVar2.s(-1096759584);
                ym0.a<y> aVar5 = this.f31666b;
                boolean K2 = aVar2.K(aVar5);
                Object t12 = aVar2.t();
                if (K2 || t12 == a.C0060a.a()) {
                    t12 = new com.withings.authentication.mfa.main.components.c(aVar5);
                    aVar2.n(t12);
                }
                aVar2.J();
                com.withings.common.compose.component.o.o(androidx.compose.foundation.h.b(h12, false, (ym0.a) t12, 7), null, ay.b.u(C1987R.string.mfa_settings_phone_remove_option, aVar2), null, null, false, false, true, null, null, null, null, null, aVar2, 12582912, 0, 8058);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MfaBottomSheets.kt */
    /* loaded from: classes3.dex */
    public static final class g extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31667a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31668b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31669c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f31670d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(ym0.a<y> aVar, ym0.a<y> aVar2, ym0.a<y> aVar3, int i11) {
            super(2);
            this.f31667a = aVar;
            this.f31668b = aVar2;
            this.f31669c = aVar3;
            this.f31670d = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = o.g(this.f31670d | 1);
            ym0.a<y> aVar2 = this.f31668b;
            ym0.a<y> aVar3 = this.f31669c;
            a.d(this.f31667a, aVar2, aVar3, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(int i11, boolean z5, ym0.a<y> aVar, ym0.a<y> aVar2, androidx.compose.runtime.a aVar3, int i12) {
        int i13;
        boolean z11;
        int i14;
        int i15;
        int i16;
        int i17;
        androidx.compose.runtime.b g11 = aVar3.g(-1886278542);
        if ((i12 & 14) == 0) {
            if (g11.c(i11)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i13 = i17 | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            if (g11.a(z5)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i13 |= i16;
        }
        if ((i12 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.w(aVar)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i13 |= i15;
        }
        if ((i12 & 7168) == 0) {
            if (g11.w(aVar2)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i13 |= i14;
        }
        if ((i13 & 5851) == 1170 && g11.h()) {
            g11.C();
        } else {
            g11.s(-483455358);
            e.a aVar4 = androidx.compose.ui.e.f8927a;
            l0 b10 = android.support.v4.media.session.c.b(androidx.compose.foundation.layout.e.h(), g11, -1323940314);
            int G = g11.G();
            k1.v0 l5 = g11.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a11 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(aVar4);
            if (g11.i() instanceof k1.d) {
                g11.A();
                if (g11.e()) {
                    g11.F(a11);
                } else {
                    g11.m();
                }
                p b11 = com.withings.authentication.e.b(g11, b10, g11, l5);
                if (g11.e() || !u.e(g11.t(), Integer.valueOf(G))) {
                    androidx.camera.camera2.internal.l0.d(G, g11, G, b11);
                }
                androidx.compose.ui.e j5 = x0.j(x0.h(aVar4, og.y.a(0, c11, j1.a(g11), g11, 2058660585), 0.0f, 2), 0.0f, yk.h.b(), 0.0f, yk.h.d(), 5);
                g11.s(1878653210);
                if ((i13 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                Object t11 = g11.t();
                if (z11 || t11 == a.C0060a.a()) {
                    t11 = new C0411a(aVar2);
                    g11.n(t11);
                }
                g11.J();
                nk.f.c(0, 0, 0, 60, 0L, g11, androidx.compose.foundation.h.b(j5, false, (ym0.a) t11, 7), null, ay.b.u(C1987R.string._CANCEL_, g11));
                v0.b(0.0f, g11, 0, 1);
                androidx.compose.ui.e f11 = x0.f(aVar4, yk.h.d());
                e.h o11 = androidx.compose.foundation.layout.e.o(yk.h.a());
                g11.s(-483455358);
                l0 a12 = com.withings.authentication.e.a(o11, g11, -1323940314);
                int G2 = g11.G();
                k1.v0 l6 = g11.l();
                ym0.a a13 = g.a.a();
                s1.a c12 = androidx.compose.ui.layout.y.c(f11);
                if (g11.i() instanceof k1.d) {
                    g11.A();
                    if (g11.e()) {
                        g11.F(a13);
                    } else {
                        g11.m();
                    }
                    p b12 = com.withings.authentication.e.b(g11, a12, g11, l6);
                    if (g11.e() || !u.e(g11.t(), Integer.valueOf(G2))) {
                        androidx.camera.camera2.internal.l0.d(G2, g11, G2, b12);
                    }
                    x.b(0, c12, j1.a(g11), g11, 2058660585);
                    a0.f(0, 0, 29, 0L, g11, null, null, ay.b.u(i11, g11));
                    androidx.compose.ui.e h11 = x0.h(aVar4, 0.0f, yk.h.d(), 1);
                    d.b i18 = b.a.i();
                    e.h o12 = androidx.compose.foundation.layout.e.o(yk.h.d());
                    g11.s(693286680);
                    l0 a14 = c1.a(o12, i18, g11);
                    g11.s(-1323940314);
                    int G3 = g11.G();
                    k1.v0 l11 = g11.l();
                    ym0.a a15 = g.a.a();
                    s1.a c13 = androidx.compose.ui.layout.y.c(h11);
                    if (g11.i() instanceof k1.d) {
                        g11.A();
                        if (g11.e()) {
                            g11.F(a15);
                        } else {
                            g11.m();
                        }
                        p b13 = com.withings.authentication.e.b(g11, a14, g11, l11);
                        if (g11.e() || !u.e(g11.t(), Integer.valueOf(G3))) {
                            androidx.camera.camera2.internal.l0.d(G3, g11, G3, b13);
                        }
                        x.b(0, c13, j1.a(g11), g11, 2058660585);
                        n1.b(n9.f93050a, null, 0L, 0, g11, 0, 14);
                        nk.a.d(null, ay.b.u(C1987R.string.mfa_settings_remove_description1, g11), 0L, null, 0, 0, null, g11, 0, 125);
                        g11.J();
                        g11.o();
                        g11.J();
                        g11.J();
                        androidx.compose.ui.e h12 = x0.h(aVar4, 0.0f, yk.h.d(), 1);
                        d.b i19 = b.a.i();
                        e.h o13 = androidx.compose.foundation.layout.e.o(yk.h.d());
                        g11.s(693286680);
                        l0 a16 = c1.a(o13, i19, g11);
                        g11.s(-1323940314);
                        int G4 = g11.G();
                        k1.v0 l12 = g11.l();
                        ym0.a a17 = g.a.a();
                        s1.a c14 = androidx.compose.ui.layout.y.c(h12);
                        if (g11.i() instanceof k1.d) {
                            g11.A();
                            if (g11.e()) {
                                g11.F(a17);
                            } else {
                                g11.m();
                            }
                            p b14 = com.withings.authentication.e.b(g11, a16, g11, l12);
                            if (g11.e() || !u.e(g11.t(), Integer.valueOf(G4))) {
                                androidx.camera.camera2.internal.l0.d(G4, g11, G4, b14);
                            }
                            x.b(0, c14, j1.a(g11), g11, 2058660585);
                            n1.b(gc.f92944a, null, 0L, 0, g11, 0, 14);
                            nk.a.d(null, ay.b.u(C1987R.string.mfa_settings_remove_description2, g11), 0L, null, 0, 0, null, g11, 0, 125);
                            g11.J();
                            g11.o();
                            g11.J();
                            g11.J();
                            g11.J();
                            g11.o();
                            g11.J();
                            g11.J();
                            v0.b(0.0f, g11, 0, 1);
                            int i21 = i13 << 15;
                            com.withings.common.compose.component.l.a(x0.g(e1.e(aVar4, 1.0f), yk.h.o(), yk.h.f()), ay.b.u(C1987R.string._REMOVE_, g11), null, false, ColorStyle.f33323b, ButtonSize.f33303e, z5, aVar, g11, (3670016 & i21) | 221184 | (i21 & 29360128), 12);
                            g9.a(g11);
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
            } else {
                a3.g.s();
                throw null;
            }
        }
        v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new b(i11, z5, aVar, aVar2, i12));
        }
    }

    public static final void b(boolean z5, ym0.a<y> onCtaClicked, ym0.a<y> onCancel, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        u.j(onCtaClicked, "onCtaClicked");
        u.j(onCancel, "onCancel");
        androidx.compose.runtime.b g11 = aVar.g(2010277233);
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
            if (g11.w(onCtaClicked)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.w(onCancel)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 731) == 146 && g11.h()) {
            g11.C();
        } else {
            int i16 = i12 << 3;
            a(C1987R.string.mfa_settings_remove_phone_title, z5, onCtaClicked, onCancel, g11, (i16 & 112) | (i16 & ConstantsWs.HWFAILURE_ZERO) | (i16 & 7168));
        }
        v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new c(z5, onCtaClicked, onCancel, i11));
        }
    }

    public static final void c(boolean z5, ym0.a<y> onCtaClicked, ym0.a<y> onCancel, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        u.j(onCtaClicked, "onCtaClicked");
        u.j(onCancel, "onCancel");
        androidx.compose.runtime.b g11 = aVar.g(397287692);
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
            if (g11.w(onCtaClicked)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.w(onCancel)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 731) == 146 && g11.h()) {
            g11.C();
        } else {
            int i16 = i12 << 3;
            a(C1987R.string.mfa_settings_remove_title, z5, onCtaClicked, onCancel, g11, (i16 & 112) | (i16 & ConstantsWs.HWFAILURE_ZERO) | (i16 & 7168));
        }
        v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new d(z5, onCtaClicked, onCancel, i11));
        }
    }

    public static final void d(ym0.a<y> onUpdateClicked, ym0.a<y> onDeleteClicked, ym0.a<y> onCancel, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        boolean z5;
        int i13;
        int i14;
        int i15;
        u.j(onUpdateClicked, "onUpdateClicked");
        u.j(onDeleteClicked, "onDeleteClicked");
        u.j(onCancel, "onCancel");
        androidx.compose.runtime.b g11 = aVar.g(-2025830846);
        if ((i11 & 14) == 0) {
            if (g11.w(onUpdateClicked)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(onDeleteClicked)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.w(onCancel)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 731) == 146 && g11.h()) {
            g11.C();
        } else {
            g11.s(-483455358);
            e.a aVar2 = androidx.compose.ui.e.f8927a;
            l0 b10 = android.support.v4.media.session.c.b(androidx.compose.foundation.layout.e.h(), g11, -1323940314);
            int G = g11.G();
            k1.v0 l5 = g11.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a11 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(aVar2);
            if (g11.i() instanceof k1.d) {
                g11.A();
                if (g11.e()) {
                    g11.F(a11);
                } else {
                    g11.m();
                }
                p b11 = com.withings.authentication.e.b(g11, b10, g11, l5);
                if (g11.e() || !u.e(g11.t(), Integer.valueOf(G))) {
                    androidx.camera.camera2.internal.l0.d(G, g11, G, b11);
                }
                androidx.compose.ui.e j5 = x0.j(x0.h(aVar2, og.y.a(0, c11, j1.a(g11), g11, 2058660585), 0.0f, 2), 0.0f, yk.h.b(), 0.0f, yk.h.d(), 5);
                g11.s(355056558);
                if ((i12 & ConstantsWs.HWFAILURE_ZERO) == 256) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                Object t11 = g11.t();
                if (z5 || t11 == a.C0060a.a()) {
                    t11 = new e(onCancel);
                    g11.n(t11);
                }
                g11.J();
                nk.f.c(0, 0, 0, 60, 0L, g11, androidx.compose.foundation.h.b(j5, false, (ym0.a) t11, 7), null, ay.b.u(C1987R.string._CANCEL_, g11));
                v0.b(0.0f, g11, 0, 1);
                d1.a(x0.f(aVar2, yk.h.d()), null, z0.b(((i1) g11.D(androidx.compose.material3.j1.e())).a(), g11, 0), null, null, s1.b.b(g11, -618129366, new f(onUpdateClicked, onDeleteClicked)), g11, 196608, 26);
                g9.a(g11);
            } else {
                a3.g.s();
                throw null;
            }
        }
        v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new g(onUpdateClicked, onDeleteClicked, onCancel, i11));
        }
    }
}
