package com.withings.wiscale2.partner.ui;

import com.withings.partner.model.Partner;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PartnerExchangesFragment.kt */
/* loaded from: classes5.dex */
public final class v0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e0 f59226a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f59227b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Partner f59228c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f59229d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f59230e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f59231f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(e0 e0Var, androidx.compose.ui.e eVar, Partner partner, boolean z5, int i11, int i12) {
        super(2);
        this.f59226a = e0Var;
        this.f59227b = eVar;
        this.f59228c = partner;
        this.f59229d = z5;
        this.f59230e = i11;
        this.f59231f = i12;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f59230e | 1);
        Partner partner = this.f59228c;
        boolean z5 = this.f59229d;
        e0.C1(this.f59226a, this.f59227b, partner, z5, aVar, g11, this.f59231f);
        return nm0.y.f85009a;
    }
}
