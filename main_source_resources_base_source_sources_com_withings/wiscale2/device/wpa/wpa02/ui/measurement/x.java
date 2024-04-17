package com.withings.wiscale2.device.wpa.wpa02.ui.measurement;

import com.withings.wiscale2.C1987R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Wpa02LaunchMeasurementActivity.kt */
/* loaded from: classes5.dex */
public final class x extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Wpa02LaunchMeasurementActivity f55589a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Wpa02LaunchMeasurementActivity wpa02LaunchMeasurementActivity) {
        super(2);
        this.f55589a = wpa02LaunchMeasurementActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            Wpa02LaunchMeasurementActivity wpa02LaunchMeasurementActivity = this.f55589a;
            com.withings.common.compose.component.l.a(null, ay.b.u(C1987R.string.ConfirmSelection_Button, aVar2), null, Wpa02LaunchMeasurementActivity.Q3(wpa02LaunchMeasurementActivity).r0(), null, null, false, new w(wpa02LaunchMeasurementActivity), aVar2, 0, 117);
        }
        return nm0.y.f85009a;
    }
}
