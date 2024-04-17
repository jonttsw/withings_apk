package com.withings.device.details;

import androidx.compose.foundation.layout.e1;
import com.withings.common.compose.component.v4;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import gl.g0;
/* compiled from: DeviceDetailFragment.kt */
/* loaded from: classes3.dex */
final class l extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h f36860a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(h hVar) {
        super(2);
        this.f36860a = hVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        int i11;
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            androidx.compose.ui.e e11 = e1.e(androidx.compose.ui.e.f8927a, 1.0f);
            if (this.f36860a.B1() instanceof g0) {
                i11 = C1987R.string.deviceTab_how_do_you_want_dissociate;
            } else {
                i11 = C1987R.string.deviceTab_do_you_really_want_dissociate;
            }
            v4.b(e11, ay.b.u(i11, aVar2), null, null, 0.0f, 0.0f, 0, 0, aVar2, 6, ConstantsWs.WS_STATUS_WRONGBATTERYLVL);
        }
        return nm0.y.f85009a;
    }
}
