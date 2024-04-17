package com.withings.manualLogging.ui.feature.addNote.cycle;

import com.withings.manualLogging.core.entity.cycle.CycleRegularity;
/* compiled from: CycleManualLoggingNavigation.kt */
/* loaded from: classes4.dex */
final class i1 extends kotlin.jvm.internal.w implements ym0.l<CycleRegularity, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.l<g3, nm0.y> f41036a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ g3 f41037b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(g3 g3Var, ym0.l lVar) {
        super(1);
        this.f41036a = lVar;
        this.f41037b = g3Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(CycleRegularity cycleRegularity) {
        CycleRegularity regularity = cycleRegularity;
        kotlin.jvm.internal.u.j(regularity, "regularity");
        g3 g3Var = this.f41037b;
        g3Var.r(regularity);
        this.f41036a.invoke(g3Var);
        return nm0.y.f85009a;
    }
}
