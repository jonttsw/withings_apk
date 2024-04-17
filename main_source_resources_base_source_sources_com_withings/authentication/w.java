package com.withings.authentication;

import android.widget.Toast;
import com.withings.wiscale2.C1987R;
/* compiled from: AuthenticationActivity.kt */
/* loaded from: classes3.dex */
final class w extends kotlin.jvm.internal.w implements ym0.l<rh.b, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AuthenticationActivity f32708a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(AuthenticationActivity authenticationActivity) {
        super(1);
        this.f32708a = authenticationActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(rh.b bVar) {
        androidx.appcompat.app.c cVar;
        androidx.appcompat.app.c cVar2;
        r8.n nVar;
        rh.b bVar2 = bVar;
        boolean z5 = bVar2 instanceof rh.c;
        AuthenticationActivity authenticationActivity = this.f32708a;
        if (z5) {
            cVar2 = authenticationActivity.f31305r;
            if (cVar2 != null) {
                cVar2.dismiss();
            }
            AuthenticationActivity.P3(authenticationActivity).e1(((rh.c) bVar2).a());
            nVar = authenticationActivity.f31306s;
            if (nVar != null) {
                androidx.navigation.e.L(nVar, "dataProtection", null, 6);
            } else {
                kotlin.jvm.internal.u.s("navController");
                throw null;
            }
        } else if (bVar2 instanceof rh.a) {
            cVar = authenticationActivity.f31305r;
            if (cVar != null) {
                cVar.dismiss();
            }
            Toast.makeText(authenticationActivity, (int) C1987R.string._ERROR_CONNECTION_TIMEOUT_, 1).show();
        }
        return nm0.y.f85009a;
    }
}
