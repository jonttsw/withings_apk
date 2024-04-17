package com.withings.manualLogging.ui.feature.addNote.cycle;
/* compiled from: CycleOnBoardingManualLoggingActivity.kt */
/* loaded from: classes4.dex */
final class z2 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CycleOnBoardingManualLoggingActivity f41429a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f41430b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(CycleOnBoardingManualLoggingActivity cycleOnBoardingManualLoggingActivity, r8.n nVar) {
        super(0);
        this.f41429a = cycleOnBoardingManualLoggingActivity;
        this.f41430b = nVar;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        int i11 = CycleOnBoardingManualLoggingActivity.f40791o;
        CycleOnBoardingManualLoggingActivity cycleOnBoardingManualLoggingActivity = this.f41429a;
        cycleOnBoardingManualLoggingActivity.getClass();
        if (!this.f41430b.N()) {
            cycleOnBoardingManualLoggingActivity.finish();
        }
        return nm0.y.f85009a;
    }
}
