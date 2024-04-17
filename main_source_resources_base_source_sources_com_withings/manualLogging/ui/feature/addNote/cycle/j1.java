package com.withings.manualLogging.ui.feature.addNote.cycle;
/* compiled from: CycleManualLoggingNavigation.kt */
/* loaded from: classes4.dex */
final class j1 extends kotlin.jvm.internal.w implements ym0.l<Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.l<g3, nm0.y> f41060a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ g3 f41061b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(g3 g3Var, ym0.l lVar) {
        super(1);
        this.f41060a = lVar;
        this.f41061b = g3Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(Integer num) {
        int intValue = num.intValue();
        g3 g3Var = this.f41061b;
        g3Var.q(intValue);
        this.f41060a.invoke(g3Var);
        return nm0.y.f85009a;
    }
}
