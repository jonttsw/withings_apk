package com.withings.common.device.conversation;

import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.WorkoutGpsStatus;
import kotlin.Metadata;
/* compiled from: SendGpsStatusConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/common/device/conversation/SendGpsStatusConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "common-device_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class SendGpsStatusConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final boolean f35151f;

    public SendGpsStatusConversation(boolean z5) {
        this.f35151f = z5;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        WorkoutGpsStatus workoutGpsStatus = new WorkoutGpsStatus();
        workoutGpsStatus.status = this.f35151f ? 1 : 0;
        nj.a aVar = new nj.a(x());
        aVar.c((short) 323, workoutGpsStatus);
        aVar.j();
    }
}
