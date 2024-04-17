package com.withings.common.compose.component;

import androidx.compose.ui.node.g;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.withings.library.authentication.api.ConstantsWs;
import x1.b;
import x1.d;
/* compiled from: Ring.kt */
/* loaded from: classes3.dex */
public final class k3 {

    /* renamed from: a  reason: collision with root package name */
    private static final float f33958a = 3;

    /* renamed from: b  reason: collision with root package name */
    private static final float f33959b = 88;

    /* renamed from: c  reason: collision with root package name */
    private static final float f33960c = 40;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Ring.kt */
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k1.r0<Boolean> f33961a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k1.r0<Boolean> r0Var) {
            super(0);
            this.f33961a = r0Var;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            this.f33961a.setValue(Boolean.TRUE);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Ring.kt */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.l<f2.c, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f33962a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f33963b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k1.o1<Float> f33964c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j5, long j11, k1.o1<Float> o1Var) {
            super(1);
            this.f33962a = j5;
            this.f33963b = j11;
            this.f33964c = o1Var;
        }

        @Override // ym0.l
        public final nm0.y invoke(f2.c cVar) {
            f2.c drawWithContent = cVar;
            kotlin.jvm.internal.u.j(drawWithContent, "$this$drawWithContent");
            drawWithContent.r1();
            f2.j jVar = new f2.j(drawWithContent.b1(k3.f33958a), 0.0f, 1, 0, null, 26);
            float f11 = 2;
            float e11 = jVar.e() / f11;
            float h11 = c2.g.h(drawWithContent.b()) - (f11 * e11);
            f2.f.U0(drawWithContent, this.f33962a, 270.0f, 360.0f, c2.d.a(e11, e11), c2.h.a(h11, h11), 0.0f, jVar, 832);
            f2.f.U0(drawWithContent, this.f33963b, 270.0f, this.f33964c.getValue().floatValue() * 360.0f, c2.d.a(e11, e11), c2.h.a(h11, h11), 0.0f, jVar, 832);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Ring.kt */
    /* loaded from: classes3.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f33965a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f33966b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f33967c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f33968d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f33969e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f33970f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f33971g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f33972h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f33973i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(androidx.compose.ui.e eVar, long j5, float f11, String str, String str2, boolean z5, boolean z11, int i11, int i12) {
            super(2);
            this.f33965a = eVar;
            this.f33966b = j5;
            this.f33967c = f11;
            this.f33968d = str;
            this.f33969e = str2;
            this.f33970f = z5;
            this.f33971g = z11;
            this.f33972h = i11;
            this.f33973i = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f33972h | 1);
            boolean z5 = this.f33970f;
            boolean z11 = this.f33971g;
            k3.a(this.f33965a, this.f33966b, this.f33967c, this.f33968d, this.f33969e, z5, z11, aVar, g11, this.f33973i);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Ring.kt */
    /* loaded from: classes3.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0.c f33974a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f33975b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f33976c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f33977d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f33978e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(r0.c cVar, boolean z5, String str, String str2, int i11) {
            super(2);
            this.f33974a = cVar;
            this.f33975b = z5;
            this.f33976c = str;
            this.f33977d = str2;
            this.f33978e = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f33978e | 1);
            String str = this.f33976c;
            String str2 = this.f33977d;
            k3.b(this.f33974a, this.f33975b, str, str2, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0116  */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v38 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.ui.e r23, long r24, float r26, java.lang.String r27, java.lang.String r28, boolean r29, boolean r30, androidx.compose.runtime.a r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.common.compose.component.k3.a(androidx.compose.ui.e, long, float, java.lang.String, java.lang.String, boolean, boolean, androidx.compose.runtime.a, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(r0.c cVar, boolean z5, String str, String str2, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        androidx.compose.runtime.b g11 = aVar.g(1465766258);
        if ((i11 & 14) == 0) {
            if (g11.K(cVar)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i12 = i17 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.a(z5)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i12 |= i16;
        }
        if ((i11 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.K(str)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i11 & 7168) == 0) {
            if (g11.K(str2)) {
                i14 = ModuleCopy.f28574b;
            } else {
                i14 = 1024;
            }
            i12 |= i14;
        }
        if ((i12 & 5851) == 1170 && g11.h()) {
            g11.C();
        } else {
            androidx.compose.ui.e g12 = cVar.g(androidx.compose.ui.e.f8927a, b.a.e());
            d.a g13 = b.a.g();
            g11.s(-483455358);
            androidx.compose.ui.layout.l0 a11 = androidx.compose.foundation.layout.n.a(androidx.compose.foundation.layout.e.h(), g13, g11);
            g11.s(-1323940314);
            int G = g11.G();
            k1.v0 l5 = g11.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a12 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(g12);
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
                androidx.compose.ui.text.b bVar = new androidx.compose.ui.text.b(str, null, 6);
                if (z5) {
                    i13 = 7;
                } else {
                    i13 = 5;
                }
                nk.j.a(null, bVar, i13, 0L, null, 0, false, 0, g11, 0, ConstantsWs.WS_STATUS_WRONG_DATE_FORMAT);
                g11.s(-1856076897);
                if (str2 != null) {
                    nk.u.f(0, 0, (i12 >> 6) & 112, 61, 0L, g11, null, null, str2);
                }
                androidx.compose.material3.d.c(g11);
            } else {
                a3.g.s();
                throw null;
            }
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new d(cVar, z5, str, str2, i11));
        }
    }
}
