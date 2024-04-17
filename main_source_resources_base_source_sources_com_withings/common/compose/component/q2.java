package com.withings.common.compose.component;

import androidx.compose.material.g6;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.g1;
import androidx.compose.ui.node.g;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.samsung.android.sdk.healthdata.HealthConstants;
import com.withings.library.authentication.api.ConstantsWs;
import java.util.List;
import java.util.Map;
/* compiled from: InfoSection.kt */
/* loaded from: classes3.dex */
public final class q2 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InfoSection.kt */
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f34565a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f34566b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f34567c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f34568d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f34569e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.e eVar, String str, String str2, long j5, int i11) {
            super(2);
            this.f34565a = eVar;
            this.f34566b = str;
            this.f34567c = str2;
            this.f34568d = j5;
            this.f34569e = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f34569e | 1);
            String str = this.f34567c;
            long j5 = this.f34568d;
            q2.a(this.f34565a, this.f34566b, str, j5, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InfoSection.kt */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.l<androidx.constraintlayout.compose.o, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f34570a = new kotlin.jvm.internal.w(1);

        @Override // ym0.l
        public final nm0.y invoke(androidx.constraintlayout.compose.o oVar) {
            androidx.constraintlayout.compose.o ConstraintSet = oVar;
            kotlin.jvm.internal.u.j(ConstraintSet, "$this$ConstraintSet");
            androidx.constraintlayout.compose.d dVar = new androidx.constraintlayout.compose.d("title");
            androidx.constraintlayout.compose.d dVar2 = new androidx.constraintlayout.compose.d(HealthConstants.FoodInfo.DESCRIPTION);
            androidx.constraintlayout.compose.d dVar3 = new androidx.constraintlayout.compose.d("indicator");
            ConstraintSet.c(dVar3, r2.f34639a);
            ConstraintSet.c(dVar, new s2(dVar3));
            ConstraintSet.c(dVar2, new t2(dVar3, dVar));
            return nm0.y.f85009a;
        }
    }

    /* compiled from: ConstraintLayout.kt */
    /* loaded from: classes3.dex */
    public static final class c implements androidx.compose.ui.layout.l0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k1.r0 f34571a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.constraintlayout.compose.c0 f34572b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.constraintlayout.compose.l f34573c;

        /* compiled from: ConstraintLayout.kt */
        /* loaded from: classes3.dex */
        public static final class a extends kotlin.jvm.internal.w implements ym0.l<g1.a, nm0.y> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ androidx.constraintlayout.compose.c0 f34574a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ List f34575b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(androidx.constraintlayout.compose.c0 c0Var, List list) {
                super(1);
                this.f34574a = c0Var;
                this.f34575b = list;
            }

            @Override // ym0.l
            public final nm0.y invoke(g1.a aVar) {
                this.f34574a.m(aVar, this.f34575b);
                return nm0.y.f85009a;
            }
        }

        public c(k1.r0 r0Var, androidx.constraintlayout.compose.c0 c0Var, androidx.constraintlayout.compose.v vVar) {
            this.f34571a = r0Var;
            this.f34572b = c0Var;
            this.f34573c = vVar;
        }

        @Override // androidx.compose.ui.layout.l0
        public final androidx.compose.ui.layout.m0 d(androidx.compose.ui.layout.n0 n0Var, List<? extends androidx.compose.ui.layout.k0> list, long j5) {
            Map<androidx.compose.ui.layout.a, Integer> map;
            this.f34571a.getValue();
            long n11 = this.f34572b.n(j5, n0Var.getLayoutDirection(), this.f34573c, list);
            a aVar = new a(this.f34572b, list);
            map = kotlin.collections.j0.f76190a;
            return n0Var.g1((int) (n11 >> 32), (int) (n11 & 4294967295L), map, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstraintLayout.kt */
    /* loaded from: classes3.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.l<t2.b0, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.constraintlayout.compose.c0 f34576a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(androidx.constraintlayout.compose.c0 c0Var) {
            super(1);
            this.f34576a = c0Var;
        }

        @Override // ym0.l
        public final nm0.y invoke(t2.b0 b0Var) {
            androidx.constraintlayout.compose.f0.a(b0Var, this.f34576a);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstraintLayout.kt */
    /* loaded from: classes3.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.constraintlayout.compose.c0 f34577a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f34578b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f34579c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f34580d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f34581e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(androidx.constraintlayout.compose.c0 c0Var, int i11, String str, int i12, String str2, long j5) {
            super(2);
            this.f34577a = c0Var;
            this.f34578b = str;
            this.f34579c = i12;
            this.f34580d = str2;
            this.f34581e = j5;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                this.f34577a.d(aVar2, 8);
                aVar2.s(776425255);
                e.a aVar3 = androidx.compose.ui.e.f8927a;
                androidx.compose.ui.e b10 = androidx.compose.ui.layout.u.b(aVar3, "title");
                int i11 = this.f34579c;
                nk.a0.i(0, (i11 & 112) | 6, 28, 0L, aVar2, b10, null, this.f34578b);
                nk.a.g(0, 0, ((i11 >> 3) & 112) | 6, 60, 0L, aVar2, androidx.compose.ui.layout.u.b(aVar3, HealthConstants.FoodInfo.DESCRIPTION), null, this.f34580d);
                androidx.compose.foundation.layout.k.a(androidx.compose.foundation.c.b(androidx.compose.ui.layout.u.b(aVar3, "indicator"), this.f34581e, x0.h.e()), aVar2, 0);
                aVar2.J();
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: ConstraintLayout.kt */
    /* loaded from: classes3.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.l<t2.b0, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.constraintlayout.compose.c0 f34582a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(androidx.constraintlayout.compose.c0 c0Var) {
            super(1);
            this.f34582a = c0Var;
        }

        @Override // ym0.l
        public final nm0.y invoke(t2.b0 b0Var) {
            androidx.constraintlayout.compose.f0.a(b0Var, this.f34582a);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: ConstraintLayout.kt */
    /* loaded from: classes3.dex */
    public static final class g extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k1.r0 f34583a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.constraintlayout.compose.c0 f34584b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f34585c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f34586d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f34587e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f34588f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(k1.r0 r0Var, androidx.constraintlayout.compose.c0 c0Var, int i11, String str, int i12, String str2, long j5) {
            super(2);
            this.f34583a = r0Var;
            this.f34584b = c0Var;
            this.f34585c = str;
            this.f34586d = i12;
            this.f34587e = str2;
            this.f34588f = j5;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                this.f34583a.setValue(nm0.y.f85009a);
                this.f34584b.d(aVar2, 8);
                aVar2.s(776425255);
                e.a aVar3 = androidx.compose.ui.e.f8927a;
                androidx.compose.ui.e b10 = androidx.compose.ui.layout.u.b(aVar3, "title");
                int i11 = this.f34586d;
                nk.a0.i(0, (i11 & 112) | 6, 28, 0L, aVar2, b10, null, this.f34585c);
                nk.a.g(0, 0, ((i11 >> 3) & 112) | 6, 60, 0L, aVar2, androidx.compose.ui.layout.u.b(aVar3, HealthConstants.FoodInfo.DESCRIPTION), null, this.f34587e);
                androidx.compose.foundation.layout.k.a(androidx.compose.foundation.c.b(androidx.compose.ui.layout.u.b(aVar3, "indicator"), this.f34588f, x0.h.e()), aVar2, 0);
                aVar2.J();
            }
            return nm0.y.f85009a;
        }
    }

    public static final void a(androidx.compose.ui.e modifier, String title, String description, long j5, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        androidx.constraintlayout.compose.z zVar;
        int i13;
        int i14;
        int i15;
        int i16;
        kotlin.jvm.internal.u.j(modifier, "modifier");
        kotlin.jvm.internal.u.j(title, "title");
        kotlin.jvm.internal.u.j(description, "description");
        androidx.compose.runtime.b g11 = aVar.g(1898294426);
        if ((i11 & 14) == 0) {
            if (g11.K(modifier)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.K(title)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        if ((i11 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.K(description)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        if ((i11 & 7168) == 0) {
            if (g11.d(j5)) {
                i13 = ModuleCopy.f28574b;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        int i17 = i12;
        if ((i17 & 5851) == 1170 && g11.h()) {
            g11.C();
        } else {
            androidx.constraintlayout.compose.v vVar = new androidx.constraintlayout.compose.v(b.f34570a);
            int i18 = (i17 << 3) & 112;
            g11.s(136894876);
            m0.k.d(0, 0, null, 7);
            Object c11 = androidx.compose.material.o.c(g11, -270238446, -492369756);
            if (c11 == a.C0060a.a()) {
                c11 = ah.q.e(0L);
                g11.n(c11);
            }
            g11.J();
            k1.q0 q0Var = (k1.q0) c11;
            g11.s(-492369756);
            Object t11 = g11.t();
            if (t11 == a.C0060a.a()) {
                t11 = androidx.compose.runtime.l0.f(nm0.y.f85009a, androidx.compose.runtime.l0.h());
                g11.n(t11);
            }
            g11.J();
            k1.r0 r0Var = (k1.r0) t11;
            k3.d dVar = (k3.d) g11.D(androidx.compose.ui.platform.n1.e());
            g11.s(-492369756);
            Object t12 = g11.t();
            if (t12 == a.C0060a.a()) {
                t12 = new androidx.constraintlayout.compose.c0(dVar);
                g11.n(t12);
            }
            g11.J();
            androidx.constraintlayout.compose.c0 c0Var = (androidx.constraintlayout.compose.c0) t12;
            g11.s(1157296644);
            boolean K = g11.K(vVar);
            Object t13 = g11.t();
            if (K || t13 == a.C0060a.a()) {
                c0Var.l(vVar);
                g11.n(Boolean.TRUE);
            }
            g11.J();
            c cVar = new c(r0Var, c0Var, vVar);
            if (vVar instanceof androidx.constraintlayout.compose.w) {
                ((androidx.constraintlayout.compose.w) vVar).e(q0Var);
            }
            if (vVar instanceof androidx.constraintlayout.compose.z) {
                zVar = (androidx.constraintlayout.compose.z) vVar;
            } else {
                zVar = null;
            }
            c0Var.c(zVar);
            float h11 = c0Var.h();
            if (!Float.isNaN(h11)) {
                g11.s(-270237286);
                androidx.compose.ui.e r7 = ah.k.r(modifier, c0Var.h());
                g11.s(733328855);
                e.a aVar2 = androidx.compose.ui.e.f8927a;
                androidx.compose.ui.layout.l0 d11 = g6.d(false, g11, -1323940314);
                int G = g11.G();
                k1.v0 l5 = g11.l();
                androidx.compose.ui.node.g.D.getClass();
                ym0.a a11 = g.a.a();
                s1.a c12 = androidx.compose.ui.layout.y.c(aVar2);
                if (g11.i() instanceof k1.d) {
                    g11.A();
                    if (g11.e()) {
                        g11.F(a11);
                    } else {
                        g11.m();
                    }
                    ym0.p b10 = com.withings.authentication.e.b(g11, d11, g11, l5);
                    if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                        androidx.camera.camera2.internal.l0.d(G, g11, G, b10);
                    }
                    dq.x.b(0, c12, k1.j1.a(g11), g11, 2058660585);
                    androidx.compose.foundation.layout.m mVar = androidx.compose.foundation.layout.m.f4307a;
                    androidx.compose.ui.layout.y.a(t2.o.c(r7, false, new d(c0Var)), s1.b.b(g11, -1756357099, new e(c0Var, i18, title, i17, description, j5)), cVar, g11, 48, 0);
                    g11.s(-270236815);
                    c0Var.f(mVar, h11, g11, ConstantsWs.WS_STATUS_ERROR_SYNCHROTIME);
                    g11.J();
                    g11.J();
                    g11.o();
                    g11.J();
                    g11.J();
                    g11.J();
                } else {
                    a3.g.s();
                    throw null;
                }
            } else {
                g11.s(-270236696);
                androidx.compose.ui.layout.y.a(t2.o.c(modifier, false, new f(c0Var)), s1.b.b(g11, -1866817256, new g(r0Var, c0Var, i18, title, i17, description, j5)), cVar, g11, 48, 0);
                g11.J();
            }
            g11.J();
            g11.J();
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new a(modifier, title, description, j5, i11));
        }
    }
}
