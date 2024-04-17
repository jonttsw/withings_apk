package com.withings.account.ui;

import androidx.activity.b0;
import androidx.compose.foundation.layout.e1;
import androidx.navigation.c0;
import androidx.navigation.compose.r;
import kotlin.jvm.internal.w;
import nm0.y;
import r8.n;
import wk.h;
import ym0.p;
/* compiled from: VerifyAuthenticationSensitiveActivity.kt */
/* loaded from: classes3.dex */
final class c extends w implements p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ VerifyAuthenticationSensitiveActivity f31019a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(VerifyAuthenticationSensitiveActivity verifyAuthenticationSensitiveActivity) {
        super(2);
        this.f31019a = verifyAuthenticationSensitiveActivity;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            n c11 = r.c(new c0[0], aVar2);
            xb.b v11 = b0.v(aVar2);
            c11.D().b(v11);
            xb.a.a(v11, e1.d(androidx.compose.ui.e.f8927a), h.d(), 0.0f, 0L, 0L, 0L, s1.b.b(aVar2, -1169032950, new b(this.f31019a, c11)), aVar2, 12582968, 120);
        }
        return y.f85009a;
    }
}
