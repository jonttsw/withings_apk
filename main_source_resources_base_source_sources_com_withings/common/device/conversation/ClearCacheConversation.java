package com.withings.common.device.conversation;

import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.CacheType;
import java.io.IOException;
import kotlin.Metadata;
/* compiled from: ClearCacheConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/common/device/conversation/ClearCacheConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "common-device_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class ClearCacheConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private al.a f35131f;

    public ClearCacheConversation(al.a aVar) {
        this.f35131f = aVar;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        CacheType cacheType = new CacheType();
        cacheType.setType((short) 0);
        nj.a aVar = new nj.a(x());
        aVar.c((short) 2410, cacheType);
        aVar.j();
        CacheType cacheType2 = new CacheType();
        cacheType2.setType((short) 1);
        nj.a aVar2 = new nj.a(x());
        aVar2.c((short) 2410, cacheType2);
        aVar2.j();
        this.f35131f.I1(this);
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final WppDeviceConversation.b u() {
        return this.f35131f;
    }
}
