package com.withings.paywall;

import com.withings.library.authentication.api.ConstantsWs;
/* compiled from: PaywallActivity.kt */
/* loaded from: classes4.dex */
final class q extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ PaywallActivity f43624a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(PaywallActivity paywallActivity) {
        super(2);
        this.f43624a = paywallActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            r8.n c11 = androidx.navigation.compose.r.c(new androidx.navigation.c0[0], aVar2);
            androidx.navigation.compose.s.b(c11, "marketing", null, null, null, null, null, null, null, new p(this.f43624a, c11), aVar2, 56, ConstantsWs.WS_STATUS_WRONG_STRIPE_ENV);
        }
        return nm0.y.f85009a;
    }
}
