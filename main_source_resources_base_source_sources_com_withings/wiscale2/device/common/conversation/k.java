package com.withings.wiscale2.device.common.conversation;

import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.device.Device;
import com.withings.user.User;
import com.withings.wiscale2.device.common.conversation.SportVasistasSyncConversation;
import com.withings.wiscale2.device.common.conversation.VasistasSyncConversation;
import java.util.List;
/* compiled from: SyncConversation.kt */
/* loaded from: classes5.dex */
public interface k {
    List<SportVasistasSyncConversation.a> a(WppDeviceConversation wppDeviceConversation);

    void b(WppDeviceConversation wppDeviceConversation, float f11);

    void c(WppDeviceConversation wppDeviceConversation);

    List<VasistasSyncConversation.a> d(WppDeviceConversation wppDeviceConversation);

    List<VasistasSyncConversation.a> e(WppDeviceConversation wppDeviceConversation);

    List<VasistasSyncConversation.a> f(WppDeviceConversation wppDeviceConversation);

    void g(WppDeviceConversation wppDeviceConversation, Device device, User user);

    List<VasistasSyncConversation.a> h(WppDeviceConversation wppDeviceConversation);

    List<VasistasSyncConversation.a> i(WppDeviceConversation wppDeviceConversation);

    void j(WppDeviceConversation wppDeviceConversation);
}
