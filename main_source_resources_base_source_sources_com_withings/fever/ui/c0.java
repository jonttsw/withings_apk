package com.withings.fever.ui;

import androidx.compose.foundation.layout.x0;
import androidx.compose.runtime.a;
import com.withings.wiscale2.C1987R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BodyTemperatureScreen.kt */
/* loaded from: classes3.dex */
public final class c0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f39222a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(ym0.a<nm0.y> aVar) {
        super(2);
        this.f39222a = aVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            androidx.compose.ui.e h11 = x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), 0.0f, 2);
            String u11 = ay.b.u(C1987R.string.detailview_options_addManualMeasurement, aVar2);
            aVar2.s(-1848914408);
            ym0.a<nm0.y> aVar3 = this.f39222a;
            boolean K = aVar2.K(aVar3);
            Object t11 = aVar2.t();
            if (K || t11 == a.C0060a.a()) {
                t11 = new b0(aVar3);
                aVar2.n(t11);
            }
            aVar2.J();
            com.withings.common.compose.component.o.g(h11, null, null, u11, null, false, false, true, null, null, (ym0.a) t11, aVar2, 12582912, 0, 886);
        }
        return nm0.y.f85009a;
    }
}
