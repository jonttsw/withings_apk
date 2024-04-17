package com.withings.authentication.verifyauthentication;

import android.content.Context;
import com.withings.account.core.model.Account;
import com.withings.authentication.tryToLogin.google.GoogleAuthProviderViewModel;
import com.withings.features.FeatureFlag;
import sf.c;
/* compiled from: VerifyAuthenticationActivity.kt */
/* loaded from: classes3.dex */
final class a0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ VerifyAuthenticationActivity f32663a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f32664b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Context f32665c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(VerifyAuthenticationActivity verifyAuthenticationActivity, r8.n nVar, Context context) {
        super(2);
        this.f32663a = verifyAuthenticationActivity;
        this.f32664b = nVar;
        this.f32665c = context;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        sf.c cVar;
        androidx.activity.result.b bVar;
        Account.b i11;
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            boolean c11 = wr.b.c(FeatureFlag.f39120n0);
            VerifyAuthenticationActivity verifyAuthenticationActivity = this.f32663a;
            if (c11) {
                aVar2.s(-1925496618);
                ng.a.a(null, "loading", new u(verifyAuthenticationActivity), new v(verifyAuthenticationActivity), new w(verifyAuthenticationActivity), new x(verifyAuthenticationActivity), aVar2, 48, 1);
                aVar2.J();
            } else {
                aVar2.s(-1925495873);
                Account i12 = VerifyAuthenticationActivity.B3(verifyAuthenticationActivity).i();
                if (i12 != null && (i11 = i12.i()) != null) {
                    cVar = i11.d();
                } else {
                    cVar = null;
                }
                if (cVar instanceof c.b.a) {
                    GoogleAuthProviderViewModel C3 = VerifyAuthenticationActivity.C3(verifyAuthenticationActivity);
                    bVar = verifyAuthenticationActivity.f32643n;
                    C3.T0(bVar);
                } else {
                    oh.a.b(VerifyAuthenticationActivity.J3(verifyAuthenticationActivity), VerifyAuthenticationActivity.H3(verifyAuthenticationActivity), VerifyAuthenticationActivity.D3(verifyAuthenticationActivity), VerifyAuthenticationActivity.I3(verifyAuthenticationActivity), this.f32664b, new y(verifyAuthenticationActivity, this.f32665c), "authentication", new z(verifyAuthenticationActivity), aVar2, 1610312, 0);
                }
                aVar2.J();
            }
        }
        return nm0.y.f85009a;
    }
}
