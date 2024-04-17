package com.withings.wiscale2.device.wpm.wpm06;

import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.common.device.conversation.BondingMigrationConversation;
import com.withings.wiscale2.device.wpm.wpm06.conversation.Wpm06SyncConversation;
import ej.w;
import gl.t;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import vi.o;
/* compiled from: Wpm06BleConnector.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/wpm/wpm06/BondAndSyncConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class BondAndSyncConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final t f55946f;

    /* renamed from: g  reason: collision with root package name */
    private final w f55947g;

    /* renamed from: h  reason: collision with root package name */
    private final u70.a f55948h;

    /* renamed from: i  reason: collision with root package name */
    private final Wpm06SyncConversation f55949i;

    public BondAndSyncConversation(t tVar, w wppDeviceManager, u70.a aVar, Wpm06SyncConversation wpm06SyncConversation) {
        u.j(wppDeviceManager, "wppDeviceManager");
        this.f55946f = tVar;
        this.f55947g = wppDeviceManager;
        this.f55948h = aVar;
        this.f55949i = wpm06SyncConversation;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, com.withings.common.device.conversation.a] */
    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        xi.b j5 = x().j();
        u.h(j5, "null cannot be cast to non-null type com.withings.comm.network.ble.BleRemoteDevice");
        int d11 = ((o) j5).d();
        w wVar = this.f55947g;
        if (d11 != 12 && this.f55948h.e()) {
            long j11 = x().i().softVersion;
            t tVar = this.f55946f;
            if (tVar.o(j11)) {
                wVar.O(x(), new BondingMigrationConversation(tVar, new Object()), BondingMigrationConversation.class);
            }
        }
        wVar.O(x(), this.f55949i, Wpm06SyncConversation.class);
    }
}
