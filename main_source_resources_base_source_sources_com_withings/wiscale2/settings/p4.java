package com.withings.wiscale2.settings;

import com.withings.wiscale2.settings.SettingsActivity;
/* compiled from: SettingsActivity.kt */
/* loaded from: classes5.dex */
final class p4 extends kotlin.jvm.internal.w implements ym0.l<r8.m, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SettingsActivity f60246a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f60247b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f60248c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ com.withings.common.compose.component.z4 f60249d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ k1.o1<Boolean> f60250e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ nm0.g<SettingsViewModel> f60251f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ k1.r0<String> f60252g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(k1.r0 r0Var, k1.r0 r0Var2, k1.o1 o1Var, r8.n nVar, com.withings.common.compose.component.z4 z4Var, SettingsActivity settingsActivity, nm0.g gVar) {
        super(1);
        this.f60246a = settingsActivity;
        this.f60247b = nVar;
        this.f60248c = r0Var;
        this.f60249d = z4Var;
        this.f60250e = o1Var;
        this.f60251f = gVar;
        this.f60252g = r0Var2;
    }

    @Override // ym0.l
    public final nm0.y invoke(r8.m mVar) {
        r8.m NavHost = mVar;
        kotlin.jvm.internal.u.j(NavHost, "$this$NavHost");
        androidx.navigation.compose.n.b(NavHost, "home", null, null, null, null, null, null, new s1.a(true, 820898104, new i4(this.f60246a, this.f60248c, this.f60249d, this.f60250e, this.f60247b, this.f60251f)), 126);
        k1.r0<String> r0Var = this.f60252g;
        SettingsActivity settingsActivity = this.f60246a;
        r8.n nVar = this.f60247b;
        j4 j4Var = new j4(settingsActivity, nVar, r0Var);
        SettingsActivity.b bVar = SettingsActivity.f59742k;
        settingsActivity.getClass();
        androidx.navigation.compose.n.b(NavHost, "privacy", null, null, null, null, null, null, new s1.a(true, -1124611525, new y4(j4Var, settingsActivity, nVar)), 126);
        androidx.navigation.compose.n.b(NavHost, "withingsAdvertising", null, null, null, null, null, null, new s1.a(true, -1668956750, new a5(j4Var, settingsActivity)), 126);
        k4 k4Var = new k4(nVar);
        l4 l4Var = new l4(nVar);
        m4 m4Var = new m4(nVar);
        n4 n4Var = new n4(nVar);
        nm0.g<SettingsViewModel> gVar = this.f60251f;
        androidx.navigation.compose.n.b(NavHost, "account-security", null, null, null, v2.f60350a, w2.f60364a, x2.f60380a, new s1.a(true, -1682002013, new z2(k4Var, l4Var, m4Var, n4Var, gVar.getValue(), settingsActivity)), 14);
        com.withings.authentication.mfa.h0.a(NavHost, nVar);
        androidx.navigation.compose.n.b(NavHost, "change-password", null, null, null, null, null, null, new s1.a(true, -844919520, new f3(gVar.getValue(), new o4(nVar), settingsActivity)), 126);
        r8.m mVar2 = new r8.m(NavHost.f(), "create-password/bottom-sheet", "create-password");
        xb.i.a(mVar2, "create-password/bottom-sheet", null, new s1.a(true, -1100115763, new j3(nVar)), 6);
        androidx.navigation.compose.n.b(mVar2, "create-password/create-password", null, null, null, null, null, null, new s1.a(true, 1601047914, new q3(gVar.getValue(), nVar, settingsActivity)), 126);
        NavHost.e(mVar2);
        androidx.navigation.compose.n.b(NavHost, "notification-summary", null, null, null, null, null, null, new s1.a(true, 864152422, new u3(nVar, settingsActivity)), 126);
        androidx.navigation.compose.n.b(NavHost, "notification-preferences/{notificationType}", kotlin.collections.x.V(androidx.camera.camera2.internal.v1.d0("notificationType", v3.f60351a)), null, null, null, null, null, new s1.a(true, 1345996253, new y3(nVar, settingsActivity)), 124);
        return nm0.y.f85009a;
    }
}
