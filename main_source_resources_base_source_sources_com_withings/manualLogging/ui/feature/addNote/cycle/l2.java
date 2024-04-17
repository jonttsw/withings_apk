package com.withings.manualLogging.ui.feature.addNote.cycle;
/* compiled from: CycleOnBoardingManualLoggingActivity.kt */
/* loaded from: classes4.dex */
final class l2 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Boolean f41087a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CycleOnBoardingManualLoggingActivity f41088b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ long f41089c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ r8.n f41090d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(Boolean bool, CycleOnBoardingManualLoggingActivity cycleOnBoardingManualLoggingActivity, long j5, r8.n nVar) {
        super(0);
        this.f41087a = bool;
        this.f41088b = cycleOnBoardingManualLoggingActivity;
        this.f41089c = j5;
        this.f41090d = nVar;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        if (kotlin.jvm.internal.u.e(this.f41087a, Boolean.TRUE)) {
            CycleOnBoardingManualLoggingActivity.L3(this.f41088b, this.f41089c, true);
        } else {
            r8.n nVar = this.f41090d;
            kotlin.jvm.internal.u.j(nVar, "<this>");
            androidx.navigation.e.L(nVar, "cycle_tutorial_log", null, 6);
        }
        return nm0.y.f85009a;
    }
}
