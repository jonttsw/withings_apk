package com.withings.authentication;

import android.widget.Toast;
import com.withings.wiscale2.C1987R;
/* compiled from: AuthenticationActivity.kt */
/* loaded from: classes3.dex */
final class x extends kotlin.jvm.internal.w implements ym0.l<rh.l, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AuthenticationActivity f32710a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(AuthenticationActivity authenticationActivity) {
        super(1);
        this.f32710a = authenticationActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(rh.l lVar) {
        androidx.appcompat.app.c cVar;
        androidx.appcompat.app.c cVar2;
        androidx.appcompat.app.c cVar3;
        androidx.appcompat.app.c cVar4;
        r8.n nVar;
        rh.l lVar2 = lVar;
        boolean z5 = lVar2 instanceof rh.d;
        AuthenticationActivity authenticationActivity = this.f32710a;
        if (z5) {
            cVar4 = authenticationActivity.f31305r;
            if (cVar4 != null) {
                cVar4.dismiss();
            }
            rh.d dVar = (rh.d) lVar2;
            AuthenticationActivity.Q3(authenticationActivity).O0(dVar.b());
            AuthenticationActivity.Q3(authenticationActivity).R0(dVar.a());
            AuthenticationActivity.Q3(authenticationActivity).M0(dVar.c());
            nVar = authenticationActivity.f31306s;
            if (nVar != null) {
                androidx.navigation.e.L(nVar, "dataProtection", null, 6);
            } else {
                kotlin.jvm.internal.u.s("navController");
                throw null;
            }
        } else if (lVar2 instanceof rh.k) {
            cVar3 = authenticationActivity.f31305r;
            if (cVar3 == null || !cVar3.isShowing()) {
                authenticationActivity.f31305r = AuthenticationActivity.O3(authenticationActivity).s();
            }
        } else if (lVar2 instanceof rh.m) {
            cVar2 = authenticationActivity.f31305r;
            if (cVar2 != null) {
                cVar2.dismiss();
            }
            AuthenticationActivity.H3(authenticationActivity).F0(((rh.m) lVar2).a());
        } else if (lVar2 instanceof rh.j) {
            cVar = authenticationActivity.f31305r;
            if (cVar != null) {
                cVar.dismiss();
            }
            Toast.makeText(authenticationActivity, (int) C1987R.string._ERROR_CONNECTION_TIMEOUT_, 1).show();
        }
        return nm0.y.f85009a;
    }
}
