package com.withings.common.compose.component;

import android.content.Context;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.material3.s7;
import androidx.compose.material3.t7;
import androidx.compose.material3.u7;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.library.authentication.api.ConstantsWs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import x1.b;
/* compiled from: RadioGroup.kt */
/* loaded from: classes3.dex */
public final class d3 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RadioGroup.kt */
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.l<Integer, nm0.y> f33644a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e0 f33645b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ym0.l<? super Integer, nm0.y> lVar, e0 e0Var) {
            super(0);
            this.f33644a = lVar;
            this.f33645b = e0Var;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            this.f33644a.invoke(Integer.valueOf(this.f33645b.c()));
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RadioGroup.kt */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f33646a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List<e0> f33647b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Integer f33648c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f33649d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f33650e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ym0.r<String, d2.f0, androidx.compose.runtime.a, Integer, nm0.y> f33651f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ym0.l<Integer, nm0.y> f33652g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f33653h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f33654i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(androidx.compose.ui.e eVar, List<e0> list, Integer num, boolean z5, long j5, ym0.r<? super String, ? super d2.f0, ? super androidx.compose.runtime.a, ? super Integer, nm0.y> rVar, ym0.l<? super Integer, nm0.y> lVar, int i11, int i12) {
            super(2);
            this.f33646a = eVar;
            this.f33647b = list;
            this.f33648c = num;
            this.f33649d = z5;
            this.f33650e = j5;
            this.f33651f = rVar;
            this.f33652g = lVar;
            this.f33653h = i11;
            this.f33654i = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f33653h | 1);
            ym0.r<String, d2.f0, androidx.compose.runtime.a, Integer, nm0.y> rVar = this.f33651f;
            ym0.l<Integer, nm0.y> lVar = this.f33652g;
            d3.a(this.f33646a, this.f33647b, this.f33648c, this.f33649d, this.f33650e, rVar, lVar, aVar, g11, this.f33654i);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RadioGroup.kt */
    /* loaded from: classes3.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f33655a = new kotlin.jvm.internal.w(0);

        @Override // ym0.a
        public final /* bridge */ /* synthetic */ nm0.y invoke() {
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RadioGroup.kt */
    /* loaded from: classes3.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.l<Boolean, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.l<Integer, nm0.y> f33656a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e0 f33657b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(ym0.l<? super Integer, nm0.y> lVar, e0 e0Var) {
            super(1);
            this.f33656a = lVar;
            this.f33657b = e0Var;
        }

        @Override // ym0.l
        public final nm0.y invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            Integer valueOf = Integer.valueOf(this.f33657b.c());
            if (!booleanValue) {
                valueOf = null;
            }
            this.f33656a.invoke(valueOf);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RadioGroup.kt */
    /* loaded from: classes3.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.q<r0.a0, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e0 f33658a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(e0 e0Var) {
            super(3);
            this.f33658a = e0Var;
        }

        @Override // ym0.q
        public final nm0.y invoke(r0.a0 a0Var, androidx.compose.runtime.a aVar, Integer num) {
            r0.a0 LabelRadioCell = a0Var;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(LabelRadioCell, "$this$LabelRadioCell");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                e0 e0Var = this.f33658a;
                String b10 = e0Var.b();
                Integer a11 = e0Var.a();
                if (b10 != null && a11 != null) {
                    n1.d(b10, s2.b.a(a11.intValue(), aVar2), null, aVar2, 0, 4);
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RadioGroup.kt */
    /* loaded from: classes3.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f33659a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List<e0> f33660b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.l<Integer, nm0.y> f33661c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Integer f33662d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f33663e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f33664f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(androidx.compose.ui.e eVar, List<e0> list, ym0.l<? super Integer, nm0.y> lVar, Integer num, int i11, int i12) {
            super(2);
            this.f33659a = eVar;
            this.f33660b = list;
            this.f33661c = lVar;
            this.f33662d = num;
            this.f33663e = i11;
            this.f33664f = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f33663e | 1);
            ym0.l<Integer, nm0.y> lVar = this.f33661c;
            Integer num2 = this.f33662d;
            d3.b(this.f33659a, this.f33660b, lVar, num2, aVar, g11, this.f33664f);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RadioGroup.kt */
    /* loaded from: classes3.dex */
    public static final class g extends kotlin.jvm.internal.w implements ym0.l<Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.l<Integer, nm0.y> f33665a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List<l70.u> f33666b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(ym0.l<? super Integer, nm0.y> lVar, List<? extends l70.u> list) {
            super(1);
            this.f33665a = lVar;
            this.f33666b = list;
        }

        @Override // ym0.l
        public final nm0.y invoke(Integer num) {
            this.f33665a.invoke(Integer.valueOf(this.f33666b.get(num.intValue()).j()));
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RadioGroup.kt */
    /* loaded from: classes3.dex */
    public static final class h extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<l70.u> f33667a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Integer f33668b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.l<Integer, nm0.y> f33669c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f33670d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f33671e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(List<? extends l70.u> list, Integer num, ym0.l<? super Integer, nm0.y> lVar, int i11, int i12) {
            super(2);
            this.f33667a = list;
            this.f33668b = num;
            this.f33669c = lVar;
            this.f33670d = i11;
            this.f33671e = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f33670d | 1);
            Integer num2 = this.f33668b;
            ym0.l<Integer, nm0.y> lVar = this.f33669c;
            d3.c(this.f33667a, num2, lVar, aVar, g11, this.f33671e);
            return nm0.y.f85009a;
        }
    }

    public static final void a(androidx.compose.ui.e eVar, List<e0> options, Integer num, boolean z5, long j5, ym0.r<? super String, ? super d2.f0, ? super androidx.compose.runtime.a, ? super Integer, nm0.y> rVar, ym0.l<? super Integer, nm0.y> onSelectionChange, androidx.compose.runtime.a aVar, int i11, int i12) {
        androidx.compose.ui.e eVar2;
        Integer num2;
        boolean z11;
        long j11;
        int i13;
        s1.a aVar2;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        kotlin.jvm.internal.u.j(options, "options");
        kotlin.jvm.internal.u.j(onSelectionChange, "onSelectionChange");
        androidx.compose.runtime.b g11 = aVar.g(1713338138);
        if ((i12 & 1) != 0) {
            eVar2 = androidx.compose.ui.e.f8927a;
        } else {
            eVar2 = eVar;
        }
        if ((i12 & 4) != 0) {
            num2 = null;
        } else {
            num2 = num;
        }
        if ((i12 & 8) != 0) {
            z11 = true;
        } else {
            z11 = z5;
        }
        if ((i12 & 16) != 0) {
            i13 = i11 & (-57345);
            j11 = ((d2.f0) g11.D(yk.f.b())).t();
        } else {
            j11 = j5;
            i13 = i11;
        }
        if ((i12 & 32) != 0) {
            aVar2 = n0.f34104a;
        } else {
            aVar2 = rVar;
        }
        g11.s(-483455358);
        androidx.compose.ui.layout.l0 b10 = android.support.v4.media.session.c.b(androidx.compose.foundation.layout.e.h(), g11, -1323940314);
        int G = g11.G();
        k1.v0 l5 = g11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a11 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(eVar2);
        if (g11.i() instanceof k1.d) {
            g11.A();
            if (g11.e()) {
                g11.F(a11);
            } else {
                g11.m();
            }
            ym0.p b11 = com.withings.authentication.e.b(g11, b10, g11, l5);
            if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                androidx.camera.camera2.internal.l0.d(G, g11, G, b11);
            }
            dq.x.b(0, c11, k1.j1.a(g11), g11, 2058660585);
            g11.s(20133857);
            Iterator it = options.iterator();
            int i14 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i15 = i14 + 1;
                if (i14 >= 0) {
                    e0 e0Var = (e0) next;
                    e.a aVar3 = androidx.compose.ui.e.f8927a;
                    androidx.compose.ui.e e11 = androidx.compose.foundation.layout.e1.e(aVar3, 1.0f);
                    int c12 = e0Var.c();
                    if (num2 != null && c12 == num2.intValue()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    t2.i a12 = t2.i.a(3);
                    g11.s(-520457824);
                    if ((((i11 & 3670016) ^ 1572864) > 1048576 && g11.K(onSelectionChange)) || (i11 & 1572864) == 1048576) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean K = z13 | g11.K(e0Var);
                    Object t11 = g11.t();
                    if (K || t11 == a.C0060a.a()) {
                        t11 = new a(onSelectionChange, e0Var);
                        g11.n(t11);
                    }
                    g11.J();
                    androidx.compose.ui.e g12 = androidx.compose.foundation.layout.x0.g(w0.c.b(e11, z12, a12, (ym0.a) t11), yk.h.o(), yk.h.d());
                    androidx.compose.ui.layout.l0 b12 = androidx.compose.material3.j5.b(g11, 693286680, b.a.i(), g11, -1323940314);
                    int G2 = g11.G();
                    k1.v0 l6 = g11.l();
                    androidx.compose.ui.node.g.D.getClass();
                    ym0.a a13 = g.a.a();
                    s1.a c13 = androidx.compose.ui.layout.y.c(g12);
                    Iterator it2 = it;
                    if (g11.i() instanceof k1.d) {
                        g11.A();
                        if (g11.e()) {
                            g11.F(a13);
                        } else {
                            g11.m();
                        }
                        ym0.p b13 = com.withings.authentication.e.b(g11, b12, g11, l6);
                        if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G2))) {
                            androidx.camera.camera2.internal.l0.d(G2, g11, G2, b13);
                        }
                        c13.invoke(k1.j1.a(g11), g11, 0);
                        g11.s(2058660585);
                        int i16 = i14;
                        s7 a14 = t7.a(((androidx.compose.material3.i1) g11.D(androidx.compose.material3.j1.e())).J(), 0L, g11, 14);
                        int c14 = e0Var.c();
                        if (num2 != null && c14 == num2.intValue()) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        ym0.r<? super String, ? super d2.f0, ? super androidx.compose.runtime.a, ? super Integer, nm0.y> rVar2 = aVar2;
                        u7.a(z14, null, null, false, a14, null, g11, 48, 44);
                        r0.d0.a(androidx.compose.foundation.layout.e1.n(aVar3, yk.h.o()), g11);
                        if (1.0f > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(en0.r.f(1.0f, Float.MAX_VALUE), true);
                            g11.s(-483455358);
                            androidx.compose.ui.layout.l0 b14 = android.support.v4.media.session.c.b(androidx.compose.foundation.layout.e.h(), g11, -1323940314);
                            int G3 = g11.G();
                            k1.v0 l11 = g11.l();
                            ym0.a a15 = g.a.a();
                            s1.a c15 = androidx.compose.ui.layout.y.c(layoutWeightElement);
                            if (g11.i() instanceof k1.d) {
                                g11.A();
                                if (g11.e()) {
                                    g11.F(a15);
                                } else {
                                    g11.m();
                                }
                                ym0.p b15 = com.withings.authentication.e.b(g11, b14, g11, l11);
                                if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G3))) {
                                    androidx.camera.camera2.internal.l0.d(G3, g11, G3, b15);
                                }
                                dq.x.b(0, c15, k1.j1.a(g11), g11, 2058660585);
                                int i17 = i13 >> 9;
                                rVar2.invoke(e0Var.e(), d2.f0.j(j11), g11, Integer.valueOf((i17 & ConstantsWs.HWFAILURE_ZERO) | (i17 & 112)));
                                String d11 = e0Var.d();
                                g11.s(909366059);
                                if (d11 == null) {
                                    z15 = true;
                                    z16 = true;
                                } else {
                                    z15 = true;
                                    z16 = true;
                                    nk.a.g(0, 0, 0, 57, ((d2.f0) g11.D(yk.f.c())).t(), g11, null, null, d11);
                                    nm0.y yVar = nm0.y.f85009a;
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
                                g11.s(1614130691);
                                if (z11 && i16 != kotlin.collections.x.M(options)) {
                                    z17 = false;
                                    v0.b(yk.h.o(), g11, 6, 0);
                                } else {
                                    z17 = false;
                                }
                                g11.J();
                                aVar2 = rVar2;
                                i14 = i15;
                                it = it2;
                            } else {
                                a3.g.s();
                                throw null;
                            }
                        } else {
                            throw new IllegalArgumentException(defpackage.b.b("invalid weight ", 1.0f, "; must be greater than zero").toString());
                        }
                    } else {
                        a3.g.s();
                        throw null;
                    }
                } else {
                    kotlin.collections.x.K0();
                    throw null;
                }
            }
            ym0.r<? super String, ? super d2.f0, ? super androidx.compose.runtime.a, ? super Integer, nm0.y> rVar3 = aVar2;
            androidx.compose.runtime.v a16 = com.withings.authentication.mfa.resolve.components.h.a(g11);
            if (a16 != null) {
                a16.G(new b(eVar2, options, num2, z11, j11, rVar3, onSelectionChange, i11, i12));
                return;
            }
            return;
        }
        a3.g.s();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(androidx.compose.ui.e eVar, List<e0> options, ym0.l<? super Integer, nm0.y> onSelectionChange, Integer num, androidx.compose.runtime.a aVar, int i11, int i12) {
        androidx.compose.ui.e eVar2;
        Integer num2;
        boolean z5;
        int i13;
        int i14;
        int i15;
        kotlin.jvm.internal.u.j(options, "options");
        kotlin.jvm.internal.u.j(onSelectionChange, "onSelectionChange");
        androidx.compose.runtime.b g11 = aVar.g(418748902);
        if ((i12 & 1) != 0) {
            eVar2 = androidx.compose.ui.e.f8927a;
        } else {
            eVar2 = eVar;
        }
        if ((i12 & 8) != 0) {
            num2 = null;
        } else {
            num2 = num;
        }
        g11.s(-483455358);
        int i16 = -1323940314;
        androidx.compose.ui.layout.l0 b10 = android.support.v4.media.session.c.b(androidx.compose.foundation.layout.e.h(), g11, -1323940314);
        int G = g11.G();
        k1.v0 l5 = g11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a11 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(eVar2);
        if (g11.i() instanceof k1.d) {
            g11.A();
            if (g11.e()) {
                g11.F(a11);
            } else {
                g11.m();
            }
            ym0.p b11 = com.withings.authentication.e.b(g11, b10, g11, l5);
            if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                androidx.camera.camera2.internal.l0.d(G, g11, G, b11);
            }
            int i17 = 0;
            dq.x.b(0, c11, k1.j1.a(g11), g11, 2058660585);
            g11.s(-305551668);
            int i18 = 0;
            for (Object obj : options) {
                int i19 = i18 + 1;
                if (i18 >= 0) {
                    e0 e0Var = (e0) obj;
                    e.a aVar2 = androidx.compose.ui.e.f8927a;
                    androidx.compose.ui.e e11 = androidx.compose.foundation.layout.e1.e(aVar2, 1.0f);
                    int c12 = e0Var.c();
                    if (num2 != null && c12 == num2.intValue()) {
                        z5 = 1;
                    } else {
                        z5 = i17;
                    }
                    androidx.compose.ui.e b12 = w0.c.b(e11, z5, t2.i.a(3), c.f33655a);
                    androidx.compose.ui.layout.l0 b13 = androidx.compose.material3.j5.b(g11, 693286680, b.a.i(), g11, i16);
                    int G2 = g11.G();
                    k1.v0 l6 = g11.l();
                    androidx.compose.ui.node.g.D.getClass();
                    ym0.a a12 = g.a.a();
                    s1.a c13 = androidx.compose.ui.layout.y.c(b12);
                    if (g11.i() instanceof k1.d) {
                        g11.A();
                        if (g11.e()) {
                            g11.F(a12);
                        } else {
                            g11.m();
                        }
                        ym0.p b14 = com.withings.authentication.e.b(g11, b13, g11, l6);
                        if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G2))) {
                            androidx.camera.camera2.internal.l0.d(G2, g11, G2, b14);
                        }
                        androidx.compose.ui.e g12 = androidx.compose.foundation.layout.x0.g(aVar2, og.y.a(i17, c13, k1.j1.a(g11), g11, 2058660585), yk.h.b());
                        int c14 = e0Var.c();
                        if (num2 != null && c14 == num2.intValue()) {
                            i13 = 1;
                        } else {
                            i13 = i17;
                        }
                        String e12 = e0Var.e();
                        String d11 = e0Var.d();
                        g11.s(1309817464);
                        if ((((i11 & ConstantsWs.HWFAILURE_ZERO) ^ ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED) > 256 && g11.K(onSelectionChange)) || (i11 & ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED) == 256) {
                            i14 = 1;
                        } else {
                            i14 = i17;
                        }
                        int K = i14 | g11.K(e0Var);
                        Object t11 = g11.t();
                        if (K != 0 || t11 == a.C0060a.a()) {
                            t11 = new d(onSelectionChange, e0Var);
                            g11.n(t11);
                        }
                        g11.J();
                        int i21 = i18;
                        o.k(i13, e12, g12, false, d11, false, (ym0.l) t11, s1.b.b(g11, -1785468179, new e(e0Var)), false, g11, 12583296, ConstantsWs.WS_STATUS_TOOMANYPUBLICKEYS);
                        g11.J();
                        g11.o();
                        g11.J();
                        g11.J();
                        g11.s(-816139913);
                        if (i21 != kotlin.collections.x.M(options)) {
                            i15 = 0;
                            v0.b(0.0f, g11, 0, 1);
                        } else {
                            i15 = 0;
                        }
                        g11.J();
                        i17 = i15;
                        i18 = i19;
                        i16 = -1323940314;
                    } else {
                        a3.g.s();
                        throw null;
                    }
                } else {
                    kotlin.collections.x.K0();
                    throw null;
                }
            }
            androidx.compose.runtime.v a13 = com.withings.authentication.mfa.resolve.components.h.a(g11);
            if (a13 != null) {
                a13.G(new f(eVar2, options, onSelectionChange, num2, i11, i12));
                return;
            }
            return;
        }
        a3.g.s();
        throw null;
    }

    public static final void c(List<? extends l70.u> units, Integer num, ym0.l<? super Integer, nm0.y> onUnitChange, androidx.compose.runtime.a aVar, int i11, int i12) {
        Integer num2;
        kotlin.jvm.internal.u.j(units, "units");
        kotlin.jvm.internal.u.j(onUnitChange, "onUnitChange");
        androidx.compose.runtime.b g11 = aVar.g(-1290194915);
        Object obj = null;
        if ((i12 & 2) != 0) {
            num2 = null;
        } else {
            num2 = num;
        }
        Context context = (Context) g11.D(androidx.compose.ui.platform.u0.d());
        List<? extends l70.u> list = units;
        ArrayList arrayList = new ArrayList(kotlin.collections.x.y(list, 10));
        for (l70.u uVar : list) {
            arrayList.add(uVar.i(context));
        }
        ArrayList d11 = d(arrayList);
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int j5 = ((l70.u) next).j();
            if (num2 != null && j5 == num2.intValue()) {
                obj = next;
                break;
            }
        }
        a(null, d11, Integer.valueOf(units.indexOf(obj)), false, 0L, null, new g(onUnitChange, units), g11, 64, 57);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new h(units, num2, onUnitChange, i11, i12));
        }
    }

    public static final ArrayList d(List list) {
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(kotlin.collections.x.y(list2, 10));
        for (String str : list2) {
            arrayList.add(new e0(str, null, list.indexOf(str), null, null, 26));
        }
        return arrayList;
    }
}
