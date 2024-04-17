package com.withings.wiscale2.device.common.feature.ecg;
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final /* synthetic */ class jb extends kotlin.jvm.internal.s implements ym0.a<nm0.y> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public jb(WBS08EcgActivationViewModel wBS08EcgActivationViewModel) {
        super(0, wBS08EcgActivationViewModel, WBS08EcgActivationViewModel.class, "tryToResendPhoneNumber", "tryToResendPhoneNumber()V", 0);
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        ((WBS08EcgActivationViewModel) this.receiver).r1();
        return nm0.y.f85009a;
    }
}
