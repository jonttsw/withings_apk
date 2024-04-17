package com.withings.manualLogging.ui.feature.addNote.cycle;

import com.withings.manualLogging.core.entity.cycle.ContraceptiveType;
/* compiled from: CycleOnBoardingManualLoggingActivity.kt */
/* loaded from: classes4.dex */
final class n2 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f41131a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ g3 f41132b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r8.n f41133c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ CycleOnBoardingManualLoggingActivity f41134d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(r8.n nVar, CycleOnBoardingManualLoggingActivity cycleOnBoardingManualLoggingActivity, g3 g3Var, boolean z5) {
        super(0);
        this.f41131a = z5;
        this.f41132b = g3Var;
        this.f41133c = nVar;
        this.f41134d = cycleOnBoardingManualLoggingActivity;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        g3 g3Var = this.f41132b;
        r8.n nVar = this.f41133c;
        boolean z5 = this.f41131a;
        if (z5 && gx.a.e(g3Var.b())) {
            int i11 = t0.f41220b;
            kotlin.jvm.internal.u.j(nVar, "<this>");
            androidx.navigation.e.L(nVar, "contraceptive_regime", null, 6);
        } else {
            if (z5) {
                ContraceptiveType b10 = g3Var.b();
                kotlin.jvm.internal.u.j(b10, "<this>");
                int ordinal = b10.ordinal();
                if (ordinal == 5 || ordinal == 6 || ordinal == 7) {
                    int i12 = t0.f41220b;
                    kotlin.jvm.internal.u.j(nVar, "<this>");
                    androidx.navigation.e.L(nVar, "contraceptive_start_date", null, 6);
                }
            }
            if (z5 && h3.c(g3Var.b())) {
                int i13 = t0.f41220b;
                kotlin.jvm.internal.u.j(nVar, "<this>");
                androidx.navigation.e.L(nVar, "length", null, 6);
            } else {
                CycleOnBoardingManualLoggingActivity.H3(this.f41134d, nVar);
            }
        }
        return nm0.y.f85009a;
    }
}
