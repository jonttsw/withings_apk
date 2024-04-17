package com.withings.manualLogging.ui.feature.addNote.cycle;
/* compiled from: CycleOnBoardingManualLoggingActivity.kt */
/* loaded from: classes4.dex */
final class v2 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CycleOnBoardingManualLoggingActivity f41291a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f41292b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(CycleOnBoardingManualLoggingActivity cycleOnBoardingManualLoggingActivity, r8.n nVar) {
        super(0);
        this.f41291a = cycleOnBoardingManualLoggingActivity;
        this.f41292b = nVar;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        long userId;
        CycleOnBoardingManualLoggingActivity cycleOnBoardingManualLoggingActivity = this.f41291a;
        if (kotlin.jvm.internal.u.e(CycleOnBoardingManualLoggingActivity.C3(cycleOnBoardingManualLoggingActivity), "period")) {
            CycleManualLoggingViewModel F3 = CycleOnBoardingManualLoggingActivity.F3(cycleOnBoardingManualLoggingActivity);
            userId = cycleOnBoardingManualLoggingActivity.getUserId();
            CycleManualLoggingViewModel.c1(F3, userId, false, true, 2);
        } else {
            CycleOnBoardingManualLoggingActivity.H3(cycleOnBoardingManualLoggingActivity, this.f41292b);
        }
        return nm0.y.f85009a;
    }
}
