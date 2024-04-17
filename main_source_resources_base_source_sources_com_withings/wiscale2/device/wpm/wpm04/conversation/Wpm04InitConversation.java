package com.withings.wiscale2.device.wpm.wpm04.conversation;

import al.h;
import android.content.Context;
import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.exception.UnsupportedCommandException;
import com.withings.common.device.conversation.GetAndStoreBatteryStateConversation;
import com.withings.common.device.conversation.SendSessionConversation;
import com.withings.common.device.conversation.WpmParametersInitConversation;
import com.withings.device.setup.android.setup.init.time.SendTimeConversation;
import com.withings.wiscale2.device.common.conversation.SendUserUnitsConversation;
import java.io.IOException;
import kn.e;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.k;
import nm0.l;
import nm0.y;
import x70.b;
/* compiled from: Wpm04InitConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/wpm/wpm04/conversation/Wpm04InitConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Wpm04InitConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final e f55809f;

    public Wpm04InitConversation(e deviceManager) {
        u.j(deviceManager, "deviceManager");
        this.f55809f = deviceManager;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        Object a11;
        e eVar = this.f55809f;
        E(new GetAndStoreBatteryStateConversation(eVar));
        try {
            E(new SendSessionConversation(false));
            a11 = y.f85009a;
        } catch (Throwable th2) {
            a11 = l.a(th2);
        }
        boolean z5 = !(a11 instanceof k.a);
        E(new SendUserUnitsConversation(0));
        com.withings.comm.trace.e a12 = com.withings.comm.trace.e.a();
        u.i(a12, "get(...)");
        E(new SendTimeConversation(a12));
        try {
            Context r7 = r();
            u.i(r7, "getContext(...)");
            E(new WpmParametersInitConversation(eVar, z5, new h(r7)));
        } catch (UnsupportedCommandException unused) {
            b.g(this, x().g(), "Unsupported command CMD_WPM_PARAMETER_GET / CMD_WPM_PARAMETER_SET", new Object[0]);
        }
    }
}
