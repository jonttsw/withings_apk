package com.withings.tutorials.ui.screens.appssync.healthconnect;
/* compiled from: HealthConnectActivationActivity.kt */
/* loaded from: classes4.dex */
final /* synthetic */ class e extends kotlin.jvm.internal.s implements ym0.a<nm0.y> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public e(HealthConnectActivationActivity healthConnectActivationActivity) {
        super(0, healthConnectActivationActivity, HealthConnectActivationActivity.class, "finishWithSuccessResult", "finishWithSuccessResult()V", 0);
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        HealthConnectActivationActivity healthConnectActivationActivity = (HealthConnectActivationActivity) this.receiver;
        fn0.k<Object>[] kVarArr = HealthConnectActivationActivity.f44872i;
        healthConnectActivationActivity.setResult(-1);
        healthConnectActivationActivity.finish();
        return nm0.y.f85009a;
    }
}
