package com.withings.common.compose.component;

import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.f;
import androidx.compose.ui.layout.g1;
import androidx.constraintlayout.compose.j;
import androidx.constraintlayout.compose.s;
import com.withings.library.authentication.api.ConstantsWs;
import java.util.List;
import java.util.Map;
/* compiled from: OverlappingImage.kt */
/* loaded from: classes3.dex */
public final class b3 {

    /* compiled from: OverlappingImage.kt */
    /* loaded from: classes3.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.l<androidx.constraintlayout.compose.c, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.constraintlayout.compose.d f33433a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f33434b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.constraintlayout.compose.d dVar, float f11) {
            super(1);
            this.f33433a = dVar;
            this.f33434b = f11;
        }

        @Override // ym0.l
        public final nm0.y invoke(androidx.constraintlayout.compose.c cVar) {
            androidx.constraintlayout.compose.c constrainAs = cVar;
            kotlin.jvm.internal.u.j(constrainAs, "$this$constrainAs");
            androidx.constraintlayout.compose.c.j(constrainAs, constrainAs.f().d(), constrainAs.f().c(), 0.0f, 124);
            androidx.constraintlayout.compose.c.i(constrainAs, constrainAs.f().e(), this.f33433a.b(), 0.0f, 1.0f, 60);
            constrainAs.k(new androidx.constraintlayout.compose.t(this.f33434b));
            constrainAs.l(s.a.a());
            return nm0.y.f85009a;
        }
    }

    /* compiled from: OverlappingImage.kt */
    /* loaded from: classes3.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.l<androidx.constraintlayout.compose.c, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f33435a = new kotlin.jvm.internal.w(1);

        @Override // ym0.l
        public final nm0.y invoke(androidx.constraintlayout.compose.c cVar) {
            androidx.constraintlayout.compose.c constrainAs = cVar;
            kotlin.jvm.internal.u.j(constrainAs, "$this$constrainAs");
            androidx.constraintlayout.compose.c.i(constrainAs, constrainAs.f().e(), constrainAs.f().b(), 0.0f, 0.0f, 124);
            androidx.constraintlayout.compose.c.j(constrainAs, constrainAs.f().d(), constrainAs.f().c(), 0.0f, 124);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OverlappingImage.kt */
    /* loaded from: classes3.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f33436a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g2.c f33437b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f33438c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f33439d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f33440e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f33441f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(androidx.compose.ui.e eVar, g2.c cVar, float f11, long j5, int i11, int i12) {
            super(2);
            this.f33436a = eVar;
            this.f33437b = cVar;
            this.f33438c = f11;
            this.f33439d = j5;
            this.f33440e = i11;
            this.f33441f = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f33440e | 1);
            float f11 = this.f33438c;
            long j5 = this.f33439d;
            b3.a(this.f33436a, this.f33437b, f11, j5, aVar, g11, this.f33441f);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: ConstraintLayout.kt */
    /* loaded from: classes3.dex */
    public static final class d implements androidx.compose.ui.layout.l0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k1.r0 f33442a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.constraintlayout.compose.c0 f33443b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.constraintlayout.compose.m f33444c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ k1.r0 f33445d;

        /* compiled from: ConstraintLayout.kt */
        /* loaded from: classes3.dex */
        public static final class a extends kotlin.jvm.internal.w implements ym0.l<g1.a, nm0.y> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ androidx.constraintlayout.compose.c0 f33446a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ List f33447b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(androidx.constraintlayout.compose.c0 c0Var, List list) {
                super(1);
                this.f33446a = c0Var;
                this.f33447b = list;
            }

