package com.withings.wiscale2.device.hwa06;

import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import ej.w;
import gl.j;
import gl.t;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import u70.a;
import vi.o;
import xi.b;
/* compiled from: Hwa06Connector.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/hwa06/BondAndSyncConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class BondAndSyncConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final t f54283f;

    /* renamed from: g  reason: collision with root package name */
    private final w f54284g;

    /* renamed from: h  reason: collision with root package name */
    private final a f54285h;

    public BondAndSyncConversation(t tVar, w wppDeviceManager, a backgroundManager) {
        u.j(wppDeviceManager, "wppDeviceManager");
        u.j(backgroundManager, "backgroundManager");
        this.f54283f = tVar;
        this.f54284g = wppDeviceManager;
        this.f54285h = backgroundManager;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        t tVar = this.f54283f;
        u.h(tVar, "null cannot be cast to non-null type com.withings.common.device.model.capabilities.DeviceModelWithSync");
        WppDeviceConversation j02 = ((j) tVar).j0(null);
        b j5 = x().j();
        u.h(j5, "null cannot be cast to non-null type com.withings.comm.network.ble.BleRemoteDevice");
        if (((o) j5).d() != 12 && this.f54285h.e() && tVar.o(x().i().softVersion)) {
            E(new WppDeviceConversation() { // from class: com.withings.wiscale2.device.hwa06.BondAndSyncConversation$run$1
                @Override // com.withings.comm.remote.conversation.WppDeviceConversation
                public final void D() {
                    try {
                        b j11 = x().j();
                        u.h(j11, "null cannot be cast to non-null type com.withings.comm.network.ble.BleRemoteDevice");
                        ((o) j11).c().createBond();
                    } catch (Exception unused) {
                        throw new Exception("Bonding failed");
                    }
                }
            });
        }
        this.f54284g.O(x(), j02, j02.getClass());
    }
}
