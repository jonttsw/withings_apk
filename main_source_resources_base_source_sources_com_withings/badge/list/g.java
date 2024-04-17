package com.withings.badge.list;

import ah.o;
import androidx.compose.foundation.layout.c1;
import androidx.compose.foundation.layout.e;
import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.x0;
import androidx.compose.material.h6;
import androidx.compose.material.v;
import androidx.compose.material.w7;
import androidx.compose.material3.y7;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.node.g;
import androidx.compose.ui.platform.n1;
import com.google.protobuf.t;
import com.withings.badge.list.k;
import com.withings.badge.model.BadgeModelUI;
import com.withings.badge.model.BadgeSection;
import com.withings.badge.model.BadgeSectionType;
import com.withings.common.compose.component.c5;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import k1.j1;
import k1.o1;
import k1.v0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.s0;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import l0.r;
import n0.y0;
import n0.z0;
import nk.a0;
import nm0.y;
import r0.b0;
import r0.d0;
import x1.b;
import ym0.p;
import ym0.q;
/* compiled from: BadgesScreen.kt */
/* loaded from: classes3.dex */
public final class g {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BadgesScreen.kt */
    /* loaded from: classes3.dex */
    public static final class a extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BadgesViewModel f32811a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p<Long, String, y> f32812b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f32813c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f32814d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f32815e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(BadgesViewModel badgesViewModel, p<? super Long, ? super String, y> pVar, ym0.a<y> aVar, int i11, int i12) {
            super(2);
            this.f32811a = badgesViewModel;
            this.f32812b = pVar;
            this.f32813c = aVar;
            this.f32814d = i11;
            this.f32815e = i12;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = o.g(this.f32814d | 1);
            p<Long, String, y> pVar = this.f32812b;
            ym0.a<y> aVar2 = this.f32813c;
            g.c(this.f32811a, pVar, aVar2, aVar, g11, this.f32815e);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BadgesScreen.kt */
    /* loaded from: classes3.dex */
    public static final class b extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f32816a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ym0.a<y> aVar) {
            super(2);
            this.f32816a = aVar;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                c5.c(null, null, l.f32843a, null, null, null, null, this.f32816a, false, aVar2, ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED, 379);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BadgesScreen.kt */
    /* loaded from: classes3.dex */
    public static final class c extends w implements q<r0.w, androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f32817a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p<Long, String, y> f32818b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(k kVar, p<? super Long, ? super String, y> pVar) {
            super(3);
            this.f32817a = kVar;
            this.f32818b = pVar;
        }

