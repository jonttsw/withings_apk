package com.withings.authentication;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: AuthenticationActivity.kt */
/* loaded from: classes3.dex */
final class d0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AuthenticationActivity f31453a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f31454b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ androidx.compose.material.m0 f31455c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f31456d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(androidx.compose.material.m0 m0Var, k1.r0 r0Var, AuthenticationActivity authenticationActivity, CoroutineScope coroutineScope) {
        super(0);
        this.f31453a = authenticationActivity;
        this.f31454b = coroutineScope;
        this.f31455c = m0Var;
        this.f31456d = r0Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        r8.n nVar;
        AuthenticationActivity authenticationActivity = this.f31453a;
        nVar = authenticationActivity.f31306s;
        if (nVar != null) {
            String K0 = AuthenticationActivity.P3(authenticationActivity).K0();
            if (K0 == null) {
                K0 = "";
            }
            nVar.J(androidx.fragment.app.o.d("authentication/mailCodeInput/", K0, "?"), b0.f31447a);
            BuildersKt__Builders_commonKt.launch$default(this.f31454b, null, null, new c0(this.f31455c, this.f31456d, null), 3, null);
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("navController");
        throw null;
    }
}
