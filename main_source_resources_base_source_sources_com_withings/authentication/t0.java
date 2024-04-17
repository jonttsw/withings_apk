package com.withings.authentication;

import androidx.activity.result.ActivityResult;
/* compiled from: AuthenticationActivity.kt */
/* loaded from: classes3.dex */
final class t0 extends kotlin.jvm.internal.w implements ym0.l<ActivityResult, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AuthenticationActivity f32345a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(AuthenticationActivity authenticationActivity) {
        super(1);
        this.f32345a = authenticationActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(ActivityResult activityResult) {
        ActivityResult it = activityResult;
        kotlin.jvm.internal.u.j(it, "it");
        AuthenticationActivity.T3(this.f32345a);
        return nm0.y.f85009a;
    }
}
