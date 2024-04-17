package com.withings.manualLogging.ui.feature.addNote.cycle;

import com.withings.wiscale2.C1987R;
/* compiled from: CycleManualLogging.kt */
/* loaded from: classes4.dex */
final class p extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g3 f41153a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.l<Integer, nm0.y> f41154b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(g3 g3Var, ym0.l<? super Integer, nm0.y> lVar) {
        super(2);
        this.f41153a = g3Var;
        this.f41154b = lVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            nk.a.g(0, 0, 0, 61, 0L, aVar2, null, null, ay.b.u(C1987R.string.cycle_tracking_onboarding_cyclelength_def, aVar2));
            r0.d0.a(androidx.compose.foundation.layout.e1.f(androidx.compose.ui.e.f8927a, yk.h.B()), aVar2);
            fk.n.a(null, ay.b.u(C1987R.string.cycle_tracking_onboarding_periodslength_title, aVar2), null, Integer.valueOf(this.f41153a.c()), false, null, null, 0, null, this.f41154b, aVar2, 0, 501);
        }
        return nm0.y.f85009a;
    }
}
