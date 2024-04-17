package com.withings.survey.ui;

import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.material.b8;
import androidx.compose.material.c5;
import androidx.compose.material.f4;
import androidx.compose.runtime.a;
import com.withings.common.compose.component.x4;
import com.withings.common.compose.component.z4;
import com.withings.survey.viewModel.InAppSurveyViewModel;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InAppSurveyActivity.kt */
/* loaded from: classes4.dex */
public final class t1 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ InAppSurveyActivity f44449a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(InAppSurveyActivity inAppSurveyActivity) {
        super(2);
        this.f44449a = inAppSurveyActivity;
    }

    public static final boolean a(k1.o1 o1Var) {
        return ((Boolean) o1Var.getValue()).booleanValue();
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        InAppSurveyViewModel E3;
        InAppSurveyViewModel E32;
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            aVar2.s(-994967908);
            c5 f11 = f4.f(ModalBottomSheetValue.f4842a, b8.a(), false, aVar2, 12);
            aVar2.s(513515700);
            boolean K = aVar2.K(f11);
            Object t11 = aVar2.t();
            if (K || t11 == a.C0060a.a()) {
                t11 = new xb.b(f11);
                aVar2.n(t11);
            }
            xb.b bVar = (xb.b) t11;
            aVar2.J();
            aVar2.J();
            c5 f12 = f4.f(ModalBottomSheetValue.f4843b, null, false, aVar2, 14);
            r8.n c11 = androidx.navigation.compose.r.c(new androidx.navigation.c0[0], aVar2);
            c11.D().b(bVar);
            z4 b10 = x4.b(aVar2);
            InAppSurveyActivity inAppSurveyActivity = this.f44449a;
            E3 = inAppSurveyActivity.E3();
            k1.r0 b11 = androidx.compose.runtime.l0.b(E3.R0(), aVar2);
            aVar2.s(-1015661127);
            Object t12 = aVar2.t();
            if (t12 == a.C0060a.a()) {
                E32 = inAppSurveyActivity.E3();
                t12 = E32.W0();
                aVar2.n(t12);
            }
            aVar2.J();
            Boolean bool = (Boolean) b11.getValue();
            bool.booleanValue();
            k1.y.f(bool, new m1(inAppSurveyActivity, b11, null), aVar2);
            long O = ((androidx.compose.material3.i1) aVar2.D(androidx.compose.material3.j1.e())).O();
            xb.a.a(bVar, androidx.compose.foundation.layout.e1.d(androidx.compose.ui.e.f8927a), wk.h.d(), 0.0f, O, 0L, 0L, s1.b.b(aVar2, -1425920901, new s1(this.f44449a, c11, f12, b10, (k1.r0) t12)), aVar2, 12582968, 104);
        }
        return nm0.y.f85009a;
    }
}
