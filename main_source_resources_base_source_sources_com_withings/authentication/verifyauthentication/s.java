package com.withings.authentication.verifyauthentication;

import com.withings.authentication.tryToLogin.mail.TryToLoginViewModel;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VerifyAuthenticationActivity.kt */
/* loaded from: classes3.dex */
public final class s extends kotlin.jvm.internal.w implements ym0.l<TryToLoginViewModel.a, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ VerifyAuthenticationActivity f32697a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(VerifyAuthenticationActivity verifyAuthenticationActivity) {
        super(1);
        this.f32697a = verifyAuthenticationActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(TryToLoginViewModel.a aVar) {
        TryToLoginViewModel.a it = aVar;
        kotlin.jvm.internal.u.j(it, "it");
        boolean z5 = it instanceof TryToLoginViewModel.a.C0435a;
        VerifyAuthenticationActivity verifyAuthenticationActivity = this.f32697a;
        if (z5) {
            VerifyAuthenticationActivity.A3(verifyAuthenticationActivity, ((TryToLoginViewModel.a.C0435a) it).a());
        } else if (it instanceof TryToLoginViewModel.a.b) {
            VerifyAuthenticationActivity.A3(verifyAuthenticationActivity, false);
        }
        return nm0.y.f85009a;
    }
}
