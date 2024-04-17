package com.withings.common.compose.component;

import com.huawei.hms.analytics.instance.CallBack;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.withings.library.authentication.api.ConstantsWs;
/* compiled from: ScrollableTabRow.kt */
/* loaded from: classes3.dex */
public final class t4 {

    /* renamed from: a  reason: collision with root package name */
    public static final t4 f34748a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static final float f34749b = 1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ScrollableTabRow.kt */
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f34751b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f34752c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f34753d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f34754e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f34755f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.e eVar, float f11, long j5, int i11, int i12) {
            super(2);
            this.f34751b = eVar;
            this.f34752c = f11;
            this.f34753d = j5;
            this.f34754e = i11;
            this.f34755f = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f34754e | 1);
            float f11 = this.f34752c;
            long j5 = this.f34753d;
            t4.this.a(this.f34751b, f11, j5, aVar, g11, this.f34755f);
            return nm0.y.f85009a;
        }
    }

    public final void a(androidx.compose.ui.e eVar, float f11, long j5, androidx.compose.runtime.a aVar, int i11, int i12) {
        Object obj;
        int i13;
        int i14;
        float f12;
        long j11;
        int i15;
        androidx.compose.ui.e eVar2;
        float f13;
        long l5;
        float f14;
        int i16;
        int i17;
        androidx.compose.runtime.b g11 = aVar.g(967673640);
        int i18 = i12 & 1;
        if (i18 != 0) {
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
        if ((i11 & 112) == 0) {
            if ((i12 & 2) == 0) {
                f12 = f11;
                if (g11.b(f12)) {
                    i17 = 32;
                    i13 |= i17;
                }
            } else {
                f12 = f11;
            }
            i17 = 16;
            i13 |= i17;
        } else {
            f12 = f11;
        }
        if ((i11 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            j11 = j5;
            if ((i12 & 4) == 0 && g11.d(j11)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i13 |= i16;
        } else {
            j11 = j5;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 7168) == 0) {
            if (g11.K(this)) {
                i15 = ModuleCopy.f28574b;
            } else {
                i15 = 1024;
            }
            i13 |= i15;
        }
        if ((i13 & 5851) == 1170 && g11.h()) {
            g11.C();
            f14 = f12;
            l5 = j11;
        } else {
            g11.M0();
            if ((i11 & 1) != 0 && !g11.v0()) {
                g11.C();
                if ((i12 & 2) != 0) {
                    i13 &= CallBack.OAID_TRACKING_OFF;
                }
                if ((i12 & 4) != 0) {
                    i13 &= -897;
                }
                eVar2 = obj;
                f13 = f12;
            } else {
                if (i18 != 0) {
                    eVar2 = androidx.compose.ui.e.f8927a;
                } else {
                    eVar2 = obj;
                }
                if ((i12 & 2) != 0) {
                    i13 &= CallBack.OAID_TRACKING_OFF;
                    f13 = f34749b;
                } else {
                    f13 = f12;
                }
                if ((i12 & 4) != 0) {
                    l5 = d2.f0.l(((d2.f0) g11.D(androidx.compose.material3.o1.a())).t(), 0.12f);
                    i13 &= -897;
                    g11.l0();
                    androidx.compose.material.b2.a(f13, 0.0f, (i13 & 14) | ((i13 >> 3) & 112) | ((i13 << 3) & ConstantsWs.HWFAILURE_ZERO), 8, l5, g11, eVar2);
                    f14 = f13;
                    obj = eVar2;
                }
            }
            l5 = j11;
            g11.l0();
            androidx.compose.material.b2.a(f13, 0.0f, (i13 & 14) | ((i13 >> 3) & 112) | ((i13 << 3) & ConstantsWs.HWFAILURE_ZERO), 8, l5, g11, eVar2);
            f14 = f13;
            obj = eVar2;
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new a(obj, f14, l5, i11, i12));
        }
    }
}
