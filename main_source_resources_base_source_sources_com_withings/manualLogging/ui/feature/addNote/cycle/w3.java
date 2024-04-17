package com.withings.manualLogging.ui.feature.addNote.cycle;

import com.withings.cycletracking.core.model.CycleEntry;
import com.withings.manualLogging.ui.feature.addNote.cycle.Cycle2ManualLoggingNavigation$Destinations;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: CycleTrackingSymptomsAndPeriodManualLoggingActivity.kt */
/* loaded from: classes4.dex */
final class w3 extends kotlin.jvm.internal.w implements ym0.l<CycleEntry, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ r8.n f41391a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CycleTrackingSymptomsAndPeriodManualLoggingActivity f41392b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(r8.n nVar, CycleTrackingSymptomsAndPeriodManualLoggingActivity cycleTrackingSymptomsAndPeriodManualLoggingActivity) {
        super(1);
        this.f41391a = nVar;
        this.f41392b = cycleTrackingSymptomsAndPeriodManualLoggingActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(CycleEntry cycleEntry) {
        Cycle2ManualLoggingNavigation$Destinations cycle2ManualLoggingNavigation$Destinations;
        CycleEntry entry = cycleEntry;
        kotlin.jvm.internal.u.j(entry, "entry");
        Cycle2ManualLoggingNavigation$Destinations.a aVar = Cycle2ManualLoggingNavigation$Destinations.f40743b;
        CycleTrackingSymptomsAndPeriodManualLoggingActivity cycleTrackingSymptomsAndPeriodManualLoggingActivity = this.f41392b;
        long J3 = CycleTrackingSymptomsAndPeriodManualLoggingActivity.J3(cycleTrackingSymptomsAndPeriodManualLoggingActivity);
        long G3 = CycleTrackingSymptomsAndPeriodManualLoggingActivity.G3(cycleTrackingSymptomsAndPeriodManualLoggingActivity);
        aVar.getClass();
        int ordinal = entry.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            cycle2ManualLoggingNavigation$Destinations = Cycle2ManualLoggingNavigation$Destinations.f40749h;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        cycle2ManualLoggingNavigation$Destinations = Cycle2ManualLoggingNavigation$Destinations.f40748g;
                    }
                } else {
                    cycle2ManualLoggingNavigation$Destinations = Cycle2ManualLoggingNavigation$Destinations.f40747f;
                }
            } else {
                cycle2ManualLoggingNavigation$Destinations = Cycle2ManualLoggingNavigation$Destinations.f40746e;
            }
        } else {
            cycle2ManualLoggingNavigation$Destinations = Cycle2ManualLoggingNavigation$Destinations.f40745d;
        }
        StringBuilder sb2 = new StringBuilder(cycle2ManualLoggingNavigation$Destinations.a());
        sb2.append("?date=" + G3);
        sb2.append("?user_id=" + J3);
        String sb3 = sb2.toString();
        kotlin.jvm.internal.u.i(sb3, "toString(...)");
        androidx.navigation.e.L(this.f41391a, sb3, null, 6);
        return nm0.y.f85009a;
    }
}
