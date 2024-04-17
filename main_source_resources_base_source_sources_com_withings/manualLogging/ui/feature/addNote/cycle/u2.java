package com.withings.manualLogging.ui.feature.addNote.cycle;
/* compiled from: CycleOnBoardingManualLoggingActivity.kt */
/* loaded from: classes4.dex */
final class u2 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CycleOnBoardingManualLoggingActivity f41256a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ g3 f41257b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r8.n f41258c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(r8.n nVar, CycleOnBoardingManualLoggingActivity cycleOnBoardingManualLoggingActivity, g3 g3Var) {
        super(0);
        this.f41256a = cycleOnBoardingManualLoggingActivity;
        this.f41257b = g3Var;
        this.f41258c = nVar;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        boolean M3;
        M3 = this.f41256a.M3();
        r8.n nVar = this.f41258c;
        if (!M3) {
            g3 g3Var = this.f41257b;
            if (!gx.a.e(g3Var.b()) && !h3.c(g3Var.b())) {
                int i11 = t0.f41220b;
                kotlin.jvm.internal.u.j(nVar, "<this>");
                androidx.navigation.e.L(nVar, "period", null, 6);
                return nm0.y.f85009a;
            }
        }
        int i12 = t0.f41220b;
        kotlin.jvm.internal.u.j(nVar, "<this>");
        androidx.navigation.e.L(nVar, "duration", null, 6);
        return nm0.y.f85009a;
    }
}
