package com.withings.wiscale2.device.wam02.conversation;

import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.WamAutoSleep;
import com.withings.comm.wpp.h;
import java.io.IOException;
/* loaded from: classes5.dex */
public class Wam02AutoSleepConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private a f54849f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f54850g;

    /* renamed from: h  reason: collision with root package name */
    private WamAutoSleep f54851h;

    /* loaded from: classes5.dex */
    public interface a extends WppDeviceConversation.b {
        void b1(Wam02AutoSleepConversation wam02AutoSleepConversation, WamAutoSleep wamAutoSleep);

        void u1(Wam02AutoSleepConversation wam02AutoSleepConversation);
    }

    public Wam02AutoSleepConversation(a aVar, boolean z5) {
        this.f54849f = aVar;
        this.f54850g = z5;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [nj.h, nj.a] */
    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        B(120000L, this.f54850g, false);
        ?? aVar = new nj.a(x());
        aVar.c((short) 2342, new h[0]);
        WamAutoSleep wamAutoSleep = (WamAutoSleep) aVar.y(WamAutoSleep.class);
        this.f54851h = wamAutoSleep;
        a aVar2 = this.f54849f;
        aVar2.b1(this, wamAutoSleep);
        Integer num = (Integer) K();
        if (num != null) {
            int intValue = num.intValue();
            WamAutoSleep wamAutoSleep2 = new WamAutoSleep();
            this.f54851h = wamAutoSleep2;
            wamAutoSleep2.autoSleep = intValue;
            nj.a aVar3 = new nj.a(x());
            aVar3.c((short) 1289, this.f54851h);
            aVar3.j();
            aVar2.u1(this);
        }
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final WppDeviceConversation.b u() {
        return this.f54849f;
    }
}
