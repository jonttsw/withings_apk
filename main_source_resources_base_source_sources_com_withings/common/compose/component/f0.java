package com.withings.common.compose.component;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.e;
import androidx.compose.material3.g9;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.withings.library.authentication.api.ConstantsWs;
import java.util.List;
import x1.b;
import x1.d;
/* compiled from: ColorLegendBar.kt */
/* loaded from: classes3.dex */
public final class f0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ColorLegendBar.kt */
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f33746a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List<x2> f33747b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f33748c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f33749d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ float f33750e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f33751f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f33752g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, List<x2> list, androidx.compose.ui.e eVar, float f11, float f12, int i11, int i12) {
            super(2);
            this.f33746a = str;
            this.f33747b = list;
            this.f33748c = eVar;
            this.f33749d = f11;
            this.f33750e = f12;
            this.f33751f = i11;
            this.f33752g = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f33751f | 1);
            float f11 = this.f33749d;
            float f12 = this.f33750e;
            f0.a(this.f33746a, this.f33747b, this.f33748c, f11, f12, aVar, g11, this.f33752g);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ColorLegendBar.kt */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f33753a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f33754b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f33755c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f33756d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f33757e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j5, String str, float f11, androidx.compose.ui.e eVar, int i11) {
            super(2);
            this.f33753a = j5;
            this.f33754b = str;
            this.f33755c = f11;
            this.f33756d = eVar;
            this.f33757e = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f33757e | 1);
            float f11 = this.f33755c;
            androidx.compose.ui.e eVar = this.f33756d;
            f0.b(this.f33753a, this.f33754b, f11, eVar, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    public static final void a(String title, List<x2> legends, androidx.compose.ui.e eVar, float f11, float f12, androidx.compose.runtime.a aVar, int i11, int i12) {
        e.a aVar2;
        float f13;
        kotlin.jvm.internal.u.j(title, "title");
        kotlin.jvm.internal.u.j(legends, "legends");
        androidx.compose.runtime.b g11 = aVar.g(-1728917010);
        if ((i12 & 4) != 0) {
            aVar2 = androidx.compose.ui.e.f8927a;
        } else {
            aVar2 = eVar;
        }
        float f14 = (i12 & 8) != 0 ? 2 : f11;
        if ((i12 & 16) != 0) {
            f13 = yk.h.a();
        } else {
            f13 = f12;
        }
        int i13 = androidx.compose.foundation.layout.e.f4229i;
        e.h o11 = androidx.compose.foundation.layout.e.o(yk.h.B());
        int i14 = i11 >> 6;
        g11.s(-483455358);
        androidx.compose.ui.layout.l0 a11 = androidx.compose.foundation.layout.n.a(o11, b.a.k(), g11);
        g11.s(-1323940314);
        int G = g11.G();
        k1.v0 l5 = g11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a12 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(aVar2);
        if (g11.i() instanceof k1.d) {
            g11.A();
            if (g11.e()) {
                g11.F(a12);
            } else {
                g11.m();
            }
            ym0.p b10 = com.withings.authentication.e.b(g11, a11, g11, l5);
            if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                androidx.camera.camera2.internal.l0.d(G, g11, G, b10);
            }
            dq.x.b(0, c11, k1.j1.a(g11), g11, 2058660585);
            nk.a.g(0, 0, (i11 << 3) & 112, 61, 0L, g11, null, null, title);
            e.h o12 = androidx.compose.foundation.layout.e.o(f14);
            androidx.compose.ui.e e11 = androidx.compose.foundation.layout.e1.e(androidx.compose.ui.e.f8927a, 1.0f);
            g11.s(693286680);
            androidx.compose.ui.layout.l0 a13 = androidx.compose.foundation.layout.c1.a(o12, b.a.l(), g11);
            g11.s(-1323940314);
            int G2 = g11.G();
            k1.v0 l6 = g11.l();
            ym0.a a14 = g.a.a();
            s1.a c12 = androidx.compose.ui.layout.y.c(e11);
            if (g11.i() instanceof k1.d) {
                g11.A();
                if (g11.e()) {
                    g11.F(a14);
                } else {
                    g11.m();
                }
                ym0.p b11 = com.withings.authentication.e.b(g11, a13, g11, l6);
                if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G2))) {
                    androidx.camera.camera2.internal.l0.d(G2, g11, G2, b11);
                }
                dq.x.b(0, c12, k1.j1.a(g11), g11, 2058660585);
                g11.s(972649618);
                for (x2 x2Var : legends) {
                    long a15 = x2Var.a();
                    String b12 = x2Var.b();
                    e.a aVar3 = androidx.compose.ui.e.f8927a;
                    if (0.2f > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                        b(a15, b12, f13, new LayoutWeightElement(en0.r.f(0.2f, Float.MAX_VALUE), true), g11, i14 & ConstantsWs.HWFAILURE_ZERO);
                    } else {
                        throw new IllegalArgumentException(defpackage.b.b("invalid weight ", 0.2f, "; must be greater than zero").toString());
                    }
                }
                g11.J();
                g11.J();
                g11.o();
                g11.J();
                g11.J();
                g11.J();
                g11.o();
                g11.J();
                g11.J();
                androidx.compose.runtime.v o02 = g11.o0();
                if (o02 != null) {
                    o02.G(new a(title, legends, aVar2, f14, f13, i11, i12));
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(long j5, String str, float f11, androidx.compose.ui.e eVar, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        androidx.compose.runtime.b g11 = aVar.g(707452454);
        if ((i11 & 14) == 0) {
            if (g11.d(j5)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.K(str)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        if ((i11 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.b(f11)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        if ((i11 & 7168) == 0) {
            if (g11.K(eVar)) {
                i13 = ModuleCopy.f28574b;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        if ((i12 & 5851) == 1170 && g11.h()) {
            g11.C();
        } else {
            e.h o11 = androidx.compose.foundation.layout.e.o(f11);
            d.a g12 = b.a.g();
            g11.s(-483455358);
            androidx.compose.ui.layout.l0 a11 = androidx.compose.foundation.layout.n.a(o11, g12, g11);
            g11.s(-1323940314);
            int G = g11.G();
            k1.v0 l5 = g11.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a12 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(eVar);
            if (g11.i() instanceof k1.d) {
                g11.A();
                if (g11.e()) {
                    g11.F(a12);
                } else {
                    g11.m();
                }
                ym0.p b10 = com.withings.authentication.e.b(g11, a11, g11, l5);
                if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                    androidx.camera.camera2.internal.l0.d(G, g11, G, b10);
                }
                dq.x.b(0, c11, k1.j1.a(g11), g11, 2058660585);
                androidx.compose.ui.e f12 = androidx.compose.foundation.layout.e1.f(androidx.compose.foundation.layout.e1.e(androidx.compose.ui.e.f8927a, 1.0f), yk.h.c());
                x0.b b11 = x0.c.b(4);
                int i17 = x0.h.f106314b;
                androidx.compose.foundation.layout.k.a(androidx.compose.foundation.c.b(f12, j5, new x0.a(b11, b11, b11, b11)), g11, 0);
                nk.u.f(0, 0, i12 & 112, 61, 0L, g11, null, null, str);
                g9.a(g11);
            } else {
                a3.g.s();
                throw null;
            }
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new b(j5, str, f11, eVar, i11));
        }
    }
}