        @Override // ym0.q
        public final y invoke(r0.w wVar, androidx.compose.runtime.a aVar, Integer num) {
            int i11;
            r0.w innerPadding = wVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            u.j(innerPadding, "innerPadding");
            if ((intValue & 14) == 0) {
                if (aVar2.K(innerPadding)) {
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
                androidx.compose.ui.e e11 = x0.e(e1.d(aVar3), innerPadding);
                aVar2.s(-483455358);
                l0 a11 = v.a(androidx.compose.foundation.layout.e.h(), aVar2, -1323940314);
                int G = aVar2.G();
                v0 l5 = aVar2.l();
                androidx.compose.ui.node.g.D.getClass();
                ym0.a a12 = g.a.a();
                s1.a c11 = androidx.compose.ui.layout.y.c(e11);
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
                    z0 b10 = y0.b(aVar2);
                    aVar2.s(-1400115539);
                    Object t11 = aVar2.t();
                    if (t11 == a.C0060a.a()) {
                        t11 = s0.l(new nm0.j(BadgeSectionType.WEIGHT, null), new nm0.j(BadgeSectionType.STEPS, null), new nm0.j(BadgeSectionType.DISTANCE, null), new nm0.j(BadgeSectionType.ELEVATION, null));
                        aVar2.n(t11);
                    }
                    Map map = (Map) t11;
                    Object j5 = w7.j(aVar2, -1400115206);
                    if (j5 == a.C0060a.a()) {
                        j5 = androidx.compose.runtime.l0.e(new h(map, b10));
                        aVar2.n(j5);
                    }
                    aVar2.J();
                    yh.b.a(x0.j(e1.e(aVar3, 1.0f), 0.0f, 0.0f, 0.0f, yk.h.b(), 7), x.W(BadgeSectionType.WEIGHT, BadgeSectionType.STEPS, BadgeSectionType.DISTANCE, BadgeSectionType.ELEVATION), (o1) j5, b10, map, aVar2, 33200);
                    com.withings.common.compose.component.v0.b(0.0f, aVar2, 0, 1);
                    aVar2.s(-488456280);
                    k kVar = this.f32817a;
                    if (kVar instanceof k.a) {
                        g.g(((k.a) kVar).a(), map, b10, this.f32818b, aVar2, 72);
                    }
                    v.b(aVar2);
                } else {
                    a3.g.s();
                    throw null;
                }
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BadgesScreen.kt */
    /* loaded from: classes3.dex */
    public static final class d extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f32819a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p<Long, String, y> f32820b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f32821c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f32822d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(k kVar, p<? super Long, ? super String, y> pVar, ym0.a<y> aVar, int i11) {
            super(2);
            this.f32819a = kVar;
            this.f32820b = pVar;
            this.f32821c = aVar;
            this.f32822d = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = o.g(this.f32822d | 1);
            p<Long, String, y> pVar = this.f32820b;
            ym0.a<y> aVar2 = this.f32821c;
            g.b(this.f32819a, pVar, aVar2, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BadgesScreen.kt */
    /* loaded from: classes3.dex */
    public static final class e extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f32823a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BadgeSection f32824b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p<Long, String, y> f32825c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f32826d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f32827e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(androidx.compose.ui.e eVar, BadgeSection badgeSection, p<? super Long, ? super String, y> pVar, int i11, int i12) {
            super(2);
            this.f32823a = eVar;
            this.f32824b = badgeSection;
            this.f32825c = pVar;
            this.f32826d = i11;
            this.f32827e = i12;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = o.g(this.f32826d | 1);
            BadgeSection badgeSection = this.f32824b;
            p<Long, String, y> pVar = this.f32825c;
            g.d(this.f32823a, badgeSection, pVar, aVar, g11, this.f32827e);
            return y.f85009a;
        }
    }

    /* compiled from: BadgesScreen.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class f {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f32828a;

        static {
            int[] iArr = new int[BadgeSectionType.values().length];
            try {
                iArr[BadgeSectionType.WEIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BadgeSectionType.STEPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BadgeSectionType.DISTANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BadgeSectionType.ELEVATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f32828a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(int i11, androidx.compose.runtime.a aVar, List list, p pVar) {
        androidx.compose.runtime.b g11 = aVar.g(1778132921);
        androidx.compose.ui.e e11 = e1.e(androidx.compose.ui.e.f8927a, 1.0f);
        int i12 = androidx.compose.foundation.layout.e.f4229i;
        int i13 = -1323940314;
        l0 a11 = com.withings.authentication.e.a(com.withings.authentication.d.b(g11, -483455358), g11, -1323940314);
        int G = g11.G();
        v0 l5 = g11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a12 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(e11);
        if (g11.i() instanceof k1.d) {
            g11.A();
            if (g11.e()) {
                g11.F(a12);
            } else {
                g11.m();
            }
            p b10 = com.withings.authentication.e.b(g11, a11, g11, l5);
            if (g11.e() || !u.e(g11.t(), Integer.valueOf(G))) {
                androidx.camera.camera2.internal.l0.d(G, g11, G, b10);
            }
            dq.x.b(0, c11, j1.a(g11), g11, 2058660585);
            g11.s(-1279973528);
            int i14 = 3;
            for (List list2 : x.x(list, 3)) {
                androidx.compose.ui.e e12 = e1.e(androidx.compose.ui.e.f8927a, 1.0f);
                int i15 = androidx.compose.foundation.layout.e.f4229i;
                l0 a13 = c1.a(com.withings.authentication.d.b(g11, 693286680), b.a.l(), g11);
                g11.s(i13);
                int G2 = g11.G();
                v0 l6 = g11.l();
                androidx.compose.ui.node.g.D.getClass();
                ym0.a a14 = g.a.a();
                s1.a c12 = androidx.compose.ui.layout.y.c(e12);
                if (g11.i() instanceof k1.d) {
                    g11.A();
                    if (g11.e()) {
                        g11.F(a14);
                    } else {
                        g11.m();
                    }
                    p b11 = com.withings.authentication.e.b(g11, a13, g11, l6);
                    if (g11.e() || !u.e(g11.t(), Integer.valueOf(G2))) {
                        androidx.camera.camera2.internal.l0.d(G2, g11, G2, b11);
                    }
                    dq.x.b(0, c12, j1.a(g11), g11, 2058660585);
                    b0 b0Var = b0.f94219a;
                    g11.s(340392894);
                    int i16 = 0;
                    while (i16 < i14) {
                        boolean z5 = true;
                        if (list2.size() > i16) {
                            g11.s(202221265);
                            BadgeModelUI badgeModelUI = (BadgeModelUI) list2.get(i16);
                            if (badgeModelUI instanceof BadgeModelUI.LockedBadgeModelUI) {
                                g11.s(202221358);
                                yh.c.a(b0Var.b(androidx.compose.ui.e.f8927a, 1.0f, true), (BadgeModelUI.LockedBadgeModelUI) badgeModelUI, g11, 0, 0);
                                g11.J();
                            } else if (badgeModelUI instanceof BadgeModelUI.UnlockedBadgeModelUI) {
                                g11.s(202221733);
                                androidx.compose.ui.e b12 = b0Var.b(androidx.compose.ui.e.f8927a, 1.0f, true);
                                g11.s(202221893);
                                if ((((i11 & 112) ^ 48) <= 32 || !g11.K(pVar)) && (i11 & 48) != 32) {
                                    z5 = false;
                                }
                                boolean K = g11.K(badgeModelUI) | z5;
                                Object t11 = g11.t();
                                if (K || t11 == a.C0060a.a()) {
                                    t11 = new com.withings.badge.list.e(pVar, badgeModelUI);
                                    g11.n(t11);
                                }
                                g11.J();
                                yh.d.a(androidx.compose.foundation.h.b(b12, false, (ym0.a) t11, 7), (BadgeModelUI.UnlockedBadgeModelUI) badgeModelUI, g11, 0, 0);
                                g11.J();
                            } else {
                                g11.s(202222056);
                                g11.J();
                            }
                            g11.J();
                        } else {
                            g11.s(202222110);
                            d0.a(b0Var.b(androidx.compose.ui.e.f8927a, 1.0f, true), g11);
                            g11.J();
                        }
                        i16++;
                        i14 = 3;
                    }
                    androidx.compose.material3.d.c(g11);
                    i14 = 3;
                    i13 = -1323940314;
                } else {
                    a3.g.s();
                    throw null;
                }
            }
            androidx.compose.runtime.v a15 = com.withings.authentication.mfa.resolve.components.h.a(g11);
            if (a15 != null) {
                a15.G(new com.withings.badge.list.f(i11, list, pVar));
                return;
            }
            return;
        }
        a3.g.s();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(k kVar, p<? super Long, ? super String, y> pVar, ym0.a<y> aVar, androidx.compose.runtime.a aVar2, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        androidx.compose.runtime.b g11 = aVar2.g(1322574138);
        if ((i11 & 14) == 0) {
            if (g11.K(kVar)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(pVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.w(aVar)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 731) == 146 && g11.h()) {
            g11.C();
        } else {
            y7.b(null, s1.b.b(g11, 975346166, new b(aVar)), null, null, null, 0, 0L, 0L, null, s1.b.b(g11, -1403145653, new c(kVar, pVar)), g11, 805306416, ConstantsWs.WS_STATUS_NO_FILTER);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new d(kVar, pVar, aVar, i11));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0070, code lost:
        if (r0 != 0) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(com.withings.badge.list.BadgesViewModel r8, ym0.p<? super java.lang.Long, ? super java.lang.String, nm0.y> r9, ym0.a<nm0.y> r10, androidx.compose.runtime.a r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.badge.list.g.c(com.withings.badge.list.BadgesViewModel, ym0.p, ym0.a, androidx.compose.runtime.a, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(androidx.compose.ui.e eVar, BadgeSection badgeSection, p<? super Long, ? super String, y> pVar, androidx.compose.runtime.a aVar, int i11, int i12) {
        e.a aVar2;
        int i13;
        androidx.compose.runtime.b g11 = aVar.g(-123227699);
        if ((i12 & 1) != 0) {
            aVar2 = androidx.compose.ui.e.f8927a;
        } else {
            aVar2 = eVar;
        }
        androidx.compose.ui.e j5 = x0.j(e1.e(aVar2, 1.0f), 0.0f, yk.h.a(), 0.0f, 0.0f, 13);
        g11.s(-483455358);
        l0 b10 = android.support.v4.media.session.c.b(androidx.compose.foundation.layout.e.h(), g11, -1323940314);
        int G = g11.G();
        v0 l5 = g11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a11 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(j5);
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
            dq.x.b(0, c11, j1.a(g11), g11, 2058660585);
            e.a aVar3 = androidx.compose.ui.e.f8927a;
            androidx.compose.ui.e j11 = x0.j(aVar3, 0.0f, 0.0f, 0.0f, yk.h.b(), 7);
            BadgeSectionType badgeSectionType = badgeSection.getBadgeSectionType();
            g11.s(-1026117680);
            int i14 = f.f32828a[badgeSectionType.ordinal()];
            if (i14 != 1) {
                if (i14 != 2) {
                    if (i14 != 3) {
                        if (i14 == 4) {
                            i13 = C1987R.string._ELEVATION_;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        i13 = C1987R.string._DISTANCE_;
                    }
                } else {
                    i13 = C1987R.string._DAILY_STEPS_;
                }
            } else {
                i13 = C1987R.string._WEIGHT_;
            }
            String u11 = ay.b.u(i13, g11);
            g11.J();
            a0.f(0, 0, 28, 0L, g11, j11, null, u11);
            g11.s(693286680);
            l0 a12 = a0.a.a(androidx.compose.foundation.layout.e.g(), g11, -1323940314);
            int G2 = g11.G();
            v0 l6 = g11.l();
            ym0.a a13 = g.a.a();
            s1.a c12 = androidx.compose.ui.layout.y.c(aVar3);
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
                c12.invoke(j1.a(g11), g11, 0);
                g11.s(2058660585);
                nk.a.d(x0.j(aVar3, 0.0f, 0.0f, 0.0f, yk.h.d(), 7), String.format(ay.b.u(C1987R.string._BADGE_UNLOCKED_NEW_, g11), Arrays.copyOf(new Object[]{Integer.valueOf(badgeSection.getUnlockedBadgeNumber()), Integer.valueOf(badgeSection.getTotalBadgeNumber())}, 2)), 0L, null, 0, 0, null, g11, 0, 124);
                g11.J();
                g11.o();
                g11.J();
                g11.J();
                a(((i11 >> 3) & 112) | 8, g11, badgeSection.getBadges(), pVar);
                androidx.compose.runtime.v b13 = h6.b(g11);
                if (b13 != null) {
                    b13.G(new e(aVar2, badgeSection, pVar, i11, i12));
                    return;
                }
                return;
            }
            a3.g.s();
            throw null;
        }
        a3.g.s();
        throw null;
    }

    public static final void g(List list, Map map, z0 z0Var, p pVar, androidx.compose.runtime.a aVar, int i11) {
        androidx.compose.runtime.b g11 = aVar.g(-685568461);
        androidx.compose.ui.e c11 = y0.c(x0.h(e1.d(androidx.compose.ui.e.f8927a), yk.h.d(), 0.0f, 2), z0Var, false, 14);
        int i12 = androidx.compose.foundation.layout.e.f4229i;
        e.h o11 = androidx.compose.foundation.layout.e.o(yk.h.s());
        g11.s(-483455358);
        l0 a11 = com.withings.authentication.e.a(o11, g11, -1323940314);
        int G = g11.G();
        v0 l5 = g11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a12 = g.a.a();
        s1.a c12 = androidx.compose.ui.layout.y.c(c11);
        if (g11.i() instanceof k1.d) {
            g11.A();
            if (g11.e()) {
                g11.F(a12);
            } else {
                g11.m();
            }
            p b10 = com.withings.authentication.e.b(g11, a11, g11, l5);
            if (g11.e() || !u.e(g11.t(), Integer.valueOf(G))) {
                androidx.camera.camera2.internal.l0.d(G, g11, G, b10);
            }
            c12.invoke(j1.a(g11), g11, 0);
            g11.s(2058660585);
            int m02 = ((k3.d) g11.D(n1.e())).m0(yk.h.b());
            int m03 = ((k3.d) g11.D(n1.e())).m0(yk.h.s());
            g11.s(-97612356);
            int i13 = 0;
            for (Object obj : list) {
                int i14 = i13 + 1;
                if (i13 >= 0) {
                    BadgeSection badgeSection = (BadgeSection) obj;
                    d(x0.j(a1.a(androidx.compose.ui.e.f8927a, new i(map, badgeSection, i13, m02, m03)), 0.0f, i13 == 0 ? yk.h.b() : 0, 0.0f, 0.0f, 13), badgeSection, pVar, g11, ((i11 >> 3) & ConstantsWs.HWFAILURE_ZERO) | 64, 0);
                    i13 = i14;
                } else {
                    x.K0();
                    throw null;
                }
            }
            androidx.compose.runtime.v a13 = com.withings.authentication.mfa.resolve.components.h.a(g11);
            if (a13 != null) {
                a13.G(new j(list, map, z0Var, pVar, i11));
                return;
            }
            return;
        }
        a3.g.s();
        throw null;
    }
}
