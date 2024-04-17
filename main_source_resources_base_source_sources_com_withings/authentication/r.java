package com.withings.authentication;

import com.withings.authentication.tryToLogin.mail.TryToLoginViewModel;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AuthenticationActivity.kt */
/* loaded from: classes3.dex */
public final class r extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f32331a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AuthenticationActivity f32332b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ androidx.compose.material.m0 f32333c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(CoroutineScope coroutineScope, AuthenticationActivity authenticationActivity, androidx.compose.material.m0 m0Var) {
        super(0);
        this.f32331a = coroutineScope;
        this.f32332b = authenticationActivity;
        this.f32333c = m0Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        BuildersKt__Builders_commonKt.launch$default(this.f32331a, null, null, new q(this.f32333c, null), 3, null);
        AuthenticationActivity authenticationActivity = this.f32332b;
        TryToLoginViewModel P3 = AuthenticationActivity.P3(authenticationActivity);
        String K0 = AuthenticationActivity.P3(authenticationActivity).K0();
        kotlin.jvm.internal.u.g(K0);
        P3.d1(K0);
        return nm0.y.f85009a;
    }
}
