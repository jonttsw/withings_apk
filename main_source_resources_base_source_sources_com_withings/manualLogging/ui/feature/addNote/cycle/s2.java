package com.withings.manualLogging.ui.feature.addNote.cycle;
/* compiled from: CycleOnBoardingManualLoggingActivity.kt */
/* loaded from: classes4.dex */
final class s2 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CycleOnBoardingManualLoggingActivity f41212a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f41213b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r8.n f41214c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f41215d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(CycleOnBoardingManualLoggingActivity cycleOnBoardingManualLoggingActivity, boolean z5, r8.n nVar, boolean z11) {
        super(0);
        this.f41212a = cycleOnBoardingManualLoggingActivity;
        this.f41213b = z5;
        this.f41214c = nVar;
        this.f41215d = z11;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        CycleOnBoardingManualLoggingActivity.K3(this.f41212a);
        boolean z5 = this.f41213b;
        r8.n nVar = this.f41214c;
        if (z5) {
            int i11 = t0.f41220b;
            kotlin.jvm.internal.u.j(nVar, "<this>");
            androidx.navigation.e.L(nVar, "cycle_sync_health_connect", null, 6);
        } else if (this.f41215d) {
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
