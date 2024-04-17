package com.withings.wiscale2.device.wpa.wpa02.conversation;

import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.common.device.conversation.GetAndStoreBatteryStateConversation;
import com.withings.common.device.conversation.SendSessionConversation;
import com.withings.device.setup.android.setup.init.time.SendTimeConversation;
import com.withings.features.FeatureFlag;
import java.io.IOException;
import kn.e;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: Wpa02InitConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/wpa/wpa02/conversation/Wpa02InitConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Wpa02InitConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final e f55032f;

    public Wpa02InitConversation() {
        e c11 = e.c();
        u.i(c11, "get(...)");
        this.f55032f = c11;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        E(new GetAndStoreBatteryStateConversation(this.f55032f));
        E(new SendSessionConversation(wr.b.c(FeatureFlag.f39112i)));
        com.withings.comm.trace.e a11 = com.withings.comm.trace.e.a();
        u.i(a11, "get(...)");
        E(new SendTimeConversation(a11));
    }
}
