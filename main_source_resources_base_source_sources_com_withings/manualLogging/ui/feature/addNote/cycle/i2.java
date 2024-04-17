package com.withings.manualLogging.ui.feature.addNote.cycle;
/* compiled from: CycleOnBoardingManualLoggingActivity.kt */
/* loaded from: classes4.dex */
final class i2 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g3 f41038a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f41039b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ CycleOnBoardingManualLoggingActivity f41040c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(r8.n nVar, CycleOnBoardingManualLoggingActivity cycleOnBoardingManualLoggingActivity, g3 g3Var) {
        super(0);
        this.f41038a = g3Var;
        this.f41039b = nVar;
        this.f41040c = cycleOnBoardingManualLoggingActivity;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        int ordinal = this.f41038a.f().ordinal();
        r8.n nVar = this.f41039b;
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        int i11 = t0.f41220b;
                        kotlin.jvm.internal.u.j(nVar, "<this>");
                        nVar.J("regularity", new r0(nVar, false));
                    } else {
                        CycleOnBoardingManualLoggingActivity.J3(this.f41040c);
                    }
                } else {
                    int i12 = t0.f41220b;
                    kotlin.jvm.internal.u.j(nVar, "<this>");
                    androidx.navigation.e.L(nVar, "post_partum", null, 6);
                }
            } else {
                int i13 = t0.f41220b;
                kotlin.jvm.internal.u.j(nVar, "<this>");
                androidx.navigation.e.L(nVar, "menopause", null, 6);
            }
        } else {
            int i14 = t0.f41220b;
            kotlin.jvm.internal.u.j(nVar, "<this>");
            androidx.navigation.e.L(nVar, "contraceptive_type", null, 6);
        }
        return nm0.y.f85009a;
    }
}
