package com.withings.wiscale2.partner.ui;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PartnerIntroFragment.kt */
/* loaded from: classes5.dex */
public final class j1 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k1 f59124a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f59125b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f59126c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f59127d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(k1 k1Var, boolean z5, ym0.a<nm0.y> aVar, int i11) {
        super(2);
        this.f59124a = k1Var;
        this.f59125b = z5;
        this.f59126c = aVar;
        this.f59127d = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f59127d | 1);
        boolean z5 = this.f59125b;
        ym0.a<nm0.y> aVar2 = this.f59126c;
        this.f59124a.s1(g11, aVar, aVar2, z5);
        return nm0.y.f85009a;
    }
}
