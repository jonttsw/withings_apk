package com.withings.wiscale2.device.wpa.wpa02.ui.features.toilet;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
/* compiled from: ToiletAttachScreen.kt */
/* loaded from: classes5.dex */
public final class i {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ToiletAttachScreen.kt */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f55394a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ym0.a<nm0.y> aVar) {
            super(2);
            this.f55394a = aVar;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                com.withings.common.compose.component.l.a(null, ay.b.u(C1987R.string._NEXT_, aVar2), null, false, null, null, false, this.f55394a, aVar2, 0, 125);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ToiletAttachScreen.kt */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f55395a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f55396b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f55397c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, int i11) {
            super(2);
            this.f55395a = aVar;
            this.f55396b = aVar2;
            this.f55397c = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f55397c | 1);
            i.a(this.f55395a, this.f55396b, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    public static final void a(ym0.a<nm0.y> onBackClick, ym0.a<nm0.y> onNextButtonClick, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        int i14;
        kotlin.jvm.internal.u.j(onBackClick, "onBackClick");
        kotlin.jvm.internal.u.j(onNextButtonClick, "onNextButtonClick");
        androidx.compose.runtime.b g11 = aVar.g(-285697530);
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
            b70.t0.c(ay.b.u(C1987R.string.wpa02_installToilet_place_title, g11), s2.d.a(2131232944, g11), onBackClick, s1.b.b(g11, 589985807, new a(onNextButtonClick)), null, 0.0f, null, com.withings.wiscale2.device.wpa.wpa02.ui.features.toilet.b.f55348a, g11, ((i12 << 6) & ConstantsWs.HWFAILURE_ZERO) | 12586048, 112);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new b(onBackClick, onNextButtonClick, i11));
        }
    }
}
