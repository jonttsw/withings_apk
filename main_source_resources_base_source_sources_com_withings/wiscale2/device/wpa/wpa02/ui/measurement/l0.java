package com.withings.wiscale2.device.wpa.wpa02.ui.measurement;
/* compiled from: Wpa02LaunchMeasurementActivity.kt */
/* loaded from: classes5.dex */
final class l0 extends kotlin.jvm.internal.w implements ym0.l<Boolean, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Wpa02LaunchMeasurementActivity f55566a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(Wpa02LaunchMeasurementActivity wpa02LaunchMeasurementActivity) {
        super(1);
        this.f55566a = wpa02LaunchMeasurementActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(Boolean bool) {
        Boolean bool2 = bool;
        if (!kotlin.jvm.internal.u.e(bool2, Boolean.TRUE)) {
            bool2 = null;
        }
        if (bool2 != null) {
            this.f55566a.finish();
        }
        return nm0.y.f85009a;
    }
}
