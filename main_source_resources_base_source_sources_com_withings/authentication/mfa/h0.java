package com.withings.authentication.mfa;

import com.withings.library.authentication.api.ConstantsWs;
/* compiled from: SettingsMfaNavigation.kt */
/* loaded from: classes3.dex */
public final class h0 {
    public static final void a(r8.m mVar, r8.n navController) {
        kotlin.jvm.internal.u.j(mVar, "<this>");
        kotlin.jvm.internal.u.j(navController, "navController");
        r8.m mVar2 = new r8.m(mVar.f(), "main", "multi-factor");
        tk.e.b(mVar2, "main", null, new s1.a(true, -1332951041, new y(navController)), 6);
        androidx.navigation.compose.n.b(mVar2, ConstantsWs.AUTHENTICATION_TYPE_TOTP, null, null, null, null, null, null, new s1.a(true, 1316737737, new b0(navController)), 126);
        androidx.navigation.compose.n.b(mVar2, "phone", null, null, null, null, null, null, new s1.a(true, -493579968, new e0(navController)), 126);
        tk.e.b(mVar2, "recovery_code", null, new s1.a(true, 71110902, new g0(navController)), 6);
        mVar.e(mVar2);
    }
}
