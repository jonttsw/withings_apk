package com.withings.wiscale2.partner.ui;
/* compiled from: PartnerExchangesFragment.kt */
/* loaded from: classes5.dex */
final class g0 extends kotlin.jvm.internal.w implements ym0.l<Boolean, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e0 f59083a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ d0 f59084b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(e0 e0Var, d0 d0Var) {
        super(1);
        this.f59083a = e0Var;
        this.f59084b = d0Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        b1 b1Var = this.f59083a.f58964e;
        if (b1Var != null) {
            b1Var.A0(this.f59084b.b(), booleanValue);
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("viewModel");
        throw null;
    }
}
