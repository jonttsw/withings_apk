package com.withings.notifications.ui;

import androidx.compose.ui.e;
import com.withings.library.authentication.api.ConstantsWs;
/* compiled from: NotificationStack.kt */
/* loaded from: classes4.dex */
public final class m {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationStack.kt */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f42975a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f42976b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.q<r0.c, androidx.compose.runtime.a, Integer, nm0.y> f42977c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f42978d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f42979e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.ui.e eVar, int i11, ym0.q<? super r0.c, ? super androidx.compose.runtime.a, ? super Integer, nm0.y> qVar, int i12, int i13) {
            super(2);
            this.f42975a = eVar;
            this.f42976b = i11;
            this.f42977c = qVar;
            this.f42978d = i12;
            this.f42979e = i13;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f42978d | 1);
            int i11 = this.f42976b;
            ym0.q<r0.c, androidx.compose.runtime.a, Integer, nm0.y> qVar = this.f42977c;
            m.a(this.f42975a, i11, qVar, aVar, g11, this.f42979e);
            return nm0.y.f85009a;
        }
    }

    public static final void a(androidx.compose.ui.e eVar, int i11, ym0.q<? super r0.c, ? super androidx.compose.runtime.a, ? super Integer, nm0.y> content, androidx.compose.runtime.a aVar, int i12, int i13) {
        Object obj;
        int i14;
        int i15;
        int i16;
        int i17;
        e.a aVar2;
        int i18;
        androidx.compose.runtime.b bVar;
        kotlin.jvm.internal.u.j(content, "content");
        androidx.compose.runtime.b g11 = aVar.g(2091592573);
        int i19 = i13 & 1;
        if (i19 != 0) {
            i14 = i12 | 6;
            obj = eVar;
        } else if ((i12 & 14) == 0) {
            obj = eVar;
            if (g11.K(obj)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i14 = i15 | i12;
        } else {
            obj = eVar;
            i14 = i12;
        }
        if ((i13 & 2) != 0) {
            i14 |= 48;
        } else if ((i12 & 112) == 0) {
            if (g11.c(i11)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i14 |= i16;
        }
        if ((i13 & 4) != 0) {
            i14 |= ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED;
        } else if ((i12 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.w(content)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i14 |= i17;
        }
        if ((i14 & 731) == 146 && g11.h()) {
            g11.C();
            aVar2 = obj;
            bVar = g11;
        } else {
            if (i19 != 0) {
                aVar2 = androidx.compose.ui.e.f8927a;
            } else {
                aVar2 = obj;
            }
            x0.g b10 = x0.h.b(wj.g.c());
            float f11 = (float) 6.5d;
            float o11 = yk.h.o();
            float f12 = 4;
            if (i11 > 2) {
                i18 = 2;
            } else {
                i18 = i11;
            }
            bVar = g11;
            wj.b.a(aVar2, content, i18, b10, o11, f11, 30, f12, 0L, g11, 14352384 | (i14 & 14) | ((i14 >> 3) & 112), 256);
        }
        androidx.compose.runtime.v o02 = bVar.o0();
        if (o02 != null) {
            o02.G(new a(aVar2, i11, content, i12, i13));
        }
    }
}
