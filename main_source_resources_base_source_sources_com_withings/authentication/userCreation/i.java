package com.withings.authentication.userCreation;

import com.withings.authentication.accountConsent.AccountConsentViewModel;
import com.withings.user.User;
import nm0.y;
/* compiled from: UserInfoNavigation.kt */
/* loaded from: classes3.dex */
final class i extends kotlin.jvm.internal.w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ m70.k f32571a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ UserCreationViewModel f32572b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ User f32573c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ AccountConsentViewModel f32574d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(AccountConsentViewModel accountConsentViewModel, UserCreationViewModel userCreationViewModel, User user, m70.k kVar) {
        super(0);
        this.f32571a = kVar;
        this.f32572b = userCreationViewModel;
        this.f32573c = user;
        this.f32574d = accountConsentViewModel;
    }

    @Override // ym0.a
    public final y invoke() {
        h.d(this.f32574d, this.f32572b, this.f32573c, this.f32571a);
        return y.f85009a;
    }
}
