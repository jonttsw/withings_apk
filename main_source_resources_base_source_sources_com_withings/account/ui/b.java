package com.withings.account.ui;

import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import r8.n;
import ym0.p;
/* compiled from: VerifyAuthenticationSensitiveActivity.kt */
/* loaded from: classes3.dex */
final class b extends w implements p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ VerifyAuthenticationSensitiveActivity f31018a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(VerifyAuthenticationSensitiveActivity verifyAuthenticationSensitiveActivity, n nVar) {
        super(2);
        this.f31018a = verifyAuthenticationSensitiveActivity;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
            return y.f85009a;
        }
        VerifyAuthenticationSensitiveActivity verifyAuthenticationSensitiveActivity = this.f31018a;
        VerifyAuthenticationSensitiveActivity.z3(verifyAuthenticationSensitiveActivity);
        VerifyAuthenticationSensitiveActivity.A3(verifyAuthenticationSensitiveActivity);
        u.s("googleAuthIdProvider");
        throw null;
    }
}
