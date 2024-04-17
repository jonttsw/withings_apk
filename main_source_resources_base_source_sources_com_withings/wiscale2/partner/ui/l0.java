package com.withings.wiscale2.partner.ui;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
/* compiled from: PartnerExchangesFragment.kt */
/* loaded from: classes5.dex */
final class l0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e0 f59156a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(e0 e0Var) {
        super(0);
        this.f59156a = e0Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        b1 b1Var = this.f59156a.f58964e;
        if (b1Var != null) {
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(b1Var), Dispatchers.getIO(), null, new f1(b1Var, null), 2, null);
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("viewModel");
        throw null;
    }
}
