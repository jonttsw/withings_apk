package com.withings.manualLogging.ui.feature.addNote.cycle;

import com.withings.manualLogging.core.entity.cycle.ContraceptiveType;
/* compiled from: CycleManualLoggingNavigation.kt */
/* loaded from: classes4.dex */
final class w0 extends kotlin.jvm.internal.w implements ym0.l<ContraceptiveType, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.l<g3, nm0.y> f41380a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ g3 f41381b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(g3 g3Var, ym0.l lVar) {
        super(1);
        this.f41380a = lVar;
        this.f41381b = g3Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(ContraceptiveType contraceptiveType) {
        ContraceptiveType type = contraceptiveType;
        kotlin.jvm.internal.u.j(type, "type");
        g3 g3Var = this.f41381b;
        g3Var.p(type);
        this.f41380a.invoke(g3Var);
        return nm0.y.f85009a;
    }
}
