package com.withings.authentication;

import androidx.compose.runtime.a;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: AuthenticationActivity.kt */
/* loaded from: classes3.dex */
final class l0 extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f31544a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AuthenticationActivity f31545b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ androidx.compose.material.m0 f31546c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f31547d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(androidx.compose.material.m0 m0Var, k1.r0 r0Var, AuthenticationActivity authenticationActivity, CoroutineScope coroutineScope) {
        super(3);
        this.f31544a = r0Var;
        this.f31545b = authenticationActivity;
        this.f31546c = m0Var;
        this.f31547d = coroutineScope;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
        r8.n nVar;
        r8.n nVar2;
        r0.h BottomSheetScaffold = hVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(BottomSheetScaffold, "$this$BottomSheetScaffold");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            k1.r0<Boolean> r0Var = this.f31544a;
            boolean booleanValue = r0Var.getValue().booleanValue();
            CoroutineScope coroutineScope = this.f31547d;
            AuthenticationActivity authenticationActivity = this.f31545b;
            if (booleanValue) {
                aVar2.s(-2033282483);
                nVar2 = authenticationActivity.f31306s;
                if (nVar2 != null) {
                    androidx.compose.material.m0 m0Var = this.f31546c;
                    AuthenticationActivity authenticationActivity2 = this.f31545b;
                    d0 d0Var = new d0(m0Var, r0Var, authenticationActivity2, coroutineScope);
                    androidx.compose.material.m0 m0Var2 = this.f31546c;
                    AuthenticationActivity.D3(authenticationActivity2, m0Var, d0Var, new f0(m0Var2, r0Var, authenticationActivity, coroutineScope), nVar2, this.f31547d, aVar2, 299008);
                    aVar2.s(-2033280835);
                    boolean K = aVar2.K(m0Var2);
                    Object t11 = aVar2.t();
                    if (K || t11 == a.C0060a.a()) {
                        t11 = new g0(m0Var2, null);
                        aVar2.n(t11);
                    }
                    aVar2.J();
                    k1.y.f("openSheet", (ym0.p) t11, aVar2);
                    aVar2.J();
                } else {
                    kotlin.jvm.internal.u.s("navController");
                    throw null;
                }
            } else {
                aVar2.s(-2033280643);
                nVar = authenticationActivity.f31306s;
                if (nVar != null) {
                    androidx.compose.material.m0 m0Var3 = this.f31546c;
                    AuthenticationActivity authenticationActivity3 = this.f31545b;
                    j0 j0Var = new j0(m0Var3, r0Var, authenticationActivity3, coroutineScope);
                    aVar2.s(-2033279663);
                    Object t12 = aVar2.t();
                    if (t12 == a.C0060a.a()) {
                        t12 = new k0(r0Var);
                        aVar2.n(t12);
                    }
                    aVar2.J();
                    AuthenticationActivity.C3(authenticationActivity3, m0Var3, j0Var, (ym0.a) t12, nVar, this.f31547d, aVar2, 299392);
                    aVar2.J();
                } else {
                    kotlin.jvm.internal.u.s("navController");
                    throw null;
                }
            }
        }
        return nm0.y.f85009a;
    }
}
