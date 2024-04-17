package com.withings.wiscale2.device.common.feature.ecg;

import com.huawei.hms.support.sms.common.ReadSmsConstant;
import com.withings.wiscale2.C1987R;
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class f1 extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ rq.e f51322a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f51323b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f51324c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(rq.e eVar, EcgActivationActivity ecgActivationActivity, ym0.a<nm0.y> aVar) {
        super(3);
        this.f51322a = eVar;
        this.f51323b = ecgActivationActivity;
        this.f51324c = aVar;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2;
        r0.h SectionCardColumn = hVar;
        androidx.compose.runtime.a aVar3 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(SectionCardColumn, "$this$SectionCardColumn");
        if ((intValue & 81) == 16 && aVar3.h()) {
            aVar3.C();
        } else {
            rq.e eVar = this.f51322a;
            String c11 = eVar.c();
            aVar3.s(-1681719418);
            if (c11 == null) {
                aVar2 = aVar3;
            } else {
                aVar2 = aVar3;
                com.withings.common.compose.component.o.g(androidx.compose.foundation.layout.x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), 0.0f, 2), null, null, ay.b.u(C1987R.string.phone_number, aVar3), this.f51323b.U3().Z0(c11), false, true, false, null, null, this.f51324c, aVar3, 1572864, 0, 934);
                nm0.y yVar = nm0.y.f85009a;
            }
            aVar2.J();
            androidx.compose.ui.e h11 = androidx.compose.foundation.layout.x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), 0.0f, 2);
            androidx.compose.runtime.a aVar4 = aVar2;
            String u11 = ay.b.u(C1987R.string.hwa09_usOnboarding_status_state_label, aVar4);
            String d11 = eVar.d();
            if (d11 == null) {
                d11 = "-";
            }
            com.withings.common.compose.component.o.g(h11, null, null, u11, d11, false, false, false, null, null, null, aVar4, 0, 0, ReadSmsConstant.FAIL);
        }
        return nm0.y.f85009a;
    }
}
