package com.withings.tutorials.ui;

import com.withings.device.Device;
/* compiled from: DeviceIntroductionActivity.kt */
/* loaded from: classes4.dex */
final class h extends kotlin.jvm.internal.w implements ym0.p<Device, Long, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DeviceIntroductionActivity f44755a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(DeviceIntroductionActivity deviceIntroductionActivity) {
        super(2);
        this.f44755a = deviceIntroductionActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(Device device, Long l5) {
        Device device2 = device;
        long longValue = l5.longValue();
        kotlin.jvm.internal.u.j(device2, "device");
        DeviceIntroductionActivity deviceIntroductionActivity = this.f44755a;
        ch.d dVar = deviceIntroductionActivity.f44598j;
        if (dVar != null) {
            deviceIntroductionActivity.startActivity(((ah.u) dVar.getMode()).I(longValue, deviceIntroductionActivity, device2));
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("intentBuilder");
        throw null;
    }
}
