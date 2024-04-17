package com.withings.wiscale2.partner.ui;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PartnerIntroFragment.kt */
/* loaded from: classes5.dex */
public final class q1 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k1 f59189a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f59190b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f59191c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(k1 k1Var, ym0.a<nm0.y> aVar, int i11) {
        super(2);
        this.f59189a = k1Var;
        this.f59190b = aVar;
        this.f59191c = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f59191c | 1);
        k1.x1(this.f59189a, this.f59190b, aVar, g11);
        return nm0.y.f85009a;
    }
}
