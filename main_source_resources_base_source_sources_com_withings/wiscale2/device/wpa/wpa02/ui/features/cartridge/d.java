package com.withings.wiscale2.device.wpa.wpa02.ui.features.cartridge;

import androidx.compose.foundation.layout.x0;
import androidx.compose.material3.p4;
import androidx.compose.ui.e;
import com.withings.wiscale2.C1987R;
/* compiled from: CartridgeMetadataScreen.kt */
/* loaded from: classes5.dex */
final class d extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f55166a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f55167b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, String str2) {
        super(3);
        this.f55166a = str;
        this.f55167b = str2;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
        r0.h SectionCardColumn = hVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(SectionCardColumn, "$this$SectionCardColumn");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            e.a aVar3 = androidx.compose.ui.e.f8927a;
            com.withings.common.compose.component.o.o(x0.h(aVar3, yk.h.o(), 0.0f, 2), null, ay.b.u(C1987R.string.wpa02_cartridgeDesc_type, aVar2), null, this.f55166a, false, false, false, null, null, null, null, null, aVar2, 0, 0, 8170);
            p4.a(null, 0.0f, 0L, aVar2, 0, 7);
            com.withings.common.compose.component.o.o(x0.h(aVar3, yk.h.o(), 0.0f, 2), null, ay.b.u(C1987R.string.wpa02_cartridgeDesc_expiryDate, aVar2), null, this.f55167b, false, false, false, null, null, null, null, null, aVar2, 0, 0, 8170);
        }
        return nm0.y.f85009a;
    }
}
