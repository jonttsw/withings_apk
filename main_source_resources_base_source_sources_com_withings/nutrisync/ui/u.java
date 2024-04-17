package com.withings.nutrisync.ui;

import androidx.camera.camera2.internal.v1;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
/* compiled from: VitaminCDatavizActivity.kt */
/* loaded from: classes4.dex */
final class u extends kotlin.jvm.internal.w implements ym0.l<r8.m, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ VitaminCDatavizActivity f43283a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f43284b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(r8.n nVar, VitaminCDatavizActivity vitaminCDatavizActivity) {
        super(1);
        this.f43283a = vitaminCDatavizActivity;
        this.f43284b = nVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(r8.m mVar) {
        r8.m NavHost = mVar;
        kotlin.jvm.internal.u.j(NavHost, "$this$NavHost");
        VitaminCDatavizActivity vitaminCDatavizActivity = this.f43283a;
        p pVar = new p(vitaminCDatavizActivity);
        r8.n nVar = this.f43284b;
        q qVar = new q(nVar);
        int i11 = VitaminCDatavizActivity.f43204j;
        vitaminCDatavizActivity.getClass();
        androidx.navigation.compose.n.b(NavHost, "Dataviz", kotlin.collections.x.W(v1.d0(HealthUserProfile.USER_PROFILE_KEY_USER_ID, new d(vitaminCDatavizActivity)), v1.d0("period", new e(vitaminCDatavizActivity))), null, null, null, null, null, new s1.a(true, -2032351701, new i(vitaminCDatavizActivity, pVar, qVar)), 124);
        androidx.navigation.compose.n.b(NavHost, "List", kotlin.collections.x.V(v1.d0(HealthUserProfile.USER_PROFILE_KEY_USER_ID, new j(vitaminCDatavizActivity))), null, null, null, null, null, new s1.a(true, -620472166, new k(new r(nVar), t.f43282a, s.f43281a)), 124);
        return nm0.y.f85009a;
    }
}
