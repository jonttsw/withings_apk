package com.withings.tutorials.ui.screens.appssync.healthconnect;
/* compiled from: HealthConnectActivationActivity.kt */
/* loaded from: classes4.dex */
final class i extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HealthConnectActivationActivity f44970a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f44971b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(HealthConnectActivationActivity healthConnectActivationActivity, r8.n nVar) {
        super(2);
        this.f44970a = healthConnectActivationActivity;
        this.f44971b = nVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            HealthConnectActivationActivity healthConnectActivationActivity = this.f44970a;
            r8.n nVar = this.f44971b;
            e.j.a(0, 1, aVar2, new d(healthConnectActivationActivity, nVar), false);
            boolean z32 = HealthConnectActivationActivity.z3(healthConnectActivationActivity);
            q60.a aVar3 = healthConnectActivationActivity.f44873e;
            if (aVar3 != null) {
                ch.d dVar = healthConnectActivationActivity.f44874f;
                if (dVar != null) {
                    e eVar = new e(healthConnectActivationActivity);
                    f fVar = new f(healthConnectActivationActivity);
                    d0.b(this.f44971b, z32, aVar3, dVar, new g(healthConnectActivationActivity), new h(healthConnectActivationActivity, nVar), eVar, fVar, aVar2, 4104, 0);
                } else {
                    kotlin.jvm.internal.u.s("intentBuilder");
                    throw null;
                }
            } else {
                kotlin.jvm.internal.u.s("openHealthConnectPermissionsUseCase");
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}
