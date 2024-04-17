package com.withings.manualLogging.ui.feature.addNote.cycle;

import androidx.compose.material3.a9;
import androidx.compose.material3.f8;
import androidx.compose.material3.g8;
import androidx.compose.ui.e;
import com.withings.manualLogging.core.entity.cycle.CycleRegularity;
import com.withings.wiscale2.C1987R;
/* compiled from: CycleManualLogging.kt */
/* loaded from: classes4.dex */
final class y extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g3 f41411a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.l<CycleRegularity, nm0.y> f41412b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y(g3 g3Var, ym0.l<? super CycleRegularity, nm0.y> lVar) {
        super(2);
        this.f41411a = g3Var;
        this.f41412b = lVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            nk.a.g(0, 0, 0, 61, 0L, aVar2, null, null, ay.b.u(C1987R.string.cycle_tracking_onboarding_regular_def, aVar2));
            e.a aVar3 = androidx.compose.ui.e.f8927a;
            r0.d0.a(androidx.compose.foundation.layout.e1.f(aVar3, yk.h.B()), aVar2);
            a9.a(androidx.compose.foundation.layout.e1.e(aVar3, 1.0f), ((f8) aVar2.D(g8.a())).d(), 0L, 0L, 0.0f, 0.0f, null, s1.b.b(aVar2, -983600725, new x(this.f41411a, this.f41412b)), aVar2, 12582918, 124);
        }
        return nm0.y.f85009a;
    }
}
