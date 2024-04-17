package com.withings.wiscale2.device.wpa.wpa02.ui.measurement;
/* compiled from: Wpa02LaunchMeasurementActivity.kt */
/* loaded from: classes5.dex */
final class i0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Wpa02LaunchMeasurementActivity f55557a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(Wpa02LaunchMeasurementActivity wpa02LaunchMeasurementActivity) {
        super(2);
        this.f55557a = wpa02LaunchMeasurementActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            Wpa02LaunchMeasurementActivity.K3(this.f55557a, null, aVar2, 64, 1);
        }
        return nm0.y.f85009a;
    }
}
