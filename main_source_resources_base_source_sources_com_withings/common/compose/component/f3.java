package com.withings.common.compose.component;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.e;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import d2.g0;
import okhttp3.internal.http2.Http2;
import x1.b;
/* compiled from: RatingLayout.kt */
/* loaded from: classes3.dex */
public final class f3 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RatingLayout.kt */
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f33780a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ en0.k f33781b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Integer f33782c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.l<Integer, nm0.y> f33783d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(String str, en0.k kVar, Integer num, ym0.l<? super Integer, nm0.y> lVar) {
            super(3);
            this.f33780a = str;
            this.f33781b = kVar;
            this.f33782c = num;
            this.f33783d = lVar;
        }

        @Override // ym0.q
        public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            boolean z5;
            long M;
            long d11;
            androidx.compose.ui.e b10;
            int i11;
            r0.h Card = hVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(Card, "$this$Card");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                e.a aVar3 = androidx.compose.ui.e.f8927a;
                float f11 = 1.0f;
                androidx.compose.ui.e e11 = androidx.compose.foundation.layout.e1.e(androidx.compose.foundation.layout.x0.f(aVar3, yk.h.f()), 1.0f);
                int i12 = androidx.compose.foundation.layout.e.f4229i;
                e.h o11 = androidx.compose.foundation.layout.e.o(yk.h.c());
                aVar2.s(-483455358);
                androidx.compose.ui.layout.l0 b11 = com.withings.authentication.n.b(o11, aVar2, -1323940314);
                int G = aVar2.G();
                k1.v0 l5 = aVar2.l();
                androidx.compose.ui.node.g.D.getClass();
                ym0.a a11 = g.a.a();
                s1.a c11 = androidx.compose.ui.layout.y.c(e11);
                if (aVar2.i() instanceof k1.d) {
                    aVar2.A();
                    if (aVar2.e()) {
                        aVar2.F(a11);
                    } else {
                        aVar2.m();
                    }
                    ym0.p c12 = com.google.protobuf.t.c(aVar2, b11, aVar2, l5);
                    if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G))) {
                        l0.q.a(G, aVar2, G, c12);
                    }
                    boolean z11 = false;
                    l0.r.c(0, c11, k1.j1.a(aVar2), aVar2, 2058660585);
                    nk.a0.g(0, 0, 29, 0L, aVar2, null, null, this.f33780a);
                    androidx.compose.ui.e e12 = androidx.compose.foundation.layout.e1.e(aVar3, 1.0f);
                    e.g f12 = androidx.compose.foundation.layout.e.f();
                    aVar2.s(693286680);
                    androidx.compose.ui.layout.l0 a12 = androidx.compose.foundation.layout.c1.a(f12, b.a.l(), aVar2);
                    aVar2.s(-1323940314);
                    int G2 = aVar2.G();
                    k1.v0 l6 = aVar2.l();
                    ym0.a a13 = g.a.a();
                    s1.a c13 = androidx.compose.ui.layout.y.c(e12);
                    if (aVar2.i() instanceof k1.d) {
                        aVar2.A();
                        if (aVar2.e()) {
                            aVar2.F(a13);
                        } else {
                            aVar2.m();
                        }
                        ym0.p c14 = com.google.protobuf.t.c(aVar2, a12, aVar2, l6);
                        if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G2))) {
                            l0.q.a(G2, aVar2, G2, c14);
                        }
                        l0.r.c(0, c13, k1.j1.a(aVar2), aVar2, 2058660585);
                        aVar2.s(-1226438026);
                        en0.k kVar = this.f33781b;
                        en0.j it = kVar.iterator();
                        int i13 = 0;
                        while (it.hasNext()) {
                            int a14 = it.a();
                            int i14 = i13 + 1;
                            if (i13 >= 0) {
                                Integer num2 = this.f33782c;
                                if (num2 != null && a14 <= num2.intValue()) {
                                    z5 = true;
                                } else {
                                    z5 = z11;
                                }
                                if (z5) {
                                    M = ((androidx.compose.material3.i1) androidx.camera.core.y1.c(aVar2, 1365358359)).J();
                                    aVar2.J();
                                } else {
                                    M = ((androidx.compose.material3.i1) androidx.camera.core.y1.c(aVar2, 1365358446)).M();
                                    aVar2.J();
                                }
                                if (z5) {
                                    d11 = ((androidx.compose.material3.i1) androidx.camera.core.y1.c(aVar2, 1365358588)).O();
                                    aVar2.J();
                                } else {
                                    aVar2.J();
                                    d11 = ((yk.w) androidx.camera.camera2.internal.c3.b(aVar2, 1365358677, 615317871)).g().d();
                                    aVar2.J();
                                }
                                e.a aVar4 = androidx.compose.ui.e.f8927a;
                                if (f11 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(en0.r.f(f11, Float.MAX_VALUE), true);
                                    aVar2.s(1365358959);
                                    Object t11 = aVar2.t();
                                    if (t11 == a.C0060a.a()) {
                                        t11 = q0.n.a();
                                        aVar2.n(t11);
                                    }
                                    q0.o oVar = (q0.o) t11;
                                    aVar2.J();
                                    aVar2.s(1365359029);
                                    ym0.l<Integer, nm0.y> lVar = this.f33783d;
                                    boolean K = aVar2.K(lVar) | aVar2.c(a14);
                                    Object t12 = aVar2.t();
                                    if (K || t12 == a.C0060a.a()) {
                                        t12 = new e3(a14, lVar);
                                        aVar2.n(t12);
                                    }
                                    aVar2.J();
                                    androidx.compose.ui.e a15 = androidx.compose.foundation.h.a(layoutWeightElement, oVar, null, false, null, (ym0.a) t12, 28);
                                    int i15 = androidx.compose.foundation.layout.e.f4229i;
                                    e.h o12 = androidx.compose.foundation.layout.e.o(yk.h.a());
                                    aVar2.s(-483455358);
                                    androidx.compose.ui.layout.l0 b12 = com.withings.authentication.n.b(o12, aVar2, -1323940314);
                                    int G3 = aVar2.G();
                                    k1.v0 l11 = aVar2.l();
                                    androidx.compose.ui.node.g.D.getClass();
                                    ym0.a a16 = g.a.a();
                                    s1.a c15 = androidx.compose.ui.layout.y.c(a15);
                                    if (aVar2.i() instanceof k1.d) {
                                        aVar2.A();
                                        if (aVar2.e()) {
                                            aVar2.F(a16);
                                        } else {
                                            aVar2.m();
                                        }
                                        ym0.p c16 = com.google.protobuf.t.c(aVar2, b12, aVar2, l11);
                                        if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G3))) {
                                            l0.q.a(G3, aVar2, G3, c16);
                                        }
                                        l0.r.c(0, c15, k1.j1.a(aVar2), aVar2, 2058660585);
                                        float f13 = 12;
                                        float f14 = 48;
                                        b10 = androidx.compose.foundation.c.b(androidx.collection.c.g(androidx.compose.foundation.layout.e1.p(aVar4, f13, f13, f14, f14), x0.h.e()).n(new HorizontalAlignElement(b.a.g())), M, d2.h1.a());
                                        androidx.compose.ui.layout.l0 b13 = defpackage.c.b(aVar2, 733328855, false, aVar2, -1323940314);
                                        int G4 = aVar2.G();
                                        k1.v0 l12 = aVar2.l();
                                        ym0.a a17 = g.a.a();
                                        s1.a c17 = androidx.compose.ui.layout.y.c(b10);
                                        if (aVar2.i() instanceof k1.d) {
                                            aVar2.A();
                                            if (aVar2.e()) {
                                                aVar2.F(a17);
                                            } else {
                                                aVar2.m();
                                            }
                                            ym0.p c18 = com.google.protobuf.t.c(aVar2, b13, aVar2, l12);
                                            if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G4))) {
                                                l0.q.a(G4, aVar2, G4, c18);
                                            }
                                            c17.invoke(k1.j1.a(aVar2), aVar2, 0);
                                            aVar2.s(2058660585);
                                            androidx.compose.ui.e f15 = androidx.compose.foundation.layout.x0.f(aVar4, yk.h.c());
                                            int i16 = i13;
                                            n0.z.a(s2.d.a(C1987R.drawable.ic_rate_emptied, aVar2), a14 + " on " + kVar.n() + " stars", f15, null, null, 0.0f, g0.a.a(5, d11), aVar2, ConstantsWs.WS_STATUS_FIRMWARE_NOT_VALIDATED, 56);
                                            aVar2.J();
                                            aVar2.o();
                                            aVar2.J();
                                            aVar2.J();
                                            aVar2.s(421518470);
                                            if (i16 == 0 || i16 == kotlin.collections.x.A(kVar) - 1) {
                                                if (i16 == 0) {
                                                    i11 = C1987R.string.programsFeedbacks_bad;
                                                } else {
                                                    i11 = C1987R.string.programsFeedbacks_good;
                                                }
                                                nk.u.d(0, 0, 0, 44, 0L, aVar2, new HorizontalAlignElement(b.a.g()), d3.g.a(3), ay.b.u(i11, aVar2));
                                            }
                                            androidx.compose.material.v.b(aVar2);
                                            z11 = false;
                                            i13 = i14;
                                            f11 = 1.0f;
                                        } else {
                                            a3.g.s();
                                            throw null;
                                        }
                                    } else {
                                        a3.g.s();
                                        throw null;
                                    }
                                } else {
                                    throw new IllegalArgumentException(defpackage.b.b("invalid weight ", 1.0f, "; must be greater than zero").toString());
                                }
                            } else {
                                kotlin.collections.x.K0();
                                throw null;
                            }
                        }
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
                    a3.g.s();
                    throw null;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RatingLayout.kt */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f33784a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f33785b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Integer f33786c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ en0.k f33787d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.l<Integer, nm0.y> f33788e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f33789f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f33790g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(androidx.compose.ui.e eVar, String str, Integer num, en0.k kVar, ym0.l<? super Integer, nm0.y> lVar, int i11, int i12) {
            super(2);
            this.f33784a = eVar;
            this.f33785b = str;
            this.f33786c = num;
            this.f33787d = kVar;
            this.f33788e = lVar;
            this.f33789f = i11;
            this.f33790g = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f33789f | 1);
            en0.k kVar = this.f33787d;
            ym0.l<Integer, nm0.y> lVar = this.f33788e;
            f3.a(this.f33784a, this.f33785b, this.f33786c, kVar, lVar, aVar, g11, this.f33790g);
            return nm0.y.f85009a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [en0.i] */
    public static final void a(androidx.compose.ui.e eVar, String title, Integer num, en0.k kVar, ym0.l<? super Integer, nm0.y> onRatingChanged, androidx.compose.runtime.a aVar, int i11, int i12) {
        Object obj;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        e.a aVar2;
        en0.k kVar2;
        en0.k kVar3;
        kotlin.jvm.internal.u.j(title, "title");
        kotlin.jvm.internal.u.j(onRatingChanged, "onRatingChanged");
        androidx.compose.runtime.b g11 = aVar.g(365293978);
        int i18 = i12 & 1;
        if (i18 != 0) {
            i13 = i11 | 6;
            obj = eVar;
        } else if ((i11 & 14) == 0) {
            Object obj2 = eVar;
            if (g11.K(obj2)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i13 = i14 | i11;
            obj = obj2;
        } else {
            obj = eVar;
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            if (g11.K(title)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i13 |= i15;
        }
        if ((i12 & 4) != 0) {
            i13 |= ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED;
        } else if ((i11 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.K(num)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i13 |= i16;
        }
        int i19 = i12 & 8;
        if (i19 != 0) {
            i13 |= 1024;
        }
        if ((i12 & 16) != 0) {
            i13 |= 24576;
        } else if ((57344 & i11) == 0) {
            if (g11.w(onRatingChanged)) {
                i17 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i17 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i13 |= i17;
        }
        if (i19 == 8 && (i13 & 46811) == 9362 && g11.h()) {
            g11.C();
            aVar2 = obj;
            kVar3 = kVar;
        } else {
            g11.M0();
            if ((i11 & 1) != 0 && !g11.v0()) {
                g11.C();
                aVar2 = obj;
            } else {
                if (i18 != 0) {
                    aVar2 = androidx.compose.ui.e.f8927a;
                } else {
                    aVar2 = obj;
                }
                if (i19 != 0) {
                    kVar2 = new en0.i(1, 5, 1);
                    g11.l0();
                    androidx.compose.material3.y0 b10 = androidx.compose.material3.z0.b(((androidx.compose.material3.i1) g11.D(androidx.compose.material3.j1.e())).a(), g11, 0);
                    x0.g b11 = x0.h.b(yk.h.c());
                    g11.s(-213249033);
                    float f11 = 0;
                    androidx.compose.material3.c1 c11 = androidx.compose.material3.z0.c(f11, f11, f11, f11, f11, f11, g11, 0);
                    g11.J();
                    androidx.compose.material3.d1.a(androidx.collection.c.g(aVar2, x0.h.b(yk.h.c())), b11, b10, c11, null, s1.b.b(g11, 1483401356, new a(title, kVar2, num, onRatingChanged)), g11, 196608, 16);
                    kVar3 = kVar2;
                }
            }
            kVar2 = kVar;
            g11.l0();
            androidx.compose.material3.y0 b102 = androidx.compose.material3.z0.b(((androidx.compose.material3.i1) g11.D(androidx.compose.material3.j1.e())).a(), g11, 0);
            x0.g b112 = x0.h.b(yk.h.c());
            g11.s(-213249033);
            float f112 = 0;
            androidx.compose.material3.c1 c112 = androidx.compose.material3.z0.c(f112, f112, f112, f112, f112, f112, g11, 0);
            g11.J();
            androidx.compose.material3.d1.a(androidx.collection.c.g(aVar2, x0.h.b(yk.h.c())), b112, b102, c112, null, s1.b.b(g11, 1483401356, new a(title, kVar2, num, onRatingChanged)), g11, 196608, 16);
            kVar3 = kVar2;
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new b(aVar2, title, num, kVar3, onRatingChanged, i11, i12));
        }
    }
}
