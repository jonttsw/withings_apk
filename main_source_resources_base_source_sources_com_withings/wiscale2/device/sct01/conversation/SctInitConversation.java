package com.withings.wiscale2.device.sct01.conversation;

import ah.t;
import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.common.device.conversation.GetAndStoreBatteryStateConversation;
import com.withings.common.device.conversation.SendSessionConversation;
import java.io.IOException;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import l70.v;
import l70.w;
/* compiled from: SctInitConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/sct01/conversation/SctInitConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SctInitConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final w f54783f = w.a.a();

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        Object runBlocking$default;
        nj.a aVar = new nj.a(x());
        aVar.c((short) 1281, t.t());
        aVar.j();
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new a(this, null), 1, null);
        int d11 = ((v) runBlocking$default).d();
        nj.a aVar2 = new nj.a(x());
        aVar2.c((short) 274, t.q(d11));
        aVar2.j();
        E(new GetAndStoreBatteryStateConversation());
        E(new SendSessionConversation(false));
    }
}
