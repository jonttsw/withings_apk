package com.withings.manualLogging.ui.feature.addNote.cycle;

import com.withings.manualLogging.core.entity.cycle.CycleManualLoggingFactor;
import com.withings.manualLogging.core.entity.cycle.CycleManualLoggingImpactOnPredictions;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: CycleManualLoggingNavigation.kt */
/* loaded from: classes4.dex */
final class f1 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g3 f40994a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(g3 g3Var) {
        super(2);
        this.f40994a = g3Var;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        CycleManualLoggingImpactOnPredictions cycleManualLoggingImpactOnPredictions;
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            CycleManualLoggingFactor f11 = this.f40994a.f();
            kotlin.jvm.internal.u.j(f11, "<this>");
            int ordinal = f11.ordinal();
            if (ordinal != 0 && ordinal != 1) {
                if (ordinal != 2 && ordinal != 3 && ordinal != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                cycleManualLoggingImpactOnPredictions = CycleManualLoggingImpactOnPredictions.f40679c;
            } else {
                cycleManualLoggingImpactOnPredictions = CycleManualLoggingImpactOnPredictions.f40677a;
            }
            rx.q.b(cycleManualLoggingImpactOnPredictions, aVar2, 0);
        }
        return nm0.y.f85009a;
    }
}
