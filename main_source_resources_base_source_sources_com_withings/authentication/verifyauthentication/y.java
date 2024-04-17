package com.withings.authentication.verifyauthentication;

import android.content.Context;
/* compiled from: VerifyAuthenticationActivity.kt */
/* loaded from: classes3.dex */
final class y extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ VerifyAuthenticationActivity f32705a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f32706b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(VerifyAuthenticationActivity verifyAuthenticationActivity, Context context) {
        super(0);
        this.f32705a = verifyAuthenticationActivity;
        this.f32706b = context;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        VerifyAuthenticationActivity verifyAuthenticationActivity = this.f32705a;
        ch.d dVar = verifyAuthenticationActivity.f32634e;
        if (dVar != null) {
            dVar.p().getClass();
            verifyAuthenticationActivity.startActivity(ah.p.e(this.f32706b));
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("intentBuilder");
        throw null;
    }
}
