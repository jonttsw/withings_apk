package com.withings.manualLogging.ui.feature.addNote.cycle;

import com.withings.manualLogging.core.entity.cycle.CycleManualLoggingFactor;
/* compiled from: CycleManualLoggingNavigation.kt */
/* loaded from: classes4.dex */
final class g1 extends kotlin.jvm.internal.w implements ym0.l<CycleManualLoggingFactor, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.l<g3, nm0.y> f41003a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ g3 f41004b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(g3 g3Var, ym0.l lVar) {
        super(1);
        this.f41003a = lVar;
        this.f41004b = g3Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(CycleManualLoggingFactor cycleManualLoggingFactor) {
        CycleManualLoggingFactor factor = cycleManualLoggingFactor;
        kotlin.jvm.internal.u.j(factor, "factor");
        g3 g3Var = this.f41004b;
        g3Var.s(factor);
        this.f41003a.invoke(g3Var);
        return nm0.y.f85009a;
    }
}
