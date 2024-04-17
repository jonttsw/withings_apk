package com.withings.tutorials.ui.screens.appssync.healthconnect;

import com.withings.wiscale2.C1987R;
/* compiled from: HealthConnectActivationActivity.kt */
/* loaded from: classes4.dex */
final class g extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HealthConnectActivationActivity f44956a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(HealthConnectActivationActivity healthConnectActivationActivity) {
        super(0);
        this.f44956a = healthConnectActivationActivity;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        HealthConnectActivationActivity healthConnectActivationActivity = this.f44956a;
        if (!HealthConnectActivationActivity.A3(healthConnectActivationActivity)) {
            String string = healthConnectActivationActivity.getString(C1987R.string.partnerPackage_googleHealthPlatform);
            kotlin.jvm.internal.u.i(string, "getString(...)");
            healthConnectActivationActivity.startActivity(u70.e.b(string, "healthconnect://onboarding"));
        }
        return nm0.y.f85009a;
    }
}
