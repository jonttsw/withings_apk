package com.withings.wiscale2.partner.ui;
/* compiled from: PartnerExchangesFragment.kt */
/* loaded from: classes5.dex */
final class p0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e0 f59184a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(e0 e0Var) {
        super(0);
        this.f59184a = e0Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        this.f59184a.requireActivity().onBackPressed();
        return nm0.y.f85009a;
    }
}
