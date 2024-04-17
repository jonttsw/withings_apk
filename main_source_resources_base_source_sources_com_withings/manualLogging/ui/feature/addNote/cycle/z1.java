package com.withings.manualLogging.ui.feature.addNote.cycle;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CycleManualLoggingViewModel.kt */
/* loaded from: classes4.dex */
public final class z1 extends kotlin.jvm.internal.w implements ym0.l<g3, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CycleManualLoggingViewModel f41428a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(CycleManualLoggingViewModel cycleManualLoggingViewModel) {
        super(1);
        this.f41428a = cycleManualLoggingViewModel;
    }

    @Override // ym0.l
    public final nm0.y invoke(g3 g3Var) {
        g3 form = g3Var;
        kotlin.jvm.internal.u.j(form, "form");
        this.f41428a.f40771t.setValue(form);
        return nm0.y.f85009a;
    }
}
