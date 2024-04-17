package com.withings.common.compose.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import androidx.compose.foundation.layout.e;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.f;
import androidx.compose.ui.node.g;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.withings.library.authentication.api.ConstantsWs;
import ga.f;
import java.util.List;
import java.util.Locale;
import x1.b;
import x1.d;
/* compiled from: HorizontalBar.kt */
/* loaded from: classes3.dex */
public final class w1 {

    /* renamed from: a  reason: collision with root package name */
    private static final float f34894a = 28;

    /* renamed from: b  reason: collision with root package name */
    private static final float f34895b = 41;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HorizontalBar.kt */
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f34896a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f34897b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f34898c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Integer f34899d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f34900e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f34901f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j5, androidx.compose.ui.e eVar, int i11, Integer num, int i12, int i13) {
            super(2);
            this.f34896a = j5;
            this.f34897b = eVar;
            this.f34898c = i11;
            this.f34899d = num;
            this.f34900e = i12;
            this.f34901f = i13;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f34900e | 1);
            int i11 = this.f34898c;
            Integer num2 = this.f34899d;
            w1.a(this.f34896a, this.f34897b, i11, num2, aVar, g11, this.f34901f);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HorizontalBar.kt */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f34902a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u1 f34903b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f34904c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f34905d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.e eVar, u1 u1Var, int i11, int i12) {
            super(2);
            this.f34902a = eVar;
            this.f34903b = u1Var;
            this.f34904c = i11;
            this.f34905d = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f34904c | 1);
            w1.b(this.f34902a, this.f34903b, aVar, g11, this.f34905d);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HorizontalBar.kt */
    /* loaded from: classes3.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Bitmap f34906a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f34907b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i11, Bitmap bitmap) {
            super(2);
            this.f34906a = bitmap;
            this.f34907b = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f34907b | 1);
            w1.c(this.f34906a, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(long r16, androidx.compose.ui.e r18, int r19, java.lang.Integer r20, androidx.compose.runtime.a r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.common.compose.component.w1.a(long, androidx.compose.ui.e, int, java.lang.Integer, androidx.compose.runtime.a, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(androidx.compose.ui.e eVar, u1 u1Var, androidx.compose.runtime.a aVar, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        androidx.compose.runtime.b g11 = aVar.g(196672623);
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
            if (g11.K(u1Var)) {
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
            g11.s(-483455358);
            androidx.compose.ui.layout.l0 b10 = android.support.v4.media.session.c.b(androidx.compose.foundation.layout.e.h(), g11, -1323940314);
            int G = g11.G();
            k1.v0 l5 = g11.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a11 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(eVar);
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
                nk.j.h(0, 0, 29, 0L, g11, null, null, u1Var.g());
                String f11 = u1Var.f();
                g11.s(-1227024430);
                if (f11 != null) {
                    nk.a.g(0, 0, 0, 61, 0L, g11, null, null, f11);
                }
                androidx.compose.material3.d.c(g11);
            } else {
                a3.g.s();
                throw null;
            }
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new b(eVar, u1Var, i11, i12));
        }
    }

    public static final void c(Bitmap bitmap, androidx.compose.runtime.a aVar, int i11) {
        kotlin.jvm.internal.u.j(bitmap, "bitmap");
        androidx.compose.runtime.b g11 = aVar.g(-2046793930);
        n0.z.c(new d2.i(bitmap), "", null, g11, ConstantsWs.WS_STATUS_WRONGBATTERYLVL);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new c(i11, bitmap));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(int i11, int i12, int i13, int i14, androidx.compose.runtime.a aVar) {
        int i15;
        Bitmap a11;
        int i16;
        int i17;
        int i18;
        androidx.compose.runtime.b g11 = aVar.g(-1157125792);
        if ((i14 & 14) == 0) {
            if (g11.c(i11)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i15 = i18 | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 112) == 0) {
            if (g11.c(i12)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i15 |= i17;
        }
        if ((i14 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.c(i13)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i15 |= i16;
        }
        if ((i15 & 731) == 146 && g11.h()) {
            g11.C();
        } else {
            Context context = (Context) g11.D(androidx.compose.ui.platform.u0.d());
            int k11 = ah.g.k(5, context);
            Bitmap b10 = y70.b.b(k11, k11, i13);
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            BitmapShader bitmapShader = new BitmapShader(b10, tileMode, tileMode);
            Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
            kotlin.jvm.internal.u.i(createBitmap, "createBitmap(...)");
            Paint paint = new Paint(1);
            Canvas canvas = new Canvas();
            canvas.setBitmap(createBitmap);
            paint.setShader(bitmapShader);
            canvas.drawPaint(paint);
            androidx.core.graphics.drawable.d a12 = androidx.core.graphics.drawable.e.a(context.getResources(), createBitmap);
            a12.d(ah.g.k(3, context));
            a12.c();
            a11 = androidx.core.graphics.drawable.b.a(a12, a12.getIntrinsicWidth(), a12.getIntrinsicHeight(), null);
            if (a11 != null) {
                c(a11, g11, 8);
            }
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new x1(i11, i12, i13, i14));
        }
    }

    public static final void e(int i11, int i12, androidx.compose.runtime.a aVar, androidx.compose.ui.e eVar, List barsData) {
        kotlin.jvm.internal.u.j(barsData, "barsData");
        androidx.compose.runtime.b g11 = aVar.g(-773458286);
        if ((i12 & 1) != 0) {
            eVar = androidx.compose.ui.e.f8927a;
        }
        if (!barsData.isEmpty()) {
            androidx.compose.ui.layout.n1.a(androidx.compose.foundation.layout.x0.j(eVar, 0.0f, 0.0f, v1.c(), 0.0f, 11), new c2(barsData), g11, 0, 0);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new d2(i11, i12, eVar, barsData));
        }
    }

    public static final void i(androidx.compose.ui.e eVar, u1 u1Var, long j5, float f11, androidx.compose.runtime.a aVar, int i11, int i12) {
        Object obj;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        androidx.compose.ui.e eVar2;
        e.a aVar2;
        int i18;
        int i19;
        int i21;
        androidx.compose.runtime.b g11 = aVar.g(-387758107);
        int i22 = i12 & 1;
        if (i22 != 0) {
            i13 = i11 | 6;
            obj = eVar;
        } else if ((i11 & 14) == 0) {
            obj = eVar;
            if (g11.K(obj)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i13 = i14 | i11;
        } else {
            obj = eVar;
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            if (g11.K(u1Var)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i13 |= i15;
        }
        if ((i12 & 4) != 0) {
            i13 |= ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED;
        } else if ((i11 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.d(j5)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i13 |= i16;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 7168) == 0) {
            if (g11.b(f11)) {
                i17 = ModuleCopy.f28574b;
            } else {
                i17 = 1024;
            }
            i13 |= i17;
        }
        int i23 = i13;
        if ((i23 & 5851) == 1170 && g11.h()) {
            g11.C();
            eVar2 = obj;
        } else {
            if (i22 != 0) {
                eVar2 = androidx.compose.ui.e.f8927a;
            } else {
                eVar2 = obj;
            }
            int i24 = androidx.compose.foundation.layout.e.f4229i;
            e.h o11 = androidx.compose.foundation.layout.e.o(yk.h.a());
            g11.s(-483455358);
            androidx.compose.ui.layout.l0 a11 = com.withings.authentication.e.a(o11, g11, -1323940314);
            int G = g11.G();
            k1.v0 l5 = g11.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a12 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(eVar2);
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
                c11.invoke(k1.j1.a(g11), g11, 0);
                g11.s(2058660585);
                d.b i25 = b.a.i();
                e.h b11 = com.withings.authentication.d.b(g11, 693286680);
                e.a aVar3 = androidx.compose.ui.e.f8927a;
                androidx.compose.ui.layout.l0 a13 = androidx.compose.foundation.layout.c1.a(b11, i25, g11);
                g11.s(-1323940314);
                int G2 = g11.G();
                k1.v0 l6 = g11.l();
                ym0.a a14 = g.a.a();
                s1.a c12 = androidx.compose.ui.layout.y.c(aVar3);
                if (g11.i() instanceof k1.d) {
                    g11.A();
                    if (g11.e()) {
                        g11.F(a14);
                    } else {
                        g11.m();
                    }
                    ym0.p b12 = com.withings.authentication.e.b(g11, a13, g11, l6);
                    if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G2))) {
                        androidx.camera.camera2.internal.l0.d(G2, g11, G2, b12);
                    }
                    dq.x.b(0, c12, k1.j1.a(g11), g11, 2058660585);
                    String c13 = u1Var.c();
                    g11.s(1813673465);
                    if (c13 == null) {
                        aVar2 = aVar3;
                        i21 = i23;
                        i19 = -1323940314;
                        i18 = 693286680;
                    } else {
                        androidx.compose.ui.e n11 = androidx.compose.foundation.layout.e1.n(androidx.collection.c.g(aVar3, x0.h.e()), 20);
                        f.a aVar4 = new f.a((Context) g11.D(androidx.compose.ui.platform.u0.d()));
                        aVar4.d(c13);
                        aVar2 = aVar3;
                        i18 = 693286680;
                        i19 = -1323940314;
                        i21 = i23;
                        n0.z.a(x9.n.a(aVar4.b(), g11, 8), "", n11, null, f.a.b(), 0.0f, null, g11, 24624, 104);
                        nm0.y yVar = nm0.y.f85009a;
                    }
                    g11.J();
                    String upperCase = u1Var.d().toUpperCase(Locale.ROOT);
                    kotlin.jvm.internal.u.i(upperCase, "toUpperCase(...)");
                    nk.a0.b(0, 0, 27, 0L, g11, null, null, upperCase);
                    g11.J();
                    g11.o();
                    g11.J();
                    g11.J();
                    e.a aVar5 = aVar2;
                    androidx.compose.ui.e j11 = androidx.compose.foundation.layout.x0.j(androidx.compose.foundation.layout.e1.h(androidx.compose.foundation.layout.e1.u(aVar5, null, 3), k3.k.d(j5), 0.0f, 2), 0.0f, 0.0f, 0.0f, v1.b(), 7);
                    e.h p11 = androidx.compose.foundation.layout.e.p(yk.h.b(), b.a.k());
                    d.b i26 = b.a.i();
                    g11.s(i18);
                    androidx.compose.ui.layout.l0 a15 = androidx.compose.foundation.layout.c1.a(p11, i26, g11);
                    g11.s(i19);
                    int G3 = g11.G();
                    k1.v0 l11 = g11.l();
                    ym0.a a16 = g.a.a();
                    s1.a c14 = androidx.compose.ui.layout.y.c(j11);
                    if (g11.i() instanceof k1.d) {
                        g11.A();
                        if (g11.e()) {
                            g11.F(a16);
                        } else {
                            g11.m();
                        }
                        ym0.p b13 = com.withings.authentication.e.b(g11, a15, g11, l11);
                        if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G3))) {
                            androidx.camera.camera2.internal.l0.d(G3, g11, G3, b13);
                        }
                        dq.x.b(0, c14, k1.j1.a(g11), g11, 2058660585);
                        a(j5, androidx.compose.foundation.layout.e1.o(aVar5, k3.k.e(j5), k3.k.d(j5)), u1Var.a(), u1Var.b(), g11, (i21 >> 6) & 14, 0);
                        b(androidx.compose.foundation.layout.e1.r(aVar5, f11), u1Var, g11, i21 & 112, 0);
                        g11.J();
                        g11.o();
                        g11.J();
                        g11.J();
                        g11.J();
                        g11.o();
                        g11.J();
                        g11.J();
                    } else {
                        a3.g.s();
                        throw null;
                    }
                } else {
                    a3.g.s();
                    throw null;
                }
            } else {
                a3.g.s();
                throw null;
            }
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new y1(eVar2, u1Var, j5, f11, i11, i12));
        }
    }

    public static final float j(u1 u1Var) {
        String f11 = u1Var.f();
        if (f11 != null && !dp0.j.D(f11)) {
            return f34895b;
        }
        return f34894a;
    }
}
