package com.withings.common.device.conversation;

import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.MoveHands;
import java.io.IOException;
import kotlin.Metadata;
/* compiled from: MoveHandsConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/common/device/conversation/SetMoveHandsConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "common-device_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class SetMoveHandsConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final boolean f35155f;

    public SetMoveHandsConversation(boolean z5) {
        this.f35155f = z5;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        MoveHands moveHands = new MoveHands();
        moveHands.value = this.f35155f ? (short) 1 : (short) 0;
        nj.a aVar = new nj.a(x());
        aVar.c((short) 2475, moveHands);
        aVar.j();
    }
}
