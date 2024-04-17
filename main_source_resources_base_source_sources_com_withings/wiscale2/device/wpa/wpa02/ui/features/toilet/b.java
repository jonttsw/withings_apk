package com.withings.wiscale2.device.wpa.wpa02.ui.features.toilet;

import com.withings.common.compose.component.CellVerticalMargin;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import java.util.Map;
/* compiled from: ToiletAttachScreen.kt */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static s1.a f55348a = new s1.a(false, -2109164893, a.f55349a);

    /* compiled from: ToiletAttachScreen.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f55349a = new kotlin.jvm.internal.w(3);

        @Override // ym0.q
        public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            r0.h ImageTutorialScreen = hVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(ImageTutorialScreen, "$this$ImageTutorialScreen");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                for (Map.Entry entry : kotlin.collections.s0.j(new nm0.j(Integer.valueOf((int) C1987R.string.wpa02_installToilet_place_description_1), 2131232939), new nm0.j(Integer.valueOf((int) C1987R.string.wpa02_installToilet_place_description_2), 2131232927), new nm0.j(Integer.valueOf((int) C1987R.string.wpa02_installToilet_place_description_3), 2131232933)).entrySet()) {
                    com.withings.common.compose.component.o.q(null, s2.d.a(((Number) entry.getValue()).intValue(), aVar2), ay.b.u(((Number) entry.getKey()).intValue(), aVar2), null, false, false, false, null, CellVerticalMargin.f33312d, aVar2, 100663360, ConstantsWs.WS_STATUS_WRONG_DATE_FORMAT);
                }
            }
            return nm0.y.f85009a;
        }
    }
}
