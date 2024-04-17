package com.withings.manualLogging.ui.feature.addNote.cycle;

import androidx.compose.ui.e;
import androidx.compose.ui.layout.f;
import androidx.compose.ui.node.g;
import com.withings.common.compose.component.CellVerticalMargin;
import com.withings.common.compose.component.v4;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import x1.b;
/* compiled from: CycleTutorialIntroductionScreen.kt */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static s1.a f40961a = new s1.a(false, 1567646445, a.f40966a);

    /* renamed from: b  reason: collision with root package name */
    public static s1.a f40962b = new s1.a(false, 1811183308, b.f40967a);

    /* renamed from: c  reason: collision with root package name */
    public static s1.a f40963c = new s1.a(false, 1442011099, c.f40968a);

    /* renamed from: d  reason: collision with root package name */
    public static s1.a f40964d = new s1.a(false, 1188272914, C0551d.f40969a);

    /* renamed from: e  reason: collision with root package name */
    public static s1.a f40965e = new s1.a(false, 597754694, e.f40970a);

    /* compiled from: CycleTutorialIntroductionScreen.kt */
    /* loaded from: classes4.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f40966a = new kotlin.jvm.internal.w(2);

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
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
                    androidx.compose.foundation.layout.m mVar = androidx.compose.foundation.layout.m.f4307a;
                    n0.z.a(s2.d.a(2131232889, aVar2), "", androidx.compose.foundation.layout.w0.a(mVar.g(androidx.compose.foundation.layout.e1.d(aVar3), b.a.b()), 1.0f), b.a.b(), f.a.b(), 0.0f, null, aVar2, 27704, 96);
                    defpackage.d.j(aVar2);
                } else {
                    a3.g.s();
                    throw null;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: CycleTutorialIntroductionScreen.kt */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f40967a = new kotlin.jvm.internal.w(2);

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                v4.b(null, ay.b.u(C1987R.string.cycle_tutorial_discoverFeature_title, aVar2), null, null, 0.0f, 0.0f, 0, 0, aVar2, 0, ConstantsWs.WS_STATUS_ACCOUNTSUSPENDED);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: CycleTutorialIntroductionScreen.kt */
    /* loaded from: classes4.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.q<r0.a0, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f40968a = new kotlin.jvm.internal.w(3);

        @Override // ym0.q
        public final nm0.y invoke(r0.a0 a0Var, androidx.compose.runtime.a aVar, Integer num) {
            int i11;
            r0.a0 LabelValueCell = a0Var;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(LabelValueCell, "$this$LabelValueCell");
            if ((intValue & 14) == 0) {
                if (aVar2.K(LabelValueCell)) {
                    i11 = 4;
                } else {
                    i11 = 2;
                }
                intValue |= i11;
            }
            if ((intValue & 91) == 18 && aVar2.h()) {
                aVar2.C();
            } else {
                androidx.compose.ui.e a11 = LabelValueCell.a(androidx.compose.ui.e.f8927a, b.a.l());
                aVar2.s(733328855);
                androidx.compose.ui.layout.l0 c11 = com.withings.authentication.n.c(false, aVar2, -1323940314);
                int G = aVar2.G();
                k1.v0 l5 = aVar2.l();
                androidx.compose.ui.node.g.D.getClass();
                ym0.a a12 = g.a.a();
                s1.a c12 = androidx.compose.ui.layout.y.c(a11);
                if (aVar2.i() instanceof k1.d) {
                    aVar2.A();
                    if (aVar2.e()) {
                        aVar2.F(a12);
                    } else {
                        aVar2.m();
                    }
                    ym0.p c13 = com.google.protobuf.t.c(aVar2, c11, aVar2, l5);
                    if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G))) {
                        l0.q.a(G, aVar2, G, c13);
                    }
                    l0.r.c(0, c12, k1.j1.a(aVar2), aVar2, 2058660585);
                    n0.z.a(s2.d.a(2131231256, aVar2), null, null, null, null, 0.0f, null, aVar2, 56, 124);
                    defpackage.d.j(aVar2);
                } else {
                    a3.g.s();
                    throw null;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: CycleTutorialIntroductionScreen.kt */
    /* renamed from: com.withings.manualLogging.ui.feature.addNote.cycle.d$d  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0551d extends kotlin.jvm.internal.w implements ym0.q<r0.a0, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0551d f40969a = new kotlin.jvm.internal.w(3);

        @Override // ym0.q
        public final nm0.y invoke(r0.a0 a0Var, androidx.compose.runtime.a aVar, Integer num) {
            int i11;
            r0.a0 LabelValueCell = a0Var;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(LabelValueCell, "$this$LabelValueCell");
            if ((intValue & 14) == 0) {
                if (aVar2.K(LabelValueCell)) {
                    i11 = 4;
                } else {
                    i11 = 2;
                }
                intValue |= i11;
            }
            if ((intValue & 91) == 18 && aVar2.h()) {
                aVar2.C();
            } else {
                androidx.compose.ui.e a11 = LabelValueCell.a(androidx.compose.ui.e.f8927a, b.a.l());
                aVar2.s(733328855);
                androidx.compose.ui.layout.l0 c11 = com.withings.authentication.n.c(false, aVar2, -1323940314);
                int G = aVar2.G();
                k1.v0 l5 = aVar2.l();
                androidx.compose.ui.node.g.D.getClass();
                ym0.a a12 = g.a.a();
                s1.a c12 = androidx.compose.ui.layout.y.c(a11);
                if (aVar2.i() instanceof k1.d) {
                    aVar2.A();
                    if (aVar2.e()) {
                        aVar2.F(a12);
                    } else {
                        aVar2.m();
                    }
                    ym0.p c13 = com.google.protobuf.t.c(aVar2, c11, aVar2, l5);
                    if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G))) {
                        l0.q.a(G, aVar2, G, c13);
                    }
                    l0.r.c(0, c12, k1.j1.a(aVar2), aVar2, 2058660585);
                    n0.z.a(s2.d.a(2131231257, aVar2), null, null, null, null, 0.0f, null, aVar2, 56, 124);
                    defpackage.d.j(aVar2);
                } else {
                    a3.g.s();
                    throw null;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: CycleTutorialIntroductionScreen.kt */
    /* loaded from: classes4.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f40970a = new kotlin.jvm.internal.w(3);

        @Override // ym0.q
        public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            r0.h GuidedPresentation = hVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(GuidedPresentation, "$this$GuidedPresentation");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                String u11 = ay.b.u(C1987R.string.cycle_tutorial_discoverFeature_description1, aVar2);
                String u12 = ay.b.u(C1987R.string.cycle_tutorial_discoverFeature_description2, aVar2);
                s1.a aVar3 = d.f40963c;
                CellVerticalMargin cellVerticalMargin = CellVerticalMargin.f33312d;
                com.withings.common.compose.component.o.o(null, aVar3, u11, null, null, false, false, false, null, null, cellVerticalMargin, null, s1.b.b(aVar2, 57492116, new com.withings.manualLogging.ui.feature.addNote.cycle.e(u11)), aVar2, 48, 390, 3065);
                com.withings.common.compose.component.o.o(null, d.f40964d, u12, null, null, false, false, false, null, null, cellVerticalMargin, null, s1.b.b(aVar2, 2105392011, new f(u12)), aVar2, 48, 390, 3065);
                nk.a.g(0, 0, 0, 61, 0L, aVar2, null, null, ay.b.u(C1987R.string.cycle_tutorial_discoverFeature_note, aVar2));
            }
            return nm0.y.f85009a;
        }
    }
}
