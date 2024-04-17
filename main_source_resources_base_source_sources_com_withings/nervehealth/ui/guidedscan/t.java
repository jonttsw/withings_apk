package com.withings.nervehealth.ui.guidedscan;

import androidx.camera.camera2.internal.p2;
import androidx.compose.material3.i1;
import androidx.compose.material3.j1;
import com.withings.common.compose.component.a5;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import k1.o1;
import k1.r0;
/* compiled from: NerveHealthGuidedScanActivity.kt */
/* loaded from: classes4.dex */
final class t extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ NerveHealthGuidedScanActivity f42654a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ o1<Boolean> f42655b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ o1<Boolean> f42656c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ o1<Boolean> f42657d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ o1<p0> f42658e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(NerveHealthGuidedScanActivity nerveHealthGuidedScanActivity, r0 r0Var, r0 r0Var2, r0 r0Var3, r0 r0Var4) {
        super(2);
        this.f42654a = nerveHealthGuidedScanActivity;
        this.f42655b = r0Var;
        this.f42656c = r0Var2;
        this.f42657d = r0Var3;
        this.f42658e = r0Var4;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        NerveHealthGuidedScanActivity nerveHealthGuidedScanActivity;
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            aVar2.s(-1898500191);
            boolean booleanValue = this.f42655b.getValue().booleanValue();
            NerveHealthGuidedScanActivity nerveHealthGuidedScanActivity2 = this.f42654a;
            if (booleanValue) {
                k kVar = new k(NerveHealthGuidedScanActivity.z3(nerveHealthGuidedScanActivity2));
                l lVar = new l(NerveHealthGuidedScanActivity.z3(nerveHealthGuidedScanActivity2));
                nerveHealthGuidedScanActivity = nerveHealthGuidedScanActivity2;
                wk.p.b(kVar, ay.b.u(C1987R.string.nerveHealth_guidedScan_cancel_title, aVar2), a.f42568a, ay.b.u(C1987R.string.nerveHealth_guidedScan_cancel_button_yes, aVar2), 0L, new m(nerveHealthGuidedScanActivity2), ay.b.u(C1987R.string.nerveHealth_guidedScan_cancel_button_no, aVar2), 0L, lVar, aVar2, ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED, ConstantsWs.MEASURE_TYPE_HR_LEVEL_MAX);
            } else {
                nerveHealthGuidedScanActivity = nerveHealthGuidedScanActivity2;
            }
            aVar2.J();
            aVar2.s(-1898499520);
            if (this.f42656c.getValue().booleanValue()) {
                String u11 = ay.b.u(C1987R.string._ERROR_, aVar2);
                String u12 = ay.b.u(C1987R.string._ERROR_NO_INTERNET_SUBTITLE_, aVar2);
                h2.d b10 = s2.e.b(C1987R.drawable.icon_medium_status_bad, aVar2);
                aVar2.J();
                long h11 = ((yk.w) p2.b(aVar2, 615317871)).i().h();
                aVar2.s(615317871);
                aVar2.J();
                a5.g(u11, u12, b10, ((i1) aVar2.D(j1.e())).a(), h11, ((yk.w) aVar2.D(yk.o.g())).i().c(), null, null, aVar2, 0, 192);
            }
            aVar2.J();
            aVar2.s(-1898498908);
            if (this.f42657d.getValue().booleanValue()) {
                String u13 = ay.b.u(C1987R.string.nerveHealth_guidedScan_error_noData_button_tryAgain, aVar2);
                String u14 = ay.b.u(C1987R.string.nerveHealth_guidedScan_error_noData_button_close, aVar2);
                NerveHealthGuidedScanActivity nerveHealthGuidedScanActivity3 = nerveHealthGuidedScanActivity;
                wk.p.b(n.f42644a, ay.b.u(C1987R.string.nerveHealth_guidedScan_error_noData_title, aVar2), a.f42569b, u13, 0L, new o(nerveHealthGuidedScanActivity3), u14, 0L, new p(nerveHealthGuidedScanActivity3), aVar2, 390, ConstantsWs.MEASURE_TYPE_HR_LEVEL_MAX);
            }
            aVar2.J();
            NerveHealthGuidedScanActivity nerveHealthGuidedScanActivity4 = nerveHealthGuidedScanActivity;
            v.b(this.f42658e.getValue(), new q(NerveHealthGuidedScanActivity.z3(nerveHealthGuidedScanActivity)), new r(NerveHealthGuidedScanActivity.z3(nerveHealthGuidedScanActivity)), new s(nerveHealthGuidedScanActivity4), new h(nerveHealthGuidedScanActivity4), new i(nerveHealthGuidedScanActivity4), new j(NerveHealthGuidedScanActivity.z3(nerveHealthGuidedScanActivity4)), aVar2, 0);
        }
        return nm0.y.f85009a;
    }
}
