package com.withings.wiscale2.partner.ui;

import com.withings.wiscale2.partner.ui.k1;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
/* compiled from: PartnerIntroFragment.kt */
/* loaded from: classes5.dex */
final class l1 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k1 f59157a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(k1 k1Var) {
        super(0);
        this.f59157a = k1Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        k1.d dVar = k1.f59134o;
        k1 k1Var = this.f59157a;
        k1Var.getClass();
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(k1Var), Dispatchers.getIO(), null, new a2(k1Var, null), 2, null);
        return nm0.y.f85009a;
    }
}
