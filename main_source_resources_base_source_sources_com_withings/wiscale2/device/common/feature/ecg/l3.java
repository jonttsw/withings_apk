package com.withings.wiscale2.device.common.feature.ecg;

import com.withings.common.device.DeviceSettingsActivity;
import com.withings.device.Device;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
public final class l3 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f51492a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(EcgActivationActivity ecgActivationActivity) {
        super(0);
        this.f51492a = ecgActivationActivity;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        androidx.activity.result.b bVar;
        EcgActivationActivity ecgActivationActivity = this.f51492a;
        bVar = ecgActivationActivity.f51068j;
        DeviceSettingsActivity.c cVar = DeviceSettingsActivity.f35012e;
        Device O3 = EcgActivationActivity.O3(ecgActivationActivity);
        cVar.getClass();
        bVar.a(DeviceSettingsActivity.c.c(ecgActivationActivity, O3, null));
        return nm0.y.f85009a;
    }
}
