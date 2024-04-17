package com.withings.authentication.verifyauthentication;

import android.content.Context;
import androidx.compose.foundation.layout.e1;
import androidx.compose.ui.platform.u0;
/* compiled from: VerifyAuthenticationActivity.kt */
/* loaded from: classes3.dex */
final class b0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ VerifyAuthenticationActivity f32667a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(VerifyAuthenticationActivity verifyAuthenticationActivity) {
        super(2);
        this.f32667a = verifyAuthenticationActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            r8.n c11 = androidx.navigation.compose.r.c(new androidx.navigation.c0[0], aVar2);
            xb.b v11 = androidx.activity.b0.v(aVar2);
            c11.D().b(v11);
            VerifyAuthenticationActivity verifyAuthenticationActivity = this.f32667a;
            VerifyAuthenticationActivity.K3(verifyAuthenticationActivity, c11, aVar2, 72);
            xb.a.a(v11, e1.d(androidx.compose.ui.e.f8927a), wk.h.d(), 0.0f, 0L, 0L, 0L, s1.b.b(aVar2, 1761195334, new a0(verifyAuthenticationActivity, c11, (Context) aVar2.D(u0.d()))), aVar2, 12582968, 120);
        }
        return nm0.y.f85009a;
    }
}
