package com.withings.common.compose.component;

import android.content.Context;
import androidx.compose.foundation.layout.e;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import com.withings.common.compose.component.Status;
import com.withings.wiscale2.C1987R;
import d2.g0;
import java.util.List;
import x1.b;
/* compiled from: StatusHeader.kt */
/* loaded from: classes3.dex */
public final class n4 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StatusHeader.kt */
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.l<Context, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f34186a = new kotlin.jvm.internal.w(1);

        @Override // ym0.l
        public final nm0.y invoke(Context context) {
            Context it = context;
            kotlin.jvm.internal.u.j(it, "it");
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StatusHeader.kt */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f34187a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f34188b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f34189c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List<ym0.q<p4, androidx.compose.runtime.a, Integer, nm0.y>> f34190d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f34191e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ym0.l<Context, nm0.y> f34192f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(androidx.compose.ui.e eVar, float f11, float f12, List<? extends ym0.q<? super p4, ? super androidx.compose.runtime.a, ? super Integer, nm0.y>> list, boolean z5, ym0.l<? super Context, nm0.y> lVar) {
            super(2);
            this.f34187a = eVar;
            this.f34188b = f11;
            this.f34189c = f12;
            this.f34190d = list;
            this.f34191e = z5;
            this.f34192f = lVar;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                androidx.compose.ui.e e11 = androidx.compose.foundation.layout.e1.e(androidx.compose.foundation.layout.x0.g(this.f34187a, this.f34188b, this.f34189c), 1.0f);
                int i11 = androidx.compose.foundation.layout.e.f4229i;
                e.h o11 = androidx.compose.foundation.layout.e.o(yk.h.q());
                aVar2.s(693286680);
                androidx.compose.ui.layout.l0 a11 = androidx.compose.foundation.layout.c1.a(o11, b.a.l(), aVar2);
                aVar2.s(-1323940314);
                int G = aVar2.G();
                k1.v0 l5 = aVar2.l();
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
                    ym0.p c12 = com.google.protobuf.t.c(aVar2, a11, aVar2, l5);
                    if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G))) {
                        l0.q.a(G, aVar2, G, c12);
                    }
                    l0.r.c(0, c11, k1.j1.a(aVar2), aVar2, 2058660585);
                    r0.b0 b0Var = r0.b0.f94219a;
                    aVar2.s(444760276);
                    for (ym0.q qVar : kotlin.collections.x.H0(this.f34190d, 3)) {
                        androidx.compose.ui.e b10 = b0Var.b(androidx.compose.ui.e.f8927a, 2.0f, false);
                        androidx.compose.ui.layout.l0 b11 = defpackage.c.b(aVar2, 733328855, false, aVar2, -1323940314);
                        int G2 = aVar2.G();
                        k1.v0 l6 = aVar2.l();
                        androidx.compose.ui.node.g.D.getClass();
                        ym0.a a13 = g.a.a();
                        s1.a c13 = androidx.compose.ui.layout.y.c(b10);
                        if (aVar2.i() instanceof k1.d) {
                            aVar2.A();
                            if (aVar2.e()) {
                                aVar2.F(a13);
                            } else {
                                aVar2.m();
                            }
                            ym0.p c14 = com.google.protobuf.t.c(aVar2, b11, aVar2, l6);
                            if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G2))) {
                                l0.q.a(G2, aVar2, G2, c14);
                            }
                            l0.r.c(0, c13, k1.j1.a(aVar2), aVar2, 2058660585);
                            qVar.invoke(q4.f34613a, aVar2, 6);
                            aVar2.J();
                            aVar2.o();
                            aVar2.J();
                            aVar2.J();
                        } else {
                            a3.g.s();
                            throw null;
                        }
                    }
                    aVar2.J();
                    aVar2.s(-2074093175);
                    if (this.f34191e) {
                        Context context = (Context) aVar2.D(androidx.compose.ui.platform.u0.d());
                        e.a aVar3 = androidx.compose.ui.e.f8927a;
                        r0.d0.a(b0Var.b(aVar3, 1.0f, true), aVar2);
                        aVar2.s(444760749);
                        Object t11 = aVar2.t();
                        if (t11 == a.C0060a.a()) {
                            t11 = q0.n.a();
                            aVar2.n(t11);
                        }
                        aVar2.J();
                        n0.z.a(s2.d.a(C1987R.drawable.icon_medium_feature_info, aVar2), ay.b.u(C1987R.string._AT_INFO_TITLE_, aVar2), androidx.compose.foundation.h.a(aVar3, (q0.o) t11, h1.q.c(false, 0.0f, 0L, aVar2, 6, 6), false, null, new o4(context, this.f34192f), 28), null, null, 0.0f, g0.a.a(5, ((androidx.compose.material3.i1) aVar2.D(androidx.compose.material3.j1.e())).D()), aVar2, 8, 56);
                    }
                    androidx.compose.material.v.b(aVar2);
                } else {
                    a3.g.s();
                    throw null;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StatusHeader.kt */
    /* loaded from: classes3.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f34193a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f34194b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f34195c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List<ym0.q<p4, androidx.compose.runtime.a, Integer, nm0.y>> f34196d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f34197e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ym0.l<Context, nm0.y> f34198f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f34199g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f34200h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(androidx.compose.ui.e eVar, float f11, float f12, List<? extends ym0.q<? super p4, ? super androidx.compose.runtime.a, ? super Integer, nm0.y>> list, boolean z5, ym0.l<? super Context, nm0.y> lVar, int i11, int i12) {
            super(2);
            this.f34193a = eVar;
            this.f34194b = f11;
            this.f34195c = f12;
            this.f34196d = list;
            this.f34197e = z5;
            this.f34198f = lVar;
            this.f34199g = i11;
            this.f34200h = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f34199g | 1);
            boolean z5 = this.f34197e;
            ym0.l<Context, nm0.y> lVar = this.f34198f;
            n4.a(this.f34193a, this.f34194b, this.f34195c, this.f34196d, z5, lVar, aVar, g11, this.f34200h);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StatusHeader.kt */
    /* loaded from: classes3.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f34201a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g2.c f34202b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f34203c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f34204d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, nm0.y> f34205e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f34206f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f34207g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(String str, g2.c cVar, String str2, boolean z5, ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> pVar, int i11, int i12) {
            super(2);
            this.f34201a = str;
            this.f34202b = cVar;
            this.f34203c = str2;
            this.f34204d = z5;
            this.f34205e = pVar;
            this.f34206f = i11;
            this.f34207g = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f34206f | 1);
            boolean z5 = this.f34204d;
            ym0.p<androidx.compose.runtime.a, Integer, nm0.y> pVar = this.f34205e;
            n4.c(this.f34201a, this.f34202b, this.f34203c, z5, pVar, aVar, g11, this.f34207g);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StatusHeader.kt */
    /* loaded from: classes3.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f34208a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f34209b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g2.c f34210c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f34211d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Status.Icon f34212e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f34213f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f34214g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f34215h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(androidx.compose.ui.e eVar, String str, g2.c cVar, String str2, Status.Icon icon, boolean z5, int i11, int i12) {
            super(2);
            this.f34208a = eVar;
            this.f34209b = str;
            this.f34210c = cVar;
            this.f34211d = str2;
            this.f34212e = icon;
            this.f34213f = z5;
            this.f34214g = i11;
            this.f34215h = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f34214g | 1);
            Status.Icon icon = this.f34212e;
            boolean z5 = this.f34213f;
            n4.b(this.f34208a, this.f34209b, this.f34210c, this.f34211d, icon, z5, aVar, g11, this.f34215h);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StatusHeader.kt */
    /* loaded from: classes3.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f34216a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.q<p4, androidx.compose.runtime.a, Integer, nm0.y> f34217b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f34218c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f34219d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(androidx.compose.ui.e eVar, ym0.q<? super p4, ? super androidx.compose.runtime.a, ? super Integer, nm0.y> qVar, int i11, int i12) {
            super(2);
            this.f34216a = eVar;
            this.f34217b = qVar;
            this.f34218c = i11;
            this.f34219d = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f34218c | 1);
            n4.d(this.f34216a, this.f34217b, aVar, g11, this.f34219d);
            return nm0.y.f85009a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.ui.e r21, float r22, float r23, java.util.List<? extends ym0.q<? super com.withings.common.compose.component.p4, ? super androidx.compose.runtime.a, ? super java.lang.Integer, nm0.y>> r24, boolean r25, ym0.l<? super android.content.Context, nm0.y> r26, androidx.compose.runtime.a r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.common.compose.component.n4.a(androidx.compose.ui.e, float, float, java.util.List, boolean, ym0.l, androidx.compose.runtime.a, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(androidx.compose.ui.e r29, java.lang.String r30, g2.c r31, java.lang.String r32, com.withings.common.compose.component.Status.Icon r33, boolean r34, androidx.compose.runtime.a r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 805
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.common.compose.component.n4.b(androidx.compose.ui.e, java.lang.String, g2.c, java.lang.String, com.withings.common.compose.component.Status$Icon, boolean, androidx.compose.runtime.a, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(java.lang.String r28, g2.c r29, java.lang.String r30, boolean r31, ym0.p<? super androidx.compose.runtime.a, ? super java.lang.Integer, nm0.y> r32, androidx.compose.runtime.a r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.common.compose.component.n4.c(java.lang.String, g2.c, java.lang.String, boolean, ym0.p, androidx.compose.runtime.a, int, int):void");
    }

    public static final void d(androidx.compose.ui.e eVar, ym0.q<? super p4, ? super androidx.compose.runtime.a, ? super Integer, nm0.y> item, androidx.compose.runtime.a aVar, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        kotlin.jvm.internal.u.j(item, "item");
        androidx.compose.runtime.b g11 = aVar.g(1405620885);
        int i16 = i12 & 1;
        if (i16 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            if (g11.K(eVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i13 = i14 | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            if (g11.w(item)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i13 |= i15;
        }
        if ((i13 & 91) == 18 && g11.h()) {
            g11.C();
        } else {
            if (i16 != 0) {
                eVar = androidx.compose.ui.e.f8927a;
            }
            int i17 = i13 & 14;
            a(eVar, 0.0f, 0.0f, kotlin.collections.x.V(item), false, null, g11, i17, 54);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new f(eVar, item, i11, i12));
        }
    }
}
