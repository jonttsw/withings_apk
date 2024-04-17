package com.withings.wiscale2.device.common.feature.ecg;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
public final class l1 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f51489a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(EcgActivationActivity ecgActivationActivity) {
        super(2);
        this.f51489a = ecgActivationActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            EcgActivationActivity ecgActivationActivity = this.f51489a;
            String y12 = ecgActivationActivity.U3().y1();
            String str = null;
            if (y12 != null) {
                if (y12.length() == 0) {
                    y12 = null;
                }
                if (y12 != null) {
                    str = ecgActivationActivity.U3().Z0(y12);
                }
            }
            if (str == null) {
                str = "";
            }
            com.withings.common.compose.component.v4.b(null, ay.b.u(C1987R.string.login_2FA_code_title, aVar2), ay.b.v(C1987R.string.hwa09_usOnboarding_codeCheck_paragraph, new Object[]{str}, aVar2), null, 0.0f, 0.0f, 0, 0, aVar2, 0, ConstantsWs.WS_STATUS_WRONG_DATE_FORMAT);
        }
        return nm0.y.f85009a;
    }
}
