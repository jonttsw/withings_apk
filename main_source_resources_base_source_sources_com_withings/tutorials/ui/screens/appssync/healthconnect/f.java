package com.withings.tutorials.ui.screens.appssync.healthconnect;
/* compiled from: HealthConnectActivationActivity.kt */
/* loaded from: classes4.dex */
final /* synthetic */ class f extends kotlin.jvm.internal.s implements ym0.a<nm0.y> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public f(HealthConnectActivationActivity healthConnectActivationActivity) {
        super(0, healthConnectActivationActivity, HealthConnectActivationActivity.class, "finishWithCancelResult", "finishWithCancelResult()V", 0);
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        HealthConnectActivationActivity healthConnectActivationActivity = (HealthConnectActivationActivity) this.receiver;
        fn0.k<Object>[] kVarArr = HealthConnectActivationActivity.f44872i;
        healthConnectActivationActivity.setResult(0);
        healthConnectActivationActivity.finish();
        return nm0.y.f85009a;
    }
}
