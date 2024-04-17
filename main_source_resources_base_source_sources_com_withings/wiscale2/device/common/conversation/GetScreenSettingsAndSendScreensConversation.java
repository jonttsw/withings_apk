package com.withings.wiscale2.device.common.conversation;

import android.content.Context;
import androidx.compose.material.g6;
import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.exception.UnsupportedCommandException;
import com.withings.device.setup.android.setup.init.screen.settings.GetScreenSettingsConversation;
import com.withings.devicescreens.device.SendDeviceScreensConversation;
import java.io.IOException;
import kotlin.Metadata;
/* compiled from: GetScreenSettingsAndSendScreensConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/common/conversation/GetScreenSettingsAndSendScreensConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class GetScreenSettingsAndSendScreensConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final kn.e f50733f;

    public GetScreenSettingsAndSendScreensConversation() {
        kn.e c11 = kn.e.c();
        kotlin.jvm.internal.u.i(c11, "get(...)");
        this.f50733f = c11;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        E(new GetScreenSettingsConversation(this.f50733f));
        try {
            Context r7 = r();
            kotlin.jvm.internal.u.i(r7, "getContext(...)");
            SendDeviceScreensConversation.a aVar = (SendDeviceScreensConversation.a) ah.o.c(r7, SendDeviceScreensConversation.a.class);
            kn.e c11 = kn.e.c();
            kotlin.jvm.internal.u.i(c11, "get(...)");
            E(new SendDeviceScreensConversation(c11, aVar.e(), aVar.K(), aVar.g(), aVar.N()));
        } catch (UnsupportedCommandException e11) {
            x70.b.t(this, g6.i(e11.getMessage(), "\nNot supported by device %s with firmware %d"), x(), Long.valueOf(x().i().softVersion));
        }
    }
}
