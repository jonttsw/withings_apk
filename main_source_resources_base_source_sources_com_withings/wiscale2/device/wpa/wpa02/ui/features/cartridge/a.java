package com.withings.wiscale2.device.wpa.wpa02.ui.features.cartridge;
/* compiled from: CartridgeActivationScreen.kt */
/* loaded from: classes5.dex */
public final class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CartridgeActivationScreen.kt */
    /* renamed from: com.withings.wiscale2.device.wpa.wpa02.ui.features.cartridge.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0728a extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0728a f55119a = new kotlin.jvm.internal.w(0);

        @Override // ym0.a
        public final /* bridge */ /* synthetic */ nm0.y invoke() {
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CartridgeActivationScreen.kt */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f55120a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i11) {
            super(2);
            this.f55120a = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            a.a(aVar, ah.o.g(this.f55120a | 1));
            return nm0.y.f85009a;
        }
    }

    public static final void a(androidx.compose.runtime.a aVar, int i11) {
        androidx.compose.runtime.b g11 = aVar.g(21255412);
        if (i11 == 0 && g11.h()) {
            g11.C();
        } else {
            float o11 = yk.h.o();
            float q11 = yk.h.q();
            r0.x xVar = new r0.x(o11, q11, o11, q11);
            wk.c0.b(null, null, null, C0728a.f55119a, null, i.f55183a, null, null, 0L, false, xVar, null, 0.0f, false, i.f55184b, g11, 200064, 24576, 15315);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new b(i11));
        }
    }
}
