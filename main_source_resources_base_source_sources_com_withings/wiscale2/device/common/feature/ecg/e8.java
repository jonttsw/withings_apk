package com.withings.wiscale2.device.common.feature.ecg;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
public final class e8 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WBS08EcgActivationActivity f51314a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8(WBS08EcgActivationActivity wBS08EcgActivationActivity) {
        super(2);
        this.f51314a = wBS08EcgActivationActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        WBS08EcgActivationViewModel R3;
        WBS08EcgActivationViewModel R32;
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            WBS08EcgActivationActivity wBS08EcgActivationActivity = this.f51314a;
            R3 = wBS08EcgActivationActivity.R3();
            String X0 = R3.X0();
            String str = null;
            if (X0 != null) {
                if (X0.length() == 0) {
                    X0 = null;
                }
                if (X0 != null) {
                    R32 = wBS08EcgActivationActivity.R3();
                    str = R32.z0(X0);
                }
            }
            if (str == null) {
                str = "";
            }
            com.withings.common.compose.component.v4.b(null, ay.b.u(C1987R.string.wbs08Rx_usOnboarding_codeCheck_title, aVar2), ay.b.v(C1987R.string.wbs08Rx_usOnboarding_codeCheck_paragraph, new Object[]{str}, aVar2), null, 0.0f, 0.0f, 0, 0, aVar2, 0, ConstantsWs.WS_STATUS_WRONG_DATE_FORMAT);
        }
        return nm0.y.f85009a;
    }
}
