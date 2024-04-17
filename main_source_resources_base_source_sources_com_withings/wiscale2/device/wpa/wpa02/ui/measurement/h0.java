package com.withings.wiscale2.device.wpa.wpa02.ui.measurement;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Wpa02LaunchMeasurementActivity.kt */
/* loaded from: classes5.dex */
public final class h0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Wpa02LaunchMeasurementActivity f55553a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f55554b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f55555c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(Wpa02LaunchMeasurementActivity wpa02LaunchMeasurementActivity, ym0.a<nm0.y> aVar, int i11) {
        super(2);
        this.f55553a = wpa02LaunchMeasurementActivity;
        this.f55554b = aVar;
        this.f55555c = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f55555c | 1);
        Wpa02LaunchMeasurementActivity.L3(this.f55553a, this.f55554b, aVar, g11);
        return nm0.y.f85009a;
    }
}
