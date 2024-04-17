package com.withings.cycletracking.ui;

import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.cycletracking.ui.f2;
import java.util.List;
/* compiled from: CycleTrackingActivity.kt */
/* loaded from: classes3.dex */
final class n0 extends kotlin.jvm.internal.w implements ym0.l<r8.m, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CycleTrackingActivity f35707a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f35708b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r8.n f35709c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(r8.n nVar, CycleTrackingActivity cycleTrackingActivity, ym0.a aVar) {
        super(1);
        this.f35707a = cycleTrackingActivity;
        this.f35708b = aVar;
        this.f35709c = nVar;
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [ym0.a, kotlin.jvm.internal.a] */
    @Override // ym0.l
    public final nm0.y invoke(r8.m mVar) {
        r8.m NavHost = mVar;
        kotlin.jvm.internal.u.j(NavHost, "$this$NavHost");
        CycleTrackingActivity cycleTrackingActivity = this.f35707a;
        e0 e0Var = new e0(cycleTrackingActivity);
        r8.n nVar = this.f35709c;
        f0 f0Var = new f0(nVar);
        g0 g0Var = new g0(cycleTrackingActivity);
        h0 h0Var = new h0(nVar, cycleTrackingActivity);
        i0 i0Var = new i0(nVar);
        j0 j0Var = new j0(nVar, cycleTrackingActivity);
        k0 k0Var = new k0(nVar, cycleTrackingActivity);
        l0 l0Var = new l0(nVar, cycleTrackingActivity);
        fn0.k<Object>[] kVarArr = CycleTrackingActivity.f35469l;
        cycleTrackingActivity.getClass();
        androidx.navigation.compose.n.b(NavHost, "Dataviz", kotlin.collections.x.W(androidx.camera.camera2.internal.v1.d0(HealthUserProfile.USER_PROFILE_KEY_USER_ID, new h(cycleTrackingActivity)), androidx.camera.camera2.internal.v1.d0("period", new i(cycleTrackingActivity))), null, null, null, null, null, new s1.a(true, -2120529029, new p(cycleTrackingActivity, e0Var, l0Var, k0Var, j0Var, f0Var, g0Var, h0Var, i0Var)), 124);
        List V = kotlin.collections.x.V(androidx.camera.camera2.internal.v1.d0(HealthUserProfile.USER_PROFILE_KEY_USER_ID, new f(cycleTrackingActivity)));
        ym0.a<nm0.y> aVar = this.f35708b;
        androidx.navigation.compose.n.b(NavHost, "History", V, null, null, null, null, null, new s1.a(true, -405391066, new g(aVar)), 124);
        m0 m0Var = new m0(cycleTrackingActivity);
        z zVar = new z(aVar, cycleTrackingActivity);
        a0 a0Var = new a0(nVar, cycleTrackingActivity);
        b0 b0Var = new b0(cycleTrackingActivity);
        c0 c0Var = new c0(cycleTrackingActivity);
        List V2 = kotlin.collections.x.V(androidx.camera.camera2.internal.v1.d0(HealthUserProfile.USER_PROFILE_KEY_USER_ID, new t(cycleTrackingActivity)));
        ym0.a<nm0.y> aVar2 = this.f35708b;
        androidx.navigation.compose.n.b(NavHost, "Factors", V2, null, null, null, null, null, new s1.a(true, -658994766, new r(aVar2, m0Var, zVar, a0Var, cycleTrackingActivity)), 124);
        xb.i.a(NavHost, f2.a.f35555b.a(), kotlin.collections.x.m0(androidx.camera.camera2.internal.v1.d0("FactorId", u.f35753a), V2), new s1.a(true, -989808299, new s(cycleTrackingActivity, aVar2, b0Var, c0Var)), 4);
        CycleTrackingActivity cycleTrackingActivity2 = this.f35707a;
        ?? aVar3 = new kotlin.jvm.internal.a(0, cycleTrackingActivity2, CycleTrackingActivity.class, "openCycleTrackingInitialisation", "openCycleTrackingInitialisation(Ljava/lang/String;ZZ)V", 0);
        cycleTrackingActivity2.getClass();
        androidx.navigation.compose.n.b(NavHost, "VerticalCalendarPeriodLog", kotlin.collections.x.V(androidx.camera.camera2.internal.v1.d0(HealthUserProfile.USER_PROFILE_KEY_USER_ID, new u0(cycleTrackingActivity2))), null, null, null, null, null, new s1.a(true, 1071820255, new v0(aVar3, aVar)), 124);
        return nm0.y.f85009a;
    }
}
