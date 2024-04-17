package com.withings.tutorials.ui.screens.appssync.healthconnect;
/* compiled from: HealthConnectActivationActivity.kt */
/* loaded from: classes4.dex */
final class j extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HealthConnectActivationActivity f44978a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(HealthConnectActivationActivity healthConnectActivationActivity) {
        super(2);
        this.f44978a = healthConnectActivationActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            r8.n c11 = androidx.navigation.compose.r.c(new androidx.navigation.c0[0], aVar2);
            int i11 = e.m.f64583b;
            HealthConnectActivationActivity healthConnectActivationActivity = this.f44978a;
            androidx.compose.runtime.j.a(e.m.b(healthConnectActivationActivity), s1.b.b(aVar2, -2064705871, new i(healthConnectActivationActivity, c11)), aVar2, 56);
        }
        return nm0.y.f85009a;
    }
}
