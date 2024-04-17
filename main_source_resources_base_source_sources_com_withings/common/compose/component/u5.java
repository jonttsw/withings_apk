package com.withings.common.compose.component;

import androidx.compose.animation.core.RepeatMode;
import androidx.compose.material.w7;
import androidx.compose.runtime.a;
import androidx.compose.ui.unit.LayoutDirection;
import m0.d1;
/* compiled from: WithingsPlaceholder.kt */
/* loaded from: classes3.dex */
public final class u5 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WithingsPlaceholder.kt */
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.q<androidx.compose.ui.e, androidx.compose.runtime.a, Integer, androidx.compose.ui.e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f34820a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d2.r1 f34821b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z5, d2.r1 r1Var) {
            super(3);
            this.f34820a = z5;
            this.f34821b = r1Var;
        }

        public static final float a(k1.o1 o1Var) {
            return ((Number) o1Var.getValue()).floatValue();
        }

        @Override // ym0.q
        public final androidx.compose.ui.e invoke(androidx.compose.ui.e eVar, androidx.compose.runtime.a aVar, Integer num) {
            float f11;
            float f12;
            float f13;
            float f14;
            androidx.compose.ui.e composed = eVar;
            androidx.compose.runtime.a aVar2 = aVar;
            num.intValue();
            kotlin.jvm.internal.u.j(composed, "$this$composed");
            aVar2.s(272193477);
            aVar2.J();
            long f15 = ((yk.w) androidx.camera.camera2.internal.p2.b(aVar2, 615317871)).c().f();
            aVar2.s(-1001573402);
            Object t11 = aVar2.t();
            if (t11 == a.C0060a.a()) {
                t11 = new androidx.compose.ui.node.n1();
                aVar2.n(t11);
            }
            androidx.compose.ui.node.n1 n1Var = (androidx.compose.ui.node.n1) t11;
            Object j5 = w7.j(aVar2, -1001573347);
            if (j5 == a.C0060a.a()) {
                j5 = new androidx.compose.ui.node.n1();
                aVar2.n(j5);
            }
            androidx.compose.ui.node.n1 n1Var2 = (androidx.compose.ui.node.n1) j5;
            Object j11 = w7.j(aVar2, -1001573289);
            if (j11 == a.C0060a.a()) {
                j11 = new androidx.compose.ui.node.n1();
                aVar2.n(j11);
            }
            androidx.compose.ui.node.n1 n1Var3 = (androidx.compose.ui.node.n1) j11;
            Object j12 = w7.j(aVar2, -1001573176);
            if (j12 == a.C0060a.a()) {
                j12 = ah.l.t(0.0f);
                aVar2.n(j12);
            }
            k1.o0 o0Var = (k1.o0) j12;
            Object j13 = w7.j(aVar2, -1001573072);
            a.C0060a.C0061a a11 = a.C0060a.a();
            boolean z5 = this.f34820a;
            if (j13 == a11) {
                j13 = new m0.t0(Boolean.valueOf(z5));
                aVar2.n(j13);
            }
            m0.t0 t0Var = (m0.t0) j13;
            aVar2.J();
            t0Var.g(Boolean.valueOf(z5));
            m0.d1 e11 = m0.n1.e(t0Var, "placeholder_crossfade", aVar2);
            aVar2.s(-1338768149);
            s5 s5Var = s5.f34719a;
            m0.q1 b10 = m0.s1.b();
            aVar2.s(-142660079);
            boolean booleanValue = ((Boolean) e11.g()).booleanValue();
            aVar2.s(-2103968342);
            if (booleanValue) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            aVar2.J();
            Float valueOf = Float.valueOf(f11);
            boolean booleanValue2 = ((Boolean) e11.l()).booleanValue();
            aVar2.s(-2103968342);
            if (booleanValue2) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            aVar2.J();
            d1.d c11 = m0.n1.c(e11, valueOf, Float.valueOf(f12), s5Var.invoke(e11.k(), aVar2, 0), b10, aVar2);
            aVar2.J();
            aVar2.J();
            aVar2.s(-1338768149);
            t5 t5Var = t5.f34756a;
            m0.q1 b11 = m0.s1.b();
            aVar2.s(-142660079);
            boolean booleanValue3 = ((Boolean) e11.g()).booleanValue();
            aVar2.s(-325205276);
            if (booleanValue3) {
                f13 = 0.0f;
            } else {
                f13 = 1.0f;
            }
            aVar2.J();
            Float valueOf2 = Float.valueOf(f13);
            boolean booleanValue4 = ((Boolean) e11.l()).booleanValue();
            aVar2.s(-325205276);
            if (booleanValue4) {
                f14 = 0.0f;
            } else {
                f14 = 1.0f;
            }
            aVar2.J();
            d1.d c12 = m0.n1.c(e11, valueOf2, Float.valueOf(f14), t5Var.invoke(e11.k(), aVar2, 0), b11, aVar2);
            aVar2.J();
            aVar2.J();
            m0.k0 a12 = m0.k.a(m0.k.d(600, 200, null, 4), RepeatMode.f3711b, 4);
            aVar2.s(-1001572276);
            if (z5 || ((Number) c11.getValue()).floatValue() >= 0.01f) {
                o0Var.t(((Number) m0.p0.a(m0.p0.c(0, aVar2, ""), 0.0f, 1.0f, a12, "progress", aVar2, 29112, 0).getValue()).floatValue());
            }
            Object j14 = w7.j(aVar2, -1001571924);
            if (j14 == a.C0060a.a()) {
                j14 = d2.l.a();
                aVar2.n(j14);
            }
            d2.c1 c1Var = (d2.c1) j14;
            aVar2.J();
            aVar2.s(-1001571899);
            boolean d11 = aVar2.d(f15) | aVar2.K(this.f34821b);
            Object t12 = aVar2.t();
            if (d11 || t12 == a.C0060a.a()) {
                t12 = androidx.compose.ui.draw.c.d(composed, new r5(c1Var, n1Var3, this.f34821b, f15, n1Var2, n1Var, c12, c11, o0Var));
                aVar2.n(t12);
            }
            androidx.compose.ui.e eVar2 = (androidx.compose.ui.e) t12;
            aVar2.J();
            aVar2.J();
            return eVar2;
        }
    }

    public static final d2.a1 a(f2.f fVar, d2.r1 r1Var, long j5, float f11, d2.a1 a1Var, LayoutDirection layoutDirection, c2.g gVar) {
        d2.a1 a1Var2 = null;
        if (r1Var == d2.h1.a()) {
            f2.f.p1(fVar, j5, 0L, 0L, 0.0f, 126);
            f2.f.N0(fVar, new d2.s1(j5), 0L, 0L, f11, null, 0, 118);
        } else {
            if (c2.g.d(fVar.b(), gVar) && fVar.getLayoutDirection() == layoutDirection) {
                a1Var2 = a1Var;
            }
            if (a1Var2 == null) {
                a1Var2 = r1Var.a(fVar.b(), fVar.getLayoutDirection(), fVar);
            }
            d2.b1.c(fVar, a1Var2, j5);
            d2.b1.b(fVar, a1Var2, new d2.s1(j5), f11);
        }
        return a1Var2;
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, boolean z5, d2.r1 shape) {
        androidx.compose.ui.e a11;
        kotlin.jvm.internal.u.j(eVar, "<this>");
        kotlin.jvm.internal.u.j(shape, "shape");
        a11 = androidx.compose.ui.c.a(eVar, androidx.compose.ui.platform.c2.a(), new a(z5, shape));
        return a11;
    }

    public static androidx.compose.ui.e c(androidx.compose.ui.e eVar, boolean z5) {
        return b(eVar, z5, x0.h.b(4));
    }
}
