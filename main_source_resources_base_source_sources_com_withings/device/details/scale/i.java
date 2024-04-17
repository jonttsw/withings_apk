package com.withings.device.details.scale;

import com.withings.device.Device;
import com.withings.wiscale2.C1987R;
/* compiled from: ScaleDetailFragment.kt */
/* loaded from: classes3.dex */
final class i extends kotlin.jvm.internal.w implements ym0.q<r0.c, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Device f36945a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Device device) {
        super(3);
        this.f36945a = device;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.c cVar, androidx.compose.runtime.a aVar, Integer num) {
        r0.c LabelValueCell = cVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(LabelValueCell, "$this$LabelValueCell");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            com.withings.common.compose.component.o.e(ay.b.u(C1987R.string._SL_SERIAL_, aVar2), this.f36945a.getMacAddress().toString(), aVar2, 0, 0);
        }
        return nm0.y.f85009a;
    }
}
