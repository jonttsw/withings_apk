package com.withings.wiscale2.device.wpa.wpa02.ui.features.cartridge;

import android.content.Context;
import androidx.compose.ui.platform.u0;
import com.withings.wiscale2.C1987R;
/* compiled from: CartridgeSearchingDeviceScreen.kt */
/* loaded from: classes5.dex */
public final class h {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CartridgeSearchingDeviceScreen.kt */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f55179a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context) {
            super(2);
            this.f55179a = context;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                com.withings.common.compose.component.l.c(null, ay.b.u(C1987R.string.wpa02_cartridge_install_getSupport, aVar2), null, false, null, null, false, new g(this.f55179a), aVar2, 0, 125);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CartridgeSearchingDeviceScreen.kt */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f55180a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f55181b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ym0.a<nm0.y> aVar, int i11) {
            super(2);
            this.f55180a = aVar;
            this.f55181b = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f55181b | 1);
            h.a(this.f55180a, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    public static final void a(ym0.a<nm0.y> onBack, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        androidx.compose.runtime.b bVar;
        int i13;
        kotlin.jvm.internal.u.j(onBack, "onBack");
        androidx.compose.runtime.b g11 = aVar.g(1579945078);
        if ((i11 & 14) == 0) {
            if (g11.w(onBack)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 11) == 2 && g11.h()) {
            g11.C();
            bVar = g11;
        } else {
            float o11 = yk.h.o();
            float q11 = yk.h.q();
            bVar = g11;
            wk.c0.b(null, null, null, onBack, null, m.f55206a, s1.b.b(g11, 349824747, new a((Context) g11.D(u0.d()))), null, 0L, false, new r0.x(o11, q11, o11, q11), null, 0.0f, false, m.f55207b, bVar, ((i12 << 9) & 7168) | 1769472, 24576, 15255);
        }
        androidx.compose.runtime.v o02 = bVar.o0();
        if (o02 != null) {
            o02.G(new b(onBack, i11));
        }
    }
}
