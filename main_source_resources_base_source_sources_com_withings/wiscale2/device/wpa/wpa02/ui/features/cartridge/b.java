package com.withings.wiscale2.device.wpa.wpa02.ui.features.cartridge;

import androidx.compose.material3.i1;
import androidx.compose.material3.j1;
/* compiled from: CartridgeInsertScreen.kt */
/* loaded from: classes5.dex */
public final class b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CartridgeInsertScreen.kt */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f55121a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f55122b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ym0.a<nm0.y> aVar, int i11) {
            super(2);
            this.f55121a = aVar;
            this.f55122b = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f55122b | 1);
            b.a(this.f55121a, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    public static final void a(ym0.a<nm0.y> onQuit, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        androidx.compose.runtime.b bVar;
        int i13;
        kotlin.jvm.internal.u.j(onQuit, "onQuit");
        androidx.compose.runtime.b g11 = aVar.g(765210842);
        if ((i11 & 14) == 0) {
            if (g11.w(onQuit)) {
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
            long O = ((i1) g11.D(j1.e())).O();
            r0.x xVar = new r0.x(yk.h.o(), yk.h.o(), yk.h.o(), yk.h.s());
            int i14 = androidx.compose.foundation.layout.e.f4229i;
            bVar = g11;
            wk.c0.b(null, null, f1.d.a(), onQuit, j.f55188a, j.f55189b, null, null, O, false, xVar, androidx.compose.foundation.layout.e.o(yk.h.B()), 0.0f, true, j.f55190c, bVar, ((i12 << 9) & 7168) | 221184, 27648, 4803);
        }
        androidx.compose.runtime.v o02 = bVar.o0();
        if (o02 != null) {
            o02.G(new a(onQuit, i11));
        }
    }
}
