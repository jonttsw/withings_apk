package com.withings.authentication;

import androidx.compose.foundation.layout.e1;
import androidx.compose.runtime.a;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: AuthenticationActivity.kt */
/* loaded from: classes3.dex */
final class w0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AuthenticationActivity f32709a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(AuthenticationActivity authenticationActivity) {
        super(2);
        this.f32709a = authenticationActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        r8.n nVar;
        r8.n nVar2;
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            r8.n c11 = androidx.navigation.compose.r.c(new androidx.navigation.c0[0], aVar2);
            AuthenticationActivity authenticationActivity = this.f32709a;
            authenticationActivity.f31306s = c11;
            xb.b v11 = androidx.activity.b0.v(aVar2);
            nVar = authenticationActivity.f31306s;
            if (nVar != null) {
                nVar.D().b(v11);
                androidx.compose.material.m0 g11 = androidx.compose.material.y.g(new androidx.compose.material.q0(), aVar2, 2);
                aVar2.s(773894976);
                aVar2.s(-492369756);
                Object t11 = aVar2.t();
                if (t11 == a.C0060a.a()) {
                    t11 = androidx.camera.camera2.internal.q.b(k1.y.i(aVar2), aVar2);
                }
                aVar2.J();
                CoroutineScope a11 = ((androidx.compose.runtime.k) t11).a();
                aVar2.J();
                aVar2.s(-1783989982);
                Object t12 = aVar2.t();
                if (t12 == a.C0060a.a()) {
                    t12 = androidx.compose.runtime.l0.f(Boolean.FALSE, androidx.compose.runtime.v0.f8878a);
                    aVar2.n(t12);
                }
                aVar2.J();
                xb.a.a(v11, e1.d(androidx.compose.ui.e.f8927a), wk.h.d(), 0.0f, 0L, 0L, 0L, s1.b.b(aVar2, -1785939241, new v0(g11, (k1.r0) t12, authenticationActivity, a11)), aVar2, 12582968, 120);
                nVar2 = authenticationActivity.f31306s;
                if (nVar2 != null) {
                    AuthenticationActivity.E3(authenticationActivity, nVar2, aVar2, 72);
                } else {
                    kotlin.jvm.internal.u.s("navController");
                    throw null;
                }
            } else {
                kotlin.jvm.internal.u.s("navController");
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}
