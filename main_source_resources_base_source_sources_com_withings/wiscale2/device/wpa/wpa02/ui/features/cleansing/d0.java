package com.withings.wiscale2.device.wpa.wpa02.ui.features.cleansing;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PourGlassScreen.kt */
/* loaded from: classes5.dex */
public final class d0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f55258a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f55259b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f55260c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f55261d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(int i11, int i12, ym0.a aVar, ym0.a aVar2) {
        super(2);
        this.f55258a = aVar;
        this.f55259b = aVar2;
        this.f55260c = i11;
        this.f55261d = i12;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f55260c | 1);
        ym0.a<nm0.y> aVar2 = this.f55258a;
        ym0.a<nm0.y> aVar3 = this.f55259b;
        e0.a(g11, this.f55261d, aVar, aVar2, aVar3);
        return nm0.y.f85009a;
    }
}
