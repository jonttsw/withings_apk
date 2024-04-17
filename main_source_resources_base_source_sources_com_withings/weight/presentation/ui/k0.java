package com.withings.weight.presentation.ui;

import com.withings.weight.presentation.viewmodel.WeightViewModel;
/* compiled from: WeightActivity.kt */
/* loaded from: classes4.dex */
final /* synthetic */ class k0 extends kotlin.jvm.internal.s implements ym0.p<ws.c, Boolean, nm0.y> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public k0(WeightViewModel weightViewModel) {
        super(2, weightViewModel, WeightViewModel.class, "onOptionSelected", "onOptionSelected(Lcom/withings/graph/model/GraphOptionUiModel;Z)V", 0);
    }

    @Override // ym0.p
    public final nm0.y invoke(ws.c cVar, Boolean bool) {
        ws.c p02 = cVar;
        boolean booleanValue = bool.booleanValue();
        kotlin.jvm.internal.u.j(p02, "p0");
        ((WeightViewModel) this.receiver).n1(p02, booleanValue);
        return nm0.y.f85009a;
    }
}
