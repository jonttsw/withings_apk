package com.withings.wiscale2.device.common.feature.ecg;

import android.content.Context;
import com.withings.common.compose.component.t0;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
public final class g extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f51349a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(EcgActivationActivity ecgActivationActivity) {
        super(3);
        this.f51349a = ecgActivationActivity;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
        r5 r5Var;
        String u11;
        List list;
        r0.h GuidedPresentation = hVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(GuidedPresentation, "$this$GuidedPresentation");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            String u12 = ay.b.u(C1987R.string.hwa09_usOnboarding_conditions_medicalCard_title, aVar2);
            List V = kotlin.collections.x.V(new t0.b(ay.b.u(C1987R.string.hwa09_usOnboarding_conditions_medicalCard_paragraph, aVar2)));
            String u13 = ay.b.u(C1987R.string.hwa09_usOnboarding_conditions_medicalCard_Readmore, aVar2);
            fn0.k<Object>[] kVarArr = EcgActivationActivity.f51062k;
            EcgActivationActivity ecgActivationActivity = this.f51349a;
            ecgActivationActivity.getClass();
            com.withings.common.compose.component.s0.a(u12, V, u13, 0.0f, new x3(ecgActivationActivity), ay.b.u(C1987R.string.hwa09_usOnboarding_conditions_medicalCard_agree, aVar2), ((Boolean) ecgActivationActivity.U3().r1().getValue()).booleanValue(), false, 0L, new e(ecgActivationActivity), aVar2, 0, ConstantsWs.WS_STATUS_FIRMWARE_NOT_VALIDATED);
            T value = ecgActivationActivity.U3().G1().getValue();
            List list2 = null;
            if (value instanceof r5) {
                r5Var = (r5) value;
            } else {
                r5Var = null;
            }
            if (r5Var == null || !r5Var.a().isPhoneRequired()) {
                r5Var = null;
            }
            if (r5Var != null) {
                String u14 = ay.b.u(C1987R.string.hwa09_usOnboarding_conditions_dataCard_title, aVar2);
                t5 t5Var = (t5) ecgActivationActivity.U3().G1().getValue();
                if (t5Var == null) {
                    u11 = null;
                } else {
                    u11 = a3.g.u(t5Var, (Context) aVar2.D(androidx.compose.ui.platform.u0.d()));
                }
                if (u11 != null) {
                    list2 = kotlin.collections.x.V(new t0.b(ay.b.v(C1987R.string.hwa09_usOnboarding_conditions_dataCard_paragraph, new Object[]{u11}, aVar2)));
                }
                if (list2 == null) {
                    list = kotlin.collections.i0.f76187a;
                } else {
                    list = list2;
                }
                com.withings.common.compose.component.s0.a(u14, list, ay.b.u(C1987R.string.hwa09_usOnboarding_conditions_medicalCard_Readmore, aVar2), 0.0f, new x3(ecgActivationActivity), ay.b.u(C1987R.string.hwa09_usOnboarding_conditions_dataCard_agree, aVar2), ((Boolean) ecgActivationActivity.U3().c1().getValue()).booleanValue(), false, 0L, new f(ecgActivationActivity), aVar2, 64, ConstantsWs.WS_STATUS_FIRMWARE_NOT_VALIDATED);
            }
        }
        return nm0.y.f85009a;
    }
}
