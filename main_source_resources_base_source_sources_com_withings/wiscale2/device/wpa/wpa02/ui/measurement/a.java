package com.withings.wiscale2.device.wpa.wpa02.ui.measurement;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Wpa02LaunchMeasurementActivity.kt */
/* loaded from: classes5.dex */
public final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Wpa02LaunchMeasurementActivity f55519a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f55520b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Wpa02LaunchMeasurementActivity wpa02LaunchMeasurementActivity, int i11) {
        super(2);
        this.f55519a = wpa02LaunchMeasurementActivity;
        this.f55520b = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f55520b | 1);
        Wpa02LaunchMeasurementActivity.E3(this.f55519a, aVar, g11);
        return nm0.y.f85009a;
    }
}
