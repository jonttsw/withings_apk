package com.withings.manualLogging.ui.feature.addNote.cycle;

import com.withings.manualLogging.core.entity.cycle.ContraceptiveType;
import com.withings.manualLogging.core.entity.cycle.CycleManualLoggingFactor;
/* compiled from: CycleOnBoardingManualLoggingActivity.kt */
/* loaded from: classes4.dex */
final class g2 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CycleOnBoardingManualLoggingActivity f41005a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ g3 f41006b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r8.n f41007c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f41008d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(r8.n nVar, CycleOnBoardingManualLoggingActivity cycleOnBoardingManualLoggingActivity, g3 g3Var, boolean z5) {
        super(0);
        this.f41005a = cycleOnBoardingManualLoggingActivity;
        this.f41006b = g3Var;
        this.f41007c = nVar;
        this.f41008d = z5;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        boolean M3;
        CycleOnBoardingManualLoggingActivity cycleOnBoardingManualLoggingActivity = this.f41005a;
        M3 = cycleOnBoardingManualLoggingActivity.M3();
        r8.n nVar = this.f41007c;
        if (!M3) {
            boolean e11 = kotlin.jvm.internal.u.e(CycleOnBoardingManualLoggingActivity.C3(cycleOnBoardingManualLoggingActivity), "factor");
            g3 g3Var = this.f41006b;
            if (!e11 || g3Var.f() != CycleManualLoggingFactor.f40671a) {
                if (this.f41008d && g3Var.f() == CycleManualLoggingFactor.f40672b) {
                    ContraceptiveType b10 = g3Var.b();
                    kotlin.jvm.internal.u.j(b10, "<this>");
                    int ordinal = b10.ordinal();
                    if (ordinal == 5 || ordinal == 6 || ordinal == 7) {
                        int i11 = t0.f41220b;
                        kotlin.jvm.internal.u.j(nVar, "<this>");
                        androidx.navigation.e.L(nVar, "contraceptive_start_date", null, 6);
                        return nm0.y.f85009a;
                    }
                }
                if (g3Var.f() == CycleManualLoggingFactor.f40671a) {
                    int i12 = t0.f41220b;
                    kotlin.jvm.internal.u.j(nVar, "<this>");
                    androidx.navigation.e.L(nVar, "period", null, 6);
                } else {
                    CycleOnBoardingManualLoggingActivity.H3(cycleOnBoardingManualLoggingActivity, nVar);
                }
                return nm0.y.f85009a;
            }
        }
        CycleOnBoardingManualLoggingActivity.H3(cycleOnBoardingManualLoggingActivity, nVar);
        return nm0.y.f85009a;
    }
}
