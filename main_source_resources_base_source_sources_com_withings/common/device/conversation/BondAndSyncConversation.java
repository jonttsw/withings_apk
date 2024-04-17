package com.withings.common.device.conversation;

import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import gl.t;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import vi.o;
/* compiled from: BondAndSyncConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/common/device/conversation/BondAndSyncConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "common-device_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class BondAndSyncConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final t f35125f;

    /* renamed from: g  reason: collision with root package name */
    private final u70.a f35126g;

    /* renamed from: h  reason: collision with root package name */
    private final WppDeviceConversation f35127h;

    public BondAndSyncConversation(t tVar, u70.a backgroundManager, WppDeviceConversation wppDeviceConversation) {
        u.j(backgroundManager, "backgroundManager");
        this.f35125f = tVar;
        this.f35126g = backgroundManager;
        this.f35127h = wppDeviceConversation;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, com.withings.common.device.conversation.a] */
    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        xi.b j5 = x().j();
        u.h(j5, "null cannot be cast to non-null type com.withings.comm.network.ble.BleRemoteDevice");
        if (((o) j5).d() != 12 && this.f35126g.e()) {
            long j11 = x().i().softVersion;
            t tVar = this.f35125f;
            if (tVar.o(j11)) {
                E(new BondingMigrationConversation(tVar, new Object()));
            }
        }
        E(this.f35127h);
    }
}
