package com.withings.wiscale2.device.wpa.wpa02.ui.features.cleansing;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DeviceConnectStateScreen.kt */
/* loaded from: classes5.dex */
public final class r extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f55319a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f55320b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f55321c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(int i11, int i12, ym0.a aVar) {
        super(2);
        this.f55319a = aVar;
        this.f55320b = i11;
        this.f55321c = i12;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        s.a(ah.o.g(this.f55320b | 1), this.f55321c, aVar, this.f55319a);
        return nm0.y.f85009a;
    }
}
