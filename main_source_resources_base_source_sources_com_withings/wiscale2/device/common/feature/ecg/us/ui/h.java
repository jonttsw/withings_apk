package com.withings.wiscale2.device.common.feature.ecg.us.ui;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.x0;
import androidx.compose.runtime.v;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.node.g;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.protobuf.t;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.withings.common.compose.component.c5;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.common.feature.ecg.us.ui.o;
import k1.j1;
import k1.v0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import n0.y0;
import nm0.y;
import x1.b;
import x1.d;
/* compiled from: EcgReviewActivity.kt */
/* loaded from: classes5.dex */
public final class h {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EcgReviewActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f52007a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f52008b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f52009c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f52010d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f52011e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p pVar, ym0.a<y> aVar, ym0.a<y> aVar2, ym0.a<y> aVar3, int i11) {
            super(2);
            this.f52007a = pVar;
            this.f52008b = aVar;
            this.f52009c = aVar2;
            this.f52010d = aVar3;
            this.f52011e = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f52011e | 1);
            ym0.a<y> aVar2 = this.f52009c;
            ym0.a<y> aVar3 = this.f52010d;
            h.b(this.f52007a, this.f52008b, aVar2, aVar3, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EcgReviewActivity.kt */
    /* loaded from: classes5.dex */
    public static final class b extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f52012a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ym0.a<y> aVar) {
            super(2);
            this.f52012a = aVar;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                com.withings.common.compose.component.l.c(null, ay.b.u(C1987R.string.go_to_support, aVar2), null, false, null, null, false, this.f52012a, aVar2, 0, 125);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EcgReviewActivity.kt */
    /* loaded from: classes5.dex */
    public static final class c extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o.a f52013a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f52014b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f52015c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(o.a aVar, ym0.a<y> aVar2, ym0.a<y> aVar3) {
            super(2);
            this.f52013a = aVar;
            this.f52014b = aVar2;
            this.f52015c = aVar3;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                switch (this.f52013a.a().d().ordinal()) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 7:
                        aVar2.s(1136596029);
                        com.withings.common.compose.component.l.a(null, ay.b.u(C1987R.string.go_to_support, aVar2), null, false, null, null, false, this.f52014b, aVar2, 0, 125);
                        aVar2.J();
                        break;
                    case 4:
                    case 5:
                    case 8:
                        aVar2.s(1136596429);
                        com.withings.common.compose.component.l.a(null, ay.b.u(C1987R.string.hwa09_usOnboarding_ecgTutorialButton, aVar2), null, false, null, null, false, this.f52015c, aVar2, 0, 125);
                        aVar2.J();
                        break;
                    case 6:
                        aVar2.s(1136596744);
                        com.withings.common.compose.component.l.a(null, ay.b.u(C1987R.string.hwa09_usOnboarding_newECGButton, aVar2), null, false, null, null, false, this.f52015c, aVar2, 0, 125);
                        aVar2.J();
                        break;
                    default:
                        aVar2.s(1136596971);
                        aVar2.J();
                        break;
                }
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EcgReviewActivity.kt */
    /* loaded from: classes5.dex */
    public static final class d extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o.a f52016a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f52017b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f52018c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f52019d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f52020e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(o.a aVar, ym0.a<y> aVar2, ym0.a<y> aVar3, ym0.a<y> aVar4, int i11) {
            super(2);
            this.f52016a = aVar;
            this.f52017b = aVar2;
            this.f52018c = aVar3;
            this.f52019d = aVar4;
            this.f52020e = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f52020e | 1);
            ym0.a<y> aVar2 = this.f52018c;
            ym0.a<y> aVar3 = this.f52019d;
            h.a(this.f52016a, this.f52017b, aVar2, aVar3, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EcgReviewActivity.kt */
    /* loaded from: classes5.dex */
    public static final class e extends w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f52021a = new w(0);

        @Override // ym0.a
        public final /* bridge */ /* synthetic */ y invoke() {
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EcgReviewActivity.kt */
    /* loaded from: classes5.dex */
    public static final class f extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f52022a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(ym0.a<y> aVar) {
            super(2);
            this.f52022a = aVar;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                c5.a(0L, 0L, ay.b.u(C1987R.string.hwa09_usOnboarding_status_title, aVar2), true, null, null, null, null, false, this.f52022a, aVar2, 3072, 499);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EcgReviewActivity.kt */
    /* loaded from: classes5.dex */
    public static final class g extends w implements ym0.q<r0.w, androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, y> f52023a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, y> f52024b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ rq.e f52025c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(ym0.p<? super androidx.compose.runtime.a, ? super Integer, y> pVar, ym0.p<? super androidx.compose.runtime.a, ? super Integer, y> pVar2, rq.e eVar) {
            super(3);
            this.f52023a = pVar;
            this.f52024b = pVar2;
            this.f52025c = eVar;
        }

        @Override // ym0.q
        public final y invoke(r0.w wVar, androidx.compose.runtime.a aVar, Integer num) {
            int i11;
            r0.w it = wVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            u.j(it, "it");
            if ((intValue & 14) == 0) {
                if (aVar2.K(it)) {
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
                androidx.compose.ui.e p11 = ah.k.p(y0.c(x0.e(e1.d(aVar3), it), y0.b(aVar2), false, 14));
                d.a g11 = b.a.g();
                aVar2.s(-483455358);
                l0 a11 = androidx.compose.foundation.layout.n.a(androidx.compose.foundation.layout.e.h(), g11, aVar2);
                aVar2.s(-1323940314);
                int G = aVar2.G();
                v0 l5 = aVar2.l();
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
                    ym0.p c12 = t.c(aVar2, a11, aVar2, l5);
                    if (aVar2.e() || !u.e(aVar2.t(), Integer.valueOf(G))) {
                        l0.q.a(G, aVar2, G, c12);
                    }
                    l0.r.c(0, c11, j1.a(aVar2), aVar2, 2058660585);
                    androidx.compose.ui.e e11 = e1.e(aVar3, 1.0f);
                    if (1.0f > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                        androidx.compose.ui.e n11 = e11.n(new LayoutWeightElement(en0.r.f(1.0f, Float.MAX_VALUE), true));
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
                            ym0.p c14 = t.c(aVar2, b10, aVar2, l6);
                            if (aVar2.e() || !u.e(aVar2.t(), Integer.valueOf(G2))) {
                                l0.q.a(G2, aVar2, G2, c14);
                            }
                            l0.r.c(0, c13, j1.a(aVar2), aVar2, 2058660585);
                            s0.a.a(e1.d(aVar3), null, null, false, null, null, null, false, new m(this.f52025c), aVar2, 6, ConstantsWs.WS_STATUS_NOREPOUSER);
                            defpackage.d.j(aVar2);
                            wk.i.a(null, true, this.f52023a, this.f52024b, aVar2, 48, 1);
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
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EcgReviewActivity.kt */
    /* renamed from: com.withings.wiscale2.device.common.feature.ecg.us.ui.h$h  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0703h extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ rq.e f52026a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, y> f52027b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, y> f52028c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f52029d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f52030e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f52031f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0703h(rq.e eVar, ym0.p<? super androidx.compose.runtime.a, ? super Integer, y> pVar, ym0.p<? super androidx.compose.runtime.a, ? super Integer, y> pVar2, ym0.a<y> aVar, int i11, int i12) {
            super(2);
            this.f52026a = eVar;
            this.f52027b = pVar;
            this.f52028c = pVar2;
            this.f52029d = aVar;
            this.f52030e = i11;
            this.f52031f = i12;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f52030e | 1);
            ym0.p<androidx.compose.runtime.a, Integer, y> pVar = this.f52028c;
            ym0.a<y> aVar2 = this.f52029d;
            h.c(this.f52026a, this.f52027b, pVar, aVar2, aVar, g11, this.f52031f);
            return y.f85009a;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final void a(o.a uiState, ym0.a<y> onBackClicked, ym0.a<y> goToSupport, ym0.a<y> openTutorial, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        s1.a aVar2;
        int i13;
        int i14;
        int i15;
        int i16;
        u.j(uiState, "uiState");
        u.j(onBackClicked, "onBackClicked");
        u.j(goToSupport, "goToSupport");
        u.j(openTutorial, "openTutorial");
        androidx.compose.runtime.b g11 = aVar.g(-1693381788);
        if ((i11 & 14) == 0) {
            if (g11.K(uiState)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(onBackClicked)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        if ((i11 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.w(goToSupport)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        if ((i11 & 7168) == 0) {
            if (g11.w(openTutorial)) {
                i13 = ModuleCopy.f28574b;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        if ((i12 & 5851) == 1170 && g11.h()) {
            g11.C();
        } else {
            boolean z5 = true;
            switch (uiState.a().d().ordinal()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 7:
                    z5 = false;
                    break;
                case 4:
                case 5:
                case 6:
                case 8:
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            rq.e d11 = ba0.e.d(uiState.a(), uiState.b());
            if (d11 != null) {
                if (z5) {
                    aVar2 = s1.b.b(g11, -1931037975, new b(goToSupport));
                } else {
                    aVar2 = null;
                }
                c(d11, s1.b.b(g11, -1364190022, new c(uiState, goToSupport, openTutorial)), aVar2, onBackClicked, g11, 48 | ((i12 << 6) & 7168), 0);
            }
        }
        v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new d(uiState, onBackClicked, goToSupport, openTutorial, i11));
        }
    }

    public static final void b(p viewModel, ym0.a<y> onBackClicked, ym0.a<y> goToSupport, ym0.a<y> openTutorial, androidx.compose.runtime.a aVar, int i11) {
        u.j(viewModel, "viewModel");
        u.j(onBackClicked, "onBackClicked");
        u.j(goToSupport, "goToSupport");
        u.j(openTutorial, "openTutorial");
        androidx.compose.runtime.b g11 = aVar.g(240260904);
        o oVar = (o) androidx.compose.runtime.l0.b(viewModel.i0(), g11).getValue();
        if (oVar instanceof o.a) {
            g11.s(-1851944399);
            a((o.a) oVar, onBackClicked, goToSupport, openTutorial, g11, (i11 & 112) | (i11 & ConstantsWs.HWFAILURE_ZERO) | (i11 & 7168));
            g11.J();
        } else if (oVar instanceof o.b) {
            g11.s(-1851944176);
            int i12 = i11 >> 3;
            bc0.e.a(onBackClicked, goToSupport, onBackClicked, g11, (i12 & 112) | (i12 & 14) | ((i11 << 3) & ConstantsWs.HWFAILURE_ZERO));
            g11.J();
        } else if (oVar instanceof o.c) {
            g11.s(-1851943970);
            bc0.b.a(onBackClicked, g11, (i11 >> 3) & 14);
            g11.J();
        } else {
            g11.s(-1851943893);
            g11.J();
        }
        v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new a(viewModel, onBackClicked, goToSupport, openTutorial, i11));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(rq.e r33, ym0.p<? super androidx.compose.runtime.a, ? super java.lang.Integer, nm0.y> r34, ym0.p<? super androidx.compose.runtime.a, ? super java.lang.Integer, nm0.y> r35, ym0.a<nm0.y> r36, androidx.compose.runtime.a r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.common.feature.ecg.us.ui.h.c(rq.e, ym0.p, ym0.p, ym0.a, androidx.compose.runtime.a, int, int):void");
    }
}
