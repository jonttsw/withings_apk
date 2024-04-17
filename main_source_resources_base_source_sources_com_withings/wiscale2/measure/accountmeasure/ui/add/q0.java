package com.withings.wiscale2.measure.accountmeasure.ui.add;

import com.withings.wiscale2.measure.accountmeasure.ui.WeightView;
import tb0.r1;
/* compiled from: AddWeightFragment.kt */
/* loaded from: classes5.dex */
final class q0 extends kotlin.jvm.internal.w implements ym0.l<Double, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ o0 f58271a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(o0 o0Var) {
        super(1);
        this.f58271a = o0Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(Double d11) {
        r1 I1;
        r1 I12;
        Double d12 = d11;
        o0 o0Var = this.f58271a;
        I1 = o0Var.I1();
        WeightView weightView = I1.f99449b;
        kotlin.jvm.internal.u.g(d12);
        weightView.setValue(d12.doubleValue());
        I12 = o0Var.I1();
        I12.f99449b.d();
        return nm0.y.f85009a;
    }
}
