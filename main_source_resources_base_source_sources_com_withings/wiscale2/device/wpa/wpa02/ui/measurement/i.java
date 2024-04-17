package com.withings.wiscale2.device.wpa.wpa02.ui.measurement;

import com.withings.wiscale2.C1987R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Wpa02LaunchMeasurementActivity.kt */
/* loaded from: classes5.dex */
public final class i extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Wpa02LaunchMeasurementActivity f55556a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Wpa02LaunchMeasurementActivity wpa02LaunchMeasurementActivity) {
        super(2);
        this.f55556a = wpa02LaunchMeasurementActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            com.withings.common.compose.component.l.a(null, ay.b.u(C1987R.string._DONE_, aVar2), null, false, null, null, false, new h(this.f55556a), aVar2, 0, 125);
        }
        return nm0.y.f85009a;
    }
}
