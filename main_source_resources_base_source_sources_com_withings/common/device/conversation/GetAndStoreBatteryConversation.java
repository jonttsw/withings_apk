package com.withings.common.device.conversation;

import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.BatteryStatus;
import com.withings.comm.wpp.h;
import com.withings.device.Device;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
/* compiled from: GetAndStoreBatteryConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/common/device/conversation/GetAndStoreBatteryConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "common-device_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class GetAndStoreBatteryConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final Device f35135f;

    /* renamed from: g  reason: collision with root package name */
    private final kn.e f35136g;

    public GetAndStoreBatteryConversation(Device device, kn.e deviceManager) {
        u.j(deviceManager, "deviceManager");
        this.f35135f = device;
        this.f35136g = deviceManager;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [nj.h, nj.a] */
    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        ?? aVar = new nj.a(x());
        boolean z5 = false;
        aVar.c((short) 1284, new h[0]);
        BatteryStatus batteryStatus = (BatteryStatus) aVar.y(BatteryStatus.class);
        Device device = this.f35135f;
        if (device.getBatteryLevel() != batteryStatus.batteryState) {
            z5 = true;
        }
        device.setBatteryLevel(batteryStatus.batteryPercent);
        device.setBatteryState(batteryStatus.batteryState);
        if (z5) {
            device.setModifiedDate(DateTime.now());
        }
        this.f35136g.t(device);
    }
}
