package com.withings.common.compose.component;

import com.withings.library.authentication.api.ConstantsWs;
/* compiled from: RadioGroup.kt */
/* loaded from: classes3.dex */
public final class n0 {

    /* renamed from: a  reason: collision with root package name */
    public static s1.a f34104a = new s1.a(false, -1696803293, a.f34105a);

    /* compiled from: RadioGroup.kt */
    /* loaded from: classes3.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.r<String, d2.f0, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f34105a = new kotlin.jvm.internal.w(4);

        @Override // ym0.r
        public final nm0.y invoke(String str, d2.f0 f0Var, androidx.compose.runtime.a aVar, Integer num) {
            int i11;
            int i12;
            int i13;
            String text = str;
            long t11 = f0Var.t();
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(text, "text");
            if ((intValue & 14) == 0) {
                if (aVar2.K(text)) {
                    i13 = 4;
                } else {
                    i13 = 2;
                }
                i11 = i13 | intValue;
            } else {
                i11 = intValue;
            }
            if ((intValue & 112) == 0) {
                if (aVar2.d(t11)) {
                    i12 = 32;
                } else {
                    i12 = 16;
                }
                i11 |= i12;
            }
            if ((i11 & 731) == 146 && aVar2.h()) {
                aVar2.C();
            } else {
                int i14 = i11 << 3;
                nk.a.d(null, text, t11, null, 0, 0, null, aVar2, (i14 & 112) | (i14 & ConstantsWs.HWFAILURE_ZERO), 121);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: RadioGroup.kt */
    /* loaded from: classes3.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.r<String, d2.f0, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f34106a = new kotlin.jvm.internal.w(4);

        @Override // ym0.r
        public final nm0.y invoke(String str, d2.f0 f0Var, androidx.compose.runtime.a aVar, Integer num) {
            int i11;
            String text = str;
            f0Var.t();
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(text, "text");
            if ((intValue & 14) == 0) {
                if (aVar2.K(text)) {
                    i11 = 4;
                } else {
                    i11 = 2;
                }
                intValue |= i11;
            }
            if ((intValue & 651) == 130 && aVar2.h()) {
                aVar2.C();
            } else {
                nk.a0.i(0, (intValue << 3) & 112, 29, 0L, aVar2, null, null, text);
            }
            return nm0.y.f85009a;
        }
    }
}
