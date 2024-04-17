package com.withings.authentication;
/* compiled from: AuthenticationActivity.kt */
/* loaded from: classes3.dex */
final class z extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AuthenticationActivity f32713a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(AuthenticationActivity authenticationActivity) {
        super(0);
        this.f32713a = authenticationActivity;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        r8.n nVar;
        nVar = this.f32713a.f31306s;
        if (nVar != null) {
            androidx.navigation.e.P(nVar, "onboarding", false);
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("navController");
        throw null;
    }
}
