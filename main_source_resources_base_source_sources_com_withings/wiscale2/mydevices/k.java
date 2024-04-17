package com.withings.wiscale2.mydevices;

import com.withings.device.Device;
import com.withings.wiscale2.mydevices.a;
import kotlin.jvm.internal.u;
import nm0.y;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MyDevicesFragment.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class k extends kotlin.jvm.internal.s implements ym0.p<Device, a.InterfaceC0757a, y> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public k(Object obj) {
        super(2, obj, q.class, "onShortcutSettingsClicked", "onShortcutSettingsClicked(Lcom/withings/device/Device;Lcom/withings/wiscale2/mydevices/DeviceSettingsRedirection$ShortcutSettingClickEvent;)V", 0);
    }

    @Override // ym0.p
    public final y invoke(Device device, a.InterfaceC0757a interfaceC0757a) {
        Device p02 = device;
        a.InterfaceC0757a p12 = interfaceC0757a;
        u.j(p02, "p0");
        u.j(p12, "p1");
        q.y1((q) this.receiver, p02, p12);
        return y.f85009a;
    }
}
