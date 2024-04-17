package com.withings.manualLogging.ui.feature.addNote.cycle;
/* compiled from: CycleOnBoardingManualLoggingActivity.kt */
/* loaded from: classes4.dex */
final class t2 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CycleOnBoardingManualLoggingActivity f41227a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f41228b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r8.n f41229c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(CycleOnBoardingManualLoggingActivity cycleOnBoardingManualLoggingActivity, boolean z5, r8.n nVar) {
        super(0);
        this.f41227a = cycleOnBoardingManualLoggingActivity;
        this.f41228b = z5;
        this.f41229c = nVar;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        androidx.activity.result.b bVar;
        CycleOnBoardingManualLoggingActivity cycleOnBoardingManualLoggingActivity = this.f41227a;
        bVar = cycleOnBoardingManualLoggingActivity.f40800m;
        ch.d dVar = cycleOnBoardingManualLoggingActivity.f40795h;
        if (dVar != null) {
            bVar.a(ch.g.b(dVar.a(), cycleOnBoardingManualLoggingActivity, 121, false, 12));
            boolean z5 = this.f41228b;
            r8.n nVar = this.f41229c;
            if (z5) {
                int i11 = t0.f41220b;
                kotlin.jvm.internal.u.j(nVar, "<this>");
                androidx.navigation.e.L(nVar, "factor", null, 6);
            } else {
                int i12 = t0.f41220b;
                kotlin.jvm.internal.u.j(nVar, "<this>");
                nVar.J("regularity", new r0(nVar, false));
            }
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("intentBuilder");
        throw null;
    }
}
