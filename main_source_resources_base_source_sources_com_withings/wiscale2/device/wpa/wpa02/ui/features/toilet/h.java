package com.withings.wiscale2.device.wpa.wpa02.ui.features.toilet;

import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
/* compiled from: ToiletArmsSizeScreen.kt */
/* loaded from: classes5.dex */
public final class h {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ToiletArmsSizeScreen.kt */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f55373a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f55374b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f55375c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, int i11) {
            super(2);
            this.f55373a = aVar;
            this.f55374b = aVar2;
            this.f55375c = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f55375c | 1);
            h.a(this.f55373a, this.f55374b, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ToiletArmsSizeScreen.kt */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f55376a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f55377b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f55378c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, int i11) {
            super(2);
            this.f55376a = aVar;
            this.f55377b = aVar2;
            this.f55378c = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f55378c | 1);
            h.b(this.f55376a, this.f55377b, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ToiletArmsSizeScreen.kt */
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f55379a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ym0.a<nm0.y> aVar) {
            super(2);
            this.f55379a = aVar;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                com.withings.common.compose.component.l.a(null, ay.b.u(C1987R.string._NEXT_, aVar2), null, false, null, null, false, this.f55379a, aVar2, 0, 125);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ToiletArmsSizeScreen.kt */
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f55380a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f55381b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f55382c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f55383d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f55384e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i11, int i12, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, int i13) {
            super(2);
            this.f55380a = i11;
            this.f55381b = i12;
            this.f55382c = aVar;
            this.f55383d = aVar2;
            this.f55384e = i13;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f55384e | 1);
            ym0.a<nm0.y> aVar2 = this.f55382c;
            ym0.a<nm0.y> aVar3 = this.f55383d;
            h.c(this.f55380a, this.f55381b, aVar2, aVar3, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    public static final void a(ym0.a<nm0.y> onBackClick, ym0.a<nm0.y> onNextButtonClick, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        int i14;
        kotlin.jvm.internal.u.j(onBackClick, "onBackClick");
        kotlin.jvm.internal.u.j(onNextButtonClick, "onNextButtonClick");
        androidx.compose.runtime.b g11 = aVar.g(745331365);
        if ((i11 & 14) == 0) {
            if (g11.w(onBackClick)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(onNextButtonClick)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && g11.h()) {
            g11.C();
        } else {
            int i15 = i12 << 6;
            c(C1987R.string.wpa02_installToilet_arm_title_L, 2131232938, onBackClick, onNextButtonClick, g11, (i15 & ConstantsWs.HWFAILURE_ZERO) | (i15 & 7168));
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new a(onBackClick, onNextButtonClick, i11));
        }
    }

    public static final void b(ym0.a<nm0.y> onBackClick, ym0.a<nm0.y> onNextButtonClick, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        int i14;
        kotlin.jvm.internal.u.j(onBackClick, "onBackClick");
        kotlin.jvm.internal.u.j(onNextButtonClick, "onNextButtonClick");
        androidx.compose.runtime.b g11 = aVar.g(1734979323);
        if ((i11 & 14) == 0) {
            if (g11.w(onBackClick)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(onNextButtonClick)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && g11.h()) {
            g11.C();
        } else {
            int i15 = i12 << 6;
            c(C1987R.string.wpa02_installToilet_arm_title_M, 2131232940, onBackClick, onNextButtonClick, g11, (i15 & ConstantsWs.HWFAILURE_ZERO) | (i15 & 7168));
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new b(onBackClick, onNextButtonClick, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(int i11, int i12, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, androidx.compose.runtime.a aVar3, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        androidx.compose.runtime.b g11 = aVar3.g(-1464596564);
        if ((i13 & 14) == 0) {
            if (g11.c(i11)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i14 = i18 | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 112) == 0) {
            if (g11.c(i12)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i14 |= i17;
        }
        if ((i13 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.w(aVar)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i14 |= i16;
        }
        if ((i13 & 7168) == 0) {
            if (g11.w(aVar2)) {
                i15 = ModuleCopy.f28574b;
            } else {
                i15 = 1024;
            }
            i14 |= i15;
        }
        if ((i14 & 5851) == 1170 && g11.h()) {
            g11.C();
        } else {
            b70.t0.c(ay.b.u(i11, g11), s2.d.a(i12, g11), aVar, s1.b.b(g11, 497295413, new c(aVar2)), null, 0.0f, null, com.withings.wiscale2.device.wpa.wpa02.ui.features.toilet.a.f55345a, g11, (i14 & ConstantsWs.HWFAILURE_ZERO) | 12586048, 112);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new d(i11, i12, aVar, aVar2, i13));
        }
    }
}
