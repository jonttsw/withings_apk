package com.withings.tutorials.ui.screens.appssync.healthconnect;
/* compiled from: HealthConnectActivationActivity.kt */
/* loaded from: classes4.dex */
final class d extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HealthConnectActivationActivity f44914a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f44915b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(HealthConnectActivationActivity healthConnectActivationActivity, r8.n nVar) {
        super(0);
        this.f44914a = healthConnectActivationActivity;
        this.f44915b = nVar;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        fn0.k<Object>[] kVarArr = HealthConnectActivationActivity.f44872i;
        HealthConnectActivationActivity healthConnectActivationActivity = this.f44914a;
        healthConnectActivationActivity.getClass();
        if (!this.f44915b.N()) {
            healthConnectActivationActivity.finish();
        }
        return nm0.y.f85009a;
    }
}
