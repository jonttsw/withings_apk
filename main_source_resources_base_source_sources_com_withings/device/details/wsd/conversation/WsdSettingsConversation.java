package com.withings.device.details.wsd.conversation;

import cj.b;
import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.ClockDisplaySetting;
import com.withings.comm.wpp.generated.object.WsmPrivateMode;
import com.withings.comm.wpp.h;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import qj.k;
import rn.t;
/* compiled from: WsdSettingsConversation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/device/details/wsd/conversation/WsdSettingsConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "a", "device-details-wsd_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class WsdSettingsConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final a f37075f;

    /* compiled from: WsdSettingsConversation.kt */
    /* loaded from: classes3.dex */
    public interface a extends WppDeviceConversation.b {
        void M2(WsdSettingsConversation wsdSettingsConversation, k kVar);
    }

    public WsdSettingsConversation(t delegate) {
        u.j(delegate, "delegate");
        this.f37075f = delegate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [nj.h, nj.a] */
    /* JADX WARN: Type inference failed for: r1v3, types: [qj.k, java.lang.Object] */
    private final void L() {
        ?? aVar = new nj.a(x());
        aVar.c((short) 2320, new h[0]);
        aVar.j();
        ?? obj = new Object();
        for (h hVar : aVar.D().d()) {
            if (hVar instanceof ClockDisplaySetting) {
                obj.c((ClockDisplaySetting) hVar);
            } else if (hVar instanceof WsmPrivateMode) {
                obj.d((WsmPrivateMode) hVar);
            }
        }
        b x11 = x();
        u.i(x11, "getWppDevice(...)");
        short s11 = new sn.a(x11).a().b().status;
        this.f37075f.M2(this, obj);
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        B(60000L, false, false);
        L();
        while (true) {
            Object K = K();
            if (K instanceof ClockDisplaySetting) {
                nj.a aVar = new nj.a(x());
                aVar.c((short) 2319, (ClockDisplaySetting) K);
                aVar.j();
                L();
            } else if (K instanceof WsmPrivateMode) {
                nj.a aVar2 = new nj.a(x());
                aVar2.c((short) 2319, (WsmPrivateMode) K);
                aVar2.j();
                L();
            }
        }
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final WppDeviceConversation.b u() {
        return this.f37075f;
    }
}
