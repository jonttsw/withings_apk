package com.withings.common.compose.component;

import androidx.compose.material3.f8;
import androidx.compose.material3.g8;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import java.util.List;
/* compiled from: ConsentCard.kt */
/* loaded from: classes3.dex */
public final class s0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConsentCard.kt */
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f34661a = new kotlin.jvm.internal.w(0);

        @Override // ym0.a
        public final /* bridge */ /* synthetic */ nm0.y invoke() {
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConsentCard.kt */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f34662a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List<t0> f34663b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f34664c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f34665d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f34666e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f34667f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f34668g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ym0.l<Boolean, nm0.y> f34669h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f34670i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(String str, List<? extends t0> list, String str2, float f11, String str3, boolean z5, boolean z11, ym0.l<? super Boolean, nm0.y> lVar, ym0.a<nm0.y> aVar) {
            super(3);
            this.f34662a = str;
            this.f34663b = list;
            this.f34664c = str2;
            this.f34665d = f11;
            this.f34666e = str3;
            this.f34667f = z5;
            this.f34668g = z11;
            this.f34669h = lVar;
            this.f34670i = aVar;
        }

        @Override // ym0.q
        public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            r0.h Card = hVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(Card, "$this$Card");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                e.a aVar3 = androidx.compose.ui.e.f8927a;
                androidx.compose.ui.e g11 = androidx.compose.foundation.layout.x0.g(aVar3, yk.h.o(), yk.h.B());
                aVar2.s(-483455358);
                androidx.compose.ui.layout.l0 a11 = androidx.compose.material.v.a(androidx.compose.foundation.layout.e.h(), aVar2, -1323940314);
                int G = aVar2.G();
                k1.v0 l5 = aVar2.l();
                androidx.compose.ui.node.g.D.getClass();
                ym0.a a12 = g.a.a();
                s1.a c11 = androidx.compose.ui.layout.y.c(g11);
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
                    c11.invoke(k1.j1.a(aVar2), aVar2, 0);
                    aVar2.s(2058660585);
                    nk.a0.g(0, 6, 28, 0L, aVar2, androidx.compose.foundation.layout.x0.j(aVar3, 0.0f, 0.0f, 0.0f, yk.h.a(), 7), null, this.f34662a);
                    aVar2.s(-378961493);
                    for (t0 t0Var : this.f34663b) {
                        t0Var.a().invoke(aVar2, 0);
                    }
                    aVar2.J();
                    aVar2.s(-378961427);
                    String str = this.f34664c;
                    if (str != null) {
                        l.c(null, str, null, false, null, ButtonSize.f33304f, false, this.f34670i, aVar2, 196608, 93);
                    }
                    aVar2.J();
                    r0.d0.a(androidx.compose.foundation.layout.e1.n(androidx.compose.ui.e.f8927a, this.f34665d), aVar2);
                    d0.a(this.f34666e, this.f34667f, this.f34668g, this.f34669h, aVar2, 0);
                    defpackage.d.j(aVar2);
                } else {
                    a3.g.s();
                    throw null;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConsentCard.kt */
    /* loaded from: classes3.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f34671a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List<t0> f34672b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f34673c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f34674d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f34675e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f34676f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f34677g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ boolean f34678h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ long f34679i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ ym0.l<Boolean, nm0.y> f34680j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f34681k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ int f34682l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(String str, List<? extends t0> list, String str2, float f11, ym0.a<nm0.y> aVar, String str3, boolean z5, boolean z11, long j5, ym0.l<? super Boolean, nm0.y> lVar, int i11, int i12) {
            super(2);
            this.f34671a = str;
            this.f34672b = list;
            this.f34673c = str2;
            this.f34674d = f11;
            this.f34675e = aVar;
            this.f34676f = str3;
            this.f34677g = z5;
            this.f34678h = z11;
            this.f34679i = j5;
            this.f34680j = lVar;
            this.f34681k = i11;
            this.f34682l = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f34681k | 1);
            long j5 = this.f34679i;
            ym0.l<Boolean, nm0.y> lVar = this.f34680j;
            s0.a(this.f34671a, this.f34672b, this.f34673c, this.f34674d, this.f34675e, this.f34676f, this.f34677g, this.f34678h, j5, lVar, aVar, g11, this.f34682l);
            return nm0.y.f85009a;
        }
    }

    public static final void a(String title, List<? extends t0> subTitle, String str, float f11, ym0.a<nm0.y> aVar, String consentText, boolean z5, boolean z11, long j5, ym0.l<? super Boolean, nm0.y> onConsentChanged, androidx.compose.runtime.a aVar2, int i11, int i12) {
        String str2;
        float f12;
        a aVar3;
        boolean z12;
        boolean z13;
        long j11;
        int i13;
        kotlin.jvm.internal.u.j(title, "title");
        kotlin.jvm.internal.u.j(subTitle, "subTitle");
        kotlin.jvm.internal.u.j(consentText, "consentText");
        kotlin.jvm.internal.u.j(onConsentChanged, "onConsentChanged");
        androidx.compose.runtime.b g11 = aVar2.g(-2041947953);
        if ((i12 & 4) != 0) {
            str2 = null;
        } else {
            str2 = str;
        }
        if ((i12 & 8) != 0) {
            f12 = yk.h.q();
        } else {
            f12 = f11;
        }
        if ((i12 & 16) != 0) {
            aVar3 = a.f34661a;
        } else {
            aVar3 = aVar;
        }
        if ((i12 & 64) != 0) {
            z12 = false;
        } else {
            z12 = z5;
        }
        if ((i12 & 128) != 0) {
            z13 = true;
        } else {
            z13 = z11;
        }
        if ((i12 & 256) != 0) {
            i13 = i11 & (-234881025);
            j11 = ((androidx.compose.material3.i1) g11.D(androidx.compose.material3.j1.e())).O();
        } else {
            j11 = j5;
            i13 = i11;
        }
        androidx.compose.ui.e e11 = androidx.compose.foundation.layout.e1.e(androidx.compose.ui.e.f8927a, 1.0f);
        x0.a d11 = ((f8) g11.D(g8.a())).d();
        androidx.compose.material3.y0 b10 = androidx.compose.material3.z0.b(j11, g11, (i13 >> 24) & 14);
        g11.s(-213249033);
        float f13 = 0;
        androidx.compose.material3.c1 c11 = androidx.compose.material3.z0.c(f13, f13, f13, f13, f13, f13, g11, 0);
        g11.J();
        long j12 = j11;
        androidx.compose.material3.d1.a(e11, d11, b10, c11, null, s1.b.b(g11, 107617345, new b(title, subTitle, str2, f12, consentText, z13, z12, onConsentChanged, aVar3)), g11, 196614, 16);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new c(title, subTitle, str2, f12, aVar3, consentText, z12, z13, j12, onConsentChanged, i11, i12));
        }
    }
}
