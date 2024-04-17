package com.withings.medicalreport.ui;

import androidx.compose.foundation.layout.x0;
import androidx.compose.ui.e;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import k1.r0;
import org.joda.time.DateTime;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DateSelectionFragment.kt */
/* loaded from: classes4.dex */
public final class f extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DateSelectionFragment f42245a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(DateSelectionFragment dateSelectionFragment) {
        super(3);
        this.f42245a = dateSelectionFragment;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
        u w12;
        u w13;
        String str;
        String str2;
        r0.h SectionCardColumn = hVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(SectionCardColumn, "$this$SectionCardColumn");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            DateSelectionFragment dateSelectionFragment = this.f42245a;
            w12 = dateSelectionFragment.w1();
            String str3 = null;
            r0 b10 = t1.d.b(w12.y0(), null, aVar2);
            w13 = dateSelectionFragment.w1();
            r0 b11 = t1.d.b(w13.k0(), null, aVar2);
            DateTime dateTime = (DateTime) b10.getValue();
            if (dateTime != null) {
                str = dateTime.toString(dateSelectionFragment.getString(C1987R.string._DATE_MMM_D_YYYY_));
            } else {
                str = null;
            }
            aVar2.s(1364091708);
            if (str == null) {
                str = ay.b.u(C1987R.string.tap_to_edit, aVar2);
            }
            String str4 = str;
            aVar2.J();
            DateTime dateTime2 = (DateTime) b11.getValue();
            if (dateTime2 != null) {
                str3 = dateTime2.toString(dateSelectionFragment.getString(C1987R.string._DATE_MMM_D_YYYY_));
            }
            aVar2.s(1364091848);
            if (str3 == null) {
                str2 = ay.b.u(C1987R.string.tap_to_edit, aVar2);
            } else {
                str2 = str3;
            }
            aVar2.J();
            e.a aVar3 = androidx.compose.ui.e.f8927a;
            com.withings.common.compose.component.o.g(x0.h(aVar3, yk.h.o(), 0.0f, 2), null, a.f42229b, ay.b.u(C1987R.string._FROM_, aVar2), str4, false, false, false, null, null, new c(dateSelectionFragment, b10), aVar2, ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED, 0, ConstantsWs.BLINDCODE_DHCP_ERROR);
            com.withings.common.compose.component.o.g(x0.h(aVar3, yk.h.o(), 0.0f, 2), null, a.f42230c, ay.b.u(C1987R.string._TO_, aVar2), str2, true, false, false, null, null, new e(b11, b10, dateSelectionFragment), aVar2, 196992, 0, 962);
        }
        return nm0.y.f85009a;
    }
}
