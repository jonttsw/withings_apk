package com.withings.paywall;

import androidx.compose.material3.j5;
import androidx.compose.runtime.a;
/* compiled from: PaywallActivity.kt */
/* loaded from: classes4.dex */
final class i extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ PaywallActivity f43613a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f43614b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(PaywallActivity paywallActivity, r8.n nVar) {
        super(4);
        this.f43613a = paywallActivity;
        this.f43614b = nVar;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        j5.e(num, cVar, "$this$composable", dVar, "it");
        aVar2.s(-954628543);
        PaywallActivity paywallActivity = this.f43613a;
        boolean K = aVar2.K(paywallActivity);
        Object t11 = aVar2.t();
        if (K || t11 == a.C0060a.a()) {
            t11 = new g(paywallActivity);
            aVar2.n(t11);
        }
        aVar2.J();
        e20.b.a((ym0.a) t11, new h(this.f43614b), aVar2, 0);
        return nm0.y.f85009a;
    }
}
