package com.withings.common.compose.component;

import d2.g0;
/* compiled from: Glyph.kt */
/* loaded from: classes3.dex */
public final class n1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Glyph.kt */
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.l<f2.c, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k1.r0<Boolean> f34107a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k1.r0<Boolean> r0Var) {
            super(1);
            this.f34107a = r0Var;
        }

        @Override // ym0.l
        public final nm0.y invoke(f2.c cVar) {
            f2.c drawWithContent = cVar;
            kotlin.jvm.internal.u.j(drawWithContent, "$this$drawWithContent");
            if (this.f34107a.getValue().booleanValue()) {
                drawWithContent.r1();
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Glyph.kt */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.l<androidx.compose.ui.text.b0, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k1.r0<k3.s> f34108a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k1.r0<Boolean> f34109b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(k1.r0<k3.s> r0Var, k1.r0<Boolean> r0Var2) {
            super(1);
            this.f34108a = r0Var;
            this.f34109b = r0Var2;
        }

        @Override // ym0.l
        public final nm0.y invoke(androidx.compose.ui.text.b0 b0Var) {
            androidx.compose.ui.text.b0 textLayoutResult = b0Var;
            kotlin.jvm.internal.u.j(textLayoutResult, "textLayoutResult");
            if (textLayoutResult.h()) {
                k1.r0<k3.s> r0Var = this.f34108a;
                long l5 = n1.l(r0Var);
                if (!androidx.camera.camera2.internal.s2.q(l5)) {
                    r0Var.setValue(k3.s.b(androidx.camera.camera2.internal.s2.r(1095216660480L & l5, (float) (k3.s.e(l5) * 0.95d))));
                } else {
                    throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
                }
            } else {
                this.f34109b.setValue(Boolean.TRUE);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Glyph.kt */
    /* loaded from: classes3.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f34110a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f34111b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f34112c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f34113d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f34114e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, androidx.compose.ui.e eVar, float f11, int i11, int i12) {
            super(2);
            this.f34110a = str;
            this.f34111b = eVar;
            this.f34112c = f11;
            this.f34113d = i11;
            this.f34114e = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f34113d | 1);
            androidx.compose.ui.e eVar = this.f34111b;
            float f11 = this.f34112c;
            n1.a(this.f34110a, eVar, f11, aVar, g11, this.f34114e);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Glyph.kt */
    /* loaded from: classes3.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.l<androidx.compose.ui.text.b0, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f34115a = new kotlin.jvm.internal.w(1);

        @Override // ym0.l
        public final nm0.y invoke(androidx.compose.ui.text.b0 b0Var) {
            androidx.compose.ui.text.b0 it = b0Var;
            kotlin.jvm.internal.u.j(it, "it");
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Glyph.kt */
    /* loaded from: classes3.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f34116a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f34117b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f34118c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f34119d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.l<androidx.compose.ui.text.b0, nm0.y> f34120e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f34121f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f34122g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(String str, long j5, androidx.compose.ui.e eVar, long j11, ym0.l<? super androidx.compose.ui.text.b0, nm0.y> lVar, int i11, int i12) {
            super(2);
            this.f34116a = str;
            this.f34117b = j5;
            this.f34118c = eVar;
            this.f34119d = j11;
            this.f34120e = lVar;
            this.f34121f = i11;
            this.f34122g = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f34121f | 1);
            long j5 = this.f34119d;
            ym0.l<androidx.compose.ui.text.b0, nm0.y> lVar = this.f34120e;
            n1.c(this.f34116a, this.f34117b, this.f34118c, j5, lVar, aVar, g11, this.f34122g);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Glyph.kt */
    /* loaded from: classes3.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ qk.a f34123a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f34124b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f34125c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f34126d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f34127e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f34128f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(qk.a aVar, androidx.compose.ui.e eVar, long j5, int i11, int i12, int i13) {
            super(2);
            this.f34123a = aVar;
            this.f34124b = eVar;
            this.f34125c = j5;
            this.f34126d = i11;
            this.f34127e = i12;
            this.f34128f = i13;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f34127e | 1);
            long j5 = this.f34125c;
            int i11 = this.f34126d;
            n1.b(this.f34123a, this.f34124b, j5, i11, aVar, g11, this.f34128f);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Glyph.kt */
    /* loaded from: classes3.dex */
    public static final class g extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f34129a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f34130b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f34131c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f34132d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f34133e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, long j5, androidx.compose.ui.e eVar, int i11, int i12) {
            super(2);
            this.f34129a = str;
            this.f34130b = j5;
            this.f34131c = eVar;
            this.f34132d = i11;
            this.f34133e = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f34132d | 1);
            long j5 = this.f34130b;
            androidx.compose.ui.e eVar = this.f34131c;
            n1.d(this.f34129a, j5, eVar, aVar, g11, this.f34133e);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Glyph.kt */
    /* loaded from: classes3.dex */
    public static final class h extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ qk.a f34134a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f34135b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f34136c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f34137d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f34138e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f34139f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f34140g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(qk.a aVar, androidx.compose.ui.e eVar, float f11, long j5, long j11, int i11, int i12) {
            super(2);
            this.f34134a = aVar;
            this.f34135b = eVar;
            this.f34136c = f11;
            this.f34137d = j5;
            this.f34138e = j11;
            this.f34139f = i11;
            this.f34140g = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f34139f | 1);
            long j5 = this.f34137d;
            long j11 = this.f34138e;
            n1.j(this.f34134a, this.f34135b, this.f34136c, j5, j11, aVar, g11, this.f34140g);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Glyph.kt */
    /* loaded from: classes3.dex */
    public static final class i extends kotlin.jvm.internal.w implements ym0.l<androidx.compose.ui.text.b0, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f34141a = new kotlin.jvm.internal.w(1);

        @Override // ym0.l
        public final nm0.y invoke(androidx.compose.ui.text.b0 b0Var) {
            androidx.compose.ui.text.b0 it = b0Var;
            kotlin.jvm.internal.u.j(it, "it");
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Glyph.kt */
    /* loaded from: classes3.dex */
    public static final class j extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f34142a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f34143b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f34144c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.l<androidx.compose.ui.text.b0, nm0.y> f34145d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(String str, long j5, long j11, ym0.l<? super androidx.compose.ui.text.b0, nm0.y> lVar) {
            super(2);
            this.f34142a = str;
            this.f34143b = j5;
            this.f34144c = j11;
            this.f34145d = lVar;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                n1.c(this.f34142a, this.f34143b, null, this.f34144c, this.f34145d, aVar2, 0, 4);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Glyph.kt */
    /* loaded from: classes3.dex */
    public static final class k extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f34146a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f34147b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f34148c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f34149d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ float f34150e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f34151f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ym0.l<androidx.compose.ui.text.b0, nm0.y> f34152g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f34153h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f34154i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k(String str, long j5, long j11, androidx.compose.ui.e eVar, float f11, long j12, ym0.l<? super androidx.compose.ui.text.b0, nm0.y> lVar, int i11, int i12) {
            super(2);
            this.f34146a = str;
            this.f34147b = j5;
            this.f34148c = j11;
            this.f34149d = eVar;
            this.f34150e = f11;
            this.f34151f = j12;
            this.f34152g = lVar;
            this.f34153h = i11;
            this.f34154i = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f34153h | 1);
            long j5 = this.f34151f;
            ym0.l<androidx.compose.ui.text.b0, nm0.y> lVar = this.f34152g;
            n1.i(this.f34146a, this.f34147b, this.f34148c, this.f34149d, this.f34150e, j5, lVar, aVar, g11, this.f34154i);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Glyph.kt */
    /* loaded from: classes3.dex */
    public static final class l extends kotlin.jvm.internal.w implements ym0.l<androidx.compose.ui.text.b0, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f34155a = new kotlin.jvm.internal.w(1);

        @Override // ym0.l
        public final nm0.y invoke(androidx.compose.ui.text.b0 b0Var) {
            androidx.compose.ui.text.b0 it = b0Var;
            kotlin.jvm.internal.u.j(it, "it");
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Glyph.kt */
    /* loaded from: classes3.dex */
    public static final class m extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f34156a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f34157b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.l<androidx.compose.ui.text.b0, nm0.y> f34158c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        m(String str, long j5, ym0.l<? super androidx.compose.ui.text.b0, nm0.y> lVar) {
            super(2);
            this.f34156a = str;
            this.f34157b = j5;
            this.f34158c = lVar;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                n1.c(this.f34156a, ((androidx.compose.material.c1) aVar2.D(androidx.compose.material.d1.c())).f(), null, this.f34157b, this.f34158c, aVar2, 0, 4);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Glyph.kt */
    /* loaded from: classes3.dex */
    public static final class n extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f34159a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f34160b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f34161c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f34162d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.l<androidx.compose.ui.text.b0, nm0.y> f34163e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f34164f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f34165g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        n(String str, androidx.compose.ui.e eVar, float f11, long j5, ym0.l<? super androidx.compose.ui.text.b0, nm0.y> lVar, int i11, int i12) {
            super(2);
            this.f34159a = str;
            this.f34160b = eVar;
            this.f34161c = f11;
            this.f34162d = j5;
            this.f34163e = lVar;
            this.f34164f = i11;
            this.f34165g = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f34164f | 1);
            long j5 = this.f34162d;
            ym0.l<androidx.compose.ui.text.b0, nm0.y> lVar = this.f34163e;
            n1.h(this.f34159a, this.f34160b, this.f34161c, j5, lVar, aVar, g11, this.f34165g);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Glyph.kt */
    /* loaded from: classes3.dex */
    public static final class o extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g2.c f34166a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(g2.c cVar) {
            super(2);
            this.f34166a = cVar;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                n0.z.a(this.f34166a, null, null, null, null, 0.0f, g0.a.a(5, ((androidx.compose.material.c1) aVar2.D(androidx.compose.material.d1.c())).f()), aVar2, 56, 60);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Glyph.kt */
    /* loaded from: classes3.dex */
    public static final class p extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g2.c f34167a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f34168b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f34169c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f34170d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f34171e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(g2.c cVar, androidx.compose.ui.e eVar, float f11, int i11, int i12) {
            super(2);
            this.f34167a = cVar;
            this.f34168b = eVar;
            this.f34169c = f11;
            this.f34170d = i11;
            this.f34171e = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f34170d | 1);
            androidx.compose.ui.e eVar = this.f34168b;
            float f11 = this.f34169c;
            n1.g(this.f34167a, eVar, f11, aVar, g11, this.f34171e);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Glyph.kt */
    /* loaded from: classes3.dex */
    public static final class q extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ qk.a f34172a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f34173b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(qk.a aVar, long j5) {
            super(2);
            this.f34172a = aVar;
            this.f34173b = j5;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                n1.b(this.f34172a, null, this.f34173b, 0, aVar2, 0, 10);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Glyph.kt */
    /* loaded from: classes3.dex */
    public static final class r extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f34174a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f34175b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(String str, long j5) {
            super(2);
            this.f34174a = str;
            this.f34175b = j5;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                n1.d(this.f34174a, this.f34175b, null, aVar2, 0, 4);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Glyph.kt */
    /* loaded from: classes3.dex */
    public static final class s extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f34176a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f34177b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f34178c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f34179d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f34180e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f34181f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f34182g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(String str, androidx.compose.ui.e eVar, float f11, long j5, long j11, int i11, int i12) {
            super(2);
            this.f34176a = str;
            this.f34177b = eVar;
            this.f34178c = f11;
            this.f34179d = j5;
            this.f34180e = j11;
            this.f34181f = i11;
            this.f34182g = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f34181f | 1);
            long j5 = this.f34179d;
            long j11 = this.f34180e;
            n1.k(this.f34176a, this.f34177b, this.f34178c, j5, j11, aVar, g11, this.f34182g);
            return nm0.y.f85009a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.String r14, androidx.compose.ui.e r15, float r16, androidx.compose.runtime.a r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.common.compose.component.n1.a(java.lang.String, androidx.compose.ui.e, float, androidx.compose.runtime.a, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(qk.a r19, androidx.compose.ui.e r20, long r21, int r23, androidx.compose.runtime.a r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.common.compose.component.n1.b(qk.a, androidx.compose.ui.e, long, int, androidx.compose.runtime.a, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(java.lang.String r43, long r44, androidx.compose.ui.e r46, long r47, ym0.l<? super androidx.compose.ui.text.b0, nm0.y> r49, androidx.compose.runtime.a r50, int r51, int r52) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.common.compose.component.n1.c(java.lang.String, long, androidx.compose.ui.e, long, ym0.l, androidx.compose.runtime.a, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(java.lang.String r16, long r17, androidx.compose.ui.e r19, androidx.compose.runtime.a r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.common.compose.component.n1.d(java.lang.String, long, androidx.compose.ui.e, androidx.compose.runtime.a, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(float r15, int r16, int r17, long r18, androidx.compose.runtime.a r20, androidx.compose.ui.e r21, ym0.p r22) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.common.compose.component.n1.e(float, int, int, long, androidx.compose.runtime.a, androidx.compose.ui.e, ym0.p):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(float r15, int r16, int r17, long r18, androidx.compose.runtime.a r20, androidx.compose.ui.e r21, ym0.p r22) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.common.compose.component.n1.f(float, int, int, long, androidx.compose.runtime.a, androidx.compose.ui.e, ym0.p):void");
    }

    public static final void g(g2.c glyph, androidx.compose.ui.e eVar, float f11, androidx.compose.runtime.a aVar, int i11, int i12) {
        kotlin.jvm.internal.u.j(glyph, "glyph");
        androidx.compose.runtime.b g11 = aVar.g(-1010997880);
        if ((i12 & 2) != 0) {
            eVar = androidx.compose.ui.e.f8927a;
        }
        if ((i12 & 4) != 0) {
            f11 = yk.h.n();
        }
        int i13 = i11 >> 3;
        int i14 = (i13 & 14) | 3072 | (i13 & 112);
        f(f11, i14, 4, 0L, g11, eVar, s1.b.b(g11, -725707040, new o(glyph)));
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new p(glyph, eVar, f11, i11, i12));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(java.lang.String r18, androidx.compose.ui.e r19, float r20, long r21, ym0.l<? super androidx.compose.ui.text.b0, nm0.y> r23, androidx.compose.runtime.a r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.common.compose.component.n1.h(java.lang.String, androidx.compose.ui.e, float, long, ym0.l, androidx.compose.runtime.a, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(java.lang.String r25, long r26, long r28, androidx.compose.ui.e r30, float r31, long r32, ym0.l<? super androidx.compose.ui.text.b0, nm0.y> r34, androidx.compose.runtime.a r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.common.compose.component.n1.i(java.lang.String, long, long, androidx.compose.ui.e, float, long, ym0.l, androidx.compose.runtime.a, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(qk.a r19, androidx.compose.ui.e r20, float r21, long r22, long r24, androidx.compose.runtime.a r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.common.compose.component.n1.j(qk.a, androidx.compose.ui.e, float, long, long, androidx.compose.runtime.a, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(java.lang.String r19, androidx.compose.ui.e r20, float r21, long r22, long r24, androidx.compose.runtime.a r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.common.compose.component.n1.k(java.lang.String, androidx.compose.ui.e, float, long, long, androidx.compose.runtime.a, int, int):void");
    }

    public static final long l(k1.r0 r0Var) {
        return ((k3.s) r0Var.getValue()).g();
    }
}
