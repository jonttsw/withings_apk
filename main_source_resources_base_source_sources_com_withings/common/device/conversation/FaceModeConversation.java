package com.withings.common.device.conversation;

import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.FaceMode;
import java.io.IOException;
import kotlin.Metadata;
/* compiled from: FaceModeConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/common/device/conversation/FaceModeConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "common-device_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FaceModeConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final int f35132f;

    public FaceModeConversation(int i11) {
        this.f35132f = i11;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        FaceMode faceMode = new FaceMode();
        faceMode.setValue((byte) this.f35132f);
        nj.a aVar = new nj.a(x());
        aVar.c((short) 319, faceMode);
        aVar.j();
    }
}
