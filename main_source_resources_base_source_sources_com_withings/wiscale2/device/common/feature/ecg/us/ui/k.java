package com.withings.wiscale2.device.common.feature.ecg.us.ui;

import androidx.compose.foundation.layout.x0;
import androidx.compose.runtime.a;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.huawei.hms.support.sms.common.ReadSmsConstant;
import com.withings.wiscale2.C1987R;
import java.util.Locale;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: EcgReviewActivity.kt */
/* loaded from: classes5.dex */
final class k extends w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ rq.e f52034a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(rq.e eVar) {
        super(3);
        this.f52034a = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5 */
    @Override // ym0.q
    public final y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
        rq.e eVar;
        androidx.compose.runtime.a aVar2;
        r0.h SectionCardColumn = hVar;
        androidx.compose.runtime.a aVar3 = aVar;
        int intValue = num.intValue();
        u.j(SectionCardColumn, "$this$SectionCardColumn");
        if ((intValue & 81) == 16 && aVar3.h()) {
            aVar3.C();
        } else {
            rq.e eVar2 = this.f52034a;
            String c11 = eVar2.c();
            aVar3.s(1444417829);
            if (c11 == null) {
                eVar = eVar2;
                aVar2 = aVar3;
            } else {
                aVar3.s(1884483862);
                boolean K = aVar3.K(c11);
                Object t11 = aVar3.t();
                if (K || t11 == a.C0060a.a()) {
                    PhoneNumberUtil i11 = PhoneNumberUtil.i();
                    t11 = i11.d(i11.z(c11, Locale.US.getCountry()), PhoneNumberUtil.PhoneNumberFormat.f27150c);
                    aVar3.n(t11);
                }
                aVar3.J();
                eVar = eVar2;
                aVar2 = aVar3;
                com.withings.common.compose.component.o.g(x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), 0.0f, 2), null, null, ay.b.u(C1987R.string.phone_number, aVar3), t11, false, true, false, null, null, null, aVar3, 1572864, 0, 1958);
                y yVar = y.f85009a;
            }
            aVar2.J();
            androidx.compose.ui.e h11 = x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), 0.0f, 2);
            androidx.compose.runtime.a aVar4 = aVar2;
            String u11 = ay.b.u(C1987R.string.hwa09_usOnboarding_status_state_label, aVar4);
            String d11 = eVar.d();
            if (d11 == null) {
                d11 = "-";
            }
            com.withings.common.compose.component.o.g(h11, null, null, u11, d11, false, false, false, null, null, null, aVar4, 0, 0, ReadSmsConstant.FAIL);
        }
        return y.f85009a;
    }
}
