package com.withings.manualLogging.ui.feature.addNote.cycle;
/* compiled from: CycleTrackingSymptomsAndPeriodManualLoggingActivity.kt */
/* loaded from: classes4.dex */
final class d4 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CycleTrackingSymptomsAndPeriodManualLoggingActivity f40984a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(CycleTrackingSymptomsAndPeriodManualLoggingActivity cycleTrackingSymptomsAndPeriodManualLoggingActivity) {
        super(2);
        this.f40984a = cycleTrackingSymptomsAndPeriodManualLoggingActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            r8.n c11 = androidx.navigation.compose.r.c(new androidx.navigation.c0[0], aVar2);
            String a11 = Cycle2ManualLoggingNavigation$Destinations.f40744c.a();
            CycleTrackingSymptomsAndPeriodManualLoggingActivity cycleTrackingSymptomsAndPeriodManualLoggingActivity = this.f40984a;
            androidx.navigation.compose.s.b(c11, a11, null, null, null, s3.f41216a, t3.f41230a, u3.f41259a, v3.f41293a, new c4(c11, cycleTrackingSymptomsAndPeriodManualLoggingActivity), aVar2, 115015736, 28);
            t4.a(c11, CycleTrackingSymptomsAndPeriodManualLoggingActivity.I3(cycleTrackingSymptomsAndPeriodManualLoggingActivity), aVar2, 8);
        }
        return nm0.y.f85009a;
    }
}
