package com.withings.manualLogging.ui.feature.addNote.cycle;

import com.withings.manualLogging.core.entity.cycle.ContraceptiveRegime;
/* compiled from: CycleManualLoggingNavigation.kt */
/* loaded from: classes4.dex */
final class x0 extends kotlin.jvm.internal.w implements ym0.l<ContraceptiveRegime, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.l<g3, nm0.y> f41395a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ g3 f41396b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(g3 g3Var, ym0.l lVar) {
        super(1);
        this.f41395a = lVar;
        this.f41396b = g3Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(ContraceptiveRegime contraceptiveRegime) {
        ContraceptiveRegime regime = contraceptiveRegime;
        kotlin.jvm.internal.u.j(regime, "regime");
        g3 g3Var = this.f41396b;
        g3Var.o(regime);
        this.f41395a.invoke(g3Var);
        return nm0.y.f85009a;
    }
}
