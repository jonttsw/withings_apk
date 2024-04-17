package com.withings.wiscale2.device.wpa.wpa02.ui.measurement;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Wpa02LaunchMeasurementActivity.kt */
/* loaded from: classes5.dex */
public final class j extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Wpa02LaunchMeasurementActivity f55558a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f55559b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Wpa02LaunchMeasurementActivity wpa02LaunchMeasurementActivity, int i11) {
        super(2);
        this.f55558a = wpa02LaunchMeasurementActivity;
        this.f55559b = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f55559b | 1);
        Wpa02LaunchMeasurementActivity.I3(this.f55558a, aVar, g11);
        return nm0.y.f85009a;
    }
}
