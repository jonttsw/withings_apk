package com.withings.authentication;

import com.withings.account.models.AccountPrefEntity;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AuthenticationActivity.kt */
/* loaded from: classes3.dex */
public final class h extends kotlin.jvm.internal.w implements ym0.l<String, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AuthenticationActivity f31520a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f31521b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f31522c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ androidx.compose.material.m0 f31523d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(AuthenticationActivity authenticationActivity, ym0.a<nm0.y> aVar, CoroutineScope coroutineScope, androidx.compose.material.m0 m0Var) {
        super(1);
        this.f31520a = authenticationActivity;
        this.f31521b = aVar;
        this.f31522c = coroutineScope;
        this.f31523d = m0Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(String str) {
        String email = str;
        kotlin.jvm.internal.u.j(email, "email");
        AuthenticationActivity authenticationActivity = this.f31520a;
        AuthenticationActivity.P3(authenticationActivity).g1(AccountPrefEntity.PROVIDER_WITHINGS);
        AuthenticationActivity.P3(authenticationActivity).e1(email);
        AuthenticationActivity.P3(authenticationActivity).X0().setValue(Boolean.FALSE);
        BuildersKt__Builders_commonKt.launch$default(this.f31522c, null, null, new g(this.f31523d, null), 3, null);
        AuthenticationActivity.P3(authenticationActivity).d1(email);
        return nm0.y.f85009a;
    }
}
