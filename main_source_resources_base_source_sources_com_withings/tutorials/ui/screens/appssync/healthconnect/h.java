package com.withings.tutorials.ui.screens.appssync.healthconnect;
/* compiled from: HealthConnectActivationActivity.kt */
/* loaded from: classes4.dex */
final class h extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HealthConnectActivationActivity f44960a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f44961b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(HealthConnectActivationActivity healthConnectActivationActivity, r8.n nVar) {
        super(0);
        this.f44960a = healthConnectActivationActivity;
        this.f44961b = nVar;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        fn0.k<Object>[] kVarArr = HealthConnectActivationActivity.f44872i;
        HealthConnectActivationActivity healthConnectActivationActivity = this.f44960a;
        healthConnectActivationActivity.getClass();
        if (!this.f44961b.N()) {
            healthConnectActivationActivity.finish();
        }
        return nm0.y.f85009a;
    }
}
