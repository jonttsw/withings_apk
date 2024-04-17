package com.withings.wiscale2.device.wpa.wpa02.ui.features.cartridge;

import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.w0;
import com.withings.common.compose.component.v4;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
/* compiled from: CartridgeMetadataScreen.kt */
/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static s1.a f55196a = new s1.a(false, 1231662809, a.f55198a);

    /* renamed from: b  reason: collision with root package name */
    public static s1.a f55197b = new s1.a(false, 1993544120, b.f55199a);

    /* compiled from: CartridgeMetadataScreen.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f55198a = new kotlin.jvm.internal.w(2);

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                n0.z.a(s2.d.a(2131232929, aVar2), null, w0.a(e1.d(androidx.compose.ui.e.f8927a), 1.0f), null, null, 0.0f, null, aVar2, 440, 120);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: CartridgeMetadataScreen.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f55199a = new kotlin.jvm.internal.w(2);

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                v4.b(null, ay.b.u(C1987R.string.wpa02_cartridgeDesc_title, aVar2), null, null, 0.0f, 0.0f, 0, 0, aVar2, 0, ConstantsWs.WS_STATUS_ACCOUNTSUSPENDED);
            }
            return nm0.y.f85009a;
        }
    }
}
