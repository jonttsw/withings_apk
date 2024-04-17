package com.withings.wiscale2.device.common.feature.ecg;
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final /* synthetic */ class ib extends kotlin.jvm.internal.s implements ym0.a<nm0.y> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ib(WBS08EcgActivationViewModel wBS08EcgActivationViewModel) {
        super(0, wBS08EcgActivationViewModel, WBS08EcgActivationViewModel.class, "tryToSendSmsCodeInput", "tryToSendSmsCodeInput()V", 0);
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        ((WBS08EcgActivationViewModel) this.receiver).t1();
        return nm0.y.f85009a;
    }
}
