package com.withings.wiscale2.device.common.feature.ecg;

import androidx.compose.runtime.a;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class r2 extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f51687a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f51688b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(r8.n nVar, EcgActivationActivity ecgActivationActivity) {
        super(4);
        this.f51687a = ecgActivationActivity;
        this.f51688b = nVar;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        androidx.compose.material3.j5.e(num, cVar, "$this$composable", dVar, "it");
        aVar2.s(-1129718146);
        Object t11 = aVar2.t();
        if (t11 == a.C0060a.a()) {
            t11 = androidx.compose.runtime.l0.f(Boolean.FALSE, androidx.compose.runtime.v0.f8878a);
            aVar2.n(t11);
        }
        k1.r0 r0Var = (k1.r0) t11;
        aVar2.J();
        EcgActivationActivity ecgActivationActivity = this.f51687a;
        i5 o12 = ecgActivationActivity.U3().o1();
        n2 n2Var = new n2(ecgActivationActivity, r0Var);
        o4 U3 = ecgActivationActivity.U3();
        U3.getClass();
        EcgActivationActivity.F3(ecgActivationActivity, this.f51688b, o12, false, n2Var, new y4(U3), aVar2, 262152, 4);
        if (((Boolean) r0Var.getValue()).booleanValue()) {
            aVar2.s(-1129717471);
            Object t12 = aVar2.t();
            if (t12 == a.C0060a.a()) {
                t12 = new o2(r0Var);
                aVar2.n(t12);
            }
            ym0.a aVar3 = (ym0.a) t12;
            aVar2.J();
            String u11 = ay.b.u(C1987R.string.hwa09_usOnboarding_firstECG_title, aVar2);
            String u12 = ay.b.u(C1987R.string.hwa09_usOnboarding_firstECG_paragraph, aVar2);
            String u13 = ay.b.u(C1987R.string._PROGRAM_LEAVE_, aVar2);
            p2 p2Var = new p2(ecgActivationActivity);
            String u14 = ay.b.u(C1987R.string._CANCEL_, aVar2);
            aVar2.s(-1129716882);
            Object t13 = aVar2.t();
            if (t13 == a.C0060a.a()) {
                t13 = new q2(r0Var);
                aVar2.n(t13);
            }
            aVar2.J();
            wk.p.a(aVar3, u11, u12, u13, 0L, p2Var, u14, 0L, (ym0.a) t13, aVar2, 100663302, ConstantsWs.MEASURE_TYPE_HR_LEVEL_MAX);
        }
        return nm0.y.f85009a;
    }
}
