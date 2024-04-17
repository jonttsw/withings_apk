package com.withings.common.device.conversation;

import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.ShortcutAction;
import com.withings.comm.wpp.h;
import java.io.IOException;
import kotlin.Metadata;
import nm0.y;
import ym0.l;
/* compiled from: GetShortcutConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/common/device/conversation/GetShortcutConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "common-device_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class GetShortcutConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final l<ShortcutAction, y> f35149f;

    /* JADX WARN: Multi-variable type inference failed */
    public GetShortcutConversation(l<? super ShortcutAction, y> lVar) {
        this.f35149f = lVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [nj.h, nj.a] */
    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        ?? aVar = new nj.a(x());
        aVar.c((short) 2450, new h[0]);
        this.f35149f.invoke((ShortcutAction) aVar.y(ShortcutAction.class));
    }
}
