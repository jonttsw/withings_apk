package com.withings.weight.presentation.ui;

import com.withings.weight.presentation.viewmodel.WeightViewModel;
/* compiled from: WeightActivity.kt */
/* loaded from: classes4.dex */
final /* synthetic */ class j0 extends kotlin.jvm.internal.s implements ym0.l<Boolean, nm0.y> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public j0(WeightViewModel weightViewModel) {
        super(1, weightViewModel, WeightViewModel.class, "setShowNormalityZones", "setShowNormalityZones(Z)V", 0);
    }

    @Override // ym0.l
    public final nm0.y invoke(Boolean bool) {
        ((WeightViewModel) this.receiver).r1(bool.booleanValue());
        return nm0.y.f85009a;
    }
}
