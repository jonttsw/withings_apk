package com.withings.wiscale2.settings;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AccountAndSecurity.kt */
/* loaded from: classes5.dex */
public final class d extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f59951a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f59952b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f59953c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f59954d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(boolean z5, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, int i11) {
        super(2);
        this.f59951a = z5;
        this.f59952b = aVar;
        this.f59953c = aVar2;
        this.f59954d = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f59954d | 1);
        ym0.a<nm0.y> aVar2 = this.f59952b;
        ym0.a<nm0.y> aVar3 = this.f59953c;
        a.d(this.f59951a, aVar2, aVar3, aVar, g11);
        return nm0.y.f85009a;
    }
}
