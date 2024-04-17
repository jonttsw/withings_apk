package com.withings.common.compose.component;

import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.layout.e;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import java.util.ArrayList;
import m0.r0;
import x1.b;
import x1.d;
/* compiled from: Loader.kt */
/* loaded from: classes3.dex */
public final class y2 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Loader.kt */
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.l<r0.b<Float>, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f34938a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11) {
            super(1);
            this.f34938a = i11;
        }

        @Override // ym0.l
        public final nm0.y invoke(r0.b<Float> bVar) {
            r0.b<Float> keyframes = bVar;
            kotlin.jvm.internal.u.j(keyframes, "$this$keyframes");
            keyframes.c(1000);
            int i11 = this.f34938a;
            if (i11 != 0) {
                if (i11 != 1) {
                    keyframes.d(0, Float.valueOf(0.2f));
                    keyframes.d(250, Float.valueOf(0.5f));
                    keyframes.d(500, Float.valueOf(1.0f));
                    keyframes.d(750, Float.valueOf(0.5f));
                    keyframes.d(1000, Float.valueOf(0.2f));
                } else {
                    keyframes.d(0, Float.valueOf(0.5f));
                    keyframes.d(250, Float.valueOf(0.2f));
                    keyframes.d(500, Float.valueOf(0.5f));
                    keyframes.d(750, Float.valueOf(1.0f));
                    keyframes.d(1000, Float.valueOf(0.5f));
                }
            } else {
                keyframes.d(0, Float.valueOf(1.0f));
                keyframes.d(250, Float.valueOf(0.5f));
                keyframes.d(500, Float.valueOf(0.2f));
                keyframes.d(750, Float.valueOf(0.5f));
                keyframes.d(1000, Float.valueOf(1.0f));
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Loader.kt */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0.a0 f34939a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f34940b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f34941c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(r0.a0 a0Var, long j5, int i11) {
            super(2);
            this.f34939a = a0Var;
            this.f34940b = j5;
            this.f34941c = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f34941c | 1);
            y2.a(this.f34939a, this.f34940b, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    public static final void a(r0.a0 ButtonLoader, long j5, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        float f11;
        int i13;
        int i14;
        kotlin.jvm.internal.u.j(ButtonLoader, "$this$ButtonLoader");
        androidx.compose.runtime.b g11 = aVar.g(-1475288989);
        int i15 = 4;
        if ((i11 & 14) == 0) {
            if (g11.K(ButtonLoader)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.d(j5)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && g11.h()) {
            g11.C();
        } else {
            float f12 = 1.0f;
            int i16 = 1;
            androidx.compose.ui.e f13 = androidx.compose.foundation.layout.e1.f(ButtonLoader.b(androidx.compose.ui.e.f8927a, 1.0f, true), 21);
            int i17 = androidx.compose.foundation.layout.e.f4229i;
            e.h p11 = androidx.compose.foundation.layout.e.p(yk.h.b(), b.a.g());
            d.b i18 = b.a.i();
            g11.s(693286680);
            androidx.compose.ui.layout.l0 a11 = androidx.compose.foundation.layout.c1.a(p11, i18, g11);
            g11.s(-1323940314);
            int G = g11.G();
            k1.v0 l5 = g11.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a12 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(f13);
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
                int i19 = 0;
                dq.x.b(0, c11, k1.j1.a(g11), g11, 2058660585);
                m0.l0 c12 = m0.p0.c(1, g11, null);
                g11.s(1299714438);
                en0.i iVar = new en0.i(0, 2, 1);
                ArrayList arrayList = new ArrayList(kotlin.collections.x.y(iVar, 10));
                en0.j it = iVar.iterator();
                while (it.hasNext()) {
                    int a13 = it.a();
                    float f14 = 0.2f;
                    if (a13 != 0) {
                        if (a13 != i16) {
                            f11 = 0.2f;
                        } else {
                            f11 = 0.5f;
                        }
                    } else {
                        f11 = f12;
                    }
                    if (a13 != 0) {
                        if (a13 == i16) {
                            f14 = 0.5f;
                        }
                    } else {
                        f14 = f12;
                    }
                    g11.s(-1592454007);
                    boolean c13 = g11.c(a13);
                    Object t11 = g11.t();
                    if (c13 || t11 == a.C0060a.a()) {
                        t11 = new a(a13);
                        g11.n(t11);
                    }
                    g11.J();
                    ArrayList arrayList2 = arrayList;
                    arrayList2.add(Float.valueOf(((Number) m0.p0.a(c12, f11, f14, m0.k.a(m0.k.b((ym0.l) t11), RepeatMode.f3711b, i15), null, g11, 4104, 8).getValue()).floatValue()));
                    i19 = i19;
                    i16 = i16;
                    arrayList = arrayList2;
                    i15 = 4;
                    f12 = 1.0f;
                }
                int i21 = i19;
                ArrayList arrayList3 = arrayList;
                g11.J();
                e.a aVar2 = androidx.compose.ui.e.f8927a;
                float f15 = 8;
                androidx.compose.foundation.layout.k.a(androidx.compose.foundation.c.b(androidx.compose.ui.graphics.b.b(androidx.compose.foundation.layout.e1.n(aVar2, f15), 0.0f, 0.0f, ((Number) arrayList3.get(i21)).floatValue(), 0.0f, 0.0f, null, false, 131067), j5, x0.h.e()), g11, i21);
                androidx.compose.foundation.layout.k.a(androidx.compose.foundation.c.b(androidx.compose.ui.graphics.b.b(androidx.compose.foundation.layout.e1.n(aVar2, f15), 0.0f, 0.0f, ((Number) arrayList3.get(i16)).floatValue(), 0.0f, 0.0f, null, false, 131067), j5, x0.h.e()), g11, i21);
                androidx.compose.foundation.layout.k.a(androidx.compose.foundation.c.b(androidx.compose.ui.graphics.b.b(androidx.compose.foundation.layout.e1.n(aVar2, f15), 0.0f, 0.0f, ((Number) arrayList3.get(2)).floatValue(), 0.0f, 0.0f, null, false, 131067), j5, x0.h.e()), g11, i21);
                g11.J();
                g11.o();
                g11.J();
                g11.J();
            } else {
                a3.g.s();
                throw null;
            }
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new b(ButtonLoader, j5, i11));
        }
    }
}
