package com.withings.wiscale2.device.wpm.wpm05;

import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.common.device.conversation.BondingMigrationConversation;
import com.withings.wiscale2.device.wpm.wpm05.conversation.Wpm05SyncConversation;
import ej.w;
import gl.t;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import vi.o;
/* compiled from: Wpm05BleConnector.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/wpm/wpm05/BondAndSyncConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class BondAndSyncConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final t f55893f;

    /* renamed from: g  reason: collision with root package name */
    private final w f55894g;

    /* renamed from: h  reason: collision with root package name */
    private final u70.a f55895h;

    /* renamed from: i  reason: collision with root package name */
    private final Wpm05SyncConversation f55896i;

    public BondAndSyncConversation(t tVar, w wppDeviceManager, u70.a aVar, Wpm05SyncConversation wpm05SyncConversation) {
        u.j(wppDeviceManager, "wppDeviceManager");
        this.f55893f = tVar;
        this.f55894g = wppDeviceManager;
        this.f55895h = aVar;
        this.f55896i = wpm05SyncConversation;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, com.withings.common.device.conversation.a] */
    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        xi.b j5 = x().j();
        u.h(j5, "null cannot be cast to non-null type com.withings.comm.network.ble.BleRemoteDevice");
        int d11 = ((o) j5).d();
        w wVar = this.f55894g;
        if (d11 != 12 && this.f55895h.e()) {
            long j11 = x().i().softVersion;
            t tVar = this.f55893f;
            if (tVar.o(j11)) {
                wVar.O(x(), new BondingMigrationConversation(tVar, new Object()), BondingMigrationConversation.class);
            }
        }
        wVar.O(x(), this.f55896i, Wpm05SyncConversation.class);
    }
}
