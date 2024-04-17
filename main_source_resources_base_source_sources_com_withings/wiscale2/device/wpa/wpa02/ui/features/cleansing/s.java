package com.withings.wiscale2.device.wpa.wpa02.ui.features.cleansing;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
/* compiled from: DeviceConnectStateScreen.kt */
/* loaded from: classes5.dex */
public final class s {
    public static final void a(int i11, int i12, androidx.compose.runtime.a aVar, ym0.a aVar2) {
        int i13;
        int i14;
        androidx.compose.runtime.b g11 = aVar.g(-814711143);
        int i15 = i12 & 1;
        if (i15 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            if (g11.w(aVar2)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i13 = i14 | i11;
        } else {
            i13 = i11;
        }
        if ((i13 & 11) == 2 && g11.h()) {
            g11.C();
        } else {
            if (i15 != 0) {
                aVar2 = q.f55318a;
            }
            qe0.a.a(C1987R.string.asset_loading, Integer.valueOf((int) C1987R.string.wpa_looking_for_device_title), aVar2, g11, (i13 << 6) & ConstantsWs.HWFAILURE_ZERO, 0);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new r(i11, i12, aVar2));
        }
    }
}
