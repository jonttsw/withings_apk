package com.withings.weight.presentation.ui;

import com.withings.weight.presentation.viewmodel.BodyCompViewModel;
/* compiled from: BodyCompositionActivity.kt */
/* loaded from: classes4.dex */
final /* synthetic */ class l extends kotlin.jvm.internal.s implements ym0.p<ws.c, Boolean, nm0.y> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public l(BodyCompViewModel bodyCompViewModel) {
        super(2, bodyCompViewModel, BodyCompViewModel.class, "onGraphOptionSelected", "onGraphOptionSelected(Lcom/withings/graph/model/GraphOptionUiModel;Z)V", 0);
    }

    @Override // ym0.p
    public final nm0.y invoke(ws.c cVar, Boolean bool) {
        ws.c p02 = cVar;
        boolean booleanValue = bool.booleanValue();
        kotlin.jvm.internal.u.j(p02, "p0");
        ((BodyCompViewModel) this.receiver).G1(p02, booleanValue);
        return nm0.y.f85009a;
    }
}
