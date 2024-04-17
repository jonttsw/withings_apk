package com.withings.wiscale2.device.wpa.wpa02.ui.features.cleansing;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CleansingModeIntroductionScreen.kt */
/* loaded from: classes5.dex */
public final class c extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f55253a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f55254b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f55255c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f55256d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i11, int i12, ym0.a aVar, ym0.a aVar2) {
        super(2);
        this.f55253a = aVar;
        this.f55254b = aVar2;
        this.f55255c = i11;
        this.f55256d = i12;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f55255c | 1);
        ym0.a<nm0.y> aVar2 = this.f55253a;
        ym0.a<nm0.y> aVar3 = this.f55254b;
        d.a(g11, this.f55256d, aVar, aVar2, aVar3);
        return nm0.y.f85009a;
    }
}
