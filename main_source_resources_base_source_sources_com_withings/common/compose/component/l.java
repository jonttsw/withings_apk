package com.withings.common.compose.component;

import com.withings.common.compose.component.l2;
import d2.g0;
/* compiled from: Buttons.kt */
/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a */
    private static final r0.x f33986a;

    /* renamed from: b */
    private static final r0.x f33987b;

    /* renamed from: c */
    private static final r0.x f33988c;

    /* renamed from: d */
    public static final /* synthetic */ int f33989d = 0;

    /* compiled from: Buttons.kt */
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a */
        final /* synthetic */ boolean f33990a;

        /* renamed from: b */
        final /* synthetic */ ym0.a<nm0.y> f33991b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ym0.a aVar, boolean z5) {
            super(0);
            this.f33990a = z5;
            this.f33991b = aVar;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            if (!this.f33990a) {
                this.f33991b.invoke();
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Buttons.kt */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.q<r0.a0, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a */
        final /* synthetic */ String f33992a;

        /* renamed from: b */
        final /* synthetic */ boolean f33993b;

        /* renamed from: c */
        final /* synthetic */ ButtonSize f33994c;

        /* renamed from: d */
        final /* synthetic */ l2 f33995d;

        /* renamed from: e */
        final /* synthetic */ k1.o1<d2.f0> f33996e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, boolean z5, ButtonSize buttonSize, l2 l2Var, k1.r0 r0Var) {
            super(3);
            this.f33992a = str;
            this.f33993b = z5;
            this.f33994c = buttonSize;
            this.f33995d = l2Var;
            this.f33996e = r0Var;
        }

        @Override // ym0.q
        public final nm0.y invoke(r0.a0 a0Var, androidx.compose.runtime.a aVar, Integer num) {
            int i11;
            r0.a0 Button = a0Var;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(Button, "$this$Button");
            if ((intValue & 14) == 0) {
                if (aVar2.K(Button)) {
                    i11 = 4;
                } else {
                    i11 = 2;
                }
                intValue |= i11;
            }
            if ((intValue & 91) == 18 && aVar2.h()) {
                aVar2.C();
            } else {
                l2 l2Var = this.f33995d;
                l.d(Button, this.f33992a, this.f33993b, this.f33996e.getValue().t(), this.f33994c, l2Var, 0, aVar2, intValue & 14, 32);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Buttons.kt */
    /* loaded from: classes3.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a */
        final /* synthetic */ androidx.compose.ui.e f33997a;

        /* renamed from: b */
        final /* synthetic */ String f33998b;

        /* renamed from: c */
        final /* synthetic */ l2 f33999c;

        /* renamed from: d */
        final /* synthetic */ boolean f34000d;

        /* renamed from: e */
        final /* synthetic */ ColorStyle f34001e;

        /* renamed from: f */
        final /* synthetic */ ButtonSize f34002f;

        /* renamed from: g */
        final /* synthetic */ boolean f34003g;

        /* renamed from: h */
        final /* synthetic */ ym0.a<nm0.y> f34004h;

        /* renamed from: i */
        final /* synthetic */ int f34005i;

        /* renamed from: j */
        final /* synthetic */ int f34006j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(androidx.compose.ui.e eVar, String str, l2 l2Var, boolean z5, ColorStyle colorStyle, ButtonSize buttonSize, boolean z11, ym0.a<nm0.y> aVar, int i11, int i12) {
            super(2);
            this.f33997a = eVar;
            this.f33998b = str;
            this.f33999c = l2Var;
            this.f34000d = z5;
            this.f34001e = colorStyle;
            this.f34002f = buttonSize;
            this.f34003g = z11;
            this.f34004h = aVar;
            this.f34005i = i11;
            this.f34006j = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f34005i | 1);
            boolean z5 = this.f34003g;
            ym0.a<nm0.y> aVar2 = this.f34004h;
            l.a(this.f33997a, this.f33998b, this.f33999c, this.f34000d, this.f34001e, this.f34002f, z5, aVar2, aVar, g11, this.f34006j);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Buttons.kt */
    /* loaded from: classes3.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.q<r0.a0, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a */
        final /* synthetic */ boolean f34007a;

        /* renamed from: b */
        final /* synthetic */ k1.o1<d2.f0> f34008b;

        /* renamed from: c */
        final /* synthetic */ String f34009c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z5, k1.r0 r0Var, String str) {
            super(3);
            this.f34007a = z5;
            this.f34008b = r0Var;
            this.f34009c = str;
        }

        @Override // ym0.q
        public final nm0.y invoke(r0.a0 a0Var, androidx.compose.runtime.a aVar, Integer num) {
            int i11;
            r0.a0 Button = a0Var;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(Button, "$this$Button");
            if ((intValue & 14) == 0) {
                if (aVar2.K(Button)) {
                    i11 = 4;
                } else {
                    i11 = 2;
                }
                intValue |= i11;
            }
            if ((intValue & 91) == 18 && aVar2.h()) {
                aVar2.C();
            } else {
                l0.p.a(Boolean.valueOf(this.f34007a), null, null, "", s1.b.b(aVar2, 599671865, new m(Button, this.f34008b, this.f34009c)), aVar2, 27648, 6);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Buttons.kt */
    /* loaded from: classes3.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a */
        final /* synthetic */ String f34010a;

        /* renamed from: b */
        final /* synthetic */ ym0.a<nm0.y> f34011b;

        /* renamed from: c */
        final /* synthetic */ androidx.compose.ui.e f34012c;

        /* renamed from: d */
        final /* synthetic */ boolean f34013d;

        /* renamed from: e */
        final /* synthetic */ int f34014e;

        /* renamed from: f */
        final /* synthetic */ int f34015f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, ym0.a<nm0.y> aVar, androidx.compose.ui.e eVar, boolean z5, int i11, int i12) {
            super(2);
            this.f34010a = str;
            this.f34011b = aVar;
            this.f34012c = eVar;
            this.f34013d = z5;
            this.f34014e = i11;
            this.f34015f = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f34014e | 1);
            androidx.compose.ui.e eVar = this.f34012c;
            boolean z5 = this.f34013d;
            l.b(this.f34010a, this.f34011b, eVar, z5, aVar, g11, this.f34015f);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Buttons.kt */
    /* loaded from: classes3.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a */
        final /* synthetic */ boolean f34016a;

        /* renamed from: b */
        final /* synthetic */ ym0.a<nm0.y> f34017b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(ym0.a aVar, boolean z5) {
            super(0);
            this.f34016a = z5;
            this.f34017b = aVar;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            if (!this.f34016a) {
                this.f34017b.invoke();
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Buttons.kt */
    /* loaded from: classes3.dex */
    public static final class g extends kotlin.jvm.internal.w implements ym0.q<r0.a0, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a */
        final /* synthetic */ String f34018a;

        /* renamed from: b */
        final /* synthetic */ boolean f34019b;

        /* renamed from: c */
        final /* synthetic */ ButtonSize f34020c;

        /* renamed from: d */
        final /* synthetic */ l2 f34021d;

        /* renamed from: e */
        final /* synthetic */ k1.o1<d2.f0> f34022e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, boolean z5, ButtonSize buttonSize, l2 l2Var, k1.r0 r0Var) {
            super(3);
            this.f34018a = str;
            this.f34019b = z5;
            this.f34020c = buttonSize;
            this.f34021d = l2Var;
            this.f34022e = r0Var;
        }

        @Override // ym0.q
        public final nm0.y invoke(r0.a0 a0Var, androidx.compose.runtime.a aVar, Integer num) {
            int i11;
            r0.a0 OutlinedButton = a0Var;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(OutlinedButton, "$this$OutlinedButton");
            if ((intValue & 14) == 0) {
                if (aVar2.K(OutlinedButton)) {
                    i11 = 4;
                } else {
                    i11 = 2;
                }
                intValue |= i11;
            }
            if ((intValue & 91) == 18 && aVar2.h()) {
                aVar2.C();
            } else {
                l2 l2Var = this.f34021d;
                l.d(OutlinedButton, this.f34018a, this.f34019b, l.e(this.f34022e), this.f34020c, l2Var, 0, aVar2, intValue & 14, 32);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Buttons.kt */
    /* loaded from: classes3.dex */
    public static final class h extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a */
        final /* synthetic */ androidx.compose.ui.e f34023a;

        /* renamed from: b */
        final /* synthetic */ String f34024b;

        /* renamed from: c */
        final /* synthetic */ l2 f34025c;

        /* renamed from: d */
        final /* synthetic */ boolean f34026d;

        /* renamed from: e */
        final /* synthetic */ ColorStyle f34027e;

        /* renamed from: f */
        final /* synthetic */ ButtonSize f34028f;

        /* renamed from: g */
        final /* synthetic */ boolean f34029g;

        /* renamed from: h */
        final /* synthetic */ ym0.a<nm0.y> f34030h;

        /* renamed from: i */
        final /* synthetic */ int f34031i;

        /* renamed from: j */
        final /* synthetic */ int f34032j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(androidx.compose.ui.e eVar, String str, l2 l2Var, boolean z5, ColorStyle colorStyle, ButtonSize buttonSize, boolean z11, ym0.a<nm0.y> aVar, int i11, int i12) {
            super(2);
            this.f34023a = eVar;
            this.f34024b = str;
            this.f34025c = l2Var;
            this.f34026d = z5;
            this.f34027e = colorStyle;
            this.f34028f = buttonSize;
            this.f34029g = z11;
            this.f34030h = aVar;
            this.f34031i = i11;
            this.f34032j = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f34031i | 1);
            boolean z5 = this.f34029g;
            ym0.a<nm0.y> aVar2 = this.f34030h;
            l.c(this.f34023a, this.f34024b, this.f34025c, this.f34026d, this.f34027e, this.f34028f, z5, aVar2, aVar, g11, this.f34032j);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Buttons.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class i {

        /* renamed from: a */
        public static final /* synthetic */ int[] f34033a;

        static {
            int[] iArr = new int[ButtonSize.values().length];
            try {
                iArr[ButtonSize.f33302d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonSize.f33303e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonSize.f33304f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[ColorStyle.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ColorStyle colorStyle = ColorStyle.f33322a;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                ColorStyle colorStyle2 = ColorStyle.f33322a;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                ColorStyle colorStyle3 = ColorStyle.f33322a;
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            f34033a = iArr2;
        }
    }

    /* compiled from: Buttons.kt */
    /* loaded from: classes3.dex */
    public static final class j extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a */
        final /* synthetic */ l2 f34034a;

        /* renamed from: b */
        final /* synthetic */ long f34035b;

        /* renamed from: c */
        final /* synthetic */ int f34036c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(l2 l2Var, long j5, int i11) {
            super(2);
            this.f34034a = l2Var;
            this.f34035b = j5;
            this.f34036c = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f34036c | 1);
            l.k(this.f34034a, this.f34035b, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    static {
        float f11 = 20;
        float f12 = 16;
        float f13 = 12;
        float f14 = 4;
        f33986a = new r0.x(f11, f12, f11, f12);
        f33987b = new r0.x(f11, f13, f11, f13);
        f33988c = new r0.x(f12, f14, f12, f14);
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:257:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.ui.e r26, java.lang.String r27, com.withings.common.compose.component.l2 r28, boolean r29, com.withings.common.compose.component.ColorStyle r30, com.withings.common.compose.component.ButtonSize r31, boolean r32, ym0.a<nm0.y> r33, androidx.compose.runtime.a r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.common.compose.component.l.a(androidx.compose.ui.e, java.lang.String, com.withings.common.compose.component.l2, boolean, com.withings.common.compose.component.ColorStyle, com.withings.common.compose.component.ButtonSize, boolean, ym0.a, androidx.compose.runtime.a, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(java.lang.String r20, ym0.a<nm0.y> r21, androidx.compose.ui.e r22, boolean r23, androidx.compose.runtime.a r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.common.compose.component.l.b(java.lang.String, ym0.a, androidx.compose.ui.e, boolean, androidx.compose.runtime.a, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:166:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:259:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(androidx.compose.ui.e r26, java.lang.String r27, com.withings.common.compose.component.l2 r28, boolean r29, com.withings.common.compose.component.ColorStyle r30, com.withings.common.compose.component.ButtonSize r31, boolean r32, ym0.a<nm0.y> r33, androidx.compose.runtime.a r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.common.compose.component.l.c(androidx.compose.ui.e, java.lang.String, com.withings.common.compose.component.l2, boolean, com.withings.common.compose.component.ColorStyle, com.withings.common.compose.component.ButtonSize, boolean, ym0.a, androidx.compose.runtime.a, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:201:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(r0.a0 r20, java.lang.String r21, boolean r22, long r23, com.withings.common.compose.component.ButtonSize r25, com.withings.common.compose.component.l2 r26, int r27, androidx.compose.runtime.a r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.common.compose.component.l.d(r0.a0, java.lang.String, boolean, long, com.withings.common.compose.component.ButtonSize, com.withings.common.compose.component.l2, int, androidx.compose.runtime.a, int, int):void");
    }

    public static final long e(k1.o1 o1Var) {
        return ((d2.f0) o1Var.getValue()).t();
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:181:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(java.lang.String r34, long r35, androidx.compose.ui.e r37, int r38, int r39, androidx.compose.runtime.a r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.common.compose.component.l.f(java.lang.String, long, androidx.compose.ui.e, int, int, androidx.compose.runtime.a, int, int):void");
    }

    public static final /* synthetic */ r0.x g() {
        return f33986a;
    }

    public static final /* synthetic */ r0.x h() {
        return f33988c;
    }

    public static final /* synthetic */ r0.x i() {
        return f33987b;
    }

    public static final z2 j(boolean z5, ColorStyle colorStyle, androidx.compose.runtime.a aVar) {
        long j5;
        long j11;
        long J;
        long j12;
        long l5;
        kotlin.jvm.internal.u.j(colorStyle, "colorStyle");
        aVar.s(-810143010);
        if (z5) {
            aVar.s(-316917908);
            int ordinal = colorStyle.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            aVar.J();
                            j5 = ((yk.w) androidx.camera.camera2.internal.c3.b(aVar, -316917600, 615317871)).b().b();
                            aVar.J();
                        } else {
                            throw a0.a.c(aVar, -316928457);
                        }
                    } else {
                        j5 = ((androidx.compose.material3.i1) androidx.camera.core.y1.c(aVar, -316917675)).M();
                        aVar.J();
                    }
                } else {
                    aVar.J();
                    j5 = ((yk.w) androidx.camera.camera2.internal.c3.b(aVar, -316917744, 615317871)).b().d();
                    aVar.J();
                }
            } else {
                j5 = ((androidx.compose.material3.i1) androidx.camera.core.y1.c(aVar, -316917810)).J();
                aVar.J();
            }
            int ordinal2 = colorStyle.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 != 1) {
                    if (ordinal2 != 2) {
                        if (ordinal2 == 3) {
                            aVar.J();
                            j11 = ((yk.w) androidx.camera.camera2.internal.c3.b(aVar, -316917223, 615317871)).b().b();
                            aVar.J();
                        } else {
                            throw a0.a.c(aVar, -316928457);
                        }
                    } else {
                        aVar.J();
                        j11 = ((yk.w) androidx.camera.camera2.internal.c3.b(aVar, -316917306, 615317871)).b().g();
                        aVar.J();
                    }
                } else {
                    j11 = d2.f0.l(((androidx.compose.material3.i1) androidx.camera.core.y1.c(aVar, -316917385)).r(), 0.6f);
                    aVar.J();
                }
            } else {
                aVar.J();
                j11 = ((yk.w) androidx.camera.camera2.internal.c3.b(aVar, -316917463, 615317871)).b().e();
                aVar.J();
            }
            int ordinal3 = colorStyle.ordinal();
            if (ordinal3 != 0 && ordinal3 != 1) {
                if (ordinal3 != 2) {
                    if (ordinal3 == 3) {
                        aVar.J();
                        j12 = ((yk.w) androidx.camera.camera2.internal.c3.b(aVar, -316916913, 615317871)).b().c();
                        aVar.J();
                    } else {
                        throw a0.a.c(aVar, -316928457);
                    }
                } else {
                    j12 = ((androidx.compose.material3.i1) androidx.camera.core.y1.c(aVar, -316916990)).B();
                    aVar.J();
                }
            } else {
                j12 = ((androidx.compose.material3.i1) androidx.camera.core.y1.c(aVar, -316917059)).z();
                aVar.J();
            }
            if (i.f34033a[colorStyle.ordinal()] == 1) {
                l5 = d2.f0.f63259c;
            } else {
                l5 = j12;
            }
            aVar.J();
        } else {
            aVar.s(-316916726);
            j5 = d2.f0.f63265i;
            j11 = d2.f0.f63265i;
            if (i.f34033a[colorStyle.ordinal()] == 2) {
                aVar.J();
                J = ((yk.w) androidx.camera.camera2.internal.c3.b(aVar, -316916537, 615317871)).b().d();
                aVar.J();
            } else {
                J = ((androidx.compose.material3.i1) androidx.camera.core.y1.c(aVar, -316916480)).J();
                aVar.J();
            }
            j12 = J;
            l5 = d2.f0.l(j12, 0.6f);
            aVar.J();
        }
        z2 z2Var = new z2(j5, j12, j11, l5);
        aVar.J();
        return z2Var;
    }

    public static final void k(l2 toComposable, long j5, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        int i14;
        kotlin.jvm.internal.u.j(toComposable, "$this$toComposable");
        androidx.compose.runtime.b g11 = aVar.g(433181262);
        if ((i11 & 14) == 0) {
            if (g11.K(toComposable)) {
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
        } else if (toComposable instanceof l2.b) {
            g11.s(66158637);
            n0.z.a(((l2.b) toComposable).a(), "", androidx.compose.foundation.layout.e1.n(androidx.compose.ui.e.f8927a, yk.h.z()), null, null, 0.0f, g0.a.a(5, j5), g11, 440, 56);
            g11.J();
        } else if (toComposable instanceof l2.a) {
            g11.s(66158867);
            androidx.compose.material3.a5.b(((l2.a) toComposable).a(), "", null, j5, g11, ((i12 << 6) & 7168) | 48, 4);
            g11.J();
        } else if (toComposable instanceof l2.c) {
            g11.s(66159028);
            n0.z.a(s2.d.a(com.withings.wiscale2.device.hwa08.postinstall.b0.G(((l2.c) toComposable).a()), g11), "", androidx.compose.foundation.layout.e1.n(androidx.compose.ui.e.f8927a, yk.h.z()), null, null, 0.0f, g0.a.a(5, j5), g11, 440, 56);
            g11.J();
        } else {
            g11.s(66159237);
            g11.J();
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new j(toComposable, j5, i11));
        }
    }

    public static final x0.a l(ButtonSize buttonSize, androidx.compose.runtime.a aVar) {
        k1.p1 p1Var;
        x0.a b10;
        k1.p1 p1Var2;
        k1.p1 p1Var3;
        aVar.s(-208012531);
        int ordinal = buttonSize.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    aVar.s(-267681994);
                    aVar.s(1897297991);
                    p1Var3 = yk.o.f109337i;
                    aVar.J();
                    b10 = ((yk.v) aVar.D(p1Var3)).a();
                    aVar.J();
                } else {
                    throw a0.a.c(aVar, -267685537);
                }
            } else {
                aVar.s(-267682048);
                aVar.s(1897297991);
                p1Var2 = yk.o.f109337i;
                aVar.J();
                b10 = ((yk.v) aVar.D(p1Var2)).c();
                aVar.J();
            }
        } else {
            aVar.s(-267682105);
            aVar.s(1897297991);
            p1Var = yk.o.f109337i;
            aVar.J();
            b10 = ((yk.v) aVar.D(p1Var)).b();
            aVar.J();
        }
        aVar.J();
        return b10;
    }
}
