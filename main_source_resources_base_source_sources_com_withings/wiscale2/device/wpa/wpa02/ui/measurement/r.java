package com.withings.wiscale2.device.wpa.wpa02.ui.measurement;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Wpa02LaunchMeasurementActivity.kt */
/* loaded from: classes5.dex */
public final class r extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Wpa02LaunchMeasurementActivity f55579a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f55580b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f55581c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f55582d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Wpa02LaunchMeasurementActivity wpa02LaunchMeasurementActivity, String str, int i11, int i12) {
        super(2);
        this.f55579a = wpa02LaunchMeasurementActivity;
        this.f55580b = str;
        this.f55581c = i11;
        this.f55582d = i12;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f55581c | 1);
        Wpa02LaunchMeasurementActivity.K3(this.f55579a, this.f55580b, aVar, g11, this.f55582d);
        return nm0.y.f85009a;
    }
}
