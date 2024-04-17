package com.withings.authentication;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: AuthenticationActivity.kt */
/* loaded from: classes3.dex */
final class j0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AuthenticationActivity f31534a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f31535b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ androidx.compose.material.m0 f31536c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f31537d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(androidx.compose.material.m0 m0Var, k1.r0 r0Var, AuthenticationActivity authenticationActivity, CoroutineScope coroutineScope) {
        super(0);
        this.f31534a = authenticationActivity;
        this.f31535b = coroutineScope;
        this.f31536c = m0Var;
        this.f31537d = r0Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        r8.n nVar;
        AuthenticationActivity authenticationActivity = this.f31534a;
        nVar = authenticationActivity.f31306s;
        if (nVar != null) {
            String K0 = AuthenticationActivity.P3(authenticationActivity).K0();
            if (K0 == null) {
                K0 = "";
            }
            nVar.J(androidx.fragment.app.o.d("authentication/mailCodeInput/", K0, "?"), h0.f31524a);
            BuildersKt__Builders_commonKt.launch$default(this.f31535b, null, null, new i0(this.f31536c, this.f31537d, null), 3, null);
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("navController");
        throw null;
    }
}
