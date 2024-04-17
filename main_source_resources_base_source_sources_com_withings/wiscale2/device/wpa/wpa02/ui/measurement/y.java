package com.withings.wiscale2.device.wpa.wpa02.ui.measurement;

import com.withings.common.compose.component.b4;
import com.withings.wiscale2.device.wpa.wpa02.ui.measurement.Wpa02LaunchMeasurementActivity;
import k1.r0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Wpa02LaunchMeasurementActivity.kt */
/* loaded from: classes5.dex */
public final class y extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ r0<ne0.c> f55590a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(r0<ne0.c> r0Var) {
        super(2);
        this.f55590a = r0Var;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        String u11;
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            Wpa02LaunchMeasurementActivity.b bVar = Wpa02LaunchMeasurementActivity.f55468g;
            ne0.c value = this.f55590a.getValue();
            aVar2.s(-99730039);
            if (value == null) {
                u11 = null;
            } else {
                u11 = ay.b.u(value.c(), aVar2);
            }
            aVar2.J();
            if (u11 == null) {
                u11 = "";
            }
            b4.a(u11, null, null, null, aVar2, 0, 14);
        }
        return nm0.y.f85009a;
    }
}
