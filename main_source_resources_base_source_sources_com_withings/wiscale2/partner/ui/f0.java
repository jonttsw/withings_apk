package com.withings.wiscale2.partner.ui;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PartnerExchangesFragment.kt */
/* loaded from: classes5.dex */
public final class f0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e0 f58999a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f59000b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f59001c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(e0 e0Var, ym0.a<nm0.y> aVar, int i11) {
        super(2);
        this.f58999a = e0Var;
        this.f59000b = aVar;
        this.f59001c = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f59001c | 1);
        e0.w1(this.f58999a, this.f59000b, aVar, g11);
        return nm0.y.f85009a;
    }
}
