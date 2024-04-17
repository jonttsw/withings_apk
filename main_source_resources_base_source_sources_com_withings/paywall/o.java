package com.withings.paywall;

import androidx.compose.material3.j5;
import androidx.compose.runtime.a;
/* compiled from: PaywallActivity.kt */
/* loaded from: classes4.dex */
final class o extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ PaywallActivity f43621a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(PaywallActivity paywallActivity) {
        super(4);
        this.f43621a = paywallActivity;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        j5.e(num, cVar, "$this$composable", dVar, "it");
        aVar2.s(-954627578);
        PaywallActivity paywallActivity = this.f43621a;
        boolean K = aVar2.K(paywallActivity);
        Object t11 = aVar2.t();
        if (K || t11 == a.C0060a.a()) {
            t11 = new n(paywallActivity);
            aVar2.n(t11);
        }
        aVar2.J();
        d20.b.a(null, (ym0.a) t11, aVar2, 0, 1);
        return nm0.y.f85009a;
    }
}