            @Override // ym0.l
            public final nm0.y invoke(g1.a aVar) {
                this.f33446a.m(aVar, this.f33447b);
                return nm0.y.f85009a;
            }
        }

        public d(k1.r0 r0Var, androidx.constraintlayout.compose.c0 c0Var, androidx.constraintlayout.compose.m mVar, k1.r0 r0Var2) {
            this.f33442a = r0Var;
            this.f33443b = c0Var;
            this.f33444c = mVar;
            this.f33445d = r0Var2;
        }

        @Override // androidx.compose.ui.layout.l0
        public final androidx.compose.ui.layout.m0 d(androidx.compose.ui.layout.n0 n0Var, List<? extends androidx.compose.ui.layout.k0> list, long j5) {
            Map<androidx.compose.ui.layout.a, Integer> map;
            this.f33442a.getValue();
            long n11 = this.f33443b.n(j5, n0Var.getLayoutDirection(), this.f33444c, list);
            this.f33445d.getValue();
            a aVar = new a(this.f33443b, list);
            map = kotlin.collections.j0.f76190a;
            return n0Var.g1((int) (n11 >> 32), (int) (n11 & 4294967295L), map, aVar);
        }
    }

    /* compiled from: ConstraintLayout.kt */
    /* loaded from: classes3.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k1.r0 f33448a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.constraintlayout.compose.m f33449b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(k1.r0 r0Var, androidx.constraintlayout.compose.m mVar) {
            super(0);
            this.f33448a = r0Var;
            this.f33449b = mVar;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            k1.r0 r0Var = this.f33448a;
            r0Var.setValue(Boolean.valueOf(!((Boolean) r0Var.getValue()).booleanValue()));
            this.f33449b.k();
            return nm0.y.f85009a;
        }
    }

    /* compiled from: ConstraintLayout.kt */
    /* loaded from: classes3.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.l<t2.b0, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.constraintlayout.compose.c0 f33450a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(androidx.constraintlayout.compose.c0 c0Var) {
            super(1);
            this.f33450a = c0Var;
        }

        @Override // ym0.l
        public final nm0.y invoke(t2.b0 b0Var) {
            androidx.constraintlayout.compose.f0.a(b0Var, this.f33450a);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: ConstraintLayout.kt */
    /* loaded from: classes3.dex */
    public static final class g extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k1.r0 f33451a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.constraintlayout.compose.j f33452b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a f33453c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f33454d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.a f33455e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f33456f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ float f33457g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ g2.c f33458h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(k1.r0 r0Var, androidx.constraintlayout.compose.j jVar, int i11, e eVar, long j5, androidx.compose.runtime.a aVar, int i12, float f11, g2.c cVar) {
            super(2);
            this.f33451a = r0Var;
            this.f33452b = jVar;
            this.f33453c = eVar;
            this.f33454d = j5;
            this.f33455e = aVar;
            this.f33456f = i12;
            this.f33457g = f11;
            this.f33458h = cVar;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.ui.e b10;
            boolean z5;
            long j5;
            androidx.compose.ui.e b11;
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                this.f33451a.setValue(nm0.y.f85009a);
                androidx.constraintlayout.compose.j jVar = this.f33452b;
                int e11 = jVar.e();
                jVar.f();
                aVar2.s(-2028242966);
                j.b i11 = jVar.i();
                androidx.constraintlayout.compose.d a11 = i11.a();
                androidx.constraintlayout.compose.d b12 = i11.b();
                e.a aVar3 = androidx.compose.ui.e.f8927a;
                b10 = androidx.compose.foundation.c.b(aVar3, this.f33454d, d2.h1.a());
                aVar2.s(-2028242789);
                androidx.compose.runtime.a aVar4 = this.f33455e;
                boolean K = aVar4.K(a11);
                int i12 = this.f33456f;
                int i13 = (i12 & ConstantsWs.HWFAILURE_ZERO) ^ ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED;
                float f11 = this.f33457g;
                if ((i13 > 256 && aVar4.b(f11)) || (i12 & ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED) == 256) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                boolean z11 = z5 | K;
                Object t11 = aVar2.t();
                if (z11 || t11 == a.C0060a.a()) {
                    t11 = new a(a11, f11);
                    aVar2.n(t11);
                }
                aVar2.J();
                androidx.compose.foundation.layout.k.a(androidx.constraintlayout.compose.j.g(b10, b12, (ym0.l) t11), aVar2, 0);
                j5 = d2.f0.f63265i;
                b11 = androidx.compose.foundation.c.b(aVar3, j5, d2.h1.a());
                n0.z.a(this.f33458h, null, androidx.constraintlayout.compose.j.g(b11, a11, b.f33435a), null, f.a.d(), 0.0f, null, aVar2, 24632, 104);
                aVar2.J();
                if (jVar.e() != e11) {
                    int i14 = k1.y.f75241b;
                    aVar2.B(this.f33453c);
                }
            }
            return nm0.y.f85009a;
        }
    }

    public static final void a(androidx.compose.ui.e eVar, g2.c painter, float f11, long j5, androidx.compose.runtime.a aVar, int i11, int i12) {
        e.a aVar2;
        float f12;
        long j11;
        int i13;
        kotlin.jvm.internal.u.j(painter, "painter");
        androidx.compose.runtime.b g11 = aVar.g(-1792700785);
        if ((i12 & 1) != 0) {
            aVar2 = androidx.compose.ui.e.f8927a;
        } else {
            aVar2 = eVar;
        }
        if ((i12 & 4) != 0) {
            f12 = 65;
        } else {
            f12 = f11;
        }
        if ((i12 & 8) != 0) {
            i13 = i11 & (-7169);
            j11 = ((androidx.compose.material3.i1) g11.D(androidx.compose.material3.j1.e())).O();
        } else {
            j11 = j5;
            i13 = i11;
        }
        int i14 = i13 & 14;
        g11.s(-2033384074);
        m0.k.d(0, 0, null, 7);
        g11.s(-270254335);
        g11.J();
        k3.d dVar = (k3.d) g11.D(androidx.compose.ui.platform.n1.e());
        g11.s(-492369756);
        Object t11 = g11.t();
        if (t11 == a.C0060a.a()) {
            t11 = new androidx.constraintlayout.compose.c0(dVar);
            g11.n(t11);
        }
        g11.J();
        androidx.constraintlayout.compose.c0 c0Var = (androidx.constraintlayout.compose.c0) t11;
        g11.s(-492369756);
        Object t12 = g11.t();
        if (t12 == a.C0060a.a()) {
            t12 = new androidx.constraintlayout.compose.j();
            g11.n(t12);
        }
        g11.J();
        androidx.constraintlayout.compose.j jVar = (androidx.constraintlayout.compose.j) t12;
        g11.s(-492369756);
        Object t13 = g11.t();
        if (t13 == a.C0060a.a()) {
            t13 = androidx.compose.runtime.l0.f(Boolean.FALSE, androidx.compose.runtime.v0.f8878a);
            g11.n(t13);
        }
        g11.J();
        k1.r0 r0Var = (k1.r0) t13;
        g11.s(-492369756);
        Object t14 = g11.t();
        if (t14 == a.C0060a.a()) {
            t14 = new androidx.constraintlayout.compose.m(jVar);
            g11.n(t14);
        }
        g11.J();
        androidx.constraintlayout.compose.m mVar = (androidx.constraintlayout.compose.m) t14;
        g11.s(-492369756);
        Object t15 = g11.t();
        if (t15 == a.C0060a.a()) {
            t15 = androidx.compose.runtime.l0.f(nm0.y.f85009a, androidx.compose.runtime.l0.h());
            g11.n(t15);
        }
        g11.J();
        k1.r0 r0Var2 = (k1.r0) t15;
        androidx.compose.ui.layout.y.a(t2.o.c(aVar2, false, new f(c0Var)), s1.b.b(g11, -1908965773, new g(r0Var2, jVar, i14, new e(r0Var, mVar), j11, g11, i11, f12, painter)), new d(r0Var2, c0Var, mVar, r0Var), g11, 48, 0);
        g11.J();
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new c(aVar2, painter, f12, j11, i11, i12));
        }
    }
}
