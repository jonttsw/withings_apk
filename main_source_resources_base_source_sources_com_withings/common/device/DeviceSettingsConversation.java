package com.withings.common.device;

import com.withings.comm.remote.conversation.WppDeviceConversation;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: DeviceSettingsActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/common/device/DeviceSettingsConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "a", "common-device_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class DeviceSettingsConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final WppDeviceConversation f35030f;

    /* renamed from: g  reason: collision with root package name */
    private final a f35031g;

    /* compiled from: DeviceSettingsActivity.kt */
    /* loaded from: classes3.dex */
    public interface a extends WppDeviceConversation.b {
        void k3();

        void w();
    }

    public DeviceSettingsConversation(WppDeviceConversation conversation, a listener) {
        u.j(conversation, "conversation");
        u.j(listener, "listener");
        this.f35030f = conversation;
        this.f35031g = listener;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        a aVar = this.f35031g;
        aVar.w();
        try {
            E(this.f35030f);
        } finally {
            aVar.k3();
        }
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final WppDeviceConversation.b u() {
        return this.f35031g;
    }
}
