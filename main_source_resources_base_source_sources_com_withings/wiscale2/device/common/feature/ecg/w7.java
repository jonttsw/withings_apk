package com.withings.wiscale2.device.common.feature.ecg;

import com.huawei.hms.support.sms.common.ReadSmsConstant;
import com.withings.wiscale2.C1987R;
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class w7 extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ rq.e f52086a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ WBS08EcgActivationActivity f52087b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f52088c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7(rq.e eVar, WBS08EcgActivationActivity wBS08EcgActivationActivity, ym0.a<nm0.y> aVar) {
        super(3);
        this.f52086a = eVar;
        this.f52087b = wBS08EcgActivationActivity;
        this.f52088c = aVar;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
        WBS08EcgActivationViewModel R3;
        androidx.compose.runtime.a aVar2;
        r0.h SectionCardColumn = hVar;
        androidx.compose.runtime.a aVar3 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(SectionCardColumn, "$this$SectionCardColumn");
        if ((intValue & 81) == 16 && aVar3.h()) {
            aVar3.C();
        } else {
            rq.e eVar = this.f52086a;
            String c11 = eVar.c();
            aVar3.s(664996694);
            if (c11 == null) {
                aVar2 = aVar3;
            } else {
                androidx.compose.ui.e h11 = androidx.compose.foundation.layout.x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), 0.0f, 2);
                String u11 = ay.b.u(C1987R.string.phone_number, aVar3);
                R3 = this.f52087b.R3();
                aVar2 = aVar3;
                com.withings.common.compose.component.o.g(h11, null, null, u11, R3.z0(c11), false, true, false, null, null, this.f52088c, aVar3, 1572864, 0, 934);
                nm0.y yVar = nm0.y.f85009a;
            }
            aVar2.J();
            androidx.compose.ui.e h12 = androidx.compose.foundation.layout.x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), 0.0f, 2);
            androidx.compose.runtime.a aVar4 = aVar2;
            String u12 = ay.b.u(C1987R.string.hwa09_usOnboarding_status_state_label, aVar4);
            String d11 = eVar.d();
            if (d11 == null) {
                d11 = "-";
            }
            com.withings.common.compose.component.o.g(h12, null, null, u12, d11, false, false, false, null, null, null, aVar4, 0, 0, ReadSmsConstant.FAIL);
        }
        return nm0.y.f85009a;
    }
}
