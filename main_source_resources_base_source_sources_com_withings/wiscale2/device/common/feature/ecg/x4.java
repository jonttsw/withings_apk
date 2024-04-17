package com.withings.wiscale2.device.common.feature.ecg;

import android.app.Application;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.common.feature.ecg.f5;
/* compiled from: EcgActivationViewModel.kt */
/* loaded from: classes5.dex */
final class x4 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ o4 f52104a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(o4 o4Var) {
        super(0);
        this.f52104a = o4Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        g5 g5Var;
        Application application;
        o4 o4Var = this.f52104a;
        String a12 = o4Var.a1();
        if (a12 != null) {
            switch (a12.hashCode()) {
                case -737996636:
                    if (a12.equals("SmsCodeInput")) {
                        ParcelableSnapshotMutableState F1 = o4Var.F1();
                        g5 g5Var2 = (g5) o4Var.F1().getValue();
                        if (g5Var2 != null) {
                            g5Var = g5.a(g5Var2, true);
                        } else {
                            g5Var = null;
                        }
                        F1.setValue(g5Var);
                        o4Var.K1().setValue(null);
                        String y12 = o4Var.y1();
                        if (y12 != null) {
                            o4Var.Y1(y12);
                            break;
                        } else {
                            o4.c2(o4Var, 0, 0, 7);
                            break;
                        }
                    }
                    break;
                case -680498753:
                    if (a12.equals("EcgReviewStatusScreen")) {
                        f5.d flowStep = f5.d.f51342c;
                        String str = (String) o4Var.l1().getValue();
                        kotlin.jvm.internal.u.j(flowStep, "flowStep");
                        if (flowStep.a().length() > 0) {
                            int i11 = v70.a.f103433b;
                            v70.a.d("onboarding_ecg_scanwatch", "onboarding_ecg_scanwatch", kotlin.collections.s0.j(new nm0.j("flow_specificity", str), new nm0.j("flow_step_name", flowStep.a()), new nm0.j("flow_step_order", Integer.valueOf(flowStep.b()))), true);
                        }
                        o4Var.v1().setValue("https://support.withings.com/hc/en-us/articles/4407741101457");
                        break;
                    }
                    break;
                case 2135970:
                    if (a12.equals("Done")) {
                        xw.n<String> v12 = o4Var.v1();
                        application = o4Var.f51557d;
                        v12.setValue(application.getString(C1987R.string.ecg_detail_staticUnderstandEcgMeasurementUrl));
                        break;
                    }
                    break;
                case 24235987:
                    if (a12.equals("PhoneNumberInput")) {
                        o4.c2(o4Var, C1987R.string.hwa09_usOnboarding_error_phone_title, C1987R.string.hwa09_usOnboarding_error_phone_paragraph, 4);
                        break;
                    }
                    break;
                case 576465947:
                    if (a12.equals("StateSelection")) {
                        f5.a flowStep2 = f5.a.f51339c;
                        String str2 = (String) o4Var.l1().getValue();
                        kotlin.jvm.internal.u.j(flowStep2, "flowStep");
                        if (flowStep2.a().length() > 0) {
                            int i12 = v70.a.f103433b;
                            v70.a.d("onboarding_ecg_scanwatch", "onboarding_ecg_scanwatch", kotlin.collections.s0.j(new nm0.j("flow_specificity", str2), new nm0.j("flow_step_name", flowStep2.a()), new nm0.j("flow_step_order", Integer.valueOf(flowStep2.b()))), true);
                        }
                        o4Var.v1().setValue("https://support.withings.com/hc/en-us/articles/4407741101457");
                        break;
                    }
                    break;
                case 1228767006:
                    if (a12.equals("Support/{title}/{description}/{screenLog}")) {
                        o4Var.n1().setValue(null);
                        break;
                    }
                    break;
            }
        }
        return nm0.y.f85009a;
    }
}
