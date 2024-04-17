package com.withings.common.device.conversation;

import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.comm.wpp.generated.object.TrackerWearPos;
import com.withings.device.Device;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import u70.i;
/* compiled from: SetTrackerPositionConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/common/device/conversation/SetTrackerPositionConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "common-device_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class SetTrackerPositionConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final kn.e f35157f;

    /* renamed from: g  reason: collision with root package name */
    private final int f35158g;

    public SetTrackerPositionConversation(kn.e deviceManager, int i11) {
        u.j(deviceManager, "deviceManager");
        this.f35157f = deviceManager;
        this.f35158g = i11;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        Short sh2;
        int i11 = this.f35158g;
        if (i11 != 0) {
            if (i11 != 1) {
                sh2 = null;
            } else {
                sh2 = (short) 2;
            }
        } else {
            sh2 = (short) 3;
        }
        if (sh2 != null) {
            short shortValue = sh2.shortValue();
            nj.a aVar = new nj.a(x());
            aVar.c(Wpp.CMD_SET_TRACKER_WEAR_POS, new TrackerWearPos().setValue(shortValue));
            aVar.j();
            i g11 = x().g();
            kn.e eVar = this.f35157f;
            Device f11 = eVar.f(g11);
            f11.setTrackerWearPosition(i11);
            eVar.t(f11);
        }
    }
}
