package com.withings.device.install.wsd.conversation;

import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.device.Device;
import java.io.IOException;
import java.util.TimeZone;
import kn.e;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import u70.i;
/* compiled from: TimeZoneAndGeolocConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/device/install/wsd/conversation/TimeZoneAndGeolocConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "device-install-wsd_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class TimeZoneAndGeolocConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final e f37365f;

    public TimeZoneAndGeolocConversation() {
        e c11 = e.c();
        u.i(c11, "get(...)");
        this.f37365f = c11;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        i v11 = v();
        e eVar = this.f37365f;
        Device f11 = eVar.f(v11);
        if (f11 != null) {
            f11.setTimezone(TimeZone.getDefault());
            f11.setManualGeoloc("t");
            eVar.t(f11);
        }
    }
}
