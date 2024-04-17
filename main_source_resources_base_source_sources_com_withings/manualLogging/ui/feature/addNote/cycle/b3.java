package com.withings.manualLogging.ui.feature.addNote.cycle;

import androidx.compose.runtime.a;
import kotlinx.coroutines.flow.Flow;
/* compiled from: CycleOnBoardingManualLoggingActivity.kt */
/* loaded from: classes4.dex */
final class b3 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CycleOnBoardingManualLoggingActivity f40938a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(CycleOnBoardingManualLoggingActivity cycleOnBoardingManualLoggingActivity) {
        super(2);
        this.f40938a = cycleOnBoardingManualLoggingActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            r8.n c11 = androidx.navigation.compose.r.c(new androidx.navigation.c0[0], aVar2);
            CycleOnBoardingManualLoggingActivity cycleOnBoardingManualLoggingActivity = this.f40938a;
            Flow<Boolean> W0 = CycleOnBoardingManualLoggingActivity.F3(cycleOnBoardingManualLoggingActivity).W0();
            Boolean bool = Boolean.FALSE;
            k1.r0 a11 = h6.b.a(W0, bool, aVar2, 56);
            boolean X0 = CycleOnBoardingManualLoggingActivity.F3(cycleOnBoardingManualLoggingActivity).X0();
            k1.r0 a12 = androidx.compose.runtime.l0.a(CycleOnBoardingManualLoggingActivity.F3(cycleOnBoardingManualLoggingActivity).Z0(), new g3(), null, aVar2, 2);
            k1.r0 a13 = androidx.compose.runtime.l0.a(CycleOnBoardingManualLoggingActivity.F3(cycleOnBoardingManualLoggingActivity).R0(), -1L, null, aVar2, 2);
            k1.r0 a14 = androidx.compose.runtime.l0.a(CycleOnBoardingManualLoggingActivity.F3(cycleOnBoardingManualLoggingActivity).Y0(), bool, null, aVar2, 2);
            aVar2.s(1988352151);
            Object t11 = aVar2.t();
            if (t11 == a.C0060a.a()) {
                t11 = androidx.compose.runtime.l0.e(new a3(this.f40938a, c11, X0, a12, a11, a13, a14));
                aVar2.n(t11);
            }
            k1.o1 o1Var = (k1.o1) t11;
            aVar2.J();
            androidx.activity.z a15 = e.m.a(aVar2);
            aVar2.s(1988352601);
            Object t12 = aVar2.t();
            if (t12 == a.C0060a.a()) {
                t12 = androidx.compose.runtime.l0.f(CycleOnBoardingManualLoggingActivity.C3(cycleOnBoardingManualLoggingActivity), androidx.compose.runtime.v0.f8878a);
                aVar2.n(t12);
            }
            k1.r0 r0Var = (k1.r0) t12;
            aVar2.J();
            k1.r0 a16 = androidx.compose.runtime.l0.a(CycleOnBoardingManualLoggingActivity.F3(cycleOnBoardingManualLoggingActivity).T0(), -1, null, aVar2, 2);
            k1.y.f("collect-error", new w2(cycleOnBoardingManualLoggingActivity, null), aVar2);
            k1.y.f("collect-event", new x2(cycleOnBoardingManualLoggingActivity, c11, r0Var, null), aVar2);
            y2 y2Var = new y2(cycleOnBoardingManualLoggingActivity);
            v0.a(kotlin.jvm.internal.u.e(CycleOnBoardingManualLoggingActivity.C3(cycleOnBoardingManualLoggingActivity), "period"), (String) r0Var.getValue(), c11, a15, ((Number) a16.getValue()).intValue(), new z2(cycleOnBoardingManualLoggingActivity, c11), y2Var, (g3) a12.getValue(), CycleOnBoardingManualLoggingActivity.F3(cycleOnBoardingManualLoggingActivity).O0(), (u0) o1Var.getValue(), aVar2, 16781824, 0);
        }
        return nm0.y.f85009a;
    }
}
