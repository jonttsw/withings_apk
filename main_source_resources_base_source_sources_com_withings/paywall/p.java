package com.withings.paywall;

import androidx.camera.camera2.internal.v1;
/* compiled from: PaywallActivity.kt */
/* loaded from: classes4.dex */
final class p extends kotlin.jvm.internal.w implements ym0.l<r8.m, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ PaywallActivity f43622a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f43623b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(PaywallActivity paywallActivity, r8.n nVar) {
        super(1);
        this.f43622a = paywallActivity;
        this.f43623b = nVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(r8.m mVar) {
        r8.m NavHost = mVar;
        kotlin.jvm.internal.u.j(NavHost, "$this$NavHost");
        PaywallActivity paywallActivity = this.f43622a;
        r8.n nVar = this.f43623b;
        androidx.navigation.compose.n.b(NavHost, "marketing", null, null, null, null, null, null, new s1.a(true, -1304435404, new i(paywallActivity, nVar)), 126);
        androidx.navigation.compose.n.b(NavHost, "subscription_plans", null, null, null, null, null, null, new s1.a(true, 1748409707, new l(paywallActivity, nVar)), 126);
        androidx.navigation.compose.n.b(NavHost, "subscription_confirmation/{is_success}", kotlin.collections.x.V(v1.d0("is_success", m.f43619a)), null, null, null, null, null, new s1.a(true, 747353836, new o(paywallActivity)), 124);
        return nm0.y.f85009a;
    }
}
