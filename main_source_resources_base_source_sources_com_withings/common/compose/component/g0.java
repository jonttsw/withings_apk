package com.withings.common.compose.component;
/* compiled from: AdaptableHorizontalContent.kt */
/* loaded from: classes3.dex */
public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    public static s1.a f33800a = new s1.a(false, 426246337, a.f33802a);

    /* renamed from: b  reason: collision with root package name */
    public static s1.a f33801b = new s1.a(false, 1866979678, b.f33803a);

    /* compiled from: AdaptableHorizontalContent.kt */
    /* loaded from: classes3.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.r<androidx.compose.ui.e, ym0.q<? super androidx.compose.ui.e, ? super androidx.compose.runtime.a, ? super Integer, ? extends nm0.y>, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f33802a = new kotlin.jvm.internal.w(4);

        @Override // ym0.r
        public final nm0.y invoke(androidx.compose.ui.e eVar, ym0.q<? super androidx.compose.ui.e, ? super androidx.compose.runtime.a, ? super Integer, ? extends nm0.y> qVar, androidx.compose.runtime.a aVar, Integer num) {
            int i11;
            int i12;
            int i13;
            androidx.compose.ui.e itemModifier = eVar;
            ym0.q<? super androidx.compose.ui.e, ? super androidx.compose.runtime.a, ? super Integer, ? extends nm0.y> itemCard = qVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(itemModifier, "itemModifier");
            kotlin.jvm.internal.u.j(itemCard, "itemCard");
            if ((intValue & 14) == 0) {
                if (aVar2.K(itemModifier)) {
                    i13 = 4;
                } else {
                    i13 = 2;
                }
                i11 = i13 | intValue;
            } else {
                i11 = intValue;
            }
            if ((intValue & 112) == 0) {
                if (aVar2.w(itemCard)) {
                    i12 = 32;
                } else {
                    i12 = 16;
                }
                i11 |= i12;
            }
            if ((i11 & 731) == 146 && aVar2.h()) {
                aVar2.C();
            } else {
                itemCard.invoke(itemModifier, aVar2, Integer.valueOf((i11 & 14) | (i11 & 112)));
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: AdaptableHorizontalContent.kt */
    /* loaded from: classes3.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.r<androidx.compose.ui.e, ym0.q<? super androidx.compose.ui.e, ? super androidx.compose.runtime.a, ? super Integer, ? extends nm0.y>, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f33803a = new kotlin.jvm.internal.w(4);

        @Override // ym0.r
        public final nm0.y invoke(androidx.compose.ui.e eVar, ym0.q<? super androidx.compose.ui.e, ? super androidx.compose.runtime.a, ? super Integer, ? extends nm0.y> qVar, androidx.compose.runtime.a aVar, Integer num) {
            int i11;
            int i12;
            int i13;
            androidx.compose.ui.e itemModifier = eVar;
            ym0.q<? super androidx.compose.ui.e, ? super androidx.compose.runtime.a, ? super Integer, ? extends nm0.y> itemCard = qVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(itemModifier, "itemModifier");
            kotlin.jvm.internal.u.j(itemCard, "itemCard");
            if ((intValue & 14) == 0) {
                if (aVar2.K(itemModifier)) {
                    i13 = 4;
                } else {
                    i13 = 2;
                }
                i11 = i13 | intValue;
            } else {
                i11 = intValue;
            }
            if ((intValue & 112) == 0) {
                if (aVar2.w(itemCard)) {
                    i12 = 32;
                } else {
                    i12 = 16;
                }
                i11 |= i12;
            }
            if ((i11 & 731) == 146 && aVar2.h()) {
                aVar2.C();
            } else {
                itemCard.invoke(itemModifier, aVar2, Integer.valueOf((i11 & 14) | (i11 & 112)));
            }
            return nm0.y.f85009a;
        }
    }
}
