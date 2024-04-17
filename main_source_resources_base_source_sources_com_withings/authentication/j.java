package com.withings.authentication;

import com.withings.account.models.AccountPrefEntity;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AuthenticationActivity.kt */
/* loaded from: classes3.dex */
public final class j extends kotlin.jvm.internal.w implements ym0.l<String, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f31530a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AuthenticationActivity f31531b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ androidx.navigation.e f31532c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ androidx.compose.material.m0 f31533d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(CoroutineScope coroutineScope, AuthenticationActivity authenticationActivity, androidx.navigation.e eVar, androidx.compose.material.m0 m0Var) {
        super(1);
        this.f31530a = coroutineScope;
        this.f31531b = authenticationActivity;
        this.f31532c = eVar;
        this.f31533d = m0Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(String str) {
        String email = str;
        kotlin.jvm.internal.u.j(email, "email");
        BuildersKt__Builders_commonKt.launch$default(this.f31530a, null, null, new i(this.f31533d, null), 3, null);
        AuthenticationActivity authenticationActivity = this.f31531b;
        AuthenticationActivity.P3(authenticationActivity).g1(AccountPrefEntity.PROVIDER_WITHINGS);
        AuthenticationActivity.P3(authenticationActivity).e1(email);
        AuthenticationActivity.P3(authenticationActivity).X0().setValue(Boolean.TRUE);
        androidx.navigation.e.L(this.f31532c, "authentication/mailPassword/".concat(email), null, 6);
        return nm0.y.f85009a;
    }
}
