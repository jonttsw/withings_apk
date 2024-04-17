package com.withings.wiscale2.device.wpa.wpa02.ui.features.cartridge;

import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.w0;
import com.withings.common.compose.component.v4;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
/* compiled from: CartridgeInsertScreen.kt */
/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static s1.a f55188a = new s1.a(false, -984951155, a.f55191a);

    /* renamed from: b  reason: collision with root package name */
    public static s1.a f55189b = new s1.a(false, -283016562, b.f55192a);

    /* renamed from: c  reason: collision with root package name */
    public static s1.a f55190c = new s1.a(false, 353574228, c.f55193a);

    /* compiled from: CartridgeInsertScreen.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f55191a = new kotlin.jvm.internal.w(2);

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                n0.z.a(s2.d.a(2131232937, aVar2), null, w0.a(e1.d(androidx.compose.ui.e.f8927a), 1.0f), null, null, 0.0f, null, aVar2, 440, 120);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: CartridgeInsertScreen.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f55192a = new kotlin.jvm.internal.w(2);

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                v4.b(null, ay.b.u(C1987R.string.wpa02_insertCartridge_title, aVar2), ay.b.u(C1987R.string.wpa02_insertCartridge_description, aVar2), null, 0.0f, 0.0f, 0, 0, aVar2, 0, ConstantsWs.WS_STATUS_WRONG_DATE_FORMAT);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: CartridgeInsertScreen.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f55193a = new kotlin.jvm.internal.w(3);

        @Override // ym0.q
        public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            r0.h GuidedPresentation = hVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(GuidedPresentation, "$this$GuidedPresentation");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            }
            return nm0.y.f85009a;
        }
    }
}
