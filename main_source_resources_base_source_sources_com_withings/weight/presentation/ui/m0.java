package com.withings.weight.presentation.ui;

import com.withings.weight.presentation.viewmodel.WeightViewModel;
/* compiled from: WeightActivity.kt */
/* loaded from: classes4.dex */
final /* synthetic */ class m0 extends kotlin.jvm.internal.s implements ym0.l<ws.f, nm0.y> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public m0(WeightViewModel weightViewModel) {
        super(1, weightViewModel, WeightViewModel.class, "onViewportChange", "onViewportChange(Lcom/withings/graph/model/TimeGraphViewport;)V", 0);
    }

    @Override // ym0.l
    public final nm0.y invoke(ws.f fVar) {
        ws.f p02 = fVar;
        kotlin.jvm.internal.u.j(p02, "p0");
        ((WeightViewModel) this.receiver).o1(p02);
        return nm0.y.f85009a;
    }
}
