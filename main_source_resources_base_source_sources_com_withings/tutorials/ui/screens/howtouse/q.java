package com.withings.tutorials.ui.screens.howtouse;

import androidx.compose.material3.i1;
import androidx.compose.material3.j1;
import com.withings.common.compose.component.CellVerticalMargin;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
/* compiled from: HowToUseWBS08.kt */
/* loaded from: classes4.dex */
final class q extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f45469a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(ym0.a<nm0.y> aVar) {
        super(3);
        this.f45469a = aVar;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
        r0.h VideoTutorialScreen = hVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(VideoTutorialScreen, "$this$VideoTutorialScreen");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            g2.c a11 = s2.d.a(C1987R.drawable.advanced_icon_handle, aVar2);
            String u11 = ay.b.u(C1987R.string.deviceInstallation_ariane_wbs08_howToUse_item1, aVar2);
            CellVerticalMargin cellVerticalMargin = CellVerticalMargin.f33312d;
            com.withings.common.compose.component.o.q(null, a11, u11, null, false, false, false, null, cellVerticalMargin, aVar2, 100663360, ConstantsWs.WS_STATUS_WRONG_DATE_FORMAT);
            com.withings.common.compose.component.o.q(null, s2.d.a(C1987R.drawable.advanced_icon_feet, aVar2), ay.b.u(C1987R.string.deviceInstallation_ariane_wbs08_howToUse_item2, aVar2), null, false, false, false, null, cellVerticalMargin, aVar2, 100663360, ConstantsWs.WS_STATUS_WRONG_DATE_FORMAT);
            com.withings.common.compose.component.o.q(null, s2.d.a(C1987R.drawable.advanced_icon_wait, aVar2), ay.b.u(C1987R.string.deviceInstallation_ariane_wbs08_howToUse_item3, aVar2), null, false, false, false, null, cellVerticalMargin, aVar2, 100663360, ConstantsWs.WS_STATUS_WRONG_DATE_FORMAT);
            nk.a.g(0, 0, 0, 61, 0L, aVar2, null, null, ay.b.u(C1987R.string.deviceInstallation_ariane_wbs08_howToUse_note, aVar2));
            nk.a.h(0, 0, 28, 0L, aVar2, androidx.compose.foundation.h.b(androidx.compose.ui.e.f8927a, false, this.f45469a, 7), nk.g0.a(((i1) aVar2.D(j1.e())).J(), ay.b.u(C1987R.string.deviceInstallation_ariane_wbs08_howToUse_note_wallHandleMount, aVar2)), null);
        }
        return nm0.y.f85009a;
    }
}
