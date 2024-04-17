package com.withings.manualLogging.ui.feature.addNote.cycle;

import com.withings.manualLogging.core.entity.cycle.CycleRegularity;
/* compiled from: CycleOnBoardingManualLoggingActivity.kt */
/* loaded from: classes4.dex */
final class h2 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g3 f41028a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CycleOnBoardingManualLoggingActivity f41029b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r8.n f41030c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(r8.n nVar, CycleOnBoardingManualLoggingActivity cycleOnBoardingManualLoggingActivity, g3 g3Var) {
        super(0);
        this.f41028a = g3Var;
        this.f41029b = cycleOnBoardingManualLoggingActivity;
        this.f41030c = nVar;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        boolean z5;
        boolean M3;
        g3 g3Var = this.f41028a;
        CycleRegularity d11 = g3Var.d();
        kotlin.jvm.internal.u.j(d11, "<this>");
        CycleRegularity cycleRegularity = CycleRegularity.f40684d;
        if (d11 == cycleRegularity) {
            z5 = true;
        } else {
            z5 = false;
        }
        r8.n nVar = this.f41030c;
        if (z5) {
            CycleOnBoardingManualLoggingActivity cycleOnBoardingManualLoggingActivity = this.f41029b;
            M3 = cycleOnBoardingManualLoggingActivity.M3();
            if (M3) {
                CycleOnBoardingManualLoggingActivity.H3(cycleOnBoardingManualLoggingActivity, nVar);
                return nm0.y.f85009a;
            }
        }
        CycleRegularity d12 = g3Var.d();
        kotlin.jvm.internal.u.j(d12, "<this>");
        if (d12 == cycleRegularity) {
            int i11 = t0.f41220b;
            kotlin.jvm.internal.u.j(nVar, "<this>");
            androidx.navigation.e.L(nVar, "period", null, 6);
        } else {
            int i12 = t0.f41220b;
            kotlin.jvm.internal.u.j(nVar, "<this>");
            androidx.navigation.e.L(nVar, "length", null, 6);
        }
        return nm0.y.f85009a;
    }
}
