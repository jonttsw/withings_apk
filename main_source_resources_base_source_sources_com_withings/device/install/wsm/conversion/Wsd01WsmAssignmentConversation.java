package com.withings.device.install.wsm.conversion;

import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.WsdScanWsmResult;
import com.withings.device.Device;
import com.withings.device.ws.DeviceApi;
import com.withings.webservices.legacy.Webservices;
import io.d;
import java.io.IOException;
import java.util.List;
import kn.e;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: Wsd01WsmAssignmentConversation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/device/install/wsm/conversion/Wsd01WsmAssignmentConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "a", "device-install-wsm_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class Wsd01WsmAssignmentConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final a f37367f;

    /* renamed from: g  reason: collision with root package name */
    private final WsmAssignmentConversation f37368g;

    /* compiled from: Wsd01WsmAssignmentConversation.kt */
    /* loaded from: classes3.dex */
    public interface a {
        void a(Wsd01WsmAssignmentConversation wsd01WsmAssignmentConversation);
    }

    public Wsd01WsmAssignmentConversation(d dVar, WsmAssignmentConversation wsmAssignmentConversation) {
        this.f37367f = dVar;
        this.f37368g = wsmAssignmentConversation;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        int i11 = 1;
        boolean z5 = false;
        B(60000L, true, false);
        this.f37367f.a(this);
        Boolean bool = (Boolean) K();
        u.g(bool);
        if (bool.booleanValue()) {
            WsmAssignmentConversation wsmAssignmentConversation = this.f37368g;
            E(wsmAssignmentConversation);
            List<WsdScanWsmResult> M = wsmAssignmentConversation.M();
            u.i(M, "getInstalledWsms(...)");
            z5 = !M.isEmpty();
        }
        Device f11 = e.c().f(x().g());
        if (z5) {
            i11 = 2;
        }
        try {
            ((DeviceApi) Webservices.get().getApiForAccount(DeviceApi.class)).notifySetup(f11.getId(), i11);
        } catch (Exception e11) {
            throw new IOException("Unable to update device", e11);
        }
    }
}
