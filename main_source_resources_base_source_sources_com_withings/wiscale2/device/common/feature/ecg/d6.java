package com.withings.wiscale2.device.common.feature.ecg;

import android.content.Context;
import androidx.compose.runtime.a;
import com.withings.common.compose.component.t0;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
public final class d6 extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WBS08EcgActivationActivity f51280a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(WBS08EcgActivationActivity wBS08EcgActivationActivity) {
        super(3);
        this.f51280a = wBS08EcgActivationActivity;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
        WBS08EcgActivationViewModel R3;
        WBS08EcgActivationViewModel R32;
        r5 r5Var;
        WBS08EcgActivationViewModel R33;
        String u11;
        List list;
        WBS08EcgActivationViewModel R34;
        WBS08EcgActivationViewModel R35;
        WBS08EcgActivationViewModel R36;
        r0.h GuidedPresentation = hVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(GuidedPresentation, "$this$GuidedPresentation");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            String u12 = ay.b.u(C1987R.string.wbs08Rx_usOnboarding_conditions_medicalCard_title, aVar2);
            List V = kotlin.collections.x.V(new t0.b(ay.b.u(C1987R.string.wbs08Rx_usOnboarding_conditions_medicalCard_paragraph, aVar2)));
            String u13 = ay.b.u(C1987R.string.wbs08Rx_usOnboarding_conditions_medicalCard_Readmore, aVar2);
            WBS08EcgActivationActivity wBS08EcgActivationActivity = this.f51280a;
            z5 z5Var = new z5(wBS08EcgActivationActivity);
            String u14 = ay.b.u(C1987R.string.wbs08Rx_usOnboarding_conditions_medicalCard_agree, aVar2);
            R3 = wBS08EcgActivationActivity.R3();
            boolean booleanValue = ((Boolean) R3.R0().getValue()).booleanValue();
            aVar2.s(-1025211695);
            Object t11 = aVar2.t();
            if (t11 == a.C0060a.a()) {
                R36 = wBS08EcgActivationActivity.R3();
                t11 = Boolean.valueOf(!((Boolean) R36.R0().getValue()).booleanValue());
                aVar2.n(t11);
            }
            boolean booleanValue2 = ((Boolean) t11).booleanValue();
            aVar2.J();
            com.withings.common.compose.component.s0.a(u12, V, u13, 0.0f, z5Var, u14, booleanValue, booleanValue2, 0L, new a6(wBS08EcgActivationActivity), aVar2, 12582912, ConstantsWs.WS_STATUS_WRONGEMAIL);
            R32 = wBS08EcgActivationActivity.R3();
            T value = R32.a1().getValue();
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
                String u15 = ay.b.u(C1987R.string.wbs08Rx_usOnboarding_conditions_dataCard_title, aVar2);
                R33 = wBS08EcgActivationActivity.R3();
                t5 t5Var = (t5) R33.a1().getValue();
                if (t5Var == null) {
                    u11 = null;
                } else {
                    u11 = a3.g.u(t5Var, (Context) aVar2.D(androidx.compose.ui.platform.u0.d()));
                }
                if (u11 != null) {
                    list2 = kotlin.collections.x.V(new t0.b(ay.b.v(C1987R.string.wbs08Rx_usOnboarding_conditions_dataCard_paragraph, new Object[]{u11}, aVar2)));
                }
                if (list2 == null) {
                    list = kotlin.collections.i0.f76187a;
                } else {
                    list = list2;
                }
                String u16 = ay.b.u(C1987R.string.hwa09_usOnboarding_conditions_medicalCard_Readmore, aVar2);
                b6 b6Var = new b6(wBS08EcgActivationActivity);
                String u17 = ay.b.u(C1987R.string.wbs08Rx_usOnboarding_conditions_dataCard_agree, aVar2);
                R34 = wBS08EcgActivationActivity.R3();
                boolean booleanValue3 = ((Boolean) R34.A0().getValue()).booleanValue();
                aVar2.s(767620586);
                Object t12 = aVar2.t();
                if (t12 == a.C0060a.a()) {
                    R35 = wBS08EcgActivationActivity.R3();
                    t12 = Boolean.valueOf(!((Boolean) R35.A0().getValue()).booleanValue());
                    aVar2.n(t12);
                }
                boolean booleanValue4 = ((Boolean) t12).booleanValue();
                aVar2.J();
                com.withings.common.compose.component.s0.a(u15, list, u16, 0.0f, b6Var, u17, booleanValue3, booleanValue4, 0L, new c6(wBS08EcgActivationActivity), aVar2, 12582976, ConstantsWs.WS_STATUS_WRONGEMAIL);
            }
        }
        return nm0.y.f85009a;
    }
}
