package com.withings.common.compose.component;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.e;
import androidx.compose.material3.a9;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.common.compose.component.text.HeaderStyle;
import com.withings.library.authentication.api.ConstantsWs;
import java.util.List;
import x1.b;
import x1.d;
/* compiled from: SegmentedControl.kt */
/* loaded from: classes3.dex */
public final class d4 {

    /* renamed from: a  reason: collision with root package name */
    private static final float f33672a = 36;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SegmentedControl.kt */
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f33673a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(2);
            this.f33673a = str;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                e.b b10 = androidx.compose.foundation.layout.e.b();
                d.a g11 = b.a.g();
                androidx.compose.ui.e d11 = androidx.compose.foundation.layout.e1.d(androidx.compose.ui.e.f8927a);
                aVar2.s(-483455358);
                androidx.compose.ui.layout.l0 a11 = androidx.compose.foundation.layout.n.a(b10, g11, aVar2);
                aVar2.s(-1323940314);
                int G = aVar2.G();
                k1.v0 l5 = aVar2.l();
                androidx.compose.ui.node.g.D.getClass();
                ym0.a a12 = g.a.a();
                s1.a c11 = androidx.compose.ui.layout.y.c(d11);
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
                    l0.r.c(0, c11, k1.j1.a(aVar2), aVar2, 2058660585);
                    nk.a0.d(null, this.f33673a, HeaderStyle.f34760d, null, ((androidx.compose.material3.i1) aVar2.D(androidx.compose.material3.j1.e())).D(), 1, aVar2, 196992, 9);
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
    /* compiled from: SegmentedControl.kt */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f33674a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f33675b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f33676c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f33677d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, androidx.compose.ui.e eVar, int i11, int i12) {
            super(2);
            this.f33674a = str;
            this.f33675b = eVar;
            this.f33676c = i11;
            this.f33677d = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f33676c | 1);
            d4.a(this.f33674a, this.f33675b, aVar, g11, this.f33677d);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SegmentedControl.kt */
    /* loaded from: classes3.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.l<k3.p, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.l<k3.h, nm0.y> f33678a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f33679b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(ym0.l<? super k3.h, nm0.y> lVar, float f11) {
            super(1);
            this.f33678a = lVar;
            this.f33679b = f11;
        }

        @Override // ym0.l
        public final nm0.y invoke(k3.p pVar) {
            this.f33678a.invoke(k3.h.a(((int) (pVar.e() >> 32)) / this.f33679b));
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SegmentedControl.kt */
    /* loaded from: classes3.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<String> f33680a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f33681b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.l<Integer, nm0.y> f33682c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f33683d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f33684e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f33685f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ d2.r1 f33686g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ d2.r1 f33687h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ float f33688i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ boolean f33689j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f33690k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ int f33691l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f33692m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ int f33693n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(List<String> list, int i11, ym0.l<? super Integer, nm0.y> lVar, androidx.compose.ui.e eVar, long j5, long j11, d2.r1 r1Var, d2.r1 r1Var2, float f11, boolean z5, int i12, int i13, int i14, int i15) {
            super(2);
            this.f33680a = list;
            this.f33681b = i11;
            this.f33682c = lVar;
            this.f33683d = eVar;
            this.f33684e = j5;
            this.f33685f = j11;
            this.f33686g = r1Var;
            this.f33687h = r1Var2;
            this.f33688i = f11;
            this.f33689j = z5;
            this.f33690k = i12;
            this.f33691l = i13;
            this.f33692m = i14;
            this.f33693n = i15;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f33691l | 1);
            int g12 = ah.o.g(this.f33692m);
            boolean z5 = this.f33689j;
            int i11 = this.f33690k;
            d4.b(this.f33680a, this.f33681b, this.f33682c, this.f33683d, this.f33684e, this.f33685f, this.f33686g, this.f33687h, this.f33688i, z5, i11, aVar, g11, g12, this.f33693n);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SegmentedControl.kt */
    /* loaded from: classes3.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d2.r1 f33694a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f33695b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f33696c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List<String> f33697d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ float f33698e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f33699f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ym0.l<Integer, nm0.y> f33700g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(d2.r1 r1Var, long j5, float f11, List<String> list, float f12, int i11, ym0.l<? super Integer, nm0.y> lVar) {
            super(2);
            this.f33694a = r1Var;
            this.f33695b = j5;
            this.f33696c = f11;
            this.f33697d = list;
            this.f33698e = f12;
            this.f33699f = i11;
            this.f33700g = lVar;
        }

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
                    float f11 = this.f33696c;
                    androidx.compose.ui.e f12 = androidx.compose.foundation.layout.x0.f(aVar3, f11);
                    List<String> list = this.f33697d;
                    d4.d(0, 0, this.f33695b, aVar2, androidx.compose.foundation.layout.t0.a(androidx.compose.foundation.layout.e1.c(androidx.compose.foundation.layout.e1.e(f12, 1.0f / list.size()), 1.0f), this.f33698e, 0), this.f33694a);
                    d4.f(this.f33699f, 8, 0, aVar2, androidx.compose.foundation.layout.x0.f(aVar3, f11), list, this.f33700g);
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
    /* compiled from: SegmentedControl.kt */
    /* loaded from: classes3.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<String> f33701a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f33702b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.l<Integer, nm0.y> f33703c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f33704d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f33705e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ d2.r1 f33706f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ d2.r1 f33707g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ float f33708h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f33709i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f33710j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f33711k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ int f33712l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f33713m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ int f33714n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(List<String> list, float f11, ym0.l<? super Integer, nm0.y> lVar, long j5, long j11, d2.r1 r1Var, d2.r1 r1Var2, float f12, boolean z5, int i11, androidx.compose.ui.e eVar, int i12, int i13, int i14) {
            super(2);
            this.f33701a = list;
            this.f33702b = f11;
            this.f33703c = lVar;
            this.f33704d = j5;
            this.f33705e = j11;
            this.f33706f = r1Var;
            this.f33707g = r1Var2;
            this.f33708h = f12;
            this.f33709i = z5;
            this.f33710j = i11;
            this.f33711k = eVar;
            this.f33712l = i12;
            this.f33713m = i13;
            this.f33714n = i14;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f33712l | 1);
            int g12 = ah.o.g(this.f33713m);
            int i11 = this.f33710j;
            androidx.compose.ui.e eVar = this.f33711k;
            d4.c(this.f33701a, this.f33702b, this.f33703c, this.f33704d, this.f33705e, this.f33706f, this.f33707g, this.f33708h, this.f33709i, i11, eVar, aVar, g11, g12, this.f33714n);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.String r18, androidx.compose.ui.e r19, androidx.compose.runtime.a r20, int r21, int r22) {
        /*
            r0 = r18
            r1 = r21
            r2 = r22
            r3 = 886915248(0x34dd40b0, float:4.1211524E-7)
            r4 = r20
            androidx.compose.runtime.b r3 = r4.g(r3)
            r4 = r2 & 1
            if (r4 == 0) goto L16
            r4 = r1 | 6
            goto L26
        L16:
            r4 = r1 & 14
            if (r4 != 0) goto L25
            boolean r4 = r3.K(r0)
            if (r4 == 0) goto L22
            r4 = 4
            goto L23
        L22:
            r4 = 2
        L23:
            r4 = r4 | r1
            goto L26
        L25:
            r4 = r1
        L26:
            r5 = r2 & 2
            if (r5 == 0) goto L2f
            r4 = r4 | 48
        L2c:
            r6 = r19
            goto L41
        L2f:
            r6 = r1 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L2c
            r6 = r19
            boolean r7 = r3.K(r6)
            if (r7 == 0) goto L3e
            r7 = 32
            goto L40
        L3e:
            r7 = 16
        L40:
            r4 = r4 | r7
        L41:
            r7 = r4 & 91
            r8 = 18
            if (r7 != r8) goto L52
            boolean r7 = r3.h()
            if (r7 != 0) goto L4e
            goto L52
        L4e:
            r3.C()
            goto L91
        L52:
            if (r5 == 0) goto L59
            androidx.compose.ui.e$a r5 = androidx.compose.ui.e.f8927a
            r17 = r5
            goto L5b
        L59:
            r17 = r6
        L5b:
            long r6 = d2.f0.g()
            k1.p1 r5 = androidx.compose.material3.g8.a()
            java.lang.Object r5 = r3.D(r5)
            androidx.compose.material3.f8 r5 = (androidx.compose.material3.f8) r5
            x0.a r5 = r5.d()
            com.withings.common.compose.component.d4$a r8 = new com.withings.common.compose.component.d4$a
            r8.<init>(r0)
            r9 = -488565963(0xffffffffe2e11335, float:-2.0759507E21)
            s1.a r13 = s1.b.b(r3, r9, r8)
            int r4 = r4 >> 3
            r4 = r4 & 14
            r8 = 12583296(0xc00180, float:1.7632953E-38)
            r15 = r4 | r8
            r11 = 0
            r12 = 0
            r8 = 0
            r10 = 0
            r16 = 120(0x78, float:1.68E-43)
            r4 = r17
            r14 = r3
            androidx.compose.material3.a9.a(r4, r5, r6, r8, r10, r11, r12, r13, r14, r15, r16)
            r6 = r17
        L91:
            androidx.compose.runtime.v r3 = r3.o0()
            if (r3 == 0) goto L9f
            com.withings.common.compose.component.d4$b r4 = new com.withings.common.compose.component.d4$b
            r4.<init>(r0, r6, r1, r2)
            r3.G(r4)
        L9f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.common.compose.component.d4.a(java.lang.String, androidx.compose.ui.e, androidx.compose.runtime.a, int, int):void");
    }

    public static final void b(List<String> items, int i11, ym0.l<? super Integer, nm0.y> onItemSelectedIndex, androidx.compose.ui.e eVar, long j5, long j11, d2.r1 r1Var, d2.r1 r1Var2, float f11, boolean z5, int i12, androidx.compose.runtime.a aVar, int i13, int i14, int i15) {
        androidx.compose.ui.e eVar2;
        long j12;
        int i16;
        long j13;
        x0.g gVar;
        x0.g gVar2;
        float f12;
        boolean z11;
        int i17;
        boolean z12;
        kotlin.jvm.internal.u.j(items, "items");
        kotlin.jvm.internal.u.j(onItemSelectedIndex, "onItemSelectedIndex");
        androidx.compose.runtime.b g11 = aVar.g(-1074811106);
        if ((i15 & 8) != 0) {
            eVar2 = androidx.compose.ui.e.f8927a;
        } else {
            eVar2 = eVar;
        }
        if ((i15 & 16) != 0) {
            g11.J();
            j12 = ((yk.w) androidx.appcompat.app.h.b(g11, 615317871)).c().f();
            i16 = i13 & (-57345);
        } else {
            j12 = j5;
            i16 = i13;
        }
        if ((i15 & 32) != 0) {
            g11.J();
            j13 = ((yk.w) androidx.appcompat.app.h.b(g11, 615317871)).h().b();
            i16 &= -458753;
        } else {
            j13 = j11;
        }
        int i18 = i15 & 64;
        float f13 = f33672a;
        if (i18 != 0) {
            i16 &= -3670017;
            gVar = x0.h.b(f13 / 3);
        } else {
            gVar = r1Var;
        }
        if ((i15 & 128) != 0) {
            i16 &= -29360129;
            gVar2 = x0.h.b(f13 / 4);
        } else {
            gVar2 = r1Var2;
        }
        if ((i15 & 256) != 0) {
            f12 = yk.h.a();
        } else {
            f12 = f11;
        }
        if ((i15 & 512) != 0) {
            if (items.size() >= 4) {
                z12 = true;
            } else {
                z12 = false;
            }
            i16 &= -1879048193;
            z11 = z12;
        } else {
            z11 = z5;
        }
        if ((i15 & 1024) != 0) {
            i17 = 3;
        } else {
            i17 = i12;
        }
        if (i11 >= 0 && i11 <= kotlin.collections.x.M(items)) {
            g11.s(-1115485675);
            Object t11 = g11.t();
            if (t11 == a.C0060a.a()) {
                t11 = androidx.compose.runtime.l0.f(k3.h.a(2 * f12), androidx.compose.runtime.v0.f8878a);
                g11.n(t11);
            }
            k1.r0 r0Var = (k1.r0) t11;
            g11.J();
            float e11 = ((k3.h) r0Var.C()).e();
            ym0.l p11 = r0Var.p();
            k1.o1 a11 = m0.f.a(((e11 - (2 * f12)) * i11) / items.size(), m0.k.c(0.75f, 0.0f, null, 6), g11, 48, 12);
            float density = ((k3.d) g11.D(androidx.compose.ui.platform.n1.e())).getDensity();
            float e12 = ((k3.h) a11.getValue()).e();
            g11.s(-1115484860);
            boolean K = g11.K(p11) | g11.b(density);
            Object t12 = g11.t();
            if (K || t12 == a.C0060a.a()) {
                t12 = new c(p11, density);
                g11.n(t12);
            }
            g11.J();
            int i19 = i16 >> 3;
            c(items, e12, onItemSelectedIndex, j12, j13, gVar, gVar2, f12, z11, i17, androidx.compose.ui.layout.a1.a(eVar2, (ym0.l) t12), g11, (i16 & ConstantsWs.HWFAILURE_ZERO) | 8 | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (3670016 & i19) | (29360128 & i19) | (i19 & 234881024) | ((i14 << 27) & 1879048192), 0, 0);
            androidx.compose.runtime.v o02 = g11.o0();
            if (o02 != null) {
                o02.G(new d(items, i11, onItemSelectedIndex, eVar2, j12, j13, gVar, gVar2, f12, z11, i17, i13, i14, i15));
                return;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(List<String> list, float f11, ym0.l<? super Integer, nm0.y> lVar, long j5, long j11, d2.r1 r1Var, d2.r1 r1Var2, float f12, boolean z5, int i11, androidx.compose.ui.e eVar, androidx.compose.runtime.a aVar, int i12, int i13, int i14) {
        e.a aVar2;
        int i15;
        androidx.compose.runtime.b g11 = aVar.g(1944915745);
        if ((i14 & 1024) != 0) {
            aVar2 = androidx.compose.ui.e.f8927a;
        } else {
            aVar2 = eVar;
        }
        if (z5) {
            i15 = i11;
        } else {
            i15 = Integer.MAX_VALUE;
        }
        a9.a(androidx.compose.foundation.layout.e1.f(androidx.compose.foundation.layout.e1.e(aVar2, 1.0f), f33672a), r1Var, j5, 0L, 0.0f, 0.0f, null, s1.b.b(g11, 1924994790, new e(r1Var2, j11, f12, list, f11, i15, lVar)), g11, ((i12 >> 12) & 112) | 12582912 | ((i12 >> 3) & ConstantsWs.HWFAILURE_ZERO), 120);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new f(list, f11, lVar, j5, j11, r1Var, r1Var2, f12, z5, i11, aVar2, i12, i13, i14));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(int r19, int r20, long r21, androidx.compose.runtime.a r23, androidx.compose.ui.e r24, d2.r1 r25) {
        /*
            r1 = r19
            r0 = 138683124(0x84422f4, float:5.902269E-34)
            r2 = r23
            androidx.compose.runtime.b r0 = r2.g(r0)
            r2 = r20 & 1
            if (r2 == 0) goto L14
            r2 = r1 | 6
            r15 = r25
            goto L26
        L14:
            r2 = r1 & 14
            r15 = r25
            if (r2 != 0) goto L25
            boolean r2 = r0.K(r15)
            if (r2 == 0) goto L22
            r2 = 4
            goto L23
        L22:
            r2 = 2
        L23:
            r2 = r2 | r1
            goto L26
        L25:
            r2 = r1
        L26:
            r3 = r20 & 2
            if (r3 == 0) goto L2f
            r2 = r2 | 48
            r13 = r21
            goto L41
        L2f:
            r3 = r1 & 112(0x70, float:1.57E-43)
            r13 = r21
            if (r3 != 0) goto L41
            boolean r3 = r0.d(r13)
            if (r3 == 0) goto L3e
            r3 = 32
            goto L40
        L3e:
            r3 = 16
        L40:
            r2 = r2 | r3
        L41:
            r3 = r20 & 4
            if (r3 == 0) goto L4a
            r2 = r2 | 384(0x180, float:5.38E-43)
        L47:
            r4 = r24
            goto L5c
        L4a:
            r4 = r1 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L47
            r4 = r24
            boolean r5 = r0.K(r4)
            if (r5 == 0) goto L59
            r5 = 256(0x100, float:3.59E-43)
            goto L5b
        L59:
            r5 = 128(0x80, float:1.794E-43)
        L5b:
            r2 = r2 | r5
        L5c:
            r5 = r2 & 731(0x2db, float:1.024E-42)
            r6 = 146(0x92, float:2.05E-43)
            if (r5 != r6) goto L6e
            boolean r5 = r0.h()
            if (r5 != 0) goto L69
            goto L6e
        L69:
            r0.C()
            r5 = r4
            goto La0
        L6e:
            if (r3 == 0) goto L75
            androidx.compose.ui.e$a r3 = androidx.compose.ui.e.f8927a
            r16 = r3
            goto L77
        L75:
            r16 = r4
        L77:
            s1.a r11 = com.withings.common.compose.component.p0.f34505a
            int r3 = r2 >> 6
            r3 = r3 & 14
            r4 = 12582912(0xc00000, float:1.7632415E-38)
            r3 = r3 | r4
            int r2 = r2 << 3
            r4 = r2 & 112(0x70, float:1.57E-43)
            r3 = r3 | r4
            r2 = r2 & 896(0x380, float:1.256E-42)
            r17 = r3 | r2
            r8 = 0
            r18 = 120(0x78, float:1.68E-43)
            r6 = 0
            r9 = 0
            r10 = 0
            r2 = r16
            r3 = r25
            r4 = r21
            r12 = r0
            r13 = r17
            r14 = r18
            androidx.compose.material3.a9.a(r2, r3, r4, r6, r8, r9, r10, r11, r12, r13, r14)
            r5 = r16
        La0:
            androidx.compose.runtime.v r7 = r0.o0()
            if (r7 == 0) goto Lb7
            com.withings.common.compose.component.c4 r8 = new com.withings.common.compose.component.c4
            r0 = r8
            r1 = r19
            r2 = r20
            r3 = r21
            r6 = r25
            r0.<init>(r1, r2, r3, r5, r6)
            r7.G(r8)
        Lb7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.common.compose.component.d4.d(int, int, long, androidx.compose.runtime.a, androidx.compose.ui.e, d2.r1):void");
    }

    public static final void f(int i11, int i12, int i13, androidx.compose.runtime.a aVar, androidx.compose.ui.e eVar, List list, ym0.l lVar) {
        e.a aVar2;
        androidx.compose.runtime.b g11 = aVar.g(1376125105);
        if ((i13 & 8) != 0) {
            aVar2 = androidx.compose.ui.e.f8927a;
        } else {
            aVar2 = eVar;
        }
        androidx.compose.ui.layout.l0 b10 = androidx.compose.material3.j5.b(g11, 693286680, b.a.i(), g11, -1323940314);
        int G = g11.G();
        k1.v0 l5 = g11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a11 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(aVar2);
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
            g11.s(-174365136);
            int i14 = 0;
            for (Object obj : list) {
                int i15 = i14 + 1;
                if (i14 >= 0) {
                    String d02 = dp0.j.d0(i11, (String) obj);
                    e.a aVar3 = androidx.compose.ui.e.f8927a;
                    if (1.0f > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                        boolean z5 = true;
                        androidx.compose.ui.e c12 = androidx.compose.foundation.layout.e1.c(new LayoutWeightElement(en0.r.f(1.0f, Float.MAX_VALUE), true), 1.0f);
                        g11.s(-623888567);
                        Object t11 = g11.t();
                        if (t11 == a.C0060a.a()) {
                            t11 = q0.n.a();
                            g11.n(t11);
                        }
                        q0.o oVar = (q0.o) t11;
                        g11.J();
                        g11.s(-623888492);
                        if ((((i12 & ConstantsWs.HWFAILURE_ZERO) ^ ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED) <= 256 || !g11.K(lVar)) && (i12 & ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED) != 256) {
                            z5 = false;
                        }
                        boolean c13 = g11.c(i14) | z5;
                        Object t12 = g11.t();
                        if (c13 || t12 == a.C0060a.a()) {
                            t12 = new e4(i14, lVar);
                            g11.n(t12);
                        }
                        g11.J();
                        a(d02, androidx.compose.foundation.h.a(c12, oVar, null, false, null, (ym0.a) t12, 28), g11, 0, 0);
                        i14 = i15;
                    } else {
                        throw new IllegalArgumentException(defpackage.b.b("invalid weight ", 1.0f, "; must be greater than zero").toString());
                    }
                } else {
                    kotlin.collections.x.K0();
                    throw null;
                }
            }
            androidx.compose.runtime.v a12 = com.withings.authentication.mfa.resolve.components.h.a(g11);
            if (a12 != null) {
                a12.G(new f4(i11, i12, i13, aVar2, list, lVar));
                return;
            }
            return;
        }
        a3.g.s();
        throw null;
    }
}
