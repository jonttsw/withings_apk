package com.withings.paywall;
/* compiled from: PaywallActivity.kt */
/* loaded from: classes4.dex */
final class k extends kotlin.jvm.internal.w implements ym0.l<Boolean, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ r8.n f43616a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(r8.n nVar) {
        super(1);
        this.f43616a = nVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        androidx.navigation.e.L(this.f43616a, "subscription_confirmation/" + booleanValue, null, 6);
        return nm0.y.f85009a;
    }
}
