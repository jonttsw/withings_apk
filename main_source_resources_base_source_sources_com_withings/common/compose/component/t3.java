package com.withings.common.compose.component;

import android.content.Context;
import androidx.compose.material3.f8;
import androidx.compose.material3.g8;
import androidx.compose.runtime.a;
import androidx.lifecycle.Lifecycle;
import pa.m;
/* compiled from: SecondaryTrendCard.kt */
/* loaded from: classes3.dex */
public final class t3 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SecondaryTrendCard.kt */
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.l<k1.w, k1.v> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k1.o1<androidx.lifecycle.d0> f34728a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k1.r0<Boolean> f34729b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k1.r0 r0Var, k1.r0 r0Var2) {
            super(1);
            this.f34728a = r0Var;
            this.f34729b = r0Var2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [com.withings.common.compose.component.r3, androidx.lifecycle.c0] */
        @Override // ym0.l
        public final k1.v invoke(k1.w wVar) {
            k1.w DisposableEffect = wVar;
            kotlin.jvm.internal.u.j(DisposableEffect, "$this$DisposableEffect");
            Lifecycle lifecycle = this.f34728a.getValue().getLifecycle();
            final k1.r0<Boolean> r0Var = this.f34729b;
            ?? r02 = new androidx.lifecycle.b0() { // from class: com.withings.common.compose.component.r3
                @Override // androidx.lifecycle.b0
                public final void d(androidx.lifecycle.d0 d0Var, Lifecycle.Event event) {
                    k1.r0 playLottie = k1.r0.this;
                    kotlin.jvm.internal.u.j(playLottie, "$playLottie");
                    if (event == Lifecycle.Event.ON_RESUME) {
                        playLottie.setValue(Boolean.TRUE);
                    } else if (event == Lifecycle.Event.ON_PAUSE) {
                        playLottie.setValue(Boolean.FALSE);
                    }
                }
            };
            lifecycle.a(r02);
            return new s3(lifecycle, r02);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SecondaryTrendCard.kt */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, nm0.y> f34730a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(s1.a aVar) {
            super(2);
            this.f34730a = aVar;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                this.f34730a.invoke(aVar2, 6);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SecondaryTrendCard.kt */
    /* loaded from: classes3.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m4 f34731a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f34732b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, nm0.y> f34733c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f34734d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(m4 m4Var, String str, s1.a aVar, boolean z5) {
            super(3);
            this.f34731a = m4Var;
            this.f34732b = str;
            this.f34733c = aVar;
            this.f34734d = z5;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x00b8, code lost:
            if (r2 == androidx.compose.runtime.a.C0060a.a()) goto L26;
         */
        @Override // ym0.q
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final nm0.y invoke(r0.h r10, androidx.compose.runtime.a r11, java.lang.Integer r12) {
            /*
                Method dump skipped, instructions count: 299
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.common.compose.component.t3.c.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SecondaryTrendCard.kt */
    /* loaded from: classes3.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f34735a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f34736b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f34737c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f34738d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f34739e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f34740f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ym0.l<Context, nm0.y> f34741g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m4 f34742h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ String f34743i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f34744j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f34745k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(String str, ym0.a<nm0.y> aVar, String str2, androidx.compose.ui.e eVar, String str3, boolean z5, ym0.l<? super Context, nm0.y> lVar, m4 m4Var, String str4, int i11, int i12) {
            super(2);
            this.f34735a = str;
            this.f34736b = aVar;
            this.f34737c = str2;
            this.f34738d = eVar;
            this.f34739e = str3;
            this.f34740f = z5;
            this.f34741g = lVar;
            this.f34742h = m4Var;
            this.f34743i = str4;
            this.f34744j = i11;
            this.f34745k = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f34744j | 1);
            m4 m4Var = this.f34742h;
            String str = this.f34743i;
            t3.a(this.f34735a, this.f34736b, this.f34737c, this.f34738d, this.f34739e, this.f34740f, this.f34741g, m4Var, str, aVar, g11, this.f34745k);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SecondaryTrendCard.kt */
    /* loaded from: classes3.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f34746a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k1.r0<Boolean> f34747b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(k1.r0 r0Var, String str) {
            super(2);
            this.f34746a = str;
            this.f34747b = r0Var;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                String str = this.f34746a;
                if (str != null) {
                    pa.l c11 = pa.y.c(m.a.a(str), null, aVar2, 0, 62);
                    pa.c a11 = pa.b.a(c11.getValue(), this.f34747b.getValue().booleanValue(), false, null, 0.0f, Integer.MAX_VALUE, aVar2, 220);
                    com.airbnb.lottie.i value = c11.getValue();
                    androidx.compose.ui.e a12 = androidx.compose.foundation.layout.w0.a(androidx.collection.c.g(androidx.compose.foundation.layout.e1.e(androidx.compose.ui.e.f8927a, 1.0f), ((f8) aVar2.D(g8.a())).d()), 1.7777778f);
                    aVar2.s(-1181512583);
                    boolean K = aVar2.K(a11);
                    Object t11 = aVar2.t();
                    if (K || t11 == a.C0060a.a()) {
                        t11 = new w3(a11);
                        aVar2.n(t11);
                    }
                    aVar2.J();
                    pa.h.b(value, (ym0.a) t11, a12, false, false, false, null, false, null, null, null, false, aVar2, 8, 0, 4088);
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.String r23, ym0.a<nm0.y> r24, java.lang.String r25, androidx.compose.ui.e r26, java.lang.String r27, boolean r28, ym0.l<? super android.content.Context, nm0.y> r29, com.withings.common.compose.component.m4 r30, java.lang.String r31, androidx.compose.runtime.a r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 635
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.common.compose.component.t3.a(java.lang.String, ym0.a, java.lang.String, androidx.compose.ui.e, java.lang.String, boolean, ym0.l, com.withings.common.compose.component.m4, java.lang.String, androidx.compose.runtime.a, int, int):void");
    }
}
