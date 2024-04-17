package com.withings.wiscale2.partner.ui;
/* compiled from: PartnerIntroFragment.kt */
/* loaded from: classes5.dex */
final class p1 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k1 f59185a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(k1 k1Var) {
        super(0);
        this.f59185a = k1Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        this.f59185a.requireActivity().onBackPressed();
        return nm0.y.f85009a;
    }
}
