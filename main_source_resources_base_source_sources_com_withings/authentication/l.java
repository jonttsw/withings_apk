package com.withings.authentication;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.withings.account.models.AccountPrefEntity;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AuthenticationActivity.kt */
/* loaded from: classes3.dex */
public final class l extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f31541a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AuthenticationActivity f31542b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ androidx.compose.material.m0 f31543c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(CoroutineScope coroutineScope, AuthenticationActivity authenticationActivity, androidx.compose.material.m0 m0Var) {
        super(0);
        this.f31541a = coroutineScope;
        this.f31542b = authenticationActivity;
        this.f31543c = m0Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        BuildersKt__Builders_commonKt.launch$default(this.f31541a, null, null, new k(this.f31543c, null), 3, null);
        AuthenticationActivity authenticationActivity = this.f31542b;
        AuthenticationActivity.P3(authenticationActivity);
        int i11 = v70.a.f103433b;
        v70.a.e(FirebaseAnalytics.Event.LOGIN, FirebaseAnalytics.Event.LOGIN, kotlin.collections.s0.j(new nm0.j("flow_step_name", "continue_with_google"), new nm0.j("flow_step_order", 1)), false, 8);
        AuthenticationActivity.P3(authenticationActivity).g1(AccountPrefEntity.PROVIDER_GOOGLE);
        AuthenticationActivity.P3(authenticationActivity).X0().setValue(Boolean.FALSE);
        AuthenticationActivity.U3(authenticationActivity);
        return nm0.y.f85009a;
    }
}
