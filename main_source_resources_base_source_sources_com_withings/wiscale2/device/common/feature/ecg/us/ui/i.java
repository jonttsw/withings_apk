package com.withings.wiscale2.device.common.feature.ecg.us.ui;

import androidx.compose.foundation.layout.e1;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import r0.a0;
/* compiled from: EcgReviewActivity.kt */
/* loaded from: classes5.dex */
final class i extends w implements ym0.q<a0, androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ rq.e f52032a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(rq.e eVar) {
        super(3);
        this.f52032a = eVar;
    }

    @Override // ym0.q
    public final y invoke(a0 a0Var, androidx.compose.runtime.a aVar, Integer num) {
        a0 LabelCell = a0Var;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        u.j(LabelCell, "$this$LabelCell");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            float f11 = 12;
            androidx.compose.foundation.layout.k.a(androidx.compose.foundation.c.b(e1.n(androidx.compose.ui.e.f8927a, f11), s2.b.a(this.f52032a.a(), aVar2), x0.h.b(f11)), aVar2, 0);
        }
        return y.f85009a;
    }
}
