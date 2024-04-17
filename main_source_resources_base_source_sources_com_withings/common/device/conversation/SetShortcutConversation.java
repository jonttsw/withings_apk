package com.withings.common.device.conversation;

import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.Null;
import com.withings.comm.wpp.generated.object.ShortcutAction;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
/* compiled from: SetShortcutConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/common/device/conversation/SetShortcutConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "common-device_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class SetShortcutConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final short f35156f;

    public SetShortcutConversation(short s11) {
        this.f35156f = s11;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        List W = x.W(new ShortcutAction().setValue(this.f35156f), new Null());
        nj.a aVar = new nj.a(x());
        aVar.b(W, (short) 2441);
        aVar.j();
    }
}
