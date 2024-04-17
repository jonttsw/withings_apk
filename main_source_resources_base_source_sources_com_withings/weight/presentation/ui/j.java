package com.withings.weight.presentation.ui;

import com.withings.weight.presentation.viewmodel.BodyCompViewModel;
/* compiled from: BodyCompositionActivity.kt */
/* loaded from: classes4.dex */
final /* synthetic */ class j extends kotlin.jvm.internal.s implements ym0.l<Boolean, nm0.y> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public j(BodyCompViewModel bodyCompViewModel) {
        super(1, bodyCompViewModel, BodyCompViewModel.class, "updateBodyCompPercent", "updateBodyCompPercent(Z)V", 0);
    }

    @Override // ym0.l
    public final nm0.y invoke(Boolean bool) {
        ((BodyCompViewModel) this.receiver).R1(bool.booleanValue());
        return nm0.y.f85009a;
    }
}
