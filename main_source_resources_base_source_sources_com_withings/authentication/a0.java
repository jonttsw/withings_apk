package com.withings.authentication;

import com.withings.authentication.tryToLogin.mail.TryToLoginViewModel;
/* compiled from: AuthenticationActivity.kt */
/* loaded from: classes3.dex */
final class a0 extends kotlin.jvm.internal.w implements ym0.l<TryToLoginViewModel.a, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AuthenticationActivity f31341a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(AuthenticationActivity authenticationActivity) {
        super(1);
        this.f31341a = authenticationActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(TryToLoginViewModel.a aVar) {
        r8.n nVar;
        TryToLoginViewModel.a it = aVar;
        kotlin.jvm.internal.u.j(it, "it");
        if (it instanceof TryToLoginViewModel.a.b) {
            nVar = this.f31341a.f31306s;
            if (nVar != null) {
                TryToLoginViewModel.a.b bVar = (TryToLoginViewModel.a.b) it;
                androidx.navigation.e.L(nVar, null, null, 6);
            } else {
                kotlin.jvm.internal.u.s("navController");
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}
