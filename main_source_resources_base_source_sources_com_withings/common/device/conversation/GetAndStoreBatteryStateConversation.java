package com.withings.common.device.conversation;

import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.BatteryPercent;
import com.withings.comm.wpp.h;
import com.withings.device.Device;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: GetAndStoreBatteryStateConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/common/device/conversation/GetAndStoreBatteryStateConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "common-device_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class GetAndStoreBatteryStateConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final kn.e f35137f;

    public GetAndStoreBatteryStateConversation(kn.e deviceManager) {
        u.j(deviceManager, "deviceManager");
        this.f35137f = deviceManager;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [nj.h, nj.a] */
    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        ?? aVar = new nj.a(x());
        aVar.c((short) 261, new h[0]);
        BatteryPercent batteryPercent = (BatteryPercent) aVar.y(BatteryPercent.class);
        String str = x().i().mac;
        kn.e eVar = this.f35137f;
        Device e11 = eVar.e(str);
        if (e11 != null) {
            e11.setBatteryLevel(batteryPercent.percent);
            eVar.t(e11);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ GetAndStoreBatteryStateConversation() {
        /*
            r2 = this;
            kn.e r0 = kn.e.c()
            java.lang.String r1 = "get(...)"
            kotlin.jvm.internal.u.i(r0, r1)
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.common.device.conversation.GetAndStoreBatteryStateConversation.<init>():void");
    }
}
