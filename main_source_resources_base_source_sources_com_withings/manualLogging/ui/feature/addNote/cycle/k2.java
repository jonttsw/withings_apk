package com.withings.manualLogging.ui.feature.addNote.cycle;

import kotlin.jvm.internal.u;
/* compiled from: CycleOnBoardingManualLoggingActivity.kt */
/* loaded from: classes4.dex */
final /* synthetic */ class k2 extends kotlin.jvm.internal.s implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f41076a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f41077b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(r8.n nVar, boolean z5) {
        super(0, u.a.class, "navigateToFactors", "getButtonClickNavigation$navigateToFactors(ZLandroidx/navigation/NavHostController;)V", 0);
        this.f41076a = z5;
        this.f41077b = nVar;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        int i11 = CycleOnBoardingManualLoggingActivity.f40791o;
        boolean z5 = this.f41076a;
        r8.n nVar = this.f41077b;
        if (z5) {
            int i12 = t0.f41220b;
            kotlin.jvm.internal.u.j(nVar, "<this>");
            androidx.navigation.e.L(nVar, "factor", null, 6);
        } else {
            int i13 = t0.f41220b;
            kotlin.jvm.internal.u.j(nVar, "<this>");
            nVar.J("regularity", new r0(nVar, false));
        }
        return nm0.y.f85009a;
    }
}
