package com.withings.common.compose.component;

import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import x1.b;
import x1.d;
/* compiled from: HorizontalPager.kt */
/* loaded from: classes3.dex */
public final class f2 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HorizontalPager.kt */
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.r<u0.d0, Integer, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i2 f33759a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k1.r0<k3.h> f33760b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k3.d f33761c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i2 i2Var, k1.r0<k3.h> r0Var, k3.d dVar) {
            super(4);
            this.f33759a = i2Var;
            this.f33760b = r0Var;
            this.f33761c = dVar;
        }

        @Override // ym0.r
        public final nm0.y invoke(u0.d0 d0Var, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
            u0.d0 HorizontalPager = d0Var;
            int intValue = num.intValue();
            androidx.compose.runtime.a aVar2 = aVar;
            num2.intValue();
            kotlin.jvm.internal.u.j(HorizontalPager, "$this$HorizontalPager");
            ym0.q qVar = (ym0.q) this.f33759a.c().get(intValue);
            e.a aVar3 = androidx.compose.ui.e.f8927a;
            k1.r0<k3.h> r0Var = this.f33760b;
            androidx.compose.ui.e h11 = androidx.compose.foundation.layout.e1.h(aVar3, r0Var.getValue().e(), 0.0f, 2);
            aVar2.s(-554398617);
            k3.d dVar = this.f33761c;
            boolean K = aVar2.K(dVar);
            Object t11 = aVar2.t();
            if (K || t11 == a.C0060a.a()) {
                t11 = new e2(dVar, r0Var);
                aVar2.n(t11);
            }
            aVar2.J();
            qVar.invoke(androidx.compose.ui.layout.u0.a(h11, (ym0.l) t11), aVar2, 0);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HorizontalPager.kt */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f33762a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f33763b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ r0.w f33764c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ r0.w f33765d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ b.c f33766e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b.InterfaceC1838b f33767f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f33768g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ym0.l<g2, nm0.y> f33769h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f33770i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f33771j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(androidx.compose.ui.e eVar, float f11, r0.w wVar, r0.w wVar2, b.c cVar, b.InterfaceC1838b interfaceC1838b, boolean z5, ym0.l<? super g2, nm0.y> lVar, int i11, int i12) {
            super(2);
            this.f33762a = eVar;
            this.f33763b = f11;
            this.f33764c = wVar;
            this.f33765d = wVar2;
            this.f33766e = cVar;
            this.f33767f = interfaceC1838b;
            this.f33768g = z5;
            this.f33769h = lVar;
            this.f33770i = i11;
            this.f33771j = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f33770i | 1);
            boolean z5 = this.f33768g;
            ym0.l<g2, nm0.y> lVar = this.f33769h;
            f2.a(this.f33762a, this.f33763b, this.f33764c, this.f33765d, this.f33766e, this.f33767f, z5, lVar, aVar, g11, this.f33771j);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HorizontalPager.kt */
    /* loaded from: classes3.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.a<r0.w> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i2 f33772a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b.InterfaceC1838b f33773b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f33774c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f33775d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ float f33776e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ r0.w f33777f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ u0.i0 f33778g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(i2 i2Var, b.InterfaceC1838b interfaceC1838b, float f11, float f12, float f13, r0.w wVar, u0.k0 k0Var) {
            super(0);
            this.f33772a = i2Var;
            this.f33773b = interfaceC1838b;
            this.f33774c = f11;
            this.f33775d = f12;
            this.f33776e = f13;
            this.f33777f = wVar;
            this.f33778g = k0Var;
        }

        @Override // ym0.a
        public final r0.w invoke() {
            i2 i2Var = this.f33772a;
            int size = i2Var.c().size();
            float f11 = this.f33776e;
            float f12 = this.f33774c;
            r0.w wVar = this.f33777f;
            float f13 = this.f33775d;
            if (size == 1) {
                d.a k11 = b.a.k();
                b.InterfaceC1838b interfaceC1838b = this.f33773b;
                if (kotlin.jvm.internal.u.e(interfaceC1838b, k11)) {
                    return androidx.compose.foundation.layout.x0.b(f12, 0.0f, f13 - f12, 0.0f, 10);
                }
                if (kotlin.jvm.internal.u.e(interfaceC1838b, b.a.j())) {
                    return androidx.compose.foundation.layout.x0.b(f13 - f11, 0.0f, f11, 0.0f, 10);
                }
                return wVar;
            }
            u0.i0 i0Var = this.f33778g;
            if (i0Var.s() == 0) {
                return androidx.compose.foundation.layout.x0.b(f12, 0.0f, f13 - f12, 0.0f, 10);
            }
            if (i0Var.s() == kotlin.collections.x.M(i2Var.c())) {
                return androidx.compose.foundation.layout.x0.b(f13 - f11, 0.0f, f11, 0.0f, 10);
            }
            return wVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HorizontalPager.kt */
    /* loaded from: classes3.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i2 f33779a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(i2 i2Var) {
            super(0);
            this.f33779a = i2Var;
        }

        @Override // ym0.a
        public final Integer invoke() {
            return Integer.valueOf(this.f33779a.c().size());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.ui.e r30, float r31, r0.w r32, r0.w r33, x1.b.c r34, x1.b.InterfaceC1838b r35, boolean r36, ym0.l<? super com.withings.common.compose.component.g2, nm0.y> r37, androidx.compose.runtime.a r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 621
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.common.compose.component.f2.a(androidx.compose.ui.e, float, r0.w, r0.w, x1.b$c, x1.b$b, boolean, ym0.l, androidx.compose.runtime.a, int, int):void");
    }
}
