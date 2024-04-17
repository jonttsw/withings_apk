package com.withings.wiscale2.partner.ui;

import com.withings.partner.model.Partner;
/* compiled from: PartnerActivity.kt */
/* loaded from: classes5.dex */
final class q extends kotlin.jvm.internal.w implements ym0.l<nm0.j<? extends Partner, ? extends d2>, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ PartnerActivity f59186a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(PartnerActivity partnerActivity) {
        super(1);
        this.f59186a = partnerActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(nm0.j<? extends Partner, ? extends d2> jVar) {
        nm0.j<? extends Partner, ? extends d2> jVar2 = jVar;
        PartnerActivity.J3(this.f59186a, jVar2.a(), jVar2.b());
        return nm0.y.f85009a;
    }
}
