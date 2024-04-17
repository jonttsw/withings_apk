package com.withings.wiscale2.device.common.feature.ecg;

import androidx.compose.runtime.a;
import com.withings.library.authentication.api.ConstantsWs;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
public final class a1 extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f51164a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(EcgActivationActivity ecgActivationActivity) {
        super(3);
        this.f51164a = ecgActivationActivity;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
        boolean z5;
        r0.h GuidedPresentation = hVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(GuidedPresentation, "$this$GuidedPresentation");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            Object a11 = androidx.camera.camera2.internal.q2.a(aVar2, 773894976, -492369756);
            if (a11 == a.C0060a.a()) {
                a11 = androidx.camera.camera2.internal.q.b(k1.y.i(aVar2), aVar2);
            }
            aVar2.J();
            CoroutineScope a12 = ((androidx.compose.runtime.k) a11).a();
            aVar2.J();
            aVar2.s(-464877071);
            Object t11 = aVar2.t();
            a.C0060a.C0061a a13 = a.C0060a.a();
            EcgActivationActivity ecgActivationActivity = this.f51164a;
            if (t11 == a13) {
                t11 = ecgActivationActivity.U3().w1();
                aVar2.n(t11);
            }
            k1.r0 r0Var = (k1.r0) t11;
            aVar2.J();
            androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) aVar2.D(androidx.compose.ui.platform.n1.m());
            aVar2.s(-464876944);
            Object t12 = aVar2.t();
            if (t12 == a.C0060a.a()) {
                t12 = androidx.compose.runtime.l0.f(ecgActivationActivity.U3().q1(), androidx.compose.runtime.v0.f8878a);
                aVar2.n(t12);
            }
            k1.r0 r0Var2 = (k1.r0) t12;
            aVar2.J();
            String str = (String) r0Var.getValue();
            if (str == null) {
                str = "";
            }
            String str2 = str;
            Integer num2 = (Integer) ecgActivationActivity.U3().z1().getValue();
            aVar2.s(-464876730);
            androidx.compose.ui.text.b bVar = null;
            if (num2 != null) {
                bVar = new androidx.compose.ui.text.b(ay.b.u(num2.intValue(), aVar2), null, 6);
            }
            aVar2.J();
            if (ecgActivationActivity.U3().z1().getValue() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            fk.y.a(null, str2, r0Var2, bVar, z5, new v0(a12, k4Var), 0, new x0(ecgActivationActivity, a12, k4Var), new y0(ecgActivationActivity), new z0(ecgActivationActivity), null, aVar2, ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED, 0, 1089);
        }
        return nm0.y.f85009a;
    }
}
