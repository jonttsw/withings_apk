package com.withings.manualLogging.ui.feature.addNote.cycle;

import androidx.compose.runtime.a;
import com.withings.wiscale2.C1987R;
/* compiled from: CycleManualLogging.kt */
/* loaded from: classes4.dex */
final class l0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g3 f41083a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.l<Integer, nm0.y> f41084b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l0(g3 g3Var, ym0.l<? super Integer, nm0.y> lVar) {
        super(2);
        this.f41083a = g3Var;
        this.f41084b = lVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            r0.d0.a(androidx.compose.foundation.layout.e1.f(androidx.compose.ui.e.f8927a, yk.h.B()), aVar2);
            String u11 = ay.b.u(C1987R.string.cycle_tracking_onboarding_periodslength_title, aVar2);
            Integer valueOf = Integer.valueOf(this.f41083a.k());
            aVar2.s(-200936563);
            ym0.l<Integer, nm0.y> lVar = this.f41084b;
            boolean K = aVar2.K(lVar);
            Object t11 = aVar2.t();
            if (K || t11 == a.C0060a.a()) {
                t11 = new k0(lVar);
                aVar2.n(t11);
            }
            aVar2.J();
            fk.n.a(null, u11, null, valueOf, false, null, null, 0, null, (ym0.l) t11, aVar2, 0, 501);
        }
        return nm0.y.f85009a;
    }
}
