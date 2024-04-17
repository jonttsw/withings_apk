package com.withings.wiscale2.partner.ui;
/* compiled from: PartnerExchangesFragment.kt */
/* loaded from: classes5.dex */
final class w0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e0 f59234a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(e0 e0Var) {
        super(2);
        this.f59234a = e0Var;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            e0.B1(this.f59234a, aVar2, 8);
        }
        return nm0.y.f85009a;
    }
}
