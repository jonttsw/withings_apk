package com.withings.device.install.wsd.conversation;

import android.text.format.DateFormat;
import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.trace.e;
import com.withings.comm.wpp.generated.object.SetClockMode;
import com.withings.device.setup.android.setup.init.time.SendTimeConversation;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nj.a;
/* compiled from: TimeFormatConversation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/device/install/wsd/conversation/TimeFormatConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "<init>", "()V", "device-install-wsd_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class TimeFormatConversation extends WppDeviceConversation {
    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        e a11 = e.a();
        u.i(a11, "get(...)");
        E(new SendTimeConversation(a11));
        boolean is24HourFormat = DateFormat.is24HourFormat(r());
        a aVar = new a(x());
        SetClockMode setClockMode = new SetClockMode();
        setClockMode.type = (short) (!is24HourFormat ? 1 : 0);
        aVar.c((short) 2314, setClockMode);
        aVar.j();
    }
}
