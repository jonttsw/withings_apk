package com.withings.wiscale2.device.common.feature;

import android.annotation.SuppressLint;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.x0;
import androidx.compose.material.f5;
import androidx.compose.material.t5;
import androidx.compose.material3.g9;
import androidx.compose.material3.i1;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.node.g;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.common.compose.component.c5;
import com.withings.common.compose.component.v4;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.common.feature.q;
import d2.f0;
import dq.x;
import k1.j1;
import k1.v0;
import kotlin.jvm.internal.w;
import n0.z;
import nm0.y;
import r0.d0;
import x1.b;
/* compiled from: FeatureActivationDocument.kt */
/* loaded from: classes5.dex */
public final class m {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FeatureActivationDocument.kt */
    /* loaded from: classes5.dex */
    public static final class a extends w implements ym0.q<r0.w, androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f52390a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ q f52391b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f52392c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ym0.a<y> aVar, q qVar, ym0.a<y> aVar2) {
            super(3);
            this.f52390a = aVar;
            this.f52391b = qVar;
            this.f52392c = aVar2;
        }

        @Override // ym0.q
        public final y invoke(r0.w wVar, androidx.compose.runtime.a aVar, Integer num) {
            long j5;
            r0.w it = wVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(it, "it");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                e.a aVar3 = androidx.compose.ui.e.f8927a;
                androidx.compose.ui.e d11 = e1.d(aVar3);
                aVar2.s(-483455358);
                l0 a11 = androidx.compose.material.v.a(androidx.compose.foundation.layout.e.h(), aVar2, -1323940314);
                int G = aVar2.G();
                v0 l5 = aVar2.l();
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
                    c11.invoke(j1.a(aVar2), aVar2, 0);
                    aVar2.s(2058660585);
                    j5 = f0.f63265i;
                    aVar2.s(1559165810);
                    ym0.a<y> aVar4 = this.f52390a;
                    boolean K = aVar2.K(aVar4);
                    Object t11 = aVar2.t();
                    if (K || t11 == a.C0060a.a()) {
                        t11 = new k(aVar4);
                        aVar2.n(t11);
                    }
                    aVar2.J();
                    c5.a(j5, 0L, null, false, null, null, null, null, false, (ym0.a) t11, aVar2, 6, ConstantsWs.WS_STATUS_ERROR_ARRAY_WAM);
                    v4.e(null, ay.b.u(C1987R.string.please_review_these_instructions, aVar2), ay.b.u(C1987R.string.tap_see_more, aVar2), 0, 0, 0, aVar2, 0, 57);
                    androidx.compose.ui.e g11 = x0.g(e1.e(aVar3, 1.0f), yk.h.o(), yk.h.q());
                    if (1.0f > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                        androidx.compose.ui.e n11 = g11.n(new LayoutWeightElement(en0.r.f(1.0f, Float.MAX_VALUE), true));
                        l0 b10 = defpackage.c.b(aVar2, 733328855, false, aVar2, -1323940314);
                        int G2 = aVar2.G();
                        v0 l6 = aVar2.l();
                        ym0.a a13 = g.a.a();
                        s1.a c13 = androidx.compose.ui.layout.y.c(n11);
                        if (aVar2.i() instanceof k1.d) {
                            aVar2.A();
                            if (aVar2.e()) {
                                aVar2.F(a13);
                            } else {
                                aVar2.m();
                            }
                            ym0.p c14 = com.google.protobuf.t.c(aVar2, b10, aVar2, l6);
                            if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G2))) {
                                l0.q.a(G2, aVar2, G2, c14);
                            }
                            l0.r.c(0, c13, j1.a(aVar2), aVar2, 2058660585);
                            androidx.compose.foundation.layout.m mVar = androidx.compose.foundation.layout.m.f4307a;
                            q qVar = this.f52391b;
                            if (qVar instanceof q.a) {
                                aVar2.s(1512515114);
                                androidx.compose.ui.e d12 = e1.d(aVar3);
                                aVar2.s(1512515124);
                                ym0.a<y> aVar5 = this.f52392c;
                                boolean K2 = aVar2.K(aVar5);
                                Object t12 = aVar2.t();
                                if (K2 || t12 == a.C0060a.a()) {
                                    t12 = new l(aVar5);
                                    aVar2.n(t12);
                                }
                                aVar2.J();
                                z.c(new d2.i(((q.a) qVar).a()), "Feature activation Pdf Preview", androidx.compose.foundation.h.b(d12, false, (ym0.a) t12, 7), aVar2, ConstantsWs.WS_STATUS_WRONGDEVICETYPE);
                                aVar2.J();
                            } else if (qVar instanceof q.b) {
                                aVar2.s(1512515387);
                                m.b(mVar.g(aVar3, b.a.e()), aVar2, 0);
                                aVar2.J();
                            } else {
                                aVar2.s(1512515484);
                                f5.b(0.0f, 0, 0, 30, 0L, 0L, aVar2, mVar.g(aVar3, b.a.e()));
                                aVar2.J();
                            }
                            androidx.compose.material3.d.b(aVar2);
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
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FeatureActivationDocument.kt */
    /* loaded from: classes5.dex */
    public static final class b extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f52393a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f52394b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f52395c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f52396d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(q qVar, ym0.a<y> aVar, ym0.a<y> aVar2, int i11) {
            super(2);
            this.f52393a = qVar;
            this.f52394b = aVar;
            this.f52395c = aVar2;
            this.f52396d = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f52396d | 1);
            ym0.a<y> aVar2 = this.f52394b;
            ym0.a<y> aVar3 = this.f52395c;
            m.a(this.f52393a, aVar2, aVar3, aVar, g11);
            return y.f85009a;
        }
    }

    @SuppressLint({"UnusedMaterialScaffoldPaddingParameter"})
    public static final void a(q qVar, ym0.a<y> onDocumentClicked, ym0.a<y> onBackClicked, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        kotlin.jvm.internal.u.j(onDocumentClicked, "onDocumentClicked");
        kotlin.jvm.internal.u.j(onBackClicked, "onBackClicked");
        androidx.compose.runtime.b g11 = aVar.g(1400347405);
        if ((i11 & 14) == 0) {
            if (g11.K(qVar)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(onDocumentClicked)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.w(onBackClicked)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 731) == 146 && g11.h()) {
            g11.C();
        } else {
            t5.b(null, null, null, null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, ((i1) g11.D(androidx.compose.material3.j1.e())).a(), 0L, s1.b.b(g11, 592141711, new a(onBackClicked, qVar, onDocumentClicked)), g11, 0, 12582912, 98303);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new b(qVar, onDocumentClicked, onBackClicked, i11));
        }
    }

    public static final void b(androidx.compose.ui.e eVar, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        androidx.compose.runtime.b g11 = aVar.g(-1467032778);
        if ((i11 & 14) == 0) {
            if (g11.K(eVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 11) == 2 && g11.h()) {
            g11.C();
        } else {
            androidx.compose.ui.e e11 = e1.e(eVar, 1.0f);
            g11.s(-483455358);
            l0 b10 = android.support.v4.media.session.c.b(androidx.compose.foundation.layout.e.h(), g11, -1323940314);
            int G = g11.G();
            v0 l5 = g11.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a11 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(e11);
            if (g11.i() instanceof k1.d) {
                g11.A();
                if (g11.e()) {
                    g11.F(a11);
                } else {
                    g11.m();
                }
                ym0.p b11 = com.withings.authentication.e.b(g11, b10, g11, l5);
                if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                    androidx.camera.camera2.internal.l0.d(G, g11, G, b11);
                }
                x.b(0, c11, j1.a(g11), g11, 2058660585);
                e.a aVar2 = androidx.compose.ui.e.f8927a;
                float f11 = 70;
                z.a(s2.d.a(C1987R.drawable.ic_rounded_robot2, g11), "Load error", e1.o(aVar2, f11, f11).n(new HorizontalAlignElement(b.a.g())), null, null, 0.0f, null, g11, 56, 120);
                d0.a(e1.f(aVar2, yk.h.b()), g11);
                nk.a.d(null, ay.b.u(C1987R.string.checkInternet_tryAgain, g11), 0L, d3.g.a(3), 0, 0, null, g11, 0, 117);
                g9.a(g11);
            } else {
                a3.g.s();
                throw null;
            }
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new j(i11, eVar));
        }
    }
}
