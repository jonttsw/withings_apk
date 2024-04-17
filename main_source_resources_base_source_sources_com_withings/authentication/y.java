package com.withings.authentication;

import th.e;
/* compiled from: AuthenticationActivity.kt */
/* loaded from: classes3.dex */
final class y extends kotlin.jvm.internal.w implements ym0.l<e.a, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AuthenticationActivity f32711a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(AuthenticationActivity authenticationActivity) {
        super(1);
        this.f32711a = authenticationActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(e.a aVar) {
        androidx.appcompat.app.c cVar;
        r8.n nVar;
        androidx.appcompat.app.c cVar2;
        r8.n nVar2;
        androidx.appcompat.app.c cVar3;
        r8.n nVar3;
        r8.n nVar4;
        e.a aVar2 = aVar;
        boolean z5 = aVar2 instanceof e.a.c;
        AuthenticationActivity authenticationActivity = this.f32711a;
        if (z5) {
            e.a.c cVar4 = (e.a.c) aVar2;
            AuthenticationActivity.M3(authenticationActivity).q0(cVar4.a());
            cVar3 = authenticationActivity.f31305r;
            if (cVar3 != null) {
                cVar3.dismiss();
            }
            if (!cVar4.a().j() || !cVar4.a().h()) {
                nVar3 = authenticationActivity.f31306s;
                if (nVar3 != null) {
                    androidx.navigation.e.L(nVar3, "dataProtectionPartner", null, 6);
                } else {
                    kotlin.jvm.internal.u.s("navController");
                    throw null;
                }
            } else {
                nVar4 = authenticationActivity.f31306s;
                if (nVar4 != null) {
                    androidx.navigation.e.L(nVar4, "loginProgress/false", null, 6);
                } else {
                    kotlin.jvm.internal.u.s("navController");
                    throw null;
                }
            }
        } else if (kotlin.jvm.internal.u.e(aVar2, e.a.C1659e.f99828a)) {
            cVar2 = authenticationActivity.f31305r;
            if (cVar2 != null) {
                cVar2.dismiss();
            }
            nVar2 = authenticationActivity.f31306s;
            if (nVar2 != null) {
                androidx.navigation.e.L(nVar2, "newTwoFactor/login/withMFa", null, 6);
            } else {
                kotlin.jvm.internal.u.s("navController");
                throw null;
            }
        } else if (aVar2 instanceof e.a.d) {
            cVar = authenticationActivity.f31305r;
            if (cVar != null) {
                cVar.dismiss();
            }
            nVar = authenticationActivity.f31306s;
            if (nVar != null) {
                androidx.navigation.e.L(nVar, "accountSelection", null, 6);
            } else {
                kotlin.jvm.internal.u.s("navController");
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}
