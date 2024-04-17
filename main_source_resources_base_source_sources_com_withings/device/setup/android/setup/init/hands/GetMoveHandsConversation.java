package com.withings.device.setup.android.setup.init.hands;

import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.MoveHands;
import com.withings.comm.wpp.h;
import com.withings.device.Device;
import java.io.IOException;
import kn.e;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nj.a;
import u70.i;
/* compiled from: GetMoveHandsConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/device/setup/android/setup/init/hands/GetMoveHandsConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class GetMoveHandsConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final e f37447f;

    public GetMoveHandsConversation(e deviceManager) {
        u.j(deviceManager, "deviceManager");
        this.f37447f = deviceManager;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [nj.h, nj.a] */
    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        ?? aVar = new a(x());
        boolean z5 = false;
        aVar.c((short) 2476, new h[0]);
        i g11 = x().g();
        e eVar = this.f37447f;
        Device f11 = eVar.f(g11);
        if (((MoveHands) aVar.y(MoveHands.class)).value == 1) {
            z5 = true;
        }
        f11.setMoveHandsEnabled(z5);
        eVar.t(f11);
    }
}
