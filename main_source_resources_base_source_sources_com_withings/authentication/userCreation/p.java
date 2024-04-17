package com.withings.authentication.userCreation;

import androidx.compose.ui.platform.k4;
import com.withings.authentication.accountConsent.AccountConsentViewModel;
import com.withings.user.User;
import nm0.y;
/* compiled from: UserInfoNavigation.kt */
/* loaded from: classes3.dex */
final class p extends kotlin.jvm.internal.w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k4 f32595a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ b2.f f32596b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ m70.k f32597c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ UserCreationViewModel f32598d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ User f32599e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ AccountConsentViewModel f32600f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(k4 k4Var, b2.f fVar, m70.k kVar, UserCreationViewModel userCreationViewModel, User user, AccountConsentViewModel accountConsentViewModel) {
        super(0);
        this.f32595a = k4Var;
        this.f32596b = fVar;
        this.f32597c = kVar;
        this.f32598d = userCreationViewModel;
        this.f32599e = user;
        this.f32600f = accountConsentViewModel;
    }

    @Override // ym0.a
    public final y invoke() {
        k4 k4Var = this.f32595a;
        if (k4Var != null) {
            k4Var.a();
        }
        this.f32596b.n(false);
        m70.k kVar = this.f32597c;
        if (kVar.g()) {
            h.d(this.f32600f, this.f32598d, this.f32599e, kVar);
        }
        return y.f85009a;
    }
}
