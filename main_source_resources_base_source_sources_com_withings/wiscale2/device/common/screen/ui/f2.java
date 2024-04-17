package com.withings.wiscale2.device.common.screen.ui;
/* compiled from: WorkoutScreenOrderFragment.kt */
/* loaded from: classes5.dex */
final class f2 extends kotlin.jvm.internal.w implements ym0.l<Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g2 f53300a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(g2 g2Var) {
        super(1);
        this.f53300a = g2Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(Integer num) {
        h2 h2Var;
        int intValue = num.intValue();
        h2Var = this.f53300a.f53319g;
        if (h2Var != null) {
            h2Var.y0(intValue);
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("viewModel");
        throw null;
    }
}
