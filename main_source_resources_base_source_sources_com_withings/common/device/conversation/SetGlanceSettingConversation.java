package com.withings.common.device.conversation;

import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.GlanceStatus;
import kotlin.Metadata;
/* compiled from: GlanceSettingConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/common/device/conversation/SetGlanceSettingConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "common-device_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class SetGlanceSettingConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final boolean f35154f;

    public SetGlanceSettingConversation(boolean z5) {
        this.f35154f = z5;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        GlanceStatus status = new GlanceStatus().setStatus(this.f35154f ? (short) 1 : (short) 0);
        nj.a aVar = new nj.a(x());
        aVar.c((short) 2417, status);
        aVar.j();
    }
}
