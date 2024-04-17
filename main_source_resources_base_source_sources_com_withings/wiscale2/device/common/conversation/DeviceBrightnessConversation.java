package com.withings.wiscale2.device.common.conversation;

import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.LuminosityLevel;
import java.io.IOException;
/* loaded from: classes5.dex */
public class DeviceBrightnessConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private a f50702f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f50703g;

    /* loaded from: classes5.dex */
    public interface a extends WppDeviceConversation.b {
        void r3(DeviceBrightnessConversation deviceBrightnessConversation, LuminosityLevel luminosityLevel);
    }

    public DeviceBrightnessConversation(a aVar) {
        this.f50702f = aVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [nj.h, nj.a] */
    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        B(60000L, false, false);
        this.f50703g = true;
        ?? aVar = new nj.a(x());
        aVar.c((short) 2370, new com.withings.comm.wpp.h[0]);
        ((wb0.o) x().e()).getClass();
        this.f50702f.r3(this, (LuminosityLevel) aVar.y(LuminosityLevel.class));
        while (true) {
            com.withings.comm.wpp.h hVar = (com.withings.comm.wpp.h) K();
            if (hVar instanceof LuminosityLevel) {
                nj.a aVar2 = new nj.a(x());
                aVar2.c((short) 2369, (LuminosityLevel) hVar);
                aVar2.j();
            }
        }
    }

    public final void L(LuminosityLevel luminosityLevel) {
        if (this.f50703g) {
            G(luminosityLevel);
        }
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final WppDeviceConversation.b u() {
        return this.f50702f;
    }
}
