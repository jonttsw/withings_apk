package com.withings.manualLogging.ui.feature.addNote.cycle;

import org.joda.time.LocalDate;
/* compiled from: CycleManualLoggingNavigation.kt */
/* loaded from: classes4.dex */
final class k1 extends kotlin.jvm.internal.w implements ym0.l<LocalDate, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.l<g3, nm0.y> f41074a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ g3 f41075b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(g3 g3Var, ym0.l lVar) {
        super(1);
        this.f41074a = lVar;
        this.f41075b = g3Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(LocalDate localDate) {
        LocalDate date = localDate;
        kotlin.jvm.internal.u.j(date, "date");
        g3 g3Var = this.f41075b;
        g3Var.u(date);
        this.f41074a.invoke(g3Var);
        return nm0.y.f85009a;
    }
}
