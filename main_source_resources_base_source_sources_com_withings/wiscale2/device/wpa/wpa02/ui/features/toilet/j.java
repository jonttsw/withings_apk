package com.withings.wiscale2.device.wpa.wpa02.ui.features.toilet;

import androidx.compose.foundation.layout.e;
import androidx.compose.material3.i1;
import androidx.compose.material3.j1;
/* compiled from: ToiletCloseDeviceScreen.kt */
/* loaded from: classes5.dex */
public final class j {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ToiletCloseDeviceScreen.kt */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f55399a = new kotlin.jvm.internal.w(0);

        @Override // ym0.a
        public final /* bridge */ /* synthetic */ nm0.y invoke() {
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ToiletCloseDeviceScreen.kt */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f55400a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i11) {
            super(2);
            this.f55400a = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            j.a(aVar, ah.o.g(this.f55400a | 1));
            return nm0.y.f85009a;
        }
    }

    public static final void a(androidx.compose.runtime.a aVar, int i11) {
        androidx.compose.runtime.b g11 = aVar.g(-858023396);
        if (i11 == 0 && g11.h()) {
            g11.C();
        } else {
            long O = ((i1) g11.D(j1.e())).O();
            r0.x xVar = new r0.x(yk.h.o(), yk.h.o(), yk.h.o(), yk.h.s());
            int i12 = androidx.compose.foundation.layout.e.f4229i;
            e.h o11 = androidx.compose.foundation.layout.e.o(yk.h.B());
            wk.c0.b(null, null, null, a.f55399a, c.f55351a, c.f55352b, null, null, O, false, xVar, o11, 0.0f, false, c.f55353c, g11, 224640, 24576, 12995);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new b(i11));
        }
    }
}
