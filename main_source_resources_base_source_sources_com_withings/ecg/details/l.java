package com.withings.ecg.details;

import com.withings.common.compose.component.d4;
import com.withings.wiscale2.C1987R;
import java.util.List;
/* compiled from: EcgDetailsFragment.kt */
/* loaded from: classes3.dex */
final class l extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g f38254a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(g gVar) {
        super(2);
        this.f38254a = gVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        int i11;
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            g gVar = this.f38254a;
            b0 b0Var = gVar.f38210p;
            if (b0Var != null) {
                if (((Boolean) t1.d.b(b0Var.W0(), Boolean.FALSE, aVar2).getValue()).booleanValue()) {
                    b0 b0Var2 = gVar.f38210p;
                    if (b0Var2 != null) {
                        k1.r0 a11 = t1.d.a(b0Var2.V0(), aVar2);
                        androidx.compose.ui.e j5 = androidx.compose.foundation.layout.x0.j(androidx.compose.foundation.layout.x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), 0.0f, 2), 0.0f, yk.h.B(), 0.0f, 0.0f, 13);
                        List W = kotlin.collections.x.W(ay.b.u(C1987R.string.d1_lead_ecg_signal, aVar2), ay.b.u(C1987R.string.d2_lead_ecg_signal, aVar2), ay.b.u(C1987R.string.d3_lead_ecg_signal, aVar2), ay.b.u(C1987R.string.avf_lead_ecg_signal, aVar2), ay.b.u(C1987R.string.avl_lead_ecg_signal, aVar2), ay.b.u(C1987R.string.avr_lead_ecg_signal, aVar2));
                        Integer num2 = (Integer) a11.getValue();
                        if (num2 != null) {
                            i11 = num2.intValue();
                        } else {
                            i11 = 0;
                        }
                        d4.b(W, i11, new k(gVar), j5, 0L, 0L, null, null, 0.0f, false, 0, aVar2, 0, 0, 2032);
                    } else {
                        kotlin.jvm.internal.u.s("viewModel");
                        throw null;
                    }
                }
            } else {
                kotlin.jvm.internal.u.s("viewModel");
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}
